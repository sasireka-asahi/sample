import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        BufferedReader breader = new BufferedReader(new FileReader("config.txt"));
//        HashMap<String, String> lines = new HashMap<>();
//        String line;
//        while ((line = breader.readLine()) != null) {
//            String[] tokens = line.split(":");
//            if (tokens.length == 2)
//                lines.put(tokens[0], tokens[1]);
//        }
//        breader.close();
//        String deviceName = lines.get("device_name");
//        String email = lines.get("email");
//        String password = lines.get("password");
//        String title = lines.get("post_title");
//        String price = lines.get("post_price");
//        String zip = lines.get("post_zip");
//        String category = lines.get("post_category");
//        String filename = lines.get("filename");
        String deviceName = args[0];
        String email = args[1];
        String password = args[2];
        String title = args[3];
        String price = args[4];
        String zip = args[5];
        String category = args[6];
        String filename = args[7];


        POM model = new POM(deviceName);
        model.pushFile(filename);
        model.login(email, password);
        model.post(title, price, zip, category);
    }
}