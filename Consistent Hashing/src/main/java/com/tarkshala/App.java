package com.tarkshala;

public class App {

    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();
        loadBalancer.addNode(new Server("1"));
        loadBalancer.addNode(new Server("2"));
        loadBalancer.addNode(new Server("3"));
        loadBalancer.addNode(new Server("4"));
        loadBalancer.addNode(new Server("5"));

        loadBalancer.delegate(new Request("1"));
        loadBalancer.delegate(new Request("2"));
        loadBalancer.delegate(new Request("3"));
        loadBalancer.delegate(new Request("4"));
        loadBalancer.delegate(new Request("5"));

        loadBalancer.removeNode("1");
        loadBalancer.removeNode("3");

        loadBalancer.delegate(new Request("1"));
        loadBalancer.delegate(new Request("2"));
        loadBalancer.delegate(new Request("3"));
        loadBalancer.delegate(new Request("4"));
        loadBalancer.delegate(new Request("5"));

    }
}
