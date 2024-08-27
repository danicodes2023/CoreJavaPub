import java.util.Arrays;
import java.util.List;

public class HashCodeExample {
    public static void main(String[] args) {
        // Create two unequal String objects
        String a = new String("aa");
        String b = new String("aa");

        // Check if the objects are equal
        if (a.equals(b)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are unequal.");
        }

        // Print the hash codes of both objects
        System.out.println("Hash code for 'a': " + a.hashCode());
        System.out.println("Hash code for 'b': " + b.hashCode());

        // Example with Strings (all the strings below have a hash code of 0):
        List<String> list = Arrays.asList(
            "pollinating sandboxes",
            "amusement & hemophilias",
            "schoolworks = perversive",
            // ... other strings ...
            "Incentively, my dear, I don't tessellate a derangement."
        );


        // Print hash codes for the strings
        for (String s : list) {
            System.out.println("Hash code for '" + s + "': "+ customHash(s.hashCode()));
        }
    }
    // Custom hash function (simple modulo operation)
    static int customHash(int num) {
        return num % 19;
    }
}
