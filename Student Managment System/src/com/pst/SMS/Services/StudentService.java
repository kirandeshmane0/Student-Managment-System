package com.pst.SMS.Services;

import com.pst.SMS.dao.StudentDao;
import com.pst.SMS.vo.StudentVo;
import com.pst.bo.StudentBo;

public class StudentService {

	StudentDao studentDao = null;
	StudentBo studentBo = null;
	
	public int saveStudent(StudentVo studentVo){
		// bussine operation/ logic
		
		studentDao = new StudentDao();
		studentBo = new StudentBo();
		
		studentBo.setRollNumber(studentVo.getRollNumber());
		studentBo.setName(studentVo.getName());
		studentBo.setGender(studentVo.getGender());
		studentBo.setCourse(studentVo.getCourse());
		
		int i = studentDao.addStudent(studentBo);
		return i;
	}
	
}
