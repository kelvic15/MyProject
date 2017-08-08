package hive.teachings.domain.kelvi.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String title,genre, year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txtGenre = (TextView) findViewById(R.id.text_genre) ;
        TextView txtYear = (TextView) findViewById(R.id.text_year) ;
        TextView txtTitle = (TextView) findViewById(R.id.text_title) ;


        Bundle bundle = getIntent().getExtras();
        if(bundle != null){

            title = bundle.getString("movieTitle");
            genre = bundle.getString("movieGenre");
            year = bundle.getString("movieYear");

            txtGenre.setText(genre);
            txtTitle.setText(title);
            txtYear.setText(year);

        }




    }
}
