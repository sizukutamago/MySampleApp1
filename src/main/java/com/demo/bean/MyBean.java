package com.demo.bean;

import java.util.Calendar;
import java.util.Date;

public class MyBean implements MyBeanInterface {
    private Date date;
    private String message;

    public MyBean() {
        super();
        date = Calendar.getInstance().getTime();
    }

    public MyBean(String message) {
        this();
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "date=" + date +
                ", message='" + message + '\'' +
                '}';
    }
}
