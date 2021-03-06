package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.GhostarmyEntity;
import net.mcreator.zaomengxiyoutotalzip.block.GhostKingPalaceBrickBlock;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class GhostarmyZiRanShiTiShengChengTiaoJianProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure GhostarmyZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure GhostarmyZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure GhostarmyZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure GhostarmyZiRanShiTiShengChengTiaoJian!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((!(((Entity) world
				.getEntitiesWithinAABB(GhostarmyEntity.CustomEntity.class,
						new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == GhostKingPalaceBrickBlock.block))) {
			return (true);
		}
		return (false);
	}
}
