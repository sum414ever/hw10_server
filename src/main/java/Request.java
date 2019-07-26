public class Request {
    private HttpMethods httpMethods;
    private String methodString;

    public Request(HttpMethods httpMethods, String methodString) {
        this.httpMethods = httpMethods;
        this.methodString = methodString;
    }

    public HttpMethods getHttpMethods() {
        return httpMethods;
    }

    public void setHttpMethods(HttpMethods httpMethods) {
        this.httpMethods = httpMethods;
    }

    public String getMethodString() {
        return methodString;
    }

    public void setMethodString(String methodString) {
        this.methodString = methodString;
    }
}