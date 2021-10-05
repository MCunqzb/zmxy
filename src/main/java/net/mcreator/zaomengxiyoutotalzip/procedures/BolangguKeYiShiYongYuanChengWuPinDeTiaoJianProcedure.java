package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class BolangguKeYiShiYongYuanChengWuPinDeTiaoJianProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure BolangguKeYiShiYongYuanChengWuPinDeTiaoJian!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure BolangguKeYiShiYongYuanChengWuPinDeTiaoJian!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((ZaomengxiyouModVariables.MapVariables.get(world).world_num < 2)) {
			return (true);
		} else if ((ZaomengxiyouModVariables.MapVariables.get(world).world_num >= 2)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						"\u00A7c\u00A7l\u4F60\u89C9\u5F97\u6709\u80A1\u529B\u91CF\u5F71\u54CD\u662F\u4F60\u65E0\u6CD5\u653B\u51FB"), (false));
			}
			return (false);
		}
		return (false);
	}
}
