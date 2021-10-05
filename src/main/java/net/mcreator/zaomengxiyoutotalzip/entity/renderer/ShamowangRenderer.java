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

import net.mcreator.zaomengxiyoutotalzip.entity.ShamowangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ShamowangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ShamowangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelshamowang(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/smw.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelshamowang extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r3_r2;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r4_r1;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer cube_r2_r1;
		private final ModelRenderer cube_r2_r1_r1;
		private final ModelRenderer cube_r1_r1;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer head;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftarm2;
		private final ModelRenderer rightarm2;
		public Modelshamowang() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 9.0F, 0.0F);
			body.setTextureOffset(0, 42).addBox(2.0F, -10.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(14, 60).addBox(-5.0F, -10.0F, 4.0F, 10.0F, 12.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(66, 5).addBox(-5.0F, -10.0F, -3.0F, 10.0F, 12.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(0, 50).addBox(-4.0F, -10.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(34, 0).addBox(-5.0F, -10.0F, -3.0F, 0.0F, 12.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(50, 11).addBox(5.0F, -10.0F, -3.0F, 0.0F, 12.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(0, 70).addBox(2.0F, -10.0F, -3.1F, 4.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(0, 70).addBox(-6.0F, -10.0F, -3.1F, 4.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(88, 66).addBox(-4.0F, -11.0F, -1.2F, 8.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(14, 84).addBox(-5.0F, -11.0F, -1.0F, 10.0F, 14.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-4.0F, 12.0F, 1.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
			cube_r1.setTextureOffset(0, 66).addBox(-5.2322F, -6.6406F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.0F, 12.0F, 1.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
			cube_r2.setTextureOffset(0, 66).addBox(5.1322F, -6.6406F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 12.0F, -3.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
			cube_r3_r2 = new ModelRenderer(this);
			cube_r3_r2.setRotationPoint(0.0F, 3.0F, 3.0F);
			cube_r3.addChild(cube_r3_r2);
			setRotationAngle(cube_r3_r2, 0.3054F, 0.0F, 0.0F);
			cube_r3_r2.setTextureOffset(0, 70).addBox(-2.0F, -13.2388F, -2.9268F, 4.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 4.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(112, 116).addBox(-4.0F, -8.2632F, 4.9259F, 8.0F, 12.0F, 0.0F, 0.0F, false);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(-1.3764F, 15.9197F, 0.0F);
			body.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, 0.0F, 0.0F, 0.3927F);
			cube_r4_r1.setTextureOffset(30, 41).addBox(-8.7507F, -11.8561F, -3.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(1.4525F, 16.3024F, 0.0F);
			body.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, 0.0F, 0.0F, -0.3927F);
			cube_r3_r1.setTextureOffset(30, 41).addBox(8.7507F, -11.8561F, -3.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);
			cube_r2_r1 = new ModelRenderer(this);
			cube_r2_r1.setRotationPoint(0.0F, 15.537F, -1.3003F);
			body.addChild(cube_r2_r1);
			setRotationAngle(cube_r2_r1, -0.3927F, 0.0F, 0.0F);
			cube_r2_r1_r1 = new ModelRenderer(this);
			cube_r2_r1_r1.setRotationPoint(0.0F, -12.537F, -6.6997F);
			cube_r2_r1.addChild(cube_r2_r1_r1);
			setRotationAngle(cube_r2_r1_r1, 0.3054F, 0.0F, 0.0F);
			cube_r2_r1_r1.setTextureOffset(31, 31).addBox(-4.0F, 0.2982F, -0.1271F, 8.0F, 10.0F, 0.0F, 0.0F, false);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(0.0F, 15.9867F, 1.5488F);
			body.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, 0.4363F, 0.0F, 0.0F);
			cube_r1_r1.setTextureOffset(51, 33).addBox(-4.0F, -12.0632F, 8.2259F, 8.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-3.0F, 2.0F, -1.0F);
			body.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.0F, 2.0F, -1.0F);
			body.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -5.0F, 3.0F);
			body.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -4.0F, 1.0F);
			body.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, -4.0F, 1.0F);
			body.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(3.0F, -11.0F, 3.0F);
			body.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, -9.0F, 1.0F);
			body.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, -0.2182F, 1.5708F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 1.0F);
			head.setTextureOffset(93, 36).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(44, 67).addBox(-1.0F, -7.0F, 4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 67).addBox(-1.0F, -7.0F, 5.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.0F, 12.0F, 1.0F);
			leftleg.setTextureOffset(110, 0).addBox(-1.0F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.0F, 12.0F, 1.0F);
			rightleg.setTextureOffset(91, 0).addBox(-4.0F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm2 = new ModelRenderer(this);
			leftarm2.setRotationPoint(6.0F, -1.0F, 1.0F);
			leftarm2.setTextureOffset(112, 17).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm2.setTextureOffset(48, 96).addBox(-1.0F, 3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
			leftarm2.setTextureOffset(72, 84).addBox(4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm2.setTextureOffset(72, 84).addBox(4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm2.setTextureOffset(63, 70).addBox(-1.0F, -3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
			rightarm2 = new ModelRenderer(this);
			rightarm2.setRotationPoint(-6.0F, -1.0F, 1.0F);
			rightarm2.setTextureOffset(94, 17).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm2.setTextureOffset(48, 96).addBox(-4.0F, 3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
			rightarm2.setTextureOffset(72, 84).addBox(-5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm2.setTextureOffset(72, 84).addBox(-5.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm2.setTextureOffset(103, 69).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm2.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
