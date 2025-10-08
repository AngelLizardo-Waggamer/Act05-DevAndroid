package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import aahl.uimenu.R;

public class ButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_button, container, false);

        Button btnParaChistaco = view.findViewById(R.id.btnObvioParaClick);

        btnParaChistaco.setOnClickListener((View.OnClickListener) v -> {
            Toast.makeText(getActivity(), "Si lo hiciste jajajaja", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
