package com.loong.sa.entity;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/9/27.
 */
public class User {
    public User() {
    }


    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(String id, String username, String password, String realname, String email, String address, int zip, String identityCard) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.email = email;
        this.address = address;
        this.zip = zip;
        this.identityCard = identityCard;
    }

    public User(String id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the realname
     */
    public String getRealname() {
        return realname;
    }
    /**
     * @param realname
     *            the realname to set
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }
    /**
     * @param zip
     *            the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }
    /**
     * @return the identityCard
     */
    public String getIdentityCard() {
        return identityCard;
    }
    /**
     * @param identityCard
     *            the identityCard to set
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    /**
     * id
     */
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 邮编
     */
    private int zip;
    /**
     * 身份证
     */
    private String identityCard;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getId().equals(user.getId());

    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
