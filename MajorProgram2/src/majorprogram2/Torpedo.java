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
public class Torpedo extends MovingSprite {
    private double damage;
    
    public Torpedo(){
        damage = 0.0;
        
    }

    /**
     * @return the damage
     */
    public double getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(double damage) {
        this.damage = damage;
    }
    
    @Override
    public String toString(){
        return Double.toString(damage);
    }

    @Override
    public double getBondingRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
