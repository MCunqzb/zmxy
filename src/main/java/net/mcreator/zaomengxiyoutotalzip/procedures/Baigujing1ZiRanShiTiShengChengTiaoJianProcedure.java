package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.Baigujing1Entity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class Baigujing1ZiRanShiTiShengChengTiaoJianProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure Baigujing1ZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure Baigujing1ZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure Baigujing1ZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure Baigujing1ZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(((Entity) world
				.getEntitiesWithinAABB(Baigujing1Entity.CustomEntity.class,
						new AxisAlignedBB(x - (150 / 2d), y - (150 / 2d), z - (150 / 2d), x + (150 / 2d), y + (150 / 2d), z + (150 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
			return (true);
		}
		return (false);
	}
}
