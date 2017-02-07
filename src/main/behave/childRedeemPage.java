package jimmy.behave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class childRedeemPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_redeem_page);
    }
    public void returnPrize(View view){
        Intent startNewActivity = new Intent (this,Home_children_page.class);
        startActivity(startNewActivity);
}
}
