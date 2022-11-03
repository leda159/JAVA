package ex07;

public class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql에서 select");
		
	}

	@Override
	public void insert() {
		System.out.println("Mysql에서 insert");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql에서 update");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql에서 delete");
		
	}

}
