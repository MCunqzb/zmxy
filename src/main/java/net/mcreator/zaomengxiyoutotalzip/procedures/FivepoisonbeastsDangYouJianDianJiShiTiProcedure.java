package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.FivepotionlightItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class FivepoisonbeastsDangYouJianDianJiShiTiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure FivepoisonbeastsDangYouJianDianJiShiTi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FivepoisonbeastsDangYouJianDianJiShiTi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (!entity.world.isRemote())
			entity.remove();
		if (sourceentity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(FivepotionlightItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
		}
	}
}
