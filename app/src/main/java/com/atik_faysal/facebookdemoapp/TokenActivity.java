package com.atik_faysal.facebookdemoapp;

/**
 * Created by USER on 11/25/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.accountkit.Account;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.PhoneNumber;

public class TokenActivity extends Activity {
        @Override
        protected void onResume() {
                super.onResume();

                AccountKit.getCurrentAccount(new AccountKitCallback<Account>() {
                        @Override
                        public void onSuccess(final Account account) {
                                /*final TextView userId = (TextView) findViewById(R.id.user_id);
                                userId.setText(account.getId());

                                final TextView phoneNumber = (TextView) findViewById(R.id.user_phone);
                                final PhoneNumber number = account.getPhoneNumber();
                                phoneNumber.setText(number == null ? null : number.toString());

                                final TextView email = (TextView) findViewById(R.id.user_email);
                                email.setText(account.getEmail());*/
                                Toast.makeText(TokenActivity.this,"ok",Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onError(final AccountKitError error) {
                        }
                });
        }
}