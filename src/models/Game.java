package models;
import models.Maps.Block;
import controllers.Ataccks;
import javax.swing.JOptionPane;

public class Game { 
    public LightKingdom principalCharacter;
    public DarkKingdom EnemyActual;  
    public Block [][] city;
    public Block [][] register1;
    public Block [][] register2;
    
    public void addprincipalCharacter(TypeCharacter character){
        EnemyActual = new Elf(); 
        switch(character){
            case MAGICIAN:
                principalCharacter = new Magician();
                break;
         
            case SHOOTER:
                principalCharacter = new Shooter();
                break;

            case SOLDIER:           
                principalCharacter = new Soldier();
                break;
        }              
    }
    
    public void FightKing(){
        EnemyActual = new King();    
    } 
    public void FightSkeleton(){
        EnemyActual = new Skeleton();  
    } 
  
    public void attackPlayer(int numberAttack){
       principalCharacter.attack(numberAttack, principalCharacter, EnemyActual);
    }
    
    public void attackVillane(int numberAttack){
        EnemyActual.attack(numberAttack, principalCharacter, EnemyActual);
    } 
    
    public boolean verifyCharacterIsLive(String character){
        if (character.equals("good") && principalCharacter.getLives() <= 0){
           return false; 
        }
        if (character.equals("bad") && EnemyActual.getLives() <= 0){
           return false;
        }
        return true;
    }
  
    public String NameEnemyActual(){
        return EnemyActual.getName();     
    }
    
    public Character prCharacter(){
        return principalCharacter;     
    }
     public String namePrCharacter(){
         System.out.println(principalCharacter.getName());
         return principalCharacter.getName();     
    }
}  

    
    
        

   
  