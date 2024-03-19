package modelos;
import java.util.*;

/**
 * 
 */
public class Rectangulo {

 
    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

    /**
     * 
     */
    
    /**
     * Default constructor
     */
    public Rectangulo() {
    	this.base=1;
    	this.altura=1;
    	
    }

    /**
     * @param base 
     * @param altura
     */
    public Rectangulo(int base, int altura) {
        // TODO implement here
    	this.base=base;
    	this.altura=altura;
    }

    /**
     * @return lisot
     */
    public void setBase(int base) {
        // TODO implement here
        this.base=base;
    }

    /**
     * @param base
     */
    public int getBase() {
        return this.base;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * @return listo
     */
    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    /**
     * @return LISTO
     */
    public int getArea() {
        // TODO implement here
        return this.base * this.altura;
    }

    /**
     * @return LISOT
     */
    public int getPerimetro() {
        // TODO implement here
        return 2*base + 2*altura;
    }
    /**
     * 
     */


}