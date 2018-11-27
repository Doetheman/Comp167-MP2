/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.applet.AudioClip;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import meteorblasterbackend.CraftData;

/**
 *
 * @author Doetheman
 */
public class Craft extends MovingSprite {
    private double DECREASE_AMT;
    private double INCREASE_AMT;
    private double facingDirection;
    private Image [] images;
    private ArrayList<Torpedo> torpedoes;
    private URL phaserResource;
    private AudioClip phaserClip;
    private double shieldStrength;
    
public Craft( CraftData craftData){
    craftData = new CraftData();
}
public void rotate ( double angle){
        setFacingDirection(+ angle);
}
public void increaseSpeed(){
   setSpeed(getSpeed()+ getINCREASE_AMT());
}
public void decreaseSpeed(){
    setSpeed(getSpeed()+ getDECREASE_AMT());
}
public void fireTorpedo(){
    Torpedo boom = new Torpedo();
    addTorpedoes(boom);
}
public void abortTorpedoes(){
    for(int i = 0; i < torpedoes.size(); i++){
        deleteTorpedo(i);
    }
}
    @Override
    public double getBondingRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the DECREASE_AMT
     */
    public double getDECREASE_AMT() {
        return DECREASE_AMT;
    }

    /**
     * @param DECREASE_AMT the DECREASE_AMT to set
     */
    public void setDECREASE_AMT(double DECREASE_AMT) {
        this.DECREASE_AMT = DECREASE_AMT;
    }

    /**
     * @return the INCREASE_AMT
     */
    public double getINCREASE_AMT() {
        return INCREASE_AMT;
    }

    /**
     * @param INCREASE_AMT the INCREASE_AMT to set
     */
    public void setINCREASE_AMT(double INCREASE_AMT) {
        this.INCREASE_AMT = INCREASE_AMT;
    }

    /**
     * @return the facingDirection
     */
    public double getFacingDirection() {
        return facingDirection;
    }

    /**
     * @param facingDirection the facingDirection to set
     */
    public void setFacingDirection(double facingDirection) {
        this.facingDirection = facingDirection;
    }

    /**
     * @return the images
     */
    public Image[] getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(Image[] images) {
        this.images = images;
    }

    /**
     * @param index
     * @return the torpedoes
     */
    public Torpedo getTorpedoes(int index) {
        return torpedoes.get(index);
        }
    public int getNumTorpedoes(){
        return torpedoes.size();
    }
    /**
     */
    public void setTorpedoes( int index , Torpedo t) {
        torpedoes.set( index, t);
    }
    public void addTorpedoes( Torpedo item){
        torpedoes.add(item);        
    }
    public Torpedo deleteTorpedo( int index){
        return torpedoes.remove(index);
    }
    /**
     * @return the phaserResource
     */
    public URL getPhaserResource() {
        return phaserResource;
    }

    /**
     * @param phaserResource the phaserResource to set
     */
    public void setPhaserResource(URL phaserResource) {
        this.phaserResource = phaserResource;
    }

    /**
     * @return the phaserClip
     */
    public AudioClip getPhaserClip() {
        return phaserClip;
    }

    /**
     * @param phaserClip the phaserClip to set
     */
    public void setPhaserClip(AudioClip phaserClip) {
        this.phaserClip = phaserClip;
    }

    /**
     * @return the shieldStrength
     */
    public double getShieldStrength() {
        return shieldStrength;
    }

    /**
     * @param shieldStrength the shieldStrength to set
     */
    public void setShieldStrength(double shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return DECREASE_AMT +" "+INCREASE_AMT+" "+facingDirection+" "+Arrays.toString(images)+" "+
               torpedoes+" "+phaserResource+" "+phaserClip+" "+ shieldStrength;
    }
}
