package com.example.myremains.bean;

import java.io.Serializable;


public class NewDevice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 手机网络类型
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_GPRS = 1;
    public static final int NETWORK_TYPE_EDGE = 2;
    public static final int NETWORK_TYPE_UMTS = 3;
    public static final int NETWORK_TYPE_CDMA = 4;
    public static final int NETWORK_TYPE_EVDO_0 = 5;
    public static final int NETWORK_TYPE_EVDO_A = 6;
    public static final int NETWORK_TYPE_1xRTT = 7;
    public static final int NETWORK_TYPE_HSDPA = 8;
    public static final int NETWORK_TYPE_HSUPA = 9;
    public static final int NETWORK_TYPE_HSPA = 10;
    public static final int NETWORK_TYPE_IDEN = 11;
    public static final int NETWORK_TYPE_EVDO_B = 12;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    
    // 网络连接类型
    public static final int TYPE_NONE        = -1;
    public static final int TYPE_MOBILE      = 0;
    public static final int TYPE_WIFI        = 1;
    public static final int TYPE_MOBILE_MMS  = 2;
    public static final int TYPE_MOBILE_SUPL = 3;
    public static final int TYPE_MOBILE_DUN  = 4;
    public static final int TYPE_MOBILE_HIPRI = 5;
    public static final int TYPE_WIMAX       = 6;
    public static final int TYPE_BLUETOOTH   = 7;
    public static final int TYPE_DUMMY       = 8;
    public static final int TYPE_ETHERNET    = 9;
    public static final int TYPE_MOBILE_FOTA = 10;
    public static final int TYPE_MOBILE_IMS  = 11;
    public static final int TYPE_MOBILE_CBS  = 12;
    public static final int TYPE_WIFI_P2P    = 13;
    
    public static final String NAME_WIFI    = "WIFI";
    public static final String NAME_MOBILE    = "MOBILE";
	
	public int deviceId;
	
	public String imei;
	public String imsi;
	public String phonenum;
	public String ip;
	public String mac;
	public String bssid;
	public String ssid;
	public String deviceModel;
	public String osversion;
	public int sdkLevel;
	public int height;
	public int width;
	
	public int phoneNetType;
	public int connectNetType;
	public String netTypeName;
	
	public String softwarVersion;
	public String networkOpt;
	public String networkOptName;
	public String simOpt;
	public String simSerialNum;
	public String cpuAbi;
	public String cpuAbi2;
	public String brand;
	public String board;
	public String hardWare;
	public String device;
	public String display;
	public String buildId;
	public String manufacture;
	public String product;
	public String serail;
	public long time;
	public String anroidId;
	@Override
	public String toString() {
		return "NewDevice [deviceId=" + deviceId + ", imei=" + imei + ", imsi=" + imsi + ", phonenum=" + phonenum
				+ ", ip=" + ip + ", mac=" + mac + ", bssid=" + bssid + ", ssid=" + ssid + ", deviceModel="
				+ deviceModel + ", osversion=" + osversion + ", sdkLevel=" + sdkLevel + ", height=" + height
				+ ", width=" + width + ", phoneNetType=" + phoneNetType + ", connectNetType=" + connectNetType
				+ ", netTypeName=" + netTypeName + ", softwarVersion=" + softwarVersion + ", networkOpt=" + networkOpt
				+ ", networkOptName=" + networkOptName + ", simOpt=" + simOpt + ", simSerialNum=" + simSerialNum
				+ ", cpuAbi=" + cpuAbi + ", cpuAbi2=" + cpuAbi2 + ", brand=" + brand + ", board=" + board
				+ ", hardWare=" + hardWare + ", device=" + device + ", display=" + display + ", buildId=" + buildId
				+ ", manufacture=" + manufacture + ", product=" + product + ", serail=" + serail + ", time=" + time
				+ ", anroidId=" + anroidId + "]";
	}
	
	
}
