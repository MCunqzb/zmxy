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

import net.mcreator.zaomengxiyoutotalzip.entity.BirdEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BirdRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BirdEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbird(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/chicken.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelbird extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer body;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer wine;
		private final ModelRenderer wine2;
		private final ModelRenderer foot;
		private final ModelRenderer foot2;
		public Modelbird() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 14.0F, -5.0F);
			head.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(14, 0).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -4.0F, -1.0F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(42, 0).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -3.0F, 2.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(42, 13).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 3.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.5708F, 3.1416F, 0.0F);
			cube_r3.setTextureOffset(0, 9).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			wine = new ModelRenderer(this);
			wine.setRotationPoint(3.0F, 12.0F, -1.0F);
			setRotationAngle(wine, 0.0F, 0.0F, -0.829F);
			wine.setTextureOffset(24, 13).addBox(0.0F, 0.0F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);
			wine2 = new ModelRenderer(this);
			wine2.setRotationPoint(-3.0F, 12.0F, -1.0F);
			setRotationAngle(wine2, 0.0F, 0.0F, 0.829F);
			wine2.setTextureOffset(24, 13).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);
			foot = new ModelRenderer(this);
			foot.setRotationPoint(-1.0F, 17.0F, 1.0F);
			foot.setTextureOffset(35, 3).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			foot.setTextureOffset(29, 0).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			foot2 = new ModelRenderer(this);
			foot2.setRotationPoint(1.0F, 17.0F, 1.0F);
			foot2.setTextureOffset(29, 0).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			foot2.setTextureOffset(35, 3).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			wine.render(matrixStack, buffer, packedLight, packedOverlay);
			wine2.render(matrixStack, buffer, packedLight, packedOverlay);
			foot.render(matrixStack, buffer, packedLight, packedOverlay);
			foot2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.foot2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.wine2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.cube_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cube_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.wine.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.foot.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
