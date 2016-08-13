//insertion in table
 import java.sql.*;
import java.io.*;

class Combined
  {

          void HelpEmployee()  
  {
               int chh;      
               System.out.println(" .....................................................FOR ANY HEPL CONTACT US...................................................................");
               System.out.println("\n");
               System.out.println("1. customer enquiry" + "\n"+ "2.Technical enquiry");
               chh=Integer.parseInt(System.console().readLine("choice ="));   
    switch(chh)
  {
               case 1:
               up();
               break;
               case 2:
               u();
               break;
               default:
               System.out.println("wrong choice");
  }
   
  }
    void u()
{System.out.println("___________________________________________________________________________________________________________________________________________________");
         System.out.println("\t\t\t  NAME    = shivam kumar");
         System.out.println("\t\t\t  E-MAIL  = shivam123@gmail.com");
         System.out.println("\t\t\t  contact number=9319247545");
         System.out.println("\n");
System.out.println("___________________________________________________________________________________________________________________________________________________");
        
         
}
void up()
{
          System.out.println("___________________________________________________________________________________________________________________________________________________");
          System.out.println("\t\t\t\t   NAME   = tarun kumar");
          System.out.println("\t\t\t\t   E-MAIL = tarunkumar6423@outlook.com");
          System.out.println("\t\t\t\t   contact number=9456281210");
          System.out.println("\n"); 
System.out.println("_____________________________________________________________________________________________________________________________________________________");
}
/*void update()
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         Connection con=null; 
         PreparedStatement pmt=null;
          String query=null;

   try
     {
  	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   	con=DriverManager.getConnection("Jdbc:Odbc:customerdsn");
  	query="insert into employee values(?,?,?,?)";
    	pmt=con.prepareStatement(query);
   
  	int en=Integer.parseInt(System.console().readLine("pin no. ="));
   	String name=System.console().readLine("customer name =");
	int s=Integer.parseInt(System.console().readLine("customer balnce ="));
  	String c=System.console().readLine("passoword =");

  	//setting values to placeholders
      
	pmt.setInt(1,en);
      	pmt.setString(2,name);
       	pmt.setString(3,c);
      	pmt.setInt(4,s);
     
   
               //execute query
  
   	int r=pmt.executeUpdate();
 	 if(r>0)
   		System.out.println("record inserted successfully");
  	 else
  		System.out.println("error in insertion");
 	 }
   catch(ClassNotFoundException ce)
 	 {
 		  ce.printStackTrace();
 	 }

  catch(SQLException se)
  	{
   		se.printStackTrace();
	  }
   } 
*/

 void Aboutus()
{
 
 System.out.println("....................................ABOUT  US...........................................");
    System.out.println("_________________________________________________________________________________________________________________________________________________");
 System.out.println("Tarun Bank of India _with a 200 year history _is the largest commercial bank in India in terms of assetsdeposits  profits branches  customers and employees");
  System.out.println("_________________________________________________________________________________________________________________________________________________");
}
 
     


    
















        /*  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          Connection con=null;
         PreparedStatement pmt=null;
        String query=null;

try
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("Jdbc:Odbc:customerdsn");
 
    query= "delete from employee where pin=?";   
    pmt=con.prepareStatement(query);
 
    int en=Integer.parseInt(System.console().readLine("employee account to delete,, enter pin ="));


 	//setting values to placeholders
      pmt.setInt(1,en);
      
             //execute query
  
       int r=pmt.executeUpdate();
      if(r>0)
   	System.out.println("record deleted successfully");
      else
  	System.out.println("eroor in deletion");

 
 }
   	catch(ClassNotFoundException ce)
  	{
   		ce.printStackTrace();
  	}

  	catch(SQLException se)
  	{
 		  se.printStackTrace();
 	 }
 }*/



void UpdateEmployee()
{
   Connection con = null;
   PreparedStatement pmt = null;
  String query = null;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

try
   {

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("Jdbc:Odbc:customerdsn");
	query = "update employee set bal= ? where pin= ?";// here ? is to putany value
	pmt=con.prepareStatement(query);

	int pin=Integer.parseInt(System.console().readLine("pin no. ="));
	int bal=Integer.parseInt(System.console().readLine("Enter amoount to deposit="));

	//setting values to place holders

	pmt.setInt(2,pin);
	pmt.setInt(1,bal);
     //execute query

	int r=pmt.executeUpdate();
	if(r>0)
	System.out.println("record updated succesfully");
	else
	System.out.println("Error in updation");
       }
	catch(ClassNotFoundException ce)
	{
 		System.out.println("Class Not Found");
		ce.printStackTrace();
	}

	catch(SQLException se)
	{
		se.printStackTrace();
	}
    }


   void withdraw()
{
   Connection con = null;
   PreparedStatement pmt = null;
  String query = null;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

try
   {

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("Jdbc:Odbc:customerdsn");
	query = "update employee set bal=bal-? where pin= ? and pass =?";// here ? is to putany value
	pmt=con.prepareStatement(query);

	int pin=Integer.parseInt(System.console().readLine("pin no. ="));
	String pass=System.console().readLine("password =");
	int bal=Integer.parseInt(System.console().readLine("Enter amount to withdraw="));
	//setting values to place holders

	pmt.setInt(2,pin);
	pmt.setInt(1,bal);
  	pmt.setString(3,pass);
     //execute query

	int r=pmt.executeUpdate();
	if(r>0)
	System.out.println("record updated succesfully");
	else
	System.out.println("Error in updation");
       }
	catch(ClassNotFoundException ce)
	{
 		System.out.println("Class Not Found");
		ce.printStackTrace();
	}

	catch(SQLException se)
	{
		se.printStackTrace();
	}
    }

    void display()
{

   Connection con=null;
   Statement stmt=null;
   ResultSet rs=null;
   String query=null;

try
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("Jdbc:Odbc:customerdsn");
   stmt=con.createStatement();
   query="select * from employee";
   rs=stmt.executeQuery(query);
   
   System.out.println("------customer Records-------");
   System.out.println("   PIN NO.            NAME                  PASSWORD               BALANCE\n");
   System.out.println("=============================================================================");
while(rs.next())
        {
   	int pin=rs.getInt(1);
   	String name=rs.getString(2);
   	String pass=rs.getString(3);
  	 int bal=rs.getInt(4);
                   System.out.printf("%8d%18s%23s%20d\n",pin,name,pass,bal);
                   System.out.println("-----------------------------------------------------------------------------");
        }
 }
   catch(ClassNotFoundException ce)
  {
   	ce.printStackTrace();
  }

  catch(SQLException se)
  {
   se.printStackTrace();
  }
}
}


 public class Comb
{  
      public static void main(String args[])throws IOException
        { 
 	int chc=1;
        System.out.println("\t\t\t.........................WELCOME TO TARUN ATM............................................");
   	Combined c=new Combined();
 	while (chc==1)
	{
  		System.out.println("     1. Help"+"\n"+"     2. About us"+"\n"+"     3. deposit amount \n     4. withdraw\n     5. display info");
  		System.out.println();
		int ch=Integer.parseInt(System.console().readLine("options ="));
  		System.out.println();
		  switch(ch)
		{ 
  			 case 1:  
 			 c.HelpEmployee();
  			 break;
  			 case 2:
  			 c.Aboutus();
 			 break;		
			
			case 3:
  			c.UpdateEmployee();
 			 break;
			
			case 4:
  			c.withdraw();
 			 break;

			case 5:
 		        c.display();
  			break;
  			
			default:
               			System.out.println("wrong choice!!!!!");
		}
    	System.out.println("enter 1 to repeat procedure else enter 0");
   
  	chc=Integer.parseInt(System.console().readLine("choice ="));
 
	}
       }
}








