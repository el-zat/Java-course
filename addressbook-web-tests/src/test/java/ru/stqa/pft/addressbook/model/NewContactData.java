package ru.stqa.pft.addressbook;

public class NewContactData {
    private final String firstname;
    private final String lastname;
    private final String nickname;
    private final String mobile;
    private final String email;
    private final String bday;
    private final String bmonth;
    private final String byear;
    private final String homepage;
    private final String company;

    public NewContactData(String firstname, String lastname, String nickname, String mobile, String email, String bday, String bmonth, String byear, String homepage, String company) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.mobile = mobile;
        this.email = email;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.homepage = homepage;
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getCompany() {
        return company;
    }
}
