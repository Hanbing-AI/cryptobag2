package au.edu.unsw.infs3634.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity{
    private TextView coinName;
    private TextView coinSymbol;
    private TextView coinValue;
    private TextView coinChange1h;
    private TextView coinChange24h;
    private TextView coinChange7d;
    private TextView coinMkt;
    private TextView coinVolume;
    private ImageView searchCoin;

    private static final String TAG = "DetailActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        coinName = findViewById(R.id.coinName);
        coinSymbol = findViewById(R.id.coinSymbol);
        coinValue = findViewById(R.id.coinValue);
        coinChange1h = findViewById(R.id.coinChange1h);
        coinChange24h = findViewById(R.id.coinChange24h);
        coinChange7d = findViewById(R.id.coinChange7d);
        coinMkt = findViewById(R.id.coinMkt);
        coinVolume = findViewById(R.id.coinVolume);
        ImageView imageView = findViewById(R.id.search);
        final EditText seachName = findViewById(R.id.search_name);
        Intent Intent = getIntent();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = seachName.getText().toString();
                for(int i =0; i<Coin.getCoins().size(); i++){
                    if(input.equals(Coin.getCoins().get(i).getName())){
                        coinName.setText(Coin.getCoins().get(i).getName());
                        coinSymbol.setText(Coin.getCoins().get(i).getSymbol());
                        coinValue.setText("$"+Coin.getCoins().get(i).getValue());
                        coinChange1h.setText(Coin.getCoins().get(i).getChange1h()+"%");
                        coinChange24h.setText(Coin.getCoins().get(i).getChange24h()+"%");
                        coinChange7d.setText(Coin.getCoins().get(i).getChange7d()+"%");
                        coinMkt.setText("$"+Coin.getCoins().get(i).getMarketcap());
                        coinVolume.setText("$"+Coin.getCoins().get(i).getVolume());


                        break;
                    }else{
                        coinName.setText("Check_name");
                    }

                }
            }
        });
       // String coinSymbol =
    }
}
