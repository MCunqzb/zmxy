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

import net.mcreator.zaomengxiyoutotalzip.entity.YuzeiwangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class YuzeiwangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(YuzeiwangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelyuzeiwangband2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/yuzeiwangband2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelyuzeiwangband2 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		public Modelyuzeiwangband2() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 18).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 0.0F);
			body.setTextureOffset(0, 35).addBox(-4.0F, -6.0F, -1.0F, 8.0F, 13.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(33, 45).addBox(-5.0F, -4.0F, -1.2F, 10.0F, 8.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(33, 36).addBox(-5.0F, -4.0F, 3.2F, 10.0F, 8.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(57, 37).addBox(-5.0F, -6.0F, -1.1F, 10.0F, 2.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(57, 41).addBox(-5.0F, -6.0F, 3.1F, 10.0F, 2.0F, 0.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 12.0F, 1.0F);
			leftleg.setTextureOffset(19, 73).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 12.0F, 1.0F);
			rightleg.setTextureOffset(0, 74).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(4.0F, 1.0F, 1.0F);
			leftarm.setTextureOffset(41, 58).addBox(0.0F, 7.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(54, 56).addBox(5.0F, 7.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			leftarm.setTextureOffset(41, 63).addBox(0.0F, 7.0F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(0.0F, -2.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(2.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(4.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 0).addBox(0.0F, -3.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 54).addBox(1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-4.0F, 1.0F, 1.0F);
			rightarm.setTextureOffset(0, 54).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-6.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(40, 71).addBox(-3.0F, 8.0F, -10.0F, 1.0F, 1.0F, 20.0F, 0.0F, false);
			rightarm.setTextureOffset(86, 87).addBox(-4.0F, 7.0F, -13.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(87, 79).addBox(-3.0F, 8.0F, 10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
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
