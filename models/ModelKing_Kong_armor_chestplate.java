// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelKing_Kong_armor_chestplate extends EntityModel<Entity> {
	private final ModelRenderer body2;
	private final ModelRenderer pifeng;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r7_r2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public ModelKing_Kong_armor_chestplate() {
		textureWidth = 64;
		textureHeight = 32;

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 1.0F, 0.0F);
		body2.setTextureOffset(16, 16).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);

		pifeng = new ModelRenderer(this);
		pifeng.setRotationPoint(0.0F, 0.0F, 3.0F);
		body2.addChild(pifeng);
		setRotationAngle(pifeng, 0.2618F, 0.0F, 0.0F);
		pifeng.setTextureOffset(32, 0).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 1.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(-2.0F, -1.5F, 0.0F);
		RightArm.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, -0.5672F, 0.0F, 0.0F);
		cube_r7_r1.setTextureOffset(56, 10).addBox(-1.0F, -8.5F, 1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
		RightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(56, 21).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, 1.0F, 0.0F);
		RightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, -0.3491F);
		cube_r2.setTextureOffset(56, 21).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, 1.0F, 0.0F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, -0.9599F);
		cube_r3.setTextureOffset(56, 21).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
		RightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(56, 21).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(40, 16).addBox(0.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.0F, 0.0F, 0.0F);
		LeftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.9599F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(56, 21).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.0F, 0.0F, 0.0F);
		LeftArm.addChild(cube_r9);

		cube_r7_r2 = new ModelRenderer(this);
		cube_r7_r2.setRotationPoint(0.0F, -2.5F, 0.0F);
		cube_r9.addChild(cube_r7_r2);
		setRotationAngle(cube_r7_r2, -0.5672F, 0.0F, 0.0F);
		cube_r7_r2.setTextureOffset(56, 10).addBox(-1.0F, -8.5F, 1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0F, 0.0F, 0.0F);
		LeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.3491F);
		cube_r6.setTextureOffset(56, 21).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, 0.0F, 0.0F);
		LeftArm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.9599F);
		cube_r7.setTextureOffset(56, 21).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.0F, 0.0F, 0.0F);
		LeftArm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(56, 21).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}