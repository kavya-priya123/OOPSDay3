package ai.jobiak.core;

public class TestStatic2 {

	public static void main(String[] args) {
		
		DefineStatic.a=120;
		DefineStatic.method();
		
		DefineStatic obj = new DefineStatic();
		obj.method();
		
		obj.a=140;
		obj.method();
		
		DefineStatic obj2 = new DefineStatic();
		obj2.method();
		
		DefineStatic.method();
	}

}
