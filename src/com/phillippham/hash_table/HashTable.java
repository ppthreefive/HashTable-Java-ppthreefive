package com.phillippham.hash_table;

import java.util.*;

// NOTE: Table size should always be a prime number for a better balanced table
public class HashTable<T>
{
	// Attributes
	private LinkedList<T>[] dataTable;
	private int tableSize;
	private final int DEFAULT_SIZE = 101;
	
	// Constructors
	public HashTable()
	{
		this.tableSize = this.DEFAULT_SIZE;
		this.dataTable = new LinkedList[tableSize];
	}
	
	public HashTable(int tableSize)
	{
		this.tableSize = tableSize;
		this.dataTable = new LinkedList[this.tableSize];
	}
	
	// Behaviors
	public void insert(T data)
	{
		// Get the hash number to know which slot to use
		int hash = data.hashCode() % this.tableSize; // Remainder will be 0 to (tableSize - 1)
		
		// Create a LinkedList at that slot if one does not exist already
		if(this.dataTable[hash] == null)
		{
			this.dataTable[hash] = new LinkedList<T>();
		}
		
		// Add data to the LinkedList at that specific slot
		dataTable[hash].add(data);
	}
	
	public T retrieve(T data)
	{
		// Get the hash
		int hash = data.hashCode() % this.tableSize;
		
		// Get the Client object from that slot
		if(dataTable[hash] == null)
		{
			return null;
		}
		else
		{
			int position = this.dataTable[hash].indexOf(data);
			return this.dataTable[hash].get(position);
		}
	}
	
	public boolean remove(T data)
	{
		// Get the hash
		int hash = data.hashCode() % this.tableSize;
		
		// Remove data if possible
		if(this.dataTable[hash] == null)
		{
			return false;
		}
		else
		{
			return this.dataTable[hash].remove(data);
		}
	}
	
	public String display()
	{
		String output = "";
		for (int i = 0; i < this.dataTable.length; i++)
		{
			if(this.dataTable[i] == null)
			{
				output += "null\n";
			}
			else
			{
				for (int j = 0; j < this.dataTable[i].size(); j++)
				{
					
					output += this.dataTable[i].get(j) + ", ";
				}
				
				// Drop down to the next line
				output += "\n";
			}
		}
		
		// Return the output String
		return output;
	}
}