package contact;

public class BusinessContact extends Contact {
	private String company;

	public BusinessContact(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	@Override
	public String toString() {
		return super.toString() + "회사명: " + company;
	}
}