package week05;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
		for (char l : log.toCharArray()) {
			System.out.print(l + " ");
		}
	System.out.println();
	}
	
	@Override
	public void error(String error) {
		
	System.err.print("ERROR: ");
	for (char e : error.toCharArray()) {
		System.err.print(e + " ");
	}
	System.out.println();	
	}

}
