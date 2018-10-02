import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();

    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Crab 1마리 (231, 203) 좌표에 추가
        Crab crab1 = new Crab();
        addObject(crab1, 231, 203);
        
        Worm[] worm;
        int[] x = new int[10];
        int[] y = new int[10];
        // Worm 10마리 랜덤 좌표에 추가
        worm = new Worm[10];
        for(int i=0;i<10;i++){
             x[i] = Greenfoot.getRandomNumber(561);
             y[i] = Greenfoot.getRandomNumber(561);
             worm[i] = new Worm();
             addObject(worm[i],x[i],y[i]);
             
            }
        
        // Lobster 3마리 추가
        Lobster lob1 = new Lobster(); Lobster lob2 = new Lobster(); Lobster lob3 = new Lobster();
        addObject(lob1, 334, 65); addObject(lob2, 481, 481); addObject(lob3, 79, 270);
        
        // 각 좌표는 (334, 65), (481, 481), (79, 270)
        
        Turtle turtle1 = new Turtle(100);
        int tx = Greenfoot.getRandomNumber(561);
        int ty = Greenfoot.getRandomNumber(561);
        addObject(turtle1, tx, ty);
        
        // 100을 세고 움직이는 Turtle 추가
        // 좌표는 랜덤
    }
}
