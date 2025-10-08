package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import aahl.uimenu.R;

public class CheckBoxFragment extends Fragment {

    CheckBox p1, p2, p3, p4;

    TextView texto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_check_box, container, false);

        p1 = view.findViewById(R.id.checkbox1);
        p2 = view.findViewById(R.id.checkbox2);
        p3 = view.findViewById(R.id.checkbox3);
        p4 = view.findViewById(R.id.checkbox4);

        texto = view.findViewById(R.id.tecmiMensaje);

        p1.setOnClickListener(v -> {
           serTecmilenio();
        });

        p2.setOnClickListener(v -> {
            serTecmilenio();
        });

        p3.setOnClickListener(v -> {
            serTecmilenio();
        });

        p4.setOnClickListener(v -> {
            serTecmilenio();
        });

        return view;
    }

    private void serTecmilenio() {
        if (p1.isChecked() && p2.isChecked() && p3.isChecked() && p4.isChecked()) {
            texto.setVisibility(View.VISIBLE);
        } else {
            texto.setVisibility(View.INVISIBLE);
        }
    }
}
