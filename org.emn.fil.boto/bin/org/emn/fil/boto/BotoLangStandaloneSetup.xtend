/*
 * generated by Xtext 2.10.0
 */
package org.emn.fil.boto


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BotoLangStandaloneSetup extends BotoLangStandaloneSetupGenerated {

	def static void doSetup() {
		new BotoLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}