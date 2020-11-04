
package com.coldchain.project.ocpcl.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coldchain.project.ocpcl.webservice package.
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

    private final static QName _FaultMessage_QNAME = new QName("http://www.orbcomm.com/wsdl/OrbcommProvisioning-v1.0", "FaultMessage");
    private final static QName _OperationResponseListSubscribersSubscriberSaasUnitId_QNAME = new QName("http://www.orbcomm.com/wsdl/OrbcommProvisioning-v1.0", "saasUnitId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coldchain.project.ocpcl.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeRequest }
     * 
     */
    public ChangeRequest createChangeRequest() {
        return new ChangeRequest();
    }

    /**
     * Create an instance of {@link SuspendRequest }
     * 
     */
    public SuspendRequest createSuspendRequest() {
        return new SuspendRequest();
    }

    /**
     * Create an instance of {@link UnblockRequest }
     * 
     */
    public UnblockRequest createUnblockRequest() {
        return new UnblockRequest();
    }

    /**
     * Create an instance of {@link ListSubaccountsRequest }
     * 
     */
    public ListSubaccountsRequest createListSubaccountsRequest() {
        return new ListSubaccountsRequest();
    }

    /**
     * Create an instance of {@link BlockRequest }
     * 
     */
    public BlockRequest createBlockRequest() {
        return new BlockRequest();
    }

    /**
     * Create an instance of {@link SwapRequest }
     * 
     */
    public SwapRequest createSwapRequest() {
        return new SwapRequest();
    }

    /**
     * Create an instance of {@link UnsuspendRequest }
     * 
     */
    public UnsuspendRequest createUnsuspendRequest() {
        return new UnsuspendRequest();
    }

    /**
     * Create an instance of {@link ActivateRequest }
     * 
     */
    public ActivateRequest createActivateRequest() {
        return new ActivateRequest();
    }

    /**
     * Create an instance of {@link DeactivateRequest }
     * 
     */
    public DeactivateRequest createDeactivateRequest() {
        return new DeactivateRequest();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link OperationResponse.ListDeliveryPlans }
     * 
     */
    public OperationResponse.ListDeliveryPlans createOperationResponseListDeliveryPlans() {
        return new OperationResponse.ListDeliveryPlans();
    }

    /**
     * Create an instance of {@link OperationResponse.ListAssetTypes }
     * 
     */
    public OperationResponse.ListAssetTypes createOperationResponseListAssetTypes() {
        return new OperationResponse.ListAssetTypes();
    }

    /**
     * Create an instance of {@link OperationResponse.ListMessageFilterProfiles }
     * 
     */
    public OperationResponse.ListMessageFilterProfiles createOperationResponseListMessageFilterProfiles() {
        return new OperationResponse.ListMessageFilterProfiles();
    }

    /**
     * Create an instance of {@link OperationResponse.OperationPollResponse }
     * 
     */
    public OperationResponse.OperationPollResponse createOperationResponseOperationPollResponse() {
        return new OperationResponse.OperationPollResponse();
    }

    /**
     * Create an instance of {@link OperationResponse.OperationPollResponse.Transactions }
     * 
     */
    public OperationResponse.OperationPollResponse.Transactions createOperationResponseOperationPollResponseTransactions() {
        return new OperationResponse.OperationPollResponse.Transactions();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers }
     * 
     */
    public OperationResponse.ListSubscribers createOperationResponseListSubscribers() {
        return new OperationResponse.ListSubscribers();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber createOperationResponseListSubscribersSubscriber() {
        return new OperationResponse.ListSubscribers.Subscriber();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate }
     * 
     */
    public ActivateRequest.Activate createActivateRequestActivate() {
        return new ActivateRequest.Activate();
    }

    /**
     * Create an instance of {@link UnblockRequest.Unblock }
     * 
     */
    public UnblockRequest.Unblock createUnblockRequestUnblock() {
        return new UnblockRequest.Unblock();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change }
     * 
     */
    public ChangeRequest.Change createChangeRequestChange() {
        return new ChangeRequest.Change();
    }

    /**
     * Create an instance of {@link EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link UpdateAccountRequest }
     * 
     */
    public UpdateAccountRequest createUpdateAccountRequest() {
        return new UpdateAccountRequest();
    }

    /**
     * Create an instance of {@link CarrierModListType }
     * 
     */
    public CarrierModListType createCarrierModListType() {
        return new CarrierModListType();
    }

    /**
     * Create an instance of {@link ListZonesRequest }
     * 
     */
    public ListZonesRequest createListZonesRequest() {
        return new ListZonesRequest();
    }

    /**
     * Create an instance of {@link GetUserProfileRequest }
     * 
     */
    public GetUserProfileRequest createGetUserProfileRequest() {
        return new GetUserProfileRequest();
    }

    /**
     * Create an instance of {@link EchoRequest }
     * 
     */
    public EchoRequest createEchoRequest() {
        return new EchoRequest();
    }

    /**
     * Create an instance of {@link GetUserProfileResponse }
     * 
     */
    public GetUserProfileResponse createGetUserProfileResponse() {
        return new GetUserProfileResponse();
    }

    /**
     * Create an instance of {@link SuspendRequest.Suspend }
     * 
     */
    public SuspendRequest.Suspend createSuspendRequestSuspend() {
        return new SuspendRequest.Suspend();
    }

    /**
     * Create an instance of {@link ListSubaccountsRequest.AccountSubaccount }
     * 
     */
    public ListSubaccountsRequest.AccountSubaccount createListSubaccountsRequestAccountSubaccount() {
        return new ListSubaccountsRequest.AccountSubaccount();
    }

    /**
     * Create an instance of {@link UpdateSubaccountRequest }
     * 
     */
    public UpdateSubaccountRequest createUpdateSubaccountRequest() {
        return new UpdateSubaccountRequest();
    }

    /**
     * Create an instance of {@link BlockRequest.Block }
     * 
     */
    public BlockRequest.Block createBlockRequestBlock() {
        return new BlockRequest.Block();
    }

    /**
     * Create an instance of {@link SwapRequest.Swap }
     * 
     */
    public SwapRequest.Swap createSwapRequestSwap() {
        return new SwapRequest.Swap();
    }

    /**
     * Create an instance of {@link UnsuspendRequest.Unsuspend }
     * 
     */
    public UnsuspendRequest.Unsuspend createUnsuspendRequestUnsuspend() {
        return new UnsuspendRequest.Unsuspend();
    }

    /**
     * Create an instance of {@link ListMessageFilterProfilesRequest }
     * 
     */
    public ListMessageFilterProfilesRequest createListMessageFilterProfilesRequest() {
        return new ListMessageFilterProfilesRequest();
    }

    /**
     * Create an instance of {@link ListOrganizationsRequest }
     * 
     */
    public ListOrganizationsRequest createListOrganizationsRequest() {
        return new ListOrganizationsRequest();
    }

    /**
     * Create an instance of {@link ListEnterprisesRequest }
     * 
     */
    public ListEnterprisesRequest createListEnterprisesRequest() {
        return new ListEnterprisesRequest();
    }

    /**
     * Create an instance of {@link CreateSubaccountRequest }
     * 
     */
    public CreateSubaccountRequest createCreateSubaccountRequest() {
        return new CreateSubaccountRequest();
    }

    /**
     * Create an instance of {@link ListAccountsRequest }
     * 
     */
    public ListAccountsRequest createListAccountsRequest() {
        return new ListAccountsRequest();
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link ListAssetTypesRequest }
     * 
     */
    public ListAssetTypesRequest createListAssetTypesRequest() {
        return new ListAssetTypesRequest();
    }

    /**
     * Create an instance of {@link ListDeliveryPlansRequest }
     * 
     */
    public ListDeliveryPlansRequest createListDeliveryPlansRequest() {
        return new ListDeliveryPlansRequest();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link DeactivateRequest.Deactivate }
     * 
     */
    public DeactivateRequest.Deactivate createDeactivateRequestDeactivate() {
        return new DeactivateRequest.Deactivate();
    }

    /**
     * Create an instance of {@link ListSubscribersRequest }
     * 
     */
    public ListSubscribersRequest createListSubscribersRequest() {
        return new ListSubscribersRequest();
    }

    /**
     * Create an instance of {@link OperationPollRequest }
     * 
     */
    public OperationPollRequest createOperationPollRequest() {
        return new OperationPollRequest();
    }

    /**
     * Create an instance of {@link CreateOrganizationRequest }
     * 
     */
    public CreateOrganizationRequest createCreateOrganizationRequest() {
        return new CreateOrganizationRequest();
    }

    /**
     * Create an instance of {@link UpdateOrganizationRequest }
     * 
     */
    public UpdateOrganizationRequest createUpdateOrganizationRequest() {
        return new UpdateOrganizationRequest();
    }

    /**
     * Create an instance of {@link OperationResponse.Operation }
     * 
     */
    public OperationResponse.Operation createOperationResponseOperation() {
        return new OperationResponse.Operation();
    }

    /**
     * Create an instance of {@link OperationResponse.ListEnterprises }
     * 
     */
    public OperationResponse.ListEnterprises createOperationResponseListEnterprises() {
        return new OperationResponse.ListEnterprises();
    }

    /**
     * Create an instance of {@link OperationResponse.ListOrganizations }
     * 
     */
    public OperationResponse.ListOrganizations createOperationResponseListOrganizations() {
        return new OperationResponse.ListOrganizations();
    }

    /**
     * Create an instance of {@link OperationResponse.ListAccounts }
     * 
     */
    public OperationResponse.ListAccounts createOperationResponseListAccounts() {
        return new OperationResponse.ListAccounts();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubaccounts }
     * 
     */
    public OperationResponse.ListSubaccounts createOperationResponseListSubaccounts() {
        return new OperationResponse.ListSubaccounts();
    }

    /**
     * Create an instance of {@link OperationResponse.CreateOrganization }
     * 
     */
    public OperationResponse.CreateOrganization createOperationResponseCreateOrganization() {
        return new OperationResponse.CreateOrganization();
    }

    /**
     * Create an instance of {@link OperationResponse.CreateAccount }
     * 
     */
    public OperationResponse.CreateAccount createOperationResponseCreateAccount() {
        return new OperationResponse.CreateAccount();
    }

    /**
     * Create an instance of {@link OperationResponse.CreateSubaccount }
     * 
     */
    public OperationResponse.CreateSubaccount createOperationResponseCreateSubaccount() {
        return new OperationResponse.CreateSubaccount();
    }

    /**
     * Create an instance of {@link OperationResponse.UpdateOrganization }
     * 
     */
    public OperationResponse.UpdateOrganization createOperationResponseUpdateOrganization() {
        return new OperationResponse.UpdateOrganization();
    }

    /**
     * Create an instance of {@link OperationResponse.UpdateAccount }
     * 
     */
    public OperationResponse.UpdateAccount createOperationResponseUpdateAccount() {
        return new OperationResponse.UpdateAccount();
    }

    /**
     * Create an instance of {@link OperationResponse.UpdateSubaccount }
     * 
     */
    public OperationResponse.UpdateSubaccount createOperationResponseUpdateSubaccount() {
        return new OperationResponse.UpdateSubaccount();
    }

    /**
     * Create an instance of {@link OperationResponse.ListZones }
     * 
     */
    public OperationResponse.ListZones createOperationResponseListZones() {
        return new OperationResponse.ListZones();
    }

    /**
     * Create an instance of {@link IridiumDestinationChangeType }
     * 
     */
    public IridiumDestinationChangeType createIridiumDestinationChangeType() {
        return new IridiumDestinationChangeType();
    }

    /**
     * Create an instance of {@link AccountListType }
     * 
     */
    public AccountListType createAccountListType() {
        return new AccountListType();
    }

    /**
     * Create an instance of {@link PricePlanListType }
     * 
     */
    public PricePlanListType createPricePlanListType() {
        return new PricePlanListType();
    }

    /**
     * Create an instance of {@link SubaccountListEntryType }
     * 
     */
    public SubaccountListEntryType createSubaccountListEntryType() {
        return new SubaccountListEntryType();
    }

    /**
     * Create an instance of {@link EnterpriseListType }
     * 
     */
    public EnterpriseListType createEnterpriseListType() {
        return new EnterpriseListType();
    }

    /**
     * Create an instance of {@link CarrierListType }
     * 
     */
    public CarrierListType createCarrierListType() {
        return new CarrierListType();
    }

    /**
     * Create an instance of {@link CarrierListEntryType }
     * 
     */
    public CarrierListEntryType createCarrierListEntryType() {
        return new CarrierListEntryType();
    }

    /**
     * Create an instance of {@link IridiumDestinationActivateType }
     * 
     */
    public IridiumDestinationActivateType createIridiumDestinationActivateType() {
        return new IridiumDestinationActivateType();
    }

    /**
     * Create an instance of {@link SubaccountListType }
     * 
     */
    public SubaccountListType createSubaccountListType() {
        return new SubaccountListType();
    }

    /**
     * Create an instance of {@link OrganizationListEntryType }
     * 
     */
    public OrganizationListEntryType createOrganizationListEntryType() {
        return new OrganizationListEntryType();
    }

    /**
     * Create an instance of {@link CarrierModListEntryType }
     * 
     */
    public CarrierModListEntryType createCarrierModListEntryType() {
        return new CarrierModListEntryType();
    }

    /**
     * Create an instance of {@link OrganizationListType }
     * 
     */
    public OrganizationListType createOrganizationListType() {
        return new OrganizationListType();
    }

    /**
     * Create an instance of {@link PricePlanListEntryType }
     * 
     */
    public PricePlanListEntryType createPricePlanListEntryType() {
        return new PricePlanListEntryType();
    }

    /**
     * Create an instance of {@link EnterpriseListEntryType }
     * 
     */
    public EnterpriseListEntryType createEnterpriseListEntryType() {
        return new EnterpriseListEntryType();
    }

    /**
     * Create an instance of {@link AccountListEntryType }
     * 
     */
    public AccountListEntryType createAccountListEntryType() {
        return new AccountListEntryType();
    }

    /**
     * Create an instance of {@link OperationResponse.ListDeliveryPlans.DeliveryPlan }
     * 
     */
    public OperationResponse.ListDeliveryPlans.DeliveryPlan createOperationResponseListDeliveryPlansDeliveryPlan() {
        return new OperationResponse.ListDeliveryPlans.DeliveryPlan();
    }

    /**
     * Create an instance of {@link OperationResponse.ListAssetTypes.AssetType }
     * 
     */
    public OperationResponse.ListAssetTypes.AssetType createOperationResponseListAssetTypesAssetType() {
        return new OperationResponse.ListAssetTypes.AssetType();
    }

    /**
     * Create an instance of {@link OperationResponse.ListMessageFilterProfiles.MessageFilterProfile }
     * 
     */
    public OperationResponse.ListMessageFilterProfiles.MessageFilterProfile createOperationResponseListMessageFilterProfilesMessageFilterProfile() {
        return new OperationResponse.ListMessageFilterProfiles.MessageFilterProfile();
    }

    /**
     * Create an instance of {@link OperationResponse.OperationPollResponse.Transactions.Transaction }
     * 
     */
    public OperationResponse.OperationPollResponse.Transactions.Transaction createOperationResponseOperationPollResponseTransactionsTransaction() {
        return new OperationResponse.OperationPollResponse.Transactions.Transaction();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Att }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Att createOperationResponseListSubscribersSubscriberAtt() {
        return new OperationResponse.ListSubscribers.Subscriber.Att();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Rogers }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Rogers createOperationResponseListSubscribersSubscriberRogers() {
        return new OperationResponse.ListSubscribers.Subscriber.Rogers();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Telefonica }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Telefonica createOperationResponseListSubscribersSubscriberTelefonica() {
        return new OperationResponse.ListSubscribers.Subscriber.Telefonica();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.ChinaUnicom }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.ChinaUnicom createOperationResponseListSubscribersSubscriberChinaUnicom() {
        return new OperationResponse.ListSubscribers.Subscriber.ChinaUnicom();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Vodafone }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Vodafone createOperationResponseListSubscribersSubscriberVodafone() {
        return new OperationResponse.ListSubscribers.Subscriber.Vodafone();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Orbcomm }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Orbcomm createOperationResponseListSubscribersSubscriberOrbcomm() {
        return new OperationResponse.ListSubscribers.Subscriber.Orbcomm();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.InmarsatIdp }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.InmarsatIdp createOperationResponseListSubscribersSubscriberInmarsatIdp() {
        return new OperationResponse.ListSubscribers.Subscriber.InmarsatIdp();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Orange }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Orange createOperationResponseListSubscribersSubscriberOrange() {
        return new OperationResponse.ListSubscribers.Subscriber.Orange();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Tmobile }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Tmobile createOperationResponseListSubscribersSubscriberTmobile() {
        return new OperationResponse.ListSubscribers.Subscriber.Tmobile();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Verizon4G }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Verizon4G createOperationResponseListSubscribersSubscriberVerizon4G() {
        return new OperationResponse.ListSubscribers.Subscriber.Verizon4G();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.VerizonCdma }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.VerizonCdma createOperationResponseListSubscribersSubscriberVerizonCdma() {
        return new OperationResponse.ListSubscribers.Subscriber.VerizonCdma();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Globalstar }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Globalstar createOperationResponseListSubscribersSubscriberGlobalstar() {
        return new OperationResponse.ListSubscribers.Subscriber.Globalstar();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Iridium }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Iridium createOperationResponseListSubscribersSubscriberIridium() {
        return new OperationResponse.ListSubscribers.Subscriber.Iridium();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.GlobalSim }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.GlobalSim createOperationResponseListSubscribersSubscriberGlobalSim() {
        return new OperationResponse.ListSubscribers.Subscriber.GlobalSim();
    }

    /**
     * Create an instance of {@link OperationResponse.ListSubscribers.Subscriber.Magenta }
     * 
     */
    public OperationResponse.ListSubscribers.Subscriber.Magenta createOperationResponseListSubscribersSubscriberMagenta() {
        return new OperationResponse.ListSubscribers.Subscriber.Magenta();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.AccountSubaccount }
     * 
     */
    public ActivateRequest.Activate.AccountSubaccount createActivateRequestActivateAccountSubaccount() {
        return new ActivateRequest.Activate.AccountSubaccount();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.OrbcommActivateParams }
     * 
     */
    public ActivateRequest.Activate.OrbcommActivateParams createActivateRequestActivateOrbcommActivateParams() {
        return new ActivateRequest.Activate.OrbcommActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.InmarsatIdpActivateParams }
     * 
     */
    public ActivateRequest.Activate.InmarsatIdpActivateParams createActivateRequestActivateInmarsatIdpActivateParams() {
        return new ActivateRequest.Activate.InmarsatIdpActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.IridiumActivateParams }
     * 
     */
    public ActivateRequest.Activate.IridiumActivateParams createActivateRequestActivateIridiumActivateParams() {
        return new ActivateRequest.Activate.IridiumActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.TmobileActivateParams }
     * 
     */
    public ActivateRequest.Activate.TmobileActivateParams createActivateRequestActivateTmobileActivateParams() {
        return new ActivateRequest.Activate.TmobileActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.Verizon4GActivateParams }
     * 
     */
    public ActivateRequest.Activate.Verizon4GActivateParams createActivateRequestActivateVerizon4GActivateParams() {
        return new ActivateRequest.Activate.Verizon4GActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.GlobalstarActivateParams }
     * 
     */
    public ActivateRequest.Activate.GlobalstarActivateParams createActivateRequestActivateGlobalstarActivateParams() {
        return new ActivateRequest.Activate.GlobalstarActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.GlobalSimActivateParams }
     * 
     */
    public ActivateRequest.Activate.GlobalSimActivateParams createActivateRequestActivateGlobalSimActivateParams() {
        return new ActivateRequest.Activate.GlobalSimActivateParams();
    }

    /**
     * Create an instance of {@link ActivateRequest.Activate.MagentaActivateParams }
     * 
     */
    public ActivateRequest.Activate.MagentaActivateParams createActivateRequestActivateMagentaActivateParams() {
        return new ActivateRequest.Activate.MagentaActivateParams();
    }

    /**
     * Create an instance of {@link UnblockRequest.Unblock.AdditionalVolume }
     * 
     */
    public UnblockRequest.Unblock.AdditionalVolume createUnblockRequestUnblockAdditionalVolume() {
        return new UnblockRequest.Unblock.AdditionalVolume();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.AccountSubaccount }
     * 
     */
    public ChangeRequest.Change.AccountSubaccount createChangeRequestChangeAccountSubaccount() {
        return new ChangeRequest.Change.AccountSubaccount();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.OrbcommChangeParams }
     * 
     */
    public ChangeRequest.Change.OrbcommChangeParams createChangeRequestChangeOrbcommChangeParams() {
        return new ChangeRequest.Change.OrbcommChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.InmarsatIdpChangeParams }
     * 
     */
    public ChangeRequest.Change.InmarsatIdpChangeParams createChangeRequestChangeInmarsatIdpChangeParams() {
        return new ChangeRequest.Change.InmarsatIdpChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.IridiumChangeParams }
     * 
     */
    public ChangeRequest.Change.IridiumChangeParams createChangeRequestChangeIridiumChangeParams() {
        return new ChangeRequest.Change.IridiumChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.TmobileChangeParams }
     * 
     */
    public ChangeRequest.Change.TmobileChangeParams createChangeRequestChangeTmobileChangeParams() {
        return new ChangeRequest.Change.TmobileChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.Verizon4GChangeParams }
     * 
     */
    public ChangeRequest.Change.Verizon4GChangeParams createChangeRequestChangeVerizon4GChangeParams() {
        return new ChangeRequest.Change.Verizon4GChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.GlobalstarChangeParams }
     * 
     */
    public ChangeRequest.Change.GlobalstarChangeParams createChangeRequestChangeGlobalstarChangeParams() {
        return new ChangeRequest.Change.GlobalstarChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.GlobalSimChangeParams }
     * 
     */
    public ChangeRequest.Change.GlobalSimChangeParams createChangeRequestChangeGlobalSimChangeParams() {
        return new ChangeRequest.Change.GlobalSimChangeParams();
    }

    /**
     * Create an instance of {@link ChangeRequest.Change.MagentaChangeParams }
     * 
     */
    public ChangeRequest.Change.MagentaChangeParams createChangeRequestChangeMagentaChangeParams() {
        return new ChangeRequest.Change.MagentaChangeParams();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioning-v1.0", name = "FaultMessage")
    public JAXBElement<String> createFaultMessage(String value) {
        return new JAXBElement<String>(_FaultMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orbcomm.com/wsdl/OrbcommProvisioning-v1.0", name = "saasUnitId", scope = OperationResponse.ListSubscribers.Subscriber.class)
    public JAXBElement<String> createOperationResponseListSubscribersSubscriberSaasUnitId(String value) {
        return new JAXBElement<String>(_OperationResponseListSubscribersSubscriberSaasUnitId_QNAME, String.class, OperationResponse.ListSubscribers.Subscriber.class, value);
    }

}
