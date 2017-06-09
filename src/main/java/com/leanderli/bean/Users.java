package com.leanderli.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public class Users implements Serializable {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uTel;

    private String uEmail;

    private String uAddress;

    @Override
    public String toString() {
        return "Users：[uId=" + uId + "，uName=" + uName + "，uPassword=" + uPassword + "，uTel=" + uTel + "，uEmail=" + uEmail + "，uAddress=" + uAddress + "]";
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }
}
