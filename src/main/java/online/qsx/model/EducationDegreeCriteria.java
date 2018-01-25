package online.qsx.model;

import java.util.ArrayList;
import java.util.List;

public class EducationDegreeCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public EducationDegreeCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
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
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andTAboutMeIdIsNull() {
            addCriterion("t_about_me_id is null");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdIsNotNull() {
            addCriterion("t_about_me_id is not null");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdEqualTo(Integer value) {
            addCriterion("t_about_me_id =", value, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdNotEqualTo(Integer value) {
            addCriterion("t_about_me_id <>", value, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdGreaterThan(Integer value) {
            addCriterion("t_about_me_id >", value, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_about_me_id >=", value, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdLessThan(Integer value) {
            addCriterion("t_about_me_id <", value, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_about_me_id <=", value, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdIn(List<Integer> values) {
            addCriterion("t_about_me_id in", values, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdNotIn(List<Integer> values) {
            addCriterion("t_about_me_id not in", values, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdBetween(Integer value1, Integer value2) {
            addCriterion("t_about_me_id between", value1, value2, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andTAboutMeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_about_me_id not between", value1, value2, "tAboutMeId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("Date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("Date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andVocationalIsNull() {
            addCriterion("vocational is null");
            return (Criteria) this;
        }

        public Criteria andVocationalIsNotNull() {
            addCriterion("vocational is not null");
            return (Criteria) this;
        }

        public Criteria andVocationalEqualTo(String value) {
            addCriterion("vocational =", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalNotEqualTo(String value) {
            addCriterion("vocational <>", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalGreaterThan(String value) {
            addCriterion("vocational >", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalGreaterThanOrEqualTo(String value) {
            addCriterion("vocational >=", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalLessThan(String value) {
            addCriterion("vocational <", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalLessThanOrEqualTo(String value) {
            addCriterion("vocational <=", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalLike(String value) {
            addCriterion("vocational like", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalNotLike(String value) {
            addCriterion("vocational not like", value, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalIn(List<String> values) {
            addCriterion("vocational in", values, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalNotIn(List<String> values) {
            addCriterion("vocational not in", values, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalBetween(String value1, String value2) {
            addCriterion("vocational between", value1, value2, "vocational");
            return (Criteria) this;
        }

        public Criteria andVocationalNotBetween(String value1, String value2) {
            addCriterion("vocational not between", value1, value2, "vocational");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_education_degree
     *
     * @mbggenerated do_not_delete_during_merge Wed Jan 24 10:11:36 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_education_degree
     *
     * @mbggenerated Wed Jan 24 10:11:36 CST 2018
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