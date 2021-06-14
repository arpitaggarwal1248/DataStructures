/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.TvButtons
 */
package string;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class TvButtons {
    public static void main(String[] args) {
        String a = "arpit";
        char[][] tv = new char[][]{{'a', 'b', 'c', 'd', 'e'}, {'f', 'g', 'h', 'i', 'j'}, {'k', 'l', 'm', 'n', 'o'}, {'p', 'q', 'r', 's', 't'}, {'u', 'v', 'w', 'x', 'y'}, {'z'}};
        TvButtons.pressDown((String)a);
    }

    private static void pressDown(String a) {
        int currx = 0;
        int curry = 0;
        for (char u : a.toCharArray()) {
            System.out.println(u);
            int nextx = (u - 97) / 5;
            int nexty = (u - 97) % 5;
            while (currx < nextx) {
                System.out.println("Move Down");
                ++currx;
            }
            while (curry < nexty) {
                System.out.println("Move Right");
                ++curry;
            }
            while (currx > nextx) {
                System.out.println("Move Up");
                --currx;
            }
            while (curry > nexty) {
                System.out.println("Move Left");
                --curry;
            }
            System.out.println("Press OK");
        }
    }
}

