package physics.client.console;

import physics.library.core.quantities.Modifiers;
import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;
import physics.library.core.quantities.impl.*;

public class ConsoleLauncher {

	public static void main(String[] args) {
		Force force = new Force();
		Mass m = new Mass(32);
		Acceleration a = new Acceleration(13, new Unit(Modifiers.NORMAL));
		force.compute(m, a);
		System.out.println(force.getValue());
	}
}
