/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.awt.Shape;

/**
 *
 * @author Doetheman
 */
public class PhotonTorpedo extends Torpedo {
    private Shape icon;
    private int iconWidth;
    private int iconHeight;
    
    public void PhotonTorpedo( double locX, double loxY, double dir){
        this.setIcon(null);
        this.setIconHeight(0);
        this.setIconWidth(0);
    
    }

    /**
     * @return the icon
     */
    public Shape getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Shape icon) {
        this.icon = icon;
    }

    /**
     * @return the iconWidth
     */
    public int getIconWidth() {
        return iconWidth;
    }

    /**
     * @param iconWidth the iconWidth to set
     */
    public void setIconWidth(int iconWidth) {
        this.iconWidth = iconWidth;
    }

    /**
     * @return the iconHeight
     */
    public int getIconHeight() {
        return iconHeight;
    }

    /**
     * @param iconHeight the iconHeight to set
     */
    public void setIconHeight(int iconHeight) {
        this.iconHeight = iconHeight;
    }
    
    @Override
    public String toString(){
        return(Integer.toString( iconWidth) +" "+ Integer.toString(iconHeight));
    }

    @Override
    public double getBondingRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
