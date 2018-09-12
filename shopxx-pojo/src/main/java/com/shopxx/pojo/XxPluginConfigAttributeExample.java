package com.shopxx.pojo;

import java.util.ArrayList;
import java.util.List;

public class XxPluginConfigAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxPluginConfigAttributeExample() {
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

        public Criteria andPluginConfigIsNull() {
            addCriterion("plugin_config is null");
            return (Criteria) this;
        }

        public Criteria andPluginConfigIsNotNull() {
            addCriterion("plugin_config is not null");
            return (Criteria) this;
        }

        public Criteria andPluginConfigEqualTo(Long value) {
            addCriterion("plugin_config =", value, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigNotEqualTo(Long value) {
            addCriterion("plugin_config <>", value, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigGreaterThan(Long value) {
            addCriterion("plugin_config >", value, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigGreaterThanOrEqualTo(Long value) {
            addCriterion("plugin_config >=", value, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigLessThan(Long value) {
            addCriterion("plugin_config <", value, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigLessThanOrEqualTo(Long value) {
            addCriterion("plugin_config <=", value, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigIn(List<Long> values) {
            addCriterion("plugin_config in", values, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigNotIn(List<Long> values) {
            addCriterion("plugin_config not in", values, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigBetween(Long value1, Long value2) {
            addCriterion("plugin_config between", value1, value2, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andPluginConfigNotBetween(Long value1, Long value2) {
            addCriterion("plugin_config not between", value1, value2, "pluginConfig");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyIsNull() {
            addCriterion("attributes_key is null");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyIsNotNull() {
            addCriterion("attributes_key is not null");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyEqualTo(String value) {
            addCriterion("attributes_key =", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyNotEqualTo(String value) {
            addCriterion("attributes_key <>", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyGreaterThan(String value) {
            addCriterion("attributes_key >", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyGreaterThanOrEqualTo(String value) {
            addCriterion("attributes_key >=", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyLessThan(String value) {
            addCriterion("attributes_key <", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyLessThanOrEqualTo(String value) {
            addCriterion("attributes_key <=", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyLike(String value) {
            addCriterion("attributes_key like", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyNotLike(String value) {
            addCriterion("attributes_key not like", value, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyIn(List<String> values) {
            addCriterion("attributes_key in", values, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyNotIn(List<String> values) {
            addCriterion("attributes_key not in", values, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyBetween(String value1, String value2) {
            addCriterion("attributes_key between", value1, value2, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesKeyNotBetween(String value1, String value2) {
            addCriterion("attributes_key not between", value1, value2, "attributesKey");
            return (Criteria) this;
        }

        public Criteria andAttributesIsNull() {
            addCriterion("attributes is null");
            return (Criteria) this;
        }

        public Criteria andAttributesIsNotNull() {
            addCriterion("attributes is not null");
            return (Criteria) this;
        }

        public Criteria andAttributesEqualTo(String value) {
            addCriterion("attributes =", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesNotEqualTo(String value) {
            addCriterion("attributes <>", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesGreaterThan(String value) {
            addCriterion("attributes >", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesGreaterThanOrEqualTo(String value) {
            addCriterion("attributes >=", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesLessThan(String value) {
            addCriterion("attributes <", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesLessThanOrEqualTo(String value) {
            addCriterion("attributes <=", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesLike(String value) {
            addCriterion("attributes like", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesNotLike(String value) {
            addCriterion("attributes not like", value, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesIn(List<String> values) {
            addCriterion("attributes in", values, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesNotIn(List<String> values) {
            addCriterion("attributes not in", values, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesBetween(String value1, String value2) {
            addCriterion("attributes between", value1, value2, "attributes");
            return (Criteria) this;
        }

        public Criteria andAttributesNotBetween(String value1, String value2) {
            addCriterion("attributes not between", value1, value2, "attributes");
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