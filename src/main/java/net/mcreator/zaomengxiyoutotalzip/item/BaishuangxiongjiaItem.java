
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

import net.mcreator.zaomengxiyoutotalzip.procedures.BaishuangxiongjiaXiongJiaShiJianMeiYouXiKeProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ZaomengxiyouModElements.ModElement.Tag
public class BaishuangxiongjiaItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:baishuangxiongjia_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zaomengxiyou:baishuangxiongjia_chestplate")
	public static final Item body = null;
	@ObjectHolder("zaomengxiyou:baishuangxiongjia_leggings")
	public static final Item legs = null;
	@ObjectHolder("zaomengxiyou:baishuangxiongjia_boots")
	public static final Item boots = null;
	public BaishuangxiongjiaItem(ZaomengxiyouModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 300;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 8, 10, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 36;
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
				return "baishuangxiongjia";
			}

			@Override
			public float getToughness() {
				return 1.7f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.02f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelbaishuangxiongjia().Body;
				armorModel.bipedLeftArm = new Modelbaishuangxiongjia().LeftArm;
				armorModel.bipedRightArm = new Modelbaishuangxiongjia().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A73\u6781\u5BD2\u4E4B\u5730\u7684\u5343\u5E74\u51B0\u9B44\uFF0C\u953B\u9020\u7684\u80F8\u7532\uFF0C\u5168\u8EAB\u56E0\u5BD2\u51B7\u800C\u98A4\u6296\uFF0C\u6563\u53D1\u51FA\u65E0\u6CD5\u9760\u8FD1\u7684\u5BD2\u6C14\u3002"));
				list.add(new StringTextComponent(
						"\u00A73 Thousands of years of ice in the extremely cold land\\forged breastplate\\trembling with cold body\\exudes a cold air that can not be approached."));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zaomengxiyou:textures/baishuangxiongjia.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					BaishuangxiongjiaXiongJiaShiJianMeiYouXiKeProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("baishuangxiongjia_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new Modelbaishuangxiongjia().LeftLeg;
				armorModel.bipedRightLeg = new Modelbaishuangxiongjia().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A73\u6781\u5BD2\u4E4B\u5730\u7684\u5343\u5E74\u51B0\u9B44\uFF0C\u953B\u9020\u7684\u80F8\u7532\uFF0C\u5168\u8EAB\u56E0\u5BD2\u51B7\u800C\u98A4\u6296\uFF0C\u6563\u53D1\u51FA\u65E0\u6CD5\u9760\u8FD1\u7684\u5BD2\u6C14\u3002"));
				list.add(new StringTextComponent(
						"\u00A73 Thousands of years of ice in the extremely cold land\\forged breastplate\\trembling with cold body\\exudes a cold air that can not be approached."));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zaomengxiyou:textures/baishuangxiongjialayer_2.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					BaishuangxiongjiaXiongJiaShiJianMeiYouXiKeProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("baishuangxiongjia_leggings"));
	}
	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbaishuangxiongjia extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer Body_r1;
		private final ModelRenderer Body_r2;
		private final ModelRenderer Body_r3;
		private final ModelRenderer Body_r4;
		private final ModelRenderer Body_r5;
		private final ModelRenderer Body_r6;
		private final ModelRenderer Body_r7;
		private final ModelRenderer Body_r8;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer RightArm_r2;
		private final ModelRenderer RightArm_r3;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer LeftArm_r2;
		private final ModelRenderer LeftArm_r3;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelbaishuangxiongjia() {
			textureWidth = 64;
			textureHeight = 32;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
			Body_r1 = new ModelRenderer(this);
			Body_r1.setRotationPoint(0.0F, 7.9439F, -16.0061F);
			Body.addChild(Body_r1);
			setRotationAngle(Body_r1, -1.3526F, 0.0F, 0.0F);
			Body_r1.setTextureOffset(56, 0).addBox(2.0F, -28.0F, 1.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);
			Body_r1.setTextureOffset(56, 0).addBox(-4.0F, -28.0F, 1.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			Body_r2 = new ModelRenderer(this);
			Body_r2.setRotationPoint(0.0F, 8.2092F, -22.5524F);
			Body.addChild(Body_r2);
			setRotationAngle(Body_r2, -1.2217F, 0.0F, 0.0F);
			Body_r2.setTextureOffset(56, 0).addBox(-4.0F, -37.0F, 2.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			Body_r2.setTextureOffset(56, 0).addBox(2.0F, -37.0F, 2.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);
			Body_r3 = new ModelRenderer(this);
			Body_r3.setRotationPoint(0.0F, 20.7846F, -12.0F);
			Body.addChild(Body_r3);
			setRotationAngle(Body_r3, -0.5236F, 0.0F, 0.0F);
			Body_r3.setTextureOffset(40, 0).addBox(-5.0F, -29.0F, 1.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			Body_r3.setTextureOffset(40, 0).addBox(1.0F, -29.0F, 1.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			Body_r3.setTextureOffset(56, 0).addBox(2.0F, -37.0F, 2.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);
			Body_r3.setTextureOffset(56, 0).addBox(-4.0F, -37.0F, 2.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			Body_r4 = new ModelRenderer(this);
			Body_r4.setRotationPoint(0.0F, 16.732F, 16.5885F);
			Body.addChild(Body_r4);
			setRotationAngle(Body_r4, 1.0472F, 0.0F, 0.0F);
			Body_r4.setTextureOffset(24, 0).addBox(2.5F, -19.8F, 18.4F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body_r4.setTextureOffset(24, 0).addBox(-3.5F, -19.8F, 18.4F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body_r5 = new ModelRenderer(this);
			Body_r5.setRotationPoint(0.0F, 23.5984F, 6.2776F);
			Body.addChild(Body_r5);
			setRotationAngle(Body_r5, 0.3491F, 0.0F, 0.0F);
			Body_r5.setTextureOffset(24, 0).addBox(-3.5F, -21.6F, 14.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body_r5.setTextureOffset(24, 0).addBox(2.5F, -21.6F, 14.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body_r6 = new ModelRenderer(this);
			Body_r6.setRotationPoint(0.0F, 24.0061F, 3.9439F);
			Body.addChild(Body_r6);
			setRotationAngle(Body_r6, 0.2182F, 0.0F, 0.0F);
			Body_r6.setTextureOffset(24, 0).addBox(2.5F, -18.5F, 9.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body_r6.setTextureOffset(24, 0).addBox(-3.5F, -18.5F, 9.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body_r7 = new ModelRenderer(this);
			Body_r7.setRotationPoint(0.0F, 23.7947F, -3.1326F);
			Body.addChild(Body_r7);
			setRotationAngle(Body_r7, -0.1309F, 0.0F, 0.0F);
			Body_r7.setTextureOffset(0, 0).addBox(-4.0F, -22.0F, -2.8F, 8.0F, 6.0F, 0.0F, 0.0F, false);
			Body_r8 = new ModelRenderer(this);
			Body_r8.setRotationPoint(0.0F, 24.3386F, -2.1289F);
			Body.addChild(Body_r8);
			setRotationAngle(Body_r8, -0.1745F, 0.0F, 0.0F);
			Body_r8.setTextureOffset(24, 8).addBox(-3.0F, -12.0F, -3.1F, 6.0F, 7.0F, 0.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
			RightArm.setTextureOffset(0, 8).addBox(-5.0F, -5.0F, -2.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(7.8288F, 21.1592F, 0.0F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, 0.0F, 0.0F, -0.1309F);
			RightArm_r1.setTextureOffset(16, 0).addBox(-9.0F, -31.0F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			RightArm_r2 = new ModelRenderer(this);
			RightArm_r2.setRotationPoint(2.0966F, 22.3814F, -1.9182F);
			RightArm.addChild(RightArm_r2);
			setRotationAngle(RightArm_r2, -0.0873F, 0.0F, 0.1309F);
			RightArm_r2.setTextureOffset(16, 0).addBox(-6.9F, -31.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			RightArm_r3 = new ModelRenderer(this);
			RightArm_r3.setRotationPoint(5.9541F, 21.7612F, 0.0F);
			RightArm.addChild(RightArm_r3);
			setRotationAngle(RightArm_r3, 0.0F, 0.0F, -0.0436F);
			RightArm_r3.setTextureOffset(16, 0).addBox(-9.7F, -29.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
			LeftArm.setTextureOffset(0, 8).addBox(-1.0F, -5.0F, -2.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(-5.949F, 21.5566F, -1.1523F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, -0.0524F, 0.0F, 0.0436F);
			LeftArm_r1.setTextureOffset(16, 0).addBox(8.0F, -30.0F, 2.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			LeftArm_r2 = new ModelRenderer(this);
			LeftArm_r2.setRotationPoint(-3.0535F, 22.6334F, 1.7252F);
			LeftArm.addChild(LeftArm_r2);
			setRotationAngle(LeftArm_r2, 0.0785F, 0.0F, -0.0873F);
			LeftArm_r2.setTextureOffset(16, 0).addBox(5.2F, -30.0F, 2.6F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			LeftArm_r3 = new ModelRenderer(this);
			LeftArm_r3.setRotationPoint(-5.0F, 21.9866F, 0.7676F);
			LeftArm.addChild(LeftArm_r3);
			setRotationAngle(LeftArm_r3, 0.0349F, 0.0F, 0.0F);
			LeftArm_r3.setTextureOffset(16, 0).addBox(8.9F, -29.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
			LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
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
