// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpollen extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelpollen() {
		textureWidth = 40;
		textureHeight = 40;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 17.0F, 0.0F);
		bone.setTextureOffset(0, 20).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(0, 10).addBox(-4.0F, -4.0F, 5.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 10).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(22, 3).addBox(-6.0F, -4.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(22, 3).addBox(5.0F, -4.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bone.rotateAngleY = f2 / 20.f;
	}
}