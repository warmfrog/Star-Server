package com.warmfrog.star.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
public class SoftwareDto extends PageDto {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String softwareName;

    private String version;

    private String developer;

    private Long size;

    private String md5;

    private String officialSite;

    private String introduction;

    private String icon;

    private String[] screenshots;

    private String[] tags;

    private String[] classifications;

    private String score;

    private String platform;

    private String language;

    private Short free;

    private Integer likes;

    private Short dislikes;

    private Short openSource;

    private String git;

    private String[] distPlatforms;

    private String downloadLink;

    private List<DownloadLink> downloadLinks;

    private String[] tutorials;

    private String remark;

    private List<SoftwareHistory> histories;

    public String[] getDistPlatforms() {
        return distPlatforms;
    }

    public void setDistPlatforms(String[] distPlatforms) {
        this.distPlatforms = distPlatforms;
    }

    public List<DownloadLink> getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(List<DownloadLink> downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

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

    public String[] getTutorials() {
        return tutorials;
    }

    public void setTutorials(String[] tutorials) {
        this.tutorials = tutorials;
    }

    public List<SoftwareHistory> getHistories() {
        return histories;
    }

    public void setHistories(List<SoftwareHistory> histories) {
        this.histories = histories;
    }

    public String[] getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(String[] screenshots) {
        this.screenshots = screenshots;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String[] getClassifications() {
        return classifications;
    }

    public void setClassifications(String[] classifications) {
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

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static class DownloadLink {
        private String platform;
        private String[] downloadUrls;

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String[] getDownloadUrls() {
            return downloadUrls;
        }

        public void setDownloadUrls(String[] downloadUrls) {
            this.downloadUrls = downloadUrls;
        }
    }

    public static class SoftwareHistory {
        private String version;
        private Date releaseTime;
        private String downloadUrl;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Date getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(Date releaseTime) {
            this.releaseTime = releaseTime;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }
    }
}
