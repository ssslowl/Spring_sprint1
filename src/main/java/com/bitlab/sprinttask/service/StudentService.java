package com.bitlab.sprinttask.service;

import com.bitlab.sprinttask.entity.Student;
import com.bitlab.sprinttask.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getSortedStudents() {
        return studentRepository.findAll();
    }


    public  Student addStudent(Student student){

        int exam = student.getExam();

        if(exam >= 90){
            student.setMark("A");
        } else if (75 <= exam) {
            student.setMark("B");

        }else if (60 <= exam) {
            student.setMark("C");

        }else if (50 <= exam) {
            student.setMark("D");
        }else{
            student.setMark("F");
        }


        return studentRepository.save(student);
    }





}
