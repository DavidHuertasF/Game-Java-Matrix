package models.Maps;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import sun.applet.Main;



public class MapActivity {
    public Block [][] MapOne;
    public Block [][] MapTwo;
    public Block [][] MapThree;
    
    Random aleatorio = new Random();
    
    public boolean children1Map1 =false;
    public boolean children2Map1 =false;
    public boolean children1Map2 =false;
    public boolean children2Map2 =false;
    public boolean children1Map3 =false;
    public boolean children2Map3 =false;
    public boolean children1Map1HOME =false;
    public boolean children2Map1HOME =false;
    public boolean children1Map2HOME =false;
    public boolean children2Map2HOME =false;
    public boolean children1Map3HOME =false;
    public boolean children2Map3HOME =false;
         
    public boolean map1finish = false;
    public boolean map2finish = false;
    public boolean map3finish = false;
  
    
    public static final int ROWS_MAP_ONE = 7;
    public static final int COLUMNS_MAP_ONE = 7;
    
    public static final int ROWS_MAP_TWO = 7;
    public static final int COLUMNS_MAP_TWO = 7;
    
    public static final int ROWS_MAP_THREE = 8;
    public static final int COLUMNS_MAP_THREE = 11;
    
    public int CharacterMap1PostionRow = 3;
    public int CharacterMap1PostionColumn = 3;
     
    public int CharacterMap2PostionRow = 3;
    public int CharacterMap2PostionColumn = 3; 
    
    public int CharacterMap3PostionRow = 3;
    public int CharacterMap3PostionColumn = 5;
    
    public int actualColumnFlag;
    public int actualRowFlag;
    public boolean captureFlag = false;
  
