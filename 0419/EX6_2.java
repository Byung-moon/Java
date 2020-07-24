// 전달된 값이 소수(prime number)인지 아닌지를 판단하여, 소수인 경우 true를, 소수가 아닌 경우 false를 반환하는 메소드를 정의하고,
// 이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메소드를 정의하자.

class EX6_2
{
	
	public static void main(String [] args)
	{
		primecheck(10);
		primecheck(11);
		primecheck(12);
		primecheck(13);
		primecheck(14);
		primecheck(15);
		primecheck(16);
	}	

	public static boolean primecheck(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num%i!=0)
				continue;
			else
				return false;
		}
		System.out.println("진정한 소수 : " + num );
		return true;
	}
	
}