package com.oldx.mbg.test_domain;

import java.util.ArrayList;
import java.util.List;

public class CanpingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CanpingExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNull() {
            addCriterion("product_category is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNotNull() {
            addCriterion("product_category is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryEqualTo(String value) {
            addCriterion("product_category =", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotEqualTo(String value) {
            addCriterion("product_category <>", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThan(String value) {
            addCriterion("product_category >", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("product_category >=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThan(String value) {
            addCriterion("product_category <", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThanOrEqualTo(String value) {
            addCriterion("product_category <=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLike(String value) {
            addCriterion("product_category like", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotLike(String value) {
            addCriterion("product_category not like", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIn(List<String> values) {
            addCriterion("product_category in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotIn(List<String> values) {
            addCriterion("product_category not in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryBetween(String value1, String value2) {
            addCriterion("product_category between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotBetween(String value1, String value2) {
            addCriterion("product_category not between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionIsNull() {
            addCriterion("battery_condition is null");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionIsNotNull() {
            addCriterion("battery_condition is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionEqualTo(String value) {
            addCriterion("battery_condition =", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionNotEqualTo(String value) {
            addCriterion("battery_condition <>", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionGreaterThan(String value) {
            addCriterion("battery_condition >", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionGreaterThanOrEqualTo(String value) {
            addCriterion("battery_condition >=", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionLessThan(String value) {
            addCriterion("battery_condition <", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionLessThanOrEqualTo(String value) {
            addCriterion("battery_condition <=", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionLike(String value) {
            addCriterion("battery_condition like", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionNotLike(String value) {
            addCriterion("battery_condition not like", value, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionIn(List<String> values) {
            addCriterion("battery_condition in", values, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionNotIn(List<String> values) {
            addCriterion("battery_condition not in", values, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionBetween(String value1, String value2) {
            addCriterion("battery_condition between", value1, value2, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andBatteryConditionNotBetween(String value1, String value2) {
            addCriterion("battery_condition not between", value1, value2, "batteryCondition");
            return (Criteria) this;
        }

        public Criteria andIsMagneticIsNull() {
            addCriterion("is_magnetic is null");
            return (Criteria) this;
        }

        public Criteria andIsMagneticIsNotNull() {
            addCriterion("is_magnetic is not null");
            return (Criteria) this;
        }

        public Criteria andIsMagneticEqualTo(String value) {
            addCriterion("is_magnetic =", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotEqualTo(String value) {
            addCriterion("is_magnetic <>", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticGreaterThan(String value) {
            addCriterion("is_magnetic >", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticGreaterThanOrEqualTo(String value) {
            addCriterion("is_magnetic >=", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticLessThan(String value) {
            addCriterion("is_magnetic <", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticLessThanOrEqualTo(String value) {
            addCriterion("is_magnetic <=", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticLike(String value) {
            addCriterion("is_magnetic like", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotLike(String value) {
            addCriterion("is_magnetic not like", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticIn(List<String> values) {
            addCriterion("is_magnetic in", values, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotIn(List<String> values) {
            addCriterion("is_magnetic not in", values, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticBetween(String value1, String value2) {
            addCriterion("is_magnetic between", value1, value2, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotBetween(String value1, String value2) {
            addCriterion("is_magnetic not between", value1, value2, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Integer value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Integer value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Integer value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Integer value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Integer value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Integer> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Integer> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Integer value1, Integer value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Integer value1, Integer value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightIsNull() {
            addCriterion("bubble_weight is null");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightIsNotNull() {
            addCriterion("bubble_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightEqualTo(String value) {
            addCriterion("bubble_weight =", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightNotEqualTo(String value) {
            addCriterion("bubble_weight <>", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightGreaterThan(String value) {
            addCriterion("bubble_weight >", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightGreaterThanOrEqualTo(String value) {
            addCriterion("bubble_weight >=", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightLessThan(String value) {
            addCriterion("bubble_weight <", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightLessThanOrEqualTo(String value) {
            addCriterion("bubble_weight <=", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightLike(String value) {
            addCriterion("bubble_weight like", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightNotLike(String value) {
            addCriterion("bubble_weight not like", value, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightIn(List<String> values) {
            addCriterion("bubble_weight in", values, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightNotIn(List<String> values) {
            addCriterion("bubble_weight not in", values, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightBetween(String value1, String value2) {
            addCriterion("bubble_weight between", value1, value2, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andBubbleWeightNotBetween(String value1, String value2) {
            addCriterion("bubble_weight not between", value1, value2, "bubbleWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightIsNull() {
            addCriterion("product_original_package_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightIsNotNull() {
            addCriterion("product_original_package_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightEqualTo(String value) {
            addCriterion("product_original_package_weight =", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightNotEqualTo(String value) {
            addCriterion("product_original_package_weight <>", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightGreaterThan(String value) {
            addCriterion("product_original_package_weight >", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_original_package_weight >=", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightLessThan(String value) {
            addCriterion("product_original_package_weight <", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightLessThanOrEqualTo(String value) {
            addCriterion("product_original_package_weight <=", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightLike(String value) {
            addCriterion("product_original_package_weight like", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightNotLike(String value) {
            addCriterion("product_original_package_weight not like", value, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightIn(List<String> values) {
            addCriterion("product_original_package_weight in", values, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightNotIn(List<String> values) {
            addCriterion("product_original_package_weight not in", values, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightBetween(String value1, String value2) {
            addCriterion("product_original_package_weight between", value1, value2, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPackageWeightNotBetween(String value1, String value2) {
            addCriterion("product_original_package_weight not between", value1, value2, "productOriginalPackageWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightIsNull() {
            addCriterion("actual_delivery_weight is null");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightIsNotNull() {
            addCriterion("actual_delivery_weight is not null");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightEqualTo(String value) {
            addCriterion("actual_delivery_weight =", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightNotEqualTo(String value) {
            addCriterion("actual_delivery_weight <>", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightGreaterThan(String value) {
            addCriterion("actual_delivery_weight >", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightGreaterThanOrEqualTo(String value) {
            addCriterion("actual_delivery_weight >=", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightLessThan(String value) {
            addCriterion("actual_delivery_weight <", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightLessThanOrEqualTo(String value) {
            addCriterion("actual_delivery_weight <=", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightLike(String value) {
            addCriterion("actual_delivery_weight like", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightNotLike(String value) {
            addCriterion("actual_delivery_weight not like", value, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightIn(List<String> values) {
            addCriterion("actual_delivery_weight in", values, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightNotIn(List<String> values) {
            addCriterion("actual_delivery_weight not in", values, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightBetween(String value1, String value2) {
            addCriterion("actual_delivery_weight between", value1, value2, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andActualDeliveryWeightNotBetween(String value1, String value2) {
            addCriterion("actual_delivery_weight not between", value1, value2, "actualDeliveryWeight");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbIsNull() {
            addCriterion("international_shipping_rmb is null");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbIsNotNull() {
            addCriterion("international_shipping_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbEqualTo(String value) {
            addCriterion("international_shipping_rmb =", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbNotEqualTo(String value) {
            addCriterion("international_shipping_rmb <>", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbGreaterThan(String value) {
            addCriterion("international_shipping_rmb >", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbGreaterThanOrEqualTo(String value) {
            addCriterion("international_shipping_rmb >=", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbLessThan(String value) {
            addCriterion("international_shipping_rmb <", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbLessThanOrEqualTo(String value) {
            addCriterion("international_shipping_rmb <=", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbLike(String value) {
            addCriterion("international_shipping_rmb like", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbNotLike(String value) {
            addCriterion("international_shipping_rmb not like", value, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbIn(List<String> values) {
            addCriterion("international_shipping_rmb in", values, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbNotIn(List<String> values) {
            addCriterion("international_shipping_rmb not in", values, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbBetween(String value1, String value2) {
            addCriterion("international_shipping_rmb between", value1, value2, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andInternationalShippingRmbNotBetween(String value1, String value2) {
            addCriterion("international_shipping_rmb not between", value1, value2, "internationalShippingRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbIsNull() {
            addCriterion("domestic_freight_rmb is null");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbIsNotNull() {
            addCriterion("domestic_freight_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbEqualTo(String value) {
            addCriterion("domestic_freight_rmb =", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbNotEqualTo(String value) {
            addCriterion("domestic_freight_rmb <>", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbGreaterThan(String value) {
            addCriterion("domestic_freight_rmb >", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbGreaterThanOrEqualTo(String value) {
            addCriterion("domestic_freight_rmb >=", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbLessThan(String value) {
            addCriterion("domestic_freight_rmb <", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbLessThanOrEqualTo(String value) {
            addCriterion("domestic_freight_rmb <=", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbLike(String value) {
            addCriterion("domestic_freight_rmb like", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbNotLike(String value) {
            addCriterion("domestic_freight_rmb not like", value, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbIn(List<String> values) {
            addCriterion("domestic_freight_rmb in", values, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbNotIn(List<String> values) {
            addCriterion("domestic_freight_rmb not in", values, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbBetween(String value1, String value2) {
            addCriterion("domestic_freight_rmb between", value1, value2, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andDomesticFreightRmbNotBetween(String value1, String value2) {
            addCriterion("domestic_freight_rmb not between", value1, value2, "domesticFreightRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbIsNull() {
            addCriterion("purchase_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbIsNotNull() {
            addCriterion("purchase_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbEqualTo(String value) {
            addCriterion("purchase_cost_rmb =", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbNotEqualTo(String value) {
            addCriterion("purchase_cost_rmb <>", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbGreaterThan(String value) {
            addCriterion("purchase_cost_rmb >", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_cost_rmb >=", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbLessThan(String value) {
            addCriterion("purchase_cost_rmb <", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbLessThanOrEqualTo(String value) {
            addCriterion("purchase_cost_rmb <=", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbLike(String value) {
            addCriterion("purchase_cost_rmb like", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbNotLike(String value) {
            addCriterion("purchase_cost_rmb not like", value, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbIn(List<String> values) {
            addCriterion("purchase_cost_rmb in", values, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbNotIn(List<String> values) {
            addCriterion("purchase_cost_rmb not in", values, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbBetween(String value1, String value2) {
            addCriterion("purchase_cost_rmb between", value1, value2, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostRmbNotBetween(String value1, String value2) {
            addCriterion("purchase_cost_rmb not between", value1, value2, "purchaseCostRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbIsNull() {
            addCriterion("official_retail_price_rmb is null");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbIsNotNull() {
            addCriterion("official_retail_price_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbEqualTo(String value) {
            addCriterion("official_retail_price_rmb =", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbNotEqualTo(String value) {
            addCriterion("official_retail_price_rmb <>", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbGreaterThan(String value) {
            addCriterion("official_retail_price_rmb >", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbGreaterThanOrEqualTo(String value) {
            addCriterion("official_retail_price_rmb >=", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbLessThan(String value) {
            addCriterion("official_retail_price_rmb <", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbLessThanOrEqualTo(String value) {
            addCriterion("official_retail_price_rmb <=", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbLike(String value) {
            addCriterion("official_retail_price_rmb like", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbNotLike(String value) {
            addCriterion("official_retail_price_rmb not like", value, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbIn(List<String> values) {
            addCriterion("official_retail_price_rmb in", values, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbNotIn(List<String> values) {
            addCriterion("official_retail_price_rmb not in", values, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbBetween(String value1, String value2) {
            addCriterion("official_retail_price_rmb between", value1, value2, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceRmbNotBetween(String value1, String value2) {
            addCriterion("official_retail_price_rmb not between", value1, value2, "officialRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdIsNull() {
            addCriterion("official_retail_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdIsNotNull() {
            addCriterion("official_retail_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdEqualTo(String value) {
            addCriterion("official_retail_price_usd =", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdNotEqualTo(String value) {
            addCriterion("official_retail_price_usd <>", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdGreaterThan(String value) {
            addCriterion("official_retail_price_usd >", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("official_retail_price_usd >=", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdLessThan(String value) {
            addCriterion("official_retail_price_usd <", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("official_retail_price_usd <=", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdLike(String value) {
            addCriterion("official_retail_price_usd like", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdNotLike(String value) {
            addCriterion("official_retail_price_usd not like", value, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdIn(List<String> values) {
            addCriterion("official_retail_price_usd in", values, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdNotIn(List<String> values) {
            addCriterion("official_retail_price_usd not in", values, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdBetween(String value1, String value2) {
            addCriterion("official_retail_price_usd between", value1, value2, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andOfficialRetailPriceUsdNotBetween(String value1, String value2) {
            addCriterion("official_retail_price_usd not between", value1, value2, "officialRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdIsNull() {
            addCriterion("ali3c_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdIsNotNull() {
            addCriterion("ali3c_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdEqualTo(String value) {
            addCriterion("ali3c_price_usd =", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdNotEqualTo(String value) {
            addCriterion("ali3c_price_usd <>", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdGreaterThan(String value) {
            addCriterion("ali3c_price_usd >", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_price_usd >=", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdLessThan(String value) {
            addCriterion("ali3c_price_usd <", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("ali3c_price_usd <=", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdLike(String value) {
            addCriterion("ali3c_price_usd like", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdNotLike(String value) {
            addCriterion("ali3c_price_usd not like", value, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdIn(List<String> values) {
            addCriterion("ali3c_price_usd in", values, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdNotIn(List<String> values) {
            addCriterion("ali3c_price_usd not in", values, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdBetween(String value1, String value2) {
            addCriterion("ali3c_price_usd between", value1, value2, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cPriceUsdNotBetween(String value1, String value2) {
            addCriterion("ali3c_price_usd not between", value1, value2, "ali3cPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdIsNull() {
            addCriterion("ali3c_retail_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdIsNotNull() {
            addCriterion("ali3c_retail_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdEqualTo(String value) {
            addCriterion("ali3c_retail_price_usd =", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdNotEqualTo(String value) {
            addCriterion("ali3c_retail_price_usd <>", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdGreaterThan(String value) {
            addCriterion("ali3c_retail_price_usd >", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_retail_price_usd >=", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdLessThan(String value) {
            addCriterion("ali3c_retail_price_usd <", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("ali3c_retail_price_usd <=", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdLike(String value) {
            addCriterion("ali3c_retail_price_usd like", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdNotLike(String value) {
            addCriterion("ali3c_retail_price_usd not like", value, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdIn(List<String> values) {
            addCriterion("ali3c_retail_price_usd in", values, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdNotIn(List<String> values) {
            addCriterion("ali3c_retail_price_usd not in", values, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdBetween(String value1, String value2) {
            addCriterion("ali3c_retail_price_usd between", value1, value2, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cRetailPriceUsdNotBetween(String value1, String value2) {
            addCriterion("ali3c_retail_price_usd not between", value1, value2, "ali3cRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdIsNull() {
            addCriterion("ali3c_activity_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdIsNotNull() {
            addCriterion("ali3c_activity_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdEqualTo(String value) {
            addCriterion("ali3c_activity_price_usd =", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdNotEqualTo(String value) {
            addCriterion("ali3c_activity_price_usd <>", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdGreaterThan(String value) {
            addCriterion("ali3c_activity_price_usd >", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_activity_price_usd >=", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdLessThan(String value) {
            addCriterion("ali3c_activity_price_usd <", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("ali3c_activity_price_usd <=", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdLike(String value) {
            addCriterion("ali3c_activity_price_usd like", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdNotLike(String value) {
            addCriterion("ali3c_activity_price_usd not like", value, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdIn(List<String> values) {
            addCriterion("ali3c_activity_price_usd in", values, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdNotIn(List<String> values) {
            addCriterion("ali3c_activity_price_usd not in", values, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdBetween(String value1, String value2) {
            addCriterion("ali3c_activity_price_usd between", value1, value2, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cActivityPriceUsdNotBetween(String value1, String value2) {
            addCriterion("ali3c_activity_price_usd not between", value1, value2, "ali3cActivityPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdIsNull() {
            addCriterion("ali3c_lowest_usd is null");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdIsNotNull() {
            addCriterion("ali3c_lowest_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdEqualTo(String value) {
            addCriterion("ali3c_lowest_usd =", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdNotEqualTo(String value) {
            addCriterion("ali3c_lowest_usd <>", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdGreaterThan(String value) {
            addCriterion("ali3c_lowest_usd >", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdGreaterThanOrEqualTo(String value) {
            addCriterion("ali3c_lowest_usd >=", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdLessThan(String value) {
            addCriterion("ali3c_lowest_usd <", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdLessThanOrEqualTo(String value) {
            addCriterion("ali3c_lowest_usd <=", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdLike(String value) {
            addCriterion("ali3c_lowest_usd like", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdNotLike(String value) {
            addCriterion("ali3c_lowest_usd not like", value, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdIn(List<String> values) {
            addCriterion("ali3c_lowest_usd in", values, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdNotIn(List<String> values) {
            addCriterion("ali3c_lowest_usd not in", values, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdBetween(String value1, String value2) {
            addCriterion("ali3c_lowest_usd between", value1, value2, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAli3cLowestUsdNotBetween(String value1, String value2) {
            addCriterion("ali3c_lowest_usd not between", value1, value2, "ali3cLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdIsNull() {
            addCriterion("alitoy_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdIsNotNull() {
            addCriterion("alitoy_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdEqualTo(String value) {
            addCriterion("alitoy_price_usd =", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdNotEqualTo(String value) {
            addCriterion("alitoy_price_usd <>", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdGreaterThan(String value) {
            addCriterion("alitoy_price_usd >", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("alitoy_price_usd >=", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdLessThan(String value) {
            addCriterion("alitoy_price_usd <", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("alitoy_price_usd <=", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdLike(String value) {
            addCriterion("alitoy_price_usd like", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdNotLike(String value) {
            addCriterion("alitoy_price_usd not like", value, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdIn(List<String> values) {
            addCriterion("alitoy_price_usd in", values, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdNotIn(List<String> values) {
            addCriterion("alitoy_price_usd not in", values, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdBetween(String value1, String value2) {
            addCriterion("alitoy_price_usd between", value1, value2, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyPriceUsdNotBetween(String value1, String value2) {
            addCriterion("alitoy_price_usd not between", value1, value2, "alitoyPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdIsNull() {
            addCriterion("alitoy_retail_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdIsNotNull() {
            addCriterion("alitoy_retail_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdEqualTo(String value) {
            addCriterion("alitoy_retail_price_usd =", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdNotEqualTo(String value) {
            addCriterion("alitoy_retail_price_usd <>", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdGreaterThan(String value) {
            addCriterion("alitoy_retail_price_usd >", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("alitoy_retail_price_usd >=", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdLessThan(String value) {
            addCriterion("alitoy_retail_price_usd <", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("alitoy_retail_price_usd <=", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdLike(String value) {
            addCriterion("alitoy_retail_price_usd like", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdNotLike(String value) {
            addCriterion("alitoy_retail_price_usd not like", value, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdIn(List<String> values) {
            addCriterion("alitoy_retail_price_usd in", values, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdNotIn(List<String> values) {
            addCriterion("alitoy_retail_price_usd not in", values, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdBetween(String value1, String value2) {
            addCriterion("alitoy_retail_price_usd between", value1, value2, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyRetailPriceUsdNotBetween(String value1, String value2) {
            addCriterion("alitoy_retail_price_usd not between", value1, value2, "alitoyRetailPriceUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdIsNull() {
            addCriterion("alitoy_activity_usd is null");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdIsNotNull() {
            addCriterion("alitoy_activity_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdEqualTo(String value) {
            addCriterion("alitoy_activity_usd =", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdNotEqualTo(String value) {
            addCriterion("alitoy_activity_usd <>", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdGreaterThan(String value) {
            addCriterion("alitoy_activity_usd >", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdGreaterThanOrEqualTo(String value) {
            addCriterion("alitoy_activity_usd >=", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdLessThan(String value) {
            addCriterion("alitoy_activity_usd <", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdLessThanOrEqualTo(String value) {
            addCriterion("alitoy_activity_usd <=", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdLike(String value) {
            addCriterion("alitoy_activity_usd like", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdNotLike(String value) {
            addCriterion("alitoy_activity_usd not like", value, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdIn(List<String> values) {
            addCriterion("alitoy_activity_usd in", values, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdNotIn(List<String> values) {
            addCriterion("alitoy_activity_usd not in", values, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdBetween(String value1, String value2) {
            addCriterion("alitoy_activity_usd between", value1, value2, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyActivityUsdNotBetween(String value1, String value2) {
            addCriterion("alitoy_activity_usd not between", value1, value2, "alitoyActivityUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdIsNull() {
            addCriterion("alitoy_lowest_usd is null");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdIsNotNull() {
            addCriterion("alitoy_lowest_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdEqualTo(String value) {
            addCriterion("alitoy_lowest_usd =", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdNotEqualTo(String value) {
            addCriterion("alitoy_lowest_usd <>", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdGreaterThan(String value) {
            addCriterion("alitoy_lowest_usd >", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdGreaterThanOrEqualTo(String value) {
            addCriterion("alitoy_lowest_usd >=", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdLessThan(String value) {
            addCriterion("alitoy_lowest_usd <", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdLessThanOrEqualTo(String value) {
            addCriterion("alitoy_lowest_usd <=", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdLike(String value) {
            addCriterion("alitoy_lowest_usd like", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdNotLike(String value) {
            addCriterion("alitoy_lowest_usd not like", value, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdIn(List<String> values) {
            addCriterion("alitoy_lowest_usd in", values, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdNotIn(List<String> values) {
            addCriterion("alitoy_lowest_usd not in", values, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdBetween(String value1, String value2) {
            addCriterion("alitoy_lowest_usd between", value1, value2, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andAlitoyLowestUsdNotBetween(String value1, String value2) {
            addCriterion("alitoy_lowest_usd not between", value1, value2, "alitoyLowestUsd");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbIsNull() {
            addCriterion("tb_price_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbIsNotNull() {
            addCriterion("tb_price_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbEqualTo(String value) {
            addCriterion("tb_price_rmb =", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbNotEqualTo(String value) {
            addCriterion("tb_price_rmb <>", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbGreaterThan(String value) {
            addCriterion("tb_price_rmb >", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbGreaterThanOrEqualTo(String value) {
            addCriterion("tb_price_rmb >=", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbLessThan(String value) {
            addCriterion("tb_price_rmb <", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbLessThanOrEqualTo(String value) {
            addCriterion("tb_price_rmb <=", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbLike(String value) {
            addCriterion("tb_price_rmb like", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbNotLike(String value) {
            addCriterion("tb_price_rmb not like", value, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbIn(List<String> values) {
            addCriterion("tb_price_rmb in", values, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbNotIn(List<String> values) {
            addCriterion("tb_price_rmb not in", values, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbBetween(String value1, String value2) {
            addCriterion("tb_price_rmb between", value1, value2, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbPriceRmbNotBetween(String value1, String value2) {
            addCriterion("tb_price_rmb not between", value1, value2, "tbPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbIsNull() {
            addCriterion("tb_retail_price_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbIsNotNull() {
            addCriterion("tb_retail_price_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbEqualTo(String value) {
            addCriterion("tb_retail_price_rmb =", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbNotEqualTo(String value) {
            addCriterion("tb_retail_price_rmb <>", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbGreaterThan(String value) {
            addCriterion("tb_retail_price_rmb >", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbGreaterThanOrEqualTo(String value) {
            addCriterion("tb_retail_price_rmb >=", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbLessThan(String value) {
            addCriterion("tb_retail_price_rmb <", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbLessThanOrEqualTo(String value) {
            addCriterion("tb_retail_price_rmb <=", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbLike(String value) {
            addCriterion("tb_retail_price_rmb like", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbNotLike(String value) {
            addCriterion("tb_retail_price_rmb not like", value, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbIn(List<String> values) {
            addCriterion("tb_retail_price_rmb in", values, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbNotIn(List<String> values) {
            addCriterion("tb_retail_price_rmb not in", values, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbBetween(String value1, String value2) {
            addCriterion("tb_retail_price_rmb between", value1, value2, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbRetailPriceRmbNotBetween(String value1, String value2) {
            addCriterion("tb_retail_price_rmb not between", value1, value2, "tbRetailPriceRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbIsNull() {
            addCriterion("tb_activity_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbIsNotNull() {
            addCriterion("tb_activity_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbEqualTo(String value) {
            addCriterion("tb_activity_rmb =", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbNotEqualTo(String value) {
            addCriterion("tb_activity_rmb <>", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbGreaterThan(String value) {
            addCriterion("tb_activity_rmb >", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbGreaterThanOrEqualTo(String value) {
            addCriterion("tb_activity_rmb >=", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbLessThan(String value) {
            addCriterion("tb_activity_rmb <", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbLessThanOrEqualTo(String value) {
            addCriterion("tb_activity_rmb <=", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbLike(String value) {
            addCriterion("tb_activity_rmb like", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbNotLike(String value) {
            addCriterion("tb_activity_rmb not like", value, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbIn(List<String> values) {
            addCriterion("tb_activity_rmb in", values, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbNotIn(List<String> values) {
            addCriterion("tb_activity_rmb not in", values, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbBetween(String value1, String value2) {
            addCriterion("tb_activity_rmb between", value1, value2, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbActivityRmbNotBetween(String value1, String value2) {
            addCriterion("tb_activity_rmb not between", value1, value2, "tbActivityRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbIsNull() {
            addCriterion("tb_lowest_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbIsNotNull() {
            addCriterion("tb_lowest_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbEqualTo(String value) {
            addCriterion("tb_lowest_rmb =", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbNotEqualTo(String value) {
            addCriterion("tb_lowest_rmb <>", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbGreaterThan(String value) {
            addCriterion("tb_lowest_rmb >", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbGreaterThanOrEqualTo(String value) {
            addCriterion("tb_lowest_rmb >=", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbLessThan(String value) {
            addCriterion("tb_lowest_rmb <", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbLessThanOrEqualTo(String value) {
            addCriterion("tb_lowest_rmb <=", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbLike(String value) {
            addCriterion("tb_lowest_rmb like", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbNotLike(String value) {
            addCriterion("tb_lowest_rmb not like", value, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbIn(List<String> values) {
            addCriterion("tb_lowest_rmb in", values, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbNotIn(List<String> values) {
            addCriterion("tb_lowest_rmb not in", values, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbBetween(String value1, String value2) {
            addCriterion("tb_lowest_rmb between", value1, value2, "tbLowestRmb");
            return (Criteria) this;
        }

        public Criteria andTbLowestRmbNotBetween(String value1, String value2) {
            addCriterion("tb_lowest_rmb not between", value1, value2, "tbLowestRmb");
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