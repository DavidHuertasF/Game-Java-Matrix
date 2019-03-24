package run;
import controllers.Controller;
import models.Game;
import views.Principals;
import views.Characters;
import views.FIGHT1;
import views.Ogre2;
import views.Window;
import views.GameOver;
import views.Skeleton1;
import views.Skeleton2;
import views.Skeleton3;
import views.WinElf;
import views.King1;
import views.King2;
import views.King3;
import views.Win1;
import views.Win2;
import views.Uml;
import views.inf;

public class Run {
    public static void main(String[] args) {
        Uml uml = new Uml();
        Win1 win1 = new Win1();
        Win2 win2 = new Win2();
        King3 king3 = new King3();
        King2 king2 = new King2();
        King1 king1 = new King1();
        WinElf winelf = new WinElf();
        GameOver gameover = new GameOver();
        Skeleton1 skeleton1 = new Skeleton1();
        Skeleton2 skeleton2 = new Skeleton2();
        Skeleton3 skeleton3 = new Skeleton3();
        Characters character = new Characters();
        Ogre2 ogre2 = new Ogre2();
        Principals principal = new Principals();
        FIGHT1 fight1 = new FIGHT1();
        Game game = new Game();
        Window window = new Window();
        inf inf = new inf();
        Controller controller = new Controller(principal, game, character, fight1, ogre2, window, gameover,skeleton1,skeleton2,skeleton3,winelf,king1,
                king2,king3,win1,win2,uml, inf);
    }
}
