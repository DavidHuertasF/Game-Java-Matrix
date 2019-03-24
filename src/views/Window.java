package views;
import javax.swing.JOptionPane;
import controllers.Ataccks;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import models.LightKingdom;
import models.DarkKingdom;
import models.Character;
import models.Elf;
import models.Magician;
import models.Shooter;
import models.Soldier;
import models.TypeCharacter;

public class Window {
    
    Icon Light;
    Icon Dark;
    Icon Attack;

     public void iconPrincipal(String principal,String enemy){
        if (principal == "Magician"){
              Light = new ImageIcon("src/icons/principal characters/Magician.gif");   
        }else if(principal == "Shooter"){
            Light = new ImageIcon("src/icons/principal characters/Shooter.gif");   
        }else if(principal == "Soldier"){
            Light = new ImageIcon("src/icons/principal characters/Soldier.gif");   
        }
        System.out.println(principal);
    }  
   public void showBoard(String board, String lives){
        JOptionPane.showMessageDialog(null, board, lives,JOptionPane.PLAIN_MESSAGE);
    }
 
   public int Directions(){
        int op2 = JOptionPane.showOptionDialog(null, " "+"Select de direction"+" ", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,Directions.values(),Directions.values()[0]);
        return op2;
    }
    
    public int getAttack(String lives,String principal,String enemy){               
         if (enemy == "Elf"){
           Dark = new ImageIcon("src/icons/ENEMIES/Ogre icon.png");;   
        }else if(enemy == "Skeleton"){
           Dark = new ImageIcon("src/icons/ENEMIES/skeleton icon.png");   
        }else if(enemy == "King Wolfman"){
           Dark = new ImageIcon("src/icons/ENEMIES/maxi.png");
        }
        
        Attack = new ImageIcon("src/icons/ENEMIES/OGRE.png");
        switch(Ataccks.valueOf(JOptionPane.showInputDialog(null,lives,"Select the attack",
            (JOptionPane.INFORMATION_MESSAGE),Attack,Ataccks.values(),Ataccks.values()[0]).toString())){
            case Attack:
                return 1;
            case Attack2:
                return 2;
            case Recuperate:
                return 3;            
        }
        return 0;
    }
    public void showMessageDark (String message){
        JOptionPane.showMessageDialog(null, message,"RESULT",JOptionPane.INFORMATION_MESSAGE,Dark);
    }
     public void showMessageLight(String message){
        JOptionPane.showMessageDialog(null, message,"RESULT",JOptionPane.INFORMATION_MESSAGE,Light);
    }
     public String askForName (){
        return (JOptionPane.showInputDialog(null, "A new hero is born , please enter your name; ","NAME",JOptionPane.QUESTION_MESSAGE));
    }
}    