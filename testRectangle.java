
public class testRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumwidth = 0, sumheight = 0;
        Rectangle r1 = new Rectangle(5,6);
        Rectangle r2 = new Rectangle(6,9);
        sumwidth = r1.getWidth() + r2.getWidth();
        sumheight = r1.getHeight() + r2.getWidth();
        r1.print();
        r2.print();
        System.out.println("The width sum: " + sumwidth);
        System.out.println("The height sum: " + sumheight);
        System.out.println("The total area is: " + r1.area());
        System.out.println("The total area is: " + r2.area());
	}

}
