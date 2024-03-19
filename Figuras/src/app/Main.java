package app;

import modelos.Circulo;
import modelos.Rectangulo;
import modelos.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dos rectangulos
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);
		//Un circulo	
		Circulo c1= new Circulo (3);
		//Un triangulo
		Triangulo t1=new Triangulo(5,5);
		
		//calculo de areas de rectangulo
		int area1=r1.getArea();
		int perimetro2=r2.getPerimetro();
		
		//calculo de area de circulo
		double radio3=c1.areaCirculo();
		
		//calculo de area de tirangulo
		double triangulo4=t1.getAreaTriangulo();
		
		System.out.println("El area del rectangulo 1 es "+area1);
		System.out.println("El perimetro del rectangulo 2 es "+perimetro2);
		System.out.println("El area del circulo es "+radio3);
		System.out.println("El area del triangulo es "+triangulo4);
	}

}
