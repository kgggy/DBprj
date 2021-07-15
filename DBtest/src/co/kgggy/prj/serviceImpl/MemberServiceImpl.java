package co.kgggy.prj.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.kgggy.prj.DAO;
import co.kgggy.prj.service.MemberService;
import co.kgggy.prj.vo.MemberVO;

public class MemberServiceImpl extends DAO implements MemberService {
	// 답안지
	private PreparedStatement psmt; // PreparedStatement => 데이터베이스에 sql던지고 sql을실행시켜줌.
	private ResultSet rs; // 엑셀테이블 형태로 받아줌.(select)

	@Override
	public List<MemberVO> memberSelectList() {
		List<MemberVO> members = new ArrayList<MemberVO>(); // List<MemberVO>를 배열(ArrayList)형태로.
		MemberVO vo; // vo => 데이터를 읽거나 쓰는 기능.(숫자, 문자 모두 읽을 수 있도록 데이터타입 만들어주는 객체>??)
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql); // 초기화(sql 실어보냄 === select형태)
			rs = psmt.executeQuery(); // executeQuery => select형태이므로.
			while (rs.next()) { // 한 행씩 읽을게 있는지 반복 확인.
				vo = new MemberVO();
				vo.setId(rs.getString("id")); // "칼럼명"
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAge(rs.getInt("age"));
				members.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		String sql = "select * from member where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId()); // ?에 값을 담는 구문.
			rs = psmt.executeQuery();
			if (rs.next()) { // 한 행밖에 안오므로 if 사용 가능.
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int memberInsert(MemberVO vo) { // 자동으로 commit 됨.
		// TODO 데이터 삽입.
		int n = 0; // int값으로 리턴되므로.
		String sql = "insert into member values(?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId()); // ?에 대응됨.
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getAddress());
			psmt.setString(5, vo.getTel());
			psmt.setInt(6, vo.getAge());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO 데이터 삭제.
		int n = 0;
		String sql = "delete from member where id = ?"; // id가 유일한key(PK(Primary Key)이므로!)
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO 데이터 수정
		int n = 0;
		String sql = "update member set address = ?, tel = ?, name = ? where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getAddress());
			psmt.setString(2, vo.getTel());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

}
