import java.util.ArrayList;

//DETAILS OF MEMBERS(individual)
class Contact
{
	//private global variables
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;

	//initializing global variables
	public Contact(String f_name, String l_name, String address, String city, String state, int zip, long phoneNumber, String email)
	{
		firstName = f_name;
		lastName = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	//update firstName
	public void updateFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	//update lastName
	public void updateLastName(String lastName)
	{
		this.lastName = lastName;
	}

	//update address
	public void updateAddress(String address)
	{
		this.address = address;
	}

	//update city
	public void updateCity(String city)
	{
		this.city = city;
	}

	//update state
	public void updateState(String state)
	{
		this.state = state;
	}

	//update zip
	public void updateZip(int zip)
	{
		this.zip = zip;
	}

	//update phoneNumber
	public void updatePhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	//update email
	public void updateEmail(String email)
	{
		this.email = email;
	}

	//to add first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	//to add last name
	public void setSecondName(String lastName)
	{
		this.lastName = lastName;
	}

	//to add address
	public void setAddress(String address)
	{
		this.address = address;
	}

	//to add city
	public void setCity(String city)
	{
		this.city = city;
	}

	//to add state
	public void setState(String state)
	{
		this.state = state;
	}

	//to add zip
	public void setZip(int zip)
	{
		this.zip = zip;
	}

	//to add phone number
	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	//to add email
	public void setEmail(String email)
	{
		this.email = email;
	}

	//to fetch first name
	public String getFirstName()
	{
		return firstName;
	}

	//to fetch last name
	public String getLastName()
	{
		return lastName;
	}

	//to fetch address
	public String getAddress()
	{
		return address;
	}

	//to fetch city
	public String getCity()
	{
		return city;
	}

	//to fetch state
	public String getState()
	{
		return state;
	}

	//to fetch zip
	public int getZip()
	{
		return zip;
	}

	//to fetch phone number
	public long getPhoneNumber()
	{
		return phoneNumber;
	}

	//to fetch email
	public String getEmail()
	{
		return email;
	}

	//to fetch everything
	@Override //for getting all the info
	public String toString()
	{
		return "member info:"+"\n"+ "firstName: " + firstName +"\n"+"lastName: " + lastName +"\n"+ "address: " + address +"\n"+ "city: " + city +"\n"+ "state: " + state +"\n"+ "zip: " + zip +"\n"+ "phoneNumber: " + phoneNumber +"\n"+ "email: " + email;
	}
}

//LIST OF MEMBERS
class AddressBookMembers
{
	//creating a list for members
	private ArrayList<Contact> members;
	/**
	 * members = list of member's details
	 */

	//assigning members to the list
	public AddressBookMembers(ArrayList<Contact> members)
	{
		this.members = members;
	}

	//Returns the list of members
	public ArrayList<Contact> getContact()
	{
		return members;
	}

	//Adds a new member to the members list
	public void setMember(ArrayList<Contact> member)
	{
		this.members = member;
	}
}

//MAIN CLASS
public class AddressBookSimulatorProgram
{
	static int i;
	static ArrayList<Contact> addressBook;
	static AddressBookMembers abms;
	static Contact kiran;

	//main method
	public static void main(String[] args)
	{
		//Entering the details manually
		kiran = new Contact("Kiran", "Matham", "H.No: 1-4-5/2, Near post office, Ramapure.(Not my true address!)", "Hyderabad", "Telangana", 589267, 9865895652L, "email1@yahoo.com");

		//Creating a list for the contacts
		addressBook = new ArrayList<>();

		//Adding member to the contact list
		addressBook.add(kiran);

		//Passing the contacts list to the address book
		abms = new AddressBookMembers(addressBook);

		//printing the contact details from Contacts list
		System.out.println("Contact: "+abms.getContact());
	}
}
