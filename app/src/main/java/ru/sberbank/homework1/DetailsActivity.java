package ru.sberbank.homework1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    private Button nextButton;
    private Button previousButton;

    public static final Intent newIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initView();
        initListeners();
    }

    private void initListeners() {
        //впред
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = InfoActivity.newIntent(getApplicationContext());
                startActivity(intent);
            }
        });
        //назад
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = MainActivity.newIntent(getApplicationContext());
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        nextButton = findViewById(R.id.detailsN);
        previousButton = findViewById(R.id.detailsP);

    }

}
