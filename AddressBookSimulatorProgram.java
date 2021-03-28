
//import java.util.ArrayList;
import java.util.Scanner;

//members details (individual)
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

//List of members
class AddressBookMembers
{
	Contact contact;

	//assigning a contact to Contact class
	public void setContact(String f_name, String l_name, String address, 
							String city, String state, int zip, long phoneNumber, 
							String email)
	{
		contact = new Contact(f_name, l_name, address, city, state, zip, phoneNumber, email);
	}

	//Return the contact
	public void getContact()
	{
		System.out.println(contact);
	}
}

//MAIN CLASS
public class AddressBookSimulatorProgram
{
	//main method
	public static void main(String[] args)
	{
		//Taking the details from user
		Scanner sc = new Scanner(System.in);//<== warning:(Resource never closed!)

		System.out.println("Enter member's first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter member's last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter member's address: ");
		String address = sc.nextLine();
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println("Enter state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip: ");
		int zip = sc.nextInt();
		System.out.println("Enter phone number: ");
		long phoneNumber = sc.nextLong();

		//Passing variables/details to the Contact-class
		AddressBookMembers person1 = new AddressBookMembers();
		person1.setContact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		//printing the contact details from Contacts list
		person1.getContact();
	}
}
