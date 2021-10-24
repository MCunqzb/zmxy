package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.entity.WaterspriteEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.PollenEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.PiranhaEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.FlowerDemonEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class PollenDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure PollenDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure PollenDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure PollenDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure PollenDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure PollenDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("time", ((entity.getPersistentData().getDouble("time")) + 1));
		if ((((entity.getPersistentData().getDouble("time")) % 5) == 4)) {
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((!((entityiterator instanceof PollenEntity.CustomEntity) || ((entityiterator instanceof WaterspriteEntity.CustomEntity)
							|| ((entityiterator instanceof FlowerDemonEntity.CustomEntity) || ((EntityTypeTags.getCollection()
									.getTagByID(new ResourceLocation(("forge:zmxyboss").toLowerCase(java.util.Locale.ENGLISH)))
									.contains(entity.getType())) || (entityiterator instanceof PiranhaEntity.CustomEntity))))))) {
						entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
					}
				}
			}
		}
		if (((entity.getPersistentData().getDouble("time")) >= 120)) {
			if (!entity.world.isRemote())
				entity.remove();
		}
		if (((entity.isOnGround()) || (entity.isInWater()))) {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
