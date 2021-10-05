package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;

public class DeathjudgenumDangMingLingBeiZhiXingShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency cmdparams for procedure DeathjudgenumDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure DeathjudgenumDangMingLingBeiZhiXingShi!");
			return;
		}
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		IWorld world = (IWorld) dependencies.get("world");
		ZaomengxiyouModVariables.MapVariables.get(world).deathjudge = (double) new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText()));
		ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
	}
}
