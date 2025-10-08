package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import aahl.uimenu.R;

public class SwitchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_switch, container, false);

        Switch togglerModoInsano = view.findViewById(R.id.togglerModoInsano);

        TextView textoInsano = view.findViewById(R.id.textoModoInsano);

        togglerModoInsano.setOnCheckedChangeListener((buttonView, isChecked) -> {;
            if (isChecked) {
                textoInsano.setVisibility(View.VISIBLE);
            } else {
                textoInsano.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
