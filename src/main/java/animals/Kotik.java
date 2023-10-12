package animals;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
@Getter
@Setter
public class Kotik {
    public static final int METHODS = 5;
    public static int count;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    private boolean play() {
        if(satiety > 0) {
            System.out.println("Cat played");
            satiety--;
            return true;
        } else {
            System.out.println("Cat wants to eat");
            return false;
        }
    }

    private boolean sleep() {
        if(satiety > 0) {
            System.out.println("Cat slept");
            satiety--;
            return true;
        } else {
            System.out.println("Cat wants to eat");
            return false;
        }
    }

    private boolean wash() {
        if(satiety > 0) {
            System.out.println("Cat washed");
            satiety--;
            return true;
        } else {
            System.out.println("Cat wants to be eat");
            return false;
        }
    }

    private boolean walk() {
        if(satiety > 0) {
            System.out.println("Cat walked");
            satiety--;
            return true;
        } else {
            System.out.println("Cat wants to eat");
            return false;
        }
    }

    private boolean hunt() {
        if(satiety > 0) {
            System.out.println("Cat hunted");
            satiety--;
            return true;
        } else {
            System.out.println("Cat wants to eat");
            return false;
        }
    }

    private void eat(int satiety) {
        this.satiety += satiety;
    }

    private void eat(int satiety, String foodName) {

    }

    private void eat() {
        eat(satiety, "Fish");
        satiety++;
    }

    public String[] liveAnotherDay() {
        String[] catActivities = new String[24];
        for (int i = 0; i < 24; i++) {
            Random random = new Random();
            boolean fed;
            String activity = "";
            int number = random.nextInt(METHODS);
            switch (number) {
                case 0: {
                    fed = play();
                    if (fed) {
                        activity = "Play";
                    }
                    break;
                }
                case 1: {
                    fed = sleep();
                    if (fed) {
                        activity = "Sleep";
                    }
                    break;
                }
                case 2: {
                    fed = wash();
                    if (fed) {
                        activity = "Wash";
                    }
                    break;
                }
                case 3: {
                    fed = walk();
                    if (fed) {
                        activity = "Walk";
                    }
                    break;
                }
                default: {
                    fed = hunt();
                    if (fed) {
                        activity = "Hunt";
                    }
                }
            }

            if (!fed) {
                eat();
                activity = "Eat";
            }

            String value = i + " - " + activity;
            catActivities[i] = value;
        }
        return catActivities;
    }


}
