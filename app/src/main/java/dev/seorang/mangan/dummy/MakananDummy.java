package dev.seorang.mangan.dummy;

import java.util.ArrayList;

import dev.seorang.mangan.models.Makanan;

public class MakananDummy {
    /*
     * 0: Nama Makanan
     * 1: Asal
     * 2: Deskripsi
     * 3: Photo resource
     */

    // Data source: https://id.theasianparent.com/wisata-kuliner-surabaya
    // https://cookpad.com/
    public static String[][] data = new String[][] {
            {
                "Rawon",
                    "Surabaya",
                    "https://selerasa.com/wp-content/uploads/2018/11/rawon-jogja-500x308.jpg",
                    "Rawon adalah salah satu resep masakan Indonesia yang populer juga. " +
                            "Harum keluwaknya sangat menggoda selera. " +
                            "Rawon lebih nikmat jika sudah menginap, kalau hendak disajikan pagi " +
                            "hari untuk sarapan sebaiknya dimasak pada malam harinya.\n\n" +
                            "BAHAN:\n" +
                            "- 500 gram daging sapi agak berlemak\n" +
                            "- 2 liter air\n" +
                            "- 3 batang serai, memarkan\n" +
                            "- 3 cm lengkuas, memarkan\n" +
                            "- 5 lembar daun jeruk\n" +
                            "- 2 lembar daun salam\n" +
                            "- 4 sdm minyak untuk menumis\n" +
                            "- 2 tangkai daun bawang, potong-potong\n\n" +
                            "BUMBU HALUS:\n" +
                            "- 5 butir bawang merah\n" +
                            "- 3 siung bawang putih\n" +
                            "- 2 butir kemiri\n" +
                            "- 1 sdt ketumbar\n" +
                            "- 2 cm jahe\n" +
                            "- 2 cm kunyit\n" +
                            "- 3 bh cabai merah (opsional)\n" +
                            "- 4 bh keluwak tua, kukus, ambil isinya\n" +
                            "- 2 sdt garam\n\n" +
                            "PELENGKAP:\n" +
                            "- Kerupuk udang\n" +
                            "- 100 gram tauge pendek\n" +
                            "- 4 butir telur asin\n" +
                            "- Sambal\n\n" +
                            "CARA MEMBUAT:\n" +
                            "1. Masak daging dengan api kecil\n" +
                            "2. Masukkan daun salam, serai, lengkuas, dan daun jeruk sampai daging empuk dan matang.\n" +
                            "3. Angkat daging, lalu potong kecil-kecil.\n" +
                            "4. Saring rebusan air daging, sisihkan bersama irisan daging.\n" +
                            "5. Haluskan semua bumbu halus, tumis sampai berbau harum.\n" +
                            "6. Angkat, lalu masukkan ke dalam kaldu daging.\n" +
                            "7. Masak dengan api kecil sampai mendidih kembali.\n" +
                            "8. Cicipi, apakah rasanya sudah pas.\n" +
                            "9. Masukkan daun bawang yang sudah dipotong, didihkan sebentar.\n" +
                            "10. Tuang rawon kedalam mangkuk, taburkan tauge pendek di atasnya.\n" +
                            "11. Sajikan bersama nasi hangat, telur asin dan sambal.\n"
            },
            {
                "Ayam Betutu Bali",
                    "Bali",
                    "https://img-global.cpcdn.com/003_recipes/dd6b27325ed5d18f/751x532cq70/ayam-betutu-bali-versi-singkat-sederhana-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1/2 ekor ayam kampung (potong jadi 4, lumuri garam dan jeruk nipis, diamkan sebentar lalu bilas)\n" +
                            "- 2 batang sereh yg besar (potong ambil putihnya aja lalu geprek)\n" +
                            "- 2 cm lengkuas (geprek)\n" +
                            "- 5 butir kencur (diiris tipis)\n" +
                            "- 10 cabe rawit merah (diiris tipis)\n" +
                            "- 5 bawang merah (diiris tipis)\n" +
                            "- 2 bawang putih (dirajang tipis)\n" +
                            "- secukupnya Garam, gula dan royco\n" +
                            "- 700 ml air\n" +
                            "\n" +
                            "BUMBU ULEG:\n" +
                            "- Bumbu Uleg/dry mill dengan 3 sendok minyak goreng:\n" +
                            "- 1 sendok teh ketumbar\n" +
                            "- 1 sendok teh merica\n" +
                            "- 2 butir kemiri\n" +
                            "- 2 cm jahe\n" +
                            "- 3 cm kunyit\n" +
                            "- 5 bawang merah\n" +
                            "- 1 bawang putih\n" +
                            "- 1 sendok makan ebi\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Siapkan semua bahan dan bumbu. Panaskan 2 sendok minyak goreng, tumis bumbu uleg dan bumbu rajang serta bumbu geprek hingga wangi\n" +
                            "2. Masukkan ayam, aduk hingga rata bumbunya lalu beri air, garam, gula dan royco secukupnya. Pastikan ayamnya terendam yaa..\n" +
                            "3. Masak dengan api kecil hingga ayam empuk dan kuahnya susut. Siap dihidangkan"
            },
            {
                "Capcay",
                    "Jawa Barat",
                    "https://img-global.cpcdn.com/003_recipes/61938c555b320d8b/751x532cq70/capcay-singkat-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 butir telur\n" +
                            "- 1 buah bawang bombay ukuran kecil\n" +
                            "- 250 grm kembang kol\n" +
                            "- 2 buah wortel\n" +
                            "- 250 grm buncis\n" +
                            "- 200 grm janten (putren)\n" +
                            "- 2 buah sosis\n" +
                            "- 2 butir kemiri\n" +
                            "- 2 siung bawang putih\n" +
                            "- 1 sdm saus tiram\n" +
                            "- air\n" +
                            "- secukupnya Merica bubuk\n" +
                            "- secukupnya Gula\n" +
                            "- secukupnya Garam\n" +
                            "- secukupnya Kaldu bubuk\n" +
                            "- Minyak untuk menumis\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Potong menurut selera dan bersihkan Sayuran, rebus setengah matang potong serong sosis. Haluskan bawang putih dan kemiri\n" +
                            "2. Capcay singkat siap disajikan.\n" +
                            "3. Tumis bawang Bombay hingga harum, masukan telur aduk cepat (orak arik) sampai telur setengah matang. Masukan bumbu halus, beri garam dan gula. Tumis hingga bumbu harum dan matang. Beri saus tiram\n" +
                            "4. Beri air secukupnya. Biarkan air mendidih, lalu masukan wortel, buncis, janten, kembang kol dan sosis, Aduk rata. Tambahkan merica bubuk, kaldu bubuk (optional). Aduk Biarkan sampai air menyusut dan sayuran matang"
            },
            {
                "Nasi Goreng",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/cfbe9c76c7a88069/751x532cq70/nasi-goreng-singkat-bergizi-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 3 siung bawang merah\n" +
                            "- 2 siung bawang putih\n" +
                            "- 3 buah cabe rawit\n" +
                            "- 3 buah cabe merah\n" +
                            "- 3 sdm kecap\n" +
                            "- secukupnya garam\n" +
                            "- penyedap rasa\n" +
                            "- sayuran potong optional\n" +
                            "- wortel/buncis/jagung/kacang polong\n" +
                            "- 1 butir telur\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Ulek/blender semua bumbu, potong sayuran, siapkan nasi\n" +
                            "2. Tumis telur kemudian sisihkan.. tumis bumbu halus yg sudah di ulek setelah harum masukan nasi dan sayur mayur\n" +
                            "3. Tambahkan kecap manis, garam dan penyedap rasa. icip icip sedikit\n" +
                            "4. Sajikan di piring lengkapi dengan kerupuk"
            },
            {
                "Martabak Telur",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/e402a35300a7fa3a/751x532cq70/martabak-telur-singkat-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- Adonan kulit\n" +
                            "- 5 sdm tepung terigu\n" +
                            "- 1/2 sdt garam\n" +
                            "- 100 ml air\n" +
                            "- Jika air kurang bisa ditambah (adonan seperti kulit pastel)\n" +
                            "- 100 ml minyak goreng untuk merendam adonan kulit\n" +
                            "- isian\n" +
                            "- 2 btr telur\n" +
                            "- 1/4 daun bawang/bawang pre (3000)\n" +
                            "- 1 bgks bumbu kari\n" +
                            "- 1 bgks merica bubuk\n" +
                            "- Sejumput garam\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Campur tepung dan garam dgn sedikit2 air diulenin sampai kalis. Terus di rendam dgn minyak biarkan kurang lebih 15 menit\n" +
                            "2. Rajang daun bawang masukan telur, bumbu kari, merica, garam aduk2\n" +
                            "3. Panaskan teflon dgn sedikit minyak. Pipihkan kulit menggunakan tangan sampai tipis trus taruh diatas teflon masukan isian bawang tutup.goreng sampai matang dan mengembang"
            },
            {
                "Sambal Teri Kacang",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/66e38c947ac5ba63/751x532cq70/sambel-teri-kacang-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 bungkus teri yg belah\n" +
                            "- secukupnya Kacang tanah\n" +
                            "- 4 siung bawang merah\n" +
                            "- 3 siung bawang putih\n" +
                            "- 7 cabai rawit\n" +
                            "- 10 cabai keriting\n" +
                            "- 1 tomat\n" +
                            "- 1 kemiri\n" +
                            "- secukupnya Royko\n" +
                            "- secukupnya Sasa\n" +
                            "- secukupnya Gula\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Cuci bersih teri dan tiriskan\n" +
                            "2. Lalu goreng kacang tanah hingga kecoklatan dan jgn terlalu lama\n" +
                            "3. Goreng teri yg sudah di tiriskan, lalu angkat\n" +
                            "4. Kemudian goreng cabai, bawang, tomat lalu haluskan dgn blender atau ulag tambahkan sedikit air bila di blender\n" +
                            "5. Masukan sambel yg telah di haluskan lalu masukan sasa, royko, dan gula, terakhir masukan teri dan kacang lalu aduk dan siap di sajikan."
            },
            {
                "Bakso Kuah Praktis",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/fa056b27203db88d/751x532cq70/bakso-kecer-kuah-praktis-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 bungkus bakso ayam/sapi\n" +
                            "- 1/4 ketumbar\n" +
                            "- 6 butir kemiri\n" +
                            "- 2 siung bawang putih\n" +
                            "- 1 siung bawang mewah\n" +
                            "- Daun bawang\n" +
                            "- Daun seledri\n" +
                            "- 5 ceker\n" +
                            "- Bawang goreng\n" +
                            "- secukupnya Garam\n" +
                            "- secukupnya Royko\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Rebus ceker hingga mendidih dgn panci yg berbeda lalu geprek dgn ulekan\n" +
                            "2. Haluskan kemiri, ketumbar, bawang merah dan bawang putih lalu tumis hingga wangi\n" +
                            "3. Masukan air kedalam tumisan, masukan ceker yg sudah di geprek ke dalam kuah bakso\n" +
                            "4. Masukan baso yg sudah di potong\" tengah nya ke dalam kuah bakso yg sudah mendidih, beri garam dan royko secukupnya, dan tunggu hingga bakso mengembang, lalu tambahkan daun bawang dan seledri.\n" +
                            "5. Siap di santap dan tambahkan bawang goreng atau bon cabe"
            },
            {
                "Soun Goreng Bumbu Racik",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/4f5a8382a8d4d993/751x532cq70/soun-goreng-bumbu-racik-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 bungkus soun kering\n" +
                            "- 2 siung bawang merah\n" +
                            "- 1 siung bawang putih\n" +
                            "- 1/4 kemiri\n" +
                            "- 1/4 bumbu racik mie goreng\n" +
                            "- 2 telur\n" +
                            "- secukupnya Royko\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Rendam soun kering di dalam air panas hingga melunak jgn terlalu lama, lalu tiriskan di keranjang hingga tidak ada air\n" +
                            "2. Haluskan bawang merah, bawang putih, kemiri lalu tumis\n" +
                            "3. Kemudian masukan telur kedalam tumisan yg sudah wangi, bisa di campur dgn toping seperti wortel,sawi, atau sea food\n" +
                            "4. Masukan soun kedalam tumisan telur dan bumbum aduk menggunakan garpu atau capit agar merata dan masukan bumbu racik mie goreng dan tambah sedikit royko"
            },
            {
                "Tumis Daun Singkong",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/a266dcd9a14145d7/751x532cq70/tumis-daun-singkong-singkat-mantul-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 ikat daun singkong\n" +
                            "- 3 siung bawang putih\n" +
                            "- 5 siung bawang merah\n" +
                            "- sejumput garam\n" +
                            "- 1/2 ruas kunyit\n" +
                            "- secukupnya kaldu\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Ulek semua bahan sampe halus\n" +
                            "2. Tumis sampe harum..\n" +
                            "3. Masukan daun singkong..tunggu ampe layu lalu asukan garam dan kaldu."
            },
            {
                "Buncis Orak Arik",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/f0dbb078f3fd65f5/751x532cq70/buncis-orak-arik-telorenaksimpelsingkat-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 200 gr buncis(potong kecil2)\n" +
                            "- 4 butir telor(kocok)\n" +
                            "- 3 siung bawang putih(cincang)\n" +
                            "- 3 sdm fiber creamer(larutkan dengan air hangat 50ml)\n" +
                            "- secukupnya Garam\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Goreng bawang putih,hingga harum\n" +
                            "2. Masukkan buncis,diamkan sebentar kurleb 5menit\n" +
                            "3. Kemudian masukkan telor,air yg sdh dicampur creamer\n" +
                            "4. Buncis orak-arik telor,enak,simpel,singkat langkah memasak 3 foto\n" +
                            "5. Beri sedikit garam,orak-arik\n" +
                            "6. Taraaaa,,, sayur buncis enak simpel pun siap dinikmati. selamat mencoba."
            },
            {
                "Lumpia Simpel",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/c3e6631203a90726/751x532cq70/lumpia-singkat-ala-kadarnya-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "*) kulit lumpia:\n" +
                            "- 10 sdm tepung terigu\n" +
                            "- 3 sdm hawai /tepung tapioka\n" +
                            "- 1 butir telur ambil putihnya\n" +
                            "- 4 sdm minyak goreng\n" +
                            "- secukupnya air\n" +
                            "- bumbu isi mie putih :\n" +
                            "- 9 biji bawang merah\n" +
                            "- 4 biji bawang putih\n" +
                            "- 10 butir merica\n" +
                            "*) bahan isian lumpia:\n" +
                            "- 1 biji mie jagung\n" +
                            "- 2 batang wortel dipasrah\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Campur bahan kulit lumpia jadi satu setelah tercampur panaskan teflon diatas kompor dan cetak satu persatu\n" +
                            "2. Setelah itu masaklah bahan isi..kemudian masukkan dalam kulit lumpia satu persatu sampai habis\n" +
                            "3. Siap digoreng n dimakan"
            },
            {
                "Jamur Crispy",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/9e0bf68108609baf/751x532cq70/jamur-crispy-singkat-simple-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 bungkus jamur\n" +
                            "- 1 bungkus tepung bumbu instan\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Cuci jamur sampai bersih.lalu peras airnya jgn terlalu kering.kemudian gulingkan/balur ke dalam tepung bumbu serba guna sampai rata dan sambil dtekan2.kemudian goreng jamur sampai kecoklatan kemudian angkat dan tiriskan.siap disajikan.."
            },
            {
                "Tumis Kangkung",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/e7974db2d952b9e9/751x532cq70/tumis-kangkung-singkat-nikmaat-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 ikat kangkung (di petik2)\n" +
                            "- 1/2 terasi udang\n" +
                            "- 1 sdt garam\n" +
                            "- 2 sdt gula pasir\n" +
                            "- 1/2 ruas jari kunyit\n" +
                            "- 2 ruas jari lengkuas\n" +
                            "- 1 buah tomat\n" +
                            "- 4 bawang merah\n" +
                            "- 2 bawang putih\n" +
                            "- 3 sdm minyak\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Cuci kangkung sampai bersih\n" +
                            "2. Haluskan bumbu, diulek lebih nikmat\n" +
                            "3. Panaskan minyak, tips memasaak kangkung dengan minyak sedikit banyak dan tidak usah di beri air agar kangkung tetap hijau... masukkan bumbu oseng2\n" +
                            "4. Masukkan kangkung (tidak usah ditutup ya)... karena kalo ditutup akan merubah warna kangkung\n" +
                            "5. Dicicipi... sajikan Cocok untuk teman ayam fillet kfc"
            },
            {
                "Tumis Sawi",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/Recipe_2014_09_22_07_04_54_686_a937860afa92d727e8ed/751x532cq70/tumis-sawi-putih-singkat-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 1 ikat Sawi putih\n" +
                            "- 2 buah Bakso sapi/ikan\n" +
                            "- 2 buah Cabe rawit merah\n" +
                            "- 2 siung Bawang merah\n" +
                            "- 1 siung Bawang putih\n" +
                            "- secukupnya Garam\n" +
                            "- secukupnya Gula pasir\n" +
                            "- 1 sendok makan Saos tiram\n" +
                            "- secukupnya Minyak untuk menumis\n" +
                            "- 2 sendok makan Air matang\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Iris bawang merah bawang putih dan cabe. Potong bakso. Siangi sawi putih cuci b ersih dan potong sesuai selera\n" +
                            "2. Tumis dengan minyak bawang merah bawang putih cabe sampai harum.Masukkan baso dan sawi putih. Tambah garam gula dan saos tiram. Tambahkan air. Masak sebentar hingga sawi layu. Sajikan"
            },
            {
                "Sambal Goreng Tahu Kentang",
                    "Indonesia",
                    "https://img-global.cpcdn.com/003_recipes/759c85bc76414d6a/751x532cq70/sambal-goreng-tahu-kentang-simple-singkat%F0%9F%A4%A9-foto-resep-utama.jpg",
                    "BAHAN:\n" +
                            "- 4 biji kentang besar potong dadu\n" +
                            "- 5 biji tahu segar potong dadu\n" +
                            "- 5 siung bawang merah\n" +
                            "- 3 siung bawang putih\n" +
                            "- 1 saset bumbu instan Desaku sambal goreng\n" +
                            "- 2 lebar daun salam\n" +
                            "- secukupnya saos tomat\n" +
                            "- secukupnya garam dan gula\n" +
                            "\n" +
                            "LANGKAH:\n" +
                            "1. Goreng kentang dan tahu lalu sisihkan\n" +
                            "2. Ulek bawang merah dan bawang putih lalu tumis\n" +
                            "3. Setelah bumbunya sudah wangi masukkan tahu dan kentang goreng tadi lalu masukkan bumbu instan desaku sambal goreng tambahkan garam, gula pasir, daun salam dan koreksi rasa dan angkat siap untuk dinikmati"
            }
    };

    public static ArrayList<Makanan> getData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (String[] item : data) {
            Makanan makanan = new Makanan();
            makanan.setName(item[0]);
            makanan.setOrigin(item[1]);
            makanan.setPhoto(item[2]);
            makanan.setDescription(item[3]);

            list.add(makanan);
        }

        return list;
    }
}
