package com.generator.pojo;

import java.util.ArrayList;
import java.util.List;

public class PostCodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table post_code
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table post_code
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table post_code
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public PostCodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
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
     * This method corresponds to the database table post_code
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
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
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
     * This class corresponds to the database table post_code
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

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(Integer value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(Integer value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(Integer value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(Integer value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(Integer value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<Integer> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<Integer> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(Integer value1, Integer value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureIsNull() {
            addCriterion("provinceCityAuPrefecture is null");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureIsNotNull() {
            addCriterion("provinceCityAuPrefecture is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureEqualTo(String value) {
            addCriterion("provinceCityAuPrefecture =", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureNotEqualTo(String value) {
            addCriterion("provinceCityAuPrefecture <>", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureGreaterThan(String value) {
            addCriterion("provinceCityAuPrefecture >", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureGreaterThanOrEqualTo(String value) {
            addCriterion("provinceCityAuPrefecture >=", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureLessThan(String value) {
            addCriterion("provinceCityAuPrefecture <", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureLessThanOrEqualTo(String value) {
            addCriterion("provinceCityAuPrefecture <=", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureLike(String value) {
            addCriterion("provinceCityAuPrefecture like", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureNotLike(String value) {
            addCriterion("provinceCityAuPrefecture not like", value, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureIn(List<String> values) {
            addCriterion("provinceCityAuPrefecture in", values, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureNotIn(List<String> values) {
            addCriterion("provinceCityAuPrefecture not in", values, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureBetween(String value1, String value2) {
            addCriterion("provinceCityAuPrefecture between", value1, value2, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andProvincecityauprefectureNotBetween(String value1, String value2) {
            addCriterion("provinceCityAuPrefecture not between", value1, value2, "provincecityauprefecture");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyIsNull() {
            addCriterion("munDistrictsCountycityCountyAuCounty is null");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyIsNotNull() {
            addCriterion("munDistrictsCountycityCountyAuCounty is not null");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyEqualTo(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty =", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyNotEqualTo(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty <>", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyGreaterThan(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty >", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyGreaterThanOrEqualTo(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty >=", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyLessThan(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty <", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyLessThanOrEqualTo(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty <=", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyLike(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty like", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyNotLike(String value) {
            addCriterion("munDistrictsCountycityCountyAuCounty not like", value, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyIn(List<String> values) {
            addCriterion("munDistrictsCountycityCountyAuCounty in", values, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyNotIn(List<String> values) {
            addCriterion("munDistrictsCountycityCountyAuCounty not in", values, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyBetween(String value1, String value2) {
            addCriterion("munDistrictsCountycityCountyAuCounty between", value1, value2, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }

        public Criteria andMundistrictscountycitycountyaucountyNotBetween(String value1, String value2) {
            addCriterion("munDistrictsCountycityCountyAuCounty not between", value1, value2, "mundistrictscountycitycountyaucounty");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table post_code
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
     * This class corresponds to the database table post_code
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