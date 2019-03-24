package models;

public  class Character {
   private String name;
   private int lives;
   private Attack [] attacks;
   
   public Character(int lives, String name) {
        this.name = name;
        this.lives = lives;     
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    public String getName() {
        return name;
    }

    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }
    public int getLives() {
        return lives;
    }
    public Attack[] getAttacks() {
        return attacks;
    }
}    
    
    
        

   
  