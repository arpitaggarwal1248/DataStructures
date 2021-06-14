/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.JumpsToCrossWall
 */
package ProblemStatements;

import java.io.PrintStream;

public class JumpsToCrossWall {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 10, 9, 15, 8, 6, 5, 3};
        int x = 5;
        int y = 4;
        int[] arrn = arr;
        int n = arrn.length;
        for (int i = 0; i < n; ++i) {
            int u;
            int height = u = arrn[i];
            int jump = 0;
            if (u <= x) {
                ++jump;
            } else {
                ++jump;
                if ((u -= x) <= x - y) {
                    ++jump;
                } else {
                    int rem = u % (x - y);
                    jump += u / (x - y);
                    if (rem > 0) {
                        ++jump;
                    }
                }
            }
            System.out.println("Total jumps to cross wall of height :" + height + " is :" + jump);
        }
    }
}

