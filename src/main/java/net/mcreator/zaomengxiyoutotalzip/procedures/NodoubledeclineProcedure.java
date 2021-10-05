package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class NodoubledeclineProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Nodoubledecline!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getPersistentData().getDouble("nodouble")) > 0) && ((entity.getPersistentData().getDouble("nodouble")) < 100))) {
			entity.getPersistentData().putDouble("nodouble", ((entity.getPersistentData().getDouble("nodouble")) - 0.05));
		} else if (((entity.getPersistentData().getDouble("nodouble")) >= 100)) {
			entity.getPersistentData().putDouble("nodouble", 100);
		}
		if (((entity.getPersistentData().getDouble("nodouble")) >= 100)) {
			if (((entity.getPersistentData().getDouble("shine")) < 16)) {
				entity.getPersistentData().putDouble("shine", ((entity.getPersistentData().getDouble("shine")) + 1));
			} else {
				entity.getPersistentData().putDouble("shine", 0);
			}
		}
		if (((entity.getPersistentData().getDouble("nodouble")) <= 0)) {
			entity.getPersistentData().putDouble("nodouble", 0);
		}
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.LUCK)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			entity.getPersistentData().putDouble("nodouble", (0.5 * (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.LUCK)
								return effect.getDuration();
						}
					}
					return 0;
				}
			}.check(entity))));
		}
		if (((entity.getPersistentData().getDouble("nodouble")) == 2)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.SPEED);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.STRENGTH);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.GLOWING);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.RESISTANCE);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.LUCK);
			}
		}
	}
}
