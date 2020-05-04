package p0429_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EventRegist {
	Scanner scanner = new Scanner(System.in);//main 위  전역변수
	String jdbcDriver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
public EventRegist() {
	connectDB();	
	System.out.println("# 이벤트 등록을 위해 이름과 이메일을 입력하세요.");
	System.out.print("이름: ");
	String uname=scanner.next();
	System.out.print("이메일: ");
	String email=scanner.next();
	registerUser(uname,email);
	printList();//입력한 내용을 뿌려주는 변수
}
	public void connectDB() {//connect DB:구조화시킴(메소드 구분) 관리하기쉬움
		
		try{
			Class.forName(jdbcDriver);
			System.out.println("데이터베이스 연결중..");
			con = DriverManager.getConnection(url,"root","1234");
			System.out.println("데이터베이스 연결성공..");
		}catch(Exception e){//Exception 하나로 묶어짐
			e.printStackTrace();
		}
	}
	public void printList(){
		System.out.println("# 등록자 명단#");
		String sql ="select * from event";
		try{
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();//쿼리 : 읽음, update : 입력
			while(rs.next()) {
			System.out.println(rs.getString(1)+","+rs.getString("email"));//==index번호 1번
		}}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}
	public void registerUser(String name,String email) {
		String sql="insert into event values(?,?)";//
		try{
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
		
			pstmt.executeUpdate();
		}catch (Exception e) {//예외시 
			e.printStackTrace();//오류 찾아냄
		}
	}
	public static void main(String[] args) {
	EventRegist er = new EventRegist();
		
		

	}

}
