package by.tc.task01.dao;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final IApplianceDAO applianceDAO = new ApplianceDAO();
	
	private DAOFactory() {}

	public IApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
