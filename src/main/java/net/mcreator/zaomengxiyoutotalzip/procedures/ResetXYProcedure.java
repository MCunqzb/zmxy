package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class ResetXYProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure ResetXY!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("XAXIS", 0);
		entity.getPersistentData().putDouble("YAXIS", 0);
		entity.getPersistentData().putDouble("TEXTX", 0);
		entity.getPersistentData().putDouble("TEXTY", 0);
		entity.getPersistentData().putDouble("XABS", 0);
	}
}
