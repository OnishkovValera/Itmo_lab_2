package utils;
import storyclasses.Location;
public class Locations {
    public static void setLocation(Person prs, Location lcs){
        prs.location = lcs;
        System.out.println(prs.getName() + " переместился в " + "lcs");
    }
}
