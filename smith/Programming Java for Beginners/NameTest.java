public class NameTest
{
	public static void main(String[] args)
	{
		//instantiation
		Name myName = new Name("Jon", "Will", "Smith");
		Name yourName = new Name("Jonathan","Thompson");
		/*Name aName = new Name("Johnson");
		Name someName;
		System.out.println("myName: " + myName.toString());
		System.out.println("yourName: " + yourName.toString());*/
		
		Name someName = new Name();
		System.out.println("myName first name: " + myName.getFirst());
		yourName.setLast("Brown");
		System.out.println("yourName: " + yourName.toString());
		someName.setNames("John", "Quincy", "Adams");
		System.out.println("someName: " + someName.toString());
	}
}