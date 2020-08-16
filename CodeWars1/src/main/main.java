package main;

public class main {
    public static void main(String[] args) {
        System.out.println(solve("coDe"));
    }
    public static String solve(final String str) {
        int i=0;
        String nueva="";
        int upp=0 ,low=0;
        while( i<str.length()){

        if (Character.isLowerCase(str.charAt(i))) {
            low++;
        }else {
            upp++;
        }
i++;
        }

        System.out.println(upp);
        if(upp>low){
         nueva =str.toUpperCase();
        }else if(low>upp){
          nueva=str.toLowerCase();
        }else if (upp==low){
         nueva=s    tr.toLowerCase();
        }

return nueva;
    }
}
