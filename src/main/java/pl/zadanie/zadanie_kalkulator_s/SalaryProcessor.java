package pl.zadanie.zadanie_kalkulator_s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalaryProcessor {
    @Autowired
    NbpClient nbpClient;
    @Autowired
    CountryFactory countryFactory;

    public double process(double dailyPay, String countryName) {
        Country country=countryFactory.makeCountry(countryName);
        double rate=1d;
        if(!countryName.equals("POLAND"))
            rate=nbpClient.getRate(country.getCurrencyCode()).getMid();
        double income=(country.getWorkingDays()*dailyPay-country.getFixedCosts());
        if(income>0)
            return Math.floor(income*rate*(1-country.getIncomeTax())*100)/100d;
        else
            return Math.floor(income*rate*100)/100d;
    }
}