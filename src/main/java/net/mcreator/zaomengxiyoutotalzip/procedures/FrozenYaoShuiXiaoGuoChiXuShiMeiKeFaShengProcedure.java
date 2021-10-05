package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.FrozenPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.particle.FrozeparticleParticle;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.Collection;

public class FrozenYaoShuiXiaoGuoChiXuShiMeiKeFaShengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure FrozenYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure FrozenYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure FrozenYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure FrozenYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure FrozenYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double w = 0;
		double o = 0;
		if (((entity.getPersistentData().getDouble("froze tick")) <= 10)) {
			entity.getPersistentData().putDouble("froze tick", ((entity.getPersistentData().getDouble("froze tick")) + 1));
			entity.getPersistentData().putDouble("W", (entity.rotationYaw));
			entity.getPersistentData().putDouble("O", (entity.rotationPitch));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof MobEntity)
						((MobEntity) entity).setNoAI((false));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == FrozenPotionEffect.potion)
								return effect.getDuration();
						}
					}
					return 0;
				}
			}.check(entity)));
		}
		if (((entity.getPersistentData().getDouble("froze tick")) > 5)) {
			entity.setMotion(0, 0, 0);
			entity.rotationYaw = (float) ((entity.getPersistentData().getDouble("W")));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) ((entity.getPersistentData().getDouble("O")));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)), (int) 20, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)), (int) 20, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getDuration();
							}
						}
						return 0;
					}
				}.check(entity)), (int) 20, (false), (false)));
			entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
		}
		if ((((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == FrozenPotionEffect.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check(entity)) % 40) == 2)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(FrozeparticleParticle.particle, x, (y + 0.5), z, (int) (5 * (1 + (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FrozenPotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity)))), 0.5, 1, 0.5, 0.2);
			}
		}
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == FrozenPotionEffect.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check(entity)) <= 10)) {
			entity.getPersistentData().putDouble("froze tick", 1);
			if (entity instanceof MobEntity)
				((MobEntity) entity).setNoAI((false));
		}
		if ((entity instanceof MobEntity)) {
			if (entity instanceof MobEntity)
				((MobEntity) entity).setNoAI((true));
		}
	}
}
