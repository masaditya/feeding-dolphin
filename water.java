// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class water extends World
{

    /**
     * Constructor for objects of class water.
     */
    public water()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dolphin dolphin =  new dolphin();
        addObject(dolphin, 131, 139);
        fish fish =  new fish();
        addObject(fish, 406, 236);
    }
}
