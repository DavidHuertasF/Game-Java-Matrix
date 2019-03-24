package controllers;
import views.Window;
import models.Game;
import models.TypeCharacter;
import models.Maps.MapActivity;

import views.Principals;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Characters;
import views.FIGHT1;
import views.Ogre2;
import views.WinElf;
import java.util.Random;
import  views.GameOver;
import views.Skeleton1;
import views.Skeleton2;
import views.Skeleton3;
import views.King1;
import views.King2;
import views.King3;
import views.Win1;
import views.Win2;
import views.inf;
import views.Uml;

public class Controller implements ActionListener{
    private MapActivity captureTheFLag;
    private WinElf  winelf;
    private GameOver gameover;
    private Window window;
    private Game game;
    private Principals principal;
    private Characters character;
    private FIGHT1 fight1;
    private Ogre2 ogre2;
    private Skeleton1 skeleton1;
    private Skeleton2 skeleton2;
    private Skeleton3 skeleton3;
    private King1 king1;
    private King2 king2;
    private King3 king3;
    private Win1 Win1;
    private Win2 Win2;
    private Uml Uml;
    private inf inf;
    Random aleatorio = new Random();
    private String nameOfPlayer; 
    private MapActivity activity;    
        

    public Controller(Principals principal, Game model, Characters character,FIGHT1 fight1, Ogre2 ogre2,Window window, GameOver gameover,Skeleton1 skeleton1,Skeleton2 skeleton2,Skeleton3 skeleton3, WinElf winelf,King1 king1,
            King2 king2,King3 king3,Win1 win1, Win2 win2,Uml uml,inf inf){
       
        this.game = model;
        this.principal = principal;
        this.character = character;
        this.fight1 = fight1;
        this.ogre2 = ogre2;
        this.winelf = winelf;
        this.window = window;
        this.gameover = gameover;
        this.skeleton1 =skeleton1;
        this.skeleton2 =skeleton2;
        this.skeleton3 =skeleton3;
        this.king1 = king1;
        this.king2 = king2;
        this.king3 = king3;  
        this.Win1 = win1;
        this.Win2 =win2;
        this.Uml = uml;
        this.inf = inf;
        principal();
        activity = new MapActivity();
    }
       
    public void principal(){   
       
        principal.setTitle("MENÚ");
        principal.setLocationRelativeTo(null);
        principal.setVisible(true); 
        this.principal.jButton1.addActionListener(this);
        this.principal.jButton2.addActionListener(this);
         this.principal.jButton3.addActionListener(this);
    }              
    
    private void play() {
        character.setTitle("CHARACTER");
        character.setLocationRelativeTo(null);
        nameOfPlayer = window.askForName();
        character.setVisible(true); 
        this.character.jButton1.addActionListener(this);
        this.character.jButton2.addActionListener(this);
        this.character.jButton3.addActionListener(this);        
        
    }
    
    private void information() {
        inf.setTitle("INFORMATION");
        inf.setLocationRelativeTo(null);
        inf.setVisible(true); 
      
    }
    
    private void fight1() {
        map1();
        fight1.setTitle("THE ELF");
        fight1.setLocationRelativeTo(null);
        fight1.setVisible(true); 
        window.iconPrincipal(game.namePrCharacter(), game.NameEnemyActual());
        this.fight1.GoFight.addActionListener(this);
    }
    
    private void gameover(){
        gameover.setTitle("game over");
        gameover.setLocationRelativeTo(null);
        gameover.setVisible(true);   
    }
    
    private void win1(){
        ogre2.dispose();
        winelf.setTitle("WIN");
        winelf.setLocationRelativeTo(null);
        winelf.setVisible(true);
        this.winelf.WinElf.addActionListener(this);
    }
    
    private void win2(){
       skeleton2.dispose();
       skeleton3.setTitle("WIN");
       skeleton3.setLocationRelativeTo(null);
       skeleton3.setVisible(true);
       this.skeleton3.SkeletonDie.addActionListener(this);
    }
    
    private void wingame(){
       king3.dispose();
       Win1.setTitle("WIN");
       Win1.setLocationRelativeTo(null);
       Win1.setVisible(true);
       this.Win1.GameContk.addActionListener(this);
    }
    
