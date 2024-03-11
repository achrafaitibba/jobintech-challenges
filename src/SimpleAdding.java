import java.util.stream.IntStream;

public class SimpleAdding {

    public static int simpleAdding(int num){
        int sum = 0;
        for(int i=1; i<= num; i++) sum += i;
        return sum;
    }
    public static int simpleAdding1(Integer num){
        int sum = IntStream.iterate(0, i -> i+1 ).limit(num + 1).sum();
        return sum;
    }
    public static void main(String[] args) {
        int test = 12;
        int test1 = 140;
        System.out.println(simpleAdding1(140));
    }
}
