import orange.area.Circle;

class PackageCircle
{
	public static void main(String [] args)
	{
		orange.area.Circle c1 = new orange.area.Circle(1.5);
		System.out.println("�������� 1.5�� ���� ���� : " + c1.getArea());
		
		orange.perimeter.Circle c2 = new orange.perimeter.Circle(2.5);
		System.out.println("�������� 2.5�� ���� �ѷ� : " + c2.getPerimeter());
		
		Circle c3 = new Circle(2.5);
		System.out.println("�������� 2.5�� ���� ���� : " + c3.getArea());
		
		orange.best.AAA a = new orange.best.AAA();
		a.getAAA();
		
		orange.best.BBB b = new orange.best.BBB();
		b.getBBB();
	}
}