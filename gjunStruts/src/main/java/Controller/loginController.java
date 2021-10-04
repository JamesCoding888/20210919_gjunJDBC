package Controller;

import com.opensymphony.xwork2.ActionSupport;
// 由 ActionSupport 取代 Servlet 
// field(s) 的名稱必須與 index.jsp 的 field(s) 一樣
// field(s) 不能有建構式
public class loginController extends ActionSupport{
	private Integer number;

	public Integer getNumber(){
		return number;
	}

	public void setNumber(Integer number){
		this.number = number;
	}
	// 必須使用 execute() method
	public String execute() throws Exception{
		if(getNumber()==123)
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
}
	
