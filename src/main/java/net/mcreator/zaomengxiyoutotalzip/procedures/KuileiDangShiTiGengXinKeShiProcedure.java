package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.Feiping2Entity;
import net.mcreator.zaomengxiyoutotalzip.entity.ChainEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.Comparator;

public class KuileiDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure KuileiDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure KuileiDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure KuileiDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure KuileiDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure KuileiDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (12 / 2d), y - (12 / 2d), z - (12 / 2d), x + (12 / 2d), y + (12 / 2d), z + (12 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			entity.getPersistentData().putDouble("kl", ((entity.getPersistentData().getDouble("kl")) + 1));
			if ((((entity.getPersistentData().getDouble("kl")) > 110) && ((entity.getPersistentData().getDouble("kl")) < 140))) {
				entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
			}
			if ((((entity.getPersistentData().getDouble("kl")) > 140) && ((entity.getPersistentData().getDouble("kl")) < 142))) {
				for (int index0 = 0; index0 < (int) ((3 + ((new Random()).nextInt((int) 2 + 1)))); index0++) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new Feiping2Entity.CustomEntity(Feiping2Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + (3 - ((new Random()).nextInt((int) 5 + 1)))),
								(y + (1 + ((new Random()).nextInt((int) 5 + 1)))), (z + (3 - ((new Random()).nextInt((int) 5 + 1)))),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if ((((entity.getPersistentData().getDouble("kl")) > 165) && ((entity.getPersistentData().getDouble("kl")) < 200))) {
				entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
			}
			if ((((entity.getPersistentData().getDouble("kl")) > 200) && ((entity.getPersistentData().getDouble("kl")) < 202))) {
				for (int index1 = 0; index1 < (int) (2); index1++) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ChainEntity.CustomEntity(ChainEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + (0.1 * ((new Random()).nextInt((int) 5 + 1)))), y,
								(z + (0.1 * ((new Random()).nextInt((int) 5 + 1)))),
								(float) ((entity.rotationYaw) + (45 - ((new Random()).nextInt((int) 90 + 1)))), (float) 0);
						entityToSpawn.setRenderYawOffset((float) ((entity.rotationYaw) + (45 - ((new Random()).nextInt((int) 90 + 1)))));
						entityToSpawn.setRotationYawHead((float) ((entity.rotationYaw) + (45 - ((new Random()).nextInt((int) 90 + 1)))));
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
				entity.getPersistentData().putDouble("kl", 1);
			}
		}
	}
}
