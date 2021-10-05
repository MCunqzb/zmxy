
package net.mcreator.zaomengxiyoutotalzip.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.List;
import java.util.Collections;

@ZaomengxiyouModElements.ModElement.Tag
public class NaiheBridgeStairBlock extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:naihe_bridge_stair")
	public static final Block block = null;
	public NaiheBridgeStairBlock(ZaomengxiyouModElements instance) {
		super(instance, 915);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ZaomengxiyouItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.NETHER_ORE).hardnessAndResistance(3f, 20f)
					.setLightLevel(s -> 0).jumpFactor(0.9f)).getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.NETHER_ORE).hardnessAndResistance(3f, 20f).setLightLevel(s -> 0)
							.jumpFactor(0.9f));
			setRegistryName("naihe_bridge_stair");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
