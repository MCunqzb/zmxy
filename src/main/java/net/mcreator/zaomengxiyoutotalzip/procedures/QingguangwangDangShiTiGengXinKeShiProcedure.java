package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.block.Blocks;

import net.mcreator.zaomengxiyoutotalzip.particle.FanshangParticle;
import net.mcreator.zaomengxiyoutotalzip.entity.GuiwaEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.DuqiuEntity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class QingguangwangDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure QingguangwangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure QingguangwangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure QingguangwangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure QingguangwangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure QingguangwangDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			entity.getPersistentData().putDouble("qgw", ((entity.getPersistentData().getDouble("qgw")) + 1));
			if ((((entity.getPersistentData().getDouble("qgw")) > 140) && ((entity.getPersistentData().getDouble("qgw")) < 240))) {
				world.addParticle(FanshangParticle.particle, x, (y + 3.2), z, 0, 0, 0);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 2, (int) 1));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 2, (int) 1));
				if (entity instanceof LivingEntity) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
					else
						((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
								new ItemStack(Items.CHAINMAIL_CHESTPLATE));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				(((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
						: ItemStack.EMPTY)).addEnchantment(Enchantments.THORNS, (int) 10);
			} else if ((((entity.getPersistentData().getDouble("qgw")) > 241) && ((entity.getPersistentData().getDouble("qgw")) < 245))) {
				if (entity instanceof LivingEntity) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(Blocks.AIR));
					else
						((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
								new ItemStack(Blocks.AIR));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			} else if ((((entity.getPersistentData().getDouble("qgw")) > 340) && ((entity.getPersistentData().getDouble("qgw")) < 345))) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new DuqiuEntity.CustomEntity(DuqiuEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, (y + 1), z, (float) ((entity.rotationYaw) + (80 * (0.5 - Math.random()))), (float) 0);
					entityToSpawn.setRenderYawOffset((float) ((entity.rotationYaw) + (80 * (0.5 - Math.random()))));
					entityToSpawn.setRotationYawHead((float) ((entity.rotationYaw) + (80 * (0.5 - Math.random()))));
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else if ((((entity.getPersistentData().getDouble("qgw")) > 410) && ((entity.getPersistentData().getDouble("qgw")) < 415))) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new GuiwaEntity.CustomEntity(GuiwaEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + (8 * (0.5 - Math.random()))), (y + 1), (z + (8 * (0.5 - Math.random()))),
							world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else if ((((entity.getPersistentData().getDouble("qgw")) > 450) && ((entity.getPersistentData().getDouble("qgw")) < 453))) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new DuqiuEntity.CustomEntity(DuqiuEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, (y + 1), z, (float) ((entity.rotationYaw) + (80 * (0.5 - Math.random()))), (float) 0);
					entityToSpawn.setRenderYawOffset((float) ((entity.rotationYaw) + (80 * (0.5 - Math.random()))));
					entityToSpawn.setRotationYawHead((float) ((entity.rotationYaw) + (80 * (0.5 - Math.random()))));
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("qgw", 0);
			}
		}
	}
}
