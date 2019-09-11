package com.moli.web.pojo;

import java.util.Date;

public class user {
    public String ip;
    public Date login_time;
    public String login_city;

    public String getLogin_city() {
        return login_city;
    }

    public void setLogin_city(String login_city) {
        this.login_city = login_city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }
}
