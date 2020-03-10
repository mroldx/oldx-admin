package com.oldx.mbg.test_domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ExchangeRate implements Serializable {
    @ApiModelProperty(value = "美元汇率")
    private String meiyuanHuilv;

    @ApiModelProperty(value = "ali3C零售价毛利率")
    private String ali3cLingshouMaolilv;

    @ApiModelProperty(value = "ali3c活动价毛利率")
    private String ali3cHuodongjiaMaolilv;

    @ApiModelProperty(value = "ali3c最低价毛利率")
    private String ali3cZuidijiaMaolilv;

    @ApiModelProperty(value = "alitoy零售价毛利率")
    private String alitoyLingshoujiaMaolilv;

    @ApiModelProperty(value = "TB零售价毛利率")
    private String tbLingshoujiaMaolilv;

    @ApiModelProperty(value = "tb活动价毛利率")
    private String tbHuodongjiaMaolilv;

    @ApiModelProperty(value = "tb最低售价毛利率")
    private String tbZuidishoujiaMaolilv;

    private static final long serialVersionUID = 1L;

    public String getMeiyuanHuilv() {
        return meiyuanHuilv;
    }

    public void setMeiyuanHuilv(String meiyuanHuilv) {
        this.meiyuanHuilv = meiyuanHuilv;
    }

    public String getAli3cLingshouMaolilv() {
        return ali3cLingshouMaolilv;
    }

    public void setAli3cLingshouMaolilv(String ali3cLingshouMaolilv) {
        this.ali3cLingshouMaolilv = ali3cLingshouMaolilv;
    }

    public String getAli3cHuodongjiaMaolilv() {
        return ali3cHuodongjiaMaolilv;
    }

    public void setAli3cHuodongjiaMaolilv(String ali3cHuodongjiaMaolilv) {
        this.ali3cHuodongjiaMaolilv = ali3cHuodongjiaMaolilv;
    }

    public String getAli3cZuidijiaMaolilv() {
        return ali3cZuidijiaMaolilv;
    }

    public void setAli3cZuidijiaMaolilv(String ali3cZuidijiaMaolilv) {
        this.ali3cZuidijiaMaolilv = ali3cZuidijiaMaolilv;
    }

    public String getAlitoyLingshoujiaMaolilv() {
        return alitoyLingshoujiaMaolilv;
    }

    public void setAlitoyLingshoujiaMaolilv(String alitoyLingshoujiaMaolilv) {
        this.alitoyLingshoujiaMaolilv = alitoyLingshoujiaMaolilv;
    }

    public String getTbLingshoujiaMaolilv() {
        return tbLingshoujiaMaolilv;
    }

    public void setTbLingshoujiaMaolilv(String tbLingshoujiaMaolilv) {
        this.tbLingshoujiaMaolilv = tbLingshoujiaMaolilv;
    }

    public String getTbHuodongjiaMaolilv() {
        return tbHuodongjiaMaolilv;
    }

    public void setTbHuodongjiaMaolilv(String tbHuodongjiaMaolilv) {
        this.tbHuodongjiaMaolilv = tbHuodongjiaMaolilv;
    }

    public String getTbZuidishoujiaMaolilv() {
        return tbZuidishoujiaMaolilv;
    }

    public void setTbZuidishoujiaMaolilv(String tbZuidishoujiaMaolilv) {
        this.tbZuidishoujiaMaolilv = tbZuidishoujiaMaolilv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", meiyuanHuilv=").append(meiyuanHuilv);
        sb.append(", ali3cLingshouMaolilv=").append(ali3cLingshouMaolilv);
        sb.append(", ali3cHuodongjiaMaolilv=").append(ali3cHuodongjiaMaolilv);
        sb.append(", ali3cZuidijiaMaolilv=").append(ali3cZuidijiaMaolilv);
        sb.append(", alitoyLingshoujiaMaolilv=").append(alitoyLingshoujiaMaolilv);
        sb.append(", tbLingshoujiaMaolilv=").append(tbLingshoujiaMaolilv);
        sb.append(", tbHuodongjiaMaolilv=").append(tbHuodongjiaMaolilv);
        sb.append(", tbZuidishoujiaMaolilv=").append(tbZuidishoujiaMaolilv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}