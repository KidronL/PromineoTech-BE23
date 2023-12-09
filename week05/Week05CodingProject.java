package week05;

public class Week05CodingProject {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Testing");
		asteriskLogger.error("Testing");
		
		spacedLogger.log("WOAH");
		spacedLogger.error("WOAH");

	}

}
