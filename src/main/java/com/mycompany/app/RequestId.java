package com.mycompany.app;

import com.thoughtworks.impersonator.http.message.RawRequest;
import com.thoughtworks.impersonator.http.message.RequestIdentifier;

/**
 * Created by IntelliJ IDEA.
 * User: Brett
 * Date: 18/08/11
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class RequestId implements RequestIdentifier {
    public String calculateUid(RawRequest rawRequest) {
        return "SS";
    }
}
