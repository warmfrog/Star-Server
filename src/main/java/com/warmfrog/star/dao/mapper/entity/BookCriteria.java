package com.warmfrog.star.dao.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> versionCriteria;

        protected List<Criterion> authorCriteria;

        protected List<Criterion> translatorsCriteria;

        protected List<Criterion> coverImagesCriteria;

        protected List<Criterion> catalogCriteria;

        protected List<Criterion> tagsCriteria;

        protected List<Criterion> classificationsCriteria;

        protected List<Criterion> downloadLinksCriteria;

        protected List<Criterion> paperPurchaseLinksCriteria;

        protected List<Criterion> ebookPurchaseLinksCriteria;

        protected List<Criterion> doubanCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            versionCriteria = new ArrayList<Criterion>();
            authorCriteria = new ArrayList<Criterion>();
            translatorsCriteria = new ArrayList<Criterion>();
            coverImagesCriteria = new ArrayList<Criterion>();
            catalogCriteria = new ArrayList<Criterion>();
            tagsCriteria = new ArrayList<Criterion>();
            classificationsCriteria = new ArrayList<Criterion>();
            downloadLinksCriteria = new ArrayList<Criterion>();
            paperPurchaseLinksCriteria = new ArrayList<Criterion>();
            ebookPurchaseLinksCriteria = new ArrayList<Criterion>();
            doubanCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getVersionCriteria() {
            return versionCriteria;
        }

        protected void addVersionCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            versionCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addVersionCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            versionCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getAuthorCriteria() {
            return authorCriteria;
        }

        protected void addAuthorCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            authorCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addAuthorCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            authorCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getTranslatorsCriteria() {
            return translatorsCriteria;
        }

        protected void addTranslatorsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            translatorsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addTranslatorsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            translatorsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getCoverImagesCriteria() {
            return coverImagesCriteria;
        }

        protected void addCoverImagesCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            coverImagesCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addCoverImagesCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            coverImagesCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getCatalogCriteria() {
            return catalogCriteria;
        }

        protected void addCatalogCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            catalogCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addCatalogCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            catalogCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getTagsCriteria() {
            return tagsCriteria;
        }

        protected void addTagsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            tagsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addTagsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            tagsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getClassificationsCriteria() {
            return classificationsCriteria;
        }

        protected void addClassificationsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            classificationsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addClassificationsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            classificationsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getDownloadLinksCriteria() {
            return downloadLinksCriteria;
        }

        protected void addDownloadLinksCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            downloadLinksCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addDownloadLinksCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            downloadLinksCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getPaperPurchaseLinksCriteria() {
            return paperPurchaseLinksCriteria;
        }

        protected void addPaperPurchaseLinksCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            paperPurchaseLinksCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addPaperPurchaseLinksCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            paperPurchaseLinksCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getEbookPurchaseLinksCriteria() {
            return ebookPurchaseLinksCriteria;
        }

        protected void addEbookPurchaseLinksCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            ebookPurchaseLinksCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addEbookPurchaseLinksCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            ebookPurchaseLinksCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getDoubanCriteria() {
            return doubanCriteria;
        }

        protected void addDoubanCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            doubanCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addDoubanCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            doubanCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || versionCriteria.size() > 0
                || authorCriteria.size() > 0
                || translatorsCriteria.size() > 0
                || coverImagesCriteria.size() > 0
                || catalogCriteria.size() > 0
                || tagsCriteria.size() > 0
                || classificationsCriteria.size() > 0
                || downloadLinksCriteria.size() > 0
                || paperPurchaseLinksCriteria.size() > 0
                || ebookPurchaseLinksCriteria.size() > 0
                || doubanCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(versionCriteria);
                allCriteria.addAll(authorCriteria);
                allCriteria.addAll(translatorsCriteria);
                allCriteria.addAll(coverImagesCriteria);
                allCriteria.addAll(catalogCriteria);
                allCriteria.addAll(tagsCriteria);
                allCriteria.addAll(classificationsCriteria);
                allCriteria.addAll(downloadLinksCriteria);
                allCriteria.addAll(paperPurchaseLinksCriteria);
                allCriteria.addAll(ebookPurchaseLinksCriteria);
                allCriteria.addAll(doubanCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Short value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Short value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Short value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Short value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Short value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Short> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Short> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Short value1, Short value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Short value1, Short value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Object value) {
            addVersionCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Object value) {
            addVersionCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Object value) {
            addVersionCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Object value) {
            addVersionCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Object value) {
            addVersionCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Object value) {
            addVersionCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Object> values) {
            addVersionCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Object> values) {
            addVersionCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Object value1, Object value2) {
            addVersionCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Object value1, Object value2) {
            addVersionCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(Object value) {
            addAuthorCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(Object value) {
            addAuthorCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(Object value) {
            addAuthorCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(Object value) {
            addAuthorCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(Object value) {
            addAuthorCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(Object value) {
            addAuthorCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<Object> values) {
            addAuthorCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<Object> values) {
            addAuthorCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(Object value1, Object value2) {
            addAuthorCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(Object value1, Object value2) {
            addAuthorCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andTranslatorsIsNull() {
            addCriterion("translators is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorsIsNotNull() {
            addCriterion("translators is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorsEqualTo(Object value) {
            addTranslatorsCriterion("translators =", value, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsNotEqualTo(Object value) {
            addTranslatorsCriterion("translators <>", value, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsGreaterThan(Object value) {
            addTranslatorsCriterion("translators >", value, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsGreaterThanOrEqualTo(Object value) {
            addTranslatorsCriterion("translators >=", value, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsLessThan(Object value) {
            addTranslatorsCriterion("translators <", value, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsLessThanOrEqualTo(Object value) {
            addTranslatorsCriterion("translators <=", value, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsIn(List<Object> values) {
            addTranslatorsCriterion("translators in", values, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsNotIn(List<Object> values) {
            addTranslatorsCriterion("translators not in", values, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsBetween(Object value1, Object value2) {
            addTranslatorsCriterion("translators between", value1, value2, "translators");
            return (Criteria) this;
        }

        public Criteria andTranslatorsNotBetween(Object value1, Object value2) {
            addTranslatorsCriterion("translators not between", value1, value2, "translators");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("producer is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("producer is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("producer =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("producer <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("producer >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("producer >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("producer <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("producer <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("producer like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("producer not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("producer in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("producer not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("producer between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("producer not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andCoverImagesIsNull() {
            addCriterion("cover_images is null");
            return (Criteria) this;
        }

        public Criteria andCoverImagesIsNotNull() {
            addCriterion("cover_images is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImagesEqualTo(Object value) {
            addCoverImagesCriterion("cover_images =", value, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesNotEqualTo(Object value) {
            addCoverImagesCriterion("cover_images <>", value, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesGreaterThan(Object value) {
            addCoverImagesCriterion("cover_images >", value, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesGreaterThanOrEqualTo(Object value) {
            addCoverImagesCriterion("cover_images >=", value, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesLessThan(Object value) {
            addCoverImagesCriterion("cover_images <", value, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesLessThanOrEqualTo(Object value) {
            addCoverImagesCriterion("cover_images <=", value, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesIn(List<Object> values) {
            addCoverImagesCriterion("cover_images in", values, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesNotIn(List<Object> values) {
            addCoverImagesCriterion("cover_images not in", values, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesBetween(Object value1, Object value2) {
            addCoverImagesCriterion("cover_images between", value1, value2, "coverImages");
            return (Criteria) this;
        }

        public Criteria andCoverImagesNotBetween(Object value1, Object value2) {
            addCoverImagesCriterion("cover_images not between", value1, value2, "coverImages");
            return (Criteria) this;
        }

        public Criteria andHasPaperIsNull() {
            addCriterion("has_paper is null");
            return (Criteria) this;
        }

        public Criteria andHasPaperIsNotNull() {
            addCriterion("has_paper is not null");
            return (Criteria) this;
        }

        public Criteria andHasPaperEqualTo(Short value) {
            addCriterion("has_paper =", value, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperNotEqualTo(Short value) {
            addCriterion("has_paper <>", value, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperGreaterThan(Short value) {
            addCriterion("has_paper >", value, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperGreaterThanOrEqualTo(Short value) {
            addCriterion("has_paper >=", value, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperLessThan(Short value) {
            addCriterion("has_paper <", value, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperLessThanOrEqualTo(Short value) {
            addCriterion("has_paper <=", value, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperIn(List<Short> values) {
            addCriterion("has_paper in", values, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperNotIn(List<Short> values) {
            addCriterion("has_paper not in", values, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperBetween(Short value1, Short value2) {
            addCriterion("has_paper between", value1, value2, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasPaperNotBetween(Short value1, Short value2) {
            addCriterion("has_paper not between", value1, value2, "hasPaper");
            return (Criteria) this;
        }

        public Criteria andHasEbookIsNull() {
            addCriterion("has_ebook is null");
            return (Criteria) this;
        }

        public Criteria andHasEbookIsNotNull() {
            addCriterion("has_ebook is not null");
            return (Criteria) this;
        }

        public Criteria andHasEbookEqualTo(Short value) {
            addCriterion("has_ebook =", value, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookNotEqualTo(Short value) {
            addCriterion("has_ebook <>", value, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookGreaterThan(Short value) {
            addCriterion("has_ebook >", value, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookGreaterThanOrEqualTo(Short value) {
            addCriterion("has_ebook >=", value, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookLessThan(Short value) {
            addCriterion("has_ebook <", value, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookLessThanOrEqualTo(Short value) {
            addCriterion("has_ebook <=", value, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookIn(List<Short> values) {
            addCriterion("has_ebook in", values, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookNotIn(List<Short> values) {
            addCriterion("has_ebook not in", values, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookBetween(Short value1, Short value2) {
            addCriterion("has_ebook between", value1, value2, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andHasEbookNotBetween(Short value1, Short value2) {
            addCriterion("has_ebook not between", value1, value2, "hasEbook");
            return (Criteria) this;
        }

        public Criteria andBookDesignIsNull() {
            addCriterion("book_design is null");
            return (Criteria) this;
        }

        public Criteria andBookDesignIsNotNull() {
            addCriterion("book_design is not null");
            return (Criteria) this;
        }

        public Criteria andBookDesignEqualTo(String value) {
            addCriterion("book_design =", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignNotEqualTo(String value) {
            addCriterion("book_design <>", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignGreaterThan(String value) {
            addCriterion("book_design >", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignGreaterThanOrEqualTo(String value) {
            addCriterion("book_design >=", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignLessThan(String value) {
            addCriterion("book_design <", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignLessThanOrEqualTo(String value) {
            addCriterion("book_design <=", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignLike(String value) {
            addCriterion("book_design like", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignNotLike(String value) {
            addCriterion("book_design not like", value, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignIn(List<String> values) {
            addCriterion("book_design in", values, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignNotIn(List<String> values) {
            addCriterion("book_design not in", values, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignBetween(String value1, String value2) {
            addCriterion("book_design between", value1, value2, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andBookDesignNotBetween(String value1, String value2) {
            addCriterion("book_design not between", value1, value2, "bookDesign");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(Object value) {
            addCatalogCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(Object value) {
            addCatalogCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(Object value) {
            addCatalogCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(Object value) {
            addCatalogCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(Object value) {
            addCatalogCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(Object value) {
            addCatalogCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<Object> values) {
            addCatalogCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<Object> values) {
            addCatalogCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(Object value1, Object value2) {
            addCatalogCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(Object value1, Object value2) {
            addCatalogCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(Object value) {
            addTagsCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(Object value) {
            addTagsCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(Object value) {
            addTagsCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(Object value) {
            addTagsCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(Object value) {
            addTagsCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(Object value) {
            addTagsCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<Object> values) {
            addTagsCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<Object> values) {
            addTagsCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(Object value1, Object value2) {
            addTagsCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(Object value1, Object value2) {
            addTagsCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andClassificationsIsNull() {
            addCriterion("classifications is null");
            return (Criteria) this;
        }

        public Criteria andClassificationsIsNotNull() {
            addCriterion("classifications is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationsEqualTo(Object value) {
            addClassificationsCriterion("classifications =", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotEqualTo(Object value) {
            addClassificationsCriterion("classifications <>", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsGreaterThan(Object value) {
            addClassificationsCriterion("classifications >", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsGreaterThanOrEqualTo(Object value) {
            addClassificationsCriterion("classifications >=", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLessThan(Object value) {
            addClassificationsCriterion("classifications <", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLessThanOrEqualTo(Object value) {
            addClassificationsCriterion("classifications <=", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsIn(List<Object> values) {
            addClassificationsCriterion("classifications in", values, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotIn(List<Object> values) {
            addClassificationsCriterion("classifications not in", values, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsBetween(Object value1, Object value2) {
            addClassificationsCriterion("classifications between", value1, value2, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotBetween(Object value1, Object value2) {
            addClassificationsCriterion("classifications not between", value1, value2, "classifications");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksIsNull() {
            addCriterion("download_links is null");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksIsNotNull() {
            addCriterion("download_links is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksEqualTo(Object value) {
            addDownloadLinksCriterion("download_links =", value, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksNotEqualTo(Object value) {
            addDownloadLinksCriterion("download_links <>", value, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksGreaterThan(Object value) {
            addDownloadLinksCriterion("download_links >", value, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksGreaterThanOrEqualTo(Object value) {
            addDownloadLinksCriterion("download_links >=", value, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksLessThan(Object value) {
            addDownloadLinksCriterion("download_links <", value, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksLessThanOrEqualTo(Object value) {
            addDownloadLinksCriterion("download_links <=", value, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksIn(List<Object> values) {
            addDownloadLinksCriterion("download_links in", values, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksNotIn(List<Object> values) {
            addDownloadLinksCriterion("download_links not in", values, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksBetween(Object value1, Object value2) {
            addDownloadLinksCriterion("download_links between", value1, value2, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andDownloadLinksNotBetween(Object value1, Object value2) {
            addDownloadLinksCriterion("download_links not between", value1, value2, "downloadLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksIsNull() {
            addCriterion("paper_purchase_links is null");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksIsNotNull() {
            addCriterion("paper_purchase_links is not null");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksEqualTo(Object value) {
            addPaperPurchaseLinksCriterion("paper_purchase_links =", value, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksNotEqualTo(Object value) {
            addPaperPurchaseLinksCriterion("paper_purchase_links <>", value, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksGreaterThan(Object value) {
            addPaperPurchaseLinksCriterion("paper_purchase_links >", value, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksGreaterThanOrEqualTo(Object value) {
            addPaperPurchaseLinksCriterion("paper_purchase_links >=", value, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksLessThan(Object value) {
            addPaperPurchaseLinksCriterion("paper_purchase_links <", value, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksLessThanOrEqualTo(Object value) {
            addPaperPurchaseLinksCriterion("paper_purchase_links <=", value, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksIn(List<Object> values) {
            addPaperPurchaseLinksCriterion("paper_purchase_links in", values, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksNotIn(List<Object> values) {
            addPaperPurchaseLinksCriterion("paper_purchase_links not in", values, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksBetween(Object value1, Object value2) {
            addPaperPurchaseLinksCriterion("paper_purchase_links between", value1, value2, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andPaperPurchaseLinksNotBetween(Object value1, Object value2) {
            addPaperPurchaseLinksCriterion("paper_purchase_links not between", value1, value2, "paperPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksIsNull() {
            addCriterion("ebook_purchase_links is null");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksIsNotNull() {
            addCriterion("ebook_purchase_links is not null");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksEqualTo(Object value) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links =", value, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksNotEqualTo(Object value) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links <>", value, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksGreaterThan(Object value) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links >", value, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksGreaterThanOrEqualTo(Object value) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links >=", value, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksLessThan(Object value) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links <", value, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksLessThanOrEqualTo(Object value) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links <=", value, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksIn(List<Object> values) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links in", values, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksNotIn(List<Object> values) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links not in", values, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksBetween(Object value1, Object value2) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links between", value1, value2, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andEbookPurchaseLinksNotBetween(Object value1, Object value2) {
            addEbookPurchaseLinksCriterion("ebook_purchase_links not between", value1, value2, "ebookPurchaseLinks");
            return (Criteria) this;
        }

        public Criteria andDoubanIsNull() {
            addCriterion("douban is null");
            return (Criteria) this;
        }

        public Criteria andDoubanIsNotNull() {
            addCriterion("douban is not null");
            return (Criteria) this;
        }

        public Criteria andDoubanEqualTo(Object value) {
            addDoubanCriterion("douban =", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotEqualTo(Object value) {
            addDoubanCriterion("douban <>", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanGreaterThan(Object value) {
            addDoubanCriterion("douban >", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanGreaterThanOrEqualTo(Object value) {
            addDoubanCriterion("douban >=", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanLessThan(Object value) {
            addDoubanCriterion("douban <", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanLessThanOrEqualTo(Object value) {
            addDoubanCriterion("douban <=", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanIn(List<Object> values) {
            addDoubanCriterion("douban in", values, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotIn(List<Object> values) {
            addDoubanCriterion("douban not in", values, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanBetween(Object value1, Object value2) {
            addDoubanCriterion("douban between", value1, value2, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotBetween(Object value1, Object value2) {
            addDoubanCriterion("douban not between", value1, value2, "douban");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountIsNull() {
            addCriterion("reading_count is null");
            return (Criteria) this;
        }

        public Criteria andReadingCountIsNotNull() {
            addCriterion("reading_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadingCountEqualTo(Integer value) {
            addCriterion("reading_count =", value, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountNotEqualTo(Integer value) {
            addCriterion("reading_count <>", value, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountGreaterThan(Integer value) {
            addCriterion("reading_count >", value, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reading_count >=", value, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountLessThan(Integer value) {
            addCriterion("reading_count <", value, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountLessThanOrEqualTo(Integer value) {
            addCriterion("reading_count <=", value, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountIn(List<Integer> values) {
            addCriterion("reading_count in", values, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountNotIn(List<Integer> values) {
            addCriterion("reading_count not in", values, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountBetween(Integer value1, Integer value2) {
            addCriterion("reading_count between", value1, value2, "readingCount");
            return (Criteria) this;
        }

        public Criteria andReadingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reading_count not between", value1, value2, "readingCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountIsNull() {
            addCriterion("want_read_count is null");
            return (Criteria) this;
        }

        public Criteria andWantReadCountIsNotNull() {
            addCriterion("want_read_count is not null");
            return (Criteria) this;
        }

        public Criteria andWantReadCountEqualTo(Integer value) {
            addCriterion("want_read_count =", value, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountNotEqualTo(Integer value) {
            addCriterion("want_read_count <>", value, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountGreaterThan(Integer value) {
            addCriterion("want_read_count >", value, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("want_read_count >=", value, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountLessThan(Integer value) {
            addCriterion("want_read_count <", value, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("want_read_count <=", value, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountIn(List<Integer> values) {
            addCriterion("want_read_count in", values, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountNotIn(List<Integer> values) {
            addCriterion("want_read_count not in", values, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountBetween(Integer value1, Integer value2) {
            addCriterion("want_read_count between", value1, value2, "wantReadCount");
            return (Criteria) this;
        }

        public Criteria andWantReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("want_read_count not between", value1, value2, "wantReadCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}