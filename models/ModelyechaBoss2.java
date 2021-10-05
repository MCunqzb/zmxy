// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelyechaBoss2 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r10;
	private final ModelRenderer tooth;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r5_r2;
	private final ModelRenderer cube_r5_r3;
	private final ModelRenderer cube_r5_r4;
	private final ModelRenderer cube_r5_r5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r5_r6;
	private final ModelRenderer cube_r5_r7;
	private final ModelRenderer cube_r5_r8;
	private final ModelRenderer cube_r5_r9;
	private final ModelRenderer cube_r5_r10;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r5_r11;
	private final ModelRenderer cube_r5_r12;
	private final ModelRenderer cube_r5_r13;
	private final ModelRenderer cube_r5_r14;
	private final ModelRenderer cube_r5_r15;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r6_r3;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r6_r4;
	private final ModelRenderer cube_r6_r5;
	private final ModelRenderer cube_r6_r6;
	private final ModelRenderer body;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer letfarm;
	private final ModelRenderer leftarmup;
	private final ModelRenderer cube_r15;
	private final ModelRenderer leftarmdown;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer xuanzhuan;
	private final ModelRenderer cube_r25;

	public ModelyechaBoss2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -6.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 1.0F, -10.0F);
		head.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 0).addBox(1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		tooth = new ModelRenderer(this);
		tooth.setRotationPoint(0.0F, -14.0F, -3.0F);
		head.addChild(tooth);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
		tooth.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
		cube_r1.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.1719F, 0.0026F, -0.0302F);
		cube_r1_r1.setTextureOffset(0, 17).addBox(-5.0721F, 6.3512F, -6.409F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -1.0F, 3.0F);
		tooth.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, -0.1745F, 0.0F);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
		cube_r2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.043F, 0.001F, -0.0511F);
		cube_r2_r1.setTextureOffset(0, 45).addBox(-4.5957F, 6.5129F, -12.5035F, 3.0F, 6.0F, 7.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0F, 3.0F);
		tooth.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1309F, 0.1745F, 0.0F);

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
		cube_r3.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.043F, -0.001F, 0.0511F);
		cube_r3_r1.setTextureOffset(0, 45).addBox(1.5957F, 6.5129F, -12.5035F, 3.0F, 6.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 3.0F);
		tooth.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.1745F, 0.0F);

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
		cube_r4.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.1719F, -0.0026F, 0.0302F);
		cube_r4_r1.setTextureOffset(0, 31).addBox(0.0721F, 6.3512F, -6.409F, 5.0F, 7.0F, 7.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -14.0F, -3.0F);
		head.addChild(bone);
		bone.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, 0.0F, 10.0F, 9.0F, 8.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.4081F, -9.0F, 4.3358F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
		cube_r9.setTextureOffset(52, 0).addBox(-1.5919F, 14.4118F, -4.9951F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(1.9081F, 15.3361F, 10.1962F);
		cube_r9.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, -0.9163F, 0.0F, 0.0F);
		cube_r5_r1.setTextureOffset(68, 40).addBox(-2.5F, 7.1314F, 11.9003F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r5_r2 = new ModelRenderer(this);
		cube_r5_r2.setRotationPoint(2.4081F, 12.5644F, 9.0481F);
		cube_r9.addChild(cube_r5_r2);
		setRotationAngle(cube_r5_r2, -1.1781F, 0.0F, 0.0F);
		cube_r5_r2.setTextureOffset(68, 35).addBox(-3.5F, 3.7403F, 13.8582F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r3 = new ModelRenderer(this);
		cube_r5_r3.setRotationPoint(2.4081F, 7.4092F, 10.6047F);
		cube_r9.addChild(cube_r5_r3);
		setRotationAngle(cube_r5_r3, -1.4835F, 0.0F, 0.0F);
		cube_r5_r3.setTextureOffset(62, 28).addBox(-4.0F, 1.3073F, 14.9429F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5_r4 = new ModelRenderer(this);
		cube_r5_r4.setRotationPoint(2.4081F, 2.7898F, 8.6913F);
		cube_r9.addChild(cube_r5_r4);
		setRotationAngle(cube_r5_r4, -1.1781F, 0.0F, 0.0F);
		cube_r5_r4.setTextureOffset(62, 21).addBox(-4.0F, 5.7403F, 13.8582F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5_r5 = new ModelRenderer(this);
		cube_r5_r5.setRotationPoint(2.4081F, 4.2643F, 7.3401F);
		cube_r9.addChild(cube_r5_r5);
		setRotationAngle(cube_r5_r5, -0.7418F, 0.0F, 0.0F);
		cube_r5_r5.setTextureOffset(62, 14).addBox(-4.0F, 9.0592F, 5.1339F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.4081F, -9.0F, 4.3358F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.3491F, 0.0F);
		cube_r8.setTextureOffset(52, 0).addBox(-1.5919F, 14.4118F, -4.9951F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		cube_r5_r6 = new ModelRenderer(this);
		cube_r5_r6.setRotationPoint(1.9081F, 15.3361F, 10.1962F);
		cube_r8.addChild(cube_r5_r6);
		setRotationAngle(cube_r5_r6, -0.9163F, 0.0F, 0.0F);
		cube_r5_r6.setTextureOffset(68, 40).addBox(-2.5F, 7.1314F, 11.9003F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r5_r7 = new ModelRenderer(this);
		cube_r5_r7.setRotationPoint(2.4081F, 12.5644F, 9.0481F);
		cube_r8.addChild(cube_r5_r7);
		setRotationAngle(cube_r5_r7, -1.1781F, 0.0F, 0.0F);
		cube_r5_r7.setTextureOffset(68, 35).addBox(-3.5F, 3.7403F, 13.8582F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r8 = new ModelRenderer(this);
		cube_r5_r8.setRotationPoint(2.4081F, 7.4092F, 10.6047F);
		cube_r8.addChild(cube_r5_r8);
		setRotationAngle(cube_r5_r8, -1.4835F, 0.0F, 0.0F);
		cube_r5_r8.setTextureOffset(62, 28).addBox(-4.0F, 1.3073F, 14.9429F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5_r9 = new ModelRenderer(this);
		cube_r5_r9.setRotationPoint(2.4081F, 2.7898F, 8.6913F);
		cube_r8.addChild(cube_r5_r9);
		setRotationAngle(cube_r5_r9, -1.1781F, 0.0F, 0.0F);
		cube_r5_r9.setTextureOffset(62, 21).addBox(-4.0F, 5.7403F, 13.8582F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5_r10 = new ModelRenderer(this);
		cube_r5_r10.setRotationPoint(2.4081F, 4.2643F, 7.3401F);
		cube_r8.addChild(cube_r5_r10);
		setRotationAngle(cube_r5_r10, -0.7418F, 0.0F, 0.0F);
		cube_r5_r10.setTextureOffset(62, 14).addBox(-4.0F, 9.0592F, 5.1339F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.4081F, -9.0F, -5.6642F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(52, 0).addBox(-1.5919F, 16.4889F, 0.7819F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		cube_r5_r11 = new ModelRenderer(this);
		cube_r5_r11.setRotationPoint(1.9081F, 17.9243F, 19.8554F);
		cube_r5.addChild(cube_r5_r11);
		setRotationAngle(cube_r5_r11, -0.9163F, 0.0F, 0.0F);
		cube_r5_r11.setTextureOffset(68, 40).addBox(-2.5F, 9.9003F, 9.1314F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r5_r12 = new ModelRenderer(this);
		cube_r5_r12.setRotationPoint(2.4081F, 15.1526F, 18.7074F);
		cube_r5.addChild(cube_r5_r12);
		setRotationAngle(cube_r5_r12, -1.1781F, 0.0F, 0.0F);
		cube_r5_r12.setTextureOffset(68, 35).addBox(-3.5F, 7.1314F, 11.9003F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r13 = new ModelRenderer(this);
		cube_r5_r13.setRotationPoint(2.4081F, 9.9973F, 20.264F);
		cube_r5.addChild(cube_r5_r13);
		setRotationAngle(cube_r5_r13, -1.4835F, 0.0F, 0.0F);
		cube_r5_r13.setTextureOffset(62, 28).addBox(-4.0F, 5.1303F, 14.0954F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5_r14 = new ModelRenderer(this);
		cube_r5_r14.setRotationPoint(2.4081F, 5.378F, 18.3506F);
		cube_r5.addChild(cube_r5_r14);
		setRotationAngle(cube_r5_r14, -1.1781F, 0.0F, 0.0F);
		cube_r5_r14.setTextureOffset(62, 21).addBox(-4.0F, 9.1314F, 11.9003F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5_r15 = new ModelRenderer(this);
		cube_r5_r15.setRotationPoint(2.4081F, 6.8525F, 16.9994F);
		cube_r5.addChild(cube_r5_r15);
		setRotationAngle(cube_r5_r15, -0.7418F, 0.0F, 0.0F);
		cube_r5_r15.setTextureOffset(62, 14).addBox(-4.0F, 11.3052F, 1.9262F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.4081F, -7.0F, -5.6642F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(36, 0).addBox(-5.5919F, 18.9904F, -4.5679F, 1.0F, 3.0F, 4.0F, 0.0F, true);

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(-5.5919F, 7.2743F, 16.1531F);
		cube_r7.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.7854F, 0.0F, 0.0F);
		cube_r6_r1.setTextureOffset(46, 0).addBox(0.0F, 0.9504F, -15.0065F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setRotationPoint(6.4081F, 9.81F, 14.3405F);
		cube_r7.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.4363F, 0.0F, 0.0F);
		cube_r6_r2.setTextureOffset(36, 14).addBox(-12.0F, 3.4332F, -14.72F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r6_r3 = new ModelRenderer(this);
		cube_r6_r3.setRotationPoint(-4.5919F, 10.0F, 8.6642F);
		cube_r7.addChild(cube_r6_r3);
		setRotationAngle(cube_r6_r3, 0.2618F, 0.0F, 0.0F);
		cube_r6_r3.setTextureOffset(36, 7).addBox(-1.0F, 6.1924F, -12.0208F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.4081F, -7.0F, -5.6642F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(36, 0).addBox(5.4081F, 18.9904F, -4.5679F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r6_r4 = new ModelRenderer(this);
		cube_r6_r4.setRotationPoint(6.4081F, 7.2743F, 16.1531F);
		cube_r6.addChild(cube_r6_r4);
		setRotationAngle(cube_r6_r4, 0.7854F, 0.0F, 0.0F);
		cube_r6_r4.setTextureOffset(46, 0).addBox(-1.0F, 0.9504F, -15.0065F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r6_r5 = new ModelRenderer(this);
		cube_r6_r5.setRotationPoint(6.4081F, 9.81F, 14.3405F);
		cube_r6.addChild(cube_r6_r5);
		setRotationAngle(cube_r6_r5, 0.4363F, 0.0F, 0.0F);
		cube_r6_r5.setTextureOffset(36, 14).addBox(-1.0F, 3.4332F, -14.72F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r6_r6 = new ModelRenderer(this);
		cube_r6_r6.setRotationPoint(6.4081F, 10.0F, 8.6642F);
		cube_r6.addChild(cube_r6_r6);
		setRotationAngle(cube_r6_r6, 0.2618F, 0.0F, 0.0F);
		cube_r6_r6.setTextureOffset(36, 7).addBox(-1.0F, 6.1924F, -12.0208F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0F, 7.0F);
		setRotationAngle(body, -1.0472F, 0.0F, 0.0F);
		body.setTextureOffset(23, 20).addBox(-4.0F, 5.2588F, -0.0341F, 8.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(29, 57).addBox(-5.0F, 15.2588F, 0.9659F, 10.0F, 5.0F, 4.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(1.0F, 16.4F, 1.0F);
		body.addChild(bone_r1);
		setRotationAngle(bone_r1, -0.0873F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(46, 15).addBox(-2.0F, 0.1736F, 0.9848F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(1.0F, 8.0F, 1.0F);
		body.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0436F, 0.0F, 0.0F);
		bone_r2.setTextureOffset(46, 15).addBox(-2.0F, 0.3007F, 0.9537F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.0F, -4.0F, -2.0F);
		body.addChild(bone2);
		bone2.setTextureOffset(0, 74).addBox(-3.4899F, 10.5036F, 7.3696F, 13.0F, 4.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(47, 72).addBox(-2.4899F, 14.1036F, 7.1696F, 11.0F, 6.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(6, 68).addBox(0.0F, 13.2588F, 0.9659F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(31, 71).addBox(-2.0323F, 18.0426F, 2.0225F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		bone2.setTextureOffset(31, 71).addBox(6.2677F, 18.0426F, 2.0225F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(6.0937F, 15.9526F, 0.4226F);
		bone2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2182F, 0.2182F, 0.0F);
		cube_r11.setTextureOffset(0, 68).addBox(-0.2091F, -0.5432F, 0.8647F, 2.0F, 4.0F, 1.0F, 0.0F, true);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.1653F, 15.9053F, 0.9763F);
		bone2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2182F, -0.2182F, -0.0524F);
		cube_r12.setTextureOffset(0, 68).addBox(-1.8042F, -0.712F, 0.3242F, 2.0F, 4.0F, 1.0F, 0.0F, true);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 14.0F, 0.0F);
		bone2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2182F, -0.2182F, 0.0F);
		cube_r13.setTextureOffset(0, 58).addBox(-1.7909F, -0.5432F, 0.8647F, 2.0F, 2.0F, 8.0F, 0.0F, true);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(6.0F, 14.0F, 0.0F);
		bone2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.2182F, 0.2182F, 0.0F);
		cube_r14.setTextureOffset(0, 58).addBox(-0.2091F, -0.5432F, 0.8647F, 2.0F, 2.0F, 8.0F, 0.0F, true);

		letfarm = new ModelRenderer(this);
		letfarm.setRotationPoint(5.0F, 17.0F, -2.0F);
		setRotationAngle(letfarm, -1.5708F, 0.0F, 0.0F);

		leftarmup = new ModelRenderer(this);
		leftarmup.setRotationPoint(0.0F, -14.0F, 0.0F);
		letfarm.addChild(leftarmup);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 14.0F, 0.0F);
		leftarmup.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.1745F);
		cube_r15.setTextureOffset(25, 40).addBox(0.0F, -1.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		cube_r15.setTextureOffset(68, 56).addBox(2.0F, -3.0F, -2.0F, 1.0F, 11.0F, 5.0F, 0.0F, false);
		cube_r15.setTextureOffset(54, 15).addBox(1.5F, -3.0F, -3.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		cube_r15.setTextureOffset(54, 15).addBox(1.5F, -3.0F, 3.0F, 2.0F, 11.0F, 1.0F, 0.0F, true);
		cube_r15.setTextureOffset(37, 39).addBox(1.5F, -4.0F, -3.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
		cube_r15.setTextureOffset(37, 39).addBox(1.5F, 8.0F, -3.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		leftarmdown = new ModelRenderer(this);
		leftarmdown.setRotationPoint(0.7331F, -7.7001F, 0.0F);
		letfarm.addChild(leftarmdown);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 14.0F, 0.0F);
		leftarmdown.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.0873F);
		cube_r16.setTextureOffset(92, 20).addBox(4.2168F, -1.4487F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r16.setTextureOffset(88, 14).addBox(4.2168F, -0.4487F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r16.setTextureOffset(84, 0).addBox(4.2168F, 0.5513F, -3.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		cube_r16.setTextureOffset(25, 40).addBox(0.2168F, -0.4487F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(4.5388F, 21.9773F, 3.0F);
		leftarmdown.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2618F, 0.0F, 0.0873F);
		cube_r17.setTextureOffset(83, 44).addBox(-1.0F, 5.7412F, -1.0341F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		cube_r17.setTextureOffset(83, 33).addBox(-1.0F, -0.2588F, -3.0341F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(4.5388F, 21.9773F, -4.0F);
		leftarmdown.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.2618F, 0.0F, 0.0873F);
		cube_r18.setTextureOffset(83, 44).addBox(-1.0F, 6.2588F, 0.9659F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r18.setTextureOffset(80, 22).addBox(-1.0F, 0.2588F, 0.9659F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(4.1527F, 14.9168F, 4.7321F);
		leftarmdown.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -1.0472F, 0.0873F);
		cube_r19.setTextureOffset(94, 34).addBox(-0.134F, 0.0F, 0.5F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(5.1489F, 15.0039F, 3.0F);
		leftarmdown.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, -0.5236F, 0.0873F);
		cube_r20.setTextureOffset(94, 24).addBox(-0.5F, 0.0F, 0.866F, 1.0F, 7.0F, 2.0F, 0.0F, true);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(4.1527F, 14.9168F, -5.7321F);
		leftarmdown.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 1.2217F, 0.0873F);
		cube_r21.setTextureOffset(94, 34).addBox(-1.9397F, 0.0F, -1.658F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(5.1489F, 15.0039F, -4.0F);
		leftarmdown.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.5236F, 0.0873F);
		cube_r22.setTextureOffset(94, 24).addBox(-1.5F, 0.0F, -1.134F, 1.0F, 7.0F, 2.0F, 0.0F, true);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 16.0F, 1.0F);
		setRotationAngle(rightarm, -1.5708F, 0.0F, 0.0F);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.8797F, 10.4856F, 2.0F);
		rightarm.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.1745F);
		cube_r23.setTextureOffset(76, 86).addBox(0.8F, 14.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r23.setTextureOffset(76, 86).addBox(0.6F, 6.0F, -1.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		cube_r23.setTextureOffset(76, 86).addBox(0.0F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.1745F);
		cube_r24.setTextureOffset(88, 85).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		xuanzhuan = new ModelRenderer(this);
		xuanzhuan.setRotationPoint(0.0F, -4.0F, 0.0F);
		setRotationAngle(xuanzhuan, 0.0F, 0.0F, 0.7854F);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		xuanzhuan.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.3927F, -0.3927F, 0.0F);
		cube_r25.setTextureOffset(23, 19).addBox(8.7992F, 7.2459F, -8.809F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		letfarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		xuanzhuan.render(matrixStack, buffer, packedLight, packedOverlay);
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
	}
}