package time;

public class mother {
	public static void main (String args[])
	{
		daughter obj= new daughter();
	System.out.println(obj.militarytime()); //no arguments are passed so everything passed is zero
		
		
		System.out.println(obj.regulartime()); // no arguments are given but 12 is already given in our code of daughter.
		
		
		obj.setTime(13,27,6);               //now arguments are given.
		System.out.println(obj.militarytime());
		
		
		System.out.println(obj.regulartime());
		
		//obj.hour=7;  try this bcoz hour is private so cant be accessed from outside
	}
}

