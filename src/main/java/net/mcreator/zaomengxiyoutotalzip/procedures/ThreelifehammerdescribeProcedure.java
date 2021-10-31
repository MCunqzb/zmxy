package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import net.minecraft.world.World;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.zaomengxiyoutotalzip.item.ThreeLifeHammerItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class ThreelifehammerdescribeProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onItemTooltip(ItemTooltipEvent event) {
			PlayerEntity entity = event.getPlayer();
			ItemStack itemStack = event.getItemStack();
			List<ITextComponent> tooltip = event.getToolTip();
			ITooltipFlag flag = event.getFlags();
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
			dependencies.put("flag", flag);
			dependencies.put("tooltip", tooltip);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure Threelifehammerdescribe!");
			return;
		}
		if (dependencies.get("tooltip") == null) {
			if (!dependencies.containsKey("tooltip"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency tooltip for procedure Threelifehammerdescribe!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		Object tooltip = (Object) dependencies.get("tooltip");
		List<ITextComponent> tooltips = (List<ITextComponent>) dependencies.get("tooltip");
		if (((itemstack).getItem() == ThreeLifeHammerItem.block)) {
			tooltips.add((int) 1, new StringTextComponent((new TranslationTextComponent("item.threelifeharmmer.describe").getString())));
			tooltips.add((int) 2, new StringTextComponent((new TranslationTextComponent("item.whack.num").getString())));
		}
	}
}
