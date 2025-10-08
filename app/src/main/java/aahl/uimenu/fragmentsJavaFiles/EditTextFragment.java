package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import aahl.uimenu.R;


public class EditTextFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_edit_text, container, false);

        EditText inputNombre = view.findViewById(R.id.textoNombre);
        Button btnSaludar = view.findViewById(R.id.btnSaludar);

        btnSaludar.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "¡Hola " + inputNombre.getText().toString() + "!", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}