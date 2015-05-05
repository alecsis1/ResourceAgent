package com.agent.pojo;

import java.util.List;

/**
 * The ProcessorInfo contains information about the processor used by the computer.
 * 
 * @author alexandru.popescu
 */
public class ProcessorInfo {
	
	/*
	 * % C1 Time is the percentage of time the processor spends in the C1 low-power idle state. % C1 Time is a subset of the total processor idle time. C1 low-power idle state enables the processor to maintain its entire context and quickly return to the running state. Not all systems support the % C1 state.
	 */
	private Double c1Time;
	
	/*
	 * % C2 Time is the percentage of time the processor spends in the C2 low-power idle state. % C2 Time is a subset of the total processor idle time. C2 low-power idle state enables the processor to maintain the context of the system caches. The C2 power state is a lower power and higher exit latency state than C1. Not all systems support the C2 state.
	 */
	private Double c2Time;
	
	/*
	 * % C3 Time is the percentage of time the processor spends in the C3 low-power idle state. % C3 Time is a subset of the total processor idle time. When the processor is in the C3 low-power idle state it is unable to maintain the coherency of its caches. The C3 power state is a lower power and higher exit latency state than C2. Not all systems support the C3 state.
	 */
	private Double c3Time;
	
	/*
	 * % DPC Time is the percentage of time that the processor spent receiving and servicing deferred procedure calls (DPCs) during the sample interval. DPCs are interrupts that run at a lower priority than standard interrupts. % DPC Time is a component of % Privileged Time because DPCs are executed in privileged mode. They are counted separately and are not a component of the interrupt counters. This counter displays the average busy time as a percentage of the sample time.
	 */
	private Double dpcTime;
	
	/*
	 * % Idle Time is the percentage of time the processor is idle during the sample interval
	 */
	private Double idleTime;
	
	/*
	 * % Interrupt Time is the time the processor spends receiving and servicing hardware interrupts during sample intervals. This value is an indirect indicator of the activity of devices that generate interrupts, such as the system clock, the mouse, disk drivers, data communication lines, network interface cards and other peripheral devices. These devices normally interrupt the processor when they have completed a task or require attention. Normal thread execution is suspended during interrupts. Most system clocks interrupt the processor every 10 milliseconds, creating a background of interrupt activity. suspends normal thread execution during interrupts. This counter displays the average busy time as a percentage of the sample time.
	 */
	private Double interruptTime;
	
	/*
	 * % Privileged Time is the percentage of elapsed time that the process threads spent executing code in privileged mode.  When a Windows system service in called, the service will often run in privileged mode to gain access to system-private data. Such data is protected from access by threads executing in user mode. Calls to the system can be explicit or implicit, such as page faults or interrupts. Unlike some early operating systems, Windows uses process boundaries for subsystem protection in addition to the traditional protection of user and privileged modes. Some work done by Windows on behalf of the application might appear in other subsystem processes in addition to the privileged time in the process.
	 */
	private Double privilegedTime;
	
	/*
	 * % Processor Time is the percentage of elapsed time that the processor spends to execute a non-Idle thread. It is calculated by measuring the percentage of time that the processor spends executing the idle thread and then subtracting that value from 100%. (Each processor has an idle thread that consumes cycles when no other threads are ready to run). This counter is the primary indicator of processor activity, and displays the average percentage of busy time observed during the sample interval. It should be noted that the accounting calculation of whether the processor is idle is performed at an internal sampling interval of the system clock (10ms). On todays fast processors, % Processor Time can therefore underestimate the processor utilization as the processor may be spending a lot of time servicing threads between the system clock sampling interval. Workload based timer applications are one example  of applications  which are more likely to be measured inaccurately as timers are signaled just after the sample is taken.
	 */
	private Double processorTime;
	
	/*
	 * % User Time is the percentage of elapsed time the processor spends in the user mode. User mode is a restricted processing mode designed for applications, environment subsystems, and integral subsystems.  The alternative, privileged mode, is designed for operating system components and allows direct access to hardware and all memory.  The operating system switches application threads to privileged mode to access operating system services. This counter displays the average busy time as a percentage of the sample time.
	 */
	private Double userTime;
	
