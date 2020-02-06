package com.warmfrog.star.dao.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppCriteria() {
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
        protected List<Criterion> distPlatformsCriteria;

        protected List<Criterion> classificationsCriteria;

        protected List<Criterion> tagsCriteria;

        protected List<Criterion> developersCriteria;

        protected List<Criterion> screenshotsCriteria;

        protected List<Criterion> downloadLinksCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            distPlatformsCriteria = new ArrayList<Criterion>();
            classificationsCriteria = new ArrayList<Criterion>();
            tagsCriteria = new ArrayList<Criterion>();
            developersCriteria = new ArrayList<Criterion>();
            screenshotsCriteria = new ArrayList<Criterion>();
            downloadLinksCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getDistPlatformsCriteria() {
            return distPlatformsCriteria;
        }

        protected void addDistPlatformsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            distPlatformsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addDistPlatformsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            distPlatformsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
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

        public List<Criterion> getDevelopersCriteria() {
            return developersCriteria;
        }

        protected void addDevelopersCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            developersCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addDevelopersCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            developersCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getScreenshotsCriteria() {
            return screenshotsCriteria;
        }

        protected void addScreenshotsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            screenshotsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addScreenshotsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            screenshotsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
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

        public boolean isValid() {
            return criteria.size() > 0
                || distPlatformsCriteria.size() > 0
                || classificationsCriteria.size() > 0
                || tagsCriteria.size() > 0
                || developersCriteria.size() > 0
                || screenshotsCriteria.size() > 0
                || downloadLinksCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(distPlatformsCriteria);
                allCriteria.addAll(classificationsCriteria);
                allCriteria.addAll(tagsCriteria);
                allCriteria.addAll(developersCriteria);
                allCriteria.addAll(screenshotsCriteria);
                allCriteria.addAll(downloadLinksCriteria);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsIsNull() {
            addCriterion("dist_platforms is null");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsIsNotNull() {
            addCriterion("dist_platforms is not null");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsEqualTo(Object value) {
            addDistPlatformsCriterion("dist_platforms =", value, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsNotEqualTo(Object value) {
            addDistPlatformsCriterion("dist_platforms <>", value, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsGreaterThan(Object value) {
            addDistPlatformsCriterion("dist_platforms >", value, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsGreaterThanOrEqualTo(Object value) {
            addDistPlatformsCriterion("dist_platforms >=", value, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsLessThan(Object value) {
            addDistPlatformsCriterion("dist_platforms <", value, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsLessThanOrEqualTo(Object value) {
            addDistPlatformsCriterion("dist_platforms <=", value, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsIn(List<Object> values) {
            addDistPlatformsCriterion("dist_platforms in", values, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsNotIn(List<Object> values) {
            addDistPlatformsCriterion("dist_platforms not in", values, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsBetween(Object value1, Object value2) {
            addDistPlatformsCriterion("dist_platforms between", value1, value2, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andDistPlatformsNotBetween(Object value1, Object value2) {
            addDistPlatformsCriterion("dist_platforms not between", value1, value2, "distPlatforms");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andHasAdIsNull() {
            addCriterion("has_ad is null");
            return (Criteria) this;
        }

        public Criteria andHasAdIsNotNull() {
            addCriterion("has_ad is not null");
            return (Criteria) this;
        }

        public Criteria andHasAdEqualTo(Short value) {
            addCriterion("has_ad =", value, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdNotEqualTo(Short value) {
            addCriterion("has_ad <>", value, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdGreaterThan(Short value) {
            addCriterion("has_ad >", value, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdGreaterThanOrEqualTo(Short value) {
            addCriterion("has_ad >=", value, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdLessThan(Short value) {
            addCriterion("has_ad <", value, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdLessThanOrEqualTo(Short value) {
            addCriterion("has_ad <=", value, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdIn(List<Short> values) {
            addCriterion("has_ad in", values, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdNotIn(List<Short> values) {
            addCriterion("has_ad not in", values, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdBetween(Short value1, Short value2) {
            addCriterion("has_ad between", value1, value2, "hasAd");
            return (Criteria) this;
        }

        public Criteria andHasAdNotBetween(Short value1, Short value2) {
            addCriterion("has_ad not between", value1, value2, "hasAd");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Short value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Short value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Short value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Short value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Short value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Short> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Short> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Short value1, Short value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Short value1, Short value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDevelopersIsNull() {
            addCriterion("developers is null");
            return (Criteria) this;
        }

        public Criteria andDevelopersIsNotNull() {
            addCriterion("developers is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopersEqualTo(Object value) {
            addDevelopersCriterion("developers =", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotEqualTo(Object value) {
            addDevelopersCriterion("developers <>", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersGreaterThan(Object value) {
            addDevelopersCriterion("developers >", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersGreaterThanOrEqualTo(Object value) {
            addDevelopersCriterion("developers >=", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersLessThan(Object value) {
            addDevelopersCriterion("developers <", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersLessThanOrEqualTo(Object value) {
            addDevelopersCriterion("developers <=", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersIn(List<Object> values) {
            addDevelopersCriterion("developers in", values, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotIn(List<Object> values) {
            addDevelopersCriterion("developers not in", values, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersBetween(Object value1, Object value2) {
            addDevelopersCriterion("developers between", value1, value2, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotBetween(Object value1, Object value2) {
            addDevelopersCriterion("developers not between", value1, value2, "developers");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIsNull() {
            addCriterion("free_charge is null");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIsNotNull() {
            addCriterion("free_charge is not null");
            return (Criteria) this;
        }

        public Criteria andFreeChargeEqualTo(Short value) {
            addCriterion("free_charge =", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotEqualTo(Short value) {
            addCriterion("free_charge <>", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeGreaterThan(Short value) {
            addCriterion("free_charge >", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeGreaterThanOrEqualTo(Short value) {
            addCriterion("free_charge >=", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeLessThan(Short value) {
            addCriterion("free_charge <", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeLessThanOrEqualTo(Short value) {
            addCriterion("free_charge <=", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIn(List<Short> values) {
            addCriterion("free_charge in", values, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotIn(List<Short> values) {
            addCriterion("free_charge not in", values, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeBetween(Short value1, Short value2) {
            addCriterion("free_charge between", value1, value2, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotBetween(Short value1, Short value2) {
            addCriterion("free_charge not between", value1, value2, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andOpenSourceIsNull() {
            addCriterion("open_source is null");
            return (Criteria) this;
        }

        public Criteria andOpenSourceIsNotNull() {
            addCriterion("open_source is not null");
            return (Criteria) this;
        }

        public Criteria andOpenSourceEqualTo(Short value) {
            addCriterion("open_source =", value, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceNotEqualTo(Short value) {
            addCriterion("open_source <>", value, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceGreaterThan(Short value) {
            addCriterion("open_source >", value, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("open_source >=", value, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceLessThan(Short value) {
            addCriterion("open_source <", value, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceLessThanOrEqualTo(Short value) {
            addCriterion("open_source <=", value, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceIn(List<Short> values) {
            addCriterion("open_source in", values, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceNotIn(List<Short> values) {
            addCriterion("open_source not in", values, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceBetween(Short value1, Short value2) {
            addCriterion("open_source between", value1, value2, "openSource");
            return (Criteria) this;
        }

        public Criteria andOpenSourceNotBetween(Short value1, Short value2) {
            addCriterion("open_source not between", value1, value2, "openSource");
            return (Criteria) this;
        }

        public Criteria andGitIsNull() {
            addCriterion("git is null");
            return (Criteria) this;
        }

        public Criteria andGitIsNotNull() {
            addCriterion("git is not null");
            return (Criteria) this;
        }

        public Criteria andGitEqualTo(String value) {
            addCriterion("git =", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitNotEqualTo(String value) {
            addCriterion("git <>", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitGreaterThan(String value) {
            addCriterion("git >", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitGreaterThanOrEqualTo(String value) {
            addCriterion("git >=", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitLessThan(String value) {
            addCriterion("git <", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitLessThanOrEqualTo(String value) {
            addCriterion("git <=", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitLike(String value) {
            addCriterion("git like", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitNotLike(String value) {
            addCriterion("git not like", value, "git");
            return (Criteria) this;
        }

        public Criteria andGitIn(List<String> values) {
            addCriterion("git in", values, "git");
            return (Criteria) this;
        }

        public Criteria andGitNotIn(List<String> values) {
            addCriterion("git not in", values, "git");
            return (Criteria) this;
        }

        public Criteria andGitBetween(String value1, String value2) {
            addCriterion("git between", value1, value2, "git");
            return (Criteria) this;
        }

        public Criteria andGitNotBetween(String value1, String value2) {
            addCriterion("git not between", value1, value2, "git");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andScreenshotsIsNull() {
            addCriterion("screenshots is null");
            return (Criteria) this;
        }

        public Criteria andScreenshotsIsNotNull() {
            addCriterion("screenshots is not null");
            return (Criteria) this;
        }

        public Criteria andScreenshotsEqualTo(Object value) {
            addScreenshotsCriterion("screenshots =", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsNotEqualTo(Object value) {
            addScreenshotsCriterion("screenshots <>", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsGreaterThan(Object value) {
            addScreenshotsCriterion("screenshots >", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsGreaterThanOrEqualTo(Object value) {
            addScreenshotsCriterion("screenshots >=", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsLessThan(Object value) {
            addScreenshotsCriterion("screenshots <", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsLessThanOrEqualTo(Object value) {
            addScreenshotsCriterion("screenshots <=", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsIn(List<Object> values) {
            addScreenshotsCriterion("screenshots in", values, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsNotIn(List<Object> values) {
            addScreenshotsCriterion("screenshots not in", values, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsBetween(Object value1, Object value2) {
            addScreenshotsCriterion("screenshots between", value1, value2, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsNotBetween(Object value1, Object value2) {
            addScreenshotsCriterion("screenshots not between", value1, value2, "screenshots");
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