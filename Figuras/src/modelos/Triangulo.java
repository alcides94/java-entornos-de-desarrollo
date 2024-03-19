package modelos;


import java.util.*;

/**
 * 
 */
public class Triangulo {


    /**
     * 
     */
    private double base;

    /**
     * 
     */
    private double altura;

    /**
     * constructor vacio
     */
    public Triangulo() {
        // TODO implement here
    }

    /**
     * constructor declarando atributos
     * @param base 
     * @param altura
     */
    public Triangulo(double base, double altura) {
        // TODO implement here
    	this.base=base;
    	this.altura=altura;
    }

    /**
     * @return
     */
    public double getBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * @return
     */
    public double getAltura() {
        // TODO implement here
        return this.altura;
    }

    /**
     * @param altura
     */
    public void setAltura(double altura) {
        // TODO implement here
    	this.altura=altura;
    }

    /**
     * @param base
     */
    public void setBase(double base) {
        // TODO implement here
    	this.base=base;
    }

    /**
     * @return
     */
    public double getAreaTriangulo() {
        // TODO implement here
        return (this.altura*this.base)/2;
    }

}