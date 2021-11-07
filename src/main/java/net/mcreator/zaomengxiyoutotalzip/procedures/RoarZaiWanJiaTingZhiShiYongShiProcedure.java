package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class RoarZaiWanJiaTingZhiShiYongShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure RoarZaiWanJiaTingZhiShiYongShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure RoarZaiWanJiaTingZhiShiYongShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure RoarZaiWanJiaTingZhiShiYongShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure RoarZaiWanJiaTingZhiShiYongShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure RoarZaiWanJiaTingZhiShiYongShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure RoarZaiWanJiaTingZhiShiYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double i = 0;
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 3)) {
			if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 30)) {
				{
					double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 30);
					entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				i = (double) 0.3;
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 30);
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof MonsterEntity)) {
							entityiterator.setMotion((((entity.getPosX()) - (entityiterator.getPosX())) * i),
									((((entity.getPosY()) + 2) - (entityiterator.getPosY())) * i),
									(((entity.getPosZ()) - (entityiterator.getPosZ())) * i));
							Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
								entityiterator.setMotion(0, 0, 0);
								{
									Entity _ent = entityiterator;
									_ent.setPositionAndUpdate((entity.getPosX()), ((entity.getPosY()) + 3), (entity.getPosZ()));
									if (_ent instanceof ServerPlayerEntity) {
										((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), ((entity.getPosY()) + 3),
												(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
									}
								}
							}, 200, TimeUnit.MILLISECONDS);
						}
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("mp.low").getString())), (false));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("not.professional").getString())),
						(false));
			}
		}
	}
}
