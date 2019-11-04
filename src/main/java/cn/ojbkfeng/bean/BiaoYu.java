package cn.ojbkfeng.bean;

public class BiaoYu {
    private Integer id;

    private String biaoyu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiaoyu() {
        return biaoyu;
    }

    public void setBiaoyu(String biaoyu) {
        this.biaoyu = biaoyu == null ? null : biaoyu.trim();
    }
}