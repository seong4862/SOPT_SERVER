package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //제네릭을 사용해 학생 타입 ArrayList 생성
        final ArrayList<Student> studentList = new ArrayList<Student>();
        final ArrayList<Professor> professorList = new ArrayList<Professor>();
        final ArrayList<Department> departmentList = new ArrayList<Department>();
        final ArrayList<University> universityList = new ArrayList<University>();

        //3개의 학생과 객체 생성
        for (int i = 0; i < 3; i++) {
            studentList.add(new Student());
            universityList.add(new University());
            departmentList.add(new Department());
            professorList.add(new Professor());
        }

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for (final Student s : studentList) {
            System.out.println(s.toString());
        }
        for (final Professor p : professorList) {
            System.out.println(p.toString());
        }
        for (final Department d : departmentList) {
            System.out.println(d.toString());
        }
        for (final University u : universityList) {
            System.out.println(u.toString());
        }
    }
}
