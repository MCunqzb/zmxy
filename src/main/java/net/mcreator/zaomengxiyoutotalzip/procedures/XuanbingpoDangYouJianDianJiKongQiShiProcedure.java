package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.zaomengxiyoutotalzip.item.XuanbingpoItem;
import net.mcreator.zaomengxiyoutotalzip.entity.XxuanbingEntity;
import net.mcreator.zaomengxiyoutotalzip.enchantment.PlayerlevelEnchantment;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;

public class XuanbingpoDangYouJianDianJiKongQiShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure XuanbingpoDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure XuanbingpoDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure XuanbingpoDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure XuanbingpoDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure XuanbingpoDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure XuanbingpoDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ZaomengxiyouModVariables.MapVariables.get(world).xuanbing = (double) 12;
		ZaomengxiyouModVariables.MapVariables.get(world).syncData(world);
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			PlayerlevelenchjudgeProcedure.executeProcedure($_dependencies);
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 20, (int) 10, (false), (false)));
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 2)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 20, (int) 4, (false), (false)));
			if (((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) < 15)
					&& ((entity instanceof PlayerEntity)
							? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(XuanbingpoItem.block))
							: false))) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7b\u84DD\u91CF\u4E0D\u8DB3"), (false));
				}
			} else if (((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) >= 15)
					&& ((entity instanceof PlayerEntity)
							? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(XuanbingpoItem.block))
							: false))) {
				{
					double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 15);
					entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, z, (float) 270,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 270);
					entityToSpawn.setRotationYawHead((float) 270);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, (z + 1), (float) 270,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 270);
					entityToSpawn.setRotationYawHead((float) 270);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, (z - 1), (float) 270,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 270);
					entityToSpawn.setRotationYawHead((float) 270);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, (z - 1), (float) 90,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 90);
					entityToSpawn.setRotationYawHead((float) 90);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, (z + 1), (float) 90,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 90);
					entityToSpawn.setRotationYawHead((float) 90);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, z, (float) 90,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 90);
					entityToSpawn.setRotationYawHead((float) 90);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 1), y, (z - 2), (float) 180,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 180);
					entityToSpawn.setRotationYawHead((float) 180);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, (z - 2), (float) 180,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 180);
					entityToSpawn.setRotationYawHead((float) 180);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 1), y, (z - 2), (float) 180,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 180);
					entityToSpawn.setRotationYawHead((float) 180);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, (z + 2), (float) 0,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 1), y, (z + 2), (float) 0,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new XxuanbingEntity.CustomEntity(XxuanbingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 1), y, (z + 2), (float) 0,
							(float) ((EnchantmentHelper.getEnchantmentLevel(PlayerlevelEnchantment.enchantment, (itemstack))) / (-10)));
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u804C\u4E1A\u4E0D\u662F\u5510\u50E7\uFF01"), (false));
			}
		}
	}
}
