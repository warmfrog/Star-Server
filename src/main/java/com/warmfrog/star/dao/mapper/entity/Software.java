package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class Software {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Short deleteFlag;

    private String softwareName;

    private String version;

    private String developer;

    private Long size;

    private String md5;

    private String officialSite;

    private String introduction;

    private String icon;

    private Object screenshots;

    private Object tags;

    private Object classifications;

    private String score;

    private String platform;

    private String language;

    private Short free;

    private Integer likes;

    private Short dislikes;

    private Short openSource;

    private String git;

    private Object distPlatforms;

    private String downloadLink;

    private Object downloadLinks;

    private Object tutorials;

    private String remark;

    private Object histories;

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

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Short getFree() {
        return free;
    }

    public void setFree(Short free) {
        this.free = free;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Short getDislikes() {
        return dislikes;
    }

    public void setDislikes(Short dislikes) {
        this.dislikes = dislikes;
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

    public Object getDistPlatforms() {
        return distPlatforms;
    }

    public void setDistPlatforms(Object distPlatforms) {
        this.distPlatforms = distPlatforms;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public Object getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(Object downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public Object getTutorials() {
        return tutorials;
    }

    public void setTutorials(Object tutorials) {
        this.tutorials = tutorials;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getHistories() {
        return histories;
    }

    public void setHistories(Object histories) {
        this.histories = histories;
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
        Software other = (Software) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
                && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
                && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
                && (this.getSoftwareName() == null ? other.getSoftwareName() == null : this.getSoftwareName().equals(other.getSoftwareName()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
                && (this.getDeveloper() == null ? other.getDeveloper() == null : this.getDeveloper().equals(other.getDeveloper()))
                && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
                && (this.getMd5() == null ? other.getMd5() == null : this.getMd5().equals(other.getMd5()))
                && (this.getOfficialSite() == null ? other.getOfficialSite() == null : this.getOfficialSite().equals(other.getOfficialSite()))
                && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
                && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
                && (this.getScreenshots() == null ? other.getScreenshots() == null : this.getScreenshots().equals(other.getScreenshots()))
                && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getFree() == null ? other.getFree() == null : this.getFree().equals(other.getFree()))
            && (this.getLikes() == null ? other.getLikes() == null : this.getLikes().equals(other.getLikes()))
            && (this.getDislikes() == null ? other.getDislikes() == null : this.getDislikes().equals(other.getDislikes()))
            && (this.getOpenSource() == null ? other.getOpenSource() == null : this.getOpenSource().equals(other.getOpenSource()))
            && (this.getGit() == null ? other.getGit() == null : this.getGit().equals(other.getGit()))
            && (this.getDistPlatforms() == null ? other.getDistPlatforms() == null : this.getDistPlatforms().equals(other.getDistPlatforms()))
            && (this.getDownloadLink() == null ? other.getDownloadLink() == null : this.getDownloadLink().equals(other.getDownloadLink()))
            && (this.getDownloadLinks() == null ? other.getDownloadLinks() == null : this.getDownloadLinks().equals(other.getDownloadLinks()))
            && (this.getTutorials() == null ? other.getTutorials() == null : this.getTutorials().equals(other.getTutorials()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getHistories() == null ? other.getHistories() == null : this.getHistories().equals(other.getHistories()));
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
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getSoftwareName() == null) ? 0 : getSoftwareName().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeveloper() == null) ? 0 : getDeveloper().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getMd5() == null) ? 0 : getMd5().hashCode());
        result = prime * result + ((getOfficialSite() == null) ? 0 : getOfficialSite().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getFree() == null) ? 0 : getFree().hashCode());
        result = prime * result + ((getLikes() == null) ? 0 : getLikes().hashCode());
        result = prime * result + ((getDislikes() == null) ? 0 : getDislikes().hashCode());
        result = prime * result + ((getOpenSource() == null) ? 0 : getOpenSource().hashCode());
        result = prime * result + ((getGit() == null) ? 0 : getGit().hashCode());
        result = prime * result + ((getDistPlatforms() == null) ? 0 : getDistPlatforms().hashCode());
        result = prime * result + ((getDownloadLink() == null) ? 0 : getDownloadLink().hashCode());
        result = prime * result + ((getDownloadLinks() == null) ? 0 : getDownloadLinks().hashCode());
        result = prime * result + ((getTutorials() == null) ? 0 : getTutorials().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getHistories() == null) ? 0 : getHistories().hashCode());
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
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", softwareName=").append(softwareName);
        sb.append(", version=").append(version);
        sb.append(", developer=").append(developer);
        sb.append(", size=").append(size);
        sb.append(", md5=").append(md5);
        sb.append(", officialSite=").append(officialSite);
        sb.append(", introduction=").append(introduction);
        sb.append(", icon=").append(icon);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", tags=").append(tags);
        sb.append(", classifications=").append(classifications);
        sb.append(", score=").append(score);
        sb.append(", platform=").append(platform);
        sb.append(", language=").append(language);
        sb.append(", free=").append(free);
        sb.append(", likes=").append(likes);
        sb.append(", dislikes=").append(dislikes);
        sb.append(", openSource=").append(openSource);
        sb.append(", git=").append(git);
        sb.append(", distPlatforms=").append(distPlatforms);
        sb.append(", downloadLink=").append(downloadLink);
        sb.append(", downloadLinks=").append(downloadLinks);
        sb.append(", tutorials=").append(tutorials);
        sb.append(", remark=").append(remark);
        sb.append(", histories=").append(histories);
        sb.append("]");
        return sb.toString();
    }
}