// p202 구슬 교환



class Child
{
	int biznum;
	
	public Child()
	{
		
	}
	
	public Child(int biznum1)
	{
		biznum = biznum1;
	}
	
	public void changebiznum(int biznum2)
	{
		biznum = biznum - biznum2;
	}
	
	public void changebiz(Child chd, int biznum2)
	{
		biznum = biznum - biznum2;
		chd.changebiznum(-biznum2);
	}
	
	public int returbiznum()
	{
		return biznum;
	}
		
}

class EX7_2
{
	public static void main(String [] args)
	{
		Child chd1 = new Child(20);
		Child chd2 = new Child(5);
		
		chd1.changebiz(chd2, 5);
		
		System.out.println(chd1.returbiznum());
		System.out.println(chd2.returbiznum());
	}
}