package com.agent.pojo;

import java.util.List;
/**
 * The Resources class.
 * @author alexandru.popescu
 */
public class Resources {
	
	private List<NetworkAdapterInfo> listNetworkAdapterInfo;
	private MemoryStatusInfo memoryStatusInfo;
	private ProcessorInfo processorInfo;
	private List<Process> processes;
	
	/**
	 * Get the listNetworkAdapterInfo.
	 * @return listNetworkAdapterInfo - the listNetworkAdapterInfo
	 */
	public List<NetworkAdapterInfo> getListNetworkAdapterInfo() {
		return listNetworkAdapterInfo;
	}
	
	/**
	 * Set the listNetworkAdapterInfo.
	 * @param listNetworkAdapterInfo - the listNetworkAdapterInfo to set
	 * @return void
	 */
	public void setListNetworkAdapterInfo(
			List<NetworkAdapterInfo> listNetworkAdapterInfo) {
		this.listNetworkAdapterInfo = listNetworkAdapterInfo;
	}
	
	/**
	 * Get the memoryStatusInfo.
	 * @return memoryStatusInfo - the memoryStatusInfo
	 */
	public MemoryStatusInfo getMemoryStatusInfo() {
		return memoryStatusInfo;
	}
	
	/**
	 * Set the memoryStatusInfo.
	 * @param memoryStatusInfo - the memoryStatusInfo to set
	 * @return void
	 */
	public void setMemoryStatusInfo(MemoryStatusInfo memoryStatusInfo) {
		this.memoryStatusInfo = memoryStatusInfo;
	}
	
	/**
	 * Get the processorInfo.
	 * @return processorInfo - the processorInfo
	 */
	public ProcessorInfo getProcessorInfo() {
		return processorInfo;
	}

	/**
	 * Set the processorInfo.
	 * @param processorInfo - the processorInfo to set
	 * @return void
	 */
	public void setProcessorInfo(ProcessorInfo processorInfo) {
		this.processorInfo = processorInfo;
	}
	
	/**
	 * Get the list of processes.
	 * @return processes - the list of processes
	 */
	public List<Process> getProcesses() {
		return processes;
	}

	/**
	 * Set the list of processes.
	 * @param processes - the list of processes the processes to set
	 * @return void
	 */
	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}

	/**
	 * Constructor for Resources.
	 */
	public Resources() {
		super();
	}
}
