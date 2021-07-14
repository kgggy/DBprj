package co.kgggy.prj;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="kgggy";
	private String password="1234";
	
	public Connection conn;
	
	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공~!");
		}catch(Exception e) { //모든 예외.
			System.out.println("DB 연결이 안되었거나 클래스가 없어!!");
		}
	}
}
