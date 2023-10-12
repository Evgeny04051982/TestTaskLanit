import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik murzik = new Kotik("Murzik", "May", 2, 3);
        Kotik barsik = new Kotik();
        barsik.setName("Barsik");
        barsik.setVoice("Meow");
        barsik.setSatiety(3);
        barsik.setWeight(4);

        String[] catsLife = barsik.liveAnotherDay();
        for (String s : catsLife) {
            System.out.println(s);
        }

        System.out.println("Cats name " + murzik.getName());
        System.out.println("Cats weight " + murzik.getWeight());
        System.out.println(compareVoice(barsik, murzik));

        System.out.println(Kotik.count);

    }
    public static boolean compareVoice(Kotik cat1, Kotik cat2) {
        return cat1.getVoice().equals(cat2.getVoice());
    }
}
