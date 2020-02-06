package com.warmfrog.star.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @author libo
 * @date 2020/2/5
 */
public class BookDto extends PageDto {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String title;

    private String subtitle;

    private VersionDto version;

    private String isbn;

    private Author author;

    private List<Author> translators;

    private String producer;

    private String thumbnail;

    private String[] coverImages;

    private Short hasPaper;

    private Short hasEbook;

    private String bookDesign;

    private String publisher;

    private Date publishDate;

    private Integer pages;

    private String price;

    private String language;

    private String brief;

    private String[] catalog;

    private String score;

    private String[] tags;

    private String[] classifications;

    private List<DownloadLink> downloadLinks;

    private List<PurchaseLink> paperPurchaseLinks;

    private List<PurchaseLink> ebookPurchaseLinks;

    private Douban douban;

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

    public VersionDto getVersion() {
        return version;
    }

    public void setVersion(VersionDto version) {
        this.version = version;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Author> getTranslators() {
        return translators;
    }

    public void setTranslators(List<Author> translators) {
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

    public String[] getCoverImages() {
        return coverImages;
    }

    public void setCoverImages(String[] coverImages) {
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

    public String[] getCatalog() {
        return catalog;
    }

    public void setCatalog(String[] catalog) {
        this.catalog = catalog;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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

    public List<DownloadLink> getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(List<DownloadLink> downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public List<PurchaseLink> getPaperPurchaseLinks() {
        return paperPurchaseLinks;
    }

    public void setPaperPurchaseLinks(List<PurchaseLink> paperPurchaseLinks) {
        this.paperPurchaseLinks = paperPurchaseLinks;
    }

    public List<PurchaseLink> getEbookPurchaseLinks() {
        return ebookPurchaseLinks;
    }

    public void setEbookPurchaseLinks(List<PurchaseLink> ebookPurchaseLinks) {
        this.ebookPurchaseLinks = ebookPurchaseLinks;
    }

    public Douban getDouban() {
        return douban;
    }

    public void setDouban(Douban douban) {
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
}
