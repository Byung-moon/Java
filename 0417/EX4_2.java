// 비트연산자 & 쉬프트 연산자


class EX4_2 
{
	public static void main(String [] args)
	{
		/* 1번
		int num1 = 7;
		int num2;
		
		num2 = ~7 + 1 ;
		
		System.out.println("num2 는 num1의 2의 보수이고 num2 = " + num2);
		*/
		
		/* 2번
		int num3 = 15678;
		
		System.out.println( "15678의 오른쪽에서 세번째 비트 : " + ( (num3&4) >>> 2) );
		System.out.println( "15678의 오른쪽에서 다섯번째 비트 : " + ((num3&16) >>> 4) );
		*/
		
		int num4 = 1;
		int num5 = (1<<30) ; // 오른쪽에서 31번째 비트가 1인 양의 정수 
		int num6 = num5<<1; // 32번째가 1인 양의 정수
		
		System.out.println(num5 + "\n" + " num6 = num5 * 2 = " + num5*2 + "\n" + "하지만 실제값은 num6 = " + num6);
		
		
		
		
		
	}
	
	
	
	
}