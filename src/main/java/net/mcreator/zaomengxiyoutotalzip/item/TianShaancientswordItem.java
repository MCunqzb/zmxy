
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

import net.mcreator.zaomengxiyoutotalzip.procedures.TianShaancientswordDangYouJianDianJiKongQiShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class TianShaancientswordItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:tian_shaancientsword")
	public static final Item block = null;
	public TianShaancientswordItem(ZaomengxiyouModElements instance) {
		super(instance, 1061);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ZaomengxiyouItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("tian_shaancientsword");
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
					"\u00A7l\u62E5\u6709\u3010\u5FA1\u5251\u98DE\u884C\u3011\u6280\u80FD\uFF0C\u5BF9\u524D\u65B9\u602A\u7269\u9020\u6210\u4F24\u5BB3\u3002"));
			list.add(new StringTextComponent("\u00A7lWith the skills of \"Sword Flight\" to cause damage to monsters in front of you"));
			list.add(new StringTextComponent("\u00A7lyou can \"stand\" on the sword."));
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
				TianShaancientswordDangYouJianDianJiKongQiShiProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
