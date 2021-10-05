package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class Deathjudge1Procedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure Deathjudge1!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((ZaomengxiyouModVariables.MapVariables.get(world).deathjudge < 600)) {
			return (true);
		}
		return (false);
	}
}
