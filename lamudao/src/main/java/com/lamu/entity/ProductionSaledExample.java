package com.lamu.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductionSaledExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public ProductionSaledExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andSaledIsNull() {
            addCriterion("saled is null");
            return (Criteria) this;
        }

        public Criteria andSaledIsNotNull() {
            addCriterion("saled is not null");
            return (Criteria) this;
        }

        public Criteria andSaledEqualTo(Integer value) {
            addCriterion("saled =", value, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledNotEqualTo(Integer value) {
            addCriterion("saled <>", value, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledGreaterThan(Integer value) {
            addCriterion("saled >", value, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledGreaterThanOrEqualTo(Integer value) {
            addCriterion("saled >=", value, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledLessThan(Integer value) {
            addCriterion("saled <", value, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledLessThanOrEqualTo(Integer value) {
            addCriterion("saled <=", value, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledIn(List<Integer> values) {
            addCriterion("saled in", values, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledNotIn(List<Integer> values) {
            addCriterion("saled not in", values, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledBetween(Integer value1, Integer value2) {
            addCriterion("saled between", value1, value2, "saled");
            return (Criteria) this;
        }

        public Criteria andSaledNotBetween(Integer value1, Integer value2) {
            addCriterion("saled not between", value1, value2, "saled");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andProductionIdIsNull() {
            addCriterion("production_id is null");
            return (Criteria) this;
        }

        public Criteria andProductionIdIsNotNull() {
            addCriterion("production_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductionIdEqualTo(String value) {
            addCriterion("production_id =", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotEqualTo(String value) {
            addCriterion("production_id <>", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdGreaterThan(String value) {
            addCriterion("production_id >", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdGreaterThanOrEqualTo(String value) {
            addCriterion("production_id >=", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdLessThan(String value) {
            addCriterion("production_id <", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdLessThanOrEqualTo(String value) {
            addCriterion("production_id <=", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdLike(String value) {
            addCriterion("production_id like", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotLike(String value) {
            addCriterion("production_id not like", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdIn(List<String> values) {
            addCriterion("production_id in", values, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotIn(List<String> values) {
            addCriterion("production_id not in", values, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdBetween(String value1, String value2) {
            addCriterion("production_id between", value1, value2, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotBetween(String value1, String value2) {
            addCriterion("production_id not between", value1, value2, "productionId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table production_saled
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table production_saled
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }

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
    }
}