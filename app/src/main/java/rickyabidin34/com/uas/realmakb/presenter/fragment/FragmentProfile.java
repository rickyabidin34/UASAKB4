package rickyabidin34.com.uas.realmakb.presenter.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rickyabidin34.com.uas.realmakb.R;

/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * RICKY ABIDIN
 *  10116169
 *  IF-4
 *  */

public class FragmentProfile extends Fragment {


    public FragmentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
