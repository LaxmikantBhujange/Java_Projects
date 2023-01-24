package com.dao;

import com.pojo.Book;
import com.pojo.Branch;

public class BookDetails {

	public static Branch showInformation_Technology()
	{
		Book books[]=new Book[3];
		
		books[0]=new Book(1, "Data_Science", 300, 10);
		books[1]=new Book(2, "DSA", 350, 10);
		books[2]=new Book(3, "OOP", 400, 10);
		
		Branch br=new Branch("Information Technology", books);
		
		return br;
	}

	public static Branch showElectronics_Engg() {
		
		Book books[]=new Book[3];
		
		books[0]=new Book(1, "EDC", 350, 10);
		books[1]=new Book(2, "DC", 400, 10);
		books[2]=new Book(3, "EM", 500, 10);
		
	    Branch br=new Branch("Electronics Enginnering", books);
	    
		return br;
	}
	
	public static Branch showMechanical_Engg() {
		
		Book books[]=new Book[3];
		
		books[0]=new Book(1, "TOM", 400, 10);
		books[1]=new Book(2, "CAD", 400, 100);
		books[2]=new Book(3, "EME", 500, 10);
		
		Branch br=new Branch("Mechanical Engineering", books);
		
		return br;
	}
	
	public static Branch showCivil_Engg() {
		
		Book books[]=new Book[3];
		
		books[0]=new Book(1, "Cons_Materials", 350, 10);
		books[1]=new Book(2, "BCE", 400, 10);
		books[2]=new Book(3, "Design_Structure", 450, 10);
		
		Branch br=new Branch("Civil Engineering", books);
		
		return br;
	}
	
	public static Branch showStories() {
		
		Book books[]=new Book[3];
		
		books[0]=new Book(1, "One_Day_Life_Will_Change", 350, 10);
		books[1]=new Book(2, "Freedom_From_The_Known", 400, 10);
		books[2]=new Book(3, "The_Book_Of_Life", 450, 10);
		
		Branch br=new Branch("Stories", books);
		
		return br;
	}
}
