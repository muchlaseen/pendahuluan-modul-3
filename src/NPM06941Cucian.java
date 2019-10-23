
public class NPM06941Cucian {
	NPM06941Pegawai pegawai;
	NPM06941Pelanggan pelanggan;
	float berat;
	float hargaTotal;
	
	void setPegawai(NPM06941Pegawai pegawai) {
		this.pegawai = pegawai;
	}
	
	NPM06941Pegawai getPegawai() {
		return pegawai;
	}
	
	void setPelanggan(NPM06941Pelanggan pelanggan) {
		this.pelanggan = pelanggan;
	}
	
	NPM06941Pelanggan getPelanggan() {
		return pelanggan;
	}
	
	void setBerat(float berat) {
		float perKilo = 5000;
		this.berat = berat;
		this.hargaTotal = this.getBerat() * perKilo;
	}
	
	float getBerat() {
		return berat;
	}
	
	float getHargaTotal() {
		return hargaTotal;
	}
}
