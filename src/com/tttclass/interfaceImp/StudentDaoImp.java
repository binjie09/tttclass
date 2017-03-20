package com.tttclass.interfaceImp; 
 
 
import java.sql.Connection;

import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.tttclass.database.interfac.StudentDbo;
import com.tttclass.entity.Student;
import com.tttclass.entity.StudentBehave;
import com.tttclass.util.JdbcUtils; 

public class StudentDaoImp implements StudentDbo
{ 
	
	private static QueryRunner runner = new QueryRunner();   
	
	/**
	 * 增加一个学生记录
	 */
	
	@Override
	public void create(Student student) {  
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "insert into tb_student values(?,?,?,?,?,?)"; 
			runner.update(con, sql,student.getsID(),student.getsName(),student.getsPassword(),student.getsClassNumber(),student.getsPhoneNumber(),student.getsPhoneNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

	/**
	 * 修改原有的学生记录
	 */  
	
	@Override
	public void update(Student student) {
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "update tb_student set sName=?,sPassword=?,sClassNumber=?,sPhoneNumber=?,sPhotoPath=? where sID=?";
			runner.update(con, sql,student.getsName(),student.getsPassword(),student.getsClassNumber(),student.getsPhoneNumber(),student.getsPhoneNumber(),student.getsID());
		} catch (Exception e) {
			e.printStackTrace();
		}  
		
	}

	/**
	 * 修改原有的学生图片路径
	 */ 
	
	@Override
	public void updatePhoto(String sID, String photoPath) { 
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "update tb_student set sPhotoPath = ? where sID=?"; //id
			runner.update(con, sql,photoPath,sID);
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
 
	/**
	 * 删除一个已有的学生记录(根据id查找)
	 */
	
	
	@Override
	public void deleteByID(String sID) { 
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "delete from tb_student where sID=?";  
			runner.update(con, sql,sID);
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

	/**
	 * 查询出所有的学生记录(遍历输出所有的数据库记录)
	 */
	
	@Override
	public List<Student> findAll() {  
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_student";
			List<Student> result = runner.query(con, sql, new BeanListHandler<Student>(Student.class));
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据id查找相应的学生记录
	 */
	@Override
	public Student findByID(String sID) {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_student where sID = ?";
			Student result = runner.query(con, sql, new BeanHandler<Student>(Student.class),sID);
			System.out.println(result.toString());
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据班级查找相应的学生记录
	 */
	@Override
	public List<Student> findByClass(String sClassNumber) {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_student where sClassNumber = ?";
			List<Student> result = runner.query(con, sql, new BeanListHandler<Student>(Student.class),sClassNumber);
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据姓名查找学生记录
	 */
	
	@Override
	public List<Student> findByName(String sName) {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_student where sName = ?";
			List<Student> result = runner.query(con, sql, new BeanListHandler<Student>(Student.class),sName);
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据照片路径查找相应的学生记录
	 */
	
	@Override
	public String findPhotoByID(String sID) {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_student where sID = ?";
			Student student = runner.query(con, sql, new BeanHandler<Student>(Student.class),sID);
			return student.getsPhotoPath();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 查找相应的学生是否好好听课
	 */
	
	@Override
	public boolean checkOnline(Student student) {
		
		return false;
	}

	/**
	 * 查找正在休眠的学生
	 */
	
	@Override
	public boolean isSleep(Student student) {
		
		return false;
	}

	/**
	 * 根据相应行为的id查找相应的 学生
	 */
	
	@Override
	public List<StudentBehave> findBehaveBysID(String sID, Date beginDate, Date endDate) {
		return null;
	}

}
