package aahl.uimenu.fragmentsJavaFiles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import aahl.uimenu.R;

public class ProgressBarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_progress_bar, container, false);

        Button btnParaElSecretote = view.findViewById(R.id.btnSecretote);
        ImageView secreto = view.findViewById(R.id.sonicNacote);
        ProgressBar mientrasCarga = view.findViewById(R.id.CargaMientrasSeRevelaElSecreto);

        btnParaElSecretote.setOnClickListener(v -> {
            mientrasCarga.setVisibility(View.VISIBLE);
            mientrasCarga.animate().setDuration(3000).alpha(1).withEndAction(() -> {
                mientrasCarga.setVisibility(View.GONE);
                secreto.setVisibility(View.VISIBLE);
            });
        });

        return view;
    }
}
