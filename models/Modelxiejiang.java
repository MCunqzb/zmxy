// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelxiejiang extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer northfoot1;
	private final ModelRenderer northfoot2;
	private final ModelRenderer northfoot3;
	private final ModelRenderer southfoot1;
	private final ModelRenderer southfoot2;
	private final ModelRenderer southfoot3;
	private final ModelRenderer northqian;
	private final ModelRenderer sourthqian;

	public Modelxiejiang() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(84, 70).addBox(-5.0F, -2.0F, -6.0F, 10.0F, 1.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(76, 52).addBox(-6.0F, -5.0F, -7.0F, 12.0F, 3.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(76, 111).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 3.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(82, 0).addBox(-6.0F, -13.0F, -6.0F, 11.0F, 3.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(62, 85).addBox(-8.0F, -7.0F, -9.0F, 16.0F, 2.0F, 18.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, -9.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, -9.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(23, 60).addBox(-4.0F, -16.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(11, 59).addBox(-1.0F, -15.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 60).addBox(1.0F, -14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		northfoot1 = new ModelRenderer(this);
		northfoot1.setRotationPoint(-2.0F, 19.0F, -8.0F);
		northfoot1.setTextureOffset(0, 39).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		northfoot1.setTextureOffset(0, 45).addBox(-1.0F, 4.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		northfoot2 = new ModelRenderer(this);
		northfoot2.setRotationPoint(2.0F, 19.0F, -8.0F);
		northfoot2.setTextureOffset(9, 38).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		northfoot2.setTextureOffset(8, 45).addBox(-1.0F, 4.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		northfoot3 = new ModelRenderer(this);
		northfoot3.setRotationPoint(5.0F, 19.0F, -8.0F);
		northfoot3.setTextureOffset(16, 38).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		northfoot3.setTextureOffset(17, 45).addBox(-1.0F, 4.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		southfoot1 = new ModelRenderer(this);
		southfoot1.setRotationPoint(-2.0F, 19.0F, 7.0F);
		southfoot1.setTextureOffset(26, 37).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		southfoot1.setTextureOffset(26, 45).addBox(-1.0F, 4.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		southfoot2 = new ModelRenderer(this);
		southfoot2.setRotationPoint(2.0F, 19.0F, 7.0F);
		southfoot2.setTextureOffset(36, 37).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		southfoot2.setTextureOffset(36, 45).addBox(-1.0F, 4.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		southfoot3 = new ModelRenderer(this);
		southfoot3.setRotationPoint(5.0F, 19.0F, 7.0F);
		southfoot3.setTextureOffset(47, 37).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		southfoot3.setTextureOffset(46, 45).addBox(-1.0F, 4.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		northqian = new ModelRenderer(this);
		northqian.setRotationPoint(-4.0F, 17.0F, -7.0F);
		northqian.setTextureOffset(46, 0).addBox(0.0F, -1.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		northqian.setTextureOffset(72, 17).addBox(-3.0F, -6.0F, -16.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		northqian.setTextureOffset(74, 33).addBox(-3.0F, -1.0F, -16.0F, 6.0F, 2.0F, 7.0F, 0.0F, false);
		northqian.setTextureOffset(69, 0).addBox(-3.0F, -6.0F, -9.0F, 6.0F, 7.0F, 2.0F, 0.0F, false);
		northqian.setTextureOffset(43, 18).addBox(-4.0F, -6.0F, -12.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		northqian.setTextureOffset(57, 18).addBox(3.0F, -6.0F, -12.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);

		sourthqian = new ModelRenderer(this);
		sourthqian.setRotationPoint(-4.0F, 16.0F, 7.0F);
		sourthqian.setTextureOffset(47, 9).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		sourthqian.setTextureOffset(26, 0).addBox(-2.0F, -2.0F, 6.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		sourthqian.setTextureOffset(20, 19).addBox(-2.0F, -2.0F, 7.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		sourthqian.setTextureOffset(28, 8).addBox(-3.0F, -2.0F, 6.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		sourthqian.setTextureOffset(18, 9).addBox(3.0F, -2.0F, 6.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		sourthqian.setTextureOffset(19, 29).addBox(-2.0F, 2.0F, 7.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		northfoot1.render(matrixStack, buffer, packedLight, packedOverlay);
		northfoot2.render(matrixStack, buffer, packedLight, packedOverlay);
		northfoot3.render(matrixStack, buffer, packedLight, packedOverlay);
		southfoot1.render(matrixStack, buffer, packedLight, packedOverlay);
		southfoot2.render(matrixStack, buffer, packedLight, packedOverlay);
		southfoot3.render(matrixStack, buffer, packedLight, packedOverlay);
		northqian.render(matrixStack, buffer, packedLight, packedOverlay);
		sourthqian.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.northfoot2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.northfoot1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.southfoot3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.southfoot2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.sourthqian.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.southfoot1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.northqian.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.northfoot3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}