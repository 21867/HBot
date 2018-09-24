import kareltherobot.*;

/**
 * Write a description of class HBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HBotDriver implements Directions
{
    public static void main(String args[]) 
    {

        UrRobot karel =  new UrRobot(1,1,North, infinity);
        HBot.task(karel);

    } 

    static {
        World.reset(); 
        //World.readWorld("chp2_6.kwld"); 
        World.setDelay(10);  
        World.setVisible(true);

    }
    //perform task

}

