package p0429;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EventRegist {
	Scanner s=new Scanner(System.in);
	String jdbcdriver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;//전역변수
	
	public EventRegist(){
		connectDB();//bd불러오는 메소드를 만들어서 구조화 시킨다
		System.out.println("# 이벤트 등록을 위해 이름과 이메일을 입력하세요.");
		System.out.print("이름 : ");
		String uname=s.next();
		System.out.print("이메일 : ");
		String email=s.next();
		registerUser(uname,email);
		printList();//입력한걸 뿌리는 변수
	}
	public void connectDB(){
		try{
			Class.forName(jdbcdriver);
			System.out.println("데이터베이스 연결중..");
			con=DriverManager.getConnection(url,"root","1234");
			System.out.println("데이터베이스 성공");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void printList(){//()메소드라는 뜻이고 안에 받는 단어를 비교하여 디비와 같은 레코드 받아온다,
			System.out.println("# 등록자 명단 #");
			String sql = "select*from event";
		try{
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();//쿼리:불러들인다
			while (rs.next()){ //id 확인할때는 if(rs.next()) 유일한것이기 때문에 
				System.out.println(rs.getString(1)+","+rs.getString(2));
			}
		}catch (SQLException e){
				e.printStackTrace();	
		}
	}
	public void registerUser(String uname, String email){
		String sql = "insert into event values(?,?)";//입력한 데어터 넘어간다
		try {
			pstmt= con.prepareStatement(sql);//set은 받아들이는것
			pstmt.setString(1, uname);//첫번째 ?에 name 들어간다
			pstmt.setString(2, email);//두번째 물음표
			pstmt.executeUpdate();//입력:업데이트
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EventRegist er =new EventRegist();
	}
}
