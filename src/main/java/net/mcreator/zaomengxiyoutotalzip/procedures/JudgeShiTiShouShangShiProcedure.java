package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class JudgeShiTiShouShangShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure JudgeShiTiShouShangShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double previousRecipe = 0;
		if ((Math.random() < 0.1)) {
			ZaomengxiyouModVariables.MapVariables
					.get(world).deathjudge = (double) (ZaomengxiyouModVariables.MapVariables.get(world).deathjudge - 120);
			ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
