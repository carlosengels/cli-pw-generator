import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //test
        if (args.length != 0) {
            System.out.println(args.length);
        }



        String allAvailableChars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789!@#$%^&*()_-+=<>?";
        int passwordLength = 15;
        StringBuilder randomPassword = new StringBuilder();

        System.out.println("Starting random pw generator");

        while (randomPassword.length() < passwordLength) {
            Random random = new Random();
            randomPassword.append(allAvailableChars.charAt(random.nextInt(allAvailableChars.length())));
        }

        System.out.println(randomPassword);
    }
}