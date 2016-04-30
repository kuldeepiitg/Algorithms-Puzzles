package com.kuldeep;

/**
 * Trap water between buildings.
 * <p>
 * Created by kuldeep on 30/04/16.
 */
public class Trap {

    /**
     * Calculate water trapped between all the walls.
     *
     * @param wallHeights heights of all the wall/buildings
     * @return amount of water trapped
     */
    public static int calculateWater(int[] wallHeights) {

        int volume = 0;

        int[] maxHeightInRight = new int[wallHeights.length];
        int maxRightHeightValue = 0;
        for (int i = wallHeights.length - 1; i >= 0; i--) {
            maxHeightInRight[i] = maxRightHeightValue;
            maxRightHeightValue = Math.max(maxRightHeightValue, wallHeights[i]);
        }

        int maxLeftOrPlaceHeight = 0;
        for (int i = 0; i < wallHeights.length; i++) {
            maxLeftOrPlaceHeight = maxLeftOrPlaceHeight > wallHeights[i] ? maxLeftOrPlaceHeight : wallHeights[i];
            volume += Math.min(maxLeftOrPlaceHeight, maxHeightInRight[i]);
        }
        return volume;
    }
}
