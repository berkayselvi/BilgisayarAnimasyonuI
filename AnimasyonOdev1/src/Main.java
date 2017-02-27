import java . util . Scanner ;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner ( System .in);
		
		float x1, y1, z1;	
		float x2, y2, z2;
		float x3, y3, z3;
		float x4, y4, z4;
		float x5, y5, z5;
		
		System.out.println("Ilk Noktanin x, y ve z degerlerini girin.");
		System.out.print("x1 = ");
		x1 = input .nextFloat();
		System.out.print("y1 = ");
		y1 = input .nextFloat();
		System.out.print("z1 = ");
		z1 = input .nextFloat();
		
		Point3D Point1 = new Point3D(x1, y1, z1);
		
		
		System.out.println("Ilk nokta = " + Point1.PointYaz(Point1));
		
		
		System.out.println("Ikinci Noktanin x, y ve z degerlerini girin.");		
		System.out.print("x2 = ");
		x2 = input .nextFloat();
		System.out.print("y2 = ");
		y2 = input .nextFloat();
		System.out.print("z2 = ");
		z2 = input .nextFloat();
		
		Point3D Point2 = new Point3D(x2, y2, z2);
		
		System.out.println("Ikinci nokta = " + Point1.PointYaz(Point2));
		
		
		
		x5 = x2 - x1;
		y5 = y2 - y1;
		z5 = z2 - z1;
		
		Vector3D Vector1 = new Vector3D(x5, y5, z5);
		
		System.out.println("Bu iki noktanin toplami = " + Point1.Toplam(Point1, Point2) + ") dir.");
		
		System.out.println("Ucuncu Noktanin x, y ve z degerlerini girin.");		
		System.out.print("x3 = ");
		x3 = input .nextFloat();
		System.out.print("y3 = ");
		y3 = input .nextFloat();
		System.out.print("z3 = ");
		z3 = input .nextFloat();
		
		Point3D Point3 = new Point3D(x3, y3, z3);
		
		System.out.println("Ucuncu nokta = " + Point3.PointYaz(Point3));
		
		System.out.println("Bu uc noktanin olusturdugu duzlemin normali = " + Point1.Normal(Point1, Point2, Point3));
		
		System.out.println("Ilk iki noktanin farkiyla olusan vektor Vector1" + Point1.Fark(Point1, Point2) + " dir.");
		
		System.out.println("Lutfen ikinci vektorun x,y ve z degerlerini giriniz.");
		System.out.print("x4 = ");
		x4 = input .nextFloat();
		System.out.print("y4 = ");
		y4 = input .nextFloat();
		System.out.print("z4 = ");
		z4 = input .nextFloat();
		
		Vector3D Vector2 = new Vector3D(x4, y4, z4);
		
		System.out.println("Ikinci vektor Vector2" + Vector1.VectorYaz(Vector2) + " dir.");
		
		System.out.println("Skaler carpim   Vector1 . Vector2 = " + Vector1.SkalerCarpim(Vector1, Vector2));
		System.out.println("Vektorel carpim   Vector1 x Vector2 = " + Vector1.VektorelCarpim(Vector1, Vector2));
		
		input.close();
			
		

	}

}
