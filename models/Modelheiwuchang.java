// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelheiwuchang extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg2;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm2;

	public Modelheiwuchang() {
		textureWidth = 120;
		textureHeight = 120;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		head.setTextureOffset(0, 104).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 87).addBox(-5.0F, -11.0F, -5.0F, 10.0F, 6.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(0, 58).addBox(-1.0F, -18.0F, -5.0F, 2.0F, 12.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(96, 34).addBox(-6.0F, -7.0F, -5.1F, 12.0F, 13.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(30, 0).addBox(-7.0F, -27.0F, -5.0F, 14.0F, 18.0F, 11.0F, 0.0F, false);
		body.setTextureOffset(88, 54).addBox(7.0F, -26.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(38, 81).addBox(-15.0F, -26.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(76, 80).addBox(-7.0F, -11.0F, 6.1F, 14.0F, 11.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(76, 69).addBox(-7.0F, -11.0F, -5.1F, 14.0F, 11.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(86, 85).addBox(7.2F, -11.0F, -5.0F, 0.0F, 11.0F, 11.0F, 0.0F, false);
		body.setTextureOffset(63, 85).addBox(-7.2F, -11.0F, -5.0F, 0.0F, 11.0F, 11.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(36, 29).addBox(0.0F, -9.0F, -5.0F, 7.0F, 9.0F, 11.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-7.0F, 24.0F, 0.0F);
		rightleg2.setTextureOffset(0, 29).addBox(0.0F, -9.0F, -5.0F, 7.0F, 9.0F, 11.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(10.0F, 1.0F, 0.0F);
		leftarm.setTextureOffset(50, 58).addBox(-3.0F, -2.0F, -3.0F, 7.0F, 16.0F, 6.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 0).addBox(-2.0F, 14.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 0).addBox(1.0F, 14.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 0).addBox(0.0F, 14.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(62, 79).addBox(0.0F, 9.0F, -33.0F, 0.0F, 12.0F, 29.0F, 0.0F, false);
		leftarm.setTextureOffset(100, 19).addBox(-0.5F, 14.0F, -5.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
		leftarm.setTextureOffset(102, 0).addBox(0.0F, 11.0F, 4.0F, 0.0F, 9.0F, 9.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-11.0F, 1.0F, 0.0F);
		rightarm2.setTextureOffset(24, 58).addBox(-3.0F, -2.0F, -3.0F, 7.0F, 16.0F, 6.0F, 0.0F, false);
		rightarm2.setTextureOffset(0, 0).addBox(-2.0F, 14.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm2.setTextureOffset(0, 0).addBox(1.0F, 14.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm2.setTextureOffset(0, 0).addBox(-1.0F, 14.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm2.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}