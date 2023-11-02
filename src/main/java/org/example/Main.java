package org.example;

import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        ImportIP importIP = new ImportIP();
        try {
            importIP.GetIP("37.20.253.35");
        } catch (UnknownHostException e) {
            System.out.println("Valid IP Required");
            throw new RuntimeException(e);
        }

    }
}