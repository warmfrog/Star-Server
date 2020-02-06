package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class Album {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String theme;

    private String title;

    private String thumbnail;

    private String downloadUrl;

    private Integer likes;

    private Integer collectCount;

    private Integer downloadCount;

    private Integer commentCount;

    private Integer browsedCount;

    private Date uploadDate;

    private Date shootTime;

    private Object tags;

    private Object classifications;

    private String photographer;

    private String model;

    private String position;

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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getBrowsedCount() {
        return browsedCount;
    }

    public void setBrowsedCount(Integer browsedCount) {
        this.browsedCount = browsedCount;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Date getShootTime() {
        return shootTime;
    }

    public void setShootTime(Date shootTime) {
        this.shootTime = shootTime;
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

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        Album other = (Album) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getDownloadUrl() == null ? other.getDownloadUrl() == null : this.getDownloadUrl().equals(other.getDownloadUrl()))
            && (this.getLikes() == null ? other.getLikes() == null : this.getLikes().equals(other.getLikes()))
                && (this.getCollectCount() == null ? other.getCollectCount() == null : this.getCollectCount().equals(other.getCollectCount()))
                && (this.getDownloadCount() == null ? other.getDownloadCount() == null : this.getDownloadCount().equals(other.getDownloadCount()))
                && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
                && (this.getBrowsedCount() == null ? other.getBrowsedCount() == null : this.getBrowsedCount().equals(other.getBrowsedCount()))
                && (this.getUploadDate() == null ? other.getUploadDate() == null : this.getUploadDate().equals(other.getUploadDate()))
                && (this.getShootTime() == null ? other.getShootTime() == null : this.getShootTime().equals(other.getShootTime()))
                && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
                && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
                && (this.getPhotographer() == null ? other.getPhotographer() == null : this.getPhotographer().equals(other.getPhotographer()))
                && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
                && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()));
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
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        result = prime * result + ((getLikes() == null) ? 0 : getLikes().hashCode());
        result = prime * result + ((getCollectCount() == null) ? 0 : getCollectCount().hashCode());
        result = prime * result + ((getDownloadCount() == null) ? 0 : getDownloadCount().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getBrowsedCount() == null) ? 0 : getBrowsedCount().hashCode());
        result = prime * result + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        result = prime * result + ((getShootTime() == null) ? 0 : getShootTime().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getPhotographer() == null) ? 0 : getPhotographer().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
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
        sb.append(", theme=").append(theme);
        sb.append(", title=").append(title);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", downloadUrl=").append(downloadUrl);
        sb.append(", likes=").append(likes);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", browsedCount=").append(browsedCount);
        sb.append(", uploadDate=").append(uploadDate);
        sb.append(", shootTime=").append(shootTime);
        sb.append(", tags=").append(tags);
        sb.append(", classifications=").append(classifications);
        sb.append(", photographer=").append(photographer);
        sb.append(", model=").append(model);
        sb.append(", position=").append(position);
        sb.append("]");
        return sb.toString();
    }
}