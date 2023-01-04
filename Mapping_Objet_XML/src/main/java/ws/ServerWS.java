package ws;

import jakarta.xml.ws.Endpoint;

public class ServerWS {

    public static void main(String[] args) {
        String url="http://localhost:8084/";
        Endpoint.publish(url,new ReleveService());
        System.out.println(url);
    }
}
