package com.warmfrog.star.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/5
 */
public class AppDto extends PageDto {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private Date updateDate;

    private String version;

    private String platform;

    private String[] distPlatforms;

    private Long size;

    private Short hasad;

    private String brief;

    private Short score;

    private String[] classifications;

    private String[] tags;

    private String developer;

    private String[] developers;

    private Short freeCharge;

    private Short openSource;

    private String git;

    private String icon;

    private String[] screenshots;

    private List<DownloadLink> downloadLinks;

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

    public String[] getDistPlatforms() {
        return distPlatforms;
    }

    public void setDistPlatforms(String[] distPlatforms) {
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

    public String[] getClassifications() {
        return classifications;
    }

    public void setClassifications(String[] classifications) {
        this.classifications = classifications;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(String[] developers) {
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

    public String[] getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(String[] screenshots) {
        this.screenshots = screenshots;
    }

    public List<DownloadLink> getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(List<DownloadLink> downloadLinks) {
        this.downloadLinks = downloadLinks;
    }
}
