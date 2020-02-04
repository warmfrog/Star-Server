package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class Site {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String siteName;

    private String url;

    private Object tags;

    private Object classifications;

    private String thumbnail;

    private Object screenshots;

    private Short needVpn;

    private String language;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getClassifications() {
        return classifications;
    }

    public void setClassifications(Object classifications) {
        this.classifications = classifications;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Object getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(Object screenshots) {
        this.screenshots = screenshots;
    }

    public Short getNeedVpn() {
        return needVpn;
    }

    public void setNeedVpn(Short needVpn) {
        this.needVpn = needVpn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Site other = (Site) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getSiteName() == null ? other.getSiteName() == null : this.getSiteName().equals(other.getSiteName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getScreenshots() == null ? other.getScreenshots() == null : this.getScreenshots().equals(other.getScreenshots()))
            && (this.getNeedVpn() == null ? other.getNeedVpn() == null : this.getNeedVpn().equals(other.getNeedVpn()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getSiteName() == null) ? 0 : getSiteName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        result = prime * result + ((getNeedVpn() == null) ? 0 : getNeedVpn().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", siteName=").append(siteName);
        sb.append(", url=").append(url);
        sb.append(", tags=").append(tags);
        sb.append(", classifications=").append(classifications);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", needVpn=").append(needVpn);
        sb.append(", language=").append(language);
        sb.append("]");
        return sb.toString();
    }
}