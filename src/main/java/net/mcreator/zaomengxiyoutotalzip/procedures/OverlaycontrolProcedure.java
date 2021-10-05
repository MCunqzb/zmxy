package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class OverlaycontrolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Overlaycontrol!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("ui")) == (true))) {
			entity.getPersistentData().putBoolean("ui", (false));
		} else if (((entity.getPersistentData().getBoolean("ui")) == (false))) {
			entity.getPersistentData().putBoolean("ui", (true));
		}
	}
}
