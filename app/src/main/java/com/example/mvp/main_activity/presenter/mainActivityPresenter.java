package com.example.mvp.main_activity.presenter;

import com.example.mvp.main_activity.model.User;

public class mainActivityPresenter {

    private User user;
    private View view;

    public mainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateuserName(String userName){
        user.setuserName(userName);
        view.updateUserInfoTextView(user.toString());

    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());

    }

    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}