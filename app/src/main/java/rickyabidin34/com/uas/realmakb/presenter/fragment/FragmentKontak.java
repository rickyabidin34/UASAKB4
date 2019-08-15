package rickyabidin34.com.uas.realmakb.presenter.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import rickyabidin34.com.uas.realmakb.R;

/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * RICKY ABIDIN
 *  10116169
 *  IF-4
 *  */

public class FragmentKontak extends Fragment {

    TextView textViewInstagram,textViewLine,textViewGithub,textViewFacebook,textViewGmail;

    public FragmentKontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragement_kontak = inflater.inflate(R.layout.fragment_kontak, container, false);
        textViewInstagram = fragement_kontak.findViewById(R.id.instagram);
        textViewLine = fragement_kontak.findViewById(R.id.line);
        textViewGithub = fragement_kontak.findViewById(R.id.github);
        textViewGmail = fragement_kontak.findViewById(R.id.gmail);
        textViewFacebook = fragement_kontak.findViewById(R.id.facebook);

        textViewInstagram.setMovementMethod(LinkMovementMethod.getInstance());
        textViewLine.setMovementMethod(LinkMovementMethod.getInstance());
        textViewGithub.setMovementMethod(LinkMovementMethod.getInstance());
        textViewGmail.setMovementMethod(LinkMovementMethod.getInstance());
        textViewFacebook.setMovementMethod(LinkMovementMethod.getInstance());

        return fragement_kontak;
    }

}
