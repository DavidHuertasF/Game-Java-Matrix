package models;

public class Elf extends DarkKingdom{
    private Attack[] attacksOfElf;
    
    public Elf() {
        super(20, "Elf");
        attacksOfElf= new Attack[3];
        attacksOfElf[0] = new Attack("ataque1", 0, 1);
        attacksOfElf[1] = new Attack("ataque2", 0, 2);
        attacksOfElf[2] = new Attack("ataque3", 0, 3);
        Elf.super.setAttacks(attacksOfElf);
    }
}