	/*
	 * C1 Transitions/sec is the rate that the CPU enters the C1 low-power idle state. The CPU enters the C1 state when it is sufficiently idle and exits this state on any interrupt. This counter displays the difference between the values observed in the last two samples, divided by the duration of the sample interval.
	 */
	private Double c1TransitionsPerSec;
	
	/*
	 * C2 Transitions/sec is the rate that the CPU enters the C2 low-power idle state. The CPU enters the C2 state when it is sufficiently idle and exits this state on any interrupt. This counter displays the difference between the values observed in the last two samples, divided by the duration of the sample interval.
	 */
	private Double c2TransitionsPerSec;
	
	/*
	 * C3 Transitions/sec is the rate that the CPU enters the C3 low-power idle state. The CPU enters the C3 state when it is sufficiently idle and exits this state on any interrupt. This counter displays the difference between the values observed in the last two samples, divided by the duration of the sample interval.
	 */
	private Double c3TransitionsPerSec;
	
	/*
	 * DPC Rate is the rate at which deferred procedure calls (DPCs) were added to the processors DPC queues between the timer ticks of the processor clock. DPCs are interrupts that run at alower priority than standard interrupts.  Each processor has its own DPC queue. This counter measures the rate that DPCs were added to the queue, not the number of DPCs in the queue. This counter displays the last observed value only; it is not an average.
	 */
	private Double dpcRate;
	
	/*
	 * DPCs Queued/sec is the average rate, in incidents per second, at which deferred procedure calls (DPCs) were added to the processor's DPC queue. DPCs are interrupts that run at a lower priority than standard interrupts.  Each processor has its own DPC queue. This counter measures the rate that DPCs are added to the queue, not the number of DPCs in the queue.  This counter displays the difference between the values observed in the last two samples, divided by the duration of the sample interval.
	 */
	private Double dpcsQueuedPerSec;
	
	/*
	 * Interrupts/sec is the average rate, in incidents per second, at which the processor received and serviced hardware interrupts. It does not include deferred procedure calls (DPCs), which are counted separately. This value is an indirect indicator of the activity of devices that generate interrupts, such as the system clock, the mouse, disk drivers, data communication lines, network interface cards, and other peripheral devices. These devices normally interrupt the processor when they have completed a task or require attention. Normal thread execution is suspended. The system clock typically interrupts the processor every 10 milliseconds, creating a background of interrupt activity. This counter displays the difference between the values observed in the last two samples, divided by the duration of the sample interval.
	 */
	private Double interruptsPerSec;
	
	private Long noOfCores;
	private List<CoreInfo> listCoresInfo;

	/**
	 * @return the c1Time
	 */
	public Double getC1Time() {
		return c1Time;
	}
	
	/**
	 * @param c1Time the c1Time to set
	 */
	public void setC1Time(Double c1Time) {
		this.c1Time = c1Time;
	}

	/**
	 * @return the c2Time
	 */
	public Double getC2Time() {
		return c2Time;
	}

	/**
	 * @param c2Time the c2Time to set
	 */
	public void setC2Time(Double c2Time) {
		this.c2Time = c2Time;
	}

	/**
	 * @return the c3Time
	 */
	public Double getC3Time() {
		return c3Time;
	}

	/**
	 * @param c3Time the c3Time to set
	 */
	public void setC3Time(Double c3Time) {
		this.c3Time = c3Time;
	}

	/**
	 * @return the dpcTime
	 */
	public Double getDpcTime() {
		return dpcTime;
	}

	/**
	 * @param dpcTime the dpcTime to set
	 */
	public void setDpcTime(Double dpcTime) {
		this.dpcTime = dpcTime;
	}

	/**
	 * @return the idle
	 */
	public Double getIdleTime() {
		return idleTime;
	}

	/**
	 * @param idle the idle to set
	 */
	public void setIdleTime(Double idleTime) {
		this.idleTime = idleTime;
	}

	/**
	 * @return the interruptTime
	 */
	public Double getInterruptTime() {
		return interruptTime;
	}

