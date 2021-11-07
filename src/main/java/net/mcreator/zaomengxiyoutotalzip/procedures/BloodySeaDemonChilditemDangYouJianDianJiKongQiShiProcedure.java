package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.VertigoPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.OnFirePotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.MpDevourPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.IncreasesthedamagePotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.HealingreductionPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.FrozenPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.entity.BloodySeaDemonChildEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class BloodySeaDemonChilditemDangYouJianDianJiKongQiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure BloodySeaDemonChilditemDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure BloodySeaDemonChilditemDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure BloodySeaDemonChilditemDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure BloodySeaDemonChilditemDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure BloodySeaDemonChilditemDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure BloodySeaDemonChilditemDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) > 200)) {
			if ((!(((Entity) world
					.getEntitiesWithinAABB(BloodySeaDemonChildEntity.CustomEntity.class,
							new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new BloodySeaDemonChildEntity.CustomEntity(BloodySeaDemonChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if ((entityToSpawn instanceof TameableEntity) && (entity instanceof PlayerEntity)) {
						((TameableEntity) entityToSpawn).setTamed(true);
						((TameableEntity) entityToSpawn).setTamedBy((PlayerEntity) entity);
					}
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 130);
				{
					double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 200);
					entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(OnFirePotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(HealingreductionPotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(FrozenPotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(VertigoPotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(MpDevourPotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(IncreasesthedamagePotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(Effects.SLOWNESS);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(Effects.POISON);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(Effects.NAUSEA);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(Effects.BLINDNESS);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(Effects.WITHER);
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("low.mp").getString())), (false));
			}
		}
	}
}
