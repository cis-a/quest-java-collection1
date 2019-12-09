import java.util.*;
import java.util.ArrayList;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        /*Hero blackW = new Hero ("Black Widow", 34);
        Hero captainA = new Hero ("Captain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero ironM = new Hero ("Iron Man", 48);
        Hero scarletW = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero ("Hulk",49);
        Hero doctorS = new Hero ("Doctor Strange", 42);*/

        heroes.add(new Hero ("Black Widow", 34));
        heroes.add(new Hero ("Captain America", 100));
        heroes.add(new Hero ("Vision", 3));
        heroes.add(new Hero ("Iron Man", 48));
        heroes.add(new Hero ("Scarlet Witch", 29));
        heroes.add(new Hero ("Thor", 1500));
        heroes.add(new Hero ("Hulk",49));
        heroes.add(new Hero ("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        //System.out.println (heroes);


        // TODO 5 : Keep only half of the list
          /*for (int i = 0; i<heroes.size()/2; ++i) {
          heroes.remove(i);
          }*/
        //heroes.removeAll (heroes.subList(0, heroes.size()/2));
        heroes.subList(0, heroes.size()/2).clear();

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println ("Remaining on the list are:");
        for (Hero hero : heroes) {
          System.out.println (hero.getName());
        }
    }

}
