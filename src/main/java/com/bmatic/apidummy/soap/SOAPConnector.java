package com.bmatic.apidummy.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @author Dipper
 * @project api-dummy
 * @created 23/02/2021 - 12:31
 */
public class SOAPConnector extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}
