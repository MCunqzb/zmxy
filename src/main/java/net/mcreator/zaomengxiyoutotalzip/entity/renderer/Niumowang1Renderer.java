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

import net.mcreator.zaomengxiyoutotalzip.entity.Niumowang1Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Niumowang1Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Niumowang1Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelniumowang1(), 1.2f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/niumowang1.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelniumowang1 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer legleft1;
		private final ModelRenderer legleft2;
		private final ModelRenderer rightleg2;
		private final ModelRenderer rightleg1;
		public Modelniumowang1() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 10.0F, -5.0F);
			head.setTextureOffset(96, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-5.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-5.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-5.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-5.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(8, 44).addBox(-7.5F, -12.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(4, 51).addBox(-7.0F, -16.0F, -1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 32).addBox(-8.0F, -8.0F, -3.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(67, 34).addBox(-8.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(4.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(4.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 51).addBox(6.0F, -16.0F, -1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 44).addBox(5.5F, -12.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 33).addBox(5.0F, -8.0F, -3.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(4.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(4.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-0.5F, 2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-0.5F, 0.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-0.5F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(4.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 25).addBox(4.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 60).addBox(-1.5F, 3.0F, -9.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(84, 29).addBox(-6.0F, -19.0F, -5.0F, 12.0F, 10.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(84, 48).addBox(-5.0F, -17.0F, 4.0F, 10.0F, 7.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(88, 66).addBox(-5.0F, -18.0F, 14.0F, 10.0F, 9.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -17.0F, 20.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.9163F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 91).addBox(-2.0F, -1.0F, 8.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 81).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			legleft1 = new ModelRenderer(this);
			legleft1.setRotationPoint(4.0F, 15.0F, 0.0F);
			legleft1.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			legleft2 = new ModelRenderer(this);
			legleft2.setRotationPoint(3.0F, 15.0F, 17.0F);
			legleft2.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			rightleg2 = new ModelRenderer(this);
			rightleg2.setRotationPoint(-3.0F, 15.0F, 17.0F);
			rightleg2.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			rightleg1 = new ModelRenderer(this);
			rightleg1.setRotationPoint(-4.0F, 15.0F, -1.0F);
			rightleg1.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft1.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft2.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legleft1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legleft2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
