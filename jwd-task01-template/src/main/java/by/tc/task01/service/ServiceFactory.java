package by.tc.task01.service;

public final class ServiceFactory {

	private static final ServiceFactory instance = new ServiceFactory();

	private final IApplianceService applianceService = new ApplianceService();
	
	private ServiceFactory() {}

	public IApplianceService getApplianceService() {

		return applianceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
