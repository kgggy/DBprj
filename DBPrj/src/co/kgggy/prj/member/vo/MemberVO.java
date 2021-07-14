package co.kgggy.prj.member.vo;

public class MemberVO { // VO => 데이터를 싣고 옮겨줌. 테이블과 1:1로
	//테이블 모양과 똑같이 만들어줌. => 자동으로 출력.
	private String id;
	private String password;
	private String name;
	private String address;
	private String tel;
	private int age;

	public MemberVO() {

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

	public String toString() { // Object객체가 가지고있는 toString()를 재정의 해서 사용.
		System.out.print(id + " : ");
		System.out.print(password + " : ");
		System.out.print(name + " : ");
		System.out.print(address + " : ");
		System.out.print(tel + " : ");
		System.out.println(age);
		return null;
	}

}
