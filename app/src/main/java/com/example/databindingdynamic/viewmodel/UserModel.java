package com.example.databindingdynamic.viewmodel;

import androidx.databinding.BaseObservable;

import com.example.databindingdynamic.R;
import com.example.databindingdynamic.model.User;

public class UserModel  {

    private String Name ;
    private String  detail;
    private String Namehint;
    private String detailhint;


    public UserModel(User user) {

        this.Namehint = user.Namehint;
        this.detailhint = user.detailhint;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
       // notifyPropertyChanged(R.id.nameid);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
        //notifyPropertyChanged(R.id.detailid);
    }

    public String getNamehint() {
        return Namehint;
    }

    public void setNamehint(String namehint) {
        Namehint = namehint;
    }

    public String getDetailhint() {
        return detailhint;
    }

    public void setDetailhint(String detailhint) {
        this.detailhint = detailhint;
    }
}
