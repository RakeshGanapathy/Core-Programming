package core.abstraction.impl;

public class SubClassImpl extends AbstractImpl {
	public SubClassImpl() {
		super();
	}

	public static void main(String[] args) {
		SubClassImpl obj = new SubClassImpl();
		obj.provideImpl();
		obj.testMethod();
		System.out.println(obj.iValue);
		System.out.println(AbstractImpl.count);
		AbstractImpl.print();
		
	}

	@Override
	void provideImpl() {
		System.out.println("for inheriting  override this method");
	}

}
