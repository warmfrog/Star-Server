package com.warmfrog.star.dao.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> keyWordsCriteria;

        protected List<Criterion> authorCriteria;

        protected List<Criterion> authorsCriteria;

        protected List<Criterion> imagesCriteria;

        protected List<Criterion> releasedPlatformsCriteria;

        protected List<Criterion> tagsCriteria;

        protected List<Criterion> classificationsCriteria;

        protected List<Criterion> citesCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            keyWordsCriteria = new ArrayList<Criterion>();
            authorCriteria = new ArrayList<Criterion>();
            authorsCriteria = new ArrayList<Criterion>();
            imagesCriteria = new ArrayList<Criterion>();
            releasedPlatformsCriteria = new ArrayList<Criterion>();
            tagsCriteria = new ArrayList<Criterion>();
            classificationsCriteria = new ArrayList<Criterion>();
            citesCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getKeyWordsCriteria() {
            return keyWordsCriteria;
        }

        protected void addKeyWordsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            keyWordsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addKeyWordsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            keyWordsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getAuthorCriteria() {
            return authorCriteria;
        }

        protected void addAuthorCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            authorCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addAuthorCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            authorCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getAuthorsCriteria() {
            return authorsCriteria;
        }

        protected void addAuthorsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            authorsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addAuthorsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            authorsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getImagesCriteria() {
            return imagesCriteria;
        }

        protected void addImagesCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            imagesCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addImagesCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            imagesCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getReleasedPlatformsCriteria() {
            return releasedPlatformsCriteria;
        }

        protected void addReleasedPlatformsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            releasedPlatformsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addReleasedPlatformsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            releasedPlatformsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getTagsCriteria() {
            return tagsCriteria;
        }

        protected void addTagsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            tagsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addTagsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            tagsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getClassificationsCriteria() {
            return classificationsCriteria;
        }

        protected void addClassificationsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            classificationsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addClassificationsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            classificationsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getCitesCriteria() {
            return citesCriteria;
        }

        protected void addCitesCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            citesCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addCitesCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            citesCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || keyWordsCriteria.size() > 0
                || authorCriteria.size() > 0
                || authorsCriteria.size() > 0
                || imagesCriteria.size() > 0
                || releasedPlatformsCriteria.size() > 0
                || tagsCriteria.size() > 0
                || classificationsCriteria.size() > 0
                || citesCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(keyWordsCriteria);
                allCriteria.addAll(authorCriteria);
                allCriteria.addAll(authorsCriteria);
                allCriteria.addAll(imagesCriteria);
                allCriteria.addAll(releasedPlatformsCriteria);
                allCriteria.addAll(tagsCriteria);
                allCriteria.addAll(classificationsCriteria);
                allCriteria.addAll(citesCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Short value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Short value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Short value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Short value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Short value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Short> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Short> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Short value1, Short value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Short value1, Short value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNull() {
            addCriterion("key_words is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNotNull() {
            addCriterion("key_words is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualTo(Object value) {
            addKeyWordsCriterion("key_words =", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualTo(Object value) {
            addKeyWordsCriterion("key_words <>", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThan(Object value) {
            addKeyWordsCriterion("key_words >", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualTo(Object value) {
            addKeyWordsCriterion("key_words >=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThan(Object value) {
            addKeyWordsCriterion("key_words <", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualTo(Object value) {
            addKeyWordsCriterion("key_words <=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIn(List<Object> values) {
            addKeyWordsCriterion("key_words in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotIn(List<Object> values) {
            addKeyWordsCriterion("key_words not in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsBetween(Object value1, Object value2) {
            addKeyWordsCriterion("key_words between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotBetween(Object value1, Object value2) {
            addKeyWordsCriterion("key_words not between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(Object value) {
            addAuthorCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(Object value) {
            addAuthorCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(Object value) {
            addAuthorCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(Object value) {
            addAuthorCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(Object value) {
            addAuthorCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(Object value) {
            addAuthorCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<Object> values) {
            addAuthorCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<Object> values) {
            addAuthorCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(Object value1, Object value2) {
            addAuthorCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(Object value1, Object value2) {
            addAuthorCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorsIsNull() {
            addCriterion("authors is null");
            return (Criteria) this;
        }

        public Criteria andAuthorsIsNotNull() {
            addCriterion("authors is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorsEqualTo(Object value) {
            addAuthorsCriterion("authors =", value, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsNotEqualTo(Object value) {
            addAuthorsCriterion("authors <>", value, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsGreaterThan(Object value) {
            addAuthorsCriterion("authors >", value, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsGreaterThanOrEqualTo(Object value) {
            addAuthorsCriterion("authors >=", value, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsLessThan(Object value) {
            addAuthorsCriterion("authors <", value, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsLessThanOrEqualTo(Object value) {
            addAuthorsCriterion("authors <=", value, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsIn(List<Object> values) {
            addAuthorsCriterion("authors in", values, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsNotIn(List<Object> values) {
            addAuthorsCriterion("authors not in", values, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsBetween(Object value1, Object value2) {
            addAuthorsCriterion("authors between", value1, value2, "authors");
            return (Criteria) this;
        }

        public Criteria andAuthorsNotBetween(Object value1, Object value2) {
            addAuthorsCriterion("authors not between", value1, value2, "authors");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownIsNull() {
            addCriterion("content_markdown is null");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownIsNotNull() {
            addCriterion("content_markdown is not null");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownEqualTo(String value) {
            addCriterion("content_markdown =", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownNotEqualTo(String value) {
            addCriterion("content_markdown <>", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownGreaterThan(String value) {
            addCriterion("content_markdown >", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownGreaterThanOrEqualTo(String value) {
            addCriterion("content_markdown >=", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownLessThan(String value) {
            addCriterion("content_markdown <", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownLessThanOrEqualTo(String value) {
            addCriterion("content_markdown <=", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownLike(String value) {
            addCriterion("content_markdown like", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownNotLike(String value) {
            addCriterion("content_markdown not like", value, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownIn(List<String> values) {
            addCriterion("content_markdown in", values, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownNotIn(List<String> values) {
            addCriterion("content_markdown not in", values, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownBetween(String value1, String value2) {
            addCriterion("content_markdown between", value1, value2, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentMarkdownNotBetween(String value1, String value2) {
            addCriterion("content_markdown not between", value1, value2, "contentMarkdown");
            return (Criteria) this;
        }

        public Criteria andContentHtmlIsNull() {
            addCriterion("content_html is null");
            return (Criteria) this;
        }

        public Criteria andContentHtmlIsNotNull() {
            addCriterion("content_html is not null");
            return (Criteria) this;
        }

        public Criteria andContentHtmlEqualTo(String value) {
            addCriterion("content_html =", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlNotEqualTo(String value) {
            addCriterion("content_html <>", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlGreaterThan(String value) {
            addCriterion("content_html >", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("content_html >=", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlLessThan(String value) {
            addCriterion("content_html <", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlLessThanOrEqualTo(String value) {
            addCriterion("content_html <=", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlLike(String value) {
            addCriterion("content_html like", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlNotLike(String value) {
            addCriterion("content_html not like", value, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlIn(List<String> values) {
            addCriterion("content_html in", values, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlNotIn(List<String> values) {
            addCriterion("content_html not in", values, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlBetween(String value1, String value2) {
            addCriterion("content_html between", value1, value2, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andContentHtmlNotBetween(String value1, String value2) {
            addCriterion("content_html not between", value1, value2, "contentHtml");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNull() {
            addCriterion("cover_image is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNotNull() {
            addCriterion("cover_image is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageEqualTo(String value) {
            addCriterion("cover_image =", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotEqualTo(String value) {
            addCriterion("cover_image <>", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThan(String value) {
            addCriterion("cover_image >", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThanOrEqualTo(String value) {
            addCriterion("cover_image >=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThan(String value) {
            addCriterion("cover_image <", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThanOrEqualTo(String value) {
            addCriterion("cover_image <=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLike(String value) {
            addCriterion("cover_image like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotLike(String value) {
            addCriterion("cover_image not like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageIn(List<String> values) {
            addCriterion("cover_image in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotIn(List<String> values) {
            addCriterion("cover_image not in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageBetween(String value1, String value2) {
            addCriterion("cover_image between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotBetween(String value1, String value2) {
            addCriterion("cover_image not between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(Object value) {
            addImagesCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(Object value) {
            addImagesCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(Object value) {
            addImagesCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(Object value) {
            addImagesCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(Object value) {
            addImagesCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(Object value) {
            addImagesCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<Object> values) {
            addImagesCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<Object> values) {
            addImagesCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(Object value1, Object value2) {
            addImagesCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(Object value1, Object value2) {
            addImagesCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNull() {
            addCriterion("word_count is null");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNotNull() {
            addCriterion("word_count is not null");
            return (Criteria) this;
        }

        public Criteria andWordCountEqualTo(Integer value) {
            addCriterion("word_count =", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotEqualTo(Integer value) {
            addCriterion("word_count <>", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThan(Integer value) {
            addCriterion("word_count >", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_count >=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThan(Integer value) {
            addCriterion("word_count <", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThanOrEqualTo(Integer value) {
            addCriterion("word_count <=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIn(List<Integer> values) {
            addCriterion("word_count in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotIn(List<Integer> values) {
            addCriterion("word_count not in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountBetween(Integer value1, Integer value2) {
            addCriterion("word_count between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotBetween(Integer value1, Integer value2) {
            addCriterion("word_count not between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountIsNull() {
            addCriterion("reader_count is null");
            return (Criteria) this;
        }

        public Criteria andReaderCountIsNotNull() {
            addCriterion("reader_count is not null");
            return (Criteria) this;
        }

        public Criteria andReaderCountEqualTo(Integer value) {
            addCriterion("reader_count =", value, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountNotEqualTo(Integer value) {
            addCriterion("reader_count <>", value, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountGreaterThan(Integer value) {
            addCriterion("reader_count >", value, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reader_count >=", value, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountLessThan(Integer value) {
            addCriterion("reader_count <", value, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountLessThanOrEqualTo(Integer value) {
            addCriterion("reader_count <=", value, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountIn(List<Integer> values) {
            addCriterion("reader_count in", values, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountNotIn(List<Integer> values) {
            addCriterion("reader_count not in", values, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountBetween(Integer value1, Integer value2) {
            addCriterion("reader_count between", value1, value2, "readerCount");
            return (Criteria) this;
        }

        public Criteria andReaderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reader_count not between", value1, value2, "readerCount");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andDislikesIsNull() {
            addCriterion("dislikes is null");
            return (Criteria) this;
        }

        public Criteria andDislikesIsNotNull() {
            addCriterion("dislikes is not null");
            return (Criteria) this;
        }

        public Criteria andDislikesEqualTo(Integer value) {
            addCriterion("dislikes =", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesNotEqualTo(Integer value) {
            addCriterion("dislikes <>", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesGreaterThan(Integer value) {
            addCriterion("dislikes >", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("dislikes >=", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesLessThan(Integer value) {
            addCriterion("dislikes <", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesLessThanOrEqualTo(Integer value) {
            addCriterion("dislikes <=", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesIn(List<Integer> values) {
            addCriterion("dislikes in", values, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesNotIn(List<Integer> values) {
            addCriterion("dislikes not in", values, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesBetween(Integer value1, Integer value2) {
            addCriterion("dislikes between", value1, value2, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesNotBetween(Integer value1, Integer value2) {
            addCriterion("dislikes not between", value1, value2, "dislikes");
            return (Criteria) this;
        }

        public Criteria andCollectionCountIsNull() {
            addCriterion("collection_count is null");
            return (Criteria) this;
        }

        public Criteria andCollectionCountIsNotNull() {
            addCriterion("collection_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionCountEqualTo(Integer value) {
            addCriterion("collection_count =", value, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountNotEqualTo(Integer value) {
            addCriterion("collection_count <>", value, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountGreaterThan(Integer value) {
            addCriterion("collection_count >", value, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_count >=", value, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountLessThan(Integer value) {
            addCriterion("collection_count <", value, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountLessThanOrEqualTo(Integer value) {
            addCriterion("collection_count <=", value, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountIn(List<Integer> values) {
            addCriterion("collection_count in", values, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountNotIn(List<Integer> values) {
            addCriterion("collection_count not in", values, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountBetween(Integer value1, Integer value2) {
            addCriterion("collection_count between", value1, value2, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andCollectionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_count not between", value1, value2, "collectionCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNull() {
            addCriterion("download_count is null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNotNull() {
            addCriterion("download_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountEqualTo(Integer value) {
            addCriterion("download_count =", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotEqualTo(Integer value) {
            addCriterion("download_count <>", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThan(Integer value) {
            addCriterion("download_count >", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_count >=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThan(Integer value) {
            addCriterion("download_count <", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("download_count <=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIn(List<Integer> values) {
            addCriterion("download_count in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotIn(List<Integer> values) {
            addCriterion("download_count not in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("download_count between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("download_count not between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsIsNull() {
            addCriterion("released_platforms is null");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsIsNotNull() {
            addCriterion("released_platforms is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsEqualTo(Object value) {
            addReleasedPlatformsCriterion("released_platforms =", value, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsNotEqualTo(Object value) {
            addReleasedPlatformsCriterion("released_platforms <>", value, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsGreaterThan(Object value) {
            addReleasedPlatformsCriterion("released_platforms >", value, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsGreaterThanOrEqualTo(Object value) {
            addReleasedPlatformsCriterion("released_platforms >=", value, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsLessThan(Object value) {
            addReleasedPlatformsCriterion("released_platforms <", value, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsLessThanOrEqualTo(Object value) {
            addReleasedPlatformsCriterion("released_platforms <=", value, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsIn(List<Object> values) {
            addReleasedPlatformsCriterion("released_platforms in", values, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsNotIn(List<Object> values) {
            addReleasedPlatformsCriterion("released_platforms not in", values, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsBetween(Object value1, Object value2) {
            addReleasedPlatformsCriterion("released_platforms between", value1, value2, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReleasedPlatformsNotBetween(Object value1, Object value2) {
            addReleasedPlatformsCriterion("released_platforms not between", value1, value2, "releasedPlatforms");
            return (Criteria) this;
        }

        public Criteria andReferencedCountIsNull() {
            addCriterion("referenced_count is null");
            return (Criteria) this;
        }

        public Criteria andReferencedCountIsNotNull() {
            addCriterion("referenced_count is not null");
            return (Criteria) this;
        }

        public Criteria andReferencedCountEqualTo(Integer value) {
            addCriterion("referenced_count =", value, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountNotEqualTo(Integer value) {
            addCriterion("referenced_count <>", value, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountGreaterThan(Integer value) {
            addCriterion("referenced_count >", value, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("referenced_count >=", value, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountLessThan(Integer value) {
            addCriterion("referenced_count <", value, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountLessThanOrEqualTo(Integer value) {
            addCriterion("referenced_count <=", value, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountIn(List<Integer> values) {
            addCriterion("referenced_count in", values, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountNotIn(List<Integer> values) {
            addCriterion("referenced_count not in", values, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountBetween(Integer value1, Integer value2) {
            addCriterion("referenced_count between", value1, value2, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andReferencedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("referenced_count not between", value1, value2, "referencedCount");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(Object value) {
            addTagsCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(Object value) {
            addTagsCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(Object value) {
            addTagsCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(Object value) {
            addTagsCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(Object value) {
            addTagsCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(Object value) {
            addTagsCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<Object> values) {
            addTagsCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<Object> values) {
            addTagsCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(Object value1, Object value2) {
            addTagsCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(Object value1, Object value2) {
            addTagsCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andClassificationsIsNull() {
            addCriterion("classifications is null");
            return (Criteria) this;
        }

        public Criteria andClassificationsIsNotNull() {
            addCriterion("classifications is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationsEqualTo(Object value) {
            addClassificationsCriterion("classifications =", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotEqualTo(Object value) {
            addClassificationsCriterion("classifications <>", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsGreaterThan(Object value) {
            addClassificationsCriterion("classifications >", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsGreaterThanOrEqualTo(Object value) {
            addClassificationsCriterion("classifications >=", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLessThan(Object value) {
            addClassificationsCriterion("classifications <", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLessThanOrEqualTo(Object value) {
            addClassificationsCriterion("classifications <=", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsIn(List<Object> values) {
            addClassificationsCriterion("classifications in", values, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotIn(List<Object> values) {
            addClassificationsCriterion("classifications not in", values, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsBetween(Object value1, Object value2) {
            addClassificationsCriterion("classifications between", value1, value2, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotBetween(Object value1, Object value2) {
            addClassificationsCriterion("classifications not between", value1, value2, "classifications");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCitesIsNull() {
            addCriterion("cites is null");
            return (Criteria) this;
        }

        public Criteria andCitesIsNotNull() {
            addCriterion("cites is not null");
            return (Criteria) this;
        }

        public Criteria andCitesEqualTo(Object value) {
            addCitesCriterion("cites =", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesNotEqualTo(Object value) {
            addCitesCriterion("cites <>", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesGreaterThan(Object value) {
            addCitesCriterion("cites >", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesGreaterThanOrEqualTo(Object value) {
            addCitesCriterion("cites >=", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesLessThan(Object value) {
            addCitesCriterion("cites <", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesLessThanOrEqualTo(Object value) {
            addCitesCriterion("cites <=", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesIn(List<Object> values) {
            addCitesCriterion("cites in", values, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesNotIn(List<Object> values) {
            addCitesCriterion("cites not in", values, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesBetween(Object value1, Object value2) {
            addCitesCriterion("cites between", value1, value2, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesNotBetween(Object value1, Object value2) {
            addCitesCriterion("cites not between", value1, value2, "cites");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIsNull() {
            addCriterion("release_status is null");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIsNotNull() {
            addCriterion("release_status is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusEqualTo(Short value) {
            addCriterion("release_status =", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotEqualTo(Short value) {
            addCriterion("release_status <>", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusGreaterThan(Short value) {
            addCriterion("release_status >", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("release_status >=", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLessThan(Short value) {
            addCriterion("release_status <", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLessThanOrEqualTo(Short value) {
            addCriterion("release_status <=", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIn(List<Short> values) {
            addCriterion("release_status in", values, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotIn(List<Short> values) {
            addCriterion("release_status not in", values, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusBetween(Short value1, Short value2) {
            addCriterion("release_status between", value1, value2, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotBetween(Short value1, Short value2) {
            addCriterion("release_status not between", value1, value2, "releaseStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}