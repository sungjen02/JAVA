package score_mgm_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ScoreDAO {
	//Field
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521";
	private String user = "scott";
	private String pass = "tiger";;
	
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	//Constructor
	public ScoreDAO() {
		try {
			Class.forName(driver);
			System.out.println("--------> 1단계 성공");
			
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("--------> 2단계 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Method
	public void getStatement() {
		try {
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//getStatement
	
	public void getPreparedStatement(String sql) {
		int result = 0;
		
//		getPreparedStatement(sql);
		
		
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//getPreparedStatement
	
	//insert
	public int getResultInsert(ScoreVO vo) {
		int result = 0;
		String sql = "insert into score values(?,?,?,?,?, sysdate)";
		getPreparedStatement(sql);
		
		try {				
			//pstmt 객체에 데이터 바인딩!!
			pstmt.setString(1, vo.getStuno());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getKor());
			pstmt.setInt(4, vo.getEng());
			pstmt.setInt(5, vo.getMath());
			
			result = pstmt.executeUpdate();
			
//			String sql = "insert into score values("
//							+"'"+vo.getStuno() + "',"
//							+"'"+vo.getName() + "',"
//							+vo.getKor() + ","
//							+vo.getEng() + ","
//							+vo.getMath() + ","
//							+ " sysdate)";
//			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//list
	public ArrayList<ScoreVO> getResultList(){
		ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
		String sql = "SELECT ROWNUM RNO, STUNO, NAME, KOR, ENG, MATH, TO_CHAR(SDATE,'YYYY/MM/DD') SDATE" + 
				"	FROM (SELECT * FROM SCORE ORDER BY STUNO ASC)";
		getPreparedStatement(sql);
		
		
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setRno(rs.getInt(1));
				vo.setStuno(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setKor(rs.getInt(4));
				vo.setEng(rs.getInt(5));
				vo.setMath(rs.getInt(6));
				vo.setSdate(rs.getString(7));
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//close
	public void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
