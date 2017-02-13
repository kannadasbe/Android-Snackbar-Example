package com.crazygeeksblog.androidsnackbarexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDefaultSnackbar, btnCustomSnackbar, btnSnackbarWithAction;
    RelativeLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDefaultSnackbar = (Button) findViewById(R.id.btnDefaultSnackbar);
        btnCustomSnackbar = (Button) findViewById(R.id.btnCustomSnackbar);
        btnSnackbarWithAction = (Button) findViewById(R.id.btnSnackbarWithAction);
        rootLayout = (RelativeLayout) findViewById(R.id.activity_main);
        btnDefaultSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(rootLayout, "Snackbar Sample", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        btnCustomSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackBar = Snackbar
                        .make(rootLayout, "Sample action", Snackbar.LENGTH_LONG)
                        .setAction("Done", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getApplicationContext(), "Done..",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                // Changing message text color
                snackBar.setActionTextColor(Color.RED);

                // Changing action button text color
                View snackBarView = snackBar.getView();
                TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.GREEN);
                snackBar.show();
            }
        });

        btnSnackbarWithAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackBar = Snackbar
                        .make(rootLayout, "Sample action", Snackbar.LENGTH_LONG)
                        .setAction("Done", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getApplicationContext(), "Done..",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                snackBar.show();
            }
        });
    }
}
