package com.agent.pojo;

/**
 * The MemoryStatusInfo contains information about the memory used by the computer.
 * 
 * @author alexandru.popescu
 */
public class MemoryStatusInfo {
	/* 
	 	MEMORYSTATUSEX - https://msdn.microsoft.com/en-us/library/windows/desktop/aa366770%28v=vs.85%29.aspx

		MEMORYSTATUSEX reflects the state of memory at the time of the call. It also reflects the size of the paging file at that time. The operating system can enlarge the paging file up to the maximum size set by the administrator.

		The physical memory sizes returned include the memory from all nodes. 
	 */
	private Long memoryLoad; // A number between 0 and 100 that specifies the approximate percentage of physical memory that is in use (0 indicates no memory use and 100 indicates full memory use).
	private Long totalPhys; // The amount of actual physical memory, in bytes.
	private Long availPhys; // The amount of physical memory currently available, in bytes. This is the amount of physical memory that can be immediately reused without having to write its contents to disk first. It is the sum of the size of the standby, free, and zero lists.
	private Long totalPageFile; // The current committed memory limit for the system or the current process, whichever is smaller, in bytes. To get the system-wide committed memory limit, call GetPerformanceInfo. 
	private Long availPageFile; // The maximum amount of memory the current process can commit, in bytes. This value is equal to or smaller than the system-wide available commit value. To calculate the system-wide available commit value, call GetPerformanceInfo and subtract the value of CommitTotal from the value of CommitLimit.
	private Long totalVirtual; // The size of the user-mode portion of the virtual address space of the calling process, in bytes. This value depends on the type of process, the type of processor, and the configuration of the operating system. For example, this value is approximately 2 GB for most 32-bit processes on an x86 processor and approximately 3 GB for 32-bit processes that are large address aware running on a system with 4-gigabyte tuning enabled.
	private Long availVirtual; // The amount of unreserved and uncommitted memory currently in the user-mode portion of the virtual address space of the calling process, in bytes.
	
	// PERFORMACE_INFORMATION - https://msdn.microsoft.com/en-us/library/windows/desktop/ms684824%28v=vs.85%29.aspx
	private Long commitTotal; // The number of pages currently committed by the system. Note that committing pages (using VirtualAlloc with MEM_COMMIT) changes this value immediately; however, the physical memory is not charged until the pages are accessed.
	private Long commitLimit; // The current maximum number of pages that can be committed by the system without extending the paging file(s). This number can change if memory is added or deleted, or if pagefiles have grown, shrunk, or been added. If the paging file can be extended, this is a soft limit.
	private Long commitPeak; // The maximum number of pages that were simultaneously in the committed state since the last system reboot.
	private Long physicalTotal; // The amount of actual physical memory, in pages.
	private Long physicalAvailable; // The amount of physical memory currently available, in pages. This is the amount of physical memory that can be immediately reused without having to write its contents to disk first. It is the sum of the size of the standby, free, and zero lists.
	private Long systemCache; // The amount of system cache memory, in pages. This is the size of the standby list plus the system working set.
	private Long kernelTotal; // The sum of the memory currently in the paged and nonpaged kernel pools, in pages.
	private Long kernelPaged; // The memory currently in the paged kernel pool, in pages.
	private Long kernelNonpaged; // The memory currently in the nonpaged kernel pool, in pages.
	private Long pageSize; // The size of a page, in bytes.
	private Long handleCount; // The current number of open handles.
	private Long processCount; // The current number of processes.
	private Long threadCount; // The current number of threads.
	
	/*
	 	GetSystemDEPPolicy - https://msdn.microsoft.com/en-us/library/windows/desktop/bb736298%28v=vs.85%29.aspx
	 	
	 	AlwaysOff = 0 (DEP is disabled for all parts of the system, regardless of hardware support for DEP. The processor runs in PAE mode with 32-bit versions of Windows unless PAE is disabled in the boot configuration data.)
	 	AlwaysOn = 1 (DEP is enabled for all parts of the system. All processes always run with DEP enabled. DEP cannot be explicitly disabled for selected applications. System compatibility fixes are ignored.)
	 	OptIn = 2 (On systems with processors that are capable of hardware-enforced DEP, DEP is automatically enabled only for operating system components. This is the default setting for client versions of Windows. DEP can be explicitly enabled for selected applications or the current process.)
	 	OptOut = 3 (DEP is automatically enabled for operating system components and all processes. This is the default setting for Windows Server versions. DEP can be explicitly disabled for selected applications or the current process. System compatibility fixes for DEP are in effect.)
	 	
	 	
	 	The system-wide DEP policy is configured at boot time according to the policy setting in the boot configuration data. To change the system-wide DEP policy setting, use the BCDEdit /set command to set the nx boot entry option.
		If the system DEP policy is OptIn or OptOut, DEP can be selectively enabled or disabled for the current process by calling the SetProcessDEPPolicy function. This function works only for 32-bit processes.
		A user with administrative privileges can disable DEP for selected applications by using the System Control Panel application. If the system DEP policy is OptOut, DEP is disabled for these applications.
		The Application Compatibility Toolkit can be used to create a list of individual applications that are exempt from DEP. If the system DEP policy is OptOut, DEP is automatically disabled for applications on the list. 
	 */
	private Integer depSettingPolicyType; // GetSystemDEPPolicy - https://msdn.microsoft.com/en-us/library/windows/desktop/bb736298%28v=vs.85%29.aspx
	
