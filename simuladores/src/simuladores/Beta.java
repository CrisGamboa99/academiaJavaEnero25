package simuladores;

class Baap {
	public int h = 4;

	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}

public class Beta extends Baap {
	public int h = 44;
	@Override
	public int getH() {
		System.out.println("Beta " + h);
		return h;
	}

	public static void main(String[] args) {

	       Baap b = new Beta();
	       
	       System.out.println(b.h + " " + b.getH());
	       //Beta 44
	       //4 44
	       Beta bb = (Beta) b;
	       System.out.println(bb.h + " " + bb.getH());
	       //Beta 44
	       //44 44
	       //System.out.println("Fin Programa");
	}
}