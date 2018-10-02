import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Lobster implements Freezable
{
    private int counter;
    
    public Turtle(int count) {
        freeze(count);
    }
    
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // counter가 0이 되면 Lobster와 동일하게 움직임
        if(counter>0){
            counter--;}
        else if(counter==0){
        super.act();}
    }
    
    public void freeze(int count) {
        // counter를 count로 설정
        counter = count;
    }
}
