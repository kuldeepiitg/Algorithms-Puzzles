package com.tarkshala;

import org.apache.commons.lang3.RandomStringUtils;

public class LoadBalancer {

    private int redundancy;

    private int ringSize;

    private Server[] ring;

    private String[] salts;

    private int saltSize;

    public LoadBalancer() {
        redundancy = 4;
        ringSize = 1024;
        ring = new Server[ringSize];
        salts = new String[redundancy];
        saltSize = 8;

        for (int i = 0; i < redundancy; i++) {
            salts[i] = RandomStringUtils.randomAlphanumeric(saltSize);
        }
    }

    public void addNode(Server server) {
        for (int i = 0; i < redundancy; i++) {
            int index = (MD5.digest(server.getUid(), salts[i]))%ringSize;
            ring[index] = server;
        }
    }

    public void removeNode(String serverId) {
        for (int i = 0; i < redundancy; i++) {
            int index = (MD5.digest(serverId, salts[i]))%ringSize;
            ring[index] = null;
        }
    }

    public void delegate(Request request) {
        int startingIndex = (MD5.digest(request.getRequestId()))%ringSize;
        int lastIndex = startingIndex == 0 ? ringSize - 1 : startingIndex - 1;
        int index = startingIndex;
        while (ring[index] == null) {
            if (index == lastIndex) {
                throw new RuntimeException("No server present to serve the request");
            }
            index = (index+1)%ringSize;
        }
        ring[index].serve(request);
    }

}
