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

import net.mcreator.zaomengxiyoutotalzip.entity.BatinxiyouEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BatinxiyouRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BatinxiyouEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbat1(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/bat.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbat1 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer wingleft;
		private final ModelRenderer cube_r3;
		private final ModelRenderer wingright;
		private final ModelRenderer cube_r4;
		public Modelbat1() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 12.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 17.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 4.0F, 10.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.2217F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(2, 34).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -5.0F, 0.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.6981F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 16).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
			wingleft = new ModelRenderer(this);
			wingleft.setRotationPoint(3.0F, 16.0F, 0.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 3.0F);
			wingleft.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(19, 35).addBox(0.0F, -8.0F, 0.0F, 18.0F, 16.0F, 0.0F, 0.0F, false);
			wingright = new ModelRenderer(this);
			wingright.setRotationPoint(-3.0F, 16.0F, 3.0F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			wingright.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.6981F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(19, 35).addBox(-18.0F, -8.0F, 0.0F, 18.0F, 16.0F, 0.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			wingleft.render(matrixStack, buffer, packedLight, packedOverlay);
			wingright.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.wingright.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.wingleft.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
