package entity;

public class Customer {
	private static int increseID = 100;
	private int ID;
	private String name;
	private int age;
	private long phone;
	private String email;
	private String password;
	private Address address;
	private Order order;
	
	public Customer(String name, int age, long phone, String email, String password) {
		ID = ++increseID;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.setPassword(password);
		order = new Order();
		address = new Address(null, null, null, 0);
	}

	public static int getIncreseID() {
		return increseID;
	}

	public static void setIncreseID(int increseID) {
		Customer.increseID = increseID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", order=" + order + "]";
	}



	
		
}
