import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temperature;

        System.out.print("Hi there! Enter the temperature and I -the big organizer- will suggest you an event: ");
        temperature = input.nextInt();

        if (temperature >= -20 && temperature < 5) {
            System.out.println("There is nothing else but a silly ski (>ᴗ•)");

        } else if (temperature >= 5 && temperature < 15) {
            System.out.println("Just Netflix and chill bro ┐( ˘_˘ )┌");
            
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("Let's go picnic oh～ with a boyfriend (っ˘ω˘ς )");
            
        }else if (temperature >= 25 && temperature <50){
            System.out.println("Let's swim with our imaginary anime girls! You know what I mean, hehe (ง ื▿ ื)ว");

        }else {
            System.out.println("What the hell?!! Are we living at the same planet ＼(º □ º l|l)/");
        }
    }
}
