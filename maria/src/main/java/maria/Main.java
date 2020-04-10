package maria;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;

public class Main {

	public static void main(String[] args) throws ManagedProcessException {
		DBConfigurationBuilder configBuilder = DBConfigurationBuilder.newBuilder();
		configBuilder.setPort(3307); // OR, default: setPort(0); => autom. detect free port
		DB db = DB.newEmbeddedDB(configBuilder.build());
		db.start();
	}
}
