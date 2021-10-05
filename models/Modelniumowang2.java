// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelniumowang2 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightlarm2;
	private final ModelRenderer leftarm2;

	public Modelniumowang2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(96, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(116, 16).addBox(4.0F, -7.0F, 1.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(108, 16).addBox(6.5F, -16.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(104, 16).addBox(7.0F, -19.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(104, 20).addBox(-8.0F, -19.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(108, 23).addBox(-8.5F, -16.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(82, 0).addBox(6.0F, -11.0F, 1.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(68, 0).addBox(-9.0F, -11.0F, 1.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(116, 24).addBox(-6.0F, -7.0F, 1.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(4.0F, -6.7F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-0.5F, -4.7F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-0.5F, -2.7F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-0.5F, -6.7F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-5.0F, -6.7F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(4.0F, -8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-5.0F, -8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(4.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-5.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(4.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-5.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(4.0F, -4.4F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-5.0F, -4.4F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -1.6F, -5.2F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.setTextureOffset(66, 15).addBox(-5.0F, -6.0F, -2.0F, 10.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -6.0F, 3.2F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(98, 30).addBox(-6.0F, 0.0F, 0.0F, 12.0F, 15.0F, 0.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.setTextureOffset(108, 111).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.setTextureOffset(88, 111).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		rightlarm2 = new ModelRenderer(this);
		rightlarm2.setRotationPoint(-5.0F, -1.0F, 0.0F);
		rightlarm2.setTextureOffset(0, 108).addBox(-5.0F, -1.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);
		rightlarm2.setTextureOffset(0, 58).addBox(-3.0F, 9.0F, -28.0F, 1.0F, 1.0F, 47.0F, 0.0F, false);
		rightlarm2.setTextureOffset(21, 111).addBox(-3.0F, 6.0F, -25.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		rightlarm2.setTextureOffset(0, 17).addBox(-2.5F, -5.0F, -31.0F, 0.0F, 11.0F, 20.0F, 0.0F, false);
		rightlarm2.setTextureOffset(0, 0).addBox(-2.5F, 13.0F, -36.0F, 0.0F, 12.0F, 25.0F, 0.0F, false);
		rightlarm2.setTextureOffset(57, 17).addBox(-6.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightlarm2.setTextureOffset(47, 17).addBox(-6.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(5.0F, -1.0F, 0.0F);
		leftarm2.setTextureOffset(48, 0).addBox(0.0F, -1.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);
		leftarm2.setTextureOffset(63, 17).addBox(5.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm2.setTextureOffset(52, 17).addBox(5.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightlarm2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm2.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.rightlarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}