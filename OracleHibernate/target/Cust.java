// default package
// Generated Nov 13, 2014 7:23:27 PM by Hibernate Tools 3.4.0.CR1

/**
 * Cust generated by hbm2java
 */
public class Cust implements java.io.Serializable {

	private int custid;
	private String custname;
	private Character gender;

	public Cust() {
	}

	public Cust(int custid) {
		this.custid = custid;
	}

	public Cust(int custid, String custname, Character gender) {
		this.custid = custid;
		this.custname = custname;
		this.gender = gender;
	}

	public int getCustid() {
		return this.custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public Character getGender() {
		return this.gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

}
