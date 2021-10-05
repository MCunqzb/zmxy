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

import net.mcreator.zaomengxiyoutotalzip.entity.PengmowangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PengmowangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PengmowangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpengmowang(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/pengmowang.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelpengmowang extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		public Modelpengmowang() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -1.0F, 0.0F);
			head.setTextureOffset(96, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 7.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(0, 24).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(-4.0F, -6.0F, -8.0F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 35).addBox(-2.0F, -4.0F, -11.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 35).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 31).addBox(-3.0F, -5.0F, -10.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(17, 31).addBox(-3.0F, -4.0F, -10.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 30).addBox(5.1F, -13.0F, 1.0F, 0.0F, 11.0F, 13.0F, 0.0F, false);
			head.setTextureOffset(28, 53).addBox(-5.1F, -13.0F, 1.0F, 0.0F, 11.0F, 13.0F, 0.0F, false);
			head.setTextureOffset(0, 41).addBox(-3.0F, -10.0F, -2.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 0.0F);
			body.setTextureOffset(104, 16).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(50, 19).addBox(-5.0F, -5.0F, -2.1F, 10.0F, 7.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(74, 0).addBox(4.0F, -6.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(73, 8).addBox(-9.0F, -6.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -5.0F, 2.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(71, 50).addBox(-5.0F, 0.0F, 0.1F, 10.0F, 13.0F, 0.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 12.0F, 0.0F);
			leftleg.setTextureOffset(88, 33).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 12.0F, 0.0F);
			rightleg.setTextureOffset(71, 33).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 1.0F, 0.0F);
			leftarm.setTextureOffset(71, 17).addBox(0.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(14, 46).addBox(4.0F, 3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			leftarm.setTextureOffset(9, 53).addBox(2.0F, 9.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(4, 54).addBox(3.0F, 9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 54).addBox(0.0F, 9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 1.0F, 0.0F);
			rightarm.setTextureOffset(88, 17).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(13, 53).addBox(-5.0F, 3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 48).addBox(-3.0F, 9.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(4, 48).addBox(-1.0F, 9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(9, 48).addBox(-4.0F, 9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 81).addBox(-2.0F, 9.0F, -14.0F, 1.0F, 1.0F, 25.0F, 0.0F, false);
			rightarm.setTextureOffset(31, 89).addBox(-3.0F, 8.0F, 11.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(31, 81).addBox(-2.0F, 7.0F, -15.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(31, 81).addBox(-2.0F, 7.0F, -19.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(42, 91).addBox(-2.0F, 7.0F, -18.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(41, 85).addBox(-2.0F, 11.0F, -18.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(51, 85).addBox(-2.0F, 8.0F, -18.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(51, 93).addBox(-2.0F, 8.0F, -25.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			rightarm.setTextureOffset(66, 93).addBox(-2.0F, 8.0F, -29.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(61, 103).addBox(-2.0F, 7.0F, -30.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(55, 103).addBox(-2.0F, 8.0F, -31.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(67, 103).addBox(-2.0F, 9.0F, -32.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
