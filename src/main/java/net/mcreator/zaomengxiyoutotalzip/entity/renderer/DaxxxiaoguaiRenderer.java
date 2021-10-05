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

import net.mcreator.zaomengxiyoutotalzip.entity.DaxxxiaoguaiEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DaxxxiaoguaiRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DaxxxiaoguaiEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldaxx(), 1.1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/daxx.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modeldaxx extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		public Modeldaxx() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, 2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -6.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 2.0F);
			setRotationAngle(body, 0.1745F, 0.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 2.7482F, -0.656F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.9163F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 75).addBox(-5.0F, -3.5F, -1.0F, 10.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 2.9544F, -0.5209F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.9163F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 55).addBox(-6.0F, -5.1069F, 0.0717F, 12.0F, 16.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(3.0F, 4.0883F, 12.0109F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.8727F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(69, 0).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(67, 9).addBox(-8.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 2.1435F, 5.0629F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.9163F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 27).addBox(-8.0F, -9.5F, -2.5F, 16.0F, 19.0F, 5.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(7.0F, 5.0F, 2.0F);
			leftarm.setTextureOffset(86, 28).addBox(-1.0F, -1.0F, -3.0F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			leftarm.setTextureOffset(88, 60).addBox(-1.0F, 15.0F, -3.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-7.0F, 5.0F, 1.0F);
			rightarm.setTextureOffset(53, 57).addBox(-4.0F, 15.0F, -2.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);
			rightarm.setTextureOffset(55, 27).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(5.0F, 11.0F, 14.0F);
			leftleg.setTextureOffset(0, 91).addBox(0.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			leftleg.setTextureOffset(0, 111).addBox(0.0F, 10.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-5.0F, 11.0F, 14.0F);
			rightleg.setTextureOffset(23, 91).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			rightleg.setTextureOffset(24, 113).addBox(-4.0F, 10.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
