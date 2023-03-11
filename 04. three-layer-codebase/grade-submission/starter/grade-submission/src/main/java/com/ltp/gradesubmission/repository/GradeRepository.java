package com.ltp.gradesubmission.repository;

import java.util.ArrayList;
import java.util.List;

import com.ltp.gradesubmission.Grade;

public class GradeRepository {

    private List<Grade> sutedentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return sutedentGrades.get(index);
    }

    public void addGrade(Grade grade) {
        sutedentGrades.add(grade);
    }

    public void updateGrade(int index, Grade grade) {
        sutedentGrades.set(index, grade);
    }

    public List<Grade> getGrades() {
        return sutedentGrades;
    }
}
