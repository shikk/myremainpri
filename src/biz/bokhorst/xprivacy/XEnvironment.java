package biz.bokhorst.xprivacy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.os.Environment;
import android.util.Log;
import biz.bokhorst.xprivacy.XHook;

public class XEnvironment extends XHook {
	private Methods mMethod;

	private XEnvironment(Methods method, String restrictionName) {
		super(restrictionName, method.name(), null);
		mMethod = method;
	}

	public String getClassName() {
		return "android.os.Environment";
	}

	// public static String getExternalStorageState()
	// frameworks/base/core/java/android/os/Environment.java
	// http://developer.android.com/reference/android/os/Environment.html

	private enum Methods {
		getExternalStorageState,getExternalStorageDirectory,getExternalStoragePublicDirectory
	};

	public static List<XHook> getInstances() {
		List<XHook> listHook = new ArrayList<XHook>();
		listHook.add(new XEnvironment(Methods.getExternalStorageState, PrivacyManager.cStorage));
		listHook.add(new XEnvironment(Methods.getExternalStorageDirectory, PrivacyManager.cStorage));
		listHook.add(new XEnvironment(Methods.getExternalStoragePublicDirectory, PrivacyManager.cStorage));
		return listHook;
	}

	@Override
	protected void before(XParam param) throws Throwable {
		// Do nothing
	}

	@Override
	protected void after(XParam param) throws Throwable {
		if (mMethod == Methods.getExternalStorageState) {
			if (param.getResult() != null && isRestricted(param))
				param.setResult(Environment.MEDIA_MOUNTED);

		} else if (mMethod == Methods.getExternalStorageDirectory || mMethod == Methods.getExternalStoragePublicDirectory) {
//			File result = (File) param.getResult();
//			param.setResult(new File(result.getAbsolutePath().replaceAll("sdcard0", "sdcard1")));
		}
			Util.log(this, Log.WARN, "Unknown method=" + param.method.getName());
	}
}
