package ex07;

public class DaoExample {

	//DataAccessObject : 인터페이스
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	//자동 타입변환
	//인터페이스 다형성
	//DataAccessObject dao = new OracleDao();
	//DataAccessObject dao = new MysqlDao();
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
}
