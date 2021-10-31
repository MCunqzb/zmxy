package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.RochademonumbrellaitemItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Random;
import java.util.Map;

public class RochademonumbrellaDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure RochademonumbrellaDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if ((((entity.getPersistentData().getDouble("timetick")) >= 140) && ((entity.getPersistentData().getDouble("timetick")) < 141))) {
			entity.getPersistentData().putDouble("timetick", 0);
			if (!entity.world.isRemote())
				entity.remove();
		}
		if ((((entity.getPersistentData().getDouble("timetick")) % 1) == 0)) {
			entity.rotationYaw = (float) (((entity.rotationYaw) + 22.5));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (40);
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					RochademonumbrellaitemItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 0);
				}
			}
		}
		if ((((entity.getPersistentData().getDouble("timetick")) % 3) == 0)) {
			entity.rotationYaw = (float) (((entity.rotationYaw) + 22.5));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) ((40 + (Math.random() * 40)));
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					RochademonumbrellaitemItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 0);
				}
			}
		}
	}
}
