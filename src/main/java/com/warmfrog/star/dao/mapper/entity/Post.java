package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class Post {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Short deleteFlag;

    private String title;

    private Object keyWords;

    private Object author;

    private Object authors;

    private String filePath;

    private String downloadUrl;

    private String contentMarkdown;

    private String contentHtml;

    private Date releaseTime;

    private String brief;

    private String coverImage;

    private Object images;

    private Integer wordCount;

    private Integer readerCount;

    private Integer likes;

    private Integer dislikes;

    private Integer collectionCount;

    private Integer downloadCount;

    private Integer commentCount;

    private Object releasedPlatforms;

    private Integer referencedCount;

    private Integer score;

    private String language;

    private Object tags;

    private Object classifications;

    private Short type;

    private Object cites;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(Object keyWords) {
        this.keyWords = keyWords;
    }

    public Object getAuthor() {
        return author;
    }

    public void setAuthor(Object author) {
        this.author = author;
    }

    public Object getAuthors() {
        return authors;
    }

    public void setAuthors(Object authors) {
        this.authors = authors;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getContentMarkdown() {
        return contentMarkdown;
    }

    public void setContentMarkdown(String contentMarkdown) {
        this.contentMarkdown = contentMarkdown;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getReaderCount() {
        return readerCount;
    }

    public void setReaderCount(Integer readerCount) {
        this.readerCount = readerCount;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Integer getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Integer collectionCount) {
        this.collectionCount = collectionCount;
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

    public Object getReleasedPlatforms() {
        return releasedPlatforms;
    }

    public void setReleasedPlatforms(Object releasedPlatforms) {
        this.releasedPlatforms = releasedPlatforms;
    }

    public Integer getReferencedCount() {
        return referencedCount;
    }

    public void setReferencedCount(Integer referencedCount) {
        this.referencedCount = referencedCount;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Object getCites() {
        return cites;
    }

    public void setCites(Object cites) {
        this.cites = cites;
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
        Post other = (Post) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
                && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
                && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getKeyWords() == null ? other.getKeyWords() == null : this.getKeyWords().equals(other.getKeyWords()))
                && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
                && (this.getAuthors() == null ? other.getAuthors() == null : this.getAuthors().equals(other.getAuthors()))
                && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
                && (this.getDownloadUrl() == null ? other.getDownloadUrl() == null : this.getDownloadUrl().equals(other.getDownloadUrl()))
                && (this.getContentMarkdown() == null ? other.getContentMarkdown() == null : this.getContentMarkdown().equals(other.getContentMarkdown()))
                && (this.getContentHtml() == null ? other.getContentHtml() == null : this.getContentHtml().equals(other.getContentHtml()))
                && (this.getReleaseTime() == null ? other.getReleaseTime() == null : this.getReleaseTime().equals(other.getReleaseTime()))
                && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getCoverImage() == null ? other.getCoverImage() == null : this.getCoverImage().equals(other.getCoverImage()))
            && (this.getImages() == null ? other.getImages() == null : this.getImages().equals(other.getImages()))
            && (this.getWordCount() == null ? other.getWordCount() == null : this.getWordCount().equals(other.getWordCount()))
            && (this.getReaderCount() == null ? other.getReaderCount() == null : this.getReaderCount().equals(other.getReaderCount()))
            && (this.getLikes() == null ? other.getLikes() == null : this.getLikes().equals(other.getLikes()))
            && (this.getDislikes() == null ? other.getDislikes() == null : this.getDislikes().equals(other.getDislikes()))
            && (this.getCollectionCount() == null ? other.getCollectionCount() == null : this.getCollectionCount().equals(other.getCollectionCount()))
            && (this.getDownloadCount() == null ? other.getDownloadCount() == null : this.getDownloadCount().equals(other.getDownloadCount()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getReleasedPlatforms() == null ? other.getReleasedPlatforms() == null : this.getReleasedPlatforms().equals(other.getReleasedPlatforms()))
            && (this.getReferencedCount() == null ? other.getReferencedCount() == null : this.getReferencedCount().equals(other.getReferencedCount()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCites() == null ? other.getCites() == null : this.getCites().equals(other.getCites()));
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
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getKeyWords() == null) ? 0 : getKeyWords().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getAuthors() == null) ? 0 : getAuthors().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        result = prime * result + ((getContentMarkdown() == null) ? 0 : getContentMarkdown().hashCode());
        result = prime * result + ((getContentHtml() == null) ? 0 : getContentHtml().hashCode());
        result = prime * result + ((getReleaseTime() == null) ? 0 : getReleaseTime().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getCoverImage() == null) ? 0 : getCoverImage().hashCode());
        result = prime * result + ((getImages() == null) ? 0 : getImages().hashCode());
        result = prime * result + ((getWordCount() == null) ? 0 : getWordCount().hashCode());
        result = prime * result + ((getReaderCount() == null) ? 0 : getReaderCount().hashCode());
        result = prime * result + ((getLikes() == null) ? 0 : getLikes().hashCode());
        result = prime * result + ((getDislikes() == null) ? 0 : getDislikes().hashCode());
        result = prime * result + ((getCollectionCount() == null) ? 0 : getCollectionCount().hashCode());
        result = prime * result + ((getDownloadCount() == null) ? 0 : getDownloadCount().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getReleasedPlatforms() == null) ? 0 : getReleasedPlatforms().hashCode());
        result = prime * result + ((getReferencedCount() == null) ? 0 : getReferencedCount().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCites() == null) ? 0 : getCites().hashCode());
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
        sb.append(", title=").append(title);
        sb.append(", keyWords=").append(keyWords);
        sb.append(", author=").append(author);
        sb.append(", authors=").append(authors);
        sb.append(", filePath=").append(filePath);
        sb.append(", downloadUrl=").append(downloadUrl);
        sb.append(", contentMarkdown=").append(contentMarkdown);
        sb.append(", contentHtml=").append(contentHtml);
        sb.append(", releaseTime=").append(releaseTime);
        sb.append(", brief=").append(brief);
        sb.append(", coverImage=").append(coverImage);
        sb.append(", images=").append(images);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", readerCount=").append(readerCount);
        sb.append(", likes=").append(likes);
        sb.append(", dislikes=").append(dislikes);
        sb.append(", collectionCount=").append(collectionCount);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", releasedPlatforms=").append(releasedPlatforms);
        sb.append(", referencedCount=").append(referencedCount);
        sb.append(", score=").append(score);
        sb.append(", language=").append(language);
        sb.append(", tags=").append(tags);
        sb.append(", classifications=").append(classifications);
        sb.append(", type=").append(type);
        sb.append(", cites=").append(cites);
        sb.append("]");
        return sb.toString();
    }
}