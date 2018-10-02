import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    
    /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        // image1을 crab.png로 설정
        // image2를 crab2.png로 설정
        // 초기 wormEaten은 0
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");

        wormsEaten = 0;
    }
    
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // 사용자에게 키를 입력받아 움직임
        checkKeypress();

        // Worm과 마주침
        lookForWorm();
        // 움직이는 효과
        switchImage();
        
        // 모서리에서 회전
        if(isAtEdge())
            turn(10);
            
        // 무작위로 움직임
        if( Greenfoot.getRandomNumber(100) < 10) 
            turn(Greenfoot.getRandomNumber(90) - 45);
        
        // 한번에 5씩 움직임
        move(5);
    }
    
    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        // 이미지를 번갈아가며 바꿈
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
    
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        // <- 방향키를 입력받으면 -4 만큼 회전
        if(Greenfoot.isKeyDown("left")){
        turn(-4);}
        if(Greenfoot.isKeyDown("right")){
        turn(4);}
        // -> 방향키를 입력받으면 4 만큼 회전
    }
    
    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        // Worm에 닿은 경우
        if(isTouching(Worm.class)){
        removeTouching(Worm.class);
        Greenfoot.playSound("slurp.wav");
        wormsEaten++;
        if(wormsEaten==8){
        Greenfoot.playSound("fanfare.wav");
        getWorld().showText("Congratulation!", 200,300);
        Greenfoot.stop();

    }

        // Worm을 제거
        // slurp.wav 음악 재생
        // wormsEaten 증가
        // 먹은 Worm의 수가 8인 경우
        // fanfare.wav 음악 재생
        // Congratulation! 문구 표시
        // Greenfoot.stop();
    }

}
}
