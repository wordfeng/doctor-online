package cn.ojbkfeng.bean;

public class Doctor extends DoctorKey {
    private String password;

    private String experience;

    private String pic;

    @Override
    public String toString() {
        return "Doctor{" +
                "password='" + password + '\'' +
                ", experience='" + experience + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}