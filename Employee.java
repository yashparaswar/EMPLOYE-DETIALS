public class Employee {
    String Name;//golbal variable declaration
    String Year;
    String Adress;
 public void data()//mthod or displaying name year and adress
 {
     System.out.println("Name " +"\t" + " Joining Year"+"\t"+ "Adress" );
    
 }   
 public static void main(String args [])
 {
     Employee ob = new Employee();//creation of object
     ob.data();//calling of data method
     ob.Name="Robert";
     ob.Year="1994";
     ob.Adress="64C- WallsStreet";
     System.out.println(ob.Name+" \t"+ob.Year+"\t  "+ob.Adress);
    ob.Name="Sam";
    ob.Year="2000";
    ob.Adress="68D- WallsStree";
    System.out.println(ob.Name+" \t"+ob.Year+"\t  "+ob.Adress);
    ob.Name="John";
    ob.Year="1999 ";
    ob.Adress="26B- WallsStreet";
    System.out.println(ob.Name+" \t"+ob.Year+"\t  "+ob.Adress);
 }
}
