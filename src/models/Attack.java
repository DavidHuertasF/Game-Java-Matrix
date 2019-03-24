package models;
public  class Attack {
   private String name;
   private int cost;
   private int hurt; 
    
   public Attack(String name, int cost, int hurt) {
        this.name = name;
        this.cost = cost;
        this.hurt = hurt;
    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public int getHurt() {
        return hurt;
    }	
}    
    