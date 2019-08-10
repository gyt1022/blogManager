package com.guo.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogBlacklistExample() {
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlacklistIdIsNull() {
            addCriterion("blacklist_id is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdIsNotNull() {
            addCriterion("blacklist_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdEqualTo(String value) {
            addCriterion("blacklist_id =", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotEqualTo(String value) {
            addCriterion("blacklist_id <>", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdGreaterThan(String value) {
            addCriterion("blacklist_id >", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdGreaterThanOrEqualTo(String value) {
            addCriterion("blacklist_id >=", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdLessThan(String value) {
            addCriterion("blacklist_id <", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdLessThanOrEqualTo(String value) {
            addCriterion("blacklist_id <=", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdLike(String value) {
            addCriterion("blacklist_id like", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotLike(String value) {
            addCriterion("blacklist_id not like", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdIn(List<String> values) {
            addCriterion("blacklist_id in", values, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotIn(List<String> values) {
            addCriterion("blacklist_id not in", values, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdBetween(String value1, String value2) {
            addCriterion("blacklist_id between", value1, value2, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotBetween(String value1, String value2) {
            addCriterion("blacklist_id not between", value1, value2, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdIsNull() {
            addCriterion("bloguser_id is null");
            return (Criteria) this;
        }

        public Criteria andBloguserIdIsNotNull() {
            addCriterion("bloguser_id is not null");
            return (Criteria) this;
        }

        public Criteria andBloguserIdEqualTo(String value) {
            addCriterion("bloguser_id =", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdNotEqualTo(String value) {
            addCriterion("bloguser_id <>", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdGreaterThan(String value) {
            addCriterion("bloguser_id >", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdGreaterThanOrEqualTo(String value) {
            addCriterion("bloguser_id >=", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdLessThan(String value) {
            addCriterion("bloguser_id <", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdLessThanOrEqualTo(String value) {
            addCriterion("bloguser_id <=", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdLike(String value) {
            addCriterion("bloguser_id like", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdNotLike(String value) {
            addCriterion("bloguser_id not like", value, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdIn(List<String> values) {
            addCriterion("bloguser_id in", values, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdNotIn(List<String> values) {
            addCriterion("bloguser_id not in", values, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdBetween(String value1, String value2) {
            addCriterion("bloguser_id between", value1, value2, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andBloguserIdNotBetween(String value1, String value2) {
            addCriterion("bloguser_id not between", value1, value2, "bloguserId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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