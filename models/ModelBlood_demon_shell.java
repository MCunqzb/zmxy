// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBlood_demon_shell extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public ModelBlood_demon_shell() {
		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 16).addBox(-1.0F, -8.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 18).addBox(-2.0F, -9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 23).addBox(-4.0F, -9.0F, 5.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(8, 12).addBox(-3.0F, -2.0F, 5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(12, 25).addBox(-3.0F, -10.0F, -6.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(17, 17).addBox(-2.0F, -10.5F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(17, 17).addBox(-2.0F, -10.5F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(27, 17).addBox(-2.0F, -10.5F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(27, 17).addBox(-2.0F, -10.5F, 3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(30, 22).addBox(-3.0F, -8.5F, 5.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(16, 20).addBox(-3.0F, -5.5F, 5.4F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(36, 25).addBox(-4.0F, -10.0F, 0.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}