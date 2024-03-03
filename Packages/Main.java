/*EXP : 6 Develop a Java Program to create Java package and illustrate the process of 
importing a user defined Java Package.

Develop a java application to implement
currency converter (Dollar to INR, EURO to INR, Yen to INR and vice versa), 
distance converter (meter to KM, miles to KM and vice versa), 
time converter (hours to minutes, seconds, and vice versa) using packages.
*/
//Main Class
import cc.*;
import dc.*;
import tc.*;
public class Main {
    public static void main(String args[]) {
        CurrencyC obj = new CurrencyC();
        DistanceC obj1 = new DistanceC();
        TimeC obj2 = new TimeC();
        obj.dollartorupee();
        obj.rupeetodollar();
        obj.eurotorupee();
        obj.rupeetoeuro();
        obj.yentoruppe();
        obj.ruppetoyen();
        obj1.mtokm();
        obj1.kmtom();
        obj1.milestokm();
        obj1.kmtomiles();
        obj2.hourstominutes();
        obj2.minutestohours();
        obj2.hourstoseconds();
        obj2.secondstohours();
    }
}
