package models;

public class Soldier extends LightKingdom{
    private Attack[] attacksOfSoldier;

    public Soldier() {
        super(120
                , "Soldier");
        attacksOfSoldier= new Attack[3];
        attacksOfSoldier[0] = new Attack("ataque1", -1, 7);
        attacksOfSoldier[1] = new Attack("ataque2", -3, 8);
        attacksOfSoldier[2] = new Attack("ataque3", -2, 6);
        Soldier.super.setAttacks(attacksOfSoldier);
    }
}
