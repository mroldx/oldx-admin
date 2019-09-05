package com.moli.web.utils;
/**
 * Copyright 2019 bejson.com
 */

/**
 * Auto-generated: 2019-07-27 22:42:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class IpPojo {

    private String IP;
    private String Country;
    private String Province;
    private String City;
    private String District;
    private String Isp;
    public void setIP(String IP) {
        this.IP = IP;
    }
    public String getIP() {
        return IP;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    public String getCountry() {
        return Country;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }
    public String getProvince() {
        return Province;
    }

    public void setCity(String City) {
        this.City = City;
    }
    public String getCity() {
        return City;
    }

    public void setDistrict(String District) {
        this.District = District;
    }
    public String getDistrict() {
        return District;
    }

    public void setIsp(String Isp) {
        this.Isp = Isp;
    }
    public String getIsp() {
        return Isp;
    }

    @Override
    public String toString() {
        return "IpPojo{" +
                "IP='" + IP + '\'' +
                ", Country='" + Country + '\'' +
                ", Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                ", Isp='" + Isp + '\'' +
                '}';
    }
}