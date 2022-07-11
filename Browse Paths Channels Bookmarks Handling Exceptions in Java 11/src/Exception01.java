public class Exception01 {
    public static void main(String[] args) {
        int i =12;
        int j= 2;
        try{
            int result = i / (j-2);
            System.out.println(result);
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
            //debuing helpsu during app developmen
            e.printStackTrace();
        }finally{
            System.out.println("Always");
        }

        System.out.println("HOLII");


    }
}
