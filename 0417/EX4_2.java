// ��Ʈ������ & ����Ʈ ������


class EX4_2 
{
	public static void main(String [] args)
	{
		/* 1��
		int num1 = 7;
		int num2;
		
		num2 = ~7 + 1 ;
		
		System.out.println("num2 �� num1�� 2�� �����̰� num2 = " + num2);
		*/
		
		/* 2��
		int num3 = 15678;
		
		System.out.println( "15678�� �����ʿ��� ����° ��Ʈ : " + ( (num3&4) >>> 2) );
		System.out.println( "15678�� �����ʿ��� �ټ���° ��Ʈ : " + ((num3&16) >>> 4) );
		*/
		
		int num4 = 1;
		int num5 = (1<<30) ; // �����ʿ��� 31��° ��Ʈ�� 1�� ���� ���� 
		int num6 = num5<<1; // 32��°�� 1�� ���� ����
		
		System.out.println(num5 + "\n" + " num6 = num5 * 2 = " + num5*2 + "\n" + "������ �������� num6 = " + num6);
		
		
		
		
		
	}
	
	
	
	
}