package sql;

public interface SqlDML {

	void insert(String query);

	void delete(String query);

	void update(String query);

	String select(String query);

}
