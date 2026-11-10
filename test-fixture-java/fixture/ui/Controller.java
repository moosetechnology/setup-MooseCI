package fixture.ui;

import fixture.infra.Repository;

public class Controller {

	private Repository repository = new Repository();

	public String show() {
		return repository.load();
	}
}
