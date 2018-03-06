package pl.zadanie.zadanie_kalkulator_s;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZadanieKalkulatorSApplicationTests {

	@Test
	public void testCountryFactoryCurrencyPoland() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("POLAND");
//		then
		Assert.assertEquals("PLN", country.getCurrencyCode());
	}
	@Test
	public void testCountryFactoryCurrencyGermany() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("GERMANY");
//		then
		Assert.assertEquals("EUR", country.getCurrencyCode());
	}
	@Test
	public void testCountryFactoryCurrencyUK() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("UK");
//		then
		Assert.assertEquals("GBP", country.getCurrencyCode());
	}

	@Test
	public void testCountryFactoryIncomeTaxPoland() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("POLAND");
//		then
		Assert.assertEquals(0.19, country.getIncomeTax(),0);
	}
	@Test
	public void testCountryFactoryIncomeTaxGermany() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("GERMANY");
//		then
		Assert.assertEquals(0.20, country.getIncomeTax(),0);
	}
	@Test
	public void testCountryFactoryIncomeTaxUK() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("UK");
//		then
		Assert.assertEquals(0.25, country.getIncomeTax(),0);
	}

	@Test
	public void testCountryFactoryFixedCostsPoland() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("POLAND");
//		then
		Assert.assertEquals(1200, country.getFixedCosts(),0);
	}
	@Test
	public void testCountryFactoryFixedCostsGermany() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("GERMANY");
//		then
		Assert.assertEquals(800, country.getFixedCosts(),0);
	}
	@Test
	public void testCountryFactoryFixedCostsUK() {
//		given
		CountryFactory countryFactory = new CountryFactory();
//		when
		Country country = countryFactory.makeCountry("UK");
//		then
		Assert.assertEquals(600, country.getFixedCosts(),0);
	}

	@Test
	public void testCountryFactoryWorkinfDaysPoland() {
		//given
		CountryFactory countryFactory = new CountryFactory();
		//when
		Country country = countryFactory.makeCountry("POLAND");
		//then
		Assert.assertEquals(22, country.getWorkingDays(),0);
	}
	@Test
	public void testCountryFactoryWorkinfDaysGermany() {
		//given
		CountryFactory countryFactory = new CountryFactory();
		//when
		Country country = countryFactory.makeCountry("GERMANY");
		//then
		Assert.assertEquals(22, country.getWorkingDays(),0);
	}
	@Test
	public void testCountryFactoryWorkinfDaysUK() {
		//given
		CountryFactory countryFactory = new CountryFactory();
		//when
		Country country = countryFactory.makeCountry("UK");
		//then
		Assert.assertEquals(22, country.getWorkingDays(),0);
	}

}
