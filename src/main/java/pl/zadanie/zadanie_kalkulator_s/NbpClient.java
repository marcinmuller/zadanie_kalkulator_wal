package pl.zadanie.zadanie_kalkulator_s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class NbpClient {
    @Autowired
    private RestTemplate restTemplate;
    public RateDTO getRate(String Code) {
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/A/"+Code+"/?format=json", RateDTO.class);
    }
}
