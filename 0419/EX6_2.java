// ���޵� ���� �Ҽ�(prime number)���� �ƴ����� �Ǵ��Ͽ�, �Ҽ��� ��� true��, �Ҽ��� �ƴ� ��� false�� ��ȯ�ϴ� �޼ҵ带 �����ϰ�,
// �̸� �̿��ؼ� 1�̻� 100 ������ �Ҽ��� ���� ����� �� �ֵ��� main �޼ҵ带 ��������.

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
		System.out.println("������ �Ҽ� : " + num );
		return true;
	}
	
}