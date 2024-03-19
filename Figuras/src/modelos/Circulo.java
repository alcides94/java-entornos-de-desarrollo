package modelos;
import java.util.*;

/**
 * 
 */
public class Circulo {

   

    /**
     * Declaracion de variable
     */
    public double radio;

    /**
     * 
     */
    
    /**
     * Default constructor
     */
    public Circulo() {
    }
    
   
    public Circulo(double radio) {
    	this.radio=radio;
    }

    /**
     * @return
     */
    public double getRadio() {
        // TODO implement here
        return this.radio;
    }

    /**
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio=radio;
    }

    /**
     * @return SE CALCULA EL AREA DEL CIRCULO
     */
    public double areaCirculo() {
        // TODO implement here
        return Math.PI * this.radio*this.radio;
    }

}