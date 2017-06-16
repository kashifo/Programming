/**
 *
 * @author Kashif
 */
public class ExcelCharacter {

    public static void main(String[] args) {

        char[] arr = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int in = 145, l = 26, i = 2;

        if (in <= 26) {
            System.out.println(arr[in]);
        } else {

            while (in >= l * i) {
                i += 1;
            }

            int in2 = in - (l * (i - 1));

            System.out.println(arr[i - 1] + "" + arr[in2]);

        }
        
        
    }
}
