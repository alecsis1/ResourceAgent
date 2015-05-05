package com.agent.pojo;


/**
 * NetworkAdapterInfo contains the properties for a network adapter.
 * 
 * @author alexandru.popescu
 */
public class NetworkAdapterInfo {

	// IP_ADAPTER_INFO - https://msdn.microsoft.com/en-us/library/windows/desktop/aa366062%28v=vs.85%29.aspx
	private Long comboIndex; // Reserved.
	private String adapterName; // An ANSI character string of the name of the adapter.
	private String description; // An ANSI character string that contains the description of the adapter.
	private String mac; // The hardware address for the adapter.
	private Long index; // The adapter index. The adapter index may change when an adapter is disabled and then enabled, or under other circumstances, and should not be considered persistent.
			
	/* 
	adaptorType:
		The adapter type. Possible values for the adapter type are listed in the Ipifcons.h header file.
		The table below lists common values for the adapter type although other values are possible on Windows Vista and later. 

		MIB_IF_TYPE_OTHER = 1 (Some other type of network interface.)
		MIB_IF_TYPE_ETHERNET = 6 (An Ethernet network interface.)
		MIB_IF_TYPE_TOKENRING = 9 (A token ring network interface.)
		MIB_IF_TYPE_FDDI = 15 (A Fiber Distributed Data Interface (FDDI) network interface.)
		MIB_IF_TYPE_PPP = 23 (A PPP network interface.)
		MIB_IF_TYPE_LOOPBACK = 24 (A software loopback network interface.)
		MIB_IF_TYPE_SLIP = 28 (An ATM network interface.)
		IF_TYPE_IEEE80211 = 71 (An IEEE 802.11 wireless network interface. Note:  This adapter type is returned on Windows Vista and later. On Windows Server 2003 and Windows XP , an IEEE 802.11 wireless network interface returns an adapter type of MIB_IF_TYPE_ETHERNET.)
	*/
	private Integer adaptorType;
	private Boolean dhcpEnabled;
	private Boolean haveWins; 
	private AdapterAddresses dhcpServer;
	private AdapterAddresses ipAddress;
	private AdapterAddresses gateway;
	private AdapterAddresses primaryWinsServerIpAddress;
	private AdapterAddresses secondaryWinsServerIpAddress;
	
	// MIB_IF_ROW2 - https://msdn.microsoft.com/en-us/library/windows/desktop/aa814491%28v=vs.85%29.aspx
	private Long interfaceLuid; // The locally unique identifier (LUID) for the network interface.
	private String alias; // contains the alias name of the network interface.
	private Long mtu; // The maximum transmission unit (MTU) size, in bytes, for this network interface. 
	
	/*
	interfaceType:
		The interface type as defined by the Internet Assigned Names Authority (IANA). For more information, see http://www.iana.org/assignments/ianaiftype-mib. Possible values for the interface type are listed in the Ipifcons.h header file.
		The table below lists common values for the interface type although many other values are possible. 

		IF_TYPE_OTHER = 1 (Some other type of network interface.)
		IF_TYPE_ETHERNET_CSMACD = 6 (An Ethernet network interface.)
		IF_TYPE_ISO88025_TOKENRING = 9 (A token ring network interface.)
		IF_TYPE_FDDI = 15 (A Fiber Distributed Data Interface (FDDI) network interface.)
		IF_TYPE_PPP = 23 (A PPP network interface.)
		IF_TYPE_SOFTWARE_LOOPBACK = 24 (A software loopback network interface.)
		IF_TYPE_ATM = 37 (An ATM network interface.)
		IF_TYPE_IEEE80211 = 71 (An IEEE 802.11 wireless network interface. Note:  This adapter type is returned on Windows Vista and later. On Windows Server 2003 and Windows XP , an IEEE 802.11 wireless network interface returns an adapter type of MIB_IF_TYPE_ETHERNET.)
		IF_TYPE_TUNNEL = 131 (A tunnel type encapsulation network interface.)
		IF_TYPE_IEEE1394 = 144 (An IEEE 1394 (Firewire) high performance serial bus network interface.)
	*/
	private Integer interfaceType;

	/* 
	tunnelType:
		The tunnel type is defined by the Internet Assigned Names Authority (IANA). For more information, see http://www.iana.org/assignments/ianaiftype-mib. This member can be one of the values from the TUNNEL_TYPE enumeration type defined in the Ifdef.h header file.
		
		TUNNEL_TYPE_NONE = 0 (Not a tunnel.)
		TUNNEL_TYPE_OTHER = 1 (None of the following tunnel types.)
		TUNNEL_TYPE_DIRECT = 2 (A packet is encapsulated directly within a normal IP header, with no intermediate header, and unicast to the remote tunnel endpoint.)
		TUNNEL_TYPE_6TO4 = 11 (An IPv6 packet is encapsulated directly within an IPv4 header, with no intermediate header, and unicast to the destination determined by the 6to4 protocol.)
		TUNNEL_TYPE_ISATAP = 13 (An IPv6 packet is encapsulated directly within an IPv4 header, with no intermediate header, and unicast to the destination determined by the ISATAP protocol.)
		TUNNEL_TYPE_TEREDO = 14 (Teredo encapsulation.)		
	*/
	private Integer tunnelType;

