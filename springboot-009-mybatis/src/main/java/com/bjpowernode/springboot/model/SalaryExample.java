package com.bjpowernode.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class SalaryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public SalaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
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
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
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

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andLosalIsNull() {
            addCriterion("LOSAL is null");
            return (Criteria) this;
        }

        public Criteria andLosalIsNotNull() {
            addCriterion("LOSAL is not null");
            return (Criteria) this;
        }

        public Criteria andLosalEqualTo(Integer value) {
            addCriterion("LOSAL =", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotEqualTo(Integer value) {
            addCriterion("LOSAL <>", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalGreaterThan(Integer value) {
            addCriterion("LOSAL >", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOSAL >=", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalLessThan(Integer value) {
            addCriterion("LOSAL <", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalLessThanOrEqualTo(Integer value) {
            addCriterion("LOSAL <=", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalIn(List<Integer> values) {
            addCriterion("LOSAL in", values, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotIn(List<Integer> values) {
            addCriterion("LOSAL not in", values, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalBetween(Integer value1, Integer value2) {
            addCriterion("LOSAL between", value1, value2, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotBetween(Integer value1, Integer value2) {
            addCriterion("LOSAL not between", value1, value2, "losal");
            return (Criteria) this;
        }

        public Criteria andHisalIsNull() {
            addCriterion("HISAL is null");
            return (Criteria) this;
        }

        public Criteria andHisalIsNotNull() {
            addCriterion("HISAL is not null");
            return (Criteria) this;
        }

        public Criteria andHisalEqualTo(Integer value) {
            addCriterion("HISAL =", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotEqualTo(Integer value) {
            addCriterion("HISAL <>", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalGreaterThan(Integer value) {
            addCriterion("HISAL >", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalGreaterThanOrEqualTo(Integer value) {
            addCriterion("HISAL >=", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalLessThan(Integer value) {
            addCriterion("HISAL <", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalLessThanOrEqualTo(Integer value) {
            addCriterion("HISAL <=", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalIn(List<Integer> values) {
            addCriterion("HISAL in", values, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotIn(List<Integer> values) {
            addCriterion("HISAL not in", values, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalBetween(Integer value1, Integer value2) {
            addCriterion("HISAL between", value1, value2, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotBetween(Integer value1, Integer value2) {
            addCriterion("HISAL not between", value1, value2, "hisal");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SALGRADE
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 06 17:39:14 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
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