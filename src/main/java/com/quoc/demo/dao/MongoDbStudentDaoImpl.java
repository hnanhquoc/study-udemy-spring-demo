package com.quoc.demo.dao;

import com.quoc.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class MongoDbStudentDaoImpl implements StudentDao {


//    private final MongoDbTem

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        return null;
    }

    @Override
    public int updateStudentById(UUID studentId, Student newStudent) {
        return 0;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        return 0;
    }
}
