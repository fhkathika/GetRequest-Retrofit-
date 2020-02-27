package com.example.getrequestretrofit;

import com.google.gson.annotations.SerializedName;

public class Post2 {

//    private  int userid;
//    private int id;
//    private String title;

    private  String tname;
    private int tphone;




    @SerializedName("body")
//    private String text;
    private String taddress;

    public String getName() {
        return tname;
    }

    public void setName(String name) {
        this.tname = name;
    }

    public int getPhone() {
        return tphone;
    }

    public void setPhone(int phone) {
        this.tphone = phone;
    }

    public String getAddress() {
        return taddress;
    }

    public void setAddress(String address) {
        this.taddress = address;
    }
//    public int getUserid() {
//        return userid;
//    }
//
//    public void setUserid(int userid) {
//        this.userid = userid;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
}
