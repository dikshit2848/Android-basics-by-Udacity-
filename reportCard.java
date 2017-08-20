package com.example.android.reportcard;

public class reportCard {
    private String subjectName;
    private String Grade;

    public reportCard(String Subject, String grades) {
        subjectName = Subject;
        Grade = grades;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String Subject) {
        subjectName = Subject;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grades) {
        Grade = grades;
    }

    @Override
    public String toString() {
        return subjectName + " " + Grade;
    }
}
