package com.bitfitfitnessprivatelimited.databindingsample_basic.pojo;

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/28/2018
 * TIME :5:27 PM.
 * DAY: Friday
 * Project: DataBindingSample_Basic
 */
public class EmpInfoModal {
    private String name;
    private int age;
    private String dept;
    private int emp_id;
    private String drawable;
    private long salaryPackage;
    private float avgRate;

    public EmpInfoModal(String name, int age, String dept, int emp_id, String drawable, long salaryPackage, float avgRate) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.emp_id = emp_id;
        this.drawable = drawable;
        this.salaryPackage = salaryPackage;
        this.avgRate = avgRate;
    }


    public boolean checkToShowRating() {
        if (avgRate > 0) {
            return true;
        } else {
            return false;
        }
    }
    public float getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(float avgRate) {
        this.avgRate = avgRate;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public long getSalaryPackage() {
        return salaryPackage;
    }

    public void setSalaryPackage(long salaryPackage) {
        this.salaryPackage = salaryPackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getDrawable() {
        return drawable;
    }

    public void setDrawable(String drawable) {
        this.drawable = drawable;
    }
}
