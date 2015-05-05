package com.agent.jni;

import java.util.List;

import com.agent.pojo.MemoryStatusInfo;
import com.agent.pojo.NetworkAdapterInfo;
import com.agent.pojo.Resources;

public class Main {

	public static void main(String[] args) {
		/*
		String hostname = "Unknown";

		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    String nume = addr.getCanonicalHostName();
		    hostname = addr.getHostName();
		    System.out.println("Hostname: " + hostname);
		    
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		*/
		int i = 0;
		while(i < 1){
			Jni jni = Jni.getInstance();
			Resources res = jni.getComputerResources();
			
			List<NetworkAdapterInfo> listNAI = res.getListNetworkAdapterInfo();
			
			for(NetworkAdapterInfo nai : listNAI){
				
				System.out.println("IP_ADAPTER_INFO");
				System.out.println("ComboIndex: "+nai.getComboIndex());
				System.out.println("AdapterName: "+nai.getAdapterName());
				System.out.println("Description: "+nai.getDescription());
				System.out.println("Mac: "+nai.getMac());
				System.out.println("Index: "+nai.getIndex());
				System.out.println("AdaptorType: "+nai.getAdaptorType());
				System.out.println("DhcpEnabled: "+nai.getDhcpEnabled());
				System.out.println("HaveWins: "+nai.getHaveWins());
				System.out.println("DhcpServer: " + nai.getDhcpServer());
				System.out.println("IpAddress: " + nai.getIpAddress());
				System.out.println("Gateway: " + nai.getGateway());
				System.out.println("PrimaryWinsServerIpAddress: " + nai.getPrimaryWinsServerIpAddress());
				System.out.println("SecondaryWinsServerIpAddress: " + nai.getSecondaryWinsServerIpAddress());
				
				System.out.println("MIB_IF_ROW2");
				System.out.println("InterfaceLuid: "+nai.getInterfaceLuid());
				System.out.println("Alias: "+nai.getAlias());
				System.out.println("Mtu: "+nai.getMtu());
				System.out.println("InterfaceType: "+nai.getInterfaceType());
				System.out.println("TunnelType: "+nai.getTunnelType());
				System.out.println("MediaType: "+nai.getMediaType());
				System.out.println("PhysicalMediumType: "+nai.getPhysicalMediumType());
				System.out.println("AccessType: "+nai.getAccessType());
				System.out.println("DirectionType: "+nai.getDirectionType());
				System.out.println("HardwareInterface: "+nai.getHardwareInterface());
				System.out.println("FilterInterface: "+nai.getFilterInterface());
				System.out.println("ConnectorPresent: "+nai.getConnectorPresent());
				System.out.println("NotAuthenticated: "+nai.getNotAuthenticated());
				System.out.println("NotMediaConnected: "+nai.getNotMediaConnected());
				System.out.println("Paused: "+nai.getPaused());
				System.out.println("LowPower: "+nai.getLowPower());
				System.out.println("EndPointInterface: "+nai.getEndPointInterface());
				System.out.println("OperStatus: "+nai.getOperStatus());
				System.out.println("AdminStatus: "+nai.getAdminStatus());
				System.out.println("MediaConnectState: "+nai.getMediaConnectState());
				System.out.println("NetworkGuid: "+nai.getNetworkGuid());
				System.out.println("ConnectionType: "+nai.getConnectionType());
				System.out.println("TransmitLinkSpeed: "+nai.getTransmitLinkSpeed());
				System.out.println("ReceiveLinkSpeed: "+nai.getReceiveLinkSpeed());
				System.out.println("InOctets: "+nai.getInOctets());
				System.out.println("InUcastPkts: "+nai.getInUcastPkts());
				System.out.println("InNUcastPkts: "+nai.getInNUcastPkts());
				System.out.println("InDiscards: "+nai.getInDiscards());
				System.out.println("InErrors: "+nai.getInErrors());
				System.out.println("InUnknownProtos: "+nai.getInUnknownProtos());
				System.out.println("InUcastOctets: "+nai.getInUcastOctets());
				System.out.println("InMulticastOctets: "+nai.getInMulticastOctets());
				System.out.println("InBroadcastOctets: "+nai.getInBroadcastOctets());
				System.out.println("OutOctets: "+nai.getOutOctets());
				System.out.println("OutUcastPkts: "+nai.getOutUcastPkts());
				System.out.println("OutNUcastPkts: "+nai.getOutNUcastPkts());
				System.out.println("OutDiscards: "+nai.getOutDiscards());
				System.out.println("OutErrors: "+nai.getOutErrors());
				System.out.println("OutUcastOctets: "+nai.getOutUcastOctets());
				System.out.println("OutMulticastOctets: "+nai.getOutMulticastOctets());
				System.out.println("OutBroadcastOctets: "+nai.getOutBroadcastOctets());
				System.out.println("OutQLen: "+nai.getOutQLen());
				System.out.println("----------------------------------------------------------");
			}
			
			MemoryStatusInfo info = res.getMemoryStatusInfo();
			
			System.out.println("MEMORYSTATUSEX");
			System.out.println("MemoryLoad: "+info.getMemoryLoad());
			System.out.println("TotalPhys: "+info.getTotalPhys());
			System.out.println("AvailPhys: "+info.getAvailPhys());
			System.out.println("TotalPageFile: "+info.getTotalPageFile());
			System.out.println("AvailPageFile: "+info.getAvailPageFile());
			System.out.println("TotalVirtual: "+info.getTotalVirtual());
			System.out.println("AvailVirtual: "+info.getAvailVirtual());
			
			System.out.println("PERFORMACE_INFORMATION");
			System.out.println("CommitTotal: "+info.getCommitTotal());
			System.out.println("CommitLimit: "+info.getCommitLimit());
			System.out.println("CommitPeak: "+info.getCommitPeak());
			System.out.println("PhysicalTotal: "+info.getPhysicalTotal());
			System.out.println("PhysicalAvailable: "+info.getPhysicalAvailable());
			System.out.println("SystemCache: "+info.getSystemCache());
			System.out.println("KernelTotal: "+info.getKernelTotal());
			System.out.println("KernelPaged: "+info.getKernelPaged());
			System.out.println("KernelNonpaged: "+info.getKernelNonpaged());
			System.out.println("PageSize: "+info.getPageSize());
			System.out.println("HandleCount: "+info.getHandleCount());
			System.out.println("ProcessCount: "+info.getProcessCount());
			System.out.println("ThreadCount: "+info.getThreadCount());
			
			System.out.println("DepSettingPolicyType: "+info.getDepSettingPolicyType());
			System.out.println("InstalledMemory: "+info.getInstalledMemory());
			System.out.println("----------------------------------------------------------");
			System.out.println("**********************************************************");
			i++;
		}
		 
	}
}
