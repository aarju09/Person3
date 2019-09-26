class Person3{
	String name;
	String phone;
	Address home_address;
	Address office_address;
	Person3(String name,String phone,Address home_address,Address office_address)
	{
		System.out.println("name is:"+name);
		System.out.println("phone is"+phone);
		//System.out.println("home address is :"+home_address);
		//System.out.println("office address is:"+office_address);
	}
	static class Address
	{
		String society_name;
		String city;
		double pin_code;
		String state;
		Address(String society_name,String city,double pin_code,String state)
		{
			System.out.println("Home address : "+society_name +city +pin_code +state);
			System.out.println("Office address is: "+society_name +city +pin_code +state);
		}
	}
		public static void main(String[]args)
		{
			
			Address a =new Address("Siddhivinyak carona","Pune",411014,"Maharashtra");
			Address b = new Address("MESCOE","Pune",411012,"Maharashtra");
			Person3 p = new Person3("AARJU","23450",a,b);
			//Person3 q = new Person3("AARJU","123456",b);


		}
	
	
}