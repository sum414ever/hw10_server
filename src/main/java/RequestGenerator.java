public class RequestGenerator {

    private Server server = new Server();
    private static final int NUMB_OF_METHODS = 10;

    public void generateRequest() {

        for (int i = 0; i < NUMB_OF_METHODS; i++) {
            server.processRequest(new Request(HttpMethods.GET, "Request number " + i));
            server.processRequest(new Request(HttpMethods.POST, "Request number " + i));
            server.processRequest(new Request(HttpMethods.PUT, "Request number " + i));
            server.processRequest(new Request(HttpMethods.DELETE, "Request number " + i));
        }
    }
}