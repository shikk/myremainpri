package biz.bokhorst.xprivacy;

import com.shikk.myremains.aidl.IDeviceChangedCallback;
import com.shikk.myremains.aidl.IShikkDeviceObser;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

public class SkkDeviceObserService extends Service {
	
	final RemoteCallbackList <IDeviceChangedCallback>mCallbacks = new RemoteCallbackList <IDeviceChangedCallback>();
	
	private IShikkDeviceObser.Stub mBinder = new IShikkDeviceObser.Stub() {
		
		@Override
		public void unregesterCallback(IDeviceChangedCallback cb) throws RemoteException {
			// TODO Auto-generated method stub
			if (cb != null) {
				mCallbacks.unregister(cb);
			}
		}
		
		@Override
		public void regesterCallback(IDeviceChangedCallback cb) throws RemoteException {
			if (cb != null) {   
                mCallbacks.register(cb);  
//                03-20 16:00:59.759: E/DatabaseUtils(7292): java.lang.IllegalStateException: Cannot perform this operation because the connection pool has been closed.
            }  
		}
		
		@Override
		public void onDeviceInfoChanged(long deviceId) throws RemoteException {
			// TODO Auto-generated method stub
			
			SkkDeviceUtils.refreshDevice(SkkDeviceObserService.this,deviceId);
			callback();
		}
	};

	void callback() {   
        final int N = mCallbacks.beginBroadcast();  
        for (int i=0; i<N; i++) {   
            try {  
                mCallbacks.getBroadcastItem(i).onDeviceChangeFinished();   
            }  
            catch (RemoteException e) {   
                // The RemoteCallbackList will take care of removing   
                // the dead object for us.     
            }  
        }  
        mCallbacks.finishBroadcast();  
    }
	
	
	public SkkDeviceObserService() {
		
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		System.out.println("xxxxxxxxxxxxxxxxxxx  oncreate ");
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxxxxxxxxxx  onStartCommand ");
		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		System.out.println("xxxxxxxxxxxxxxxxxxx  onBind ");
		return mBinder ;
	}
	
	
	
}
