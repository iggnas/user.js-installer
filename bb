@echo off
for %%s in (
    DeviceAssociationBrokerSvc_
    DeviceAssociationService
    DeviceInstall
    DevicePickerUserSvc_
    DevicesFlowUserSvc_
    DiagTrack
    DialogBlockingService
    DisplayEnhancementService
    DmEnrollmentSvc
    DoSvc
    DsSvc
    DsmSvc
    EFS
    EapHost
    EntAppSvc
    FDResPub
    Fax
    FrameServer
    Netman
    NgcCtnrSvc
    AJRouter
    ALG
    AppIDSvc
    AppMgmt
    AppReadiness
    AppXSvc
    AppVClient
    AssignedAccessManagerSvc
    AxInstSV
    BDESVC
    BFE
    BTAGService
    BcastDVRUserService_
    BluetoothUserService_
    Browser
    BthAvctpSvc
    BthHFSrv
    CDPSvc
    COMSysApp
    CaptureService_
    CertPropSvc
    ClipSVC
    ConsentUxUserSvc_
    CoreMessagingRegistrar
    CredentialEnrollmentManagerUserSvc_
    CscService
    DcpSvc
    DevQueryBroker
    NgcSvc
    NlaSvc
    P9RdrService_
    PNRPAutoReg
    PNRPsvc
    PcaSvc
    PeerDistSvc
    PenService_
    PerfHost
    PhoneSvc
    PimIndexMaintenanceSvc_
    PlugPlay
    PolicyAgent
    PrintNotify
    PrintWorkflowUserSvc_
    PushToInstall
    QWAVE
    RasAuto
    FontCache
    FrameServerMonitor
    GraphicsPerfSvc
    HomeGroupListener
    HomeGroupProvider
    HvHost
    IEEtwCollectorService
    IKEEXT
    InstallService
    InventorySvc
    IpxlatCfgSvc
    KtmRm
    LicenseManager
    LxpSvc
    MSDTC
    MSiSCSI
    MapsBroker
    McpManagementService
    MessagingService_
    MicrosoftEdgeElevationServic
    MixedRealityOpenXRSvc
    MsKeyboardFilter
    NPSMSvc_
    MpsSvc
    SCardSv
    SDRSVC
    SEMgrSvc
    SNMPTRAP
    SNMPTrap
    SSDPSRV
    ScDeviceEnum
    SensorDataService
    SensorService
    SensrSvc
    SessionEnv
    SharedAccess
    SharedRealitySvc
    NaturalAuthentication
    NcaSvc
    NcbService
    NcdAutoSetup
    NetSetupSvc
    NetTcpPortSharing
    RasMan
    RmSv
    RpcLocator
    SCPolicySvc
    SmsRouter
    Spooler
    SstpSvc
    StateRepository
    StiSvc
    StorSvc
    TabletInputService
    TapiSrv
    TextInputManagementService
    WPDBusEnum
    WSService
    WaaSMedicSvc
    WalletService
    WarpJITSvc
    WbioSrvc
    TieringEngineService
    TimeBroker
    TimeBrokerSvc
    TokenBroker
    TroubleshootingSv
    TrustedInstaller
    UI0Detect
    UdkUserSvc_
    UevAgentService
    UmRdpService
    UnistoreSvc_
    UserDataSvc_
    UsoSvc
    VSS
    VacSvc
    W32Time
    WEPHOSTSVC
    WFDSConMgrSvc
    WMPNetworkSvc
    WManSvc
    WcsPlugInService
    WdiServiceHos
    WdiSystemHost
    WebClient
    Wecsvc
    WerSvc
    wuauserv
    wudfsvc
    XblGameSave
    XboxGipSvc
    XboxNetApiSvc
    autotimesvc
    bthserv
    camsvc
    cbdhsvc_
    cloudidsvc
    dcsvc
    defragsvc
    diagnosticshub.standardcollector.service
    diagsvc
    dmwappushservice
    dot3svc
    edgeupdate
    edgeupdatem
    embeddedmode
    fdPHost
    fhsvc
    hidserv
    icssvc
    iphlpsvc
    WiaRpc
    WinHttpAutoProxySvc
    WinRM
    WpcMonSvc
    svsvc
    swprv
    tzautoupdate
    uhssvc
    upnphost
    vds
    vm3dservice
    vmicguestinterface
    webthreatdefsvc
    wercplsupport
    wisvc
    wmiApSrv
    wlpasvc
    vmicheartbeat
    vmickvpexchange
    vmicrdv
    vmicshutdown
    vmictimesync
    vmicvmsession
    vmicvss
    vmvss
    WpnService
    WwanSvc
    XblAuthManager
    wbengine
    wcncsvc
    workfolderssvc
    lfsvc
    lltdsvc
    lmhosts
    netprofm
    p2pimsvc
    seclogon
    perceptionsimulation
    p2psvc
    pla
    shpamsvc
    smphost
    spectrum
    ssh-agent
) do (
    REG QUERY "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\%%~s" /v Start | find "0x2" > nul
    if not errorlevel 1 (
        reg add "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\%%~s" /v Start /t REG_DWORD /d 3 /f
    )
)