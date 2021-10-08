
/*POJO ,bean--->建構式(1.沒有 2.Overlaod(有一個no argument) 
 * 自動轉型,自動編碼
 * set-->接收
 * get->read
 *
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

public class testAction extends ActionSupport{
	private String name;
	private String password;
	private String degree;
	private String sex;
	private String interest;
	private String memo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String execute() throws Exception
	{
		System.out.println("name="+getName()+
				"\tpasssword:"+getPassword()+
				"\tdegree:"+getDegree()+
				"\tsex:"+getSex()+
				"\tinterest:"+getInterest()+
				"\tmemo:"+getMemo());
		
		
		
		return "success";
	}

}
