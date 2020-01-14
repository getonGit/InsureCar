package resources;

import org.testng.annotations.DataProvider;


public class CarDataProvider {

	//String Brand, Model, BodyTpe, Fuel, Engine, Car;
	
	
	
	
	
	@DataProvider(name="CarObject")
 	public Object[][] addCarData() {
 		return new Object[][] {
 			
 			{"BMW", "1er", "Cabrio", "Diesel", "150 kW / 204 PS", "123D CABRIO"},
 			{"BMW", "2er", "Coupe", "Benzin", "185 kW / 252 PS", "230I COUPE"},
 			{"BMW", "5er", "Limousine", "Hybrid", "225 kW / 306 PS", "ACTIVEHYBRID 5"},
	
 			{"VW", "Caddy", "Kasten", "Benzin", "96 kW / 131 PS", "CADDY 1.4"},
 			{"VW", "Golf", "Cabrio", "Benzin", "70 kW / 95 PS", "GOLF CABRIOLET"},
 			{"VW", "Polo", "Kombi", "Benzin", "74 kW / 101 PS", "POLO VARIANT 1.6"},
 			
 			{"FORD", "C-Max", " ", "Gas", "107 kW / 145 PS", "FOCUS C-MAX 2.0"},
			{"FORD", "Fiesta", " ", "Benzin", "40 kW / 54 PS", "FIESTA"},
			{"FORD", "KA", " ", "Benzin", "44 kW / 60 PS", "KA 1.3"}
 		
};
	}
}
	

