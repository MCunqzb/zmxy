package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.ItemAttributeModifierEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.client.Minecraft;

import net.mcreator.zaomengxiyoutotalzip.item.RocharingItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.UUID;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.Multimap;

public class RocharingskillProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onItemAttributeModifier(ItemAttributeModifierEvent event) {
			if (Minecraft.getInstance().player != null) {
				PlayerEntity entity = Minecraft.getInstance().player;
				ItemStack itemStack = event.getItemStack();
				EquipmentSlotType slotType = event.getSlotType();
				Multimap<Attribute, AttributeModifier> modifier = event.getModifiers();
				Multimap<Attribute, AttributeModifier> originalModifier = event.getOriginalModifiers();
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
				dependencies.put("itemstack", itemStack);
				dependencies.put("slotType", slotType);
				dependencies.put("modifier", modifier);
				dependencies.put("originalModifier", originalModifier);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure Rocharingskill!");
			return;
		}
		if (dependencies.get("modifier") == null) {
			if (!dependencies.containsKey("modifier"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency modifier for procedure Rocharingskill!");
			return;
		}
		if (dependencies.get("slotType") == null) {
			if (!dependencies.containsKey("slotType"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency slotType for procedure Rocharingskill!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		Object modifier = (Object) dependencies.get("modifier");
		Object slotType = (Object) dependencies.get("slotType");
		ItemAttributeModifierEvent event = (ItemAttributeModifierEvent) dependencies.get("event");
		if (((itemstack).getItem() == RocharingItem.block)) {
			if (event.getSlotType() == EquipmentSlotType.OFFHAND) {
				event.addModifier(Attributes.ARMOR,
						new AttributeModifier(UUID.randomUUID(), "Armor", (double) 0.1, AttributeModifier.Operation.MULTIPLY_TOTAL));
				event.addModifier(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(UUID.randomUUID(), "Attack Damage", (double) 0.05, AttributeModifier.Operation.MULTIPLY_TOTAL));
			}
		}
	}
}
