/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import meteorblasterbackend.CraftData;
import meteorblasterbackend.MeteorData;

/**
 *
 * @author Doetheman
 */
public class MajorProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
        PhotonTorpedo PT = new PhotonTorpedo();
        System.out.println(PT.toString());
        
        Torpedo T = new Torpedo();
        System.out.println(T.toString());
        
        */
       CraftData CD = new CraftData();
       Craft C = new Craft(CD);
       System.out.println( C.toString());
       
       MeteorData MD = new MeteorData();
       Meteor M = new Meteor(MD,null,0.0,0.0);
       System.out.println(M.toString());
       
       RadialBomb RBomb = new RadialBomb();
       System.out.println(RBomb.toString());
       
       PowerUpCraft PUC = new PowerUpCraft(CD);
       System.out.println(PUC.toString());
       
       SR_Torpedo ST = new SR_Torpedo();
       System.out.println( ST.toString());
    }
    
}
