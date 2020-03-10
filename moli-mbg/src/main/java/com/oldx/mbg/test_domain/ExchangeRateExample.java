package com.oldx.mbg.test_domain;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeRateExample() {
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

        public Criteria andMeiyuanHuilvIsNull() {
            addCriterion("meiyuan_huilv is null");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvIsNotNull() {
            addCriterion("meiyuan_huilv is not null");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvEqualTo(String value) {
            addCriterion("meiyuan_huilv =", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvNotEqualTo(String value) {
            addCriterion("meiyuan_huilv <>", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvGreaterThan(String value) {
            addCriterion("meiyuan_huilv >", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvGreaterThanOrEqualTo(String value) {
            addCriterion("meiyuan_huilv >=", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvLessThan(String value) {
            addCriterion("meiyuan_huilv <", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvLessThanOrEqualTo(String value) {
            addCriterion("meiyuan_huilv <=", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvLike(String value) {
            addCriterion("meiyuan_huilv like", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvNotLike(String value) {
            addCriterion("meiyuan_huilv not like", value, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvIn(List<String> values) {
            addCriterion("meiyuan_huilv in", values, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvNotIn(List<String> values) {
            addCriterion("meiyuan_huilv not in", values, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvBetween(String value1, String value2) {
            addCriterion("meiyuan_huilv between", value1, value2, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andMeiyuanHuilvNotBetween(String value1, String value2) {
            addCriterion("meiyuan_huilv not between", value1, value2, "meiyuanHuilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvIsNull() {
            addCriterion("ali3c_lingshou_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvIsNotNull() {
            addCriterion("ali3c_lingshou_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvEqualTo(String value) {
            addCriterion("ali3c_lingshou_maolilv =", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvNotEqualTo(String value) {
            addCriterion("ali3c_lingshou_maolilv <>", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvGreaterThan(String value) {
            addCriterion("ali3c_lingshou_maolilv >", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_lingshou_maolilv >=", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvLessThan(String value) {
            addCriterion("ali3c_lingshou_maolilv <", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvLessThanOrEqualTo(String value) {
            addCriterion("ali3c_lingshou_maolilv <=", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvLike(String value) {
            addCriterion("ali3c_lingshou_maolilv like", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvNotLike(String value) {
            addCriterion("ali3c_lingshou_maolilv not like", value, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvIn(List<String> values) {
            addCriterion("ali3c_lingshou_maolilv in", values, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvNotIn(List<String> values) {
            addCriterion("ali3c_lingshou_maolilv not in", values, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvBetween(String value1, String value2) {
            addCriterion("ali3c_lingshou_maolilv between", value1, value2, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cLingshouMaolilvNotBetween(String value1, String value2) {
            addCriterion("ali3c_lingshou_maolilv not between", value1, value2, "ali3cLingshouMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvIsNull() {
            addCriterion("ali3c_huodongjia_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvIsNotNull() {
            addCriterion("ali3c_huodongjia_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvEqualTo(String value) {
            addCriterion("ali3c_huodongjia_maolilv =", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvNotEqualTo(String value) {
            addCriterion("ali3c_huodongjia_maolilv <>", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvGreaterThan(String value) {
            addCriterion("ali3c_huodongjia_maolilv >", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_huodongjia_maolilv >=", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvLessThan(String value) {
            addCriterion("ali3c_huodongjia_maolilv <", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvLessThanOrEqualTo(String value) {
            addCriterion("ali3c_huodongjia_maolilv <=", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvLike(String value) {
            addCriterion("ali3c_huodongjia_maolilv like", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvNotLike(String value) {
            addCriterion("ali3c_huodongjia_maolilv not like", value, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvIn(List<String> values) {
            addCriterion("ali3c_huodongjia_maolilv in", values, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvNotIn(List<String> values) {
            addCriterion("ali3c_huodongjia_maolilv not in", values, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvBetween(String value1, String value2) {
            addCriterion("ali3c_huodongjia_maolilv between", value1, value2, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cHuodongjiaMaolilvNotBetween(String value1, String value2) {
            addCriterion("ali3c_huodongjia_maolilv not between", value1, value2, "ali3cHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvIsNull() {
            addCriterion("ali3c_zuidijia_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvIsNotNull() {
            addCriterion("ali3c_zuidijia_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvEqualTo(String value) {
            addCriterion("ali3c_zuidijia_maolilv =", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvNotEqualTo(String value) {
            addCriterion("ali3c_zuidijia_maolilv <>", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvGreaterThan(String value) {
            addCriterion("ali3c_zuidijia_maolilv >", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_zuidijia_maolilv >=", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvLessThan(String value) {
            addCriterion("ali3c_zuidijia_maolilv <", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvLessThanOrEqualTo(String value) {
            addCriterion("ali3c_zuidijia_maolilv <=", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvLike(String value) {
            addCriterion("ali3c_zuidijia_maolilv like", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvNotLike(String value) {
            addCriterion("ali3c_zuidijia_maolilv not like", value, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvIn(List<String> values) {
            addCriterion("ali3c_zuidijia_maolilv in", values, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvNotIn(List<String> values) {
            addCriterion("ali3c_zuidijia_maolilv not in", values, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvBetween(String value1, String value2) {
            addCriterion("ali3c_zuidijia_maolilv between", value1, value2, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAli3cZuidijiaMaolilvNotBetween(String value1, String value2) {
            addCriterion("ali3c_zuidijia_maolilv not between", value1, value2, "ali3cZuidijiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvIsNull() {
            addCriterion("alitoy_lingshoujia_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvIsNotNull() {
            addCriterion("alitoy_lingshoujia_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvEqualTo(String value) {
            addCriterion("alitoy_lingshoujia_maolilv =", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvNotEqualTo(String value) {
            addCriterion("alitoy_lingshoujia_maolilv <>", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvGreaterThan(String value) {
            addCriterion("alitoy_lingshoujia_maolilv >", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("alitoy_lingshoujia_maolilv >=", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvLessThan(String value) {
            addCriterion("alitoy_lingshoujia_maolilv <", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvLessThanOrEqualTo(String value) {
            addCriterion("alitoy_lingshoujia_maolilv <=", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvLike(String value) {
            addCriterion("alitoy_lingshoujia_maolilv like", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvNotLike(String value) {
            addCriterion("alitoy_lingshoujia_maolilv not like", value, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvIn(List<String> values) {
            addCriterion("alitoy_lingshoujia_maolilv in", values, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvNotIn(List<String> values) {
            addCriterion("alitoy_lingshoujia_maolilv not in", values, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvBetween(String value1, String value2) {
            addCriterion("alitoy_lingshoujia_maolilv between", value1, value2, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andAlitoyLingshoujiaMaolilvNotBetween(String value1, String value2) {
            addCriterion("alitoy_lingshoujia_maolilv not between", value1, value2, "alitoyLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvIsNull() {
            addCriterion("tb_lingshoujia_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvIsNotNull() {
            addCriterion("tb_lingshoujia_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvEqualTo(String value) {
            addCriterion("tb_lingshoujia_maolilv =", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvNotEqualTo(String value) {
            addCriterion("tb_lingshoujia_maolilv <>", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvGreaterThan(String value) {
            addCriterion("tb_lingshoujia_maolilv >", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("tb_lingshoujia_maolilv >=", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvLessThan(String value) {
            addCriterion("tb_lingshoujia_maolilv <", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvLessThanOrEqualTo(String value) {
            addCriterion("tb_lingshoujia_maolilv <=", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvLike(String value) {
            addCriterion("tb_lingshoujia_maolilv like", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvNotLike(String value) {
            addCriterion("tb_lingshoujia_maolilv not like", value, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvIn(List<String> values) {
            addCriterion("tb_lingshoujia_maolilv in", values, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvNotIn(List<String> values) {
            addCriterion("tb_lingshoujia_maolilv not in", values, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvBetween(String value1, String value2) {
            addCriterion("tb_lingshoujia_maolilv between", value1, value2, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbLingshoujiaMaolilvNotBetween(String value1, String value2) {
            addCriterion("tb_lingshoujia_maolilv not between", value1, value2, "tbLingshoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvIsNull() {
            addCriterion("tb_huodongjia_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvIsNotNull() {
            addCriterion("tb_huodongjia_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvEqualTo(String value) {
            addCriterion("tb_huodongjia_maolilv =", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvNotEqualTo(String value) {
            addCriterion("tb_huodongjia_maolilv <>", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvGreaterThan(String value) {
            addCriterion("tb_huodongjia_maolilv >", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("tb_huodongjia_maolilv >=", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvLessThan(String value) {
            addCriterion("tb_huodongjia_maolilv <", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvLessThanOrEqualTo(String value) {
            addCriterion("tb_huodongjia_maolilv <=", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvLike(String value) {
            addCriterion("tb_huodongjia_maolilv like", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvNotLike(String value) {
            addCriterion("tb_huodongjia_maolilv not like", value, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvIn(List<String> values) {
            addCriterion("tb_huodongjia_maolilv in", values, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvNotIn(List<String> values) {
            addCriterion("tb_huodongjia_maolilv not in", values, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvBetween(String value1, String value2) {
            addCriterion("tb_huodongjia_maolilv between", value1, value2, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbHuodongjiaMaolilvNotBetween(String value1, String value2) {
            addCriterion("tb_huodongjia_maolilv not between", value1, value2, "tbHuodongjiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvIsNull() {
            addCriterion("tb_zuidishoujia_maolilv is null");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvIsNotNull() {
            addCriterion("tb_zuidishoujia_maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvEqualTo(String value) {
            addCriterion("tb_zuidishoujia_maolilv =", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvNotEqualTo(String value) {
            addCriterion("tb_zuidishoujia_maolilv <>", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvGreaterThan(String value) {
            addCriterion("tb_zuidishoujia_maolilv >", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvGreaterThanOrEqualTo(String value) {
            addCriterion("tb_zuidishoujia_maolilv >=", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvLessThan(String value) {
            addCriterion("tb_zuidishoujia_maolilv <", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvLessThanOrEqualTo(String value) {
            addCriterion("tb_zuidishoujia_maolilv <=", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvLike(String value) {
            addCriterion("tb_zuidishoujia_maolilv like", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvNotLike(String value) {
            addCriterion("tb_zuidishoujia_maolilv not like", value, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvIn(List<String> values) {
            addCriterion("tb_zuidishoujia_maolilv in", values, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvNotIn(List<String> values) {
            addCriterion("tb_zuidishoujia_maolilv not in", values, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvBetween(String value1, String value2) {
            addCriterion("tb_zuidishoujia_maolilv between", value1, value2, "tbZuidishoujiaMaolilv");
            return (Criteria) this;
        }

        public Criteria andTbZuidishoujiaMaolilvNotBetween(String value1, String value2) {
            addCriterion("tb_zuidishoujia_maolilv not between", value1, value2, "tbZuidishoujiaMaolilv");
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