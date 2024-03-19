package app;

import modelos.Circulo;
import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);
		
		Circulo c1= new Circulo (3);
		
		int area1=r1.getArea();
		int perimetro2=r2.getPerimetro();
		
		double radio3=c1.areaCirculo();
		
		System.out.println("El area del rectangulo 1 es "+area1);
		System.out.println("El perimetro del rectangulo 2 es "+perimetro2);
		System.out.println("El area del circulo es "+radio3);
	}

}
