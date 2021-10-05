// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelshark extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer mouse1;
	private final ModelRenderer mouse2;

	public Modelshark() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, -6.0F);
		body.setTextureOffset(93, 0).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 6.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(105, 17).addBox(-3.0F, -3.0F, 10.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(82, 20).addBox(-3.0F, -2.0F, 16.0F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(114, 28).addBox(-1.0F, -2.0F, 21.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(98, 37).addBox(-6.0F, -1.0F, 25.0F, 12.0F, 0.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(51, 48).addBox(0.0F, -10.0F, 4.0F, 0.0F, 7.0F, 11.0F, 0.0F, false);

		mouse1 = new ModelRenderer(this);
		mouse1.setRotationPoint(0.0F, 22.0F, -6.0F);
		mouse1.setTextureOffset(48, 0).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		mouse2 = new ModelRenderer(this);
		mouse2.setRotationPoint(0.0F, 21.0F, -6.0F);
		mouse2.setTextureOffset(47, 10).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		mouse1.render(matrixStack, buffer, packedLight, packedOverlay);
		mouse2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.mouse2.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.mouse1.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}