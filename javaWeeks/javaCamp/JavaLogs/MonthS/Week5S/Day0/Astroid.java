package Day0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Astroid{
    public static ArrayList<Integer> arrayOfAsteroids(ArrayList<Integer> asteroids){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(1,2); i++){
            asteroids.add(rand.nextInt(-50,100));
        }
        return asteroids;
    }
    public static void asteroidTrajectory(ArrayList<Integer> asteroids){
        asteroids = arrayOfAsteroids(asteroids);
        Collections.sort(arrayOfAsteroids(asteroids));
        boolean negTraj = false;
        int resultingForce = 0;
        System.out.println("Array of Asteroids: " + asteroids);
        for(int asteroid : asteroids){
            negTraj = asteroid > 0? false:true;
            if(negTraj){
                resultingForce = (asteroids.get(asteroids.size() - 1)) + (asteroid);
                if(resultingForce > 0){
                    asteroids.remove(asteroids.get(0));
                }else if(resultingForce < 0 && asteroids.get(asteroids.size() - 1) > 0){
                    asteroids.remove(asteroids.get(asteroids.size() - 1));
                }
                resultingForce = 0;
            }
        }
        System.out.println("Heavenly Body Collision: " + asteroids);

    }
    public static void main(String[] args) {
        ArrayList<Integer> asteroids = new ArrayList<>();
        asteroidTrajectory(asteroids);
    }
}