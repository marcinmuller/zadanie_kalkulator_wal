package pl.zadanie.zadanie_kalkulator_s;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
//@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateDTO {
    private double mid;
    private String effectiveDate;

    @JsonProperty("rates")
    private void unpackNested(Map<String,Object>[] rates) {
        this.mid = (double)rates[0].get("mid");
        this.effectiveDate = (String)rates[0].get("effectiveDate");
    }
}
