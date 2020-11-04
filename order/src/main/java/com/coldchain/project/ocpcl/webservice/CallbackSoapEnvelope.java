package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Envelope", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
public class CallbackSoapEnvelope {

    @XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private CallbackSoapBody body;

    public CallbackSoapBody getBody() {
        return body;
    }

    public void setBody(CallbackSoapBody body) {
        this.body = body;
    }
}
