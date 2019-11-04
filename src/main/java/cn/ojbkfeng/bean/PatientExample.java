package cn.ojbkfeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andShenFenZhengIdIsNull() {
            addCriterion("shen_fen_zheng_id is null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdIsNotNull() {
            addCriterion("shen_fen_zheng_id is not null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdEqualTo(String value) {
            addCriterion("shen_fen_zheng_id =", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdNotEqualTo(String value) {
            addCriterion("shen_fen_zheng_id <>", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdGreaterThan(String value) {
            addCriterion("shen_fen_zheng_id >", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdGreaterThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_id >=", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdLessThan(String value) {
            addCriterion("shen_fen_zheng_id <", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdLessThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_id <=", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdLike(String value) {
            addCriterion("shen_fen_zheng_id like", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdNotLike(String value) {
            addCriterion("shen_fen_zheng_id not like", value, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdIn(List<String> values) {
            addCriterion("shen_fen_zheng_id in", values, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdNotIn(List<String> values) {
            addCriterion("shen_fen_zheng_id not in", values, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_id between", value1, value2, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengIdNotBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_id not between", value1, value2, "shenFenZhengId");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeIsNull() {
            addCriterion("gu_hao_time is null");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeIsNotNull() {
            addCriterion("gu_hao_time is not null");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeEqualTo(Date value) {
            addCriterion("gu_hao_time =", value, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeNotEqualTo(Date value) {
            addCriterion("gu_hao_time <>", value, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeGreaterThan(Date value) {
            addCriterion("gu_hao_time >", value, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gu_hao_time >=", value, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeLessThan(Date value) {
            addCriterion("gu_hao_time <", value, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeLessThanOrEqualTo(Date value) {
            addCriterion("gu_hao_time <=", value, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeIn(List<Date> values) {
            addCriterion("gu_hao_time in", values, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeNotIn(List<Date> values) {
            addCriterion("gu_hao_time not in", values, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeBetween(Date value1, Date value2) {
            addCriterion("gu_hao_time between", value1, value2, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andGuHaoTimeNotBetween(Date value1, Date value2) {
            addCriterion("gu_hao_time not between", value1, value2, "guHaoTime");
            return (Criteria) this;
        }

        public Criteria andKeShiIsNull() {
            addCriterion("ke_shi is null");
            return (Criteria) this;
        }

        public Criteria andKeShiIsNotNull() {
            addCriterion("ke_shi is not null");
            return (Criteria) this;
        }

        public Criteria andKeShiEqualTo(String value) {
            addCriterion("ke_shi =", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiNotEqualTo(String value) {
            addCriterion("ke_shi <>", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiGreaterThan(String value) {
            addCriterion("ke_shi >", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiGreaterThanOrEqualTo(String value) {
            addCriterion("ke_shi >=", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiLessThan(String value) {
            addCriterion("ke_shi <", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiLessThanOrEqualTo(String value) {
            addCriterion("ke_shi <=", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiLike(String value) {
            addCriterion("ke_shi like", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiNotLike(String value) {
            addCriterion("ke_shi not like", value, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiIn(List<String> values) {
            addCriterion("ke_shi in", values, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiNotIn(List<String> values) {
            addCriterion("ke_shi not in", values, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiBetween(String value1, String value2) {
            addCriterion("ke_shi between", value1, value2, "keShi");
            return (Criteria) this;
        }

        public Criteria andKeShiNotBetween(String value1, String value2) {
            addCriterion("ke_shi not between", value1, value2, "keShi");
            return (Criteria) this;
        }

        public Criteria andCureIsNull() {
            addCriterion("cure is null");
            return (Criteria) this;
        }

        public Criteria andCureIsNotNull() {
            addCriterion("cure is not null");
            return (Criteria) this;
        }

        public Criteria andCureEqualTo(Byte value) {
            addCriterion("cure =", value, "cure");
            return (Criteria) this;
        }

        public Criteria andCureNotEqualTo(Byte value) {
            addCriterion("cure <>", value, "cure");
            return (Criteria) this;
        }

        public Criteria andCureGreaterThan(Byte value) {
            addCriterion("cure >", value, "cure");
            return (Criteria) this;
        }

        public Criteria andCureGreaterThanOrEqualTo(Byte value) {
            addCriterion("cure >=", value, "cure");
            return (Criteria) this;
        }

        public Criteria andCureLessThan(Byte value) {
            addCriterion("cure <", value, "cure");
            return (Criteria) this;
        }

        public Criteria andCureLessThanOrEqualTo(Byte value) {
            addCriterion("cure <=", value, "cure");
            return (Criteria) this;
        }

        public Criteria andCureIn(List<Byte> values) {
            addCriterion("cure in", values, "cure");
            return (Criteria) this;
        }

        public Criteria andCureNotIn(List<Byte> values) {
            addCriterion("cure not in", values, "cure");
            return (Criteria) this;
        }

        public Criteria andCureBetween(Byte value1, Byte value2) {
            addCriterion("cure between", value1, value2, "cure");
            return (Criteria) this;
        }

        public Criteria andCureNotBetween(Byte value1, Byte value2) {
            addCriterion("cure not between", value1, value2, "cure");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(String value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(String value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(String value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(String value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(String value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLike(String value) {
            addCriterion("doctor like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotLike(String value) {
            addCriterion("doctor not like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<String> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<String> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(String value1, String value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(String value1, String value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
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