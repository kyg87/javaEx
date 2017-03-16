package jdbc.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.data.dao.NoticeDao;
import jdbc.data.entity.Member;
import jdbc.data.entity.Notice;
import jdbc.data.view.NoticeView;

public class MySQLNoticeDao implements NoticeDao{

	@Override
	public List<NoticeView> getList() {
		return getList(1, "TITLE", "");
	}

	@Override
	public List<NoticeView> getList(int page) {
		return getList(page, "TITLE", "");
	}

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		String sql = "SELECT * FROM NOTICE WHERE MID LIKE '%" + query + "%'";
		List<NoticeView> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl"; // DB연결
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass"); // 드라이브 로드
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			NoticeView noticeView = null;

			while (rs.next()) {
				noticeView = new NoticeView();
				noticeView.setCode(rs.getString("CODE"));
				noticeView.setTitle(rs.getString("TITLE"));

				list.add(noticeView);
			}

			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
