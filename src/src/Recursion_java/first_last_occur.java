public class first_last_occur {
    public static int first = -1;
    public static int last = -1;

    public static void find(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char occurrence = str.charAt(idx);
        if (occurrence == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        find(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        find(str, 0, 'a');
    }
}


