public class NameTest
{
  public static void main(String[] args)
  {
  // instantiation
    Name myName = new Name("Charlay", "Effin", "Murphay");
    Name yourName = new Name("Ricky", "Bobby");
    Name someName = new Name ();
    System.out.println("myName first name: " + myName.getFirst());
    yourName.setLast("Brown");
    System.out.println("yourName: " + yourName.toString());
    someName.setName("John", "Quincy", "Adams");
    System.out.println("someName: " + someName.toString());
  }
}



/*Name aName = new Name("duff");
Name someName;
System.out.println("myName: " + myName.toString());
System.out.println("yourName must be: " + yourName.toString());
Name someName = new Name();
System.out.println("myName first name: " + myName.getFirst());
yourName.setLast("Brown");
System.out.println("myName: " + myName.toString());
System.out.println("yourName: " + yourName.toString());
someName.setName("Bill", "Bo", "Baggins");
System.out.println("someName: " + someName.toString());*/
