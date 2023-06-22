package Problema2;




public class ClientPunct {
	public static void main(String[] args) {
		Punct p1 = new PunctColorat(0, 0, 16);
		System.out.println(p1.toString());
		if (p1 instanceof PunctColorat)
			System.out.println("DA");
		PunctColorat p2 = (PunctColorat) p1;
		System.out.println("codul culorii punctului este :" + p2.getC());
	}
}
