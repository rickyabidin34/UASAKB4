package rickyabidin34.com.uas.realmakb.view.viewPager;

public class ScreenItem {
    private String Title;
    private String Description;
    private int ScreenImg;

    public ScreenItem(String title, String description, int screenImg){
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * RICKY ABIDIN
 *  10116169
 *  IF-4
 *  */