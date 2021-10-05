// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelshouyeren extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public Modelshouyeren() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -5.0F, 0.0F);
		head.setTextureOffset(48, 62).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(31, 101).addBox(4.1F, -9.0F, 1.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(47, 101).addBox(-4.1F, -9.0F, 1.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(89, 0).addBox(-4.0F, -8.1F, -4.1F, 8.0F, 2.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(96, 117).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(96, 105).addBox(-4.0F, -15.0F, -3.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(100, 89).addBox(-3.0F, -23.0F, -2.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(110, 60).addBox(-1.0F, -30.0F, 3.0F, 2.0F, 6.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(106, 73).addBox(-2.0F, -28.0F, 0.0F, 4.0F, 8.0F, 7.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 2.0F, 0.0F);
		body.setTextureOffset(52, 0).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 15.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(24, 0).addBox(12.0F, -4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 41).addBox(4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(-12.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(20, 0).addBox(-12.0F, -4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(13, 89).addBox(4.9F, 9.0F, -3.0F, 0.0F, 13.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 89).addBox(-4.9F, 9.0F, -3.0F, 0.0F, 13.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 23).addBox(-5.0F, 7.0F, -3.1F, 10.0F, 15.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 80).addBox(-5.0F, 7.0F, 3.1F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, -4.0F, 0.0F);
		leftarm.setTextureOffset(48, 21).addBox(0.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, -4.0F, 0.0F);
		rightarm.setTextureOffset(64, 21).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(32, 0).addBox(-4.0F, -13.0F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(28, 19).addBox(0.0F, -13.0F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}