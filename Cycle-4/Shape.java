abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
    void numberOfSides()
	{
		System.out.println("Number of sides in a rectangle:4");
	}
}

class Traingle extends Shape
{
    void numberOfSides()
	{
		System.out.println("Number of sides in a triangle:3");
	}
}


class Hexagon extends Shape
{
    void numberOfSides()
	{
		System.out.println("Number of sides in a hexagon:6");
	}
}

class main
{
	public static void main(String args[])
	{
		Rectangle obj1=new Rectangle();
		Traingle obj2=new Traingle();
		Hexagon obj3=new Hexagon();
		
		obj1.numberOfSides();
		obj2.numberOfSides();
		obj3.numberOfSides();
	}
}

	
