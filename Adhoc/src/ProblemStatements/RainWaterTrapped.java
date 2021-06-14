/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.RainWaterTrapped
 */
package ProblemStatements;

import java.io.PrintStream;

public class RainWaterTrapped {
    static int[] tower = new int[]{1, 5, 2, 3, 1, 7, 2};

    private int[] calMaxRightTower(int[] tower) {
        int currMax = 0;
        int[] maxTower = new int[tower.length];
        for (int i = maxTower.length - 1; i >= 0; --i) {
            if (tower[i] > currMax) {
                maxTower[i] = tower[i];
                currMax = tower[i];
                continue;
            }
            maxTower[i] = currMax;
        }
        return maxTower;
    }

    public static void main(String[] args) {
        int[] maxRight;
        RainWaterTrapped rp = new RainWaterTrapped();
        int stagnantWater = 0;
        for (int u : maxRight = rp.calMaxRightTower(tower)) {
            System.out.println(u);
        }
        int maxLeft = 0;
        for (int j = 0; j < tower.length; ++j) {
            stagnantWater += Math.max(Math.min(maxLeft, maxRight[j]) - tower[j], 0);
            if (tower[j] <= maxLeft) continue;
            maxLeft = tower[j];
        }
        System.out.println("Maximum stored water: " + stagnantWater);
    }
}

