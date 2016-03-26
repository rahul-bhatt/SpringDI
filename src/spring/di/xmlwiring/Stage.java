package spring.di.xmlwiring;

public class Stage {
	private Stage(){}
	
	//Initialization on demand holder (thread-safe Singleton)
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}

}
