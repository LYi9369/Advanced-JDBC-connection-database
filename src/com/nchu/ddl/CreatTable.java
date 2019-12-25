package com.nchu.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);
		// 3、编写sql语句
		String sql = "create table stu(id int, name varchar(50), age int)";
		Statement st = conn.createStatement();// 将获取的数据库对象赋给st
		// 4、执行sql
		int row = st.executeUpdate(sql);// st.executeUpdate(sql)执行了sql语句，并将int类型的结果返回row
		// 5、释放资源
		st.close();
		conn.close();
	}
}
