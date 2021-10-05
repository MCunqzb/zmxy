// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelmamian extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelmamian() {
		textureWidth = 160;
		textureHeight = 160;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.0F, 0.0F);
		head.setTextureOffset(58, 0).addBox(-3.0F, -8.0F, -6.0F, 6.0F, 8.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(58, 2).addBox(0.0F, -14.0F, -4.0F, 0.0F, 14.0F, 15.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 0.0F);
		body.setTextureOffset(61, 31).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 14.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(86, 35).addBox(-4.0F, -1.0F, -2.1F, 8.0F, 2.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(45, 35).addBox(-4.0F, -1.0F, 2.1F, 8.0F, 2.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(92, 38).addBox(-1.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 3.0F, 0.0F);
		leftarm.setTextureOffset(85, 45).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(101, 43).addBox(-1.0F, -2.0F, -3.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 49).addBox(0.5F, 0.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 52).addBox(2.0F, -1.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(124, 47).addBox(2.0F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(124, 45).addBox(0.0F, -1.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 55).addBox(4.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 57).addBox(4.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 59).addBox(2.0F, -3.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 61).addBox(1.5F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(123, 63).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(102, 38).addBox(1.0F, 12.0F, -7.0F, 1.0F, 1.0F, 28.0F, 0.0F, false);
		leftarm.setTextureOffset(132, 44).addBox(1.0F, 12.0F, -28.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		leftarm.setTextureOffset(132, 55).addBox(0.0F, 11.0F, -12.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		leftarm.setTextureOffset(122, 67).addBox(-1.0F, 10.0F, -16.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(140, 67).addBox(0.0F, 11.0F, -18.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 4.0F, 0.0F);
		rightarm.setTextureOffset(45, 45).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(23, 43).addBox(-5.0F, -3.0F, -3.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);
		rightarm.setTextureOffset(19, 46).addBox(-2.0F, -5.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(19, 49).addBox(-2.5F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(19, 51).addBox(-4.5F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(17, 53).addBox(-7.0F, -2.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(17, 55).addBox(-7.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(17, 57).addBox(-4.0F, -2.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rightarm.setTextureOffset(16, 60).addBox(-2.5F, -0.5F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rightarm.setTextureOffset(18, 63).addBox(-2.0F, -2.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(18, 65).addBox(-4.0F, -1.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 16.0F, 0.0F);
		leftleg.setTextureOffset(57, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 16.0F, 0.0F);
		rightleg.setTextureOffset(73, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}