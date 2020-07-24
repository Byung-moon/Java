class EX5_7
{
	public static void main(String [] args)
	{
		int a, b;
		for( a=0; a<10; a++ )
		{
			for(b=0; b<10; b++)
			{
				if(((10*a+b) + (a+10*b)) == 99 )
					System.out.println(" 만족하는 조합 : " + (10*a+b) + ", " + (a+10*b) );
				
			}
			
			
			
		}
		
		
		
	}
	
	
	
}