package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class YExptextadd1Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure YExptextadd1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("TEXTY", ((entity.getPersistentData().getDouble("TEXTY")) + 1));
	}
}