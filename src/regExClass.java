import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExClass {

	public static void main(String[] args) {

		String name = "Arslan Zulfiqar";
		char section = 'A';
		String sID = "FA16-BSE-009";
		String IDs[] = {"FA14-BSE-013-ATK", "SA16-BSC-019-ATK",
						"FA14-BSCS-013-LHR", "FA14-BSCS-000-ISD",
						"SP34-BSCS-999-ATK", "FA14-MCS-013-ATK",
						"SP29-ABC-013-ATK", "SP14-BSCS-011-WAH",
						"FA2019-BSE-210-ATK", "FA14-BS-013-ATK"};
		
		String session = "(FA|SP)"+"[1-2]"+"[0-9]";
		String program = "[A-Z]{3,4}";
		String rollNo = "([0-9]{2}[1-9]|[0-9][1-9][0-9]|[1-9][0-9]{2})";
		String campus = "(ATK|ISD|WAH)";
		String id = session+"-"+program+"-"+rollNo+"-"+campus;

		Pattern p = Pattern.compile(id);

		System.out.println("Name : "+name);
		System.out.println("Section : "+section);
		System.out.println("Student Id : "+sID);
		System.out.println("Validations result is as follows :\n");

		for(int i=0;i<IDs.length;i++)
		{
			Matcher m = p.matcher(IDs[i]);
			if(m.matches())
				System.out.printf("%-20s %s", IDs[i] , "Valid");
			else
				System.out.printf("%-20s %s", IDs[i] , "Invalid");
			System.out.println();
		}
	}
}