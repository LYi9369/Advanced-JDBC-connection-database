package com.nchu.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {
	public static void main(String[] args) throws Exception {
		// 1、加载驱动
		// 把com.mysql.jdbc.Driver字节码加载进JVM
		// 当一份字节码被加载到JVM时，就会执行该字节码中的静态代码块
		Class.forName("com.mysql.jdbc.Driver");// 加载字节码

		// 2、获取连接对象
		/**
		 * url：数据库的地址 user：
		 *数据库的用户名 
		 *password：数据库的密码
		 */
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "root";
		/**
		 * 固定内容：jdbc.mysql localhost：地址 3306:MySQL的端口号 数据库名称
		 */
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
}
