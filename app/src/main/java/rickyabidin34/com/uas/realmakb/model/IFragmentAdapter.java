package rickyabidin34.com.uas.realmakb.model;

import android.support.v4.app.Fragment;

public interface IFragmentAdapter {
    void add(Fragment Frag, String Title);
    Fragment getItem(int position);
    CharSequence getPageTitle(int position);
    int getCount();
}
/* Tanggal Pengerjaan
 *  13 Agustus 2019
 *
 * RICKY ABIDIN
 *  10116169
 *  IF-4
 *  */