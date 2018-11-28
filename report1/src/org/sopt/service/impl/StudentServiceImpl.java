package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getByStudentIdx(int studentIdx) {
        //Builder로 객체 생성해서 반환
        final StudentBuilder studentBuilder = new StudentBuilder();
        final Student student = studentBuilder.setStudentIdx(studentIdx).build();
        return student;
    }
}
