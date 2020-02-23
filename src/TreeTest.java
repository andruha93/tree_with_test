import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    public void testTierLength() {
        assertEquals(2*Tree.TREEHEIGHT+1, Tree.calcTreeTier(2).length);
    }

    @Test
    public void testTierHasAsterisk() {
        assertNotEquals(-1, Arrays.asList(Tree.calcTreeTier(2)).indexOf("*"));
    }

    @Test
    public void testTierHasAsteriskOnCenter() {
        int t = 2;
        assertEquals("*", Tree.calcTreeTier(2)[(2*Tree.TREEHEIGHT+1)/2]);
    }

    @Test
    public void testTierCountAsterist() {
        int lineNumber = 2;
        int count = 0;
        for(int i=0; i<2*Tree.TREEHEIGHT+1; i++) {
            if(Tree.calcTreeTier(lineNumber)[i] == "*") {
                count++;
            }
        }
        assertEquals((2*lineNumber)+1, count);
    }

}