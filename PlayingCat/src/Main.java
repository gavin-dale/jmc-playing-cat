public class Main {
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer) {
           return (temperature >= 25 && temperature <= 45);
        } else {
            return (temperature >= 25 && temperature <= 35);
        }
    }
}
