package contact;

public class Contact {
	private final String name;
	private final String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	@Override
		public String toString() {
			return "이름: " + name + "연락처" + phoneNumber;
		}
}