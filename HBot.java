/**
   @Author: 
      Date: Sep 06, 2006 
   Teacher: 
       Lab: 
      Misc: 
  */
import kareltherobot.*;
public class HBot implements Directions
{
        
    public static void task(UrRobot karel) 
    {
        karel.putBeeper();   
        karel.move();  
        karel.putBeeper();
        karel.move();
        karel.putBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.putBeeper();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.putBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putBeeper();
        karel.turnOff();
        
        //perform task
        
    }
}
