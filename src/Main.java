import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"abc", "cab", "cbc", "abc", "acb", "bbc", "ccab", "acb", "abc", "fas", "fss"};
        System.out.println(Arrays.toString(stringArray));
        String stringWithoutDuplicates = "";

        for (int i = 0; i < stringArray.length; i++) {
            String current = stringArray[i];
            for (int j = i + 1; j < stringArray.length; j++) {
                if (current == null){
                    break;
                }
                if (current.equals(stringArray[j])){
                    stringArray[j] = "null";
                }
            }
        }

        for (String string : stringArray) {
            stringWithoutDuplicates += string + " ";
        }

        stringWithoutDuplicates  = stringWithoutDuplicates.replace(" null", "");
        System.out.println(stringWithoutDuplicates);
    }
}