package com.tarkshala;

public class MajorityFinder {

    private int[] votes;

    public MajorityFinder(int[] votes) {
        this.votes = votes;
    }

    public int findMajor() {

        int major = -1;
        int count = 0;
        for (int vote : votes) {

            if (count == 0) {
                major = vote;
                count = 1;
            } else if (major == vote) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int vote: votes) {
            if (vote == major) {
                count++;
            }
        }

        if (count%2 == 1 && count > votes.length/2) {
            return major;
        } else if (count > votes.length/2) {
            return major;
        }

        return -1;
    }
}
