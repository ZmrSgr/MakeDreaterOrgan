package cn.sgr.zmr.com.sgr.Modules.Home.Location.NearByStore;

import android.app.FragmentManager;

import cn.sgr.zmr.com.sgr.Base.BasePresenter;
import cn.sgr.zmr.com.sgr.Base.BaseView;

/**
 * Created by 沈国荣 on 2016/9/7 0007.
 */
public class StoreContract {

    interface View extends BaseView<Presenter> {

        void showProgressDialog(FragmentManager manager);//显示进度条

        void cancelProgressDialog();//隐藏进度条

        boolean isActive();//目的是为了解决内存泄漏
    }

    interface Presenter extends BasePresenter {

        void getStoreList( String sign, String lat, String lng);
        void getStoreMoreList( String sign, String lat, String lng);

    }
}
