package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.FivepotionfireItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class FivePotionBeastFireDangYouJianDianJiShiTiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure FivePotionBeastFireDangYouJianDianJiShiTi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FivePotionBeastFireDangYouJianDianJiShiTi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (!entity.world.isRemote())
			entity.remove();
		if (sourceentity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(FivepotionfireItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
		}
	}
}
