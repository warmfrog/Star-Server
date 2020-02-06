package com.warmfrog.star.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/4
 */
public class PostDto extends PageDto {
    private static final long serialVersionUID = 2390492304L;

    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String title;

    private String[] keyWords;

    private Author author;

    private List<Author> authors;

    private String filePath;

    private String downloadUrl;

    private String contentMarkdown;

    private String contentHtml;

    private Date releaseTime;

    private String brief;

    private String coverImage;

    private String[] images;

    private Integer wordCount;

    private Integer readerCount;

    private Integer likes;

    private Integer dislikes;

    private Integer collectionCount;

    private Integer downloadCount;

    private Integer commentCount;

    private List<ReleasedPlatform> releasedPlatforms;

    private Integer referencedCount;

    private Integer score;

    private String language;

    private String[] tags;

    private String[] classifications;

    private Short type;

    private List<Cite> cites;

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

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
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

    public String[] getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }


    public List<ReleasedPlatform> getReleasedPlatforms() {
        return releasedPlatforms;
    }

    public void setReleasedPlatforms(List<ReleasedPlatform> releasedPlatforms) {
        this.releasedPlatforms = releasedPlatforms;
    }

    public List<Cite> getCites() {
        return cites;
    }

    public void setCites(List<Cite> cites) {
        this.cites = cites;
    }

    public static class ReleasedPlatform {
        private String platform;
        private String platformUrl;
        private String postUrl;

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getPlatformUrl() {
            return platformUrl;
        }

        public void setPlatformUrl(String platformUrl) {
            this.platformUrl = platformUrl;
        }

        public String getPostUrl() {
            return postUrl;
        }

        public void setPostUrl(String postUrl) {
            this.postUrl = postUrl;
        }
    }

    public static class Cite {
        private String author;
        private String articleName;
        private String source;
        private String url;
        private Date releaseTime;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getArticleName() {
            return articleName;
        }

        public void setArticleName(String articleName) {
            this.articleName = articleName;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Date getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(Date releaseTime) {
            this.releaseTime = releaseTime;
        }
    }
}
