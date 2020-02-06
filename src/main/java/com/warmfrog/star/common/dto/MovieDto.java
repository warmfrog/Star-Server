package com.warmfrog.star.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/6
 */
public class MovieDto extends PageDto {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private Integer year;

    private String[] tags;

    private String[] screenshots;

    private String cover;

    private String[] classifications;

    private String director;

    private String[] leadingRoles;

    private String[] screenwriters;

    private String[] madein;

    private List<ShowingDate> showingDate;

    private String[] languages;

    private String score;

    private Long length;

    private Long size;

    private List<DownloadLink> downloadLinks;

    private List<PlayPlatform> playLinks;

    private String alias;

    private String brief;

    private Douban douban;

    private Imdb imdb;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String[] getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(String[] screenshots) {
        this.screenshots = screenshots;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String[] getClassifications() {
        return classifications;
    }

    public void setClassifications(String[] classifications) {
        this.classifications = classifications;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getLeadingRoles() {
        return leadingRoles;
    }

    public void setLeadingRoles(String[] leadingRoles) {
        this.leadingRoles = leadingRoles;
    }

    public String[] getScreenwriters() {
        return screenwriters;
    }

    public void setScreenwriters(String[] screenwriters) {
        this.screenwriters = screenwriters;
    }

    public String[] getMadein() {
        return madein;
    }

    public void setMadein(String[] madein) {
        this.madein = madein;
    }

    public List<ShowingDate> getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(List<ShowingDate> showingDate) {
        this.showingDate = showingDate;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public List<DownloadLink> getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(List<DownloadLink> downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public List<PlayPlatform> getPlayLinks() {
        return playLinks;
    }

    public void setPlayLinks(List<PlayPlatform> playLinks) {
        this.playLinks = playLinks;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Douban getDouban() {
        return douban;
    }

    public void setDouban(Douban douban) {
        this.douban = douban;
    }

    public Imdb getImdb() {
        return imdb;
    }

    public void setImdb(Imdb imdb) {
        this.imdb = imdb;
    }

    public static class Imdb {
        private String id;
        private String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class PlayPlatform {
        private String platformCode;
        private String platform;
        private String url;
        private Boolean freeCharge;

        public String getPlatformCode() {
            return platformCode;
        }

        public void setPlatformCode(String platformCode) {
            this.platformCode = platformCode;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean getFreeCharge() {
            return freeCharge;
        }

        public void setFreeCharge(Boolean freeCharge) {
            this.freeCharge = freeCharge;
        }
    }

    public static class ShowingDate {
        private String country;
        private Date date;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }
}
