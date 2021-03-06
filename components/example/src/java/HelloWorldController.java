package org.torweg.pulse.component.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.torweg.pulse.annotations.Action;
import org.torweg.pulse.bundle.Controller;
import org.torweg.pulse.annotations.Permission;
import org.torweg.pulse.annotations.AnyAction;

public class HelloWorldController extends Controller {

	private static final Logger LOGGER = LoggerFactory
						.getLogger(HelloWorldController.class);

	@Action("helloPulse")
	@Permission("greet")
	public final void helloWorld() {
		LOGGER.info("Hello World");
	}
	@AnyAction
	public final void alwaysRun() {
		LOGGER.info("I run always");
	}
}
