package com.example.databindingdynamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//import com.example.databindingdynamic.commands.usersave;
//import com.example.databindingdynamic.commands.userSave;
//import com.example.databindingdynamic.commands.userLogin;
import com.example.databindingdynamic.databinding.ActivityMainBinding;
import com.example.databindingdynamic.model.User;
import com.example.databindingdynamic.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

   private ClickHandler handler;
   private DeleteHandler handler1;

    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserModel usermodel = new UserModel(new User("Enter name ","Enter detail "));
        activityMainBinding.setLogin(usermodel);

        handler=new ClickHandler(this);
        activityMainBinding.setClickHandler(handler);

        handler1=new DeleteHandler(this);
        activityMainBinding.setDeleteHandler(handler1);


    }
////first Button ///
    public class ClickHandler
    {
        private Context context;

        public ClickHandler(Context context)
        {
            this.context=context;
        }

        public void simplebuttonclick(View view)
        {
           Toast.makeText(context,"simple click done ",Toast.LENGTH_LONG).show();
            //save_to_database(nameid.getText().toString().trim(),Integer.parseInt(txtage.getText().toString().trim()));
        }
    }
    /////Second Button ////
    public class DeleteHandler
    {
        private Context context;

        public DeleteHandler(Context context)
        {
            this.context=context;
        }

        public void buttonclick(View view)
        {
            Toast.makeText(context,"Second button Click",Toast.LENGTH_LONG).show();
        }
    }
}
