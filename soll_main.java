package semester5_data_structure;

public class soll_main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates("abbaca"));  // ca
        System.out.println(sol.removeDuplicates("azxxzy"));  // ay
        System.out.println(sol.removeDuplicates("abcd"));    // abcd
        System.out.println(sol.removeDuplicates("aabbcc"));  // (empty line)
    }
}
