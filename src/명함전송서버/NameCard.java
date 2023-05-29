package 명함전송서버;

import java.io.Serializable;

public class NameCard implements Serializable {
    private String name;
    private String phoneNum;
    private String mail;
    private String company;

    public NameCard(String name, String phoneNum, String mail, String company) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.mail = mail;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        phoneNum = phoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
