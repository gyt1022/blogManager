package com.guo.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogUserExample() {
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

        public Criteria andBloguserNameIsNull() {
            addCriterion("bloguser_name is null");
            return (Criteria) this;
        }

        public Criteria andBloguserNameIsNotNull() {
            addCriterion("bloguser_name is not null");
            return (Criteria) this;
        }

        public Criteria andBloguserNameEqualTo(String value) {
            addCriterion("bloguser_name =", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameNotEqualTo(String value) {
            addCriterion("bloguser_name <>", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameGreaterThan(String value) {
            addCriterion("bloguser_name >", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameGreaterThanOrEqualTo(String value) {
            addCriterion("bloguser_name >=", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameLessThan(String value) {
            addCriterion("bloguser_name <", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameLessThanOrEqualTo(String value) {
            addCriterion("bloguser_name <=", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameLike(String value) {
            addCriterion("bloguser_name like", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameNotLike(String value) {
            addCriterion("bloguser_name not like", value, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameIn(List<String> values) {
            addCriterion("bloguser_name in", values, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameNotIn(List<String> values) {
            addCriterion("bloguser_name not in", values, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameBetween(String value1, String value2) {
            addCriterion("bloguser_name between", value1, value2, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserNameNotBetween(String value1, String value2) {
            addCriterion("bloguser_name not between", value1, value2, "bloguserName");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneIsNull() {
            addCriterion("bloguser_phone is null");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneIsNotNull() {
            addCriterion("bloguser_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneEqualTo(String value) {
            addCriterion("bloguser_phone =", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneNotEqualTo(String value) {
            addCriterion("bloguser_phone <>", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneGreaterThan(String value) {
            addCriterion("bloguser_phone >", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bloguser_phone >=", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneLessThan(String value) {
            addCriterion("bloguser_phone <", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneLessThanOrEqualTo(String value) {
            addCriterion("bloguser_phone <=", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneLike(String value) {
            addCriterion("bloguser_phone like", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneNotLike(String value) {
            addCriterion("bloguser_phone not like", value, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneIn(List<String> values) {
            addCriterion("bloguser_phone in", values, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneNotIn(List<String> values) {
            addCriterion("bloguser_phone not in", values, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneBetween(String value1, String value2) {
            addCriterion("bloguser_phone between", value1, value2, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPhoneNotBetween(String value1, String value2) {
            addCriterion("bloguser_phone not between", value1, value2, "bloguserPhone");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordIsNull() {
            addCriterion("bloguser_password is null");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordIsNotNull() {
            addCriterion("bloguser_password is not null");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordEqualTo(String value) {
            addCriterion("bloguser_password =", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordNotEqualTo(String value) {
            addCriterion("bloguser_password <>", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordGreaterThan(String value) {
            addCriterion("bloguser_password >", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("bloguser_password >=", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordLessThan(String value) {
            addCriterion("bloguser_password <", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordLessThanOrEqualTo(String value) {
            addCriterion("bloguser_password <=", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordLike(String value) {
            addCriterion("bloguser_password like", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordNotLike(String value) {
            addCriterion("bloguser_password not like", value, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordIn(List<String> values) {
            addCriterion("bloguser_password in", values, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordNotIn(List<String> values) {
            addCriterion("bloguser_password not in", values, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordBetween(String value1, String value2) {
            addCriterion("bloguser_password between", value1, value2, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserPasswordNotBetween(String value1, String value2) {
            addCriterion("bloguser_password not between", value1, value2, "bloguserPassword");
            return (Criteria) this;
        }

        public Criteria andBloguserStateIsNull() {
            addCriterion("bloguser_state is null");
            return (Criteria) this;
        }

        public Criteria andBloguserStateIsNotNull() {
            addCriterion("bloguser_state is not null");
            return (Criteria) this;
        }

        public Criteria andBloguserStateEqualTo(String value) {
            addCriterion("bloguser_state =", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateNotEqualTo(String value) {
            addCriterion("bloguser_state <>", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateGreaterThan(String value) {
            addCriterion("bloguser_state >", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateGreaterThanOrEqualTo(String value) {
            addCriterion("bloguser_state >=", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateLessThan(String value) {
            addCriterion("bloguser_state <", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateLessThanOrEqualTo(String value) {
            addCriterion("bloguser_state <=", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateLike(String value) {
            addCriterion("bloguser_state like", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateNotLike(String value) {
            addCriterion("bloguser_state not like", value, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateIn(List<String> values) {
            addCriterion("bloguser_state in", values, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateNotIn(List<String> values) {
            addCriterion("bloguser_state not in", values, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateBetween(String value1, String value2) {
            addCriterion("bloguser_state between", value1, value2, "bloguserState");
            return (Criteria) this;
        }

        public Criteria andBloguserStateNotBetween(String value1, String value2) {
            addCriterion("bloguser_state not between", value1, value2, "bloguserState");
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