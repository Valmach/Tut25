import world.Plant;

/**
 * Created by valmach on 16/01/2017.
 */
public class Grass extends Plant {
    
    public  Grass(){
        //Won't work ---Grass not in the same package as plant, even though it's a sbuclass
        //System.out.println(this.height);

    }
}
