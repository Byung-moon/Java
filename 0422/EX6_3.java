// ����1 ���� N�� ���޹޾Ƽ�, 2�� N���� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 ����� ���·� �����ϰ�, ���� �׽�Ʈ�� ���� main �޼ҵ嵵 �Բ� ��������.

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
	
	// �������� �������� ��� (����Լ� �̿�)
	
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