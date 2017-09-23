package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();

	@Override
	public StudentModel selectStudent(String npm) {
		// implement
		for (int i = 0; i < studentList.size(); i++) {
			if (npm.equalsIgnoreCase(studentList.get(i).getNpm())) {
				return studentList.get(i);
			}
		}
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}

	@Override
	public StudentModel deleteStudent(String npm) {
		for (int i = 0; i < studentList.size(); i++) {
			if (npm.equalsIgnoreCase(studentList.get(i).getNpm())) {
				return studentList.remove(i);
			}
		}
		return null;
	}

}
