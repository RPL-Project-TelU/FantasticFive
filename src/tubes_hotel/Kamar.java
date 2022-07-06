package tubes_hotel;

public class Kamar {
    String jenis_kamar;
    String room_size;
    Integer jumlah_bed;

    public Kamar(String jenis_kamar, String room_size, Integer jumlah_bed) {
        this.jenis_kamar = jenis_kamar;
        this.room_size = room_size;
        this.jumlah_bed = jumlah_bed;
    }
    
    public String getJenis_kamar() {
        return jenis_kamar;
    }

    public void setJenis_kamar(String jenis_kamar) {
        this.jenis_kamar = jenis_kamar;
    }

    public String getRoom_size() {
        return room_size;
    }

    public void setRoom_size(String room_size) {
        this.room_size = room_size;
    }

    public Integer getJumlah_bed() {
        return jumlah_bed;
    }

    public void setJumlah_bed(Integer jumlah_bed) {
        this.jumlah_bed = jumlah_bed;
    }
}
