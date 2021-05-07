package com.pst.SMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pst.SMS.Util.DbConnection;
import com.pst.bo.StudentBo;


public class StudentDao {
	

	private final String SAVE_STUDENT =" insert into student(rollnumber, name, gender, course)"
			+ "values(?,?,?,?)";
	
	
	public int addStudent(StudentBo studentBo){
		// Do data base operation / data base connection logic
		
		int i =0;
		try {
			Connection con = DbConnection.getConn();
			PreparedStatement ps = con.prepareStatement(SAVE_STUDENT);
			ps.setInt(1, studentBo.getRollNumber());
			ps.setString(2, studentBo.getName());
			ps.setString(3, studentBo.getGender());
			ps.setString(4, studentBo.getCourse());
			i = ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
			}
		return i;
		
	} 
}
