
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GACLStandaloneSetup extends GACLStandaloneSetupGenerated{

	public static void doSetup() {
		new GACLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

