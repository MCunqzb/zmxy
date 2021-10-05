package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.FlowerDemonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FlowerDemonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FlowerDemonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFlower_demon(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/flower_demon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFlower_demon extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer petal;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer petalr2;
		private final ModelRenderer cube_r9;
		private final ModelRenderer petalr;
		private final ModelRenderer cube_r6;
		private final ModelRenderer petall2;
		private final ModelRenderer cube_r8;
		private final ModelRenderer petall;
		private final ModelRenderer ppetal;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer leftwing;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer rightwing;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		private final ModelRenderer cube_r15;
		private final ModelRenderer headadd;
		private final ModelRenderer cube_r26;
		private final ModelRenderer cube_r27;
		private final ModelRenderer cube_r28;
		public ModelFlower_demon() {
			textureWidth = 80;
			textureHeight = 80;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(33, 0).addBox(4.1F, -13.0F, -3.0F, 0.0F, 8.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(33, 0).addBox(-4.1F, -13.0F, -3.0F, 0.0F, 8.0F, 11.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 3.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-4.0F, -10.0F, -3.0F, 8.0F, 13.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -8.0F, -3.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(26, 28).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			petal = new ModelRenderer(this);
			petal.setRotationPoint(0.0F, 3.0F, -3.0F);
			body.addChild(petal);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 5.0F);
			petal.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.6527F, 0.0531F, -0.0693F);
			cube_r2.setTextureOffset(12, 38).addBox(2.0F, 13.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			cube_r2.setTextureOffset(0, 52).addBox(1.0F, 7.0F, 0.0F, 3.0F, 6.0F, 1.0F, 0.0F, true);
			cube_r2.setTextureOffset(0, 44).addBox(0.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 5.0F);
			petal.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.6527F, -0.0531F, 0.0693F);
			cube_r3.setTextureOffset(12, 38).addBox(-3.0F, 13.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 52).addBox(-4.0F, 7.0F, 0.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 44).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			petal.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.258F, 0.045F, 0.1687F);
			cube_r4.setTextureOffset(12, 34).addBox(-3.0F, 13.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			cube_r4.setTextureOffset(26, 23).addBox(-4.0F, 9.0F, 0.0F, 3.0F, 4.0F, 1.0F, 0.0F, true);
			cube_r4.setTextureOffset(0, 34).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 9.0F, 1.0F, 0.0F, true);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			petal.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.258F, -0.045F, -0.1687F);
			cube_r5.setTextureOffset(12, 43).addBox(2.0F, 13.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(26, 23).addBox(1.0F, 9.0F, 0.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 34).addBox(0.0F, 0.0F, 0.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			petalr2 = new ModelRenderer(this);
			petalr2.setRotationPoint(-4.6F, 3.0F, 0.3F);
			body.addChild(petalr2);
			setRotationAngle(petalr2, 3.0107F, -0.829F, 3.1416F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			petalr2.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
			cube_r9.setTextureOffset(12, 46).addBox(0.4F, 13.6F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r9.setTextureOffset(8, 52).addBox(0.4F, 8.6F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r9.setTextureOffset(0, 59).addBox(0.4F, -0.4F, -3.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			petalr = new ModelRenderer(this);
			petalr.setRotationPoint(-5.0F, 3.0F, 0.0F);
			body.addChild(petalr);
			setRotationAngle(petalr, 0.0F, 0.0F, 0.6545F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			petalr.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3054F);
			cube_r6.setTextureOffset(12, 49).addBox(0.0F, 13.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(15, 52).addBox(0.0F, 8.0F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r6.setTextureOffset(10, 59).addBox(0.0F, -1.0F, -3.0F, 1.0F, 9.0F, 4.0F, 0.0F, true);
			petall2 = new ModelRenderer(this);
			petall2.setRotationPoint(2.4F, 3.0F, 2.0F);
			body.addChild(petall2);
			setRotationAngle(petall2, 0.0F, -0.6109F, 0.0F);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			petall2.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -0.3491F);
			cube_r8.setTextureOffset(12, 46).addBox(0.0F, 13.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			cube_r8.setTextureOffset(8, 52).addBox(0.0F, 8.0F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);
			cube_r8.setTextureOffset(0, 59).addBox(0.0F, -1.0F, -3.0F, 1.0F, 9.0F, 4.0F, 0.0F, true);
			petall = new ModelRenderer(this);
			petall.setRotationPoint(4.0F, 3.0F, 0.0F);
			body.addChild(petall);
			setRotationAngle(petall, 0.0F, 0.0F, -0.3491F);
			petall.setTextureOffset(12, 49).addBox(0.0F, 13.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			petall.setTextureOffset(15, 52).addBox(0.0F, 8.0F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);
			petall.setTextureOffset(10, 59).addBox(0.0F, -1.0F, -3.0F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			ppetal = new ModelRenderer(this);
			ppetal.setRotationPoint(0.0F, -6.0F, 2.0F);
			body.addChild(ppetal);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, -1.0F);
			ppetal.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.5797F, -0.2334F, 0.0251F);
			cube_r10.setTextureOffset(38, 52).addBox(-4.0F, -12.0F, 1.0F, 3.0F, 6.0F, 1.0F, 0.0F, true);
			cube_r10.setTextureOffset(38, 45).addBox(-5.0F, -6.0F, 1.0F, 5.0F, 6.0F, 1.0F, 0.0F, true);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 0.0F, -1.0F);
			ppetal.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.5797F, 0.2334F, -0.0251F);
			cube_r11.setTextureOffset(38, 52).addBox(1.0F, -12.0F, 1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r11.setTextureOffset(38, 45).addBox(0.0F, -6.0F, 1.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(bone);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
			cube_r12.setTextureOffset(70, 47).addBox(-3.0F, -3.0F, 19.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r12.setTextureOffset(64, 53).addBox(-3.0F, -4.0F, 12.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			cube_r12.setTextureOffset(58, 64).addBox(-3.0F, -5.0F, 2.0F, 1.0F, 6.0F, 10.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.4363F, 0.0F);
			cube_r13.setTextureOffset(70, 47).addBox(2.0F, -3.0F, 19.0F, 1.0F, 2.0F, 4.0F, 0.0F, true);
			cube_r13.setTextureOffset(64, 53).addBox(2.0F, -4.0F, 12.0F, 1.0F, 4.0F, 7.0F, 0.0F, true);
			cube_r13.setTextureOffset(58, 64).addBox(2.0F, -5.0F, 2.0F, 1.0F, 6.0F, 10.0F, 0.0F, true);
			leftwing = new ModelRenderer(this);
			leftwing.setRotationPoint(4.0F, -4.0F, 0.0F);
			leftwing.setTextureOffset(25, 34).addBox(0.0F, -2.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.6449F, -4.9363F, -0.145F);
			leftwing.addChild(cube_r14);
			setRotationAngle(cube_r14, -0.1744F, 0.0076F, 0.043F);
			cube_r14.setTextureOffset(47, 56).addBox(3.0F, -17.0F, 0.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.3832F, 0.9669F, -1.1859F);
			leftwing.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.1744F, 0.0076F, 0.043F);
			cube_r16.setTextureOffset(36, 69).addBox(3.0F, -17.0F, -1.0F, 1.0F, 6.0F, 5.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftwing.addChild(cube_r17);
			setRotationAngle(cube_r17, -0.1739F, 0.0151F, 0.0859F);
			cube_r17.setTextureOffset(20, 65).addBox(3.0F, -10.0F, -4.0F, 1.0F, 8.0F, 7.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.0F, 9.2849F, -0.2281F);
			leftwing.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.5236F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(16, 39).addBox(2.8F, 8.077F, 1.1747F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(0.0F, 9.0F, 0.0F);
			leftwing.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.48F, 0.0F, 0.0F);
			cube_r19.setTextureOffset(19, 44).addBox(2.8F, 0.077F, 0.1747F, 1.0F, 8.0F, 2.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftwing.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
			cube_r20.setTextureOffset(21, 54).addBox(1.8F, 1.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
			rightwing = new ModelRenderer(this);
			rightwing.setRotationPoint(-4.0F, -4.0F, 0.0F);
			rightwing.setTextureOffset(25, 34).addBox(-5.0F, -2.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, true);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(-0.3527F, 0.9663F, -1.1858F);
			rightwing.addChild(cube_r21);
			setRotationAngle(cube_r21, -0.1744F, -0.0076F, -0.043F);
			cube_r21.setTextureOffset(36, 69).addBox(-4.0304F, -16.3028F, -1.0F, 1.0F, 6.0F, 5.0F, 0.0F, true);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(0.0F, 1.0F, 0.0F);
			rightwing.addChild(cube_r22);
			setRotationAngle(cube_r22, -0.1739F, -0.0151F, -0.0859F);
			cube_r22.setTextureOffset(20, 65).addBox(-3.9446F, -10.2838F, -4.1736F, 1.0F, 8.0F, 7.0F, 0.0F, true);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(-6.0F, 9.2849F, -0.2281F);
			rightwing.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.5236F, 0.0F, 0.0F);
			cube_r23.setTextureOffset(16, 39).addBox(2.8F, 8.077F, 1.1747F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(-6.0F, 9.0F, 0.0F);
			rightwing.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.48F, 0.0F, 0.0F);
			cube_r24.setTextureOffset(19, 44).addBox(2.8F, 0.077F, 0.1747F, 1.0F, 8.0F, 2.0F, 0.0F, true);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(-6.0F, 0.0F, 0.0F);
			rightwing.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.1309F, 0.0F, 0.0F);
			cube_r25.setTextureOffset(21, 54).addBox(1.8F, 1.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, true);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-0.6145F, -4.9369F, -0.1449F);
			rightwing.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.1744F, -0.0076F, -0.043F);
			cube_r15.setTextureOffset(47, 56).addBox(-4.0304F, -16.3028F, 0.0F, 1.0F, 6.0F, 4.0F, 0.0F, true);
			headadd = new ModelRenderer(this);
			headadd.setRotationPoint(0.0F, -7.0F, 0.0F);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(0.0F, -8.0F, 0.0F);
			headadd.addChild(cube_r26);
			setRotationAngle(cube_r26, 0.3927F, 0.0F, 0.0F);
			cube_r26.setTextureOffset(76, 5).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(0.0F, -8.0F, 0.0F);
			headadd.addChild(cube_r27);
			setRotationAngle(cube_r27, -0.532F, 0.2071F, 0.3361F);
			cube_r27.setTextureOffset(76, 0).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(0.0F, -8.0F, 0.0F);
			headadd.addChild(cube_r28);
			setRotationAngle(cube_r28, -0.532F, -0.2071F, -0.3361F);
			cube_r28.setTextureOffset(76, 0).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftwing.render(matrixStack, buffer, packedLight, packedOverlay);
			rightwing.render(matrixStack, buffer, packedLight, packedOverlay);
			headadd.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.petall.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.petalr.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.petal.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.ppetal.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.headadd.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.petalr2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.bone.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.leftwing.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.rightwing.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.petall2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
