import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // 모서리에서 회전
        turnAtEdge();
        // 이동하면서 랜덤으로 회전
        randomTurn();
        // 한번에 5씩 움직임
        move(5);
        // Crab과 마주침
        lookForCrab();
    }
    
    /**
     * Check whether we are at the edge of the world. If we are, turn a bit.
     * If not, do nothing.
     */
    public void turnAtEdge()
    {
        // 만약 모서리에 있다면
        if(isAtEdge())
            turn(17);
        // 17정도 회전
    }
    
    /**
     * Randomly decide to turn from the current direction, or not. If we turn
     * turn a bit left or right by a random degree.
     */
    public void randomTurn()
    {
        // 무작위로 회전
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    
    /**
     * Try to pinch a crab. That is: check whether we have stumbled upon a crab.
     * If we have, remove the crab from the game, and stop the program running.
     */
    public void lookForCrab()
    {
        // Crab과 닿으면
        if(isTouching(Crab.class)){
        removeTouching(Crab.class);
        Greenfoot.playSound("au.wav");
        getWorld().showText("Oops!", 200,300);
        Greenfoot.stop();
        
    }
        // Crab을 제거
        // au.wav 음악 재생
        // Oops! 문구 표시
        // Greenfoot.stop();
    }    
}