	/*
	mediaType:
			The NDIS media type for the interface. This member can be one of the values from the NDIS_MEDIUM enumeration type defined in the Ntddndis.h header file.
			
			NdisMedium802_3 = 0 (An Ethernet (802.3) network.)
			NdisMedium802_5 = 1 (A Token Ring (802.5) network.)
			NdisMediumFddi = 2 (A Fiber Distributed Data Interface (FDDI) network.)
			NdisMediumWan = 3 (A wide area network (WAN). This type covers various forms of point-to-point and WAN NICs, as well as variant address/header formats that must be negotiated between the protocol driver and the underlying driver after the binding is established.)
			NdisMediumLocalTalk = 4 (A LocalTalk network.)
			NdisMediumDix = 5 (An Ethernet network for which the drivers use the DIX Ethernet header format. - defined for convenience, not a real medium)
			NdisMediumArcnetRaw = 6 (An ARCNET network.)
			NdisMediumArcnet878_2 = 7 (An ARCNET (878.2) network.)
			NdisMediumAtm = 8 (An ATM network. Connection-oriented client protocol drivers can bind themselves to an underlying miniport driver that returns this value. Otherwise, legacy protocol drivers bind themselves to the system-supplied LanE intermediate driver, which reports its medium type as either NdisMedium802_3 or NdisMedium802_5, depending on how the LanE driver is configured by the network administrator.)
			NdisMediumWirelessWan = 9 (A wireless network. NDIS 5.X miniport drivers that support wireless LAN (WLAN) or wireless WAN (WWAN) packets do not use this NDIS media type, but declare their media type as NdisMedium802_3 and emulate Ethernet to higher-level NDIS drivers. Note:  This media type is supported and can be used for Mobile Broadband only on Windows 7, Windows Server 2008 R2, and later.)
			NdisMediumIrda = 10 (An infrared (IrDA) network.)
			NdisMediumBpc = 11 (A broadcast PC network.)
			NdisMediumCoWan = 12 (A wide area network in a connection-oriented environment.)
			NdisMedium1394 = 13 (An IEEE 1394 (fire wire) network.)
			NdisMediumInfiniBand = 14 (An InfiniBand network.)
			NdisMediumTunnel = 15 (A tunnel network. Note:  This media type is supported on Windows Vista, Windows Server 2008, and later.)
			NdisMediumNative802_11 = 16 (A native IEEE 802.11 network. Note:  This media type is supported on Windows Vista, Windows Server 2008, and later.)
			NdisMediumLoopback = 17 (An NDIS loopback network. Note:  This media type is supported on Windows Vista, Windows Server 2008, and later.)
			NdisMediumWiMax = 18 (An WiMax network. Note:  This media type is supported on Windows 7, Windows Server 2008 R2, and later.)
	*/
	private Integer mediaType;
	
	/*
	physicalMediumType:
			The NDIS physical medium type. This member can be one of the values from the NDIS_PHYSICAL_MEDIUM enumeration type defined in the Ntddndis.h header file.

			NdisPhysicalMediumUnspecified = 0 (The physical medium is none of the below values. For example, a one-way satellite feed is an unspecified physical medium.)
			NdisPhysicalMediumWirelessLan = 1 (Packets are transferred over a wireless LAN network through a miniport driver that conforms to the 802.11 interface.)
			NdisPhysicalMediumCableModem = 2 (Packets are transferred over a DOCSIS-based cable network.)
			NdisPhysicalMediumPhoneLine = 3 (Packets are transferred over standard phone lines. This includes HomePNA media, for example.)
			NdisPhysicalMediumPowerLine = 4 (Packets are transferred over wiring that is connected to a power distribution system.)
			NdisPhysicalMediumDSL = 5 (Packets are transferred over a Digital Subscriber Line (DSL) network. This includes ADSL, UADSL (G.Lite), and SDSL, for example. - includes ADSL and UADSL (G.Lite))
			NdisPhysicalMediumFibreChannel = 6 (Packets are transferred over a Fibre Channel interconnect.)
			NdisPhysicalMedium1394 = 7 (Packets are transferred over an IEEE 1394 bus.)
			NdisPhysicalMediumWirelessWan = 8 (Packets are transferred over a Wireless WAN link. This includes mobile broadband devices that support CDPD, CDMA, GSM, and GPRS, for example.)
			NdisPhysicalMediumNative802_11 = 9 ( Packets are transferred over a wireless LAN network through a miniport driver that conforms to the Native 802.11 interface. Note: The Native 802.11 interface is supported in NDIS 6.0 and later versions.)
			NdisPhysicalMediumBluetooth = 10 (Packets are transferred over a Bluetooth network. Bluetooth is a short-range wireless technology that uses the 2.4 GHz spectrum.)
			NdisPhysicalMediumInfiniband = 11 (Packets are transferred over an Infiniband interconnect.)
			NdisPhysicalMediumWiMax = 12 (Packets are transferred over a WiMax network.)
			NdisPhysicalMediumUWB = 13 (Packets are transferred over an ultra wide band network.)
			NdisPhysicalMedium802_3 = 14 (Packets are transferred over an Ethernet (802.3) network.)
			NdisPhysicalMedium802_5 = 15 (Packets are transferred over a Token Ring (802.5) network.)
			NdisPhysicalMediumIrda = 16 (Packets are transferred over an infrared (IrDA) network.)
			NdisPhysicalMediumWiredWAN = 17 (Packets are transferred over a wired WAN network.)
			NdisPhysicalMediumWiredCoWan = 18 (Packets are transferred over a wide area network in a connection-oriented environment.)
			NdisPhysicalMediumOther = 19 (Packets are transferred over a network that is not described by other possible values.)
			NdisPhysicalMediumMax = 20 (Not a real physical type, defined as an upper-bound.)
	*/
	private Integer physicalMediumType;

