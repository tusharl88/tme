package time;

public class mother1 {
	public static void main (String args[])
	{
		daughter1 obj= new daughter1(5);
		daughter1 obj1= new daughter1(5,28);
		daughter1 obj2= new daughter1(5,28,26);
																		//obj.setTime(13,27,6);               
		System.out.println(obj.militarytime());
		System.out.println(obj.regulartime());
		
		System.out.println(obj1.militarytime());
		System.out.println(obj1.regulartime());
		
		System.out.println(obj2.militarytime());
		System.out.println(obj2.regulartime());
		
		
	}

}
