package eserciziPCTO;
public class Triangle {
    int tHeight;
    int tBase;

    
    
    public Triangle(int h, int b) {
        tHeight = h;
        tBase = b;
    }

    public static void main(String[] args) {
		
	}
    public float getArea() {
        return (float)tBase * tHeight / 2;
    }
   
}