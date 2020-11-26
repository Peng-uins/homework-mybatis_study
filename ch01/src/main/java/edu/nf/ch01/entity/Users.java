package edu.nf.ch01.entity;

public class Users {
    private int uid;
    private String userName;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public Users() {
    }

    public Users(int uid, String userName) {
        this.uid = uid;
        this.userName = userName;
    }
}