	/**
	 * @param interruptTime the interruptTime to set
	 */
	public void setInterruptTime(Double interruptTime) {
		this.interruptTime = interruptTime;
	}

	/**
	 * @return the privilegedTime
	 */
	public Double getPrivilegedTime() {
		return privilegedTime;
	}

	/**
	 * @param privilegedTime the privilegedTime to set
	 */
	public void setPrivilegedTime(Double privilegedTime) {
		this.privilegedTime = privilegedTime;
	}

	/**
	 * @return the cpuTime
	 */
	public Double getProcessorTime() {
		return processorTime;
	}

	/**
	 * @param cpuTime the cpuTime to set
	 */
	public void setProcessorTime(Double processorTime) {
		this.processorTime = processorTime;
	}

	/**
	 * @return the userTime
	 */
	public Double getUserTime() {
		return userTime;
	}

	/**
	 * @param userTime the userTime to set
	 */
	public void setUserTime(Double userTime) {
		this.userTime = userTime;
	}

	/**
	 * @return the c1TransitionsPerSec
	 */
	public Double getC1TransitionsPerSec() {
		return c1TransitionsPerSec;
	}

	/**
	 * @param c1TransitionsPerSec the c1TransitionsPerSec to set
	 */
	public void setC1TransitionsPerSec(Double c1TransitionsPerSec) {
		this.c1TransitionsPerSec = c1TransitionsPerSec;
	}

	/**
	 * @return the c2TransitionsPerSec
	 */
	public Double getC2TransitionsPerSec() {
		return c2TransitionsPerSec;
	}

	/**
	 * @param c2TransitionsPerSec the c2TransitionsPerSec to set
	 */
	public void setC2TransitionsPerSec(Double c2TransitionsPerSec) {
		this.c2TransitionsPerSec = c2TransitionsPerSec;
	}

	/**
	 * @return the c3TransitionsPerSec
	 */
	public Double getC3TransitionsPerSec() {
		return c3TransitionsPerSec;
	}

	/**
	 * @param c3TransitionsPerSec the c3TransitionsPerSec to set
	 */
	public void setC3TransitionsPerSec(Double c3TransitionsPerSec) {
		this.c3TransitionsPerSec = c3TransitionsPerSec;
	}

	/**
	 * @return the dpcRate
	 */
	public Double getDpcRate() {
		return dpcRate;
	}

	/**
	 * @param dpcRate the dpcRate to set
	 */
	public void setDpcRate(Double dpcRate) {
		this.dpcRate = dpcRate;
	}

	/**
	 * @return the dpcsQueuedPerSec
	 */
	public Double getDpcsQueuedPerSec() {
		return dpcsQueuedPerSec;
	}

	/**
	 * @param dpcsQueuedPerSec the dpcsQueuedPerSec to set
	 */
	public void setDpcsQueuedPerSec(Double dpcsQueuedPerSec) {
		this.dpcsQueuedPerSec = dpcsQueuedPerSec;
	}

	/**
	 * @return the interruptsPerSec
	 */
	public Double getInterruptsPerSec() {
		return interruptsPerSec;
	}

	/**
	 * @param interruptsPerSec the interruptsPerSec to set
	 */
	public void setInterruptsPerSec(Double interruptsPerSec) {
		this.interruptsPerSec = interruptsPerSec;
	}

	/**
	 * @return the noOfCores
	 */
	public Long getNoOfCores() {
		return noOfCores;
	}

	/**
	 * @param noOfCores the noOfCores to set
	 */
	public void setNoOfCores(Long noOfCores) {
		this.noOfCores = noOfCores;
	}

	/**
	 * @return the listCoresTime
	 */
	public List<CoreInfo> getListCoresInfo() {
		return listCoresInfo;
	}

	/**
	 * @param listCoresInfo the listCoresTime to set
	 */
	public void setListCoresInfo(List<CoreInfo> listCoresInfo) {
		this.listCoresInfo = listCoresInfo;
	}

	/**
	 * Constructor for ProcessorInfo.
	 */
	public ProcessorInfo() {
		super();
	}
}