	/*
	 	GetPhysicallyInstalledSystemMemory - https://msdn.microsoft.com/en-us/library/windows/desktop/cc300158%28v=vs.85%29.aspx
	 	
	 	The GetPhysicallyInstalledSystemMemory function retrieves the amount of physically installed RAM from the computer's SMBIOS firmware tables. This can differ from the amount reported by the GlobalMemoryStatusEx function, which sets the ullTotalPhys member of the MEMORYSTATUSEX structure to the amount of physical memory that is available for the operating system to use. The amount of memory available to the operating system can be less than the amount of memory physically installed in the computer because the BIOS and some drivers may reserve memory as I/O regions for memory-mapped devices, making the memory unavailable to the operating system and applications.
		The amount of physical memory retrieved by the GetPhysicallyInstalledSystemMemory function must be equal to or greater than the amount reported by the GlobalMemoryStatusEx function; if it is less, the SMBIOS data is malformed and the function fails with ERROR_INVALID_DATA. Malformed SMBIOS data may indicate a problem with the user's computer. 
	 */
	private Long installedMemory;

	/**
	 * Get the memoryLoad.
	 * @return memoryLoad - the memoryLoad
	 */
	public Long getMemoryLoad() {
		return memoryLoad;
	}

	/**
	 * Set the memoryLoad.
	 * @param memoryLoad - the memoryLoad to set
	 * @return void
	 */
	public void setMemoryLoad(Long memoryLoad) {
		this.memoryLoad = memoryLoad;
	}

	/**
	 * Get the totalPhys.
	 * @return totalPhys - the totalPhys
	 */
	public Long getTotalPhys() {
		return totalPhys;
	}

	/**
	 * Set the totalPhys.
	 * @param totalPhys - the totalPhys to set
	 * @return void
	 */
	public void setTotalPhys(Long totalPhys) {
		this.totalPhys = totalPhys;
	}

	/**
	 * Get the availPhys.
	 * @return availPhys - the availPhys
	 */
	public Long getAvailPhys() {
		return availPhys;
	}

	/**
	 * Set the availPhys.
	 * @param availPhys - the availPhys to set
	 * @return void
	 */
	public void setAvailPhys(Long availPhys) {
		this.availPhys = availPhys;
	}

	/**
	 * Get the totalPageFile.
	 * @return totalPageFile - the totalPageFile
	 */
	public Long getTotalPageFile() {
		return totalPageFile;
	}

	/**
	 * Set the totalPageFile.
	 * @param totalPageFile - the totalPageFile to set
	 * @return void
	 */
	public void setTotalPageFile(Long totalPageFile) {
		this.totalPageFile = totalPageFile;
	}

	/**
	 * Get the availPageFile.
	 * @return availPageFile - the availPageFile
	 */
	public Long getAvailPageFile() {
		return availPageFile;
	}

	/**
	 * Set the availPageFile.
	 * @param availPageFile - the availPageFile to set
	 * @return void
	 */
	public void setAvailPageFile(Long availPageFile) {
		this.availPageFile = availPageFile;
	}

	/**
	 * Get the totalVirtual.
	 * @return totalVirtual - the totalVirtual
	 */
	public Long getTotalVirtual() {
		return totalVirtual;
	}

	/**
	 * Set the totalVirtual.
	 * @param totalVirtual - the totalVirtual to set
	 * @return void
	 */
	public void setTotalVirtual(Long totalVirtual) {
		this.totalVirtual = totalVirtual;
	}

	/**
	 * Get the availVirtual.
	 * @return availVirtual - the availVirtual
	 */
	public Long getAvailVirtual() {
		return availVirtual;
	}

	/**
	 * Set the availVirtual.
	 * @param availVirtual - the availVirtual to set
	 * @return void
	 */
	public void setAvailVirtual(Long availVirtual) {
		this.availVirtual = availVirtual;
	}

	/**
	 * Get the commitTotal.
	 * @return commitTotal - the commitTotal
	 */
	public Long getCommitTotal() {
		return commitTotal;
	}

	/**
	 * Set the commitTotal.
	 * @param commitTotal - the commitTotal to set
	 * @return void
	 */
	public void setCommitTotal(Long commitTotal) {
		this.commitTotal = commitTotal;
	}

	/**
	 * Get the commitLimit.
	 * @return commitLimit - the commitLimit
	 */
	public Long getCommitLimit() {
		return commitLimit;
	}

	/**
	 * Set the commitLimit.
	 * @param commitLimit - the commitLimit to set
	 * @return void
	 */
	public void setCommitLimit(Long commitLimit) {
		this.commitLimit = commitLimit;
	}

	/**
	 * Get the commitPeak.
	 * @return commitPeak - the commitPeak
	 */
	public Long getCommitPeak() {
		return commitPeak;
	}