	/*
	accessType:
			The interface access type. This member can be one of the values from the NET_IF_ACCESS_TYPE enumeration type defined in the Ifdef.h header file.
			
			NET_IF_ACCESS_LOOPBACK = 1 (Loopback access type. This access type indicates that the interface loops back transmit data as receive data.)
			NET_IF_ACCESS_BROADCAST = 2 (The LAN access type which includes Ethernet. This access type indicates that the interface provides native support for multicast or broadcast services. Note:  Mobile broadband interfaces with a MediaType of NdisMedium802_3 use this access type.)
			NET_IF_ACCESS_POINT_TO_POINT = 3 (Point-to-point access that supports CoNDIS/WAN, except for non-broadcast multi-access (NBMA) interfaces. Note:  Mobile broadband interfaces with a MediaType of NdisMediumWirelessWan use this access type.)
			NET_IF_ACCESS_POINT_TO_MULTI_POINT = 4 (Point-to-multipoint access that supports non-broadcast multi-access (NBMA) media, including the "RAS Internal" interface, and native (non-LANE) ATM.)
			NET_IF_ACCESS_MAXIMUM = 5 (The maximum possible value for the NET_IF_ACCESS_TYPE enumeration type. This is not a legal value for AccessType member.)
	*/
	private Integer accessType;

	/*
	directionType:
			The interface direction type. This member can be one of the values from the NET_IF_DIRECTION_TYPE enumeration type defined in the Ifdef.h header file. 

			NET_IF_DIRECTION_SENDRECEIVE = 0 (The send and receive direction type. This direction type indicates that the NDIS network interface can send and receive data.)
			NET_IF_DIRECTION_SENDONLY = 1 (The send only direction type. This direction type indicates that the NDIS network interface can only send data.)
			NET_IF_DIRECTION_RECEIVEONLY = 2 (The receive only direction type. This direction type indicates that the NDIS network interface can only receive data.)
			NET_IF_DIRECTION_MAXIMUM = 3 (The maximum possible value for the NET_IF_DIRECTION_TYPE enumeration type. This is not a legal value for DirectionType member.)
	*/
	private Integer directionType;

	// InterfaceAndOperStatusFlags: A set of flags that provide information about the interface. These flags are combined with a bitwise OR operation. If none of the flags applies, then this member is set to zero.		
	private Boolean hardwareInterface; // Type: BOOLEAN - Set if the network interface is for hardware.
	private Boolean filterInterface; // Type: BOOLEAN - Set if the network interface is for a filter module.
	private Boolean connectorPresent; // Type: BOOLEAN - Set if a connector is present on the network interface. This value is set if there is a physical network adapter.
	private Boolean notAuthenticated; // Type: BOOLEAN - Set if the default port for the network interface is not authenticated. If a network interface is not authenticated by the target, then the network interface is not in an operational mode. Although this applies to both wired and wireless network connections, authentication is more common for wireless network connections.
	private Boolean notMediaConnected; // Type: BOOLEAN - Set if the network interface is not in a media-connected state. If a network cable is unplugged for a wired network, this would be set. For a wireless network, this is set for the network adapter that is not connected to a network.
	private Boolean paused; // Type: BOOLEAN - Set if the network stack for the network interface is in the paused or pausing state. This does not mean that the computer is in a hibernated state.
	private Boolean lowPower; // Type: BOOLEAN - Set if the network interface is in a low power state.
	private Boolean endPointInterface; // Type: BOOLEAN - Set if the network interface is an endpoint device and not a true network interface that connects to a network. This can be set by devices such as smart phones which use networking infrastructure to communicate to the PC but do not provide connectivity to an external network. It is mandatory for these types of devices to set this flag.
	
	/*
	operStatus:
		Type: IF_OPER_STATUS. The operational status for the interface as defined in RFC 2863 as IfOperStatus. For more information, see http://www.ietf.org/rfc/rfc2863.txt. This member can be one of the values from the IF_OPER_STATUS enumeration type defined in the Ifdef.h header file.

		IfOperStatusUp = 1 (The interface is up and able to pass packets.)
		IfOperStatusDown = 2 (The interface is down and not in a condition to pass packets. The IfOperStatusDown state has two meanings, depending on the value of AdminStatus member. If AdminStatus is not set to NET_IF_ADMIN_STATUS_DOWN and ifOperStatus is set to IfOperStatusDown then a fault condition is presumed to exist on the interface. If AdminStatus is set to IfOperStatusDown, then ifOperStatus will normally also be set to IfOperStatusDown or IfOperStatusNotPresent and there is not necessarily a fault condition on the interface.)
		IfOperStatusTesting = 3 (The interface is in testing mode.)
		IfOperStatusUnknown = 4 (The operational status of the interface is unknown.)
		IfOperStatusDormant = 5 (The interface is not actually in a condition to pass packets (it is not up), but is in a pending state, waiting for some external event. For on-demand interfaces, this new state identifies the situation where the interface is waiting for events to place it in the IfOperStatusUp state.)
		IfOperStatusNotPresent = 6 (A refinement on the IfOperStatusDown state which indicates that the relevant interface is down specifically because some component (typically, a hardware device) is not present in the managed system.)
		IfOperStatusLowerLayerDown = 7 (A refinement on the IfOperStatusDown state. This new state indicates that this interface runs on top of one or more other interfaces and that this interface is down specifically because one or more of these lower-layer interfaces are down.)
	*/
	private Integer operStatus;

