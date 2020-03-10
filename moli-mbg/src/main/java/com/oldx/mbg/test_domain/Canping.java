package com.oldx.mbg.test_domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Canping implements Serializable {
    @ApiModelProperty(value = "产品编码")
    private String skuId;

    @ApiModelProperty(value = "产品品类")
    private String productCategory;

    @ApiModelProperty(value = "产品名称")
    private String productName;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "供应商")
    private String supplier;

    @ApiModelProperty(value = " 电池状况")
    private String batteryCondition;

    @ApiModelProperty(value = "是否带磁")
    private String isMagnetic;

    @ApiModelProperty(value = "产品包装长cm")
    private Integer length;

    @ApiModelProperty(value = "产品包装宽cm")
    private Integer width;

    @ApiModelProperty(value = "产品包装高cm")
    private Integer high;

    @ApiModelProperty(value = "泡重")
    private String bubbleWeight;

    @ApiModelProperty(value = "产品原包装重量g")
    private String productOriginalPackageWeight;

    @ApiModelProperty(value = " 实际发货重量g")
    private String actualDeliveryWeight;

    @ApiModelProperty(value = "国际运费rmb")
    private String internationalShippingRmb;

    @ApiModelProperty(value = "国内运费rmb")
    private String domesticFreightRmb;

    @ApiModelProperty(value = "采购成本价rmb")
    private String purchaseCostRmb;

    @ApiModelProperty(value = "官方零售价rmb")
    private String officialRetailPriceRmb;

    @ApiModelProperty(value = "官方零售价usd")
    private String officialRetailPriceUsd;

    @ApiModelProperty(value = "Ali3C标价USD")
    private String ali3cPriceUsd;

    @ApiModelProperty(value = "Ali3C零售价USD")
    private String ali3cRetailPriceUsd;

    @ApiModelProperty(value = "Ali3C活动价USD ")
    private String ali3cActivityPriceUsd;

    @ApiModelProperty(value = "Ali3C最低价（USD）")
    private String ali3cLowestUsd;

    @ApiModelProperty(value = "AliToy标价（USD）")
    private String alitoyPriceUsd;

    @ApiModelProperty(value = "AliToy零售价（USD）")
    private String alitoyRetailPriceUsd;

    @ApiModelProperty(value = "AliToy活动价（USD）")
    private String alitoyActivityUsd;

    @ApiModelProperty(value = "AliToy最低价（USD）")
    private String alitoyLowestUsd;

    @ApiModelProperty(value = "TB标价（RMB）")
    private String tbPriceRmb;

    @ApiModelProperty(value = "TB零售价（RMB）")
    private String tbRetailPriceRmb;

    @ApiModelProperty(value = "TB活动价（RMB）")
    private String tbActivityRmb;

    @ApiModelProperty(value = "TB最低价（RMB）")
    private String tbLowestRmb;

    private static final long serialVersionUID = 1L;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getBatteryCondition() {
        return batteryCondition;
    }

    public void setBatteryCondition(String batteryCondition) {
        this.batteryCondition = batteryCondition;
    }

    public String getIsMagnetic() {
        return isMagnetic;
    }

    public void setIsMagnetic(String isMagnetic) {
        this.isMagnetic = isMagnetic;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public String getBubbleWeight() {
        return bubbleWeight;
    }

    public void setBubbleWeight(String bubbleWeight) {
        this.bubbleWeight = bubbleWeight;
    }

    public String getProductOriginalPackageWeight() {
        return productOriginalPackageWeight;
    }

    public void setProductOriginalPackageWeight(String productOriginalPackageWeight) {
        this.productOriginalPackageWeight = productOriginalPackageWeight;
    }

    public String getActualDeliveryWeight() {
        return actualDeliveryWeight;
    }

    public void setActualDeliveryWeight(String actualDeliveryWeight) {
        this.actualDeliveryWeight = actualDeliveryWeight;
    }

    public String getInternationalShippingRmb() {
        return internationalShippingRmb;
    }

    public void setInternationalShippingRmb(String internationalShippingRmb) {
        this.internationalShippingRmb = internationalShippingRmb;
    }

    public String getDomesticFreightRmb() {
        return domesticFreightRmb;
    }

    public void setDomesticFreightRmb(String domesticFreightRmb) {
        this.domesticFreightRmb = domesticFreightRmb;
    }

    public String getPurchaseCostRmb() {
        return purchaseCostRmb;
    }

    public void setPurchaseCostRmb(String purchaseCostRmb) {
        this.purchaseCostRmb = purchaseCostRmb;
    }

    public String getOfficialRetailPriceRmb() {
        return officialRetailPriceRmb;
    }

    public void setOfficialRetailPriceRmb(String officialRetailPriceRmb) {
        this.officialRetailPriceRmb = officialRetailPriceRmb;
    }

    public String getOfficialRetailPriceUsd() {
        return officialRetailPriceUsd;
    }

    public void setOfficialRetailPriceUsd(String officialRetailPriceUsd) {
        this.officialRetailPriceUsd = officialRetailPriceUsd;
    }

    public String getAli3cPriceUsd() {
        return ali3cPriceUsd;
    }

    public void setAli3cPriceUsd(String ali3cPriceUsd) {
        this.ali3cPriceUsd = ali3cPriceUsd;
    }

    public String getAli3cRetailPriceUsd() {
        return ali3cRetailPriceUsd;
    }

    public void setAli3cRetailPriceUsd(String ali3cRetailPriceUsd) {
        this.ali3cRetailPriceUsd = ali3cRetailPriceUsd;
    }

    public String getAli3cActivityPriceUsd() {
        return ali3cActivityPriceUsd;
    }

    public void setAli3cActivityPriceUsd(String ali3cActivityPriceUsd) {
        this.ali3cActivityPriceUsd = ali3cActivityPriceUsd;
    }

    public String getAli3cLowestUsd() {
        return ali3cLowestUsd;
    }

    public void setAli3cLowestUsd(String ali3cLowestUsd) {
        this.ali3cLowestUsd = ali3cLowestUsd;
    }

    public String getAlitoyPriceUsd() {
        return alitoyPriceUsd;
    }

    public void setAlitoyPriceUsd(String alitoyPriceUsd) {
        this.alitoyPriceUsd = alitoyPriceUsd;
    }

    public String getAlitoyRetailPriceUsd() {
        return alitoyRetailPriceUsd;
    }

    public void setAlitoyRetailPriceUsd(String alitoyRetailPriceUsd) {
        this.alitoyRetailPriceUsd = alitoyRetailPriceUsd;
    }

    public String getAlitoyActivityUsd() {
        return alitoyActivityUsd;
    }

    public void setAlitoyActivityUsd(String alitoyActivityUsd) {
        this.alitoyActivityUsd = alitoyActivityUsd;
    }

    public String getAlitoyLowestUsd() {
        return alitoyLowestUsd;
    }

    public void setAlitoyLowestUsd(String alitoyLowestUsd) {
        this.alitoyLowestUsd = alitoyLowestUsd;
    }

    public String getTbPriceRmb() {
        return tbPriceRmb;
    }

    public void setTbPriceRmb(String tbPriceRmb) {
        this.tbPriceRmb = tbPriceRmb;
    }

    public String getTbRetailPriceRmb() {
        return tbRetailPriceRmb;
    }

    public void setTbRetailPriceRmb(String tbRetailPriceRmb) {
        this.tbRetailPriceRmb = tbRetailPriceRmb;
    }

    public String getTbActivityRmb() {
        return tbActivityRmb;
    }

    public void setTbActivityRmb(String tbActivityRmb) {
        this.tbActivityRmb = tbActivityRmb;
    }

    public String getTbLowestRmb() {
        return tbLowestRmb;
    }

    public void setTbLowestRmb(String tbLowestRmb) {
        this.tbLowestRmb = tbLowestRmb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuId=").append(skuId);
        sb.append(", productCategory=").append(productCategory);
        sb.append(", productName=").append(productName);
        sb.append(", brand=").append(brand);
        sb.append(", supplier=").append(supplier);
        sb.append(", batteryCondition=").append(batteryCondition);
        sb.append(", isMagnetic=").append(isMagnetic);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", high=").append(high);
        sb.append(", bubbleWeight=").append(bubbleWeight);
        sb.append(", productOriginalPackageWeight=").append(productOriginalPackageWeight);
        sb.append(", actualDeliveryWeight=").append(actualDeliveryWeight);
        sb.append(", internationalShippingRmb=").append(internationalShippingRmb);
        sb.append(", domesticFreightRmb=").append(domesticFreightRmb);
        sb.append(", purchaseCostRmb=").append(purchaseCostRmb);
        sb.append(", officialRetailPriceRmb=").append(officialRetailPriceRmb);
        sb.append(", officialRetailPriceUsd=").append(officialRetailPriceUsd);
        sb.append(", ali3cPriceUsd=").append(ali3cPriceUsd);
        sb.append(", ali3cRetailPriceUsd=").append(ali3cRetailPriceUsd);
        sb.append(", ali3cActivityPriceUsd=").append(ali3cActivityPriceUsd);
        sb.append(", ali3cLowestUsd=").append(ali3cLowestUsd);
        sb.append(", alitoyPriceUsd=").append(alitoyPriceUsd);
        sb.append(", alitoyRetailPriceUsd=").append(alitoyRetailPriceUsd);
        sb.append(", alitoyActivityUsd=").append(alitoyActivityUsd);
        sb.append(", alitoyLowestUsd=").append(alitoyLowestUsd);
        sb.append(", tbPriceRmb=").append(tbPriceRmb);
        sb.append(", tbRetailPriceRmb=").append(tbRetailPriceRmb);
        sb.append(", tbActivityRmb=").append(tbActivityRmb);
        sb.append(", tbLowestRmb=").append(tbLowestRmb);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}