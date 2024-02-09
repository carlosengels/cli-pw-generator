import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String allLetters = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?";
        String allAvailableChars = allLetters + digits + specialChars;
        String charPool = allAvailableChars;
        int defaultPasswordLength = 15;
        StringBuilder randomPassword = new StringBuilder();

        //TODO add options to use flags to set password length and limit to user no symbols and/or no digits
        // switch cases for different args
        // -l## (defined length)
        // -c  (no specials char)
        // -d (no digits)

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-c":
                    charPool = allLetters + digits;
                    break;
                case "-d":
                    charPool = allLetters + specialChars;
                    break;
                default:
                    charPool = allAvailableChars;
            }
        }

        //test
        if (args.length != 0) {
            System.out.println(args.length);
        }


        System.out.println("Starting random pw generator");

        while (randomPassword.length() < defaultPasswordLength) {
            Random random = new Random();
            randomPassword.append(charPool.charAt(random.nextInt(charPool.length())));
        }

        System.out.println(randomPassword);
    }
}