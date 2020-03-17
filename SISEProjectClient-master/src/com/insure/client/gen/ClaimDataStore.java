
package com.insure.client.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClaimDataStore", targetNamespace = "http://server.insure.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClaimDataStore {


    /**
     * 
     * @param arg0
     * @throws ClaimException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "isEmpty", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.IsEmpty")
    @ResponseWrapper(localName = "isEmptyResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.IsEmptyResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/isEmptyRequest", output = "http://server.insure.com/ClaimDataStore/isEmptyResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/isEmpty/Fault/ClaimException")
    })
    public void isEmpty(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws ClaimException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws DocumentException_Exception
     * @throws ClaimException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateClaim")
    @ResponseWrapper(localName = "updateClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/updateClaimRequest", output = "http://server.insure.com/ClaimDataStore/updateClaimResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/updateClaim/Fault/ClaimException"),
        @FaultAction(className = DocumentException_Exception.class, value = "http://server.insure.com/ClaimDataStore/updateClaim/Fault/DocumentException")
    })
    public void updateClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws ClaimException_Exception, DocumentException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws ClaimException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "validateClaimId", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateClaimId")
    @ResponseWrapper(localName = "validateClaimIdResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateClaimIdResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/validateClaimIdRequest", output = "http://server.insure.com/ClaimDataStore/validateClaimIdResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/validateClaimId/Fault/ClaimException")
    })
    public void validateClaimId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws ClaimException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws ClaimException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaim")
    @ResponseWrapper(localName = "createClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/createClaimRequest", output = "http://server.insure.com/ClaimDataStore/createClaimResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/createClaim/Fault/ClaimException")
    })
    public int createClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws ClaimException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocument")
    @ResponseWrapper(localName = "addDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/addDocumentRequest", output = "http://server.insure.com/ClaimDataStore/addDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/addDocument/Fault/Exception")
    })
    public int addDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws DocumentException_Exception
     * @throws ClaimException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "validateInsuredId", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateInsuredId")
    @ResponseWrapper(localName = "validateInsuredIdResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateInsuredIdResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/validateInsuredIdRequest", output = "http://server.insure.com/ClaimDataStore/validateInsuredIdResponse", fault = {
        @FaultAction(className = DocumentException_Exception.class, value = "http://server.insure.com/ClaimDataStore/validateInsuredId/Fault/DocumentException"),
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/validateInsuredId/Fault/ClaimException")
    })
    public void validateInsuredId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws ClaimException_Exception, DocumentException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.insure.client.gen.Claim
     * @throws ClaimException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveClaim")
    @ResponseWrapper(localName = "retrieveClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/retrieveClaimRequest", output = "http://server.insure.com/ClaimDataStore/retrieveClaimResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/retrieveClaim/Fault/ClaimException")
    })
    public Claim retrieveClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws ClaimException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws IdUserException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "validateUser", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateUser")
    @ResponseWrapper(localName = "validateUserResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateUserResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/validateUserRequest", output = "http://server.insure.com/ClaimDataStore/validateUserResponse", fault = {
        @FaultAction(className = IdUserException_Exception.class, value = "http://server.insure.com/ClaimDataStore/validateUser/Fault/IdUserException")
    })
    public void validateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws IdUserException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateDocument")
    @ResponseWrapper(localName = "updateDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/updateDocumentRequest", output = "http://server.insure.com/ClaimDataStore/updateDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/updateDocument/Fault/Exception")
    })
    public boolean updateDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.DeleteDocument")
    @ResponseWrapper(localName = "deleteDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.DeleteDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/deleteDocumentRequest", output = "http://server.insure.com/ClaimDataStore/deleteDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/deleteDocument/Fault/Exception")
    })
    public boolean deleteDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws DocumentException_Exception
     * @throws ClaimException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listDocuments", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ListDocuments")
    @ResponseWrapper(localName = "listDocumentsResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ListDocumentsResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/listDocumentsRequest", output = "http://server.insure.com/ClaimDataStore/listDocumentsResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/listDocuments/Fault/ClaimException"),
        @FaultAction(className = DocumentException_Exception.class, value = "http://server.insure.com/ClaimDataStore/listDocuments/Fault/DocumentException")
    })
    public String listDocuments(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws ClaimException_Exception, DocumentException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws ClaimException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "validateDocId", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateDocId")
    @ResponseWrapper(localName = "validateDocIdResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateDocIdResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/validateDocIdRequest", output = "http://server.insure.com/ClaimDataStore/validateDocIdResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/validateDocId/Fault/ClaimException")
    })
    public void validateDocId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws ClaimException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     * @throws DocumentException_Exception
     * @throws ClaimException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ReadDocument")
    @ResponseWrapper(localName = "readDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ReadDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/readDocumentRequest", output = "http://server.insure.com/ClaimDataStore/readDocumentResponse", fault = {
        @FaultAction(className = ClaimException_Exception.class, value = "http://server.insure.com/ClaimDataStore/readDocument/Fault/ClaimException"),
        @FaultAction(className = DocumentException_Exception.class, value = "http://server.insure.com/ClaimDataStore/readDocument/Fault/DocumentException")
    })
    public List<Object> readDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws ClaimException_Exception, DocumentException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws IdUserException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "isInsured", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.IsInsured")
    @ResponseWrapper(localName = "isInsuredResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.IsInsuredResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/isInsuredRequest", output = "http://server.insure.com/ClaimDataStore/isInsuredResponse", fault = {
        @FaultAction(className = IdUserException_Exception.class, value = "http://server.insure.com/ClaimDataStore/isInsured/Fault/IdUserException")
    })
    public void isInsured(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws IdUserException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "validateDocSignature", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateDocSignature")
    @ResponseWrapper(localName = "validateDocSignatureResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ValidateDocSignatureResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/validateDocSignatureRequest", output = "http://server.insure.com/ClaimDataStore/validateDocSignatureResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/validateDocSignature/Fault/Exception")
    })
    public void validateDocSignature(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws Exception_Exception
    ;

}
