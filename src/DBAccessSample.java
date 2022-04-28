import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccessSample {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/neo";
		String id = "root";
		String pw = "";
		Connection connection = null;
		
		try {
			Class.forName(driver);
			
			connection = DriverManager.getConnection(url, id, pw);
			
			System.out.println("接続に成功しました");
		} catch (ClassNotFoundException e) {
			System.out.println("接続失敗：JDBCドライバが見つかりません。");
		} catch(SQLException e) {
			System.out.println("接続ができませんでした。");
			e.printStackTrace();
		}

	}

}
