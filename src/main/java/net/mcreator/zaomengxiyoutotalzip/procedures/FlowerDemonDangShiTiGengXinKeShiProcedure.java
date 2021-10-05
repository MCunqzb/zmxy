package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.PollenEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class FlowerDemonDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure FlowerDemonDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure FlowerDemonDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure FlowerDemonDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure FlowerDemonDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure FlowerDemonDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if (((entity.getPersistentData().getDouble("timetick")) >= 100)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x + 1), y, z, (float) 90, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 90);
				entityToSpawn.setRotationYawHead((float) 90);
				entityToSpawn.setMotion(0.3, 0.1, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x - 1), y, z, (float) (-90), (float) 0);
				entityToSpawn.setRenderYawOffset((float) (-90));
				entityToSpawn.setRotationYawHead((float) (-90));
				entityToSpawn.setMotion((-0.3), 0.1, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, (z - 1), (float) 180, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 180);
				entityToSpawn.setRotationYawHead((float) 180);
				entityToSpawn.setMotion(0, 0.1, (-0.3));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, (z + 1), (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0.1, 0.3);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x + 1), y, z, (float) 90, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 90);
				entityToSpawn.setRotationYawHead((float) 90);
				entityToSpawn.setMotion(0.5, 0.1, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x - 1), y, z, (float) (-90), (float) 0);
				entityToSpawn.setRenderYawOffset((float) (-90));
				entityToSpawn.setRotationYawHead((float) (-90));
				entityToSpawn.setMotion((-0.5), 0.1, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, (z - 1), (float) 180, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 180);
				entityToSpawn.setRotationYawHead((float) 180);
				entityToSpawn.setMotion(0, 0.1, (-0.5));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, (z + 1), (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0.1, 0.5);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PollenEntity.CustomEntity(PollenEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y - 1), z, (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0.1, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			entity.getPersistentData().putDouble("timetick", 1);
		}
		if ((entity.isOnGround())) {
			entity.setMotion(0, 0.3, 0);
		}
		if ((((entity.getPosY()) - 82) > 0)) {
			entity.setMotion(0, (-0.5), 0);
		}
	}
}
