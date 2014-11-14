// default package
// Generated Nov 13, 2014 7:23:27 PM by Hibernate Tools 3.4.0.CR1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private int stuid;
	private String stuname;
	private Character gender;

	public Student() {
	}

	public Student(int stuid, String stuname) {
		this.stuid = stuid;
		this.stuname = stuname;
	}

	public Student(int stuid, String stuname, Character gender) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.gender = gender;
	}

	public int getStuid() {
		return this.stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public Character getGender() {
		return this.gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

}
