import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    public static int TREEHEIGHT = 5;
    public static int TRUNKHEIGHT = 2;
    private static int treeTierLength = 2*TREEHEIGHT+1;

    public static void main(String args[]){
        for(int i=0; i<=TREEHEIGHT; i++) {
            showTreeTier(i);
        }
        for(int i=0; i<TRUNKHEIGHT; i++) {
            showTreeTier(0);
        }

        //List<Integer> neightbours = new ArrayList<Integer>();
        //neightbours.add(new int[0, 1]);
    }

    private static void showTreeTier(int i) {
        System. out. println(String.join("", calcTreeTier(i)));
    }

    protected static String[] calcTreeTier(int count) {
        String[] tier = new String[treeTierLength];
        Arrays.fill(tier, " ");

        tier[(treeTierLength)/2] = "*";
        for(int j=0; j<=count; j++) {
            tier[(treeTierLength)/2+j] = "*";
            tier[(treeTierLength)/2-j] = "*";
        }
        return tier;
    }
}
