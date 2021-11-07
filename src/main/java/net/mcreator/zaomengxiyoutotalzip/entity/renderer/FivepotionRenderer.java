package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.zaomengxiyoutotalzip.item.FivepotionItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FivepotionRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FivepotionItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<FivepotionItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("zaomengxiyou:textures/five_poison_balls.png");
		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(FivepotionItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelFive_poison_balls();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(FivepotionItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFive_poison_balls extends EntityModel<Entity> {
		private final ModelRenderer hexadecagon1;
		private final ModelRenderer a8_r1;
		private final ModelRenderer a6_r1;
		private final ModelRenderer a5_r1;
		private final ModelRenderer a1_r1;
		private final ModelRenderer hexadecagon2;
		private final ModelRenderer a8_r2;
		private final ModelRenderer a6_r2;
		private final ModelRenderer a5_r2;
		private final ModelRenderer a1_r2;
		private final ModelRenderer hexadecagon3;
		private final ModelRenderer a8_r3;
		private final ModelRenderer a6_r3;
		private final ModelRenderer a5_r3;
		private final ModelRenderer a1_r3;
		private final ModelRenderer hexadecagon5;
		private final ModelRenderer a8_r4;
		private final ModelRenderer a6_r4;
		private final ModelRenderer a5_r4;
		private final ModelRenderer a1_r4;
		private final ModelRenderer hexadecagon7;
		private final ModelRenderer a8_r5;
		private final ModelRenderer a6_r5;
		private final ModelRenderer a5_r5;
		private final ModelRenderer a1_r5;
		private final ModelRenderer hexadecagon8;
		private final ModelRenderer a8_r6;
		private final ModelRenderer a6_r6;
		private final ModelRenderer a5_r6;
		private final ModelRenderer a1_r6;
		private final ModelRenderer hexadecagon4;
		private final ModelRenderer a8_r7;
		private final ModelRenderer a6_r7;
		private final ModelRenderer a5_r7;
		private final ModelRenderer a1_r7;
		private final ModelRenderer hexadecagon6;
		private final ModelRenderer a8_r8;
		private final ModelRenderer a6_r8;
		private final ModelRenderer a5_r8;
		private final ModelRenderer a1_r8;
		private final ModelRenderer hexadecagon9;
		private final ModelRenderer a8_r9;
		private final ModelRenderer a6_r9;
		private final ModelRenderer a5_r9;
		private final ModelRenderer a1_r9;
		private final ModelRenderer hexadecagon10;
		private final ModelRenderer a8_r10;
		private final ModelRenderer a6_r10;
		private final ModelRenderer a5_r10;
		private final ModelRenderer a1_r10;
		private final ModelRenderer bone;
		public ModelFive_poison_balls() {
			textureWidth = 16;
			textureHeight = 16;
			hexadecagon1 = new ModelRenderer(this);
			hexadecagon1.setRotationPoint(0.0F, 15.0F, 0.0F);
			hexadecagon1.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon1.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r1 = new ModelRenderer(this);
			a8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a8_r1);
			setRotationAngle(a8_r1, 0.0F, -0.3927F, 0.0F);
			a8_r1.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r1.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r1 = new ModelRenderer(this);
			a6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a6_r1);
			setRotationAngle(a6_r1, 0.0F, 0.3927F, 0.0F);
			a6_r1.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r1.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r1 = new ModelRenderer(this);
			a5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a5_r1);
			setRotationAngle(a5_r1, 0.0F, -0.7854F, 0.0F);
			a5_r1.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r1 = new ModelRenderer(this);
			a1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(a1_r1);
			setRotationAngle(a1_r1, 0.0F, 0.7854F, 0.0F);
			a1_r1.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon2 = new ModelRenderer(this);
			hexadecagon2.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon1.addChild(hexadecagon2);
			setRotationAngle(hexadecagon2, 0.0F, 0.0F, -0.3491F);
			hexadecagon2.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon2.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r2 = new ModelRenderer(this);
			a8_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(a8_r2);
			setRotationAngle(a8_r2, 0.0F, -0.3927F, 0.0F);
			a8_r2.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r2.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r2 = new ModelRenderer(this);
			a6_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(a6_r2);
			setRotationAngle(a6_r2, 0.0F, 0.3927F, 0.0F);
			a6_r2.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r2.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r2 = new ModelRenderer(this);
			a5_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(a5_r2);
			setRotationAngle(a5_r2, 0.0F, -0.7854F, 0.0F);
			a5_r2.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r2 = new ModelRenderer(this);
			a1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(a1_r2);
			setRotationAngle(a1_r2, 0.0F, 0.7854F, 0.0F);
			a1_r2.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon3 = new ModelRenderer(this);
			hexadecagon3.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon2.addChild(hexadecagon3);
			setRotationAngle(hexadecagon3, 0.0F, 0.0F, -0.3491F);
			hexadecagon3.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon3.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r3 = new ModelRenderer(this);
			a8_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon3.addChild(a8_r3);
			setRotationAngle(a8_r3, 0.0F, -0.3927F, 0.0F);
			a8_r3.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r3.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r3 = new ModelRenderer(this);
			a6_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon3.addChild(a6_r3);
			setRotationAngle(a6_r3, 0.0F, 0.3927F, 0.0F);
			a6_r3.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r3.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r3 = new ModelRenderer(this);
			a5_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon3.addChild(a5_r3);
			setRotationAngle(a5_r3, 0.0F, -0.7854F, 0.0F);
			a5_r3.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r3 = new ModelRenderer(this);
			a1_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon3.addChild(a1_r3);
			setRotationAngle(a1_r3, 0.0F, 0.7854F, 0.0F);
			a1_r3.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon5 = new ModelRenderer(this);
			hexadecagon5.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon3.addChild(hexadecagon5);
			setRotationAngle(hexadecagon5, 0.0F, 0.0F, -0.3491F);
			hexadecagon5.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon5.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r4 = new ModelRenderer(this);
			a8_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon5.addChild(a8_r4);
			setRotationAngle(a8_r4, 0.0F, -0.3927F, 0.0F);
			a8_r4.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r4.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r4 = new ModelRenderer(this);
			a6_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon5.addChild(a6_r4);
			setRotationAngle(a6_r4, 0.0F, 0.3927F, 0.0F);
			a6_r4.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r4.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r4 = new ModelRenderer(this);
			a5_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon5.addChild(a5_r4);
			setRotationAngle(a5_r4, 0.0F, -0.7854F, 0.0F);
			a5_r4.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r4 = new ModelRenderer(this);
			a1_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon5.addChild(a1_r4);
			setRotationAngle(a1_r4, 0.0F, 0.7854F, 0.0F);
			a1_r4.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon7 = new ModelRenderer(this);
			hexadecagon7.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon5.addChild(hexadecagon7);
			setRotationAngle(hexadecagon7, 0.0F, 0.0F, -0.3491F);
			hexadecagon7.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon7.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r5 = new ModelRenderer(this);
			a8_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon7.addChild(a8_r5);
			setRotationAngle(a8_r5, 0.0F, -0.3927F, 0.0F);
			a8_r5.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r5.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r5 = new ModelRenderer(this);
			a6_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon7.addChild(a6_r5);
			setRotationAngle(a6_r5, 0.0F, 0.3927F, 0.0F);
			a6_r5.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r5.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r5 = new ModelRenderer(this);
			a5_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon7.addChild(a5_r5);
			setRotationAngle(a5_r5, 0.0F, -0.7854F, 0.0F);
			a5_r5.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r5 = new ModelRenderer(this);
			a1_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon7.addChild(a1_r5);
			setRotationAngle(a1_r5, 0.0F, 0.7854F, 0.0F);
			a1_r5.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon8 = new ModelRenderer(this);
			hexadecagon8.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon7.addChild(hexadecagon8);
			setRotationAngle(hexadecagon8, 0.0F, 0.0F, -0.3491F);
			hexadecagon8.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon8.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r6 = new ModelRenderer(this);
			a8_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon8.addChild(a8_r6);
			setRotationAngle(a8_r6, 0.0F, -0.3927F, 0.0F);
			a8_r6.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r6.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r6 = new ModelRenderer(this);
			a6_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon8.addChild(a6_r6);
			setRotationAngle(a6_r6, 0.0F, 0.3927F, 0.0F);
			a6_r6.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r6.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r6 = new ModelRenderer(this);
			a5_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon8.addChild(a5_r6);
			setRotationAngle(a5_r6, 0.0F, -0.7854F, 0.0F);
			a5_r6.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r6 = new ModelRenderer(this);
			a1_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon8.addChild(a1_r6);
			setRotationAngle(a1_r6, 0.0F, 0.7854F, 0.0F);
			a1_r6.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon4 = new ModelRenderer(this);
			hexadecagon4.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon8.addChild(hexadecagon4);
			setRotationAngle(hexadecagon4, 0.0F, 0.0F, -0.3491F);
			hexadecagon4.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon4.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r7 = new ModelRenderer(this);
			a8_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon4.addChild(a8_r7);
			setRotationAngle(a8_r7, 0.0F, -0.3927F, 0.0F);
			a8_r7.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r7.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r7 = new ModelRenderer(this);
			a6_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon4.addChild(a6_r7);
			setRotationAngle(a6_r7, 0.0F, 0.3927F, 0.0F);
			a6_r7.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r7.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r7 = new ModelRenderer(this);
			a5_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon4.addChild(a5_r7);
			setRotationAngle(a5_r7, 0.0F, -0.7854F, 0.0F);
			a5_r7.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r7 = new ModelRenderer(this);
			a1_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon4.addChild(a1_r7);
			setRotationAngle(a1_r7, 0.0F, 0.7854F, 0.0F);
			a1_r7.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon6 = new ModelRenderer(this);
			hexadecagon6.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon4.addChild(hexadecagon6);
			setRotationAngle(hexadecagon6, 0.0F, 0.0F, -0.3491F);
			hexadecagon6.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon6.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r8 = new ModelRenderer(this);
			a8_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon6.addChild(a8_r8);
			setRotationAngle(a8_r8, 0.0F, -0.3927F, 0.0F);
			a8_r8.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r8.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r8 = new ModelRenderer(this);
			a6_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon6.addChild(a6_r8);
			setRotationAngle(a6_r8, 0.0F, 0.3927F, 0.0F);
			a6_r8.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r8.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r8 = new ModelRenderer(this);
			a5_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon6.addChild(a5_r8);
			setRotationAngle(a5_r8, 0.0F, -0.7854F, 0.0F);
			a5_r8.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r8 = new ModelRenderer(this);
			a1_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon6.addChild(a1_r8);
			setRotationAngle(a1_r8, 0.0F, 0.7854F, 0.0F);
			a1_r8.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon9 = new ModelRenderer(this);
			hexadecagon9.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon4.addChild(hexadecagon9);
			setRotationAngle(hexadecagon9, 0.0F, 0.0F, -0.3491F);
			hexadecagon9.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon9.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r9 = new ModelRenderer(this);
			a8_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon9.addChild(a8_r9);
			setRotationAngle(a8_r9, 0.0F, -0.3927F, 0.0F);
			a8_r9.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r9.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r9 = new ModelRenderer(this);
			a6_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon9.addChild(a6_r9);
			setRotationAngle(a6_r9, 0.0F, 0.3927F, 0.0F);
			a6_r9.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r9.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r9 = new ModelRenderer(this);
			a5_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon9.addChild(a5_r9);
			setRotationAngle(a5_r9, 0.0F, -0.7854F, 0.0F);
			a5_r9.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r9 = new ModelRenderer(this);
			a1_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon9.addChild(a1_r9);
			setRotationAngle(a1_r9, 0.0F, 0.7854F, 0.0F);
			a1_r9.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon10 = new ModelRenderer(this);
			hexadecagon10.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon9.addChild(hexadecagon10);
			setRotationAngle(hexadecagon10, 0.0F, 0.0F, -0.3491F);
			hexadecagon10.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			hexadecagon10.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r10 = new ModelRenderer(this);
			a8_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon10.addChild(a8_r10);
			setRotationAngle(a8_r10, 0.0F, -0.3927F, 0.0F);
			a8_r10.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a8_r10.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a6_r10 = new ModelRenderer(this);
			a6_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon10.addChild(a6_r10);
			setRotationAngle(a6_r10, 0.0F, 0.3927F, 0.0F);
			a6_r10.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			a6_r10.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a5_r10 = new ModelRenderer(this);
			a5_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon10.addChild(a5_r10);
			setRotationAngle(a5_r10, 0.0F, -0.7854F, 0.0F);
			a5_r10.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			a1_r10 = new ModelRenderer(this);
			a1_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			hexadecagon10.addChild(a1_r10);
			setRotationAngle(a1_r10, 0.0F, 0.7854F, 0.0F);
			a1_r10.setTextureOffset(0, 0).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 6.0F, 0.0F);
			setRotationAngle(bone, 3.1416F, 0.0F, 0.0F);
			bone.setTextureOffset(0, 7).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 11).addBox(-0.5F, -13.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 11).addBox(1.5F, -13.5F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 11).addBox(-3.5F, -15.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 11).addBox(-0.5F, -14.5F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			hexadecagon1.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
