package com.example.pictureappassignment;

import android.os.Bundle;
import com.example.pictureappassignment.Dashboardtem;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    public DashboardFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Dashboardtem> items = new ArrayList<>();
        items.add(new Dashboardtem("Walking", R.drawable.ic_walking));
        items.add(new Dashboardtem("Boating", R.drawable.ic_boating));
        items.add(new Dashboardtem("Bus", R.drawable.ic_bus));
        items.add(new Dashboardtem("Train", R.drawable.ic_train));

        DashboardAdapter adapter = new DashboardAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
