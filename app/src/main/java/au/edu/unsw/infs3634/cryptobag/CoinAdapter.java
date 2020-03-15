package au.edu.unsw.infs3634.cryptobag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;




    public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.CoinViewHolder> {

        @NonNull
        @Override
        public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_list, parent, false);
            CoinViewHolder mViewHolder = new CoinViewHolder(v);
            return mViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull CoinViewHolder holder, int position) {
            holder.coinName.setText(Coin.getCoins().get(position).getName());
            //holder.coinValue.setText(NumberFormat.getCurrencyInstance().format(Coin.getValue()));
            //holder.coinChange.setText(String.valueOf(Coin.getChange1h()) + " %");
        }

        @Override
        public int getItemCount() {
            return Coin.getCoins().size();
        }

        public class CoinViewHolder extends RecyclerView.ViewHolder{

            TextView coinName;
            //TextView coinValue;
            //TextView coinChange;

            public CoinViewHolder(@NonNull View itemView) {
                super(itemView);

                coinName = itemView.findViewById(R.id.tvName);
                //coinValue = itemView.findViewById(R.id.tvValue);
                //coinChange = itemView.findViewById(R.id.tvChange);
            }
        }





//        private ArrayList<Coin> mCoins;
//        private RecyclerViewClickListener mListener;
//
//        public CoinAdapter(ArrayList<Coin> coins, RecyclerViewClickListener listener) {
//            mCoins = coins;
//            mListener = listener;
//        }
//
//        public interface RecyclerViewClickListener {
//            void onClick(View view, int position);
//        }
//
//        public static class CoinViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//            public TextView name, value, change;
//            private RecyclerViewClickListener mListener;
//
//            public CoinViewHolder(View v, RecyclerViewClickListener listener) {
//                super(v);
//                mListener = listener;
//                v.setOnClickListener(this);
//                name = v.findViewById(R.id.tvName);
//                value = v.findViewById(R.id.tvValue);
//                change = v.findViewById(R.id.tvChange);
//            }
//
//            @Override
//            public void onClick(View view) {
//                mListener.onClick(view, getAdapterPosition());
//            }
//        }
//
//        @Override
//        public CoinAdapter.CoinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_list, parent, false);
//            return new CoinViewHolder(v, mListener);
//        }
//
//        // Replace the contents of a view (invoked by the layout manager)
//        @Override
//        public void onBindViewHolder(CoinViewHolder holder, int position) {
//            Coin coin = mCoins.get(position);
//            holder.name.setText(coin.getName());
//            holder.value.setText(NumberFormat.getCurrencyInstance().format(coin.getValue()));
//            holder.change.setText(String.valueOf(coin.getChange1h()) + " %");
//
//        }
//
//        // Return the size of your dataset (invoked by the layout manager)
//        @Override
//        public int getItemCount() {
//            return mCoins.size();
//        }
    }