    public MapActivity() {    
        MapOne = new Block[ROWS_MAP_ONE][COLUMNS_MAP_ONE];
        MapTwo = new Block[ROWS_MAP_TWO][COLUMNS_MAP_TWO];
        MapThree = new Block[ROWS_MAP_THREE][COLUMNS_MAP_THREE];
        fillInitial();
        addObstacles();
        addCharacters();
        addChildrens();
        fillWithDangerous();
        

    }
    public void resetCharacters() {
     CharacterMap1PostionRow = 3;
     CharacterMap1PostionColumn = 3;
     CharacterMap2PostionRow = 3;
     CharacterMap2PostionColumn = 3; 
     CharacterMap3PostionRow = 3;
     CharacterMap3PostionColumn = 5;
     fillInitial();
     addObstacles();
     fillWithDangerous();
     addChildrens();
      MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Character();
      MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] =  new Character();
      MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] =  new Character();  
    }
    
    public void fillInitial(){
        for (int i = 0; i < MapOne.length; i++) {
            for (int j = 0; j < MapOne[i].length; j++) {
                MapOne [i][j] = new Passed();     
            } 
        }
        for (int i = 0; i < MapTwo.length; i++) {
            for (int j = 0; j < MapTwo[i].length; j++) {
                MapTwo [i][j] = new Passed();     
            } 
        }
        for (int i = 0; i < MapThree.length; i++) {
            for (int j = 0; j < MapThree[i].length; j++) {
               MapThree [i][j] = new Passed();     
            } 
        }
    } 
    
    public void addObstacles(){
      
        for (int i = 0; i < MapOne.length; i++) {
            for (int j = 0; j < MapOne[i].length; j++) {
                if (i == 0 || j == 0 ||i == ROWS_MAP_ONE - 1 || j== COLUMNS_MAP_ONE -1) {
                     MapOne[i][j] = new Obstacle();
                }else{
                    MapOne[i][j] = new Passed();
                }
            MapOne[2][2] = new Obstacle();
            MapOne[2][3] = new Obstacle();
            MapOne[2][4] = new Obstacle();
            MapOne[3][2] = new Obstacle();
            MapOne[4][2] = new Obstacle();
            MapOne[4][4] = new Obstacle();
           
            }
        }    
       for (int i = 0; i < MapTwo.length; i++) {
            for (int j = 0; j < MapTwo[i].length; j++) {
                if (i == 0 || j == 0 ||i == ROWS_MAP_TWO-1 || j== COLUMNS_MAP_TWO-1) {
                     MapTwo[i][j] = new Obstacle();
                }else{
                    MapTwo[i][j] = new Passed();
                }
            MapTwo[2][2] = new Obstacle();
            MapTwo[2][3] = new Obstacle();
            MapTwo[2][4] = new Obstacle();
            MapTwo[4][2] = new Obstacle();
            MapTwo[4][4] = new Obstacle();
            MapTwo[5][2] = new Obstacle();
            }
        }   
       for (int i = 0; i < MapThree.length; i++) {
            for (int j = 0; j < MapThree[i].length; j++) {
                if (i == 0 || j == 0 ||i == ROWS_MAP_THREE-1 || j== COLUMNS_MAP_THREE-1) {
                     MapThree[i][j] = new Obstacle();
                }else{
                    MapThree[i][j] = new Passed();
                }
            MapThree[2][2] = new Obstacle();
            MapThree[2][4] = new Obstacle();
            MapThree[2][6] = new Obstacle();
            MapThree[2][8] = new Obstacle();
            MapThree[3][6] = new Obstacle();
            MapThree[3][8] = new Obstacle();
            MapThree[4][2] = new Obstacle();
            MapThree[4][4] = new Obstacle();
            MapThree[4][5] = new Obstacle();
            MapThree[4][6] = new Obstacle();
            MapThree[4][8] = new Obstacle();
            MapThree[5][2] = new Obstacle();
                  
            }
        }   
    }
    
    public void fillWithDangerous (){
      
                MapOne[5][5] = new Dangerous();
                MapOne[4][3] = new Dangerous();
                MapTwo[5][4] = new Dangerous();
                MapTwo[2][1] = new Dangerous();
                MapTwo[1][5] = new Dangerous();
                MapThree[6][7] = new Dangerous();
                MapThree[1][6] = new Dangerous();
                MapThree[3][3] = new Dangerous();
                MapThree[5][3] = new Dangerous();
                
                
                
       
    
    }
    
    public void addChildrens (){
            MapOne[1][5] = new ChildrenOne();
            MapOne[4][5] = new ChildrenTwo();
            MapOne[3][5] = new ChildrenOneHouse();
            MapOne[5][3] = new ChildrenTwoHouse();
           
            MapTwo[5][1] = new ChildrenOne();
            MapTwo[5][3] = new ChildrenTwo();
            MapTwo[3][5] = new ChildrenOneHouse();
            MapTwo[1][1] = new ChildrenTwoHouse();
            
            MapThree[3][7] = new ChildrenOne();
            MapThree[3][9] = new ChildrenTwo();
            MapThree[3][1] = new ChildrenOneHouse();
            MapThree[6][1] = new ChildrenTwoHouse();
       
    }        
   
    public void addCharacters (){
            MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Character();
            MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] =  new Character();
            MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] =  new Character();      
    }        
       
    public String printMap1(){
        String camp = "";
        for (int i = 0; i < MapOne.length; i++) {
            for (int j = 0; j < MapOne[i].length; j++) {
                switch (MapOne[i][j].getBoxCategory()){
                    case BOTIQUIN:
                        camp +="   +";
                        break;
                    case CHARACTER:
                        camp +="    ♀";
                        break;
                    case DANGEROUS:
                        camp +="    ☠";
                        break;    
                    case CHILDREN_1:
                        camp +="     1";
                        break;  
                    case CHILDREN_2:
                    camp +="     2";
                    break;  
                    
                    case HOME_ONE:
                    camp +="    h1";
                    break;  
                    
                    case HOME_TWO:
                    camp +="    h2";
                    break;  
                    case FREEWAY:
                        camp +="     ° ";
                        break; 
                    case OBSTACLE:
                        camp +="    ♣";
                        break;    
                    
                }
            
            }
            camp += "\n"+"\n"; 
        }
     
        return camp;
    } 
    
    public String printMap2(){
        String camp = "";
        for (int i = 0; i < MapTwo.length; i++) {
            for (int j = 0; j < MapTwo[i].length; j++) {
                switch (MapTwo[i][j].getBoxCategory()){
                    case BOTIQUIN:
                        camp +="   ";
                        break;
                    case CHARACTER:
                        camp +="    ♀";
                        break;
                    case DANGEROUS:
                        camp +="    ☠";
                        break;    
                    case CHILDREN_1:
                        camp +="     1";
                        break;  
                    case CHILDREN_2:
                    camp +="     2";
                    break;  
                    
                    case HOME_ONE:
                    camp +="    h1";
                    break;  
                    
                    case HOME_TWO:
                    camp +="    h2";
                    break;  
                    
                    case FREEWAY:
                        camp +="     ° ";
                        break; 
                    case OBSTACLE:
                        camp +="    ♣";
                        break;    
                    
                }
            
            }
             camp += "\n"+"\n"; 
        }
        
        return camp;
    } 
    
    public String printMap3(){
        String camp = "";
        for (int i = 0; i < MapThree.length; i++) {
            for (int j = 0; j < MapThree[i].length; j++) {
                switch (MapThree[i][j].getBoxCategory()){
                    case BOTIQUIN:
                        camp +="    +";
                        break;
                    case CHARACTER:
                        camp +="    ♀";
                        break;
                    case DANGEROUS:
                        camp +="    ☠";
                        break;    
                    case CHILDREN_1:
                        camp +="     1";
                        break;  
                    case CHILDREN_2:
                    camp +="     2";
                    break;  
                    
                    case HOME_ONE:
                    camp +="    h1";
                    break;  
                    
                    case HOME_TWO:
                    camp +="    h2";
                    break;  
                    
                    case FREEWAY:
                        camp +="     ° ";
                        break; 
                    case OBSTACLE:
                        camp +="    ♣";
                        break;    
                    
                }
            
            }
              camp += "\n"+"\n"; 
        }
        return camp;
    }    
   
    public void moveCharacterMapOne(int row, int column){
       if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn].getBoxCategory() !=  BoxCategory.HOME_ONE && MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn].getBoxCategory() !=  BoxCategory.HOME_TWO){
           MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
       }
        
        MapOne[row][column] = new Character();
          CharacterMap1PostionRow = row;
          CharacterMap1PostionColumn = column;
    }
    public void leftMap1(){
        if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn - 1].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn - 1);
        }
        else   if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn - 1].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn - 1);
        }
      else  if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn - 1].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn - 1);
        }
      else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn - 1].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map1 == true){
            children1Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn - 1);
            }else{
                MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                CharacterMap1PostionColumn = CharacterMap1PostionColumn - 1;   
            }
        }
      else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn - 1].getBoxCategory() == BoxCategory.HOME_TWO ){
            System.out.println(children2Map1);
            if (children2Map1 == true){
            children2Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn - 1);
           }else{
                 MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                  CharacterMap1PostionColumn = CharacterMap1PostionColumn - 1;  
            }
           
        }
        else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn - 1].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn - 1);
        }
        
        
        
    }
    public void RightMap1(){
          if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn + 1].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn + 1);
        }
     else   if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn + 1].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn + 1);
        }
       else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn + 1].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn + 1);
        }
       else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn + 1].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map1 == true){
            children1Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn + 1);
            }else{
                MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                CharacterMap1PostionColumn = CharacterMap1PostionColumn + 1;   
            }
        }
       else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn + 1].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map1 == true){
            children2Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn + 1);
           }else{
                 MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                  CharacterMap1PostionColumn = CharacterMap1PostionColumn + 1;  
            }
           
        } else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn + 1].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn + 1);
        }
    }    
    public void UpMap1(){
          if ( MapOne[CharacterMap1PostionRow- 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapOne(CharacterMap1PostionRow- 1,CharacterMap1PostionColumn );
        }
       else if ( MapOne[CharacterMap1PostionRow- 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow- 1,CharacterMap1PostionColumn );
        }
       else if ( MapOne[CharacterMap1PostionRow- 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow- 1,CharacterMap1PostionColumn );
        }
       else if ( MapOne[CharacterMap1PostionRow- 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map1 == true){
            children1Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow- 1,CharacterMap1PostionColumn );
            }else{
                MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                CharacterMap1PostionRow = CharacterMap1PostionRow - 1;   
            }
        }
       else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map1 == true){
            children2Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn );
           }else{
                 MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                CharacterMap1PostionRow = CharacterMap1PostionRow - 1;   
            }
           
        } else if ( MapOne[CharacterMap1PostionRow - 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapOne(CharacterMap1PostionRow - 1,CharacterMap1PostionColumn );
        }
    }    
    public void DowntMap1(){
        if ( MapOne[CharacterMap1PostionRow+ 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapOne(CharacterMap1PostionRow+ 1,CharacterMap1PostionColumn );
        }else if ( MapOne[CharacterMap1PostionRow+ 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_1 ){
           children1Map1 = true;
           moveCharacterMapOne(CharacterMap1PostionRow+ 1,CharacterMap1PostionColumn );
        }else if ( MapOne[CharacterMap1PostionRow+ 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map1 = true;
            moveCharacterMapOne(CharacterMap1PostionRow+ 1,CharacterMap1PostionColumn );
        }else if ( MapOne[CharacterMap1PostionRow+ 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map1 == true){
            children1Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow+ 1,CharacterMap1PostionColumn );
            }else{
                MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                CharacterMap1PostionRow = CharacterMap1PostionRow + 1;   
            }
        }else if ( MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map1 == true){
            children2Map1HOME = true;
            moveCharacterMapOne(CharacterMap1PostionRow,CharacterMap1PostionColumn );
            }else{
                 MapOne[CharacterMap1PostionRow][CharacterMap1PostionColumn] = new Passed();
                CharacterMap1PostionRow = CharacterMap1PostionRow + 1;   
            }
          
        } else if ( MapOne[CharacterMap1PostionRow + 1][CharacterMap1PostionColumn ].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapOne(CharacterMap1PostionRow + 1,CharacterMap1PostionColumn);
        }  
           
    }
    
     public void moveCharacterMapTwo(int row, int column){
       if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn].getBoxCategory() !=  BoxCategory.HOME_ONE && MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn].getBoxCategory() !=  BoxCategory.HOME_TWO){
           MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
       }
        
        MapTwo[row][column] = new Character();
          CharacterMap2PostionRow = row;
          CharacterMap2PostionColumn = column;
        }

    public void leftMapTwo(){
        if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn - 1].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn - 1);
        }
        else   if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn - 1].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map2 = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn - 1);
        }
      else  if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn - 1].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map2 = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn - 1);
        }
      else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn - 1].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map2 == true){
            children1Map2HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn - 1);
            }else{
                MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                CharacterMap2PostionColumn = CharacterMap2PostionColumn - 1;   
            }
        }
      else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn - 1].getBoxCategory() == BoxCategory.HOME_TWO ){
            System.out.println(children2Map2);
            if (children2Map2 == true){
            children2Map2HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn - 1);
           }else{
                 MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                  CharacterMap2PostionColumn = CharacterMap2PostionColumn - 1;  
            }
           
        }
        else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn - 1].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn - 1);
        }
        
        
        
    }
    public void RightMapTwo(){
          if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn + 1].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn + 1);
        }
     else   if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn + 1].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map2 = true;
            moveCharacterMapTwo(CharacterMap1PostionRow,CharacterMap2PostionColumn + 1);
        }
       else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn + 1].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map2 = true;
            
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn + 1);
        }
       else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn + 1].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map2 == true){
            children1Map2HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn + 1);
            }else{
                MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                CharacterMap2PostionColumn = CharacterMap2PostionColumn + 1;   
            }
        }
       else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn + 1].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map2 == true){
            children2Map1HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn + 1);
           }else{
                 MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                  CharacterMap2PostionColumn = CharacterMap2PostionColumn + 1;  
            }
           
        } else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn + 1].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn + 1);
        }
    }    
    public void UpMapTwo(){
          if ( MapTwo[CharacterMap2PostionRow- 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapTwo(CharacterMap2PostionRow- 1,CharacterMap2PostionColumn );
        }
       else if ( MapTwo[CharacterMap2PostionRow- 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map2 = true;
            moveCharacterMapTwo(CharacterMap2PostionRow- 1,CharacterMap2PostionColumn );
        }
       else if ( MapTwo[CharacterMap2PostionRow- 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map2 = true;
            moveCharacterMapTwo(CharacterMap2PostionRow- 1,CharacterMap2PostionColumn );
        }
       else if ( MapTwo[CharacterMap2PostionRow- 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map2 == true){
            children1Map1HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow- 1,CharacterMap2PostionColumn );
            }else{
                MapOne[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                CharacterMap2PostionRow = CharacterMap2PostionRow - 1;   
            }
        }
       else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map2 == true){
            children2Map2HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn );
           }else{
                 MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                CharacterMap2PostionRow = CharacterMap2PostionRow - 1;   
            }
           
        } else if ( MapTwo[CharacterMap2PostionRow - 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapTwo(CharacterMap2PostionRow - 1,CharacterMap2PostionColumn );
        }
    }    
    public void DowntMapTwo(){
        if ( MapTwo[CharacterMap2PostionRow+ 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapTwo(CharacterMap2PostionRow+ 1,CharacterMap2PostionColumn );
        }else if ( MapTwo[CharacterMap2PostionRow+ 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_1 ){
           children1Map2 = true;
           moveCharacterMapTwo(CharacterMap2PostionRow+ 1,CharacterMap2PostionColumn );
        }else if ( MapTwo[CharacterMap2PostionRow+ 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map2 = true;
            moveCharacterMapTwo(CharacterMap2PostionRow+ 1,CharacterMap2PostionColumn );
        }else if ( MapTwo[CharacterMap2PostionRow+ 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map2 == true){
            children1Map2HOME = true;
             
            moveCharacterMapTwo(CharacterMap2PostionRow+ 1,CharacterMap2PostionColumn );
            }else{
                MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                CharacterMap2PostionRow = CharacterMap1PostionRow + 1;   
            }
        }else if ( MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map2 == true){
            children2Map2HOME = true;
            moveCharacterMapTwo(CharacterMap2PostionRow,CharacterMap2PostionColumn );
            }else{
                 MapTwo[CharacterMap2PostionRow][CharacterMap2PostionColumn] = new Passed();
                CharacterMap2PostionRow = CharacterMap2PostionRow + 1;   
            }
          
        } else if ( MapTwo[CharacterMap2PostionRow + 1][CharacterMap2PostionColumn ].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapTwo(CharacterMap2PostionRow + 1,CharacterMap2PostionColumn);
        }  
           
    }
    
    
    
     public void moveCharacterMapThree(int row, int column){
       if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn].getBoxCategory() !=  BoxCategory.HOME_ONE && MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn].getBoxCategory() !=  BoxCategory.HOME_TWO){
           MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
       }
        
        MapThree[row][column] = new Character();
          CharacterMap3PostionRow = row;
          CharacterMap3PostionColumn = column;
        }

    public void leftMapThree(){
        if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn - 1].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn - 1);
        }
        else   if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn - 1].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map3 = true;
            moveCharacterMapThree(CharacterMap2PostionRow,CharacterMap3PostionColumn - 1);
        }
      else  if ( MapThree[CharacterMap2PostionRow][CharacterMap3PostionColumn - 1].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map3 = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn - 1);
        }
      else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn - 1].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map3 == true){
            children1Map3HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn - 1);
            }else{
                MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                CharacterMap3PostionColumn = CharacterMap3PostionColumn - 1;   
            }
        }
      else if ( MapTwo[CharacterMap3PostionRow][CharacterMap3PostionColumn - 1].getBoxCategory() == BoxCategory.HOME_TWO ){
            System.out.println(children2Map3);
            if (children2Map3 == true){
            children2Map3HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn - 1);
           }else{
                 MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                  CharacterMap3PostionColumn = CharacterMap3PostionColumn - 1;  
            }
           
        }
        else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn - 1].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapTwo(CharacterMap3PostionRow,CharacterMap3PostionColumn - 1);
        }
        
        
        
    }
    public void RightMapThree(){
          if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn + 1].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn + 1);
        }
     else   if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn + 1].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map3 = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn + 1);
        }
       else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn + 1].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map3= true;
            
            moveCharacterMapTwo(CharacterMap3PostionRow,CharacterMap3PostionColumn + 1);
        }
       else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn + 1].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map3 == true){
            children1Map3HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn + 1);
            }else{
                MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                CharacterMap3PostionColumn = CharacterMap3PostionColumn + 1;   
            }
        }
       else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn + 1].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map3 == true){
            children2Map1HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn + 1);
           }else{
                 MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                  CharacterMap3PostionColumn = CharacterMap3PostionColumn + 1;  
            }
           
        } else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn + 1].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn + 1);
        }
    }    
    public void UpMapThree(){
          if ( MapThree[CharacterMap3PostionRow- 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapThree(CharacterMap3PostionRow- 1,CharacterMap3PostionColumn );
        }
       else if ( MapThree[CharacterMap3PostionRow- 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_1 ){
            children1Map3 = true;
            moveCharacterMapThree(CharacterMap3PostionRow- 1,CharacterMap3PostionColumn );
        }
       else if ( MapThree[CharacterMap3PostionRow- 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map3 = true;
            moveCharacterMapThree(CharacterMap3PostionRow- 1,CharacterMap3PostionColumn );
        }
       else if ( MapThree[CharacterMap3PostionRow- 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map3 == true){
            children1Map3HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow- 1,CharacterMap3PostionColumn );
            }else{
                MapOne[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                CharacterMap3PostionRow = CharacterMap3PostionRow - 1;   
            }
        }
       else if ( MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map3 == true){
            children2Map3HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow,CharacterMap3PostionColumn );
           }else{
                 MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                CharacterMap3PostionRow = CharacterMap3PostionRow - 1;   
            }
           
        } else if ( MapThree[CharacterMap3PostionRow - 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.DANGEROUS ){
            moveCharacterMapThree(CharacterMap3PostionRow - 1,CharacterMap3PostionColumn );
        }
    }    
    public void DowntMapThree(){
        if ( MapThree[CharacterMap3PostionRow+ 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.FREEWAY ){
            moveCharacterMapThree(CharacterMap3PostionRow+ 1,CharacterMap3PostionColumn );
        }else if ( MapThree[CharacterMap3PostionRow+ 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_1 ){
           children1Map3 = true;
           moveCharacterMapThree(CharacterMap3PostionRow+ 1,CharacterMap3PostionColumn );
        }else if ( MapThree[CharacterMap3PostionRow+ 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.CHILDREN_2 ){
            children2Map3 = true;
            moveCharacterMapThree(CharacterMap3PostionRow+ 1,CharacterMap3PostionColumn );
        }else if ( MapThree[CharacterMap3PostionRow+ 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.HOME_ONE ){
            if (children1Map3 == true){
            children1Map3HOME = true;
             
            moveCharacterMapThree(CharacterMap3PostionRow+ 1,CharacterMap3PostionColumn );
            }else{
                MapThree[CharacterMap3PostionRow+1][CharacterMap3PostionColumn] = new Passed();
                CharacterMap3PostionRow = CharacterMap1PostionRow + 1;   
            }
        }else if ( MapThree[CharacterMap3PostionRow+1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.HOME_TWO ){
            if (children2Map3 == true){
            children2Map3HOME = true;
            moveCharacterMapThree(CharacterMap3PostionRow + 1,CharacterMap3PostionColumn );
            }else{
                 MapThree[CharacterMap3PostionRow][CharacterMap3PostionColumn] = new Passed();
                CharacterMap3PostionRow = CharacterMap3PostionRow + 1;   
            }
          
        } else if ( MapThree[CharacterMap3PostionRow + 1][CharacterMap3PostionColumn ].getBoxCategory() == BoxCategory.DANGEROUS ){  
            moveCharacterMapThree(CharacterMap3PostionRow + 1,CharacterMap3PostionColumn);
        }  
           
    }
    
    public boolean verifyMap (int map){
        if ( map == 1){
            if( children1Map1HOME == true && children2Map1HOME == true){
                return true;
            }else{
                return false;
            }
        }
         if ( map == 2){
            if( children1Map2HOME == true && children2Map2HOME == true){
                return true;
            }else{
                return false;
            }
        }
        if ( map == 3){
            if( children1Map3HOME == true && children2Map3HOME == true){
                return true;
            }else{
                return false;
            }
        }
    return false;
    }
    
}    
   