	/**
	 * Set the commitPeak.
	 * @param commitPeak - the commitPeak to set
	 * @return void
	 */
	public void setCommitPeak(Long commitPeak) {
		this.commitPeak = commitPeak;
	}

	/**
	 * Get the physicalTotal.
	 * @return physicalTotal - the physicalTotal
	 */
	public Long getPhysicalTotal() {
		return physicalTotal;
	}

	/**
	 * Set the physicalTotal.
	 * @param physicalTotal - the physicalTotal to set
	 * @return void
	 */
	public void setPhysicalTotal(Long physicalTotal) {
		this.physicalTotal = physicalTotal;
	}

	/**
	 * Get the physicalAvailable.
	 * @return physicalAvailable - the physicalAvailable
	 */
	public Long getPhysicalAvailable() {
		return physicalAvailable;
	}

	/**
	 * Set the physicalAvailable.
	 * @param physicalAvailable - the physicalAvailable to set
	 * @return void
	 */
	public void setPhysicalAvailable(Long physicalAvailable) {
		this.physicalAvailable = physicalAvailable;
	}

	/**
	 * Get the systemCache.
	 * @return systemCache - the systemCache
	 */
	public Long getSystemCache() {
		return systemCache;
	}

	/**
	 * Set the systemCache.
	 * @param systemCache - the systemCache to set
	 * @return void
	 */
	public void setSystemCache(Long systemCache) {
		this.systemCache = systemCache;
	}

	/**
	 * Get the kernelTotal.
	 * @return kernelTotal - the kernelTotal
	 */
	public Long getKernelTotal() {
		return kernelTotal;
	}

	/**
	 * Set the kernelTotal.
	 * @param kernelTotal - the kernelTotal to set
	 * @return void
	 */
	public void setKernelTotal(Long kernelTotal) {
		this.kernelTotal = kernelTotal;
	}

	/**
	 * Get the kernelPaged.
	 * @return kernelPaged - the kernelPaged
	 */
	public Long getKernelPaged() {
		return kernelPaged;
	}

	/**
	 * Set the kernelPaged.
	 * @param kernelPaged - the kernelPaged to set
	 * @return void
	 */
	public void setKernelPaged(Long kernelPaged) {
		this.kernelPaged = kernelPaged;
	}

	/**
	 * Get the kernelNonpaged.
	 * @return kernelNonpaged - the kernelNonpaged
	 */
	public Long getKernelNonpaged() {
		return kernelNonpaged;
	}

	/**
	 * Set the kernelNonpaged.
	 * @param kernelNonpaged - the kernelNonpaged to set
	 * @return void
	 */
	public void setKernelNonpaged(Long kernelNonpaged) {
		this.kernelNonpaged = kernelNonpaged;
	}

	/**
	 * Get the pageSize.
	 * @return pageSize - the pageSize
	 */
	public Long getPageSize() {
		return pageSize;
	}

	/**
	 * Set the pageSize.
	 * @param pageSize - the pageSize to set
	 * @return void
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * Get the handleCount.
	 * @return handleCount - the handleCount
	 */
	public Long getHandleCount() {
		return handleCount;
	}

	/**
	 * Set the handleCount.
	 * @param handleCount - the handleCount to set
	 * @return void
	 */
	public void setHandleCount(Long handleCount) {
		this.handleCount = handleCount;
	}

	/**
	 * Get the processCount.
	 * @return processCount - the processCount
	 */
	public Long getProcessCount() {
		return processCount;
	}

	/**
	 * Set the processCount.
	 * @param processCount - the processCount to set
	 * @return void
	 */
	public void setProcessCount(Long processCount) {
		this.processCount = processCount;
	}

	/**
	 * Get the threadCount.
	 * @return threadCount - the threadCount
	 */
	public Long getThreadCount() {
		return threadCount;
	}

	/**
	 * Set the threadCount.
	 * @param threadCount - the threadCount to set
	 * @return void
	 */
	public void setThreadCount(Long threadCount) {
		this.threadCount = threadCount;
	}

	/**
	 * Get the depSettingPolicyType.
	 * @return depSettingPolicyType - the depSettingPolicyType
	 */
	public Integer getDepSettingPolicyType() {
		return depSettingPolicyType;
	}

	/**
	 * Set the depSettingPolicyType.
	 * @param depSettingPolicyType - the depSettingPolicyType to set
	 * @return void
	 */
	public void setDepSettingPolicyType(Integer depSettingPolicyType) {
		this.depSettingPolicyType = depSettingPolicyType;
	}

	/**
	 * Get the installedMemory.
	 * @return installedMemory - the installedMemory
	 */
	public Long getInstalledMemory() {
		return installedMemory;
	}

	/**
	 * Set the installedMemory.
	 * Set the installedMemory;
	 * @param installedMemory - the installedMemory to set
	 * @return void
	 */
	public void setInstalledMemory(Long installedMemory) {
		this.installedMemory = installedMemory;
	}

	/**
	 * Constructor for MemoryStatusInfo.
	 */
	public MemoryStatusInfo() {
		super();
	}
}
