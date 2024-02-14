import java.io.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\jj031912\\Desktop\\input.txt";
        ArrayList<String> inputs = readIntInputs(path);
        for (int i = 0;i<inputs.size();i++){
            System.out.println(inputs.get(i));
        }

//        File outputFile = new File( "C:\\Users\\jj031912\\Desktop\\output.txt");
        try {
//            outputFile.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            for (int i = 0;i<inputs.size();i++){
                writer.append(inputs.get(i));
                writer.append("\n");
            }

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static ArrayList<String> readIntInputs(String path){
        File file = new File(path);
        ArrayList<String> inputs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int numberOfLines = Integer.parseInt(br.readLine());
            for (int i = 0;i<numberOfLines;i++){
                inputs.add(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }

    public static void writeIsPrime(ArrayList<String> inputs){
        int numberOfLines = Integer.parseInt(inputs.get(0));

    }
}