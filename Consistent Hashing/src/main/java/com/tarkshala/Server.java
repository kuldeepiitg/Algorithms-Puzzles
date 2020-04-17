package com.tarkshala;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Server {

    private String uid;

    public void serve(Request request) {
        System.out.println("Server " + uid + " serving the request " + request.getRequestId());
    }
}
