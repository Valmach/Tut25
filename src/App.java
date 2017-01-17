import world.Plant;

/**
 * Created by valmach on 16/01/2017.
 */
public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println("plant.name");

        System.out.println("plant.ID");

        //size is protected; App is not in the same package as Plant.
        //System.out.println(plant.size);


        // Wont' work -- type is private
        //System.out.println("plant.type");

        //Won't work; App and Plant is different,
        // height has package-level visibility.
        //System.out.println(plant.height);
    }
}
