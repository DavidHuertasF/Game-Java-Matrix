package models;

public class LightKingdom extends Character implements GeneralActions{
    
    public LightKingdom(int lives, String name) {
        super(lives, name);
    }
    
    @Override
    public void attack(int numberAttack, Character principalCharacter, Character EnemyActual) {
        if (numberAttack == 1){
            principalCharacter.setLives( (principalCharacter.getLives())+(principalCharacter.getAttacks()[0].getCost()));
            EnemyActual.setLives((EnemyActual.getLives())-(principalCharacter.getAttacks()[0].getHurt()));
        }        
        else if (numberAttack == 2){
                principalCharacter.setLives( (principalCharacter.getLives())+(principalCharacter.getAttacks()[1].getCost()));
                EnemyActual.setLives((EnemyActual.getLives())-(principalCharacter.getAttacks()[1].getHurt()));
        }      
        else if (numberAttack == 3){
                principalCharacter.setLives( (principalCharacter.getLives())+(principalCharacter.getAttacks()[1].getCost()));
                EnemyActual.setLives((EnemyActual.getLives())-(principalCharacter.getAttacks()[1].getHurt())); 
        }    
    } 
}
