
public class Point3D {

	float x;
	float y;
	float z;
	
	public Point3D(float x, float y, float z){
		
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public String Toplam(Point3D Point1, Point3D Point2){
		
		float a, b, c;
		
		a = (Point1.x + Point2.x) / 2;
		b = (Point1.y + Point2.y) / 2;
		c = (Point1.z + Point2.z) / 2;
		
		return "(" + a + ", " + b  + ", " + c + ", 1)";
		
		
	}
	
	public String PointYaz(Point3D Point1){
		
		return "(" + Point1.x + ", " + Point1.y  + ", " + Point1.z + ", 1)";
	}
	
public String Fark(Point3D Point1, Point3D Point2){
		
		float a, b, c;
		
		a = Point2.x - Point1.x;
		b = Point2.y - Point1.y;
		c = Point2.z - Point1.z;
		
		return "(" + a + ", " + b  + ", " + c + ")";
		
		
	}

public String Normal(Point3D Point1, Point3D Point2, Point3D Point3){
	
	float a, b, c;
	
	a = Point2.x * (Point3.y - Point3.z) + Point2.y * (Point3.z - Point3.x) + Point2.z * (Point3.x - Point3.y);
	b = Point3.x * (Point1.y - Point1.z) + Point3.y * (Point1.z - Point1.x) + Point3.z * (Point1.x - Point1.y);
	c = Point1.x * (Point2.y - Point2.z) + Point1.y * (Point2.z - Point2.x) + Point1.z * (Point2.x - Point2.y);
	
	
	return "(" + a + ", " + b  + ", " + c + ")";
}

	
	
}
