package com.warmfrog.star.common.dto;

/**
 * @author libo
 * @date 2020/2/6
 */
public class VersionDto {
    private int serialNumber;
    private String description;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
