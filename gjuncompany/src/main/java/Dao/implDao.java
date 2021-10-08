package Dao;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface implDao {
	//連線方法
	static EntityManager getDB() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gjuncompany");
		EntityManager em = emf.createEntityManager();
		
		return em;
	}
	
	//新增
	void add(Object o);
}
