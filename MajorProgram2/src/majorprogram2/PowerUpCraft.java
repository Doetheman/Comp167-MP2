/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.util.ArrayList;
import meteorblasterbackend.CraftData;


/**
 *
 * @author Doetheman
 */
public class PowerUpCraft extends Craft{
    private int invincibleTime;
    private int shieldModelTime;
    private ArrayList<Torpedo> loadedTorpedoes;
    
    public PowerUpCraft(CraftData cd){
        super(cd);
        invincibleTime = 0;
        shieldModelTime = 0;
        loadedTorpedoes = new ArrayList<>();
        
    }

    /**
     * @return the invincibleTime
     */
    public int getInvincibleTime() {
        return invincibleTime;
    }

    /**
     * @param invincibleTime the invincibleTime to set
     */
    public void setInvincibleTime(int invincibleTime) {
        this.invincibleTime = invincibleTime;
    }

    /**
     * @return the shieldModelTime
     */
    public int getShieldModelTime() {
        return shieldModelTime;
    }

    /**
     * @param shieldModelTime the shieldModelTime to set
     */
    public void setShieldModelTime(int shieldModelTime) {
        this.shieldModelTime = shieldModelTime;
    }

    /**
     * @return the loadedTorpedoes
     */
    public ArrayList<Torpedo> getLoadedTorpedoes() {
        return loadedTorpedoes;
    }

    /**
     * @param loadedTorpedoes the loadedTorpedoes to set
     */
    public void setLoadedTorpedoes(ArrayList<Torpedo> loadedTorpedoes) {
        this.loadedTorpedoes = loadedTorpedoes;
    }
    @Override
    public String toString(){
        return invincibleTime + " " + shieldModelTime +" "+ loadedTorpedoes;
    }
}
