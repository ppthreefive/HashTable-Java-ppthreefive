package com.phillippham.hash_table;

public class Client
{
	// Attributes
	private String name, phone;
	
	// Constructors
	public Client()
	{
		this.name = "unknown";
		this.phone = "unknown";
	}

	public Client(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}

	// Accessors
	public String getName()
	{
		return name;
	}

	public String getPhone()
	{
		return phone;
	}

	// Mutators
	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	// Behaviors
	public String toString()
	{
		return "Client [Name: " + name + ", Phone Number: " + phone + "]";
	}

	public boolean equals(Object other)
	{
		// Are the two objects equivalent?
		Client secondOne = (Client)other;
		return this.phone.equals(secondOne.phone);
	}
	
	public int hashCode()
	{
		// Return a unique number for this Client object
		
		// Clean the phone number
		String temp = "";
		for (int i = 0; i < this.phone.length(); i++)
		{
			if(this.phone.charAt(i) >= '0' && phone.charAt(i) <= '9')
			{
				temp += phone.charAt(i);
			}
		}
		
		// Convert to int
		return Integer.parseInt(temp);
	}
}