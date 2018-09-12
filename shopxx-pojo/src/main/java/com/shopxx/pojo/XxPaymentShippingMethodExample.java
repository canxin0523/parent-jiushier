package com.shopxx.pojo;
import java.util.ArrayList;
import java.util.List;

public class XxPaymentShippingMethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxPaymentShippingMethodExample() {
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

        public Criteria andPaymentMethodsIsNull() {
            addCriterion("payment_methods is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsIsNotNull() {
            addCriterion("payment_methods is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsEqualTo(Long value) {
            addCriterion("payment_methods =", value, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsNotEqualTo(Long value) {
            addCriterion("payment_methods <>", value, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsGreaterThan(Long value) {
            addCriterion("payment_methods >", value, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_methods >=", value, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsLessThan(Long value) {
            addCriterion("payment_methods <", value, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsLessThanOrEqualTo(Long value) {
            addCriterion("payment_methods <=", value, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsIn(List<Long> values) {
            addCriterion("payment_methods in", values, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsNotIn(List<Long> values) {
            addCriterion("payment_methods not in", values, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsBetween(Long value1, Long value2) {
            addCriterion("payment_methods between", value1, value2, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodsNotBetween(Long value1, Long value2) {
            addCriterion("payment_methods not between", value1, value2, "paymentMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsIsNull() {
            addCriterion("shipping_methods is null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsIsNotNull() {
            addCriterion("shipping_methods is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsEqualTo(Long value) {
            addCriterion("shipping_methods =", value, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsNotEqualTo(Long value) {
            addCriterion("shipping_methods <>", value, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsGreaterThan(Long value) {
            addCriterion("shipping_methods >", value, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsGreaterThanOrEqualTo(Long value) {
            addCriterion("shipping_methods >=", value, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsLessThan(Long value) {
            addCriterion("shipping_methods <", value, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsLessThanOrEqualTo(Long value) {
            addCriterion("shipping_methods <=", value, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsIn(List<Long> values) {
            addCriterion("shipping_methods in", values, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsNotIn(List<Long> values) {
            addCriterion("shipping_methods not in", values, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsBetween(Long value1, Long value2) {
            addCriterion("shipping_methods between", value1, value2, "shippingMethods");
            return (Criteria) this;
        }

        public Criteria andShippingMethodsNotBetween(Long value1, Long value2) {
            addCriterion("shipping_methods not between", value1, value2, "shippingMethods");
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