package app.service;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.splunk.*;

public class SplunkService {
    public static void main(String[] args) {
        Service service = new Service("localhost", 8089);
        String credentials = "admin:changeme";
        String basicAuthHeader = Base64.encode(credentials.getBytes());
        service.setToken("Basic " + basicAuthHeader);
        // Print the session token
        System.out.println("Your session token: " + service.getToken());
        // Print installed apps to the console to verify login
        for (Application app : service.getApplications().values()) {
            System.out.println(app.getName());
        }
    }
}
