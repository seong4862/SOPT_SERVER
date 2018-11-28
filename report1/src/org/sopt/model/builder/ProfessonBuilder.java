package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessonBuilder {
    //교수 고유 번호
    private int professorIdx;
    //교수 이름
    private String professorName;
    //교수 전화번호
    private String professorPhone;
    //담당 과목
    private String subject;

    public ProfessonBuilder setProfessorIdx(final int professorIdx) {
        this.professorIdx = professorIdx;
        return this;
    }

    public ProfessonBuilder setProfessorName(final String professorName) {
        this.professorName = professorName;
        return this;
    }

    public ProfessonBuilder setProfessorPhone(final String professorPhone) {
        this.professorPhone = professorPhone;
        return this;
    }

    public ProfessonBuilder setSubject(final String subject) {
        this.subject = subject;
        return this;
    }

    public Professor build() {
        return new Professor(this.professorIdx, this.professorName, this.professorPhone, this.subject);
    }
}
