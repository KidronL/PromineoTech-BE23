package week05;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String log) {
		System.out.print("***" + log + "***\n");
	}
	
	@Override
	public void error(String error) {
		System.err.print("****************\n" + "***Error: " + error + "***\n" + "****************\n");
	}

}
