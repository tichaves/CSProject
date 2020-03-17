
package com.insure.client.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.insure.client.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClaimException_QNAME = new QName("http://server.insure.com/", "ClaimException");
    private final static QName _DocumentException_QNAME = new QName("http://server.insure.com/", "DocumentException");
    private final static QName _Exception_QNAME = new QName("http://server.insure.com/", "Exception");
    private final static QName _IdUserException_QNAME = new QName("http://server.insure.com/", "IdUserException");
    private final static QName _AddDocument_QNAME = new QName("http://server.insure.com/", "addDocument");
    private final static QName _AddDocumentResponse_QNAME = new QName("http://server.insure.com/", "addDocumentResponse");
    private final static QName _CreateClaim_QNAME = new QName("http://server.insure.com/", "createClaim");
    private final static QName _CreateClaimResponse_QNAME = new QName("http://server.insure.com/", "createClaimResponse");
    private final static QName _DeleteDocument_QNAME = new QName("http://server.insure.com/", "deleteDocument");
    private final static QName _DeleteDocumentResponse_QNAME = new QName("http://server.insure.com/", "deleteDocumentResponse");
    private final static QName _IsEmpty_QNAME = new QName("http://server.insure.com/", "isEmpty");
    private final static QName _IsEmptyResponse_QNAME = new QName("http://server.insure.com/", "isEmptyResponse");
    private final static QName _IsInsured_QNAME = new QName("http://server.insure.com/", "isInsured");
    private final static QName _IsInsuredResponse_QNAME = new QName("http://server.insure.com/", "isInsuredResponse");
    private final static QName _ListDocuments_QNAME = new QName("http://server.insure.com/", "listDocuments");
    private final static QName _ListDocumentsResponse_QNAME = new QName("http://server.insure.com/", "listDocumentsResponse");
    private final static QName _ReadDocument_QNAME = new QName("http://server.insure.com/", "readDocument");
    private final static QName _ReadDocumentResponse_QNAME = new QName("http://server.insure.com/", "readDocumentResponse");
    private final static QName _RetrieveClaim_QNAME = new QName("http://server.insure.com/", "retrieveClaim");
    private final static QName _RetrieveClaimResponse_QNAME = new QName("http://server.insure.com/", "retrieveClaimResponse");
    private final static QName _UpdateClaim_QNAME = new QName("http://server.insure.com/", "updateClaim");
    private final static QName _UpdateClaimResponse_QNAME = new QName("http://server.insure.com/", "updateClaimResponse");
    private final static QName _UpdateDocument_QNAME = new QName("http://server.insure.com/", "updateDocument");
    private final static QName _UpdateDocumentResponse_QNAME = new QName("http://server.insure.com/", "updateDocumentResponse");
    private final static QName _ValidateClaimId_QNAME = new QName("http://server.insure.com/", "validateClaimId");
    private final static QName _ValidateClaimIdResponse_QNAME = new QName("http://server.insure.com/", "validateClaimIdResponse");
    private final static QName _ValidateDocId_QNAME = new QName("http://server.insure.com/", "validateDocId");
    private final static QName _ValidateDocIdResponse_QNAME = new QName("http://server.insure.com/", "validateDocIdResponse");
    private final static QName _ValidateDocSignature_QNAME = new QName("http://server.insure.com/", "validateDocSignature");
    private final static QName _ValidateDocSignatureResponse_QNAME = new QName("http://server.insure.com/", "validateDocSignatureResponse");
    private final static QName _ValidateInsuredId_QNAME = new QName("http://server.insure.com/", "validateInsuredId");
    private final static QName _ValidateInsuredIdResponse_QNAME = new QName("http://server.insure.com/", "validateInsuredIdResponse");
    private final static QName _ValidateUser_QNAME = new QName("http://server.insure.com/", "validateUser");
    private final static QName _ValidateUserResponse_QNAME = new QName("http://server.insure.com/", "validateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.insure.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClaimException }
     * 
     */
    public ClaimException createClaimException() {
        return new ClaimException();
    }

    /**
     * Create an instance of {@link DocumentException }
     * 
     */
    public DocumentException createDocumentException() {
        return new DocumentException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IdUserException }
     * 
     */
    public IdUserException createIdUserException() {
        return new IdUserException();
    }

    /**
     * Create an instance of {@link AddDocument }
     * 
     */
    public AddDocument createAddDocument() {
        return new AddDocument();
    }

    /**
     * Create an instance of {@link AddDocumentResponse }
     * 
     */
    public AddDocumentResponse createAddDocumentResponse() {
        return new AddDocumentResponse();
    }

    /**
     * Create an instance of {@link CreateClaim }
     * 
     */
    public CreateClaim createCreateClaim() {
        return new CreateClaim();
    }

    /**
     * Create an instance of {@link CreateClaimResponse }
     * 
     */
    public CreateClaimResponse createCreateClaimResponse() {
        return new CreateClaimResponse();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link IsEmpty }
     * 
     */
    public IsEmpty createIsEmpty() {
        return new IsEmpty();
    }

    /**
     * Create an instance of {@link IsEmptyResponse }
     * 
     */
    public IsEmptyResponse createIsEmptyResponse() {
        return new IsEmptyResponse();
    }

    /**
     * Create an instance of {@link IsInsured }
     * 
     */
    public IsInsured createIsInsured() {
        return new IsInsured();
    }

    /**
     * Create an instance of {@link IsInsuredResponse }
     * 
     */
    public IsInsuredResponse createIsInsuredResponse() {
        return new IsInsuredResponse();
    }

    /**
     * Create an instance of {@link ListDocuments }
     * 
     */
    public ListDocuments createListDocuments() {
        return new ListDocuments();
    }

    /**
     * Create an instance of {@link ListDocumentsResponse }
     * 
     */
    public ListDocumentsResponse createListDocumentsResponse() {
        return new ListDocumentsResponse();
    }

    /**
     * Create an instance of {@link ReadDocument }
     * 
     */
    public ReadDocument createReadDocument() {
        return new ReadDocument();
    }

    /**
     * Create an instance of {@link ReadDocumentResponse }
     * 
     */
    public ReadDocumentResponse createReadDocumentResponse() {
        return new ReadDocumentResponse();
    }

    /**
     * Create an instance of {@link RetrieveClaim }
     * 
     */
    public RetrieveClaim createRetrieveClaim() {
        return new RetrieveClaim();
    }

    /**
     * Create an instance of {@link RetrieveClaimResponse }
     * 
     */
    public RetrieveClaimResponse createRetrieveClaimResponse() {
        return new RetrieveClaimResponse();
    }

    /**
     * Create an instance of {@link UpdateClaim }
     * 
     */
    public UpdateClaim createUpdateClaim() {
        return new UpdateClaim();
    }

    /**
     * Create an instance of {@link UpdateClaimResponse }
     * 
     */
    public UpdateClaimResponse createUpdateClaimResponse() {
        return new UpdateClaimResponse();
    }

    /**
     * Create an instance of {@link UpdateDocument }
     * 
     */
    public UpdateDocument createUpdateDocument() {
        return new UpdateDocument();
    }

    /**
     * Create an instance of {@link UpdateDocumentResponse }
     * 
     */
    public UpdateDocumentResponse createUpdateDocumentResponse() {
        return new UpdateDocumentResponse();
    }

    /**
     * Create an instance of {@link ValidateClaimId }
     * 
     */
    public ValidateClaimId createValidateClaimId() {
        return new ValidateClaimId();
    }

    /**
     * Create an instance of {@link ValidateClaimIdResponse }
     * 
     */
    public ValidateClaimIdResponse createValidateClaimIdResponse() {
        return new ValidateClaimIdResponse();
    }

    /**
     * Create an instance of {@link ValidateDocId }
     * 
     */
    public ValidateDocId createValidateDocId() {
        return new ValidateDocId();
    }

    /**
     * Create an instance of {@link ValidateDocIdResponse }
     * 
     */
    public ValidateDocIdResponse createValidateDocIdResponse() {
        return new ValidateDocIdResponse();
    }

    /**
     * Create an instance of {@link ValidateDocSignature }
     * 
     */
    public ValidateDocSignature createValidateDocSignature() {
        return new ValidateDocSignature();
    }

    /**
     * Create an instance of {@link ValidateDocSignatureResponse }
     * 
     */
    public ValidateDocSignatureResponse createValidateDocSignatureResponse() {
        return new ValidateDocSignatureResponse();
    }

    /**
     * Create an instance of {@link ValidateInsuredId }
     * 
     */
    public ValidateInsuredId createValidateInsuredId() {
        return new ValidateInsuredId();
    }

    /**
     * Create an instance of {@link ValidateInsuredIdResponse }
     * 
     */
    public ValidateInsuredIdResponse createValidateInsuredIdResponse() {
        return new ValidateInsuredIdResponse();
    }

    /**
     * Create an instance of {@link ValidateUser }
     * 
     */
    public ValidateUser createValidateUser() {
        return new ValidateUser();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimException }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "ClaimException")
    public JAXBElement<ClaimException> createClaimException(ClaimException value) {
        return new JAXBElement<ClaimException>(_ClaimException_QNAME, ClaimException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentException }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "DocumentException")
    public JAXBElement<DocumentException> createDocumentException(DocumentException value) {
        return new JAXBElement<DocumentException>(_DocumentException_QNAME, DocumentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdUserException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdUserException }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "IdUserException")
    public JAXBElement<IdUserException> createIdUserException(IdUserException value) {
        return new JAXBElement<IdUserException>(_IdUserException_QNAME, IdUserException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "addDocument")
    public JAXBElement<AddDocument> createAddDocument(AddDocument value) {
        return new JAXBElement<AddDocument>(_AddDocument_QNAME, AddDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "addDocumentResponse")
    public JAXBElement<AddDocumentResponse> createAddDocumentResponse(AddDocumentResponse value) {
        return new JAXBElement<AddDocumentResponse>(_AddDocumentResponse_QNAME, AddDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createClaim")
    public JAXBElement<CreateClaim> createCreateClaim(CreateClaim value) {
        return new JAXBElement<CreateClaim>(_CreateClaim_QNAME, CreateClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createClaimResponse")
    public JAXBElement<CreateClaimResponse> createCreateClaimResponse(CreateClaimResponse value) {
        return new JAXBElement<CreateClaimResponse>(_CreateClaimResponse_QNAME, CreateClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocument")
    public JAXBElement<DeleteDocument> createDeleteDocument(DeleteDocument value) {
        return new JAXBElement<DeleteDocument>(_DeleteDocument_QNAME, DeleteDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocumentResponse")
    public JAXBElement<DeleteDocumentResponse> createDeleteDocumentResponse(DeleteDocumentResponse value) {
        return new JAXBElement<DeleteDocumentResponse>(_DeleteDocumentResponse_QNAME, DeleteDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEmpty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsEmpty }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isEmpty")
    public JAXBElement<IsEmpty> createIsEmpty(IsEmpty value) {
        return new JAXBElement<IsEmpty>(_IsEmpty_QNAME, IsEmpty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEmptyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsEmptyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isEmptyResponse")
    public JAXBElement<IsEmptyResponse> createIsEmptyResponse(IsEmptyResponse value) {
        return new JAXBElement<IsEmptyResponse>(_IsEmptyResponse_QNAME, IsEmptyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsInsured }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsInsured }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isInsured")
    public JAXBElement<IsInsured> createIsInsured(IsInsured value) {
        return new JAXBElement<IsInsured>(_IsInsured_QNAME, IsInsured.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsInsuredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsInsuredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isInsuredResponse")
    public JAXBElement<IsInsuredResponse> createIsInsuredResponse(IsInsuredResponse value) {
        return new JAXBElement<IsInsuredResponse>(_IsInsuredResponse_QNAME, IsInsuredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDocuments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDocuments }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "listDocuments")
    public JAXBElement<ListDocuments> createListDocuments(ListDocuments value) {
        return new JAXBElement<ListDocuments>(_ListDocuments_QNAME, ListDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDocumentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDocumentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "listDocumentsResponse")
    public JAXBElement<ListDocumentsResponse> createListDocumentsResponse(ListDocumentsResponse value) {
        return new JAXBElement<ListDocumentsResponse>(_ListDocumentsResponse_QNAME, ListDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "readDocument")
    public JAXBElement<ReadDocument> createReadDocument(ReadDocument value) {
        return new JAXBElement<ReadDocument>(_ReadDocument_QNAME, ReadDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "readDocumentResponse")
    public JAXBElement<ReadDocumentResponse> createReadDocumentResponse(ReadDocumentResponse value) {
        return new JAXBElement<ReadDocumentResponse>(_ReadDocumentResponse_QNAME, ReadDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveClaim")
    public JAXBElement<RetrieveClaim> createRetrieveClaim(RetrieveClaim value) {
        return new JAXBElement<RetrieveClaim>(_RetrieveClaim_QNAME, RetrieveClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveClaimResponse")
    public JAXBElement<RetrieveClaimResponse> createRetrieveClaimResponse(RetrieveClaimResponse value) {
        return new JAXBElement<RetrieveClaimResponse>(_RetrieveClaimResponse_QNAME, RetrieveClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateClaim")
    public JAXBElement<UpdateClaim> createUpdateClaim(UpdateClaim value) {
        return new JAXBElement<UpdateClaim>(_UpdateClaim_QNAME, UpdateClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateClaimResponse")
    public JAXBElement<UpdateClaimResponse> createUpdateClaimResponse(UpdateClaimResponse value) {
        return new JAXBElement<UpdateClaimResponse>(_UpdateClaimResponse_QNAME, UpdateClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocument")
    public JAXBElement<UpdateDocument> createUpdateDocument(UpdateDocument value) {
        return new JAXBElement<UpdateDocument>(_UpdateDocument_QNAME, UpdateDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocumentResponse")
    public JAXBElement<UpdateDocumentResponse> createUpdateDocumentResponse(UpdateDocumentResponse value) {
        return new JAXBElement<UpdateDocumentResponse>(_UpdateDocumentResponse_QNAME, UpdateDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateClaimId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateClaimId }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateClaimId")
    public JAXBElement<ValidateClaimId> createValidateClaimId(ValidateClaimId value) {
        return new JAXBElement<ValidateClaimId>(_ValidateClaimId_QNAME, ValidateClaimId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateClaimIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateClaimIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateClaimIdResponse")
    public JAXBElement<ValidateClaimIdResponse> createValidateClaimIdResponse(ValidateClaimIdResponse value) {
        return new JAXBElement<ValidateClaimIdResponse>(_ValidateClaimIdResponse_QNAME, ValidateClaimIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDocId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDocId }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateDocId")
    public JAXBElement<ValidateDocId> createValidateDocId(ValidateDocId value) {
        return new JAXBElement<ValidateDocId>(_ValidateDocId_QNAME, ValidateDocId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDocIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDocIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateDocIdResponse")
    public JAXBElement<ValidateDocIdResponse> createValidateDocIdResponse(ValidateDocIdResponse value) {
        return new JAXBElement<ValidateDocIdResponse>(_ValidateDocIdResponse_QNAME, ValidateDocIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDocSignature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDocSignature }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateDocSignature")
    public JAXBElement<ValidateDocSignature> createValidateDocSignature(ValidateDocSignature value) {
        return new JAXBElement<ValidateDocSignature>(_ValidateDocSignature_QNAME, ValidateDocSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDocSignatureResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDocSignatureResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateDocSignatureResponse")
    public JAXBElement<ValidateDocSignatureResponse> createValidateDocSignatureResponse(ValidateDocSignatureResponse value) {
        return new JAXBElement<ValidateDocSignatureResponse>(_ValidateDocSignatureResponse_QNAME, ValidateDocSignatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateInsuredId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateInsuredId }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateInsuredId")
    public JAXBElement<ValidateInsuredId> createValidateInsuredId(ValidateInsuredId value) {
        return new JAXBElement<ValidateInsuredId>(_ValidateInsuredId_QNAME, ValidateInsuredId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateInsuredIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateInsuredIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateInsuredIdResponse")
    public JAXBElement<ValidateInsuredIdResponse> createValidateInsuredIdResponse(ValidateInsuredIdResponse value) {
        return new JAXBElement<ValidateInsuredIdResponse>(_ValidateInsuredIdResponse_QNAME, ValidateInsuredIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateUser")
    public JAXBElement<ValidateUser> createValidateUser(ValidateUser value) {
        return new JAXBElement<ValidateUser>(_ValidateUser_QNAME, ValidateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "validateUserResponse")
    public JAXBElement<ValidateUserResponse> createValidateUserResponse(ValidateUserResponse value) {
        return new JAXBElement<ValidateUserResponse>(_ValidateUserResponse_QNAME, ValidateUserResponse.class, null, value);
    }

}
