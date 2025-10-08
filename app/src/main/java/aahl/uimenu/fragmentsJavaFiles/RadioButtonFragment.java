package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import aahl.uimenu.R;

public class RadioButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_radio_button, container, false);

        RadioGroup grupoDeRespuestas = view.findViewById(R.id.grupoRespuesta);

        grupoDeRespuestas.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioButtonChi) {
                Toast.makeText(getActivity(), "Mejor Javascript o C# .-.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Respuesta correcta >:)", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
