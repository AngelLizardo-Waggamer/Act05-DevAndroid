package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import aahl.uimenu.R;

public class SeekBarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seek_bar, container, false);

        SeekBar ratingDelProfePablo = view.findViewById(R.id.SeekbarDelProfePablo);

        ratingDelProfePablo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Aquí puedes manejar el inicio del toque si es necesario
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                int puntuacionFinal = seekBar.getProgress();

                Toast.makeText(getActivity(), "Le diste " + puntuacionFinal + " puntos al profe Pablo", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
