/**
 * Testprogramm fuer die Klasse Triangle.
 * 
 * @author Agathe Merceron. (merceron@beuth-hochschule.de)
 * @version 1.01, 24.02.2011
 */
public class TriangleTest {
    /**
     * Main-Methode zum Starten und Testen der Klasse Triangle.
     * 
     * @param args
     *            Uebergabeparameter fuer das Programm
     */
    public static void main(String[] args) {

        // ein Dreieck mit richtigen Werten nicht gleichseitig
		System.out.println("Dreieck 1:");
        Triangle dreieck1 = new Triangle(1, 2.5f, 3);
		System.out.println("Ist gleichseitig? =>"+dreieck1.isEquilateral());
		System.out.println("Umfang = "+dreieck1.CalculatePerimeter());
		System.out.println("Hat rechten Winkel? => "+dreieck1.isRightAngle());
		System.out.println("---");
		
		
        // ein Dreieck mit richtigen Werten ist gleichseitig
		System.out.println("Dreieck 2:");
        Triangle dreieck2 = new Triangle(3.2f, 3.2f, 3.2f);
        System.out.println("Ist gleichseitig? =>"+dreieck2.isEquilateral());
		System.out.println("Umfang = "+dreieck2.CalculatePerimeter());
		System.out.println("Hat rechten Winkel? => "+dreieck2.isRightAngle());
		System.out.println("---");
		
        // ein Dreieck mit falschen Werten
		System.out.println("Dreieck 3:");
        Triangle dreieck3 = new Triangle(-1, 2, 3);
		System.out.println("Umfang = "+dreieck3.CalculatePerimeter());
		System.out.println("Hat rechten Winkel? => "+dreieck3.isRightAngle());
		System.out.println("---");	
		
        // ein Dreieck mit falschen Werten
		System.out.println("Dreieck 4:");
        Triangle dreieck4 = new Triangle(1, 2, 3);
		System.out.println("Umfang = "+dreieck4.CalculatePerimeter());
		System.out.println("Hat rechten Winkel? => "+dreieck4.isRightAngle());
		System.out.println("---");
		
		
		
        // ein Dreieck mit default Werten
		System.out.println("Dreieck 5:");
        Triangle dreieck5 = new Triangle();
		// Gleichseitig pruefen
        System.out.println("Ist gleichseitig? =>"+dreieck5.isEquilateral());
        System.out.println("Umfang = "+dreieck5.CalculatePerimeter());
		System.out.println("Hat rechten Winkel? => "+dreieck5.isRightAngle());
		System.out.println("---");
    }
}