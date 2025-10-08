package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import aahl.uimenu.R;

public class SpinnerFragment extends Fragment {

    Spinner dropdownDeLenguajes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_spinner, container, false);

        String[] lenguajes = {
                "", "Java", "Dart", "JavaScript", "Python", "C#", "C++", "Swift", "Ruby", "Go", "Kotlin", "PHP"
        };

        dropdownDeLenguajes = view.findViewById(R.id.spinnerLenguajes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_item, lenguajes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdownDeLenguajes.setAdapter(adapter);

        dropdownDeLenguajes.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(android.widget.AdapterView<?> parent, View view, int position, long id) {
                String seleccion = parent.getItemAtPosition(position).toString();

                if (seleccion.isEmpty()) {
                    return;
                }

                Toast.makeText(requireContext(), "Seleccionaste: " + seleccion, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(android.widget.AdapterView<?> parent) {
                Toast.makeText(requireContext(), "Como llegamos aquí .-.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
