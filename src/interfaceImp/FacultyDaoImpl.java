package interfaceImp;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.tttclass.database.interfac.FacultyDbo;
import com.tttclass.entity.Faculty; 
import com.tttclass.util.JdbcUtils;

public class FacultyDaoImpl implements FacultyDbo
{ 
	
private static QueryRunner runner = new QueryRunner();  
	/**
	 * 增加一个教师监控成员记录
	 */

     @Override
     public void create(Faculty faculty) {
    	 try {
 			Connection con = JdbcUtils.getConnection();
 			String sql = "insert into tb_faculty values(?,?,?,?,?)"; 
 			runner.update(con, sql,faculty.getfID(),faculty.getfUsername(),faculty.getfRealname(),faculty.getfPassword(),faculty.getfPhotoPath());
 		} catch (Exception e) {
 			e.printStackTrace();
 		}  
    }  
     
     /**
      * 查询现有的所有教师成员的信息
      */
	
	@Override
	public List<Faculty> findAll() {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_faculty";
			List<Faculty> result = runner.query(con, sql, new BeanListHandler<Faculty>(Faculty.class));
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据教师姓名查找相应教师工的信息
	 */
	@Override
	public List<Faculty> findByRealname(String fRealname) { 
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_faculty where fRealname = ?";
			List<Faculty> result = runner.query(con, sql, new BeanListHandler<Faculty>(Faculty.class),fRealname);
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	
	/**
	 * 根据其真实姓名查找相应的教师职工信息
	 */
	
	@Override
	public Faculty findByUsername(String fUsername) {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_faculty where fUserName = ?";
			Faculty result = runner.query(con, sql, new BeanHandler<Faculty>(Faculty.class),fUsername);
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * 根据教师工id查找其对应的信息
	 */
	@Override
	public Faculty findByID(String fID) {
		try{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_faculty where fID = ?";
			Faculty result = runner.query(con, sql, new BeanHandler<Faculty>(Faculty.class),fID);
			System.out.println(result.toString());
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 修改现存教师工的信息
	 */
	@Override
	public void update(Faculty faculty) {
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "update tb_faculty set fUserName=?,fRealName=?,fPassword=?,fPhotoPath=? where fID=?";
			runner.update(con, sql,faculty.getfUsername(),faculty.getfRealname(),faculty.getfPassword(),faculty.getfPhotoPath(),faculty.getfID());
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

	/**
	 * 修改现存教师工的照片
	 */
	@Override
	public void updatePhoto(String fID, String photoPath) {
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "update tb_faculty set fPhotoPath = ? where fID=?"; //id
			runner.update(con, sql,photoPath,fID);
		} catch (Exception e) {
			e.printStackTrace();
		}   
	}

	/**
	 * 删除对应教师工的记录
	 */
	@Override
	public void deleteById(String fID) {
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "delete from tb_faculty where fID=?";  
			runner.update(con, sql,fID);
		} catch (Exception e) {
			e.printStackTrace();
		}   
	}

	@Override
	public String findPhotoByID(String fID) { 
		return null;
	}

}
