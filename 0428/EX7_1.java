//p202

class Triangle
{
	double row;
	double height;
	
	Triangle()
	{
		
	}
	
	public Triangle(double row1, double height1 )
	{
		row = row1;
		height = height1;
	}
	
	public void datainit(double row2, double height2)
	{
		row = row2; //병문이 바봉 ~ ~ ~ ㅋ ㅋ ㅋ 반사
		height = height2;
	}
	
	public void size()
		{
			System.out.println(row*height/2);
		}
	
}

class EX7_1
{
	public static void main(String [] args)
	{
		
		
		
		Triangle tri2 = new Triangle();
		Triangle tri3 = new Triangle(10,5);
		
		tri2.datainit(3,10);
		tri3.size();
		tri2.size();
		
		System.out.println();
		
	}
	
	
	
}