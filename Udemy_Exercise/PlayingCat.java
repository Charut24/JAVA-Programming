package Udemy_Exercise;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer? 46: 36;
        return temperature > 24 && temperature < upperLimit;
    }
}

class Main_9 {

    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}