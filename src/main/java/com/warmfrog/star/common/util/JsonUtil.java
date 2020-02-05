package com.warmfrog.star.common.util;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * @author libo
 * @date 2020/2/5
 */

public class JsonUtil {
    private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);
    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private JsonUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static ObjectMapper getObjectMapper() {
        return mapper;
    }

    public static <T> T fromJson(String json, Class<T> t) {
        if (json == null) {
            return null;
        } else {
            try {
                return mapper.readValue(json, t);
            } catch (Exception var3) {
                logger.info("Cannot parse json string to Object. Json: <" + json + ">, Object class: <" + t.getName() + ">.", var3);
                return null;
            }
        }
    }

    public static <T> List<T> toList(String json, Class<T> clazz) throws IOException {
        JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, new Class[]{clazz});
        return (List) mapper.readValue(json, javaType);
    }

    public static <T> T fromMap(Map<?, ?> map, Class<T> t) {
        if (map == null) {
            return null;
        } else {
            try {
                return mapper.readValue(toJsonString(map), t);
            } catch (Exception var3) {
                logger.info("Cannot parse map to Object. Map: <" + map + ">, Object class: <" + t.getName() + ">.", var3);
                return null;
            }
        }
    }

    public static <T> Map<String, T> toMap(String jsonText, Class<T> clazz) throws IOException {
        JavaType javaType = mapper.getTypeFactory().constructParametricType(Map.class, new Class[]{String.class, clazz});
        return (Map) mapper.readValue(jsonText, javaType);
    }

    public static Map toMap(String jsonText) {
        return (Map) fromJson(jsonText, Map.class);
    }

    public static String toJsonString(Object obj) {
        try {
            if (obj != null) {
                return mapper.writeValueAsString(obj);
            }
        } catch (Exception var2) {
            logger.warn("Cannot convert to json " + obj);
        }

        return "{}";
    }

    public static String toJsonStr(Object obj, boolean ignoreError) {
        try {
            if (obj != null) {
                return mapper.writeValueAsString(obj);
            }
        } catch (Exception var3) {
            logger.debug("convert to json error for object: {}", obj, var3);
            if (!ignoreError) {
                throw new IllegalArgumentException("convert to json error for object", var3);
            }
        }

        return null;
    }

    public static String toJson(Object o) {
        try {
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException var2) {
            logger.warn("toJson exception", var2);
            return null;
        }
    }

    public static <T> T load(String filePath, Class<T> clazz) {
        FileInputStream is = null;

        try {
            is = new FileInputStream(new File(filePath));
        } catch (FileNotFoundException var4) {
            logger.error(var4.getMessage());
        }

        return load((InputStream) is, clazz);
    }

    public static <T> T load(InputStream is, Class<T> clazz) {
        try {
            return mapper.readValue(is, clazz);
        } catch (JsonParseException var3) {
            logger.warn("JsonParseException", var3);
        } catch (JsonMappingException var4) {
            logger.warn("JsonMappingException", var4);
        } catch (IOException var5) {
            logger.warn("IOException", var5);
        }

        return null;
    }

    public static <T> T parser(String json, Class<T> clzz) {
        try {
            return mapper.readValue(json, clzz);
        } catch (IOException var3) {
            logger.error(var3.getMessage());
            return null;
        }
    }

    public static final boolean isJSONValid(String test) {
        try {
            JSONObject.parseObject(test);
        } catch (JSONException var4) {
            try {
                JSONObject.parseArray(test);
            } catch (JSONException var3) {
                return false;
            }
        }

        return true;
    }
}
