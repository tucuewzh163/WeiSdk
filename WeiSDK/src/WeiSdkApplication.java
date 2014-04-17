import com.iss.weisdk.dao.DaoMaster;
import com.iss.weisdk.dao.DaoMaster.OpenHelper;
import com.iss.weisdk.dao.DaoSession;

import config.DBConstants;

import android.app.Application;
import android.content.Context;

public class WeiSdkApplication extends Application {
    private static WeiSdkApplication mApplication;

    

    @Override
    public void onCreate() {
        super.onCreate();
        if (mApplication == null) {
            mApplication = this;
        }
    }

   
}
