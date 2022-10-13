class demo
{
	void  add()
	{
		System.out.println("Method Overloading");
	}
}
	class demo1 extends demo
	{
		void add()
		{
			System.out.println("Method Overriding");
		}
	}
	class demo2
	{
		public static void main( String argu[])
		{
			demo1 d=new demo1();
			d.add();
			
		}
	}