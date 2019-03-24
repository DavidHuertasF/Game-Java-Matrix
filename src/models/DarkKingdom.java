package models;

public class DarkKingdom extends Character implements GeneralActions{
    
    public DarkKingdom(int lives, String name) {
        super(lives, name);
    }
    
    @Override
    public void attack(int numberAttack, Character principalCharacter, Character EnemyActual) {
         if (numberAttack == 1){ 
            principalCharacter.setLives( (principalCharacter.getLives())-(principalCharacter.getAttacks()[0].getHurt()));
            
        }        
        else if (numberAttack == 2){
                principalCharacter.setLives( (principalCharacter.getLives())-(principalCharacter.getAttacks()[1].getHurt()));
                
        }      
        else if (numberAttack == 3){
                principalCharacter.setLives( (principalCharacter.getLives())-(principalCharacter.getAttacks()[1].getHurt()));
               
        }
    }
}
