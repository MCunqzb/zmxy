// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelniumoxiaobing extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftaleg;
	private final ModelRenderer rightleg;

	public Modelniumoxiaobing() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.0F, 0.0F);
		head.setTextureOffset(96, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(88, 18).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(102, 30).addBox(0.0F, -16.0F, -3.0F, 0.0F, 17.0F, 13.0F, 0.0F, false);
		head.setTextureOffset(108, 63).addBox(-8.0F, -9.0F, 0.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(108, 63).addBox(5.0F, -9.0F, 0.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(116, 75).addBox(-7.0F, -11.0F, 7.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(116, 75).addBox(4.0F, -11.0F, 7.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(120, 86).addBox(-6.5F, -13.0F, 7.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(120, 86).addBox(4.5F, -13.0F, 7.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(90, 0).addBox(-6.0F, -14.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(90, 0).addBox(5.0F, -14.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0F, 0.0F);
		body.setTextureOffset(45, 16).addBox(-6.0F, -6.0F, -4.0F, 12.0F, 13.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(58, 0).addBox(-6.0F, -4.0F, -5.0F, 12.0F, 11.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 0).addBox(-6.0F, 7.0F, -4.1F, 12.0F, 7.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(6.0F, 4.0F, 0.0F);
		leftarm.setTextureOffset(54, 57).addBox(0.0F, -2.0F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 72).addBox(5.0F, -2.0F, -3.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-6.0F, 4.0F, 0.0F);
		rightarm.setTextureOffset(80, 58).addBox(-5.0F, -2.0F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 91).addBox(-3.0F, 10.0F, -23.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 0).addBox(-4.0F, 7.0F, -19.0F, 3.0F, 6.0F, 5.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 0).addBox(-2.5F, 13.0F, -24.0F, 0.0F, 9.0F, 15.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 54).addBox(-6.0F, -2.0F, -3.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		leftaleg = new ModelRenderer(this);
		leftaleg.setRotationPoint(3.0F, 15.0F, 0.0F);
		leftaleg.setTextureOffset(77, 41).addBox(-2.0F, 0.0F, -4.0F, 5.0F, 9.0F, 7.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-3.0F, 15.0F, 0.0F);
		rightleg.setTextureOffset(51, 40).addBox(-3.0F, 0.0F, -4.0F, 5.0F, 9.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftaleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftaleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}