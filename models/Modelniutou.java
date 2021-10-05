// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelniutou extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelniutou() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 3.0F, 0.0F);
		head.setTextureOffset(47, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(77, 7).addBox(4.0F, -7.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(33, 7).addBox(-8.0F, -7.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(102, 0).addBox(0.0F, -15.0F, -3.0F, 0.0F, 15.0F, 13.0F, 0.0F, false);
		head.setTextureOffset(70, 2).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(19, 0).addBox(8.5F, -12.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 6).addBox(8.0F, -9.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(8.0F, -6.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-9.0F, -6.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		head.setTextureOffset(16, 6).addBox(-10.0F, -9.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		head.setTextureOffset(19, 0).addBox(-9.5F, -12.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 0.0F);
		body.setTextureOffset(45, 15).addBox(-5.0F, -2.0F, -3.0F, 10.0F, 13.0F, 7.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(7.0F, 5.0F, 1.0F);
		leftarm.setTextureOffset(27, 17).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);
		leftarm.setTextureOffset(3, 22).addBox(-2.0F, -3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
		leftarm.setTextureOffset(20, 25).addBox(-2.0F, -6.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(11, 25).addBox(1.0F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(5, 27).addBox(3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 33).addBox(-1.0F, 8.0F, -6.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 33).addBox(-2.0F, 7.0F, -9.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(18, 38).addBox(-3.0F, 6.0F, -15.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 39).addBox(-3.0F, 6.0F, -24.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(3, 50).addBox(-4.0F, 5.0F, -22.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		leftarm.setTextureOffset(25, 41).addBox(-3.0F, 3.0F, -20.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(20, 41).addBox(0.0F, 3.0F, -18.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(25, 38).addBox(-2.0F, 12.0F, -18.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(20, 38).addBox(-2.0F, 12.0F, -21.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(20, 35).addBox(-1.0F, 3.0F, -21.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(25, 35).addBox(1.0F, 12.0F, -20.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(29, 36).addBox(3.0F, 9.0F, -20.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(34, 42).addBox(-6.0F, 7.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(11, 55).addBox(-6.0F, 8.0F, -21.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(24, 55).addBox(3.0F, 10.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(24, 53).addBox(-6.0F, 10.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(24, 51).addBox(3.0F, 7.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(30, 54).addBox(-2.0F, 9.0F, -26.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(30, 51).addBox(-1.0F, 7.0F, -26.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(11, 51).addBox(1.0F, 9.0F, -26.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-6.0F, 5.0F, 1.0F);
		rightarm.setTextureOffset(79, 17).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);
		rightarm.setTextureOffset(80, 33).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
		rightarm.setTextureOffset(97, 38).addBox(-6.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		rightarm.setTextureOffset(88, 36).addBox(0.0F, -6.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		rightarm.setTextureOffset(84, 36).addBox(-3.0F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.0F, 17.0F, 0.0F);
		leftleg.setTextureOffset(63, 44).addBox(-3.0F, -1.0F, -3.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 17.0F, 0.0F);
		rightleg.setTextureOffset(39, 44).addBox(-3.0F, -1.0F, -3.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);
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