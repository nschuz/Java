import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFinally {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;

        try{

            reader = new BufferedReader(new FileReader(args[0]));
            String inputLine = null;

            while((inputLine=reader.readLine())!= null){
                performOperation(inputLine);
            }


        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        } finally{
            System.out.println("Closing file - "+ args[0]);
            reader.close();
        }


    }

    public static void performOperation(String inputLine){
        String [] parts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());

        int leftVal = valueFromWord(parts[1]);
        int rigtVal = valueFromWord(parts[2]);

        int result= execute(operation, leftVal , rigtVal)

    }


    static int exceute(MathOperation operation, int leftVal, int rightVal){
        int result =0;

        switch (operation){

            case ADD:
                result= leftVal  + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = leftVal * rightVal;
                break;

        }
        return result;
    }



}
