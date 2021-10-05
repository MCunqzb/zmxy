package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class XueliangoverlayjudgeProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure Xueliangoverlayjudge!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((ZaomengxiyouModVariables.MapVariables.get(world).world_num < 3)) {
			return (true);
		}
		return (false);
	}
}
