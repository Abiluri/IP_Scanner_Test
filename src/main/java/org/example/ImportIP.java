package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class ImportIP {
    public void GetIP(String ip) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(ip);
        System.out.println(address);
    }
}

