package custom.utils;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

/**
 * Created by jayeshathila
 * on 20/05/17.
 */
public class ConnectorException extends RuntimeException {
    private Response response;
    private Invocation.Builder request;
    private int code;
    private String body;

    public ConnectorException(Response response, Invocation.Builder request, int code, String body, String message) {
        super(message);
        this.response = response;
        this.request = request;
        this.code = code;
        this.body = body;
    }


    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Invocation.Builder getRequest() {
        return request;
    }

    public void setRequest(Invocation.Builder request) {
        this.request = request;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ConnectorException{" +
                "response=" + response +
                ", request=" + request +
                ", code=" + code +
                ", body='" + body + '\'' +
                "} " + super.toString();
    }
}

