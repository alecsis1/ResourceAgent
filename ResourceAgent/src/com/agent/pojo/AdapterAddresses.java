package com.agent.pojo;

/**
 * AdapterAddresses contains the addresses of a specific adapter. Since an adapter can have multiple addresses,  each adapter will contain a list of this class.
 * 
 * @author alexandru.popescu
 */
public class AdapterAddresses {
	
	private String ipAddress; 
	private String subnetMask; 
	
	/**
	 * Get the ipAddress.
	 * @return ipAddress - the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	
	/**
	 * Set the ipAddress.
	 * @param ipAddress - the ipAddress to set
	 * @return void
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	/**
	 * Get the subnetMask.
	 * @return subnetMask - the subnetMask
	 */
	public String getSubnetMask() {
		return subnetMask;
	}
	
	/**
	 * Set the subnetMask.
	 * @param subnetMask - the subnetMask to set
	 * @return void
	 */
	public void setSubnetMask(String subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Constructor for AdapterAdresses.
	 */
	public AdapterAddresses() {
		super();
	}
	
	@Override
	public String toString() {
		return "ipAddress = " + this.ipAddress + " subnetMask = " + this.subnetMask;
	}
}
