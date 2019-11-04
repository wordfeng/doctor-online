package cn.ojbkfeng.bean;

import java.util.ArrayList;
import java.util.List;

public class DrugsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugsExample() {
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

        public Criteria andMedicineIsNull() {
            addCriterion("medicine is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIsNotNull() {
            addCriterion("medicine is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineEqualTo(String value) {
            addCriterion("medicine =", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotEqualTo(String value) {
            addCriterion("medicine <>", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineGreaterThan(String value) {
            addCriterion("medicine >", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineGreaterThanOrEqualTo(String value) {
            addCriterion("medicine >=", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLessThan(String value) {
            addCriterion("medicine <", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLessThanOrEqualTo(String value) {
            addCriterion("medicine <=", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLike(String value) {
            addCriterion("medicine like", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotLike(String value) {
            addCriterion("medicine not like", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineIn(List<String> values) {
            addCriterion("medicine in", values, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotIn(List<String> values) {
            addCriterion("medicine not in", values, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineBetween(String value1, String value2) {
            addCriterion("medicine between", value1, value2, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotBetween(String value1, String value2) {
            addCriterion("medicine not between", value1, value2, "medicine");
            return (Criteria) this;
        }

        public Criteria andGuigeIsNull() {
            addCriterion("guige is null");
            return (Criteria) this;
        }

        public Criteria andGuigeIsNotNull() {
            addCriterion("guige is not null");
            return (Criteria) this;
        }

        public Criteria andGuigeEqualTo(String value) {
            addCriterion("guige =", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotEqualTo(String value) {
            addCriterion("guige <>", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeGreaterThan(String value) {
            addCriterion("guige >", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("guige >=", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLessThan(String value) {
            addCriterion("guige <", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLessThanOrEqualTo(String value) {
            addCriterion("guige <=", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLike(String value) {
            addCriterion("guige like", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotLike(String value) {
            addCriterion("guige not like", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeIn(List<String> values) {
            addCriterion("guige in", values, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotIn(List<String> values) {
            addCriterion("guige not in", values, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeBetween(String value1, String value2) {
            addCriterion("guige between", value1, value2, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotBetween(String value1, String value2) {
            addCriterion("guige not between", value1, value2, "guige");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNull() {
            addCriterion("shuliang is null");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNotNull() {
            addCriterion("shuliang is not null");
            return (Criteria) this;
        }

        public Criteria andShuliangEqualTo(Integer value) {
            addCriterion("shuliang =", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotEqualTo(Integer value) {
            addCriterion("shuliang <>", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThan(Integer value) {
            addCriterion("shuliang >", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuliang >=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThan(Integer value) {
            addCriterion("shuliang <", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThanOrEqualTo(Integer value) {
            addCriterion("shuliang <=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangIn(List<Integer> values) {
            addCriterion("shuliang in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotIn(List<Integer> values) {
            addCriterion("shuliang not in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangBetween(Integer value1, Integer value2) {
            addCriterion("shuliang between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotBetween(Integer value1, Integer value2) {
            addCriterion("shuliang not between", value1, value2, "shuliang");
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