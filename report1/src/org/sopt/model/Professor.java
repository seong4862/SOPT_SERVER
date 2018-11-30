package org.sopt.model;

public class Professor {
    //교수 고유 번호
    private int professorIdx;
    //교수 이름
    private String professorName;
    //교수 학과

    //교수 전화번호
    private String professorPhone;
    //담당 과목
    private String subject;

    public Professor() {
    }

    public Professor(final int professorIdx, final String professorName, final String professorPhone, final String subject) {
        super();
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.professorPhone = professorPhone;
        this.subject = subject;
    }


    public int getProfessorIdx() {
        return professorIdx;
    }

    public void setProfessorIdx(final int professorIdx) {
        this.professorIdx = professorIdx;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(final String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorPhone() {
        return professorPhone;
    }

    public void setProfessorPhone(final String professorPhone) {
        this.professorPhone = professorPhone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorIdx=" + professorIdx +
                ", professorName='" + professorName + " \' " +
                ", professorPhone='" + professorPhone + " \' " +
                ", subject='" + subject + " \' " +
                '}';
    }
}
