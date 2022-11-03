package ex07;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클에서 select");
		
	}

	@Override
	public void insert() {
		System.out.println("오라클에서 insert");
		
	}

	@Override
	public void update() {
		System.out.println("오라클에서 update");
		
	}

	@Override
	public void delete() {
		System.out.println("오라클에서 delete");
		
	}

}
