package sw_dev.alg_data_str.myarraylist;

public class MyStringArrayListTester1 {
	//Note: not a very complete tester!
	public static void main(String[] args) {
		MyStringArrayList list = new MyStringArrayList();
		
		list.add("abc");
		list.add("def");
		list.add("ghi");		
		list.add(2,"jkl"); 
		list.add("mno");
		
		
		if(list.isEmpty())
		{
			System.out.println("List is empty; nothing to display");
		}
		else
		{
			System.out.println("Contents of the list:");
			//Loop around the list and display an element each time.
			for (int i=0; i < list.size(); i++)
			{
				System.out.println(list.get(i));
			}
		}
		
		System.out.println("Testing toString()");
		System.out.println(list.toString());
		
		String removeStr = "def";
		list.remove(removeStr);
		System.out.println("\nAfter removing " + removeStr + ": " + list.toString());
		
		list.remove(1);
		System.out.println("\nAfter removing second element: " + list.toString());
		
		if(list.contains("mno"))
		{
			System.out.println("mno is in the list");
		}
		else
		{
			System.out.println("mno is not in the list");
		}
		
		
		if(list.contains("def"))
		{
			System.out.println("def is in the list");
		}
		else
		{
			System.out.println("def is not in the list");
		}	
		
		//illustration of the tenary operator
		String printStr = (list.contains("abc")) ? "abc present" : "not present";
		System.out.println(printStr);
		
		
	}

}
