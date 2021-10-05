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

import net.mcreator.zaomengxiyoutotalzip.entity.GuichengxiangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GuichengxiangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GuichengxiangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelguichengxiang(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/guichengxiang.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelguichengxiang extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		public Modelguichengxiang() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 3.0F, 0.0F);
			head.setTextureOffset(96, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(90, 17).addBox(-5.0F, -7.0F, -4.0F, 10.0F, 2.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(72, 0).addBox(-4.0F, -11.0F, 2.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(71, 6).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(54, 0).addBox(3.0F, -8.0F, 3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 0).addBox(8.0F, -9.0F, 3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 7).addBox(-11.0F, -9.0F, 3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 5).addBox(-8.0F, -8.0F, 3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(50, 9).addBox(-1.0F, 2.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 15).addBox(1.0F, 2.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 15).addBox(-2.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(7, 10).addBox(3.0F, -4.0F, -4.1F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 11).addBox(3.1F, -4.0F, -4.2F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(17, 2).addBox(-4.1F, -4.0F, -4.2F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(8, 1).addBox(-4.0F, -4.0F, -4.1F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 21).addBox(-4.0F, -1.8F, -4.1F, 8.0F, 1.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 8.0F, 0.0F);
			body.setTextureOffset(97, 32).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(61, 15).addBox(-3.0F, -2.0F, 2.0F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 23).addBox(-4.0F, -3.0F, 3.0F, 8.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(59, 27).addBox(-3.0F, -2.0F, 5.0F, 6.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 29).addBox(-2.0F, -1.0F, 7.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.0F, 16.0F, 0.0F);
			leftleg.setTextureOffset(73, 41).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.0F, 16.0F, 0.0F);
			rightleg.setTextureOffset(52, 40).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(4.0F, 7.0F, 0.0F);
			leftarm.setTextureOffset(31, 37).addBox(0.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-4.0F, 7.0F, 0.0F);
			rightarm.setTextureOffset(11, 37).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 53).addBox(-3.0F, 5.0F, -11.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
			rightarm.setTextureOffset(45, 59).addBox(-4.0F, 4.0F, -14.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
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
