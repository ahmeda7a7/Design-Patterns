import java.util.*;

public abstract class BaseLevel implements Cloneable {
    String levelName;
    int numberOfNPCs;
    int numberOfTokens;

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getLevelName()
    {
        return levelName;
    }

    public void setNumberOfNPCs(int numberOfNPCs)
    {
        this.numberOfNPCs = numberOfNPCs;
    }

    public int getNumberOfNPCs() {
        return numberOfNPCs;
    }

    public void setNumberOfTokens(int numberOfTokens) {
        this.numberOfTokens = numberOfTokens;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }

    // level clone method...
    public BaseLevel clone() throws CloneNotSupportedException
    {
        return (BaseLevel) super.clone();
    }

}
