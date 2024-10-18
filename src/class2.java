import java.util.Arrays;
import java.util.*;

final class class2 {
    private final String name;
    private final int roll;
    private static int count;
    public class2(String name , int roll) {
        this.name = name;
        this.roll = roll;
        this.count++;
    }

    public String getName(){return  this.name;}

    public int getRoll(){return  this.roll;}

    @Override
    public String toString(){
        return this.name + " ," +this.roll;

    }

    public int printObj(){
        return count;
    }
}



