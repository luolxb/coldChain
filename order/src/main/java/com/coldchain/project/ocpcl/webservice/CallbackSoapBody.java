package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body", namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
public class CallbackSoapBody {

    @XmlElement(name = "operationCallback", namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioningCallbacks-v1.0")
    private OperationCallback operationCallback;

    public OperationCallback getOperationCallback() {
        return operationCallback;
    }

    public void setOperationCallback(OperationCallback operationCallback) {
        this.operationCallback = operationCallback;
    }
}
