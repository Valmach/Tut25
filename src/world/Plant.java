package world;

/**
 * Created by valmach on 16/01/2017.
 */
// Bad practice

public class Plant {
   public String name;

//Acceptable practice  -- its Final.
   public final static int ID = 8;

   private String type;

   protected String size;

   int height;

   public Plant(){
   this.name = "Freddy";
   this.type= "plant";
   this.type= "medium";
   }
}
