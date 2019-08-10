package com.guo.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogBlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogBlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
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

        public Criteria andBlogstateIsNull() {
            addCriterion("blogstate is null");
            return (Criteria) this;
        }

        public Criteria andBlogstateIsNotNull() {
            addCriterion("blogstate is not null");
            return (Criteria) this;
        }

        public Criteria andBlogstateEqualTo(String value) {
            addCriterion("blogstate =", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateNotEqualTo(String value) {
            addCriterion("blogstate <>", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateGreaterThan(String value) {
            addCriterion("blogstate >", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateGreaterThanOrEqualTo(String value) {
            addCriterion("blogstate >=", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateLessThan(String value) {
            addCriterion("blogstate <", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateLessThanOrEqualTo(String value) {
            addCriterion("blogstate <=", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateLike(String value) {
            addCriterion("blogstate like", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateNotLike(String value) {
            addCriterion("blogstate not like", value, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateIn(List<String> values) {
            addCriterion("blogstate in", values, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateNotIn(List<String> values) {
            addCriterion("blogstate not in", values, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateBetween(String value1, String value2) {
            addCriterion("blogstate between", value1, value2, "blogstate");
            return (Criteria) this;
        }

        public Criteria andBlogstateNotBetween(String value1, String value2) {
            addCriterion("blogstate not between", value1, value2, "blogstate");
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