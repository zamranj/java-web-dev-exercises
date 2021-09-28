package practice_runs;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String,Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);
        moons.put("Pluto(Im still here)", 3);

        System.out.println("Values are: "+ moons.values());
        System.out.println("Keys are: "+ moons.keySet());
        System.out.println("what will be returned: "+moons.get("Saturn"));

    }
}
