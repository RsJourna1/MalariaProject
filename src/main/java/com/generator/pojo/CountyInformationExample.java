package com.generator.pojo;

import java.util.ArrayList;
import java.util.List;

public class CountyInformationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table county_information
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table county_information
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table county_information
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public CountyInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
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
     * This method corresponds to the database table county_information
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
     * This method corresponds to the database table county_information
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county_information
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
     * This class corresponds to the database table county_information
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

        public Criteria andCountydistrictIsNull() {
            addCriterion("countyDistrict is null");
            return (Criteria) this;
        }

        public Criteria andCountydistrictIsNotNull() {
            addCriterion("countyDistrict is not null");
            return (Criteria) this;
        }

        public Criteria andCountydistrictEqualTo(String value) {
            addCriterion("countyDistrict =", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictNotEqualTo(String value) {
            addCriterion("countyDistrict <>", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictGreaterThan(String value) {
            addCriterion("countyDistrict >", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictGreaterThanOrEqualTo(String value) {
            addCriterion("countyDistrict >=", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictLessThan(String value) {
            addCriterion("countyDistrict <", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictLessThanOrEqualTo(String value) {
            addCriterion("countyDistrict <=", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictLike(String value) {
            addCriterion("countyDistrict like", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictNotLike(String value) {
            addCriterion("countyDistrict not like", value, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictIn(List<String> values) {
            addCriterion("countyDistrict in", values, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictNotIn(List<String> values) {
            addCriterion("countyDistrict not in", values, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictBetween(String value1, String value2) {
            addCriterion("countyDistrict between", value1, value2, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andCountydistrictNotBetween(String value1, String value2) {
            addCriterion("countyDistrict not between", value1, value2, "countydistrict");
            return (Criteria) this;
        }

        public Criteria andIdprefectureIsNull() {
            addCriterion("idPrefecture is null");
            return (Criteria) this;
        }

        public Criteria andIdprefectureIsNotNull() {
            addCriterion("idPrefecture is not null");
            return (Criteria) this;
        }

        public Criteria andIdprefectureEqualTo(Integer value) {
            addCriterion("idPrefecture =", value, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureNotEqualTo(Integer value) {
            addCriterion("idPrefecture <>", value, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureGreaterThan(Integer value) {
            addCriterion("idPrefecture >", value, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureGreaterThanOrEqualTo(Integer value) {
            addCriterion("idPrefecture >=", value, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureLessThan(Integer value) {
            addCriterion("idPrefecture <", value, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureLessThanOrEqualTo(Integer value) {
            addCriterion("idPrefecture <=", value, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureIn(List<Integer> values) {
            addCriterion("idPrefecture in", values, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureNotIn(List<Integer> values) {
            addCriterion("idPrefecture not in", values, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureBetween(Integer value1, Integer value2) {
            addCriterion("idPrefecture between", value1, value2, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andIdprefectureNotBetween(Integer value1, Integer value2) {
            addCriterion("idPrefecture not between", value1, value2, "idprefecture");
            return (Criteria) this;
        }

        public Criteria andDatainputyearIsNull() {
            addCriterion("dataInputYear is null");
            return (Criteria) this;
        }

        public Criteria andDatainputyearIsNotNull() {
            addCriterion("dataInputYear is not null");
            return (Criteria) this;
        }

        public Criteria andDatainputyearEqualTo(Integer value) {
            addCriterion("dataInputYear =", value, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearNotEqualTo(Integer value) {
            addCriterion("dataInputYear <>", value, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearGreaterThan(Integer value) {
            addCriterion("dataInputYear >", value, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataInputYear >=", value, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearLessThan(Integer value) {
            addCriterion("dataInputYear <", value, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearLessThanOrEqualTo(Integer value) {
            addCriterion("dataInputYear <=", value, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearIn(List<Integer> values) {
            addCriterion("dataInputYear in", values, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearNotIn(List<Integer> values) {
            addCriterion("dataInputYear not in", values, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearBetween(Integer value1, Integer value2) {
            addCriterion("dataInputYear between", value1, value2, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andDatainputyearNotBetween(Integer value1, Integer value2) {
            addCriterion("dataInputYear not between", value1, value2, "datainputyear");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksIsNull() {
            addCriterion("numOutbreaks is null");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksIsNotNull() {
            addCriterion("numOutbreaks is not null");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksEqualTo(Integer value) {
            addCriterion("numOutbreaks =", value, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksNotEqualTo(Integer value) {
            addCriterion("numOutbreaks <>", value, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksGreaterThan(Integer value) {
            addCriterion("numOutbreaks >", value, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOutbreaks >=", value, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksLessThan(Integer value) {
            addCriterion("numOutbreaks <", value, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksLessThanOrEqualTo(Integer value) {
            addCriterion("numOutbreaks <=", value, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksIn(List<Integer> values) {
            addCriterion("numOutbreaks in", values, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksNotIn(List<Integer> values) {
            addCriterion("numOutbreaks not in", values, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksBetween(Integer value1, Integer value2) {
            addCriterion("numOutbreaks between", value1, value2, "numoutbreaks");
            return (Criteria) this;
        }

        public Criteria andNumoutbreaksNotBetween(Integer value1, Integer value2) {
            addCriterion("numOutbreaks not between", value1, value2, "numoutbreaks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table county_information
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
     * This class corresponds to the database table county_information
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