    private void fightskeleton(){
        map2();
        skeleton1.setTitle("SKELETON");
        skeleton1.setLocationRelativeTo(null);
        skeleton1.setVisible(true);
        skeleton1.SkeletonContinue.addActionListener(this);
    }
    
    private void finals(){
        Win1.dispose();
        Win2.setTitle("FINAL");
        Win2.setLocationRelativeTo(null);
        Win2.setVisible(true);  
    }
    
    private void fightLord(){
        map3();
        king1.setTitle("KING WOLF");
        king1.setLocationRelativeTo(null);
        king1.setVisible(true);
        king1.fightKing.addActionListener(this);
    }
    
    private void fightLord1(){
        game.FightKing();
        boolean CharacterDie = false;
        int x = 0;
        king2.setTitle("KING WOLG");
        king2.setVisible(true);
        int z =1;
        while(z != 0){
            x = (1+ aleatorio.nextInt(3));
            game.attackPlayer(window.getAttack(("  Your lives: "+game.principalCharacter.getLives()+" \n"+"  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives()),game.principalCharacter.getName(),game.EnemyActual.getName()));
            window.showMessageLight(nameOfPlayer+ " the" + game.namePrCharacter()+" attack the "+game.NameEnemyActual()+"\n"+"Your lives: "+game.principalCharacter.getLives()+ "\n"+ "  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives());
            game.attackVillane(x);
            window.showMessageDark("The "+game.NameEnemyActual()+" attack you ! with your attack "+x+"\n"+"Your lives: "+game.principalCharacter.getLives()+ "\n"+ "  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives());
          
            if (game.verifyCharacterIsLive("good") == false){
                gameover();
                z =0;
                break;            
            }
    
            if (game.verifyCharacterIsLive("bad") == false){
                wingame();
                z = 0;
                break;
            }
        }
    }        
     private void uml() {
        Uml.setTitle("UML");
        Uml.setLocationRelativeTo(null);
        Uml.setVisible(true);   
    }    
    private void fightskeleton1(){
        game.FightSkeleton();
        boolean CharacterDie = false;
        int x = 0;
        System.out.println(x);
        skeleton2.setTitle("SKELETON");
        skeleton2.setVisible(true);
        int z =1;    
        while(z != 0){
            x = (1+ aleatorio.nextInt(3));
                game.attackPlayer(window.getAttack(("  Your lives: "+game.principalCharacter.getLives()+" \n"+"  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives()),game.principalCharacter.getName(),game.EnemyActual.getName()));
             window.showMessageLight(nameOfPlayer+ " the" + game.namePrCharacter()+" attack the "+game.NameEnemyActual()+"\n"+"Your lives: "+game.principalCharacter.getLives()+ "\n"+ "  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives());
            game.attackVillane(x);
            window.showMessageDark("The "+game.NameEnemyActual()+" attack you ! with your attack "+x+"\n"+"Your lives: "+game.principalCharacter.getLives()+ "\n"+"  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives());
          
            if (game.verifyCharacterIsLive("good") == false){
                gameover();
                z =0;
                break; 
            }
        
            if (game.verifyCharacterIsLive("bad") == false){
                win2();
                z = 0;
                break;
            }
        }
    }
    private void fight1A() {
        boolean CharacterDie = false;
        int x = 0;
        System.out.println(x);
        ogre2.setTitle("THE ELF");    
        ogre2.setVisible(true);
        int z =1; 
        while(z != 0){
            x = (1+ aleatorio.nextInt(3));
                game.attackPlayer(window.getAttack(("  Your lives: "+game.principalCharacter.getLives()+" \n"+"  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives()),game.principalCharacter.getName(),game.EnemyActual.getName()));
         window.showMessageLight(nameOfPlayer+ " the" + game.namePrCharacter()+" attack the "+game.NameEnemyActual()+"\n"+"Your lives: "+game.principalCharacter.getLives()+ "\n"+ "  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives());
            game.attackVillane(x);
            window.showMessageDark("The "+game.NameEnemyActual()+" attack you ! with your attack "+x+"\n"+"Your lives: "+game.principalCharacter.getLives()+ "\n"+"  lives of "+game.NameEnemyActual()+": "+game.EnemyActual.getLives());
          
            if (game.verifyCharacterIsLive("good") == false){
                gameover();
                z =0;
                break;     
            }
            if (game.verifyCharacterIsLive("bad") == false){
                win1();
                z = 0;
                break;
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == this.principal.jButton1){
            principal.dispose();
            play();
        }        
        else if (boton == this.principal.jButton3){
            uml();
        }      
        else if (boton == this.principal.jButton2){
            principal.dispose();
            information();
        }      
        
        else if (boton == this.character.jButton2){
            character.dispose();
            game.addprincipalCharacter(TypeCharacter.MAGICIAN);
            fight1();
        }
        
        else if (boton == this.character.jButton3){
            character.dispose();
            game.addprincipalCharacter(TypeCharacter.SHOOTER);
            fight1(); 
        }
        
        else if (boton == this.character.jButton1){
            character.dispose();
            game.addprincipalCharacter(TypeCharacter.SOLDIER);
            fight1();
        }
       
        else if (boton == this.fight1.GoFight){
            fight1.dispose();
            fight1A();
          
        }    
        
        else if (boton == this.winelf.WinElf){
            winelf.dispose();
            fightskeleton();    
        }    
        
        else if (boton == this.skeleton1.SkeletonContinue){
            skeleton1.dispose();
            fightskeleton1();    
        }   
       
        else if (boton == this.skeleton3.SkeletonDie){
            skeleton3.dispose();
            fightLord();    
        }
       
        else if (boton == this.king1.fightKing){
            king1.dispose();
            fightLord1();    
        }    
       
        else if (boton == this.Win1.GameContk){
           king1.dispose();
           finals();    
        }    
    } 

//------------------------------------------------------------------------------------MAPS
    public void map1(){ 
       int pasos =12;
     
       while (pasos >0 ){
       window.showBoard(activity.printMap1(), "Lives: "+game.principalCharacter.getLives()+" Steps: "+pasos); 
       move1();
       if(game.principalCharacter.getLives()< 0){
           gameover();
       }
       
       pasos --;
       System.out.println(pasos);
        if (activity.verifyMap(1)== true){
          return;
        }
       }    
    window.showBoard("You lost, try again  lives = -5", "LOST");
    game.principalCharacter.setLives(game.principalCharacter.getLives() -5);
    activity.resetCharacters();
    map1();
    } 
    public void map2(){ 
       int pasos =22;
     
       while (pasos >0 ){
       window.showBoard(activity.printMap2(), "Lives: "+game.principalCharacter.getLives()+"     Steps: "+pasos); 
       move2();
        if(game.principalCharacter.getLives()< 0){
           gameover();
       }
       pasos --;
       System.out.println(pasos);
        if (activity.verifyMap(2)== true){
            return;
        }
       }   
        window.showBoard("You lost, try again  lives = -5", "LOST");
    game.principalCharacter.setLives(game.principalCharacter.getLives() -5);
    activity.resetCharacters();
    map2();
    }  
    public void map3(){ 
       int pasos =30;
     
       while (pasos >0 ){
       window.showBoard(activity.printMap3(), "Lives: "+game.principalCharacter.getLives()+" Steps: "+pasos); 
       move3();
       if(game.principalCharacter.getLives()< 0){
           gameover();
       }
       pasos --;
       System.out.println(pasos);
        if (activity.verifyMap(3)== true){
            return;
        }
       }   
        window.showBoard("You lost, try again  lives = -5", "LOST");
    game.principalCharacter.setLives(game.principalCharacter.getLives() -5);
    activity.resetCharacters();
    map3();
    } 
     
    public void move1(){
          switch (window.Directions()){
                case 0:
              
                activity.leftMap1();
                break;
                case 1:
              activity.RightMap1();
                break;
                case 2:
                
                 activity.DowntMap1();
                break;
                case 3:
                
                 activity.UpMap1();
                break;    
            }
        }
    public void move2(){
          switch (window.Directions()){
              case 0:
              
                activity.leftMapTwo();
                break;
                case 1:
              activity.RightMapTwo();
                break;
                case 2:
                
                 activity.DowntMapTwo();
                break;
                case 3:
                
                 activity.UpMapTwo();
                break;    
            }
        }
    public void move3(){
          switch (window.Directions()){
               case 0:
              
                activity.leftMapThree();
                break;
                case 1:
              activity.RightMapThree();
                break;
                case 2:
                
                 activity.DowntMapThree();
                break;
                case 3:
                
                 activity.UpMapThree();
                break;    
            }
        }
  
}    
  
    

