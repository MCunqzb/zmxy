
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.zaomengxiyoutotalzip.procedures.XuanwujiaXiongJiaShiJianMeiYouXiKeProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ZaomengxiyouModElements.ModElement.Tag
public class XuanwujiaItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:xuanwujia_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zaomengxiyou:xuanwujia_chestplate")
	public static final Item body = null;
	@ObjectHolder("zaomengxiyou:xuanwujia_leggings")
	public static final Item legs = null;
	@ObjectHolder("zaomengxiyou:xuanwujia_boots")
	public static final Item boots = null;
	public XuanwujiaItem(ZaomengxiyouModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 500;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 12, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 25;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "xuanwujia";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelxuanwujia().body;
				armorModel.bipedLeftArm = new Modelxuanwujia().leftarm;
				armorModel.bipedRightArm = new Modelxuanwujia().rightarm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A73\u7384\u6B66\u5DE8\u9CDE\uFF1A\u6BCF22.5s\u7ED9\u4E88\u73A9\u5BB6\u4F24\u5BB3\u5438\u6536\u2162"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zaomengxiyou:textures/xuanwujia.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					XuanwujiaXiongJiaShiJianMeiYouXiKeProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("xuanwujia_chestplate"));
	}
	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelxuanwujia extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		public Modelxuanwujia() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 9.0F, 0.0F);
			body.setTextureOffset(0, 42).addBox(2.0F, -0.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, 3.0F, 8.0F, 12.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 22).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(120, 31).addBox(3.0F, -3.0F, 4.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(120, 40).addBox(-6.0F, -3.0F, 4.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(122, 53).addBox(-4.0F, 3.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(122, 23).addBox(-5.0F, -7.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(122, 49).addBox(2.0F, 3.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(122, 16).addBox(3.0F, -7.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(122, 9).addBox(-4.0F, -8.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(124, 0).addBox(-3.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(124, 0).addBox(2.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(122, 13).addBox(2.0F, -8.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 50).addBox(-4.0F, -0.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(34, 0).addBox(-4.0F, 0.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(46, 0).addBox(4.0F, 0.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 12.0F, 3.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(51, 33).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 12.0F, -2.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(31, 31).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(4.0F, 12.0F, 0.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
			cube_r3.setTextureOffset(30, 41).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-3.0F, 12.0F, 0.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
			cube_r4.setTextureOffset(45, 42).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 8.0F, 0.0F);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 8.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
