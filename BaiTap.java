import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi dau vao : ");
        String inputString = sc.nextLine();
        ArrayList<CharacterCount> charCountList = new ArrayList<>();

        for (char character : inputString.toCharArray()) {
            boolean charExists = false;
            for (CharacterCount cc : charCountList) {
                if (cc.character == character) {
                    cc.count++;
                    charExists = true;
                    break;
                }
            }

            if (!charExists) {
                charCountList.add(new CharacterCount(character, 1));
            }
        }
        
        System.out.println("So lan xuat hien :");
        for (CharacterCount cc : charCountList) {
            System.out.println("'" + cc.character + "' : " + cc.count + " lần");
        }

        sc.close();
    }

    static class CharacterCount {
        char character;
        int count;

        public CharacterCount(char character, int count) {
            this.character = character;
            this.count = count;
        }
    }

}
