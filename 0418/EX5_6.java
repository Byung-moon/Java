class EX5_6
{
	public static void main(String [] args)
	{
		
		int num=1, sum=0;
		
		while(true)
		{
			if( (num%2==1) || ((num%2==0) && (num%3==0)) )
			{	
				sum += num;
				if(sum>1000)
				{
					System.out.println("sum : " + sum + "\n" + "num : " + num);
					break;
				}
				
			}
			num++;
		}
		
		
		
	}
	
	
	
	
	
}