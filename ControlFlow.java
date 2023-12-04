
import java.util.ArrayList;

public class ControlFlow {
    public static void main(String[] args) {
        String string = "Hello every one";
        char stringE = 'e';
        int count = 0;
        ArrayList<Integer> arrayIndex = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == stringE) {
                count++;
                arrayIndex.add(i);
            }
        }

        System.out.printf("Có %d lần 'e' xuất hiện ở vị trí : %s%n", count, arrayIndex);
    }
}