package cn.bouncyslime.javaKnowledge.exception;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm{
	public StormyInning() throws BaseballException{
	}
	public StormyInning(String s) throws BaseballException, Foul{
	}
	
//	@Override
//	public void walk() throws Foul{
		// 基类中没有异常说明，子类中也不能有异常说明
//	}		
	
//	public void event() throws RainedOut{
//	}
	
	@Override
	public void atBat() throws PopFoul {
	}
	@Override
	public void event() {
	}
	@Override
	public void rainHard() throws RainedOut {
	}
	
	public static void main(String[] args) {
		try {
			StormyInning stormyInning = new StormyInning();
			stormyInning.atBat();
		}catch (PopFoul e) {
			System.out.println("Pop foul");
		}catch (BaseballException e) {
			System.out.println("generic baseball exception");
		}
		
		try {
			Inning inning = new StormyInning();
			inning.atBat();
		}catch (Strike e) {
			System.out.println("Strike");
		}catch (Foul e) {
			System.out.println("foul");
		}catch (BaseballException e) {
			System.out.println("generic baseball exception");
		}
	}
}
