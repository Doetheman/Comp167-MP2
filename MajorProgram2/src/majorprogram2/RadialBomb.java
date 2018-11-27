/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

/**
 *
 * @author Doetheman
 */
public class RadialBomb {
    private double blastRadius;
    
    RadialBomb(){
        blastRadius = 0;
        
    }

    /**
     * @return the blastRadius
     */
    public double getBlastRadius() {
        return blastRadius;
    }

    /**
     * @param blastRadius the blastRadius to set
     */
    public void setBlastRadius(double blastRadius) {
        this.blastRadius = blastRadius;
    }
    
    @Override
    public String toString(){
        return String.valueOf(blastRadius);
    }
}
