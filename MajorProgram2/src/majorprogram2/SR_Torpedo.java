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
public class SR_Torpedo extends PhotonTorpedo {
    private double remainingDistance;
    
    public SR_Torpedo(){
        remainingDistance = 0;
    }

    /**
     * @return the remainingDistance
     */
    public double getRemainingDistance() {
        return remainingDistance;
    }

    /**
     * @param remainingDistance the remainingDistance to set
     */
    public void setRemainingDistance(double remainingDistance) {
        this.remainingDistance = remainingDistance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.valueOf(remainingDistance);
    }
    
}
