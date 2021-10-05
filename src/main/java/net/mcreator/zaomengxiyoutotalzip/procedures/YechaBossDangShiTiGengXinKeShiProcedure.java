package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.entity.YechaBossEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.YechaBoss2Entity;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class YechaBossDangShiTiGengXinKeShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure YechaBossDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure YechaBossDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure YechaBossDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure YechaBossDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure YechaBossDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity.isInWater())) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, (int) 2, (int) 0, (false), (false)));
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 200)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new YechaBoss2Entity.CustomEntity(YechaBoss2Entity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
		entity.getPersistentData().putDouble("yecha", ((entity.getPersistentData().getDouble("yecha")) + 1));
		entity.getPersistentData().putDouble("spin", ((entity.getPersistentData().getDouble("spin")) + 1));
		if ((((entity.getPersistentData().getDouble("spin")) >= 500) && ((entity.getPersistentData().getDouble("spin")) < 518))) {
			entity.rotationYaw = (float) (((entity.rotationYaw) + ((-40) * ((entity.getPersistentData().getDouble("yecha")) - 199))));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (0);
		} else if ((((entity.getPersistentData().getDouble("spin")) >= 520) && ((entity.getPersistentData().getDouble("spin")) < 522))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((!(entityiterator instanceof YechaBossEntity.CustomEntity))) {
						entityiterator.setMotion((((entityiterator.getPosX()) - (entity.getPosX())) * 0.1), 1,
								(((entityiterator.getPosZ()) - (entity.getPosZ())) * 0.1));
						if (entity instanceof PlayerEntity) {
							((PlayerEntity) entity).spawnSweepParticles();
						}
						if (entityiterator instanceof PlayerEntity) {
							((PlayerEntity) entityiterator).spawnSweepParticles();
						}
						entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 40);
					}
				}
			}
			entity.getPersistentData().putDouble("spin", 1);
		}
		if ((((entity.getPersistentData().getDouble("yecha")) >= 70) && ((entity.getPersistentData().getDouble("yecha")) < 80))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 4, (false), (false)));
		} else if ((((entity.getPersistentData().getDouble("yecha")) >= 150) && ((entity.getPersistentData().getDouble("yecha")) < 159))) {
			entity.rotationYaw = (float) (((entity.rotationYaw) + (40 * ((entity.getPersistentData().getDouble("yecha")) - 199))));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (0);
		} else if ((((entity.getPersistentData().getDouble("yecha")) >= 160) && ((entity.getPersistentData().getDouble("yecha")) < 163))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((!(entityiterator instanceof YechaBossEntity.CustomEntity))) {
						entityiterator.setMotion((((entityiterator.getPosX()) - (entity.getPosX())) * 0.4), 0.2,
								(((entityiterator.getPosZ()) - (entity.getPosZ())) * 0.4));
						if (entity instanceof PlayerEntity) {
							((PlayerEntity) entity).spawnSweepParticles();
						}
						if (entityiterator instanceof PlayerEntity) {
							((PlayerEntity) entityiterator).spawnSweepParticles();
						}
						entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
					}
				}
			}
		} else if ((((entity.getPersistentData().getDouble("yecha")) >= 220) && ((entity.getPersistentData().getDouble("yecha")) < 222))) {
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"effect give @e[type=zaomengxiyou:yecha_boss] minecraft:unluck 2 0 true");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"effect give @e[type=zaomengxiyou:yecha_boss] minecraft:resistance 2 3 true");
			}
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"effect give @e[type=zaomengxiyou:yecha_boss] minecraft:glowing 5 1 true");
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((entity.getPersistentData().getDouble("yecha")) >= 230) && ((entity.getPersistentData().getDouble("yecha")) < 234))) {
			entity.setMotion(0, 0, 0);
			entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((entity.getPersistentData().getDouble("yecha")) >= 255) && ((entity.getPersistentData().getDouble("yecha")) < 260))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).clearActivePotions();
			entity.getPersistentData().putDouble("yecha", 1);
		}
	}
}
