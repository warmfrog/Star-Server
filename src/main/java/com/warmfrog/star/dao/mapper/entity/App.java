package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class App {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private Date updateDate;

    private String version;

    private String platform;

    private Object distPlatforms;

    private Long size;

    private Short hasad;

    private String brief;

    private Short score;

    private Object classifications;

    private Object tags;

    private String developer;

    private Object developers;

    private Short freeCharge;

    private Short openSource;

    private String git;

    private String icon;

    private Object screenshots;

    private Object downloadLinks;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Object getDistPlatforms() {
        return distPlatforms;
    }

    public void setDistPlatforms(Object distPlatforms) {
        this.distPlatforms = distPlatforms;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Short getHasad() {
        return hasad;
    }

    public void setHasad(Short hasad) {
        this.hasad = hasad;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Object getClassifications() {
        return classifications;
    }

    public void setClassifications(Object classifications) {
        this.classifications = classifications;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Object getDevelopers() {
        return developers;
    }

    public void setDevelopers(Object developers) {
        this.developers = developers;
    }

    public Short getFreeCharge() {
        return freeCharge;
    }

    public void setFreeCharge(Short freeCharge) {
        this.freeCharge = freeCharge;
    }

    public Short getOpenSource() {
        return openSource;
    }

    public void setOpenSource(Short openSource) {
        this.openSource = openSource;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(Object screenshots) {
        this.screenshots = screenshots;
    }

    public Object getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(Object downloadLinks) {
        this.downloadLinks = downloadLinks;
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
        App other = (App) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getDistPlatforms() == null ? other.getDistPlatforms() == null : this.getDistPlatforms().equals(other.getDistPlatforms()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getHasad() == null ? other.getHasad() == null : this.getHasad().equals(other.getHasad()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getDeveloper() == null ? other.getDeveloper() == null : this.getDeveloper().equals(other.getDeveloper()))
            && (this.getDevelopers() == null ? other.getDevelopers() == null : this.getDevelopers().equals(other.getDevelopers()))
            && (this.getFreeCharge() == null ? other.getFreeCharge() == null : this.getFreeCharge().equals(other.getFreeCharge()))
            && (this.getOpenSource() == null ? other.getOpenSource() == null : this.getOpenSource().equals(other.getOpenSource()))
            && (this.getGit() == null ? other.getGit() == null : this.getGit().equals(other.getGit()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getScreenshots() == null ? other.getScreenshots() == null : this.getScreenshots().equals(other.getScreenshots()))
            && (this.getDownloadLinks() == null ? other.getDownloadLinks() == null : this.getDownloadLinks().equals(other.getDownloadLinks()));
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getDistPlatforms() == null) ? 0 : getDistPlatforms().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getHasad() == null) ? 0 : getHasad().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getDeveloper() == null) ? 0 : getDeveloper().hashCode());
        result = prime * result + ((getDevelopers() == null) ? 0 : getDevelopers().hashCode());
        result = prime * result + ((getFreeCharge() == null) ? 0 : getFreeCharge().hashCode());
        result = prime * result + ((getOpenSource() == null) ? 0 : getOpenSource().hashCode());
        result = prime * result + ((getGit() == null) ? 0 : getGit().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        result = prime * result + ((getDownloadLinks() == null) ? 0 : getDownloadLinks().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", version=").append(version);
        sb.append(", platform=").append(platform);
        sb.append(", distPlatforms=").append(distPlatforms);
        sb.append(", size=").append(size);
        sb.append(", hasad=").append(hasad);
        sb.append(", brief=").append(brief);
        sb.append(", score=").append(score);
        sb.append(", classifications=").append(classifications);
        sb.append(", tags=").append(tags);
        sb.append(", developer=").append(developer);
        sb.append(", developers=").append(developers);
        sb.append(", freeCharge=").append(freeCharge);
        sb.append(", openSource=").append(openSource);
        sb.append(", git=").append(git);
        sb.append(", icon=").append(icon);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", downloadLinks=").append(downloadLinks);
        sb.append("]");
        return sb.toString();
    }
}