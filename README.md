# pbo2-2410010505

# P03 - Komponen GUI Swing dan FlatLaf

### Tampilan saat dijalankan

**Tema terang**

![FormTiketTravel tema terang](img/formTravelTerang_p03.png)

**Tema gelap**

![FormTiketTravel tema gelap](img/formTravelGelap_p03.png)

### Tampilan tab Design (jendela Navigator)

![Tab Design FormTiketTravel dengan jendela Navigator](img/tabDesign_p03.png)

### Refleksi

1. isian kembali pada normal sizenya, saat dilebarkan dia hanya berada di center dan tidak ikut melebar menyesuaikan lebaran jendela windows.

2. isiannya jadi berantakan, seharusnya saat ditinggikan hanya bagian bawah yang kosong tetapi karna dirubah menjadi center label dan isian menjadi ikut ketarik saat ditinggikan.

3. bagian isiPanel yang didalamnya ada formPanel akan rusak terlebih dahulu. Selanjutnya bagian tombolPanel.


## P04 - Layout Manager dan Desain Form

### Sketsa
![Sketsa Rancangan](/img/sketsa_p04.jpg)


### Tabel Rancangan

| Bagian | Panel | Layout |
|---|---|---|
| Jendela | JFrame | BorderLayout |
| Header (North) | headerPanel | BoxLayout |
| Pembungkus (Center) | isiPanel | BorderLayout |
| Isi form (North di isiPanel) | anggotaPanel | GridBagLayout |
| Jenis anggota (di dalam anggotaPanel) | radioPanel | FlowLayout |
| Tombol (South) | tombolPanel | FlowLayout |


### Tangkapan Layar
**Ukuran awal** 

![Ukuran Awal](/img/formAnggotakecil_p04.png)

**Saat dilebarkan**

![Ukuran Lebar](/img/formAnggotaBesar_p04.png)

**Tab Design dan Navigator**

![Ukuran Awal](/img/tabDesign_p04.png)

### Eksperimen 1
1. Buttonnya akan berpindah tempat menjadi ketengah saat dikecilkan buttonnya tetap akan mengambil posisi tengah pada panel. baris yang berubah ada pada flowpanel.setLayout()
  flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 8)); (sesudah dirubah)
  flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 8)); (sebelum dirubah)

2. ada 2 baris yang terbentuk karna kita mengubah columnsnya jadi 2. columns = baris 

3.  lebar tombol berubah mengikuti border JFrame jadi dia melebarkan dirinya selebar ukuran JFrame. Vertical Strut menambahkan gap/jarak diantara tombol tombol pada boxPanel.

### Eksperimen 2
1. isian kembali pada normal sizenya, saat dilebarkan dia hanya berada di center dan tidak ikut melebar menyesuaikan lebaran jendela windows.

2. isiannya jadi berantakan, seharusnya saat ditinggikan hanya bagian bawah yang kosong tetapi karna dirubah menjadi center label dan isian menjadi ikut ketarik saat ditinggikan.

3. bagian isiPanel yang didalamnya ada formPanel akan rusak terlebih dahulu. Selanjutnya bagian tombolPanel.

### Saling Menilai

| No | Pemeriksaan | Ya atau Belum |
|---|---|---|
| 1 | Label singkat, jelas, dan sejajar | Ya |
| 2 | Isian dikelompokkan dengan judul bagian | Ya |
| 3 | Placeholder dipakai untuk isian yang punya format | Ya |
| 4 | Komponen sesuai jenis data | Ya |
| 5 | Tombol utama menonjol dan berada di kanan bawah | Ya |
| 6 | Jarak antar komponen konsisten | Ya |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | Ya |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout | Ya |

### Saran Perbaikan
1. Nama komponen `jScrollPane1` masih bawaan NetBeans.


## Deklarasi Penggunaan AI
Saya menggunakan AI untuk membantu memahami modul lebih mendalam agar tidak ada kesalahan dalam pengumpulan penugasan kedepannya. Serta membantu dalam penulisan README.md

## P05 - Event Handling
 
### Peta Event
 
| Komponen | Menu Events | Aksi |
|---|---|---|
| setujuCheck | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
| batalButton | Action: actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| daftarButton | Action: actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| npmField | Key: keyReleased | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame di Navigator) | Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup |
 
Jenis anggota (radio button) dan program studi (combo box) tidak memiliki event sendiri. Nilainya dibaca langsung di dalam event handler tombol Daftar.
 
### Tangkapan Layar
**Jendela Properties bagian Events untuk tombol Daftar**
 
![Properties Events tombol Daftar](/img/tombolDaftarEvents_p05.png)
 
**Dialog ringkasan**
 
![Dialog ringkasan](/img/ringkasanDialog_p05.png)
 
**Dialog konfirmasi keluar**
 
![Dialog konfirmasi keluar](/img/ringkasanDialogKeluar_p05.png)
 
### Tabel Pengamatan
 
| No | Tindakan | Event yang tercatat |
|---|---|---|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | Kursor masuk ke tombol, kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | Tombol diklik |
| 3 | Centang lalu hapus centang Aktifkan fitur | Kotak dicentang, centang dihapus |
| 4 | Ganti pilihan dari Pagi menjadi Malam | Memilih Malam |
| 5 | Klik isian, lalu ketik kata "abc" | Isian mendapat fokus, mengetik huruf a, mengetik huruf b, mengetik huruf c |
| 6 | Klik tombol setelah mengetik di isian | Isian kehilangan fokus, tombol diklik |
 
### Eksperimen Praktikum 3
1. Pesan tercetak 2 kali setiap pilihan diganti.
2. Karena saat keyPressed terpicu, karakter yang baru diketik belum masuk ke isian, sehingga getText() membaca teks yang lama. Saat angka 3 diketik, event keyPressed memproses isian yang masih kosong, sehingga hasilnya terlambat satu karakter.
3. Di jendela Output muncul `Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: "a"`.
### Eksperimen Praktikum 4
1. Pesan tercetak dua kali. Sebaiknya satu tombol memakai satu cara saja, karena jika memakai dua cara maka hitung('x') akan berjalan dua kali.
2. Perubahan di tab Design: tombol `%` ditambahkan ke operatorPanel dengan teks `%` dan nama variabel `modulus`. Karena sebelumnya Grid Layout hanya memiliki 4 kolom, jumlah kolom ditambah menjadi 5.
   Perubahan di tab Source: event handler tombol dibuat melalui GUI Builder (Events, Action, actionPerformed), lalu di method `hitung` ditambahkan case baru beserta rumus modulus.
3. Karena di method `hapus` terdapat `requestFocusInWindow()` untuk angka1Field. Jadi setelah tombol Hapus ditekan dan baris-baris sebelumnya dijalankan, fokus kembali ke angka1Field.
### Deklarasi Penggunaan AI
Saya menggunakan AI untuk membantu memahami modul lebih mendalam agar tidak ada kesalahan dalam pengumpulan penugasan kedepannya. Serta membantu dalam penulisan README.md