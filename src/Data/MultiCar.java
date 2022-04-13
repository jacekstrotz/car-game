/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author strotz
 */
public class MultiCar {
    static public Car[] list;
    
    static public void Initialize() {
        list = new Car[30];
        list[0] = new Car("Audi A4", "images/Audi.jpg", 2017, 2.0, false);
        list[1] = new Car("Ford Ranger", "images/Ford.jpg", 2003, 2.3, false);
        list[2] = new Car("Chevrolet Silverado", "images/Chevrolet.jpg", 2010, 6.2, false);
        list[3] = new Car("Ferrari 488 Pista", "images/Ferrari.jpg", 2019, 3.9, false);
        list[4] = new Car("Porsche 911 GT3RS", "images/Porsche.jpg", 2020, 4.0, false);
        list[5] = new Car("Bugatti Chiron", "images/Bugatti1.jpg", 2020, 8.0, false);
        list[6] = new Car("Bugatti Divo", "images/Bugatti2.jpg", 2022, 8.0, false);
        list[7] = new Car("Ferrari 458 Spider", "images/Ferrari2.jpg", 2015, 4.5, false);
        list[8] = new Car("Lamborghini Gallardo", "images/Lamborghini.jpg", 2015, 5.2, false);
        list[9] = new Car("Lamborghini Veneno", "images/Lamborghini2.jpg", 2014, 6.5, false);
        list[10] = new Car("Koenigsegg Agera RS", "images/Koenigsegg.jpg", 2018, 5.0, false);
        list[11] = new Car("Pagani Huayra", "images/Pagani.jpg", 2016, 6.0, false);
        list[12] = new Car("Chevrolet Corvette", "images/Corvette.jpg", 2022, 6.2, false);
        list[13] = new Car("Lexus LC500", "images/Lexus.jpg", 2022, 5.0, false);
        list[14] = new Car("BMW M8 Competition", "images/BMW.jpg", 2020, 4.4, false);
        list[15] = new Car("Ford Raptor", "images/F150.jpg", 2015, 6.2, false);
        list[16] = new Car("Tesla Model S", "images/Tesla.jpg", 2019, 100.0, true);
        list[17] = new Car("Tesla Model 3", "images/Tesla2.jpg", 2019, 82.0, true);
        list[18] = new Car("Tesla Model X", "images/Tesla3.jpg", 2020, 100.0, true);
        list[19] = new Car("Tesla Model Y", "images/Tesla4.jpg", 2020, 75.0, true);
        list[20] = new Car("Mercedes AMG GT63", "images/Mercedes.jpg", 2020, 4.0, false);
        list[21] = new Car("Cadillac CTS-V", "images/Cadillac.jpg", 2020, 6.2, false);
        list[22] = new Car("Rolls-Royce Phantom", "images/Rolls-Royce.jpg", 2022, 6.7, false);
        list[23] = new Car("Maserati MC20", "images/Maserati.jpg", 2022, 3.0, false);
        list[24] = new Car("Dodge Durango SRT 392", "images/Durango.jpg", 2022, 6.4, false);
        list[25] = new Car("Dodge Demon", "images/Demon.jpg", 2018, 6.2, false);
        list[26] = new Car("Dodge Charger Hellcat", "images/Charger.jpg", 2018, 6.2, false);
        list[27] = new Car("Ford Mustang GT500", "images/GT500.jpg", 2020, 5.2, false);
        list[28] = new Car("Chevrolet Camaro ZL1", "images/Camaro.jpg", 2022, 6.2, false);
        list[29] = new Car("Jaguar XF", "images/Jaguar.jpg", 2022, 2.0, false);
    }
    
    static public String Display() {
        String app = "";
        for (int i = 0; i < list.length; i++)
           app += (list[i].toString()+"\n");
        
        return app;
    }
    
    static public void Shuffle() {
        Car old = list[0];
        while (list[0] == old) {
            for (int i = 0; i < list.length; i++) {
                int randomNum = Utility.getRandomNumberUsingNextInt(0, list.length - 1);
                Car temp = list[randomNum];
                list[randomNum] = list[i];
                list[i] = temp;
            }
        }
    }
    
    static public Car getIndex(int n) {
        return list[n];
    }
    
    static public void sortYear() {
        for (int i = 0; i < list.length; i++) {
            int indexOfSmallest = i;
            for (int j = i+1; j < list.length; j++) {
                if ( list[j].getYear() < list[indexOfSmallest].getYear() ) {
                    indexOfSmallest = j;
                }
            }
            Car temp = list[i];
            list[i] = list[indexOfSmallest];
            list[indexOfSmallest] = temp;
        }
    }
    
    static public void sortName() {
        for (int i = 0; i < list.length; i++) {
            int indexOfSmallest = i;
            for (int j = i+1; j < list.length; j++) {
                if (Utility.isLessThan(list[j].getName(), list[indexOfSmallest].getName())) {
                    indexOfSmallest = j;
                }
            }
            Car temp = list[i];
            list[i] = list[indexOfSmallest];
            list[indexOfSmallest] = temp;
        }
    }
}
