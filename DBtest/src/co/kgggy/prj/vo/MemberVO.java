package co.kgggy.prj.vo;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String address;
	private String tel;
	private int age;

	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "id= " + id + ", password= " + password + ", name= " + name + ", address= " + address + ", tel= " + tel
				+ ", age= " + age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
