// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFive_poison_beasts extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headpitch;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r6;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r7;

	public ModelFive_poison_beasts() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.0F, 1.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, 16.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(18, 0).addBox(-1.0F, 15.25F, -3.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(24, 5).addBox(1.0F, 15.5F, -3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 5).addBox(-2.0F, 15.5F, -3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		headpitch = new ModelRenderer(this);
		headpitch.setRotationPoint(0.0F, -6.0F, 1.0F);
		headpitch.setTextureOffset(0, 0).addBox(-0.5F, 15.0F, 1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		headpitch.setTextureOffset(0, 0).addBox(-0.5F, 16.25F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		headpitch.setTextureOffset(0, 0).addBox(-0.5F, 15.0F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		headpitch.setTextureOffset(0, 2).addBox(2.5F, 19.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		headpitch.setTextureOffset(0, 2).addBox(-3.5F, 19.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, 20.0F, 0.0F);
		headpitch.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.48F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 12).addBox(-6.75F, 0.0F, 0.0F, 1.0F, 6.0F, 4.0F, 0.0F, true);
		cube_r1.setTextureOffset(0, 12).addBox(-0.25F, 0.0F, 0.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(10, 12).addBox(-2.0F, -8.0F, -0.5F, 4.0F, 6.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(10, 21).addBox(-1.5F, -7.0F, -0.75F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 22).addBox(-0.5F, -4.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(2.5F, -2.5F, 1.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 20.3904F, 0.7529F);
		leftarm.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(28, 11).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 19.0F, 0.0F);
		leftarm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(28, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-2.5F, -2.5F, 1.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, 20.3904F, 0.7529F);
		rightarm.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(28, 11).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 19.0F, 0.0F);
		rightarm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(28, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 3.0F, 1.0F);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 19.0F, -0.5F);
		leftleg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(28, 15).addBox(0.25F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 3.0F, 1.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 19.0F, -0.5F);
		rightleg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(28, 15).addBox(-1.25F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headpitch.render(matrixStack, buffer, packedLight, packedOverlay);
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
	}
}