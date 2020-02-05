package com.warmfrog.star.common.vo;
import com.warmfrog.star.common.dto.PostDto;

import java.util.Date;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/4
 */
public class PostVo {

    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String title;

    private List<String> keyWords;

    private PostDto.Author author;

    private List<PostDto.Author> authors;

    private String filePath;

    private String downloadUrl;

    private String contentMarkdown;

    private String contentHtml;

    private Date releaseTime;

    private String brief;

    private String coverImage;

    private List<String> images;

    private Integer wordCount;

    private Integer readerCount;

    private Integer likes;

    private Integer dislikes;

    private Integer collectionCount;

    private Integer downloadCount;

    private Integer commentCount;

    private List<PostDto.ReleasedPlatform> releasedPlatforms;

    private Integer referencedCount;

    private Integer score;

    private String language;

    private List<String> tags;

    private List<String> classifications;

    private Short type;

    private List<PostDto.Cite> cites;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public PostDto.Author getAuthor() {
        return author;
    }

    public void setAuthor(PostDto.Author author) {
        this.author = author;
    }

    public List<PostDto.Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<PostDto.Author> authors) {
        this.authors = authors;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<PostDto.ReleasedPlatform> getReleasedPlatforms() {
        return releasedPlatforms;
    }

    public void setReleasedPlatforms(List<PostDto.ReleasedPlatform> releasedPlatforms) {
        this.releasedPlatforms = releasedPlatforms;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<String> classifications) {
        this.classifications = classifications;
    }

    public List<PostDto.Cite> getCites() {
        return cites;
    }

    public void setCites(List<PostDto.Cite> cites) {
        this.cites = cites;
    }
}
