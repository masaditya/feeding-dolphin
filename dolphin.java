// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class dolphin extends Actor
{
    public int score;
    private int timer = 6000;
    private int timershow = timer / 1000;
    public int count = 0;

    /**
     * Act - do whatever the dolphin wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (timer > 0) {
            timer = timer - 1;
            if (timer == 0) {
                Greenfoot.stop();
                getWorld().showText("Game over ! ", 300, 180);
                getWorld().showText("Your Score = " + score, 300, 200);
            }
        }
        timershow = timer / 100;
        getWorld().showText("Timer = " + timershow, 50, 50);
        getWorld().showText("Score = " + score, 50, 20);
        if (Greenfoot.isKeyDown("up")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-2);
        }
        if (isTouching(fish.class)) {
            eatfish();
        }
        if (isTouching(lion.class)) {
            eatlion();
        }
    }

    /**
     * 
     */
    public void eatfish()
    {
        count = count + 1;
        if (count % 5 == 0) {
            getWorld().addObject( new  lion(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        else {
            getWorld().addObject( new  fish(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        score = score + 1;
        removeTouching(fish.class);
        
    }

    /**
     * 
     */
    public void eatlion()
    {
        count = count + 1;
        removeTouching(lion.class);
        score = score + 5;
        getWorld().addObject( new  fish(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
}
