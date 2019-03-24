package models;

public class Magician extends LightKingdom{
    private Attack[] attacksOfMagician;
   
    public Magician() {
        super(80,"Magician");
            attacksOfMagician = new Attack[3];
            attacksOfMagician[0] = new Attack("ataque1", 1, 5);
            attacksOfMagician[1] = new Attack("ataque2", 0, 6);
            attacksOfMagician[2] = new Attack("ataque3", 2, 4);
            Magician.super.setAttacks(attacksOfMagician);
    }
}
