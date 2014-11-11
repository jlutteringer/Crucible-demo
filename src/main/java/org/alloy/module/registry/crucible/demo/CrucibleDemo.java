package org.alloy.module.registry.crucible.demo;

import org.alloy.forge.module.Dependencies;
import org.alloy.forge.module.ManagedModule;
import org.alloy.module.registry.crucible.Crucible;

public class CrucibleDemo extends ManagedModule {
	public CrucibleDemo() {
		this.name = "crucible-demo";
		this.friendlyName = "Crucible Demo";
		this.dependencies.add(Dependencies.of(Crucible.class));
	}
}