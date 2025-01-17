import axios from 'axios';

// Aşağıdaki Fonksiyonu değiştirmeyin

export async function ipAdresimiAl() {
  return await axios({
    method: 'get',
    url: 'https://apis.ergineer.com/ipadresim',
  }).then(function (response) {
    return response.data;
  });
}

/*

	ADIM 1: Aşağdıdaki getData() fonskiyonunda axios kullanarak, aşağıdaki URL'ye GET sorgusu atacağız:
  https://apis.ergineer.com/ipgeoapi/{ipAdresiniz}

  Fonksiyon gelen data'yı(obje) geri dönmeli
	
	NOT: ipAdresinizi ipAdresimiAl fonksiyonu ile alabilirsiniz.

  NOT2: gelen datayı browser'da network tab'ından inceleyin. 
  (network tab'ından inceleyemezseniz get isteklerinin URL'ini browser'dan açıp da kontrol edebilirsiniz. 😉)

  Bu data Adım 2'de oluşturacağınız component'de argüman olarak kullanılıyor, önden içindeki verilere(key-Value ikililerine) bakmanız iyi olur).
*/

export async function getData() {
  /* kodlar buraya */
  const myIp = await ipAdresimiAl();
  const response = await axios.get(
    `https://apis.ergineer.com/ipgeoapi/${myIp}`
  );
  return response.data;
}

/*
	ADIM 2: Aşağıdaki cardOlustur fonskiyonunu argüman olarak sadece 1 nesne alacak şekilde tanımlayın.

  Bu fonksiyonda DOM metotlarını ve özelliklerini kullanarak, aşağıdaki element'i oluşturup dönün.

  Not: Ülke Bayrağını bu linkten alabilirsiniz:
  'https://flaglog.com/codes/standardized-rectangle-120px/{ülkeKodu}.png';
	
	<div class="card">
    <img src={ülke bayrağı url} />
    <div class="card-info">
      <h3 class="ip">{ip adresi}</h3>
      <p class="ulke">{ülke bilgisi (ülke kodu)}</p>
      <p>Enlem: {enlem} Boylam: {boylam}</p>
      <p>Şehir: {şehir}</p>
      <p>Saat dilimi: {saat dilimi}</p>
      <p>Para birimi: {para birimi}</p>
      <p>ISP: {isp}</p>
    </div>
  </div>
*/

export function cardOlustur(dataObj) {
  /* kodlar buraya */
  const card = document.createElement('div');
  card.classList.add('card');

  const img = document.createElement('img');
  img.src = `https://flaglog.com/codes/standardized-rectangle-120px/${dataObj['ülkeKodu']}.png`;

  const cardInfo = document.createElement('div');
  cardInfo.classList.add('card-info');

  const h3 = document.createElement('h3');
  h3.classList.add('ip');
  h3.textContent = dataObj.sorgu;

  const pTexts = [
    { class: 'ulke', text: `${dataObj['ülke']} (${dataObj['ülkeKodu']})` },
    { text: `Enlem: ${dataObj.enlem} Boylam:${dataObj.boylam}` },
    { text: `Şehir: ${dataObj['şehir']}` },
    { text: `Saat dilimi: ${dataObj.saatdilimi}` },
    { text: `Para birimi: ${dataObj.parabirimi}` },
    { text: `ISP: ${dataObj.isp}` },
  ];

  const pElements = pTexts.map((pText) => {
    const p = document.createElement('p');
    if (pText.class) p.classList.add(pText.class);
    p.textContent = pText.text;
    return p;
  });

  cardInfo.append(h3, ...pElements);
  card.append(img, cardInfo);

  return card;
}
