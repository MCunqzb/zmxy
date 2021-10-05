package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class TextforchangehealthoverlayProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Textforchangehealthoverlay!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putString("hp_overlay", (new TranslationTextComponent("wether.health").getString()));
	}
}
