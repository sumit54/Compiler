class SeparateTime
{
	public static void main(String... args)
		{	

		String hour,min,sec;
			String time="01:23:45 PM";
			
			String[] timeArray=time.split(":");
			hour=timeArray[0];
			min=timeArray[1];
			sec=timeArray[2].split(" ")[0];
	
		System.out.println("Hours: "+hour);
		System.out.println("Min: "+min);
		System.out.println("Sec: "+sec);

			
		}

}