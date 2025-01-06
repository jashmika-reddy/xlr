class Employee {
    int id;
    String Firstname;
    String Lastname;
    String Address;

public Employee() {}

public Employee(int id,String Firstname,String Lastname,String Address){
    super();
    this.id = 10;
    this.Firstname = "Jashmika";
    this.Lastname = "Gopavaram";
    this.Address = "Nandyal";
}
public String getfullname(){
    return Firstname + "" + Lastname;
}
}