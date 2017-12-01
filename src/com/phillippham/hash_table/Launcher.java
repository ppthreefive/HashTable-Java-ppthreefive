package com.phillippham.hash_table;

public class Launcher
{
	public static void main(String[] args)
	{
		// Table size should always be a prime number for a better balanced table
		
		// Create and load the hash table
		HashTable<Client> table = new HashTable<Client>(7);
		
		table.insert(new Client("Arnold", "555-1911"));
		table.insert(new Client("Louis", "329-2912"));
		table.insert(new Client("Jaqueline", "569-8273"));
		table.insert(new Client("Harvey", "677-9090"));
		table.insert(new Client("Jason", "666-6777"));
		table.insert(new Client("Kanye", "826-0001"));
		table.insert(new Client("Kyle", "871-3260"));
		table.insert(new Client("Timothy", "113-3332"));
		table.insert(new Client("Jesus", "901-1086"));
		table.insert(new Client("Robert", "650-1944"));
		table.insert(new Client("Quincey", "986-4581"));
		table.insert(new Client("Samuel", "230-0014"));
		table.insert(new Client("George", "761-4545"));
		table.insert(new Client("George", "761-4545"));

		
		// Display the hash table
		System.out.println(table.display());
		
		// Test the remove functionality
		table.remove(new Client("", "555-1911"));
		
		// Display again to show that Arnold was removed
		System.out.println("\n" + table.display());
		
		// Exit gracefully
		System.exit(0);
	}
}