	/*
	adminStatus:
			The administrative status for the interface as defined in RFC 2863. For more information, see http://www.ietf.org/rfc/rfc2863.txt. This member can be one of the values from the NET_IF_ADMIN_STATUS enumeration type defined in the Ifdef.h header file.

			NET_IF_ADMIN_STATUS_UP = 1 (The interface is initialized and enabled. But the interface is not necessarily ready to transmit and receive network data because that depends on the operational status of the interface.)
			NET_IF_ADMIN_STATUS_DOWN = 2 (The interface is down, and this interface cannot be used to transmit or receive network data.)
			NET_IF_ADMIN_STATUS_TESTING = 3 (The interface is in a test mode, and no network data can be transmitted or received.)
	*/
	private Integer adminStatus;

	/*
	mediaConnectState:
			The connection state of the interface. This member can be one of the values from the NET_IF_MEDIA_CONNECT_STATE enumeration type defined in the Ifdef.h header file.

			MediaConnectStateUnknown = 0 (The connection state of the interface is unknown.)
			MediaConnectStateConnected = 1 (The interface is connected to the network.)
			MediaConnectStateDisconnected = 2 (The interface is not connected to the network.)
	*/
	private Integer mediaConnectState;

	private String networkGuid; // Type: NET_IF_NETWORK_GUID. The GUID that is associated with the network that the interface belongs to.
	/*
	connectionType:
			The NDIS network interface connection type. This member can be one of the values from the NET_IF_CONNECTION_TYPE enumeration type defined in the Ifdef.h header file.
			
			NET_IF_CONNECTION_DEDICATED = 1 (The connection type is dedicated. The connection comes up automatically when media sense is TRUE. For example, an Ethernet connection is dedicated.)
			NET_IF_CONNECTION_PASSIVE = 2 (The connection type is passive. The remote end must bring up the connection to the local station. For example, a RAS interface is passive.)
			NET_IF_CONNECTION_DEMAND = 3 (The connection type is demand-dial. A connection of this type comes up in response to a local action (sending a packet, for example).)
			NET_IF_CONNECTION_MAXIMUM = 4 (The maximum possible value for the NET_IF_CONNECTION_TYPE enumeration type. This is not a legal value for ConnectionType member.)
	 */
	private Integer connectionType;
	private Long transmitLinkSpeed; // The speed in bits per second of the transmit link.
	private Long receiveLinkSpeed; // The speed in bits per second of the receive link.
	private Long inOctets; // The number of octets of data received without errors through this interface. This value includes octets in unicast, broadcast, and multicast packets.
	private Long inUcastPkts; // The number of unicast packets received without errors through this interface.
	private Long inNUcastPkts; // The number of non-unicast packets received without errors through this interface. This value includes broadcast and multicast packets.
	private Long inDiscards; // The number of inbound packets which were chosen to be discarded even though no errors were detected to prevent the packets from being deliverable to a higher-layer protocol.
	private Long inErrors; // The number of incoming packets that were discarded because of errors.
	private Long inUnknownProtos; // The number of incoming packets that were discarded because the protocol was unknown.
	private Long inUcastOctets; // The number of octets of data received without errors in unicast packets through this interface.
	private Long inMulticastOctets; // The number of octets of data received without errors in multicast packets through this interface.
	private Long inBroadcastOctets; // The number of octets of data received without errors in broadcast packets through this interface.
	private Long outOctets; // The number of octets of data transmitted without errors through this interface. This value includes octets in unicast, broadcast, and multicast packets.
	private Long outUcastPkts; // The number of unicast packets transmitted without errors through this interface.
	private Long outNUcastPkts; // The number of non-unicast packets transmitted without errors through this interface. This value includes broadcast and multicast packets.
	private Long outDiscards; // The number of outgoing packets that were discarded even though they did not have errors.
	private Long outErrors; // The number of outgoing packets that were discarded because of errors. 
	private Long outUcastOctets; // The number of octets of data transmitted without errors in unicast packets through this interface.     
	private Long outMulticastOctets; // The number of octets of data transmitted without errors in multicast packets through this interface.
	private Long outBroadcastOctets; // The number of octets of data transmitted without errors in broadcast packets through this interface.
	private Long outQLen; // The transmit queue length. This field is not currently used.
	
	/**
	 * Get the comboIndex.
	 * @return comboIndex - the comboIndex
	 */
	public Long getComboIndex() {
		return comboIndex;
	}
	
	/**
	 * Set the comboIndex.
	 * @param comboIndex - the comboIndex to set
	 * @return void
	 */
	public void setComboIndex(Long comboIndex) {
		this.comboIndex = comboIndex;
	}
	
	/**
	 * Get the adapterName.
	 * @return adapterName - the adapterName
	 */
	public String getAdapterName() {
		return adapterName;
	}
	
	/**
	 * Set the adapterName.
	 * @param adapterName - the adapterName to set
	 * @return void
	 */
	public void setAdapterName(String adapterName) {
		this.adapterName = adapterName;
	}
	
	/**
	 * Get the description.
	 * @return description - the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Set the description.
	 * @param description - the description to set
	 * @return void
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Get the mac.
	 * @return mac - the mac
	 */
	public String getMac() {
		return mac;
	}
	
	/**
	 * Set the mac.
	 * @param mac - the mac to set
	 * @return void
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	/**
	 * Get the index.
	 * @return index - the index
	 */
	public Long getIndex() {
		return index;
	}
	
	/**
	 * Set the index.
	 * @param index - the index to set
	 * @return void
	 */
	public void setIndex(Long index) {
		this.index = index;
	}
	
	/**
	 * Get the adaptorType.
	 * @return adaptorType - the adaptorType
	 */
	public Integer getAdaptorType() {
		return adaptorType;
	}
	
	/**
	 * Set the adaptorType.
	 * @param adaptorType - the adaptorType to set
	 * @return void
	 */
	public void setAdaptorType(Integer adaptorType) {
		this.adaptorType = adaptorType;
	}

	/**
	 * Get the dhcpEnabled.
	 * @return dhcpEnabled - the dhcpEnabled
	 */
	public Boolean getDhcpEnabled() {
		return dhcpEnabled;
	}
	
	/**
	 * Set the dhcpEnabled.
	 * @param dhcpEnabled - the dhcpEnabled to set
	 * @return void
	 */
	public void setDhcpEnabled(Boolean dhcpEnabled) {
		this.dhcpEnabled = dhcpEnabled;
	}
	
	/**
	 * Get the haveWins.
	 * @return haveWins - the haveWins
	 */
	public Boolean getHaveWins() {
		return haveWins;
	}
	
	/**
	 * Set the haveWins.
	 * @param haveWins - the haveWins to set
	 * @return void
	 */
	public void setHaveWins(Boolean haveWins) {
		this.haveWins = haveWins;
	}
	
	/**
	 * Get the dhcpServer.
	 * @return dhcpServer - the dhcpServer
	 */
	public AdapterAddresses getDhcpServer() {
		return dhcpServer;
	}
	
	/**
	 * Set the dhcpServer.
	 * @param dhcpServer - the dhcpServer to set
	 * @return void
	 */
	public void setDhcpServer(AdapterAddresses dhcpServer) {
		this.dhcpServer = dhcpServer;
	}
	
	/**
	 * Get the ipAddress.
	 * @return ipAddress - the ipAddress
	 */
	public AdapterAddresses getIpAddress() {
		return ipAddress;
	}
	
	/**
	 * Set the ipAddress.
	 * @param ipAddress - the ipAddress to set
	 * @return void
	 */
	public void setIpAddress(AdapterAddresses ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	/**
	 * Get the gateway.
	 * @return gateway - the gateway
	 */
	public AdapterAddresses getGateway() {
		return gateway;
	}
	
	/**
	 * Set the gateway.
	 * @param gateway - the gateway to set
	 * @return void
	 */
	public void setGateway(AdapterAddresses gateway) {
		this.gateway = gateway;
	}
	
	/**
	 * Get the primaryWinsServerIpAddress.
	 * @return primaryWinsServerIpAddress - the primaryWinsServerIpAddress
	 */
	public AdapterAddresses getPrimaryWinsServerIpAddress() {
		return primaryWinsServerIpAddress;
	}
	
	/**
	 * Set the primaryWinsServerIpAddress.
	 * @param primaryWinsServerIpAddress - the primaryWinsServerIpAddress to set
	 * @return void
	 */
	public void setPrimaryWinsServerIpAddress(AdapterAddresses primaryWinsServerIpAddress) {
		this.primaryWinsServerIpAddress = primaryWinsServerIpAddress;
	}
	
	/**
	 * Get the secondaryWinsServerIpAddress.
	 * @return secondaryWinsServerIpAddress - the secondaryWinsServerIpAddress
	 */
	public AdapterAddresses getSecondaryWinsServerIpAddress() {
		return secondaryWinsServerIpAddress;
	}
	
	/**
	 * Set the secondaryWinsServerIpAddress.
	 * @param secondaryWinsServerIpAddress - the secondaryWinsServerIpAddress to set
	 * @return void
	 */
	public void setSecondaryWinsServerIpAddress(AdapterAddresses secondaryWinsServerIpAddress) {
		this.secondaryWinsServerIpAddress = secondaryWinsServerIpAddress;
	}
	
	/**
	 * Get the interfaceLuid.
	 * @return interfaceLuid - the interfaceLuid
	 */
	public Long getInterfaceLuid() {
		return interfaceLuid;
	}
	
	/**
	 * Set the interfaceLuid.
	 * @param interfaceLuid - the interfaceLuid to set
	 * @return void
	 */
	public void setInterfaceLuid(Long interfaceLuid) {
		this.interfaceLuid = interfaceLuid;
	}
	
	/**
	 * Get the alias.
	 * @return alias - the alias
	 */
	public String getAlias() {
		return alias;
	}
	
	/**
	 * Set the alias.
	 * @param alias - the alias to set
	 * @return void
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	/**
	 * Get the mtu.
	 * @return mtu - the mtu
	 */
	public Long getMtu() {
		return mtu;
	}
	
	/**
	 * Set the mtu.
	 * @param mtu - the mtu to set
	 * @return void
	 */
	public void setMtu(Long mtu) {
		this.mtu = mtu;
	}
	
	/**
	 * Get the interfaceType.
	 * @return interfaceType - the interfaceType
	 */
	public Integer getInterfaceType() {
		return interfaceType;
	}
	
	/**
	 * Set the interfaceType.
	 * @param interfaceType - the interfaceType to set
	 * @return void
	 */
	public void setInterfaceType(Integer interfaceType) {
		this.interfaceType = interfaceType;
	}
	
	/**
	 * Get the tunnelType.
	 * @return tunnelType - the tunnelType
	 */
	public Integer getTunnelType() {
		return tunnelType;
	}
	
	/**
	 * Set the tunnelType.
	 * @param tunnelType - the tunnelType to set
	 * @return void
	 */
	public void setTunnelType(Integer tunnelType) {
		this.tunnelType = tunnelType;
	}
	
	/**
	 * Get the mediaType.
	 * @return mediaType - the mediaType
	 */
	public Integer getMediaType() {
		return mediaType;
	}
	
	/**
	 * Set the mediaType.
	 * @param mediaType - the mediaType to set
	 * @return void
	 */
	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}
	
	/**
	 * Get the physicalMediumType.
	 * @return physicalMediumType - the physicalMediumType
	 */
	public Integer getPhysicalMediumType() {
		return physicalMediumType;
	}
	
	/**
	 * Set the physicalMediumType.
	 * @param physicalMediumType - the physicalMediumType to set
	 * @return void
	 */
	public void setPhysicalMediumType(Integer physicalMediumType) {
		this.physicalMediumType = physicalMediumType;
	}
	
	/**
	 * Get the accessType.
	 * @return accessType - the accessType
	 */
	public Integer getAccessType() {
		return accessType;
	}
	
	/**
	 * Set the accessType.
	 * @param accessType - the accessType to set
	 * @return void
	 */
	public void setAccessType(Integer accessType) {
		this.accessType = accessType;
	}
	
	/**
	 * Get the directionType.
	 * @return directionType - the directionType
	 */
	public Integer getDirectionType() {
		return directionType;
	}
	
	/**
	 * Set the directionType.
	 * @param directionType - the directionType to set
	 * @return void
	 */
	public void setDirectionType(Integer directionType) {
		this.directionType = directionType;
	}
	
	/**
	 * Get the hardwareInterface.
	 * @return hardwareInterface - the hardwareInterface
	 */
	public Boolean getHardwareInterface() {
		return hardwareInterface;
	}
	
	/**
	 * Set the hardwareInterface.
	 * @param hardwareInterface - the hardwareInterface to set
	 * @return void
	 */
	public void setHardwareInterface(Boolean hardwareInterface) {
		this.hardwareInterface = hardwareInterface;
	}
	
	/**
	 * Get the filterInterface.
	 * @return filterInterface - the filterInterface
	 */
	public Boolean getFilterInterface() {
		return filterInterface;
	}
	
	/**
	 * Set the filterInterface.
	 * @param filterInterface - the filterInterface to set
	 * @return void
	 */
	public void setFilterInterface(Boolean filterInterface) {
		this.filterInterface = filterInterface;
	}
	
	/**
	 * Get the connectorPresent.
	 * @return connectorPresent - the connectorPresent
	 */
	public Boolean getConnectorPresent() {
		return connectorPresent;
	}
	
	/**
	 * Set the connectorPresent.
	 * @param connectorPresent - the connectorPresent to set
	 * @return void
	 */
	public void setConnectorPresent(Boolean connectorPresent) {
		this.connectorPresent = connectorPresent;
	}
	
	/**
	 * Get the notAuthenticated.
	 * @return notAuthenticated - the notAuthenticated
	 */
	public Boolean getNotAuthenticated() {
		return notAuthenticated;
	}
	
	/**
	 * Set the notAuthenticated.
	 * @param notAuthenticated - the notAuthenticated to set
	 * @return void
	 */
	public void setNotAuthenticated(Boolean notAuthenticated) {
		this.notAuthenticated = notAuthenticated;
	}
	
	/**
	 * Get the notMediaConnected.
	 * @return notMediaConnected - the notMediaConnected
	 */
	public Boolean getNotMediaConnected() {
		return notMediaConnected;
	}
	
	/**
	 * Set the notMediaConnected.
	 * @param notMediaConnected - the notMediaConnected to set
	 * @return void
	 */
	public void setNotMediaConnected(Boolean notMediaConnected) {
		this.notMediaConnected = notMediaConnected;
	}
	
	/**
	 * Get the paused.
	 * @return paused - the paused
	 */
	public Boolean getPaused() {
		return paused;
	}
	
	/**
	 * Set the paused.
	 * @param paused - the paused to set
	 * @return void
	 */
	public void setPaused(Boolean paused) {
		this.paused = paused;
	}
	
	/**
	 * Get the lowPower.
	 * @return lowPower - the lowPower
	 */
	public Boolean getLowPower() {
		return lowPower;
	}
	
	/**
	 * Set the lowPower.
	 * @param lowPower - the lowPower to set
	 * @return void
	 */
	public void setLowPower(Boolean lowPower) {
		this.lowPower = lowPower;
	}
	
	/**
	 * Get the endPointInterface.
	 * @return endPointInterface - the endPointInterface
	 */
	public Boolean getEndPointInterface() {
		return endPointInterface;
	}
	
	/**
	 * Set the endPointInterface.
	 * @param endPointInterface - the endPointInterface to set
	 * @return void
	 */
	public void setEndPointInterface(Boolean endPointInterface) {
		this.endPointInterface = endPointInterface;
	}
	
	/**
	 * Get the operStatus.
	 * @return operStatus - the operStatus
	 */
	public Integer getOperStatus() {
		return operStatus;
	}
	
	/**
	 * Set the operStatus.
	 * @param operStatus - the operStatus to set
	 * @return void
	 */
	public void setOperStatus(Integer operStatus) {
		this.operStatus = operStatus;
	}
	
	/**
	 * Get the adminStatus.
	 * @return adminStatus - the adminStatus
	 */
	public Integer getAdminStatus() {
		return adminStatus;
	}
	
	/**
	 * Set the adminStatus.
	 * @param adminStatus - the adminStatus to set
	 * @return void
	 */
	public void setAdminStatus(Integer adminStatus) {
		this.adminStatus = adminStatus;
	}
	
	/**
	 * Get the mediaConnectState.
	 * @return mediaConnectState - the mediaConnectState
	 */
	public Integer getMediaConnectState() {
		return mediaConnectState;
	}
	
	/**
	 * Set the mediaConnectState.
	 * @param mediaConnectState - the mediaConnectState to set
	 * @return void
	 */
	public void setMediaConnectState(Integer mediaConnectState) {
		this.mediaConnectState = mediaConnectState;
	}
	
	/**
	 * Get the networkGuid.
	 * @return networkGuid - the networkGuid
	 */
	public String getNetworkGuid() {
		return networkGuid;
	}
	
	/**
	 * Set the networkGuid.
	 * @param networkGuid - the networkGuid to set
	 * @return void
	 */
	public void setNetworkGuid(String networkGuid) {
		this.networkGuid = networkGuid;
	}
	
	/**
	 * Get the connectionType.
	 * @return connectionType - the connectionType
	 */
	public Integer getConnectionType() {
		return connectionType;
	}

	/**
	 * Set the connectionType.
	 * @param connectionType the connectionType to set
	 * @return void
	 */
	public void setConnectionType(Integer connectionType) {
		this.connectionType = connectionType;
	}
	
	/**
	 * Get the transmitLinkSpeed.
	 * @return transmitLinkSpeed - the transmitLinkSpeed
	 */
	public Long getTransmitLinkSpeed() {
		return transmitLinkSpeed;
	}
	
	/**
	 * Set the transmitLinkSpeed.
	 * @param transmitLinkSpeed - the transmitLinkSpeed to set
	 * @return void
	 */
	public void setTransmitLinkSpeed(Long transmitLinkSpeed) {
		this.transmitLinkSpeed = transmitLinkSpeed;
	}

	/**
	 * Get the receiveLinkSpeed.
	 * @return receiveLinkSpeed - the receiveLinkSpeed
	 */
	public Long getReceiveLinkSpeed() {
		return receiveLinkSpeed;
	}
	
	/**
	 * Set the receiveLinkSpeed.
	 * @param receiveLinkSpeed - the receiveLinkSpeed to set
	 * @return void
	 */
	public void setReceiveLinkSpeed(Long receiveLinkSpeed) {
		this.receiveLinkSpeed = receiveLinkSpeed;
	}
	
	/**
	 * Get the inOctets.
	 * @return inOctets - the inOctets
	 */
	public Long getInOctets() {
		return inOctets;
	}
	
	/**
	 * Set the inOctets.
	 * @param inOctets - the inOctets to set
	 * @return void
	 */
	public void setInOctets(Long inOctets) {
		this.inOctets = inOctets;
	}
	
	/**
	 * Get the inUcastPkts.
	 * @return inUcastPkts - the inUcastPkts
	 */
	public Long getInUcastPkts() {
		return inUcastPkts;
	}
	
	/**
	 * Set the inUcastPkts.
	 * @param inUcastPkts - the inUcastPkts to set
	 * @return void
	 */
	public void setInUcastPkts(Long inUcastPkts) {
		this.inUcastPkts = inUcastPkts;
	}
	
	/**
	 * Get the inNUcastPkts.
	 * @return inNUcastPkts - the inNUcastPkts
	 */
	public Long getInNUcastPkts() {
		return inNUcastPkts;
	}
	
	/**
	 * Set the inNUcastPkts.
	 * @param inNUcastPkts - the inNUcastPkts to set
	 * @return void
	 */
	public void setInNUcastPkts(Long inNUcastPkts) {
		this.inNUcastPkts = inNUcastPkts;
	}
	
	/**
	 * Get the inDiscards.
	 * @return inDiscards - the inDiscards
	 */
	public Long getInDiscards() {
		return inDiscards;
	}
	
	/**
	 * Set the inDiscards.
	 * @param inDiscards - the inDiscards to set
	 * @return void
	 */
	public void setInDiscards(Long inDiscards) {
		this.inDiscards = inDiscards;
	}
	
	/**
	 * Get the inErrors.
	 * @return inErrors - the inErrors
	 */
	public Long getInErrors() {
		return inErrors;
	}
	
	/**
	 * Set the inErrors.
	 * @param inErrors - the inErrors to set
	 * @return void
	 */
	public void setInErrors(Long inErrors) {
		this.inErrors = inErrors;
	}
	
	/**
	 * Get the inUnknownProtos.
	 * @return inUnknownProtos - the inUnknownProtos
	 */
	public Long getInUnknownProtos() {
		return inUnknownProtos;
	}
	
	/**
	 * Set the inUnknownProtos.
	 * @param inUnknownProtos - the inUnknownProtos to set
	 * @return void
	 */
	public void setInUnknownProtos(Long inUnknownProtos) {
		this.inUnknownProtos = inUnknownProtos;
	}
	
