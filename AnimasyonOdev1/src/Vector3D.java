
public class Vector3D {
	
	float x;
	float y;
	float z;
	
public Vector3D(float x, float y, float z){
		
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		
	}

public String VectorYaz(Vector3D Vector1){
	
	return "(" + Vector1.x + ", " + Vector1.y  + ", " + Vector1.z + ")";
}

public String VektorelCarpim(Vector3D Vector1, Vector3D Vector2){
	float a,b,c;
	
	a = Vector1.y * Vector2.z - Vector1.z * Vector2.y;
	b = Vector1.z * Vector2.x - Vector1.x * Vector2.z;
	c = Vector1.x * Vector2.y - Vector1.y * Vector2.x;
	
	return "(" + a + ", " + b  + ", " + c + ")";
	
}

public float SkalerCarpim(Vector3D Vector1, Vector3D Vector2){
	
	float a ;
	a = Vector1.x * Vector2.x + Vector1.y * Vector2.y + Vector1.z * Vector2.z;
	
	return a;
}

}
