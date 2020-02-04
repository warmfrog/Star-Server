package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class Movie {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private Integer year;

    private Object tags;

    private Object screenshots;

    private String cover;

    private Object classifications;

    private String director;

    private Object leadingRoles;

    private Object screenwriters;

    private Object madein;

    private Object showingDate;

    private Object languages;

    private String score;

    private Long length;

    private Long size;

    private Object downloadLinks;

    private Object playLinks;

    private String alias;

    private String brief;

    private Object douban;

    private Object imdb;

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

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(Object screenshots) {
        this.screenshots = screenshots;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Object getClassifications() {
        return classifications;
    }

    public void setClassifications(Object classifications) {
        this.classifications = classifications;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Object getLeadingRoles() {
        return leadingRoles;
    }

    public void setLeadingRoles(Object leadingRoles) {
        this.leadingRoles = leadingRoles;
    }

    public Object getScreenwriters() {
        return screenwriters;
    }

    public void setScreenwriters(Object screenwriters) {
        this.screenwriters = screenwriters;
    }

    public Object getMadein() {
        return madein;
    }

    public void setMadein(Object madein) {
        this.madein = madein;
    }

    public Object getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(Object showingDate) {
        this.showingDate = showingDate;
    }

    public Object getLanguages() {
        return languages;
    }

    public void setLanguages(Object languages) {
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

    public Object getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(Object downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public Object getPlayLinks() {
        return playLinks;
    }

    public void setPlayLinks(Object playLinks) {
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

    public Object getDouban() {
        return douban;
    }

    public void setDouban(Object douban) {
        this.douban = douban;
    }

    public Object getImdb() {
        return imdb;
    }

    public void setImdb(Object imdb) {
        this.imdb = imdb;
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
        Movie other = (Movie) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getScreenshots() == null ? other.getScreenshots() == null : this.getScreenshots().equals(other.getScreenshots()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
            && (this.getDirector() == null ? other.getDirector() == null : this.getDirector().equals(other.getDirector()))
            && (this.getLeadingRoles() == null ? other.getLeadingRoles() == null : this.getLeadingRoles().equals(other.getLeadingRoles()))
            && (this.getScreenwriters() == null ? other.getScreenwriters() == null : this.getScreenwriters().equals(other.getScreenwriters()))
            && (this.getMadein() == null ? other.getMadein() == null : this.getMadein().equals(other.getMadein()))
            && (this.getShowingDate() == null ? other.getShowingDate() == null : this.getShowingDate().equals(other.getShowingDate()))
            && (this.getLanguages() == null ? other.getLanguages() == null : this.getLanguages().equals(other.getLanguages()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getDownloadLinks() == null ? other.getDownloadLinks() == null : this.getDownloadLinks().equals(other.getDownloadLinks()))
            && (this.getPlayLinks() == null ? other.getPlayLinks() == null : this.getPlayLinks().equals(other.getPlayLinks()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getDouban() == null ? other.getDouban() == null : this.getDouban().equals(other.getDouban()))
            && (this.getImdb() == null ? other.getImdb() == null : this.getImdb().equals(other.getImdb()));
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
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getDirector() == null) ? 0 : getDirector().hashCode());
        result = prime * result + ((getLeadingRoles() == null) ? 0 : getLeadingRoles().hashCode());
        result = prime * result + ((getScreenwriters() == null) ? 0 : getScreenwriters().hashCode());
        result = prime * result + ((getMadein() == null) ? 0 : getMadein().hashCode());
        result = prime * result + ((getShowingDate() == null) ? 0 : getShowingDate().hashCode());
        result = prime * result + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getDownloadLinks() == null) ? 0 : getDownloadLinks().hashCode());
        result = prime * result + ((getPlayLinks() == null) ? 0 : getPlayLinks().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getDouban() == null) ? 0 : getDouban().hashCode());
        result = prime * result + ((getImdb() == null) ? 0 : getImdb().hashCode());
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
        sb.append(", year=").append(year);
        sb.append(", tags=").append(tags);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", cover=").append(cover);
        sb.append(", classifications=").append(classifications);
        sb.append(", director=").append(director);
        sb.append(", leadingRoles=").append(leadingRoles);
        sb.append(", screenwriters=").append(screenwriters);
        sb.append(", madein=").append(madein);
        sb.append(", showingDate=").append(showingDate);
        sb.append(", languages=").append(languages);
        sb.append(", score=").append(score);
        sb.append(", length=").append(length);
        sb.append(", size=").append(size);
        sb.append(", downloadLinks=").append(downloadLinks);
        sb.append(", playLinks=").append(playLinks);
        sb.append(", alias=").append(alias);
        sb.append(", brief=").append(brief);
        sb.append(", douban=").append(douban);
        sb.append(", imdb=").append(imdb);
        sb.append("]");
        return sb.toString();
    }
}