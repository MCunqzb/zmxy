// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbaigujingkilled extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;

	public Modelbaigujingkilled() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, 0.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 5.0F, -8.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -1.5708F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 1.5708F, 0.0F, 0.0F);
		body_r1.setTextureOffset(16, 16).addBox(-4.0F, -4.0F, 1.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setRotationPoint(-2.0F, 12.0F, 0.0F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 1.5708F, 0.1309F, 0.0F);
		leftLeg_r1.setTextureOffset(0, 16).addBox(1.0F, 3.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setRotationPoint(2.0F, 12.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, 1.5708F, -0.1309F, 0.0F);
		rightLeg_r1.setTextureOffset(0, 16).addBox(-3.0F, 7.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, -1.5708F, -0.1745F, 0.0F);
		leftArm_r1.setTextureOffset(40, 16).addBox(4.0F, 4.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, -1.5708F, 1.1781F, 0.0F);
		rightArm_r1.setTextureOffset(40, 16).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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