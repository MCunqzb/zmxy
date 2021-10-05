package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.LongwangdifferEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.LongwangEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class SpwanlongwangdifferGengXinYouXiKeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure SpwanlongwangdifferGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure SpwanlongwangdifferGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure SpwanlongwangdifferGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure SpwanlongwangdifferGengXinYouXiKe!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((!(((Entity) world
				.getEntitiesWithinAABB(LongwangEntity.CustomEntity.class, new AxisAlignedBB((x + 0.8) - (200 / 2d), (y + 0.8) - (200 / 2d),
						(z + 0.8) - (200 / 2d), (x + 0.8) + (200 / 2d), (y + 0.8) + (200 / 2d), (z + 0.8) + (200 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf((x + 0.8), (y + 0.8), (z + 0.8))).findFirst().orElse(null)) != null))
				&& ((world.isAirBlock(new BlockPos((int) (x + (Math.random() * 5)), (int) (y + 1.2), (int) (z + (Math.random() * 5)))))
						&& (!(((Entity) world
								.getEntitiesWithinAABB(LongwangdifferEntity.CustomEntity.class,
										new AxisAlignedBB((x + 0.8) - (200 / 2d), (y + 0.8) - (200 / 2d), (z + 0.8) - (200 / 2d),
												(x + 0.8) + (200 / 2d), (y + 0.8) + (200 / 2d), (z + 0.8) + (200 / 2d)),
										null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf((x + 0.8), (y + 0.8), (z + 0.8))).findFirst().orElse(null)) != null))))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new LongwangdifferEntity.CustomEntity(LongwangdifferEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x + (Math.random() * 5)), (y + 1.2), (z + (Math.random() * 5)),
						world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
