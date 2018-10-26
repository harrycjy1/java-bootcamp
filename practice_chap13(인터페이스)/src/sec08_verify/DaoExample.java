package sec08_verify;

public class DaoExample {

	public static void dbWork(DataAccessObject d) {
		d.select();
		d.insert();
		d.update();
		d.delete();
	}
	
	
	public static void main(String[] args) {
				
		MySqlDao a = new MySqlDao();
		OracleDao b = new OracleDao();
		
		DaoExample.dbWork(a);
		DaoExample.dbWork(b);
			
	}

}
