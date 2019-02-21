package com.xpu.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employee {

    private Long id;
    private String realName;
    private String sexStr;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private String mobile;
    private String email;
    private String position;
    private String note;

    private Integer sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    public Date getBirthday() {
        return birthday;
    }

    public String getSexStr() {
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
