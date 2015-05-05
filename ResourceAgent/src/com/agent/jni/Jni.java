package com.agent.jni;

import com.agent.pojo.Resources;
/**
 * The Jni class is used to integrate with the dll specially designed to get the resources of the computer.
 * 
 * @author alexandru.popescu
 */
public class Jni {
	
	private static volatile Jni instance;
	
	/**
	 * Load the GetComputerResourcesLibrary.dll .
	 */
	static{
		System.loadLibrary("GetComputerResourcesLibrary");
	}
	
	/**
	 * Private constructor for singleton.
	 */
	private Jni(){}
	
	/**
	 * Method used to get the instance of the Jni - singleton
	 * 
	 * @return the instance of the Jni
	 */
	public static synchronized Jni getInstance(){
		if(instance == null){
			instance = new Jni();
		}
		return instance;
	}
	
	/**
	 * Native method that returns the resources of the computer.
	 * 
	 * @return listNetworkAdapterInfo - the listNetworkAdapterInfo
	 */
	public native Resources getComputerResources();
	
}
