package biz.bokhorst.xprivacy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;

import com.example.myremains.bean.NewDevice;


public class SkkDeviceUtils{

	public static final NewDevice newDevice = new NewDevice();
	public static NewDevice getNewDevice(){
//		if (newDevice == null) {
			String filePath = "/storage/sdcard1/SkkConfig/newdevice.txt";
			File file = new File(filePath);
			if (file !=null && file.exists() && file.canRead() ) {
			ObjectInputStream stream = null;
			try {
				stream = new ObjectInputStream(new FileInputStream(file));
				NewDevice tmpDevice = (NewDevice) stream.readObject();
				System.out.println("getNewDevice tmpDevice:"+tmpDevice);
				newDevice.set(tmpDevice);
			} catch (StreamCorruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				if (stream != null) {
					try {
						stream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			}
			
			
//			BufferedReader reader = null;
//			try {
//				reader = new BufferedReader(new FileReader(file));
//				String str = null;
//				while ((str = reader.readLine())!=null) {
//					if (str.startsWith("anroid_id")) {
//						newDevice.anroidId = str.replaceAll("anroid_id=", "");
//					}else if (str.startsWith("board")) {
//						newDevice.board = str.replace("board=", "");
//					}else if (str.startsWith("imei")) {
//						newDevice.imei = str.replace("imei=", "");
//					}
//				}
//				
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} finally{
//				if (reader != null) {
//					try {
//						reader.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		}
		return newDevice;
	}
	public static void refreshDevice(Context context,long deviceId) {
		Context appContext = context.getApplicationContext();
		ContentResolver resolver = appContext.getContentResolver();
		Cursor query = resolver.query(Uri.parse("content://com.shikk.deviceprovider/device/"+deviceId), null, null, null, null);
		query.moveToFirst();
		if (!query.isAfterLast()) {
			newDevice.anroidId =query.getString(query.getColumnIndex("anroid_id"));
			newDevice.board = query.getString(query.getColumnIndex("board"));
			newDevice.brand =query.getString(query.getColumnIndex("brand"));
			newDevice.bssid = query.getString(query.getColumnIndex("bssid"));
			newDevice.buildId = query.getString(query.getColumnIndex("divice_manuid"));
			newDevice.cpuAbi = query.getString(query.getColumnIndex("cpu_abi"));
			newDevice.cpuAbi2 = query.getString(query.getColumnIndex("cpu_abi2"));
			newDevice.device = query.getString(query.getColumnIndex("device"));
			newDevice.deviceModel = query.getString(query.getColumnIndex("model"));
			newDevice.display = query.getString(query.getColumnIndex("display"));
			newDevice.hardWare = query.getString(query.getColumnIndex("hardware"));
			newDevice.imei = query.getString(query.getColumnIndex("imei"));
			newDevice.imsi = query.getString(query.getColumnIndex("imsi"));
			newDevice.ip = query.getString(query.getColumnIndex("ip"));
			newDevice.mac = query.getString(query.getColumnIndex("mac"));
			newDevice.manufacture = query.getString(query.getColumnIndex("manufacture"));
			newDevice.netTypeName = query.getString(query.getColumnIndex("net_type_name"));
			newDevice.networkOpt = query.getString(query.getColumnIndex("network_opt"));
			newDevice.networkOptName = query.getString(query.getColumnIndex("network_opt_name"));
			newDevice.osversion = query.getString(query.getColumnIndex("osversion"));
			newDevice.phonenum = query.getString(query.getColumnIndex("phonenum"));
			newDevice.product = query.getString(query.getColumnIndex("product"));
			newDevice.serail = query.getString(query.getColumnIndex("serail"));
			newDevice.simOpt = query.getString(query.getColumnIndex("sim_opt"));
			newDevice.simSerialNum = query.getString(query.getColumnIndex("sim_serial_num"));
			newDevice.softwarVersion = query.getString(query.getColumnIndex("softwar_version"));
			newDevice.ssid = query.getString(query.getColumnIndex("ssid"));
			newDevice.time = Long.parseLong(query.getString(query.getColumnIndex("time")));
			newDevice.connectNetType = query.getInt(query.getColumnIndex("connect_net_type"));
			newDevice.height = query.getInt(query.getColumnIndex("height"));
			newDevice.phoneNetType = query.getInt(query.getColumnIndex("phone_net_type"));
			newDevice.sdkLevel = query.getInt(query.getColumnIndex("sdk_level"));
			newDevice.width = query.getInt(query.getColumnIndex("width"));
		}else{
			Cursor query2 = resolver.query(Uri.parse("content://com.shikk.deviceprovider/newdevice"), null, null, null, null);
			query2.moveToFirst();
			if (!query2.isAfterLast()) {
				newDevice.anroidId =query.getString(query.getColumnIndex("anroid_id"));
				newDevice.board = query.getString(query.getColumnIndex("board"));
				newDevice.brand =query.getString(query.getColumnIndex("brand"));
				newDevice.bssid = query.getString(query.getColumnIndex("bssid"));
				newDevice.buildId = query.getString(query.getColumnIndex("divice_manuid"));
				newDevice.cpuAbi = query.getString(query.getColumnIndex("cpu_abi"));
				newDevice.cpuAbi2 = query.getString(query.getColumnIndex("cpu_abi2"));
				newDevice.device = query.getString(query.getColumnIndex("device"));
				newDevice.deviceModel = query.getString(query.getColumnIndex("model"));
				newDevice.display = query.getString(query.getColumnIndex("display"));
				newDevice.hardWare = query.getString(query.getColumnIndex("hardware"));
				newDevice.imei = query.getString(query.getColumnIndex("imei"));
				newDevice.imsi = query.getString(query.getColumnIndex("imsi"));
				newDevice.ip = query.getString(query.getColumnIndex("ip"));
				newDevice.mac = query.getString(query.getColumnIndex("mac"));
				newDevice.manufacture = query.getString(query.getColumnIndex("manufacture"));
				newDevice.netTypeName = query.getString(query.getColumnIndex("net_type_name"));
				newDevice.networkOpt = query.getString(query.getColumnIndex("network_opt"));
				newDevice.networkOptName = query.getString(query.getColumnIndex("network_opt_name"));
				newDevice.osversion = query.getString(query.getColumnIndex("osversion"));
				newDevice.phonenum = query.getString(query.getColumnIndex("phonenum"));
				newDevice.product = query.getString(query.getColumnIndex("product"));
				newDevice.serail = query.getString(query.getColumnIndex("serail"));
				newDevice.simOpt = query.getString(query.getColumnIndex("sim_opt"));
				newDevice.simSerialNum = query.getString(query.getColumnIndex("sim_serial_num"));
				newDevice.softwarVersion = query.getString(query.getColumnIndex("softwar_version"));
				newDevice.ssid = query.getString(query.getColumnIndex("ssid"));
				newDevice.time = Long.parseLong(query.getString(query.getColumnIndex("time")));
				newDevice.connectNetType = query.getInt(query.getColumnIndex("connect_net_type"));
				newDevice.height = query.getInt(query.getColumnIndex("height"));
				newDevice.phoneNetType = query.getInt(query.getColumnIndex("phone_net_type"));
				newDevice.sdkLevel = query.getInt(query.getColumnIndex("sdk_level"));
				newDevice.width = query.getInt(query.getColumnIndex("width"));
			}
		}
		System.out.println("xxxxxxx:"+newDevice);
	}

	 
}
