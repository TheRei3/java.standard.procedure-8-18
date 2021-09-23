package ex8no18;

public class ex8no18 {  //  435p
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() { }
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
