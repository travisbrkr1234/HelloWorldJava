public class Chapter5
{
	public class Name
	{
		private String strFirst;
		private String strMiddle;
		private String strLast;
		
		public String displayName()
		{
			return strFirst + " " + strMiddle + " " + strLast;
		}
		public String getInitials()
		{
			return strFirst.substring(0,1) + strMiddle.substring(0,1) + strLast.substring(0,1);
		}

		// constructor methods
		public Name(String f, String m, String l)
		{
			strFirst = f;
			strMiddle = m;
			strLast = l;
		}
		public Name(String f, String l)
		{
			strFirst = f;
			strMiddle = "";
			strLast = l;
		}
		public Name(String l)
		{
			strFirst = f;
			strMiddle = "";
			strLast = "";
		}
		public Name()
		{
			strFirst = "";
			strMiddle = "";
			strLast = "";
		}

		public String toString()
		{
			return strFirst + " " + strMiddle + " " + strLast;
		}
		
		//Getter Method

		public String getFirst()
		{
			return strFirst;
		}
		public String getMiddle()
		{
			return strMiddle;
		}
		public String getLast()
		{
			return strLast;
		}

		//Set Method

		public void setFirst(String fname)
		{
			strFirst = fname;
		}
		public void setMiddle(String mname)
		{
			strMiddle = mname;
		}
		public void setFirst(String lname)
		{
			strLast = lname;
		}
	}
	public static void main(String[] args)
	{
		
	}
}