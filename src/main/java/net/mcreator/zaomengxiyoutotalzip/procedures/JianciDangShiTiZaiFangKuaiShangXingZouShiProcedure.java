package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class JianciDangShiTiZaiFangKuaiShangXingZouShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure JianciDangShiTiZaiFangKuaiShangXingZouShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 1);
		entity.setMotion((0.1 * (2.5 - (5 * Math.random()))), 0.4, (0.1 * (2.5 - (5 * Math.random()))));
	}
}
