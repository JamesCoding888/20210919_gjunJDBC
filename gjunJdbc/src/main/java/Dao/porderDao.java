package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		System.out.println(implDao.getDb());
		
		new porderDao().add(new porder("A桌", 1, 2, 3, 300));

	}

	@Override
	public void add(Object o) {
		Connection conn = implDao.getDb();
		String sql = "insert into porder(desk, A, B, C, sum) values(?, ?, ?, ?, ?)";
		porder p = (porder)o ;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
