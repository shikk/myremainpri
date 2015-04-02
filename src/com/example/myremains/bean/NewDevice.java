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
	
	public String imei="862784022173948";
	public String imsi="460011508607017";
	public String phonenum="18681504450";
	public String ip="192.168.1.100";
	public String mac="cc:c2:45:cd:e2:9c";
	public String bssid="b0:c5:45:de:77:a2";
	public String ssid="D-Link-fgg";
	public String deviceModel="HUAWEI P6";
	public String osversion="4.4.2";
	public int sdkLevel=20;
	public int height=1184;
	public int width=720;
	
	public int phoneNetType=10;
	public int connectNetType=1;
	public String netTypeName="WIFI";
	
	public String softwarVersion="98";
	public String networkOpt="46001";
	public String networkOptName="中国联通";
	public String simOpt="46001";
	public String simSerialNum="89860112851043119801";
	public String cpuAbi="armeabi-v7a";
	public String cpuAbi2="armeabi";
	public String brand="Huawei";
	public String board="P6";
	public String hardWare="Huawei";
	public String device="hwp6";
	public String display="p6-06XV100R0012C51";
	public String buildId="Huaweip6";
	public String manufacture="HUAWEI";
	public String product="P6";
	public String serail="002KNG7N46001515";
	public long time=1417119514000L;
	public String anroidId="fb1414a662fw0a35";
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
	public void set(NewDevice tmpDevice) {
		this.anroidId = tmpDevice.anroidId;
		this.board = tmpDevice.board;
		this.brand = tmpDevice.brand;
		this.bssid = tmpDevice.bssid;
		this.buildId = tmpDevice.buildId;
		this.connectNetType = tmpDevice.connectNetType;
		this.cpuAbi = tmpDevice.cpuAbi;
		this.cpuAbi2 = tmpDevice.cpuAbi2;
		this.device = tmpDevice.device;
		this.deviceId = tmpDevice.deviceId;
		this.deviceModel = tmpDevice.deviceModel;
		this.display = tmpDevice.display;
		this.hardWare = tmpDevice.hardWare;
		this.height = tmpDevice.height;
		this.imei = tmpDevice.imei;
		this.imsi = tmpDevice.imsi;
		this.ip = tmpDevice.ip;
		this.mac = tmpDevice.mac;
		this.manufacture = tmpDevice.manufacture;
		this.netTypeName = tmpDevice.netTypeName;
		this.networkOpt = tmpDevice.networkOpt;
		this.networkOptName = tmpDevice.networkOptName;
		this.osversion = tmpDevice.osversion;
		this.phoneNetType = tmpDevice.phoneNetType;
		this.phonenum = tmpDevice.phonenum;
		this.product = tmpDevice.product;
		this.sdkLevel = tmpDevice.sdkLevel;
		this.serail = tmpDevice.serail;
		this.simOpt = tmpDevice.simOpt;
		this.simSerialNum = tmpDevice.simSerialNum;
		this.softwarVersion = tmpDevice.softwarVersion;
		this.ssid = tmpDevice.ssid;
		this.time = tmpDevice.time;
		this.width = tmpDevice.width;
	}
	
	
}
