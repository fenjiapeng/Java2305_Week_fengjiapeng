package com.qfedu.fengjiapeng.pojo;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:37
 *   `did` int NOT NULL,
 *   `dname` varchar(255) DEFAULT NULL,
 *   `loc` varchar(255) DEFAULT NULL COMMENT '地址',
 */
public class Dept {
    private Integer did;
    private String dname;
    private String loc;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
