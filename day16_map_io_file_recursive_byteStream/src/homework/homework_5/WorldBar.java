package homework.homework_5;

import javax.lang.model.element.NestingKind;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 21:13
 * description:
 */
public class WorldBar {
    private String session; //����
    private String year; //���
    private String address; //�ٰ�ص�
    private String champion; //�ھ����ڹ�

    public WorldBar() {
    }

    public WorldBar(String session, String year, String address, String champion) {
        this.session = session;
        this.year = year;
        this.address = address;
        this.champion = champion;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    @Override
    public String toString() {
        return "WorldBar{" +
                "session='" + session + '\'' +
                ", year='" + year + '\'' +
                ", address='" + address + '\'' +
                ", champion='" + champion + '\'' +
                '}';
    }
}
