// 문제1 정수 N을 전달받아서, 2의 N승을 계산하여 반환하는 메소드를 재귀의 형태로 정의하고, 이의 테스트를 위한 main 메소드도 함께 정의하자.

class EX6_3
{
	/*
	public static void main(String [] args)
	{
		int num=5;
	
		System.out.println(square(num));
		System.out.println(square(10));
		System.out.println(square(0));
		
	}
	
	public static int square(int num)
	{	
		if(num==0)
			return 1;
		else
			return 2*square(num-1);	
	}
	*/
	
	// 십진수를 이진수로 출력 (재귀함수 이용)
	
	public static void main(String [] args)
	{
		binaryprint(10);
		System.out.println("");
		binaryprint(1023);
		System.out.println("");
		binaryprint(1);
		System.out.println("");
		binaryprint(0);
		System.out.println("");
	}
	
	
	public static void binaryprint(int num)
	{
		if(num==1)
		{
			System.out.print(1);
			return;
		}
		else if(num==0)
		{
			System.out.print(0);
			return;
		}
		else
			binaryprint(num/2);
		
		if(num%2==0)
		{
			System.out.print(0);
			return;
		}
		else 
		{
			System.out.print(1);
			return;
		}
	}
	
	
	
	
}