package ak.sh.ay.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ak.sh.ay.app.adapters.SampleAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ListSampleActivity extends AppCompatActivity {
    @BindView(R.id.recycleview)
    RecyclerView recycleview;
    SampleAdapter sampleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sample);
        ButterKnife.bind(this);
        sampleAdapter = new SampleAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycleview.setLayoutManager(linearLayoutManager);
        recycleview.setAdapter(sampleAdapter);
    }
}