	/**
	 * Get the inUcastOctets.
	 * @return inUcastOctets - the inUcastOctets
	 */
	public Long getInUcastOctets() {
		return inUcastOctets;
	}
	
	/**
	 * Set the inUcastOctets.
	 * @param inUcastOctets - the inUcastOctets to set
	 * @return void
	 */
	public void setInUcastOctets(Long inUcastOctets) {
		this.inUcastOctets = inUcastOctets;
	}
	
	/**
	 * Get the inMulticastOctets.
	 * @return inMulticastOctets - the inMulticastOctets
	 */
	public Long getInMulticastOctets() {
		return inMulticastOctets;
	}
	
	/**
	 * Set the inMulticastOctets.
	 * @param inMulticastOctets - the inMulticastOctets to set
	 * @return void
	 */
	public void setInMulticastOctets(Long inMulticastOctets) {
		this.inMulticastOctets = inMulticastOctets;
	}
	
	/**
	 * Get the inBroadcastOctets.
	 * @return inBroadcastOctets - the inBroadcastOctets
	 */
	public Long getInBroadcastOctets() {
		return inBroadcastOctets;
	}
	
	/**
	 * Set the inBroadcastOctets.
	 * @param inBroadcastOctets - the inBroadcastOctets to set
	 * @return void
	 */
	public void setInBroadcastOctets(Long inBroadcastOctets) {
		this.inBroadcastOctets = inBroadcastOctets;
	}
	
	/**
	 * Get the outOctets.
	 * @return outOctets - the outOctets
	 */
	public Long getOutOctets() {
		return outOctets;
	}
	
	/**
	 * Set the outOctets.
	 * @param outOctets - the outOctets to set
	 * @return void
	 */
	public void setOutOctets(Long outOctets) {
		this.outOctets = outOctets;
	}
	
	/**
	 * Get the outUcastPkts.
	 * @return outUcastPkts - the outUcastPkts
	 */
	public Long getOutUcastPkts() {
		return outUcastPkts;
	}
	
	/**
	 * Set the outUcastPkts.
	 * @param outUcastPkts - the outUcastPkts to set
	 * @return void
	 */
	public void setOutUcastPkts(Long outUcastPkts) {
		this.outUcastPkts = outUcastPkts;
	}
	
	/**
	 * Get the outNUcastPkts.
	 * @return outNUcastPkts - the outNUcastPkts
	 */
	public Long getOutNUcastPkts() {
		return outNUcastPkts;
	}
	
	/**
	 * Set the outNUcastPkts.
	 * @param outNUcastPkts - the outNUcastPkts to set
	 * @return void
	 */
	public void setOutNUcastPkts(Long outNUcastPkts) {
		this.outNUcastPkts = outNUcastPkts;
	}
	
	/**
	 * Get the outDiscards.
	 * @return outDiscards - the outDiscards
	 */
	public Long getOutDiscards() {
		return outDiscards;
	}
	
	/**
	 * Set the outDiscards.
	 * @param outDiscards - the outDiscards to set
	 * @return void
	 */
	public void setOutDiscards(Long outDiscards) {
		this.outDiscards = outDiscards;
	}
	
	/**
	 * Get the outErrors.
	 * @return outErrors - the outErrors
	 */
	public Long getOutErrors() {
		return outErrors;
	}
	
	/**
	 * Set the outErrors.
	 * @param outErrors - the outErrors to set
	 * @return void
	 */
	public void setOutErrors(Long outErrors) {
		this.outErrors = outErrors;
	}
	
	/**
	 * Get the outUcastOctets.
	 * @return outUcastOctets - the outUcastOctets
	 */
	public Long getOutUcastOctets() {
		return outUcastOctets;
	}
	
	/**
	 * Set the outUcastOctets.
	 * @param outUcastOctets - the outUcastOctets to set
	 * @return void
	 */
	public void setOutUcastOctets(Long outUcastOctets) {
		this.outUcastOctets = outUcastOctets;
	}
	
	/**
	 * Get the outMulticastOctets.
	 * @return outMulticastOctets - the outMulticastOctets
	 */
	public Long getOutMulticastOctets() {
		return outMulticastOctets;
	}
	
	/**
	 * Set the outMulticastOctets.
	 * @param outMulticastOctets - the outMulticastOctets to set
	 * @return void
	 */
	public void setOutMulticastOctets(Long outMulticastOctets) {
		this.outMulticastOctets = outMulticastOctets;
	}
	
	/**
	 * Get the outBroadcastOctets.
	 * @return outBroadcastOctets - the outBroadcastOctets
	 */
	public Long getOutBroadcastOctets() {
		return outBroadcastOctets;
	}
	
	/**
	 * Set the outBroadcastOctets.
	 * @param outBroadcastOctets - the outBroadcastOctets to set
	 * @return void
	 */
	public void setOutBroadcastOctets(Long outBroadcastOctets) {
		this.outBroadcastOctets = outBroadcastOctets;
	}
	
	/**
	 * Get the outQLen.
	 * @return outQLen - the outQLen
	 */
	public Long getOutQLen() {
		return outQLen;
	}
	
	/**
	 * Set the outQLen.
	 * @param outQLen - the outQLen to set
	 * @return void
	 */
	public void setOutQLen(Long outQLen) {
		this.outQLen = outQLen;
	}

	/**
	 * Constructor for NetworkAdapterInfo.
	 */
	public NetworkAdapterInfo() {
		super();
	}	
}
