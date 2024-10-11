import java.lang.*;
class STR {
    public static String insertString(
        String originalString,
        String stringToBeInserted,
        int index)
    {
        String newString = new String();
        for (int i = 0; i < originalString.length(); i++) {
            newString += originalString.charAt(i);
            if (i == index) {
                newString += stringToBeInserted;
            }
        }
        
        // If index is at the end of the original string
        if (index == originalString.length()) {
            newString += stringToBeInserted;
        }

        return newString;
    }

    public static void main(String[] args) {
        String original = "Rohit India";
        String toBeInserted = "For";
        int index = 5;

        System.out.println("Original String: " + original);
        System.out.println("String to be Inserted: " + toBeInserted);
        System.out.println("String to be inserted at Index: " + index);

        String result = insertString(original, toBeInserted, index);
        System.out.println("Modified String: " + result);
    }
}
