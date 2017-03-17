package interfaceImp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.tttclass.database.interfac.ClassDbo;
import com.tttclass.entity.ClassBehave;
import com.tttclass.util.JdbcUtils;

public class ClassDaoImpl implements ClassDbo
{
    private QueryRunner runner = new QueryRunner();
    
    /**
     * 返回所有的教师课堂记录
     */
	@Override
	public List<String> findClasses() { 
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from tb_classbehave";
			List<ClassBehave> classList = runner.query(con,sql,new BeanListHandler<ClassBehave>(ClassBehave.class));
		} catch (ClassNotFoundException | SQLException | IOException e) { 
			e.printStackTrace();
		} 
		return null;
	}

	/**
	 * 根据课堂编号进行相应课堂行为记录的查找
	 */
	@Override
	public List<ClassBehave> findClassBehaveByClassNumber(String cNumber, Date beginDate, Date endDate) {
		return null;
	}

}
