import java.sql.Date;
import java.sql.SQLException;
import java.util.*;

public class Main{
	public static void main(String[] arg) throws SQLException {
		// DerbyBaseDao connectionTest = new DerbyBaseDao(); check connection hier
		
		ReizigerDerbyDaolmpl ro1 = new ReizigerDerbyDaolmpl();
		OVChipkaartDerbyDAOImpl ov1 = new OVChipkaartDerbyDAOImpl();

		// nieuwe reiziger
//		 Reiziger r1 = new Reiziger(4, "Klaas", "", "Nom", java.sql.Date.valueOf("1994-04-8"));
//		 ro1.save(r1);

		// loop om alles te zien
		 System.out.println("Alle reizigers: ");
		 List<Reiziger> reizigers = ro1.findAll();
		 for (Reiziger reiziger : reizigers) {
		 	System.out.println("Reiziger: #" +reiziger.getReizigerID() + " "+reiziger.getVoorletters()+ ". "+ reiziger.getTussenvoegsel()+" "+reiziger.getAchternaam()+ " geboortedatum: " +reiziger.getGbdatum());
		 }

//		 find by date reizigers
		 System.out.println("\nGevonden reizigers: ");
		 List<Reiziger> gevonden_reizigers = ro1.findByGBdatum("1992-05-04");
		 for (Reiziger gevonden_reiziger : gevonden_reizigers) {
		 	System.out.println("Reiziger: #" +gevonden_reiziger.getReizigerID() + " "+gevonden_reiziger.getVoorletters()+ ". "+ gevonden_reiziger.getTussenvoegsel()+" "+gevonden_reiziger.getAchternaam()+ " geboortedatum: " +gevonden_reiziger.getGbdatum());
		 }
//		
		// OVChipkaart test
		//Nieuw OvChipkaart
//		 Ovchipkaart k1 = new Ovchipkaart(3, java.sql.Date.valueOf("2025-12-23"), 2, 8, 3);
//		 ov1.save(k1);

		// loop om alles te zien
		System.out.println("\nAlle OvChipkarten: ");
		List<Ovchipkaart> ovchipkarten = ov1.findAll();
		for (Ovchipkaart ovchipkaart : ovchipkarten) {
			System.out.println("Ovchipkaart: #" +ovchipkaart.getKaartnummer() + " "+ovchipkaart.getGeldigtot()+ ". "+ ovchipkaart.getKlasse()+" "+ovchipkaart.getSaldo()+ " rezigerID: " +ovchipkaart.getReizigerid());
		}

//		System.out.println("\nGevonden OVChipkarten: ");
//		List<Ovchipkaart> gevonden_ovchipkarten = ov1.findByReiziger(1);
//		for (Ovchipkaart gevonden_ovchipkaart : gevonden_ovchipkarten) {
//			System.out.println("Ovchipkaart: #" +gevonden_ovchipkaart.getKaartnummer() + " "+gevonden_ovchipkaart.getGeldigtot()+ ". "+ gevonden_ovchipkaart.getKlasse()+" "+gevonden_ovchipkaart.getSaldo()+ " rezigerID: " +gevonden_ovchipkaart.getReizigerid());
	}
}