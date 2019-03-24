package models;

public class Skeleton extends DarkKingdom{
    private Attack[] attacksOfSkeleton;
    
    public Skeleton() {
        super(26, "Skeleton");
        attacksOfSkeleton= new Attack[3];
        attacksOfSkeleton[0] = new Attack("ataque1",0 , 4);
        attacksOfSkeleton[1] = new Attack("ataque2",0 , 5);
        attacksOfSkeleton[2] = new Attack("ataque3",0 , 6);
        Skeleton.super.setAttacks(attacksOfSkeleton);
    }
}
