package com.warmfrog.star.common.enums;

/**
 * @author libo
 * @date 2020/2/6
 */
public enum DeleteFlagEnum {
    DELETED((short) 1, "已删除"),
    NODELETE((short) 0, "未删除");

    private short value;
    private String desc;

    private DeleteFlagEnum() {
    }

    private DeleteFlagEnum(short value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public short getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
