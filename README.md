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