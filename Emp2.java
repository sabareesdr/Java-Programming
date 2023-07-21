package HW;
class Emp2

{

String Name;

int Year;

String Address;

Emp2(String nam,int years, String addr)

{

 Name=nam;

 Year=years;

 Address=addr;

     }

void Sam()

{

   

 System.out.println(Name+ "        " +Year + "         "     +Address);                                          

}

void Robert()

{

   

     System.out.println(Name+ "     " +Year + "         "     +Address);                                          

}

void John()

{

 System.out.println(Name+ "    " +Year + "       "     +Address);                                          

}

}

class Main

{

public static void main(String args[])

{

 System.out.println("Name" +   "  Year of Joining     " + "Address" );

 Emp2 e=new Emp2("Sam", 2000, "68D-WallsStreet");

 e.Sam();

 Emp2 e1=new Emp2("Robert", 1994, "64C-WallsStreet");

 e1.Robert();

 Emp2 e2=new Emp2("John", 2002, "70F-WallsStreet");

 e2.Sam();

}

}

