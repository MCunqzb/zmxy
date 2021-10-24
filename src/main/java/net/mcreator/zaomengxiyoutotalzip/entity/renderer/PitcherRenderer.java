package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.PitcherEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PitcherRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PitcherEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelThe_pitcher(), 2f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/the_pitcher.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelThe_pitcher extends EntityModel<Entity> {
		private final ModelRenderer bone4;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer bone;
		public ModelThe_pitcher() {
			textureWidth = 128;
			textureHeight = 64;
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -1.0F, 0.0F);
			bone4.setTextureOffset(0, 0).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 25.0F, 0.0F);
			bone4.addChild(bone2);
			setRotationAngle(bone2, -3.1416F, -1.5708F, 3.1416F);
			bone2.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, -21.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, 16.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, -18.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, 17.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, -25.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, 21.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-19.0F, 6.0F, 0.0F);
			bone4.addChild(bone3);
			setRotationAngle(bone3, 0.0F, -1.5708F, 1.5708F);
			bone3.setTextureOffset(33, 0).addBox(-12.0F, -31.0F, -15.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
			bone3.setTextureOffset(33, 0).addBox(-14.0F, -33.0F, 22.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
			bone3.setTextureOffset(33, 0).addBox(-14.0F, -33.0F, -12.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
			bone3.setTextureOffset(33, 0).addBox(-12.0F, -31.0F, 23.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
			bone3.setTextureOffset(33, 0).addBox(-10.0F, -29.0F, -19.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
			bone3.setTextureOffset(33, 0).addBox(-10.0F, -29.0F, 27.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 25.0F, 0.0F);
			bone4.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.0F, 0.0F);
			bone.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, -21.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, 16.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(33, 0).addBox(-14.0F, -39.0F, -18.0F, 28.0F, 28.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(33, 0).addBox(-12.0F, -37.0F, 17.0F, 24.0F, 24.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, -25.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(33, 0).addBox(-10.0F, -35.0F, 21.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.bone4.rotateAngleX = f2;
		}
	}
}
