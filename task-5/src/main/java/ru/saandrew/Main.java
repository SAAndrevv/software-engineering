package ru.saandrew;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        RuTubeVideoLoaderProxy proxy = new RuTubeVideoLoaderProxy();

        proxy.load("Cars 2");
        Thread.sleep(3000);
        proxy.load("Cars 2");
    }
}
