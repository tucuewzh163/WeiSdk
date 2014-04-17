
package config;

import android.content.Context;

import com.iss.weisdk.dao.DaoMaster;
import com.iss.weisdk.dao.DaoSession;
import com.iss.weisdk.dao.DaoMaster.OpenHelper;

public class DBConstants {

    /**
     * 数据库名称
     */
    public static final String DB_NAME = "wei_sdk";

    /**
     * 本地数据库版本号
     */
    public static final int DATABASE_VERSION = 1;

    private static DaoMaster mDaoMaster;

    private static DaoSession mDaoSession;

    public static DaoMaster getDaoMaster(Context context) {
        if (mDaoMaster == null) {
            OpenHelper helper = new DaoMaster.DevOpenHelper(context, DBConstants.DB_NAME, null);
            mDaoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return mDaoMaster;
    }

    public static DaoSession getDaoSession(Context context) {
        if (mDaoSession == null) {
            if (mDaoMaster == null) {
                getDaoMaster(context);
            }
            mDaoSession = mDaoMaster.newSession();
        }
        return mDaoSession;
    }
    
    
}
