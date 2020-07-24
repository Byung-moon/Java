
class OperatorEX
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		int num3	= 30;

		num1=num2=num3;

		System.out.println("num1: " + num1 + "num2: " + num2 + "num3: " + num3 );
			
		
		
		int num4=0, num5=0;
		boolean result;

		result = ( (num4+=10)<0 ) && ( (num5+=10)>0 );
		System.out.println("result=" + result);
		System.out.println("num4=" + num4 + ", num5=" + num5);


		result = ( (num4+=10)>0 ) || ( (num5+=10)>0 );
		System.out.println("result=" + result);
		System.out.println("num4=" + num4 + ", num5=" + num5);
	}

}