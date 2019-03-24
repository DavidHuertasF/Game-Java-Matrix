package models;

public class King extends DarkKingdom{
    private Attack[] attacksOfKing;
    
    public King() {
        super(30,"King Wolfman");   
        attacksOfKing= new Attack[3];
        attacksOfKing[0] = new Attack("ataque1", 0, 7);
        attacksOfKing[1] = new Attack("ataque2", 0, 8);
        attacksOfKing[2] = new Attack("ataque3", 0, 9);
        King.super.setAttacks(attacksOfKing);
    }
}
