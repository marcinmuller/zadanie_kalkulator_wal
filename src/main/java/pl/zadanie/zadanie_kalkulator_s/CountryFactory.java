package pl.zadanie.zadanie_kalkulator_s;

import org.springframework.stereotype.Component;

@Component
public class CountryFactory {
    private final String POLAND="POLAND";
    private final String GERMANY="GERMANY";
    private final String UK="UK";

    public Country makeCountry(String country){
        switch (country){
            case POLAND:
                return new Country(0.19,1200,"PLN",22);
            case GERMANY:
                return new Country(0.20,800,"EUR",22);
            case UK:
                return new Country(0.25,600,"GBP",22);
            default:
                return null;
        }
    }
}
