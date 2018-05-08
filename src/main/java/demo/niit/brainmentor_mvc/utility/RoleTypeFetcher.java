package demo.niit.brainmentor_mvc.utility;

public class RoleTypeFetcher {

	private static RoleTypeFetcher role_type_fetcher = null;

	public static RoleTypeFetcher getInstance() {
		if (role_type_fetcher == null)
			role_type_fetcher = new RoleTypeFetcher();

		return role_type_fetcher;
	}

	public RoleTypeFetcher() {

	}

//	public  String getRoleType(int i) {
//		switch (i) {
//		case 1:
//			return AppUtility.STUDENT;
//		case 2:
//			return AppUtility.ADMIN;
//		default:
//			return AppUtility.STUDENT;
//		}
//	}

}
