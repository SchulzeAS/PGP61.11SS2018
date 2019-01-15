import java.awt.Font;
import java.util.Date;

public class SingletonLogger {

	// type of levels
	public static final int ERROR = -1;
	public static final int WARN = 0;
	public static final int INFO = 1;
	public static final int DEBUG = 2;

	private int level;

	public SingletonLogger() {

	}

	public SingletonLogger(int lvl) {
		this.level = lvl;

	}
	// add constructor, members and methods for Singleton

	public void error(String txt) {
		if (level >= ERROR)
			System.out.println(time() + "ERROR!" + txt.toUpperCase());
	}

	@SuppressWarnings("deprecation")
	public String time() {
		return new java.util.Date().toGMTString() + "| ";
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void warning(String txt) {
		if (level >= WARN)
			System.out.println(time() + "WARNING-->" + txt);
	}

	public void info(String txt) {
		if (level >= INFO)
			System.out.println(time() + "INFO-->" + txt);
	}

	public void debug(String txt) {
		if (level >= DEBUG)
			System.out.println(time() + "DEBUG-->" + txt);
	}

	public static void main(String[] args) {
		SingletonLogger sl = new SingletonLogger();
		sl.level = DEBUG;
		sl.error("Trump is president");
		sl.debug("code is crap");
		sl.level = WARN;
		System.out.println("\n");
		sl.error("Trump is president");
		sl.debug("code is crap");
		
	}
}