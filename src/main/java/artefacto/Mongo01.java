package artefacto;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Mongo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Ok1");
			MongoClient mongoClient = new MongoClient();
			System.out.println("Ok2");
			DB db = mongoClient.getDB("ejemplobf");
			System.out.println("Ok3");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
