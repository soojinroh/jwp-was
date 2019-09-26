package utils;

import controller.ControllerMapper;
import model.http.HttpRequest;
import model.http.HttpResponse;

public class RequestDispatcher {
    public static HttpResponse handle(HttpRequest httpRequest, HttpResponse httpResponse) {
        ControllerMapper.mapAndHandle(httpRequest, httpResponse);
        httpResponse = checkResponse(httpResponse);
        return httpResponse;
    }

    private static HttpResponse checkResponse(HttpResponse httpResponse) {
        if (httpResponse.isNotInitialized()) {
            httpResponse = HttpResponse.createErrorResponse();
        }
        return httpResponse;
    }
}
