package world;

/**
 * Created by valmach on 16/01/2017.
 */
public class Oak extends Plant {
    public Oak() { //Constructor
        //wont work -- type is
        //typ = "tree";

        //This works -- size is protected, world.Oak is a sublcass of plant
        this.size = "large";

        //no access specifier; works because Oak & Plant in the same package
        this.height =10;

    }
}
