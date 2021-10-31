package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.ThornsPotionPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.item.DirtthornItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Random;
import java.util.Map;

public class SoilballDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure SoilballDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure SoilballDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure SoilballDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure SoilballDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure SoilballDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean w = false;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(ThornsPotionPotionEffect.potion, (int) 60, (int) 20));
		entity.getPersistentData().putDouble("timetick", ((entity.getPersistentData().getDouble("timetick")) + 1));
		if ((((entity.getPersistentData().getDouble("timetick")) % 10) == 0)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.gravel.break")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.gravel.break")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
			entity.rotationYaw = (float) (((entity.rotationYaw) + 45));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (0);
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 10, (int) 100));
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					DirtthornItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 0, (int) 0);
				}
			}
		}
		if ((((entity.getPersistentData().getDouble("timetick")) >= 110) && ((entity.getPersistentData().getDouble("timetick")) < 111))) {
			entity.getPersistentData().putDouble("timetick", 0);
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
