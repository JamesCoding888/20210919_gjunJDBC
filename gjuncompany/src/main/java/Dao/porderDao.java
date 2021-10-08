package Dao;

import javax.persistence.EntityManager; 
import javax.persistence.EntityTransaction;

import Model.porder;

public class porderDao implements implDao {
	public static void main(String[] args) {
		System.out.println(implDao.getDB());
		porder p = new porder("B桌",10, 10, 10);
		new porderDao().add(p);
	}
	@Override
	public void add(Object o) {
		EntityManager em = implDao.getDB();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(o);
		et.commit();
		em.close();
		
	}
	
}
