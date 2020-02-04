package com.warmfrog.star.dao.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieCriteria() {
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
        protected List<Criterion> tagsCriteria;

        protected List<Criterion> classificationsCriteria;

        protected List<Criterion> leadingRolesCriteria;

        protected List<Criterion> screenwritersCriteria;

        protected List<Criterion> madeinCriteria;

        protected List<Criterion> showingDateCriteria;

        protected List<Criterion> languagesCriteria;

        protected List<Criterion> downloadLinksCriteria;

        protected List<Criterion> playLinksCriteria;

        protected List<Criterion> doubanCriteria;

        protected List<Criterion> imdbCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            tagsCriteria = new ArrayList<Criterion>();
            classificationsCriteria = new ArrayList<Criterion>();
            leadingRolesCriteria = new ArrayList<Criterion>();
            screenwritersCriteria = new ArrayList<Criterion>();
            madeinCriteria = new ArrayList<Criterion>();
            showingDateCriteria = new ArrayList<Criterion>();
            languagesCriteria = new ArrayList<Criterion>();
            downloadLinksCriteria = new ArrayList<Criterion>();
            playLinksCriteria = new ArrayList<Criterion>();
            doubanCriteria = new ArrayList<Criterion>();
            imdbCriteria = new ArrayList<Criterion>();
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

        public List<Criterion> getLeadingRolesCriteria() {
            return leadingRolesCriteria;
        }

        protected void addLeadingRolesCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            leadingRolesCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addLeadingRolesCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            leadingRolesCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getScreenwritersCriteria() {
            return screenwritersCriteria;
        }

        protected void addScreenwritersCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            screenwritersCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addScreenwritersCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            screenwritersCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getMadeinCriteria() {
            return madeinCriteria;
        }

        protected void addMadeinCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            madeinCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addMadeinCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            madeinCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getShowingDateCriteria() {
            return showingDateCriteria;
        }

        protected void addShowingDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            showingDateCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addShowingDateCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            showingDateCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getLanguagesCriteria() {
            return languagesCriteria;
        }

        protected void addLanguagesCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            languagesCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addLanguagesCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            languagesCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.ArrayTypeHandler"));
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

        public List<Criterion> getPlayLinksCriteria() {
            return playLinksCriteria;
        }

        protected void addPlayLinksCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            playLinksCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addPlayLinksCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            playLinksCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
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

        public List<Criterion> getImdbCriteria() {
            return imdbCriteria;
        }

        protected void addImdbCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            imdbCriteria.add(new Criterion(condition, value, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        protected void addImdbCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            imdbCriteria.add(new Criterion(condition, value1, value2, "com.warmfrog.star.dao.handler.JsonTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || tagsCriteria.size() > 0
                || classificationsCriteria.size() > 0
                || leadingRolesCriteria.size() > 0
                || screenwritersCriteria.size() > 0
                || madeinCriteria.size() > 0
                || showingDateCriteria.size() > 0
                || languagesCriteria.size() > 0
                || downloadLinksCriteria.size() > 0
                || playLinksCriteria.size() > 0
                || doubanCriteria.size() > 0
                || imdbCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(tagsCriteria);
                allCriteria.addAll(classificationsCriteria);
                allCriteria.addAll(leadingRolesCriteria);
                allCriteria.addAll(screenwritersCriteria);
                allCriteria.addAll(madeinCriteria);
                allCriteria.addAll(showingDateCriteria);
                allCriteria.addAll(languagesCriteria);
                allCriteria.addAll(downloadLinksCriteria);
                allCriteria.addAll(playLinksCriteria);
                allCriteria.addAll(doubanCriteria);
                allCriteria.addAll(imdbCriteria);
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
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

        public Criteria andScreenshotsIsNull() {
            addCriterion("screenshots is null");
            return (Criteria) this;
        }

        public Criteria andScreenshotsIsNotNull() {
            addCriterion("screenshots is not null");
            return (Criteria) this;
        }

        public Criteria andScreenshotsEqualTo(Object value) {
            addCriterion("screenshots =", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsNotEqualTo(Object value) {
            addCriterion("screenshots <>", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsGreaterThan(Object value) {
            addCriterion("screenshots >", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsGreaterThanOrEqualTo(Object value) {
            addCriterion("screenshots >=", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsLessThan(Object value) {
            addCriterion("screenshots <", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsLessThanOrEqualTo(Object value) {
            addCriterion("screenshots <=", value, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsIn(List<Object> values) {
            addCriterion("screenshots in", values, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsNotIn(List<Object> values) {
            addCriterion("screenshots not in", values, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsBetween(Object value1, Object value2) {
            addCriterion("screenshots between", value1, value2, "screenshots");
            return (Criteria) this;
        }

        public Criteria andScreenshotsNotBetween(Object value1, Object value2) {
            addCriterion("screenshots not between", value1, value2, "screenshots");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
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

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesIsNull() {
            addCriterion("leading_roles is null");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesIsNotNull() {
            addCriterion("leading_roles is not null");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesEqualTo(Object value) {
            addLeadingRolesCriterion("leading_roles =", value, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesNotEqualTo(Object value) {
            addLeadingRolesCriterion("leading_roles <>", value, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesGreaterThan(Object value) {
            addLeadingRolesCriterion("leading_roles >", value, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesGreaterThanOrEqualTo(Object value) {
            addLeadingRolesCriterion("leading_roles >=", value, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesLessThan(Object value) {
            addLeadingRolesCriterion("leading_roles <", value, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesLessThanOrEqualTo(Object value) {
            addLeadingRolesCriterion("leading_roles <=", value, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesIn(List<Object> values) {
            addLeadingRolesCriterion("leading_roles in", values, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesNotIn(List<Object> values) {
            addLeadingRolesCriterion("leading_roles not in", values, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesBetween(Object value1, Object value2) {
            addLeadingRolesCriterion("leading_roles between", value1, value2, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andLeadingRolesNotBetween(Object value1, Object value2) {
            addLeadingRolesCriterion("leading_roles not between", value1, value2, "leadingRoles");
            return (Criteria) this;
        }

        public Criteria andScreenwritersIsNull() {
            addCriterion("screenwriters is null");
            return (Criteria) this;
        }

        public Criteria andScreenwritersIsNotNull() {
            addCriterion("screenwriters is not null");
            return (Criteria) this;
        }

        public Criteria andScreenwritersEqualTo(Object value) {
            addScreenwritersCriterion("screenwriters =", value, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersNotEqualTo(Object value) {
            addScreenwritersCriterion("screenwriters <>", value, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersGreaterThan(Object value) {
            addScreenwritersCriterion("screenwriters >", value, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersGreaterThanOrEqualTo(Object value) {
            addScreenwritersCriterion("screenwriters >=", value, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersLessThan(Object value) {
            addScreenwritersCriterion("screenwriters <", value, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersLessThanOrEqualTo(Object value) {
            addScreenwritersCriterion("screenwriters <=", value, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersIn(List<Object> values) {
            addScreenwritersCriterion("screenwriters in", values, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersNotIn(List<Object> values) {
            addScreenwritersCriterion("screenwriters not in", values, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersBetween(Object value1, Object value2) {
            addScreenwritersCriterion("screenwriters between", value1, value2, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andScreenwritersNotBetween(Object value1, Object value2) {
            addScreenwritersCriterion("screenwriters not between", value1, value2, "screenwriters");
            return (Criteria) this;
        }

        public Criteria andMadeinIsNull() {
            addCriterion("madein is null");
            return (Criteria) this;
        }

        public Criteria andMadeinIsNotNull() {
            addCriterion("madein is not null");
            return (Criteria) this;
        }

        public Criteria andMadeinEqualTo(Object value) {
            addMadeinCriterion("madein =", value, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinNotEqualTo(Object value) {
            addMadeinCriterion("madein <>", value, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinGreaterThan(Object value) {
            addMadeinCriterion("madein >", value, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinGreaterThanOrEqualTo(Object value) {
            addMadeinCriterion("madein >=", value, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinLessThan(Object value) {
            addMadeinCriterion("madein <", value, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinLessThanOrEqualTo(Object value) {
            addMadeinCriterion("madein <=", value, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinIn(List<Object> values) {
            addMadeinCriterion("madein in", values, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinNotIn(List<Object> values) {
            addMadeinCriterion("madein not in", values, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinBetween(Object value1, Object value2) {
            addMadeinCriterion("madein between", value1, value2, "madein");
            return (Criteria) this;
        }

        public Criteria andMadeinNotBetween(Object value1, Object value2) {
            addMadeinCriterion("madein not between", value1, value2, "madein");
            return (Criteria) this;
        }

        public Criteria andShowingDateIsNull() {
            addCriterion("showing_date is null");
            return (Criteria) this;
        }

        public Criteria andShowingDateIsNotNull() {
            addCriterion("showing_date is not null");
            return (Criteria) this;
        }

        public Criteria andShowingDateEqualTo(Object value) {
            addShowingDateCriterion("showing_date =", value, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateNotEqualTo(Object value) {
            addShowingDateCriterion("showing_date <>", value, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateGreaterThan(Object value) {
            addShowingDateCriterion("showing_date >", value, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateGreaterThanOrEqualTo(Object value) {
            addShowingDateCriterion("showing_date >=", value, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateLessThan(Object value) {
            addShowingDateCriterion("showing_date <", value, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateLessThanOrEqualTo(Object value) {
            addShowingDateCriterion("showing_date <=", value, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateIn(List<Object> values) {
            addShowingDateCriterion("showing_date in", values, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateNotIn(List<Object> values) {
            addShowingDateCriterion("showing_date not in", values, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateBetween(Object value1, Object value2) {
            addShowingDateCriterion("showing_date between", value1, value2, "showingDate");
            return (Criteria) this;
        }

        public Criteria andShowingDateNotBetween(Object value1, Object value2) {
            addShowingDateCriterion("showing_date not between", value1, value2, "showingDate");
            return (Criteria) this;
        }

        public Criteria andLanguagesIsNull() {
            addCriterion("languages is null");
            return (Criteria) this;
        }

        public Criteria andLanguagesIsNotNull() {
            addCriterion("languages is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagesEqualTo(Object value) {
            addLanguagesCriterion("languages =", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotEqualTo(Object value) {
            addLanguagesCriterion("languages <>", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesGreaterThan(Object value) {
            addLanguagesCriterion("languages >", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesGreaterThanOrEqualTo(Object value) {
            addLanguagesCriterion("languages >=", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLessThan(Object value) {
            addLanguagesCriterion("languages <", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLessThanOrEqualTo(Object value) {
            addLanguagesCriterion("languages <=", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesIn(List<Object> values) {
            addLanguagesCriterion("languages in", values, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotIn(List<Object> values) {
            addLanguagesCriterion("languages not in", values, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesBetween(Object value1, Object value2) {
            addLanguagesCriterion("languages between", value1, value2, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotBetween(Object value1, Object value2) {
            addLanguagesCriterion("languages not between", value1, value2, "languages");
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

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Long value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Long value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Long value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Long value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Long value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Long> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Long> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Long value1, Long value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Long value1, Long value2) {
            addCriterion("length not between", value1, value2, "length");
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

        public Criteria andPlayLinksIsNull() {
            addCriterion("play_links is null");
            return (Criteria) this;
        }

        public Criteria andPlayLinksIsNotNull() {
            addCriterion("play_links is not null");
            return (Criteria) this;
        }

        public Criteria andPlayLinksEqualTo(Object value) {
            addPlayLinksCriterion("play_links =", value, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksNotEqualTo(Object value) {
            addPlayLinksCriterion("play_links <>", value, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksGreaterThan(Object value) {
            addPlayLinksCriterion("play_links >", value, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksGreaterThanOrEqualTo(Object value) {
            addPlayLinksCriterion("play_links >=", value, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksLessThan(Object value) {
            addPlayLinksCriterion("play_links <", value, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksLessThanOrEqualTo(Object value) {
            addPlayLinksCriterion("play_links <=", value, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksIn(List<Object> values) {
            addPlayLinksCriterion("play_links in", values, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksNotIn(List<Object> values) {
            addPlayLinksCriterion("play_links not in", values, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksBetween(Object value1, Object value2) {
            addPlayLinksCriterion("play_links between", value1, value2, "playLinks");
            return (Criteria) this;
        }

        public Criteria andPlayLinksNotBetween(Object value1, Object value2) {
            addPlayLinksCriterion("play_links not between", value1, value2, "playLinks");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
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

        public Criteria andImdbIsNull() {
            addCriterion("imdb is null");
            return (Criteria) this;
        }

        public Criteria andImdbIsNotNull() {
            addCriterion("imdb is not null");
            return (Criteria) this;
        }

        public Criteria andImdbEqualTo(Object value) {
            addImdbCriterion("imdb =", value, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbNotEqualTo(Object value) {
            addImdbCriterion("imdb <>", value, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbGreaterThan(Object value) {
            addImdbCriterion("imdb >", value, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbGreaterThanOrEqualTo(Object value) {
            addImdbCriterion("imdb >=", value, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbLessThan(Object value) {
            addImdbCriterion("imdb <", value, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbLessThanOrEqualTo(Object value) {
            addImdbCriterion("imdb <=", value, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbIn(List<Object> values) {
            addImdbCriterion("imdb in", values, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbNotIn(List<Object> values) {
            addImdbCriterion("imdb not in", values, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbBetween(Object value1, Object value2) {
            addImdbCriterion("imdb between", value1, value2, "imdb");
            return (Criteria) this;
        }

        public Criteria andImdbNotBetween(Object value1, Object value2) {
            addImdbCriterion("imdb not between", value1, value2, "imdb");
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