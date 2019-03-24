package models;

public class Shooter extends LightKingdom{
    private Attack[] attacksOfShooter;
   
    public Shooter() {
        super( 90,"Shooter");
        attacksOfShooter= new Attack[3];
        attacksOfShooter[0] = new Attack("ataque1", -1, 7);
        attacksOfShooter[1] = new Attack("ataque2", 0, 4);
        attacksOfShooter[2] = new Attack("ataque3", 1, 3);
        Shooter.super.setAttacks(attacksOfShooter);
    }
}
