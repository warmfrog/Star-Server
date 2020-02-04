package com.warmfrog.star.dao.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SoftwareCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareCriteria() {
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
        protected List<Criterion> screenshotsCriteria;

        protected List<Criterion> tagsCriteria;

        protected List<Criterion> classificationsCriteria;

        protected List<Criterion> distPlatformsCriteria;

        protected List<Criterion> downloadLinksCriteria;

        protected List<Criterion> tutorialsCriteria;

        protected List<Criterion> historiesCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            screenshotsCriteria = new ArrayList<Criterion>();
            tagsCriteria = new ArrayList<Criterion>();
            classificationsCriteria = new ArrayList<Criterion>();
            distPlatformsCriteria = new ArrayList<Criterion>();
            downloadLinksCriteria = new ArrayList<Criterion>();
            tutorialsCriteria = new ArrayList<Criterion>();
            historiesCriteria = new ArrayList<Criterion>();
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

        public List<Criterion> getTutorialsCriteria() {
            return tutorialsCriteria;
        }

        protected void addTutorialsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            tutorialsCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addTutorialsCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            tutorialsCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getHistoriesCriteria() {
            return historiesCriteria;
        }

        protected void addHistoriesCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            historiesCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addHistoriesCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            historiesCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || screenshotsCriteria.size() > 0
                || tagsCriteria.size() > 0
                || classificationsCriteria.size() > 0
                || distPlatformsCriteria.size() > 0
                || downloadLinksCriteria.size() > 0
                || tutorialsCriteria.size() > 0
                || historiesCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(screenshotsCriteria);
                allCriteria.addAll(tagsCriteria);
                allCriteria.addAll(classificationsCriteria);
                allCriteria.addAll(distPlatformsCriteria);
                allCriteria.addAll(downloadLinksCriteria);
                allCriteria.addAll(tutorialsCriteria);
                allCriteria.addAll(historiesCriteria);
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

        public Criteria andSoftwareNameIsNull() {
            addCriterion("software_name is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameIsNotNull() {
            addCriterion("software_name is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameEqualTo(String value) {
            addCriterion("software_name =", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameNotEqualTo(String value) {
            addCriterion("software_name <>", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameGreaterThan(String value) {
            addCriterion("software_name >", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameGreaterThanOrEqualTo(String value) {
            addCriterion("software_name >=", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameLessThan(String value) {
            addCriterion("software_name <", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameLessThanOrEqualTo(String value) {
            addCriterion("software_name <=", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameLike(String value) {
            addCriterion("software_name like", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameNotLike(String value) {
            addCriterion("software_name not like", value, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameIn(List<String> values) {
            addCriterion("software_name in", values, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameNotIn(List<String> values) {
            addCriterion("software_name not in", values, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameBetween(String value1, String value2) {
            addCriterion("software_name between", value1, value2, "softwareName");
            return (Criteria) this;
        }

        public Criteria andSoftwareNameNotBetween(String value1, String value2) {
            addCriterion("software_name not between", value1, value2, "softwareName");
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

        public Criteria andMd5IsNull() {
            addCriterion("md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteIsNull() {
            addCriterion("official_site is null");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteIsNotNull() {
            addCriterion("official_site is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteEqualTo(String value) {
            addCriterion("official_site =", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotEqualTo(String value) {
            addCriterion("official_site <>", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteGreaterThan(String value) {
            addCriterion("official_site >", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteGreaterThanOrEqualTo(String value) {
            addCriterion("official_site >=", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteLessThan(String value) {
            addCriterion("official_site <", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteLessThanOrEqualTo(String value) {
            addCriterion("official_site <=", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteLike(String value) {
            addCriterion("official_site like", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotLike(String value) {
            addCriterion("official_site not like", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteIn(List<String> values) {
            addCriterion("official_site in", values, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotIn(List<String> values) {
            addCriterion("official_site not in", values, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteBetween(String value1, String value2) {
            addCriterion("official_site between", value1, value2, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotBetween(String value1, String value2) {
            addCriterion("official_site not between", value1, value2, "officialSite");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
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

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(Short value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(Short value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(Short value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(Short value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(Short value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(Short value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<Short> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<Short> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(Short value1, Short value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(Short value1, Short value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andDislikesIsNull() {
            addCriterion("dislikes is null");
            return (Criteria) this;
        }

        public Criteria andDislikesIsNotNull() {
            addCriterion("dislikes is not null");
            return (Criteria) this;
        }

        public Criteria andDislikesEqualTo(Short value) {
            addCriterion("dislikes =", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesNotEqualTo(Short value) {
            addCriterion("dislikes <>", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesGreaterThan(Short value) {
            addCriterion("dislikes >", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesGreaterThanOrEqualTo(Short value) {
            addCriterion("dislikes >=", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesLessThan(Short value) {
            addCriterion("dislikes <", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesLessThanOrEqualTo(Short value) {
            addCriterion("dislikes <=", value, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesIn(List<Short> values) {
            addCriterion("dislikes in", values, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesNotIn(List<Short> values) {
            addCriterion("dislikes not in", values, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesBetween(Short value1, Short value2) {
            addCriterion("dislikes between", value1, value2, "dislikes");
            return (Criteria) this;
        }

        public Criteria andDislikesNotBetween(Short value1, Short value2) {
            addCriterion("dislikes not between", value1, value2, "dislikes");
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

        public Criteria andDownloadLinkIsNull() {
            addCriterion("download_link is null");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkIsNotNull() {
            addCriterion("download_link is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkEqualTo(String value) {
            addCriterion("download_link =", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotEqualTo(String value) {
            addCriterion("download_link <>", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkGreaterThan(String value) {
            addCriterion("download_link >", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkGreaterThanOrEqualTo(String value) {
            addCriterion("download_link >=", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkLessThan(String value) {
            addCriterion("download_link <", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkLessThanOrEqualTo(String value) {
            addCriterion("download_link <=", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkLike(String value) {
            addCriterion("download_link like", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotLike(String value) {
            addCriterion("download_link not like", value, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkIn(List<String> values) {
            addCriterion("download_link in", values, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotIn(List<String> values) {
            addCriterion("download_link not in", values, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkBetween(String value1, String value2) {
            addCriterion("download_link between", value1, value2, "downloadLink");
            return (Criteria) this;
        }

        public Criteria andDownloadLinkNotBetween(String value1, String value2) {
            addCriterion("download_link not between", value1, value2, "downloadLink");
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

        public Criteria andTutorialsIsNull() {
            addCriterion("tutorials is null");
            return (Criteria) this;
        }

        public Criteria andTutorialsIsNotNull() {
            addCriterion("tutorials is not null");
            return (Criteria) this;
        }

        public Criteria andTutorialsEqualTo(Object value) {
            addTutorialsCriterion("tutorials =", value, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsNotEqualTo(Object value) {
            addTutorialsCriterion("tutorials <>", value, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsGreaterThan(Object value) {
            addTutorialsCriterion("tutorials >", value, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsGreaterThanOrEqualTo(Object value) {
            addTutorialsCriterion("tutorials >=", value, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsLessThan(Object value) {
            addTutorialsCriterion("tutorials <", value, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsLessThanOrEqualTo(Object value) {
            addTutorialsCriterion("tutorials <=", value, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsIn(List<Object> values) {
            addTutorialsCriterion("tutorials in", values, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsNotIn(List<Object> values) {
            addTutorialsCriterion("tutorials not in", values, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsBetween(Object value1, Object value2) {
            addTutorialsCriterion("tutorials between", value1, value2, "tutorials");
            return (Criteria) this;
        }

        public Criteria andTutorialsNotBetween(Object value1, Object value2) {
            addTutorialsCriterion("tutorials not between", value1, value2, "tutorials");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andHistoriesIsNull() {
            addCriterion("histories is null");
            return (Criteria) this;
        }

        public Criteria andHistoriesIsNotNull() {
            addCriterion("histories is not null");
            return (Criteria) this;
        }

        public Criteria andHistoriesEqualTo(Object value) {
            addHistoriesCriterion("histories =", value, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesNotEqualTo(Object value) {
            addHistoriesCriterion("histories <>", value, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesGreaterThan(Object value) {
            addHistoriesCriterion("histories >", value, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesGreaterThanOrEqualTo(Object value) {
            addHistoriesCriterion("histories >=", value, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesLessThan(Object value) {
            addHistoriesCriterion("histories <", value, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesLessThanOrEqualTo(Object value) {
            addHistoriesCriterion("histories <=", value, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesIn(List<Object> values) {
            addHistoriesCriterion("histories in", values, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesNotIn(List<Object> values) {
            addHistoriesCriterion("histories not in", values, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesBetween(Object value1, Object value2) {
            addHistoriesCriterion("histories between", value1, value2, "histories");
            return (Criteria) this;
        }

        public Criteria andHistoriesNotBetween(Object value1, Object value2) {
            addHistoriesCriterion("histories not between", value1, value2, "histories");
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