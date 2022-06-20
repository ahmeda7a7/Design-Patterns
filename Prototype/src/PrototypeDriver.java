import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.BitSet;

public class PrototypeDriver {
    public static void main(String[] args) throws CloneNotSupportedException{

        System.out.println("\n\nGame Level Creation");

        // create Dungeon Game level
        BaseLevel dungeon = new Dungeon("Slasher\'s Dungeon Level 1");
        //Slasher's  , Slasher\'s is the same 
        dungeon.numberOfNPCs = 500;
        dungeon.numberOfTokens = 80;

        // Create Forest Game level
        BaseLevel forest = new Forest("Acid Rain Forest Level");
        forest.numberOfNPCs = 250;
        forest.numberOfTokens = 120;

        // Create City Game Level
        BaseLevel city = new City("Industrial City Level");
        forest.numberOfTokens = 320;
        forest.numberOfTokens = 450;

        //clone the already created dungeon object and create another level of dungeon.
        BaseLevel levelClone1;
        levelClone1 = dungeon.clone();
        levelClone1.setLevelName("Slasher\'s Dungeon level 2");
        levelClone1.setNumberOfNPCs(1000);
        levelClone1.setNumberOfTokens(50);


        // PRINT the information's

        System.out.println("Dungeon level information:");
        System.out.println("Level Name : "+dungeon.getLevelName());
        System.out.println("Number of NPCs : "+dungeon.getNumberOfNPCs());
        System.out.println("Number of Tokens : "+dungeon.getNumberOfTokens());

        System.out.println("\n");

        System.out.println("Cloned level information:");
        System.out.println("Level name : "+levelClone1.getLevelName());
        System.out.println("Number of NPCs : "+levelClone1.getNumberOfNPCs());
        System.out.println("Number of Tokens : "+levelClone1.getNumberOfTokens());



    }
}
