
package com.insure.client.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ClaimException", targetNamespace = "http://server.insure.com/")
public class ClaimException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ClaimException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ClaimException_Exception(String message, ClaimException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ClaimException_Exception(String message, ClaimException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.insure.client.gen.ClaimException
     */
    public ClaimException getFaultInfo() {
        return faultInfo;
    }

}
