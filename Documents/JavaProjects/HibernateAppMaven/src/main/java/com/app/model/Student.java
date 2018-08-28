package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentDetails")
public class Student {
    @Id
    @Column(name = "studentRoll")
    private int studId;
    @Column(name = "studentName")
    private String studName;
    @Column(name = "studentFee")
    private double studFee;

    public Student() {
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public double getStudFee() {
        return studFee;
    }

    public void setStudFee(double studFee) {
        this.studFee = studFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studFee=" + studFee +
                '}';
    }
}
