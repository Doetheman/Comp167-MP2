/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.awt.Image;
import meteorblasterbackend.MeteorData;

/**
 *
 * @author Doetheman
 */
public class Meteor extends MovingSprite {
    private int MIN_SIZE;
    private int points;
    private int size;
    private double meteorImageWidth;
    private double meteorImageHeight;
    
    public Meteor( MeteorData meteorData, Image image , double xLoc, double yLoc){
        MIN_SIZE = meteorData.getMinSize();
        points = 0;
        meteorImageWidth = 0;
        meteorImageHeight = 0;
    }
    @Override
    public double getBondingRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the MIN_SIZE
     */
    public int getMIN_SIZE() {
        return MIN_SIZE;
    }

    /**
     * @param MIN_SIZE the MIN_SIZE to set
     */
    public void setMIN_SIZE(int MIN_SIZE) {
        this.MIN_SIZE = MIN_SIZE;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the meteorImageWidth
     */
    public double getMeteorImageWidth() {
        return meteorImageWidth;
    }

    /**
     * @param meteorImageWidth the meteorImageWidth to set
     */
    public void setMeteorImageWidth(double meteorImageWidth) {
        this.meteorImageWidth = meteorImageWidth;
    }

    /**
     * @return the meteorImageHeight
     */
    public double getMeteorImageHeight() {
        return meteorImageHeight;
    }

    /**
     * @param meteorImageHeight the meteorImageHeight to set
     */
    public void setMeteorImageHeight(double meteorImageHeight) {
        this.meteorImageHeight = meteorImageHeight;
    }
    
}
