
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.List;

@ZaomengxiyouModElements.ModElement.Tag
public class MingjeiqixiItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:mingjeiqixi")
	public static final Item block = null;
	public MingjeiqixiItem(ZaomengxiyouModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ZaomengxiyouItemGroup.tab).maxDamage(100).rarity(Rarity.UNCOMMON));
			setRegistryName("mingjeiqixi");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			ItemStack retval = new ItemStack(this);
			retval.setDamage(itemstack.getDamage() + 1);
			if (retval.getDamage() >= retval.getMaxDamage()) {
				return ItemStack.EMPTY;
			}
			return retval;
		}

		@Override
		public boolean isRepairable(ItemStack itemstack) {
			return false;
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
					"\u00A78\u6765\u81EA\u51A5\u754C\u7684\u6C14\u606F\uFF0C\u5177\u6709\u4FB5\u8680\u4E00\u5207\u7684\u80FD\u529B\u3002"));
		}
	}
}
