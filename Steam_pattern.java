/* Array and String
6. Write an interactive program to print a string entered in a pyramid form.
For instance, the string "stream" has to be displayed as follows:
        s
        st
        str
        stre
        strea
        stream
*/
public class Steam_pattern {
    public static void main(String[] args) {
        String s1="stream";
        int x=s1.length();
        for(int i=0;i<=x;i++) {
            System.out.println(s1.substring(0, i));
        }
    }
}
