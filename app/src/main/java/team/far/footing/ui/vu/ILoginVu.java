package team.far.footing.ui.vu;

import android.content.Context;

import team.far.footing.model.bean.Userbean;

/**
 * Created by moi on 2015/8/7.
 */
public interface ILoginVu {
    Context getContext();
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoginLoading();

    void showLoginSuccee(Userbean userbean);

    void showLoginFail(String reason);
}
