public class NumberReverse {
    // "1 2 3" > "3 2 1"
    // "10 20 30" > "03 02 01"

    public static String numberReverse(String str){
        String reversed = "";
        char[] chars = str.toCharArray();
        for(int i = str.length() ; i > 0; i--){
            reversed += chars[i-1];
        }
        return  reversed;
    }

    public static void main(String[] args) {
        System.out.println(numberReverse("103 310 4 5"));
    }


}
