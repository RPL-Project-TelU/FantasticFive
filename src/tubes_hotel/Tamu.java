package tubes_hotel;

public class Tamu {
    String nama_tamu;
    Integer notelp_tamu;
    String email_tamu;
    
    public Tamu(String nama_tamu, Integer notelp_tamu, String email_tamu) {
        this.nama_tamu = nama_tamu;
        this.notelp_tamu = notelp_tamu;
        this.email_tamu = email_tamu;
    }

    public String getNama_tamu() {
        return nama_tamu;
    }

    public void setNama_tamu(String nama_tamu) {
        this.nama_tamu = nama_tamu;
    }

    public Integer getNotelp_tamu() {
        return notelp_tamu;
    }

    public void setNotelp_tamu(Integer notelp_tamu) {
        this.notelp_tamu = notelp_tamu;
    }

    public String getEmail_tamu() {
        return email_tamu;
    }

    public void setEmail_tamu(String email_tamu) {
        this.email_tamu = email_tamu;
    }
}
