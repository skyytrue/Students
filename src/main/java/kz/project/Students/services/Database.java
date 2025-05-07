package kz.project.Students.services;

import kz.project.Students.model.Students;
import lombok.Getter;

import java.util.ArrayList;

import java.util.List;

public class Database {

    @Getter
    public static List<Students> students=new ArrayList<>();

    static {
        students.add(new Students(1L, "Iliyas", "Zhuanishev", 88, "B","Strong"));
        students.add(new Students(2L, "Serik", "Erikov", 91, "A","Strong"));
        students.add(new Students(3L, "Erik", "Serikov", 65, "C","Strong"));
        students.add(new Students(4L, "Nurzhan", "Bolatov", 48, "F","not Bad"));
        students.add(new Students(5L, "Patrick", "Assetova", 100, "A","Strong"));

    }

//    private static long id = 6L;
//    public static void addStudents(String name,String surname, int exam, String mark) {
//        Students newStudent = Students.builder()
//                .name(name)
//                .surname(surname)
//                .exam(exam)
//                .mark(mark)
//                .id(students.size()+1L)
//                .build();
//
//
//        students.add(newStudent);
//
//    }
    public static void addStudent(Students student) {
        student.setId(students.size()+1L);

        String group;
        String mark;


        if(student.getExam()>=50 && student.getExam()>=90){
            group="Strong";
            mark="A";

        }else if(student.getExam()>=50 && student.getExam()>=75 && student.getExam()<=89){
            group="Strong";
            mark="B";
        }
        else if(student.getExam()>=50 && student.getExam()>=60 && student.getExam()<=74){
            group="Strong";
            mark="C";
        }
        else if(student.getExam()>=50 && student.getExam()>=50 && student.getExam()<=59){
            group="Strong";
            mark="D";
        }
        else{
            group="not Bad";
            mark="F";
        }

        student.setMark(mark);
        student.setGroup(group);
        students.add(student);
    }

    public static Students getStudentById(Long id) {

        return students.stream().filter((s->s.getId()==id)).findFirst().get();
    }

    public static void deleteStudentById(Long id) {
        students.removeIf((s->s.getId()==id));
    }


}
