package com.tarkshala;

public class IndexComputer {

    private int[] gas;

    private int[] costs;

    public IndexComputer(int[] gas, int[] costs) {
        this.gas = gas;
        this.costs = costs;
    }

    public int getMinimumIndex() {
        int index = 0;
        int gasTank = gas[index];
        while(index < gas.length) {
            int i = index;
            while (gasTank >= costs[i]) {
                gasTank -= costs[i];
                i = (i+1)%gas.length;
                gasTank += gas[i];

                if (i == index) return index;
            }
            index = i+1;
        }

        return -1;
    }
}
