package rickyabidin34.com.uas.realmakb.model;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class TemanModel extends RealmObject {
    @PrimaryKey
    private Integer id;
    private Integer nim;
    private Integer telp;
    private String nama;
    private String kelas;
    private String email;
    private String instagram;
    private String facebook;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public Integer getTelp() {
        return telp;
    }

    public void setTelp(Integer telp) {
        this.telp = telp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

}
/* Tanggal Pengerjaan
 *  13 Agustus 2019
 *
 * RICKY ABIDIN
 *  10116169
 *  IF-4
 *  */