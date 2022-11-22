package com.atguigu.spring.pojo;/**
 * @author DingDi
 * @create 2022-10-02 13:41
 */

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 13:41
 */
public class Clazz {
    private Integer cid;
    private String cname;
    private List<Student> students;


    public Clazz(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Clazz() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
