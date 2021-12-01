package com.recep.technologynews.data

import com.recep.technologynews.R
import com.recep.technologynews.model.NewsModel

object NewsList {
    private val newsList: MutableList<NewsModel> = mutableListOf()


    fun generateData(): List<NewsModel> {

        val newsXiaomi = NewsModel(
            title = "Xiaomi’nin elektrikli otomobilinden görseller paylaşıldı!",
            detail = "Genelde akıllı telefonları ile tanıdığımız üreticiler şu sıralar kendini aşarak otomotiv alanında da faaliyet " +
                    "gösterme çabasına içerisine girdi. Aslında Xiaomi’yi bir çaba içinde saymamız pek doğru olmaz, zira şirket " +
                    "halihazırda binlerce çeşit ürünü piyasaya sürdü. Bunla arasından en heyecan verici sayabileceğimiz elektrikli " +
                    "otomobil Xiaomi M1 için ilk görseller geldi.\n\n" +
                    "Oldukça sade görünen Xiaomi M1’in geleceğini Mart ayında yapılan şirket duyurusu ile öğrenmiştik. Xiaomi Motors " +
                    "adıyla kurulan yeni şirket, elektrikli otomobiller üretmek için çalışmalara başlayacaktı ve bu görüntüler ile bir " +
                    "dönüm yaşanıyor. Aracın bazı iç ve dış tasarım detaylarını gösteren render görüntüleri, Xiaomi’nin resmi forumu " +
                    "aracılığıyla paylaşıldı. Heyecan verici görünen fütüristik tasarımıyla Xiaomi M1, sedan tutkunlarını ayrı bir " +
                    "dünyaya kadar götürebilir.\n\n" +
                    "Özellikle Xiaomi akıllı telefon kullanıcılarının bildiği MIUI işletim sistemi otomobiller için harmanlanarak bu " +
                    "aracın navigasyon sistemine entegre edilmiş. Bu noktada Xiaomi cihazlarımızla iyi bir uyum " +
                    "yakalanmasını bekliyoruz.\n\n" +
                    "Teknik detaylar hakkında pek fazla bilgiye sahip olmasak da konfigürasyon seçeneklerinin neler olduğunu biliyoruz. " +
                    "Türkçe desteklemeyen Xiao AI sesli asistanı navigasyon sistemine entegre şekilde bulunacak ve kokpitte holografik " +
                    "ve geniş bir kontrol merkezi olacak.\n\n" +
                    "Önümüzdeki yıllarda toplamda 10 milyar dolar yatırımla hareket edecek olan Xiaomi Motors’un hedefleri büyük. " +
                    "Özellikle uzak doğu pazarında sevilen üreticinin elektrikli otomobillerle nasıl bir izlenim kazanacağını " +
                    "da merak ediyoruz. Sizler Xiaomi M1 tasarımını nasıl buldunuz?\n",
            image = R.drawable.xiaomi_car_image
        )

        val newsSmartPhone = NewsModel(
            title = "Almanya, akıllı telefonlara 7 yıl boyunca yedek parça ve güvenlik güncelleme desteği verilmesini istiyor.",
            detail = "Almanya hükümeti tarafından yapılan öneride yer alan bilgilere göre akıllı telefonlar ve tablet için için " +
                    "7 yıl boyunca güvenlik güncellemesi ve yedek parça desteğinin verilmesi talep ediliyor.\n" +
                    "Üreticiler, teknoloji dünyasının en çok satış yapılan ve önemli alanlarından biri olan akıllı telefonlar " +
                    "için genelde 2-3 yıl arasında yedek parça ve güncelleme desteği veriyor. Bu durumun değişmesi gerektiğini " +
                    "vurgulayan Almanya, Avrupa Birliği'ne konu ile ilgili yeni bir öneride bulundu.\n\n" +
                    "Almanya hükümeti tarafından yapılan öneride yer alan bilgilere göre akıllı telefonlar ve tablet için için " +
                    "7 yıl boyunca güvenlik güncellemesi ve yedek parça desteğinin verilmesi talep ediliyor. Almanya'nın " +
                    "önerisi ile gündeme gelen bu konu aslında uzun zamandır Avrupa Birliği'nin gündeminde. \n\n" +
                    "Hatırlatmak gerekirse Avrupa Birliği, şu an için üreticiden üreticiye değişmekle birlikte 2 ila 3 yıl " +
                    "arasında verilen desteği güncelleme desteğini 5 yıla, yedek parça desteğini ise 6 yıla çekmek için " +
                    "çalışıyor. 5-6 yılın yeterli olmadığını savunan Almanya, yaptığı öneri ile birlikte söz konusu " +
                    "desteklerin 7 yıl boyunca sürmesi gerektiğini paylaştı.\n\n" +
                    "Güvenlik güncellemesi ve yedek parça desteğinin sürelerinin yanı sıra yedek parçaların fiyatları " +
                    "ile ilgili bir öneride de bulunan Almanya, yedek parça fiyatlarının pahalı olduğunu ve daha uygun " +
                    "fiyatlardan kullanıcılara sunulması gerektiğini de belirtti.\n\n" +
                    "Almanya tüketicilerin yanında duran bir öneri ile birlikte Avrupa Birliği'nin daha sert adımlar " +
                    "atmasını isterken üreticiler ise bu isteklerin aşırıya kaçtığını söylüyor. Apple, Samsung, " +
                    "Google ve Huawei gibi önemli üreticileri temsil eden DigitalEurope, 3 yıl güvenlik güncellemesi " +
                    "verilmesi gerektiğini savunuyor.\n",
            image = R.drawable.phone_parts_image
        )

        val newsGoogle = NewsModel(
            title = "Google Play Store, uygulama derecelendirmelerini kullanıcıların ülkesine ve cihazına göre özelleştirecek.",
            detail = "Google Play Ürün Yöneticileri Tom Grinsted, Scott Lin ve Tat Yang Koh'ın kaleme aldığı blog yazısına göre " +
                    "Google'ın uygulama mağazası Play Store, ülkelere ve cihazlara göre özelleşiyor. Buna göre Google, uygulama " +
                    "puanlarını tek bir derecelendirme yerine cihazınızın kayıtlı olduğu ülkeye özel derecelendirmelere ve belirli " +
                    "derecelendirmelere ayırmayı planlıyor.\n\n" +
                    "Google, farklı cihaz türleri için desteğinizi genişletmek, kullanıcı arayüzlerinizde yapabileceğiniz en " +
                    "önemli ve etkili değişikliklerden biri olduğunu söylüyor. Şirket bu kapsamda çeşitli cihaz türlerinde " +
                    "fırsatları tespit etmeyi ve gelişmiş deneyimlerin etkisini izlemeyi kolaylaştırmak için derecelendirme " +
                    "sayfasına yeni Cihaz Türü boyutları eklediğini belirtiyor. Ayrıca, tablet kullanıcılarının geliştiricileri " +
                    "nasıl derecelendirdiğini veya Chrome OS kullanıcıların incelemelerinde neler söylediğini kolayca görebilmek " +
                    "için incelemelere Cihaz Türü filtresi de eklendi.\n\n" +
                    "Google, bu kasım ayında ülkeye özel derecelendirmeleri sunmayı ve 2022'de tabletler, katlanabilir cihazlar, " +
                    "Chrome OS, Wear OS veya Android Auto gibi durumlara ve cihazlara özel derecelendirmeler oluşturmayı planlıyor. " +
                    "Şirket ayrıca, Google'ın yeni derecelendirme hesaplama yöntemi, uygulamalarının derecelendirmesini anlamlı " +
                    "bir şekilde değiştirirse, geliştiricileri her iki değişiklikten önce de bilgilendireceğini belirtiyor.\n\n" +
                    "Yani kasım ayından itibaren, telefon kullanıcılarının bulundukları ülke veya bölge için belirli puanları " +
                    "göreceği anlamına geliyor. Dolayısıyla, Japonya'daki bir kullanıcı, diğer Japon kullanıcılar tarafından " +
                    "gönderilenlerden oluşturulan uygulama puanlarını görecek.\n\n" +
                    "Google, Play Store'daki herhangi bir değişiklikten en az 10 hafta önce, uygulama geliştiricisinin görmeyi " +
                    "bekleyebileceği değişikliği otomatik olarak analiz edecek ve önemli bir pazardaki herhangi bir cihaz " +
                    "türünde 0,2 yıldızın üzerinde bir değişiklik görüldüğünde geliştiriciye ulaşacak. Bu da uygulamasında önemli " +
                    "değişiklikler yapmak isteyip istemediğini planlaması için geliştiriciye zaman tanıyacak.\n",
            image = R.drawable.playstore_image
        )


        val newsCar = NewsModel(
            title = "CUPRA'dan radikal tasarım: UrbanRebel Konsept",
            detail = "CUPRA, radikal bir tasarıma sahip konsept otomobili UrbanRebel’i tanıttı. Otomobil markanın 2025 " +
                    "yılında pazara sunacağı şehir içi kullanıma uygun elektrikli otomobilin tasarım dili hakkında da ipuçları veriyor.\n" +
                    "CUPRA konsept otomobili UrbanRebel ile şehir içi kullanıma uygun elektrikli otomobillere radikal " +
                    "bir yorum getiriyor. Markanın gelecekteki tasarım dili hakkında ipuçları veren otomobil, Münih’te " +
                    "hizmete girecek yeni CUPRA City Garage açılışı öncesi, IAA Münih Uluslararası Otomobil Fuarı’nda sergilenecek. \n" +
                    "\n" +
                    "CUPRA CEO’su Wayne Griffiths, “CUPRA UrbanRebel Konsept, şirketimizin 2025 yılında pazara sunmayı " +
                    "planladığı şehir içi kullanıma uygun elektrikli otomobilimizin radikal bir yorumu. Bu konsept " +
                    "gelecekteki tasarım dilimizi yansıtıyor. Bu otomobil yalnızca şirketimiz için değil aynı zamanda " +
                    "Volkswagen Grup için de anahtar bir stratejik proje, çünkü amacımız grup markaları için Martorell’de " +
                    "yılda 500 binden fazla kentsel elektrikli otomobil üretmek” dedi.\n" +
                    "CUPRA UrbanRebel Konsept, toplam 4,080mm uzunluk, 1,795mm genişlik ve 1,444mm yüksekliğe sahip " +
                    "yarışçı görünümüyle dikkat çekiyor.\n" +
                    "SADECE 3.2 SANİYEDE SIFIRDAN 100’E\n" +
                    "CUPRA UrbanRebel Konsept, sürekli olarak 250kW maksimumda ise 320kW güç üretebilen motora sahip." +
                    " Otomobil sıfırdan saatte 100 kilometre hıza yalnızca 3.2 saniyede çıkabiliyor.\n",
            image = R.drawable.cupra_car_image
        )

        newsList.add(newsCar)
        newsList.add(newsGoogle)
        newsList.add(newsSmartPhone)
        newsList.add(newsXiaomi)
        newsList.add(newsCar)
        newsList.add(newsGoogle)
        newsList.add(newsSmartPhone)
        newsList.add(newsXiaomi)
        newsList.add(newsCar)
        newsList.add(newsGoogle)
        newsList.add(newsSmartPhone)
        newsList.add(newsXiaomi)


        return newsList
    }
}