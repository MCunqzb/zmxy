// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelguideng extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelguideng() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, 3.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(3.0F, -8.0F, -4.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(3.0F, -8.0F, 3.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 50).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(32, 55).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(32, 35).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(40, 0).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(48, 8).addBox(-2.0F, -13.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(32, 55).addBox(-0.5F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
	}
}