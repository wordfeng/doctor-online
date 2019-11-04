package cn.ojbkfeng.bean;

import java.util.Date;

public class Patient {
    private Integer id;

    private String name;

    private String shenFenZhengId;

    private Byte gender;

    private String phoneNumber;

    private String address;

    private Date guHaoTime;

    private String keShi;

    private Byte cure;

    private String doctor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShenFenZhengId() {
        return shenFenZhengId;
    }

    public void setShenFenZhengId(String shenFenZhengId) {
        this.shenFenZhengId = shenFenZhengId == null ? null : shenFenZhengId.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getGuHaoTime() {
        return guHaoTime;
    }

    public void setGuHaoTime(Date guHaoTime) {
        this.guHaoTime = guHaoTime;
    }

    public String getKeShi() {
        return keShi;
    }

    public void setKeShi(String keShi) {
        this.keShi = keShi == null ? null : keShi.trim();
    }

    public Byte getCure() {
        return cure;
    }

    public void setCure(Byte cure) {
        this.cure = cure;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor == null ? null : doctor.trim();
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shenFenZhengId='" + shenFenZhengId + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", guHaoTime=" + guHaoTime +
                ", keShi='" + keShi + '\'' +
                ", cure=" + cure +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}