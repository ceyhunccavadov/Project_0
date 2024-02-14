import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\jj031912\\Desktop\\input.txt";
        ArrayList<Integer> inputs = readIntInputs(path);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            for (int i = 0;i<inputs.size();i++){

                    if (inputs.get(i) % 2 == 0) {
                        writer.append(inputs.get(i)+"  is not prime"+"\n");
                    }else {
                        writer.append(inputs.get(i) + "  is prime" + "\n");
                    }


            }
            writer.close();

            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

        public static ArrayList<Integer> readIntInputs(String path){
        File file = new File(path);
        ArrayList<Integer> inputs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int numberOfLines = Integer.parseInt(br.readLine());
            for (int i = 0;i<numberOfLines;i++){
                inputs.add(Integer.parseInt(br.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }


}