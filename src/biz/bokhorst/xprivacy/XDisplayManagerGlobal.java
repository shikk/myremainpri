package biz.bokhorst.xprivacy;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.os.Binder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class XDisplayManagerGlobal extends XHook {
	private Methods mMethod;
	private String mClassName;
	private static final String cClassName = "android.hardware.display.DisplayManagerGlobal";

	private XDisplayManagerGlobal(Methods method, String restrictionName, String className) {
		super(restrictionName, method.name(), null);
		mMethod = method;
		mClassName = className;
	}

	public String getClassName() {
		return mClassName;
	}

	// @formatter:off

	// public void addView(View view, ViewGroup.LayoutParams params)
	// public void removeView(View view)
	// public void updateViewLayout(View view, ViewGroup.LayoutParams params)
	// http://developer.android.com/reference/android/view/ViewManager.html
	// http://developer.android.com/reference/android/view/WindowManager.html

	// @formatter:on

	private enum Methods {
		getDisplayInfo
	};

	public static List<XHook> getInstances(String className) {
		List<XHook> listHook = new ArrayList<XHook>();
		if (!cClassName.equals(className)) {
			if (className == null)
				className = cClassName;

			listHook.add(new XDisplayManagerGlobal(Methods.getDisplayInfo, null, className));
		}
		return listHook;
	}

	@Override
	protected void before(XParam param) throws Throwable {
		
	}

	@Override
	protected void after(XParam param) throws Throwable {
		// Do nothing
		if (mMethod == Methods.getDisplayInfo){
//			System.out.println("xxxxxxxxxxxxxxxxxxx  getDefaultDisplay ");
			int uid = Binder.getCallingUid();
			if (param != null&&getRestricted(uid, PrivacyManager.cPhone, "Configuration.MCC")) {
//				System.out.println("cccccccccccccccc  xxxx  meinia getDisplayInfo");
				SkkDeviceUtils.getNewDevice();
				int widthPixels = SkkDeviceUtils.newDevice.width;
				int heightPixels = SkkDeviceUtils.newDevice.height;
				Object displayInfo = param.getResult();
//				System.out.println("xxxxxxxxxxxxxxxxx  getDefaultDisplay 333   "+displayInfo);
				Class<?> DisplayInfoClass = Class.forName("android.view.DisplayInfo"); 
				Object newInstance = DisplayInfoClass.getDeclaredConstructor(DisplayInfoClass).newInstance(displayInfo);
				Field fieldAppWidth = DisplayInfoClass.getDeclaredField("appWidth");
				Field fieldAppHeight = DisplayInfoClass.getDeclaredField("appHeight");
				Field fieldLargestNominalAppWidth = DisplayInfoClass.getDeclaredField("largestNominalAppWidth");
				Field fieldLargestNominalAppHeight = DisplayInfoClass.getDeclaredField("largestNominalAppHeight");
				Field fieldLogicalWidth = DisplayInfoClass.getDeclaredField("logicalWidth");
				Field fieldLogicalHeight = DisplayInfoClass.getDeclaredField("logicalHeight");
				fieldAppWidth.set(newInstance, widthPixels);
				fieldAppHeight.set(newInstance, heightPixels);
				fieldLargestNominalAppHeight.set(newInstance, heightPixels);
				fieldLargestNominalAppWidth.set(newInstance, widthPixels);
				fieldLogicalHeight.set(newInstance, heightPixels);
				fieldLogicalWidth.set(newInstance, widthPixels);
//				System.out.println("xxxxxxxxxxxxxxxxx  getDefaultDisplay 444   "+newInstance);
				param.setResult(newInstance);
			}	
		}
		
	}
}
