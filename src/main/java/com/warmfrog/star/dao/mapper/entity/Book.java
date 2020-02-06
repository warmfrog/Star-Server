package com.warmfrog.star.dao.mapper.entity;

import java.util.Date;

public class Book {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Short deleteFlag;

    private String title;

    private String subtitle;

    private Object version;

    private String isbn;

    private Object author;

    private Object translators;

    private String producer;

    private String thumbnail;

    private Object coverImages;

    private Short hasPaper;

    private Short hasEbook;

    private String bookDesign;

    private String publisher;

    private Date publishDate;

    private Integer pages;

    private String price;

    private String language;

    private String brief;

    private Object catalog;

    private String score;

    private Object tags;

    private Object classifications;

    private Object downloadLinks;

    private Object paperPurchaseLinks;

    private Object ebookPurchaseLinks;

    private Object douban;

    private Integer readCount;

    private Integer readingCount;

    private Integer wantReadCount;

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Object getAuthor() {
        return author;
    }

    public void setAuthor(Object author) {
        this.author = author;
    }

    public Object getTranslators() {
        return translators;
    }

    public void setTranslators(Object translators) {
        this.translators = translators;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Object getCoverImages() {
        return coverImages;
    }

    public void setCoverImages(Object coverImages) {
        this.coverImages = coverImages;
    }

    public Short getHasPaper() {
        return hasPaper;
    }

    public void setHasPaper(Short hasPaper) {
        this.hasPaper = hasPaper;
    }

    public Short getHasEbook() {
        return hasEbook;
    }

    public void setHasEbook(Short hasEbook) {
        this.hasEbook = hasEbook;
    }

    public String getBookDesign() {
        return bookDesign;
    }

    public void setBookDesign(String bookDesign) {
        this.bookDesign = bookDesign;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Object getCatalog() {
        return catalog;
    }

    public void setCatalog(Object catalog) {
        this.catalog = catalog;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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

    public Object getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(Object downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public Object getPaperPurchaseLinks() {
        return paperPurchaseLinks;
    }

    public void setPaperPurchaseLinks(Object paperPurchaseLinks) {
        this.paperPurchaseLinks = paperPurchaseLinks;
    }

    public Object getEbookPurchaseLinks() {
        return ebookPurchaseLinks;
    }

    public void setEbookPurchaseLinks(Object ebookPurchaseLinks) {
        this.ebookPurchaseLinks = ebookPurchaseLinks;
    }

    public Object getDouban() {
        return douban;
    }

    public void setDouban(Object douban) {
        this.douban = douban;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getReadingCount() {
        return readingCount;
    }

    public void setReadingCount(Integer readingCount) {
        this.readingCount = readingCount;
    }

    public Integer getWantReadCount() {
        return wantReadCount;
    }

    public void setWantReadCount(Integer wantReadCount) {
        this.wantReadCount = wantReadCount;
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
        Book other = (Book) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
                && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
                && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
                && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
                && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
                && (this.getTranslators() == null ? other.getTranslators() == null : this.getTranslators().equals(other.getTranslators()))
                && (this.getProducer() == null ? other.getProducer() == null : this.getProducer().equals(other.getProducer()))
                && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
                && (this.getCoverImages() == null ? other.getCoverImages() == null : this.getCoverImages().equals(other.getCoverImages()))
                && (this.getHasPaper() == null ? other.getHasPaper() == null : this.getHasPaper().equals(other.getHasPaper()))
            && (this.getHasEbook() == null ? other.getHasEbook() == null : this.getHasEbook().equals(other.getHasEbook()))
            && (this.getBookDesign() == null ? other.getBookDesign() == null : this.getBookDesign().equals(other.getBookDesign()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getPublishDate() == null ? other.getPublishDate() == null : this.getPublishDate().equals(other.getPublishDate()))
            && (this.getPages() == null ? other.getPages() == null : this.getPages().equals(other.getPages()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getCatalog() == null ? other.getCatalog() == null : this.getCatalog().equals(other.getCatalog()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getClassifications() == null ? other.getClassifications() == null : this.getClassifications().equals(other.getClassifications()))
            && (this.getDownloadLinks() == null ? other.getDownloadLinks() == null : this.getDownloadLinks().equals(other.getDownloadLinks()))
            && (this.getPaperPurchaseLinks() == null ? other.getPaperPurchaseLinks() == null : this.getPaperPurchaseLinks().equals(other.getPaperPurchaseLinks()))
            && (this.getEbookPurchaseLinks() == null ? other.getEbookPurchaseLinks() == null : this.getEbookPurchaseLinks().equals(other.getEbookPurchaseLinks()))
            && (this.getDouban() == null ? other.getDouban() == null : this.getDouban().equals(other.getDouban()))
            && (this.getReadCount() == null ? other.getReadCount() == null : this.getReadCount().equals(other.getReadCount()))
            && (this.getReadingCount() == null ? other.getReadingCount() == null : this.getReadingCount().equals(other.getReadingCount()))
            && (this.getWantReadCount() == null ? other.getWantReadCount() == null : this.getWantReadCount().equals(other.getWantReadCount()));
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
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getTranslators() == null) ? 0 : getTranslators().hashCode());
        result = prime * result + ((getProducer() == null) ? 0 : getProducer().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getCoverImages() == null) ? 0 : getCoverImages().hashCode());
        result = prime * result + ((getHasPaper() == null) ? 0 : getHasPaper().hashCode());
        result = prime * result + ((getHasEbook() == null) ? 0 : getHasEbook().hashCode());
        result = prime * result + ((getBookDesign() == null) ? 0 : getBookDesign().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getPublishDate() == null) ? 0 : getPublishDate().hashCode());
        result = prime * result + ((getPages() == null) ? 0 : getPages().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getClassifications() == null) ? 0 : getClassifications().hashCode());
        result = prime * result + ((getDownloadLinks() == null) ? 0 : getDownloadLinks().hashCode());
        result = prime * result + ((getPaperPurchaseLinks() == null) ? 0 : getPaperPurchaseLinks().hashCode());
        result = prime * result + ((getEbookPurchaseLinks() == null) ? 0 : getEbookPurchaseLinks().hashCode());
        result = prime * result + ((getDouban() == null) ? 0 : getDouban().hashCode());
        result = prime * result + ((getReadCount() == null) ? 0 : getReadCount().hashCode());
        result = prime * result + ((getReadingCount() == null) ? 0 : getReadingCount().hashCode());
        result = prime * result + ((getWantReadCount() == null) ? 0 : getWantReadCount().hashCode());
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
        sb.append(", subtitle=").append(subtitle);
        sb.append(", version=").append(version);
        sb.append(", isbn=").append(isbn);
        sb.append(", author=").append(author);
        sb.append(", translators=").append(translators);
        sb.append(", producer=").append(producer);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", coverImages=").append(coverImages);
        sb.append(", hasPaper=").append(hasPaper);
        sb.append(", hasEbook=").append(hasEbook);
        sb.append(", bookDesign=").append(bookDesign);
        sb.append(", publisher=").append(publisher);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", pages=").append(pages);
        sb.append(", price=").append(price);
        sb.append(", language=").append(language);
        sb.append(", brief=").append(brief);
        sb.append(", catalog=").append(catalog);
        sb.append(", score=").append(score);
        sb.append(", tags=").append(tags);
        sb.append(", classifications=").append(classifications);
        sb.append(", downloadLinks=").append(downloadLinks);
        sb.append(", paperPurchaseLinks=").append(paperPurchaseLinks);
        sb.append(", ebookPurchaseLinks=").append(ebookPurchaseLinks);
        sb.append(", douban=").append(douban);
        sb.append(", readCount=").append(readCount);
        sb.append(", readingCount=").append(readingCount);
        sb.append(", wantReadCount=").append(wantReadCount);
        sb.append("]");
        return sb.toString();
    }
}