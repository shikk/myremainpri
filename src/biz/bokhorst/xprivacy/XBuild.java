package biz.bokhorst.xprivacy;


public class XBuild extends XHook{
	
	private Methods mMethod;
	private String mClassName;
	private static final String cClassName = "android.os.Build";
	
	protected XBuild(String restrictionName, String methodName, String specifier) {
		super(restrictionName, methodName, "xbuild");
	}

	private enum Methods {
		
	};
	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return cClassName;
	}
	@Override
	protected void before(XParam param) throws Throwable {
		// TODO Auto-generated method stub
		System.err.println("xbuild xxxxxxxxxxxxxx  before :xxxxxxxxxxxxxxxxxx");
	}
	@Override
	protected void after(XParam param) throws Throwable {
		// TODO Auto-generated method stub
		System.err.println("xbuild xxxxxxxxxxxxxx  after :xxxxxxxxxxxxxxxxxx");
	}
}
