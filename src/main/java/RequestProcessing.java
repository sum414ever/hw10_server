public class RequestProcessing extends Thread {

    private Request request;

    public RequestProcessing(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("In this server arrived request " + request.getHttpMethods() + " with name <" + request.getMethodString() + ">");
        System.out.println("Request <" + request.getMethodString() + "> with method " + request.getHttpMethods() + " was processed");
    }
}

