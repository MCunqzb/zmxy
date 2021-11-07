
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.zaomengxiyoutotalzip.procedures.BloodySeaDemonChilditemDangYouJianDianJiKongQiShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class BloodySeaDemonChilditemItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:bloody_sea_demon_childitem")
	public static final Item block = null;
	public BloodySeaDemonChilditemItem(ZaomengxiyouModElements instance) {
		super(instance, 1084);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ZaomengxiyouItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bloody_sea_demon_childitem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u00A7l\u62E5\u6709\u3010\u90AA\u6076\u51C0\u5316\u3011\u6280\u80FD\uFF0C\u6E05\u9664\u81EA\u8EAB\u8D1F\u9762\u72B6\u6001\uFF0C\u5E76\u5BF9\u524D\u65B9\u602A\u7269\u9020\u6210\u4F24\u5BB3\u3002"));
			list.add(new StringTextComponent(
					"\u00A7lHave the \"Evil Purification\" skills to clear up your negative state and cause damage to monsters ahead."));
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				BloodySeaDemonChilditemDangYouJianDianJiKongQiShiProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
