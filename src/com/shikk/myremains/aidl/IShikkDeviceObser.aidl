package com.shikk.myremains.aidl;
import com.shikk.myremains.aidl.IDeviceChangedCallback;

interface IShikkDeviceObser {
	void onDeviceInfoChanged(long deviceId);
	void regesterCallback(IDeviceChangedCallback cb);
	void unregesterCallback(IDeviceChangedCallback cb);
}
