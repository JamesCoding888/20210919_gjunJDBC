/*
 * 1. 接收
 * 2. new porder
 * 3.new porderDao().add
 * 換到 success
 * 
 */

package Controller;

import com.opensymphony.xwork2.ActionSupport;

import Dao.porderDao;
import Model.porder;

public class addController extends ActionSupport{
	private String desk;
	private Integer A;
	private Integer B;
	private Integer C;
	public String getDesk() {
		return desk;
	}
	public void setDesk(String desk) {
		this.desk = desk;
	}
	public Integer getA() {
		return A;
	}
	public void setA(Integer a) {
		A = a;
	}
	public Integer getB() {
		return B;
	}
	public void setB(Integer b) {
		B = b;
	}
	public Integer getC() {
		return C;
	}
	public void setC(Integer c) {
		C = c;
	}
	
	public String execute() throws Exception{
		porder p = new porder(getDesk(), getA(), getB(), getC());
		new porderDao().add(p);
		return "success";
		
		
	}
}
