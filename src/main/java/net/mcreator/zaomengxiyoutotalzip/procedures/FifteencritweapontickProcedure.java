package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.HashMap;

public class FifteencritweapontickProcedure {
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
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Fifteencritweapontick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:fifteencrit").toLowerCase(java.util.Locale.ENGLISH)))
				.contains(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				&& ((entity.getPersistentData().getDouble("crit15")) == 0))) {
			entity.getPersistentData().putDouble("crit15", 1);
			entity.getPersistentData().putDouble("Crit_num", ((entity.getPersistentData().getDouble("Crit_num")) + 15));
		} else if (((!(ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:fifteencrit").toLowerCase(java.util.Locale.ENGLISH)))
				.contains(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem())))
				&& ((entity.getPersistentData().getDouble("crit15")) == 1))) {
			entity.getPersistentData().putDouble("crit15", 0);
			entity.getPersistentData().putDouble("Crit_num", ((entity.getPersistentData().getDouble("Crit_num")) - 15));
		}
	}
}
