package co.kgggy.prj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private String driver="oracle.jdbc.driver.OracleDriver"; //Reference Library(ojdbc6_g 이름)
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "kgggy";
	private String password = "1234";
	
	public Connection conn;  //연결객체(DB와)
	
	public DAO() {
		try {
			Class.forName(driver);  //jdbc드라이버를 내 프로젝트에 올림(사용할 수 있도록 하는 구문.)
			conn = DriverManager.getConnection(url, user, password);  //DriverManager를 이용해 DBMS와 연결.(주소, 아이디, 비번 던짐)
			System.out.println("DB 연결 성공");
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("DB 연결 실패!!!!"); //예외처리 => 같은 오류지만 원인 해결하면 정상동작, 에러 => 아예 프로그램이 작동하지 않음.
		}
	}
	
}
