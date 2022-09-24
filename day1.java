public class Sleepyjones {
	public static void main(String args[]) 
	{
		for (int i = 5 ; i >= 0 ; i-- )
		{
			try {
			Thread.sleep(1000);
			System.out.println(i);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}System.out.println("i love u");
	}

}
