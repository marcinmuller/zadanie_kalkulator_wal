package pl.zadanie.zadanie_kalkulator_s;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Country {
    private double incomeTax;
    private double fixedCosts;
    private String currencyCode;
    private int workingDays;
}
