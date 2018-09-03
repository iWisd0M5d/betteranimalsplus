package its_meow.betteranimalsplus.entity.model;

import org.lwjgl.opengl.GL11;

import its_meow.betteranimalsplus.entity.EntityFeralWolf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.MathHelper;

/**
 * newwolf - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelCustomWolf extends ModelBetterAnimals {
	public ModelRenderer chest;
	public ModelRenderer lArm01;
	public ModelRenderer body;
	public ModelRenderer neck;
	public ModelRenderer mane01;
	public ModelRenderer mane02;
	public ModelRenderer mane03;
	public ModelRenderer rArm01;
	public ModelRenderer lArm01_1;
	public ModelRenderer lForepaw;
	public ModelRenderer lHindLeg01;
	public ModelRenderer tail01;
	public ModelRenderer rHindLeg01;
	public ModelRenderer lHindLeg02;
	public ModelRenderer lHindLeg03;
	public ModelRenderer lHindpaw;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer rHindLeg02;
	public ModelRenderer rHindLeg03;
	public ModelRenderer rHindpaw;
	public ModelRenderer head;
	public ModelRenderer mane04;
	public ModelRenderer muzzleUpper;
	public ModelRenderer muzzleLower;
	public ModelRenderer snout;
	public ModelRenderer lEar01;
	public ModelRenderer rEar01;
	public ModelRenderer lEar02;
	public ModelRenderer lEar03;
	public ModelRenderer rEar02;
	public ModelRenderer rEar03;
	public ModelRenderer rArm01_1;
	public ModelRenderer rForepaw;

	public ModelCustomWolf() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.rEar02 = new ModelRenderer(this, 0, 0);
		this.rEar02.mirror = true;
		this.rEar02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rEar02.addBox(-0.5F, -3.2F, 0.0F, 1, 1, 1, 0.0F);
		this.rHindLeg01 = new ModelRenderer(this, 27, 11);
		this.rHindLeg01.mirror = true;
		this.rHindLeg01.setRotationPoint(-1.0F, -0.2F, 4.8F);
		this.rHindLeg01.addBox(-3.0F, -1.9F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rHindLeg01, -0.22759093446006054F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 45, 24);
		this.head.setRotationPoint(0.0F, -1.1F, -3.2F);
		this.head.addBox(-2.5F, -2.0F, -3.5F, 5, 5, 4, 0.0F);
		this.setRotateAngle(head, 0.18203784098300857F, 0.0F, 0.0F);
		this.lHindLeg01 = new ModelRenderer(this, 27, 11);
		this.lHindLeg01.setRotationPoint(1.0F, -0.2F, 4.8F);
		this.lHindLeg01.addBox(0.0F, -1.9F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(lHindLeg01, -0.22759093446006054F, 0.0F, 0.0F);
		this.muzzleLower = new ModelRenderer(this, 14, 55);
		this.muzzleLower.setRotationPoint(0.0F, 2.5F, -3.3F);
		this.muzzleLower.addBox(-1.5F, -0.5F, -2.9F, 3, 1, 3, 0.0F);
		this.rForepaw = new ModelRenderer(this, 52, 0);
		this.rForepaw.mirror = true;
		this.rForepaw.setRotationPoint(-0.0F, 7.7F, 0.0F);
		this.rForepaw.addBox(-1.5F, -0.9F, -2.3F, 3, 2, 3, 0.0F);
		this.lHindLeg03 = new ModelRenderer(this, 55, 11);
		this.lHindLeg03.setRotationPoint(0.1F, 3.2F, 0.6F);
		this.lHindLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(lHindLeg03, -0.6373942428283291F, 0.0F, 0.0F);
		this.rEar01 = new ModelRenderer(this, 0, 4);
		this.rEar01.mirror = true;
		this.rEar01.setRotationPoint(-1.7F, -1.0F, -2.5F);
		this.rEar01.addBox(-1.0F, -2.2F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(rEar01, 0.18203784098300857F, 0.35168384427685734F, -0.18203784098300857F);
		this.mane01 = new ModelRenderer(this, 16, 34);
		this.mane01.setRotationPoint(0.0F, -2.3F, -6.6F);
		this.mane01.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
		this.setRotateAngle(mane01, 0.27314402793711257F, 0.0F, 0.0F);
		this.muzzleUpper = new ModelRenderer(this, 0, 55);
		this.muzzleUpper.setRotationPoint(0.0F, 1.7F, -3.3F);
		this.muzzleUpper.addBox(-1.5F, -0.7F, -3.0F, 3, 1, 3, 0.0F);
		this.rEar03 = new ModelRenderer(this, 21, 0);
		this.rEar03.mirror = true;
		this.rEar03.setRotationPoint(0.0F, -0.1F, 1.3F);
		this.rEar03.addBox(-0.5F, -2.6F, -0.4F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rEar03, 0.27314402793711257F, 0.0F, 0.0F);
		this.rArm01_1 = new ModelRenderer(this, 44, 0);
		this.rArm01_1.mirror = true;
		this.rArm01_1.setRotationPoint(0.2F, 2.4F, 0.1F);
		this.rArm01_1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(rArm01_1, -0.22759093446006054F, 0.0F, -0.091106186954104F);
		this.snout = new ModelRenderer(this, 28, 55);
		this.snout.setRotationPoint(0.0F, 0.7F, -3.3F);
		this.snout.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
		this.setRotateAngle(snout, 0.136659280431156F, 0.0F, 0.0F);
		this.lEar02 = new ModelRenderer(this, 0, 0);
		this.lEar02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lEar02.addBox(-0.5F, -3.2F, 0.0F, 1, 1, 1, 0.0F);
		this.rHindpaw = new ModelRenderer(this, 52, 0);
		this.rHindpaw.mirror = true;
		this.rHindpaw.setRotationPoint(0.0F, 5.7F, 0.0F);
		this.rHindpaw.addBox(-1.5F, -0.9F, -2.3F, 3, 2, 3, 0.0F);
		this.mane04 = new ModelRenderer(this, 41, 44);
		this.mane04.setRotationPoint(0.0F, 1.8F, -1.6F);
		this.mane04.addBox(-1.5F, -0.3F, -1.6F, 3, 2, 5, 0.0F);
		this.setRotateAngle(mane04, -0.6373942428283291F, 0.0F, 0.0F);
		this.chest = new ModelRenderer(this, 0, 0);
		this.chest.setRotationPoint(0.0F, 12.8F, -0.8F);
		this.chest.addBox(-3.0F, -3.0F, -6.8F, 6, 6, 8, 0.0F);
		this.neck = new ModelRenderer(this, 27, 23);
		this.neck.setRotationPoint(0.0F, -0.7F, -5.6F);
		this.neck.addBox(-2.0F, -2.5F, -4.0F, 4, 5, 4, 0.0F);
		this.setRotateAngle(neck, -0.18203784098300857F, 0.0F, 0.0F);
		this.lEar01 = new ModelRenderer(this, 0, 4);
		this.lEar01.setRotationPoint(1.7F, -1.0F, -2.5F);
		this.lEar01.addBox(-1.0F, -2.2F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(lEar01, 0.18203784098300857F, -0.35168384427685734F, 0.18203784098300857F);
		this.tail02 = new ModelRenderer(this, 0, 36);
		this.tail02.setRotationPoint(0.0F, 0.2F, 1.8F);
		this.tail02.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
		this.setRotateAngle(tail02, -0.4553564018453205F, 0.0F, 0.0F);
		this.rHindLeg03 = new ModelRenderer(this, 55, 11);
		this.rHindLeg03.mirror = true;
		this.rHindLeg03.setRotationPoint(-0.1F, 3.2F, 0.6F);
		this.rHindLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(rHindLeg03, -0.6373942428283291F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 0, 16);
		this.body.setRotationPoint(0.0F, -0.2F, 1.0F);
		this.body.addBox(-2.5F, -2.5F, -0.2F, 5, 5, 7, 0.0F);
		this.setRotateAngle(body, -0.045553093477052F, 0.0F, 0.0F);
		this.lEar03 = new ModelRenderer(this, 21, 0);
		this.lEar03.setRotationPoint(0.0F, -0.1F, 1.3F);
		this.lEar03.addBox(-0.5F, -2.6F, -0.4F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lEar03, 0.27314402793711257F, 0.0F, 0.0F);
		this.lHindpaw = new ModelRenderer(this, 52, 0);
		this.lHindpaw.setRotationPoint(0.0F, 5.7F, 0.0F);
		this.lHindpaw.addBox(-1.5F, -0.9F, -2.3F, 3, 2, 3, 0.0F);
		this.rHindLeg02 = new ModelRenderer(this, 42, 11);
		this.rHindLeg02.mirror = true;
		this.rHindLeg02.setRotationPoint(-1.4F, 2.8F, -1.1F);
		this.rHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
		this.setRotateAngle(rHindLeg02, 0.9105382707654417F, 0.0F, 0.0F);
		this.tail03 = new ModelRenderer(this, 0, 44);
		this.tail03.setRotationPoint(0.0F, 0.0F, 3.5F);
		this.tail03.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
		this.setRotateAngle(tail03, -0.31869712141416456F, 0.0F, 0.0F);
		this.rArm01 = new ModelRenderer(this, 30, 0);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-3.1F, 0.2F, -3.3F);
		this.rArm01.addBox(-1.0F, -2.4F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(rArm01, 0.22759093446006054F, 0.0F, 0.091106186954104F);
		this.mane03 = new ModelRenderer(this, 21, 44);
		this.mane03.setRotationPoint(0.0F, 0.7F, -5.7F);
		this.mane03.addBox(-2.0F, 0.1F, -1.6F, 4, 2, 5, 0.0F);
		this.setRotateAngle(mane03, -0.6829473363053812F, 0.0F, 0.0F);
		this.lForepaw = new ModelRenderer(this, 52, 0);
		this.lForepaw.setRotationPoint(-0.0F, 7.7F, 0.0F);
		this.lForepaw.addBox(-1.5F, -0.9F, -2.3F, 3, 2, 3, 0.0F);
		this.mane02 = new ModelRenderer(this, 41, 34);
		this.mane02.setRotationPoint(0.0F, -2.4F, -3.5F);
		this.mane02.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 6, 0.0F);
		this.setRotateAngle(mane02, 0.136659280431156F, 0.0F, 0.0F);
		this.lArm01_1 = new ModelRenderer(this, 44, 0);
		this.lArm01_1.setRotationPoint(0.8F, 2.4F, 0.1F);
		this.lArm01_1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(lArm01_1, -0.22759093446006054F, 0.0F, 0.091106186954104F);
		this.lHindLeg02 = new ModelRenderer(this, 42, 11);
		this.lHindLeg02.setRotationPoint(1.4F, 2.8F, -1.1F);
		this.lHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
		this.setRotateAngle(lHindLeg02, 0.9105382707654417F, 0.0F, 0.0F);
		this.lArm01 = new ModelRenderer(this, 30, 0);
		this.lArm01.setRotationPoint(2.1F, 0.2F, -3.3F);
		this.lArm01.addBox(-1.0F, -2.4F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(lArm01, 0.22759093446006054F, 0.0F, -0.091106186954104F);
		this.tail01 = new ModelRenderer(this, 0, 30);
		this.tail01.setRotationPoint(0.0F, -1.5F, 6.4F);
		this.tail01.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 3, 0.0F);
		this.setRotateAngle(tail01, -0.6829473363053812F, 0.0F, 0.0F);
		this.rEar01.addChild(this.rEar02);
		this.body.addChild(this.rHindLeg01);
		this.neck.addChild(this.head);
		this.body.addChild(this.lHindLeg01);
		this.head.addChild(this.muzzleLower);
		this.rArm01_1.addChild(this.rForepaw);
		this.lHindLeg02.addChild(this.lHindLeg03);
		this.head.addChild(this.rEar01);
		this.chest.addChild(this.mane01);
		this.head.addChild(this.muzzleUpper);
		this.rEar01.addChild(this.rEar03);
		this.rArm01.addChild(this.rArm01_1);
		this.head.addChild(this.snout);
		this.lEar01.addChild(this.lEar02);
		this.rHindLeg03.addChild(this.rHindpaw);
		this.neck.addChild(this.mane04);
		this.chest.addChild(this.neck);
		this.head.addChild(this.lEar01);
		this.tail01.addChild(this.tail02);
		this.rHindLeg02.addChild(this.rHindLeg03);
		this.chest.addChild(this.body);
		this.lEar01.addChild(this.lEar03);
		this.lHindLeg03.addChild(this.lHindpaw);
		this.rHindLeg01.addChild(this.rHindLeg02);
		this.tail02.addChild(this.tail03);
		this.chest.addChild(this.rArm01);
		this.chest.addChild(this.mane03);
		this.lArm01_1.addChild(this.lForepaw);
		this.chest.addChild(this.mane02);
		this.lArm01.addChild(this.lArm01_1);
		this.lHindLeg01.addChild(this.lHindLeg02);
		this.chest.addChild(this.lArm01);
		this.body.addChild(this.tail01);
	}


	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, (float) scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, (float) scale, entityIn);
		this.chest.render(scale);
	}

	/**
	 * Used for easily adding entity-dependent animations. The second and third float params here are the same second
	 * and third as in the setRotationAngles method.
	 */
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime)
	{
		EntityFeralWolf entityferalwolf = (EntityFeralWolf)entitylivingbaseIn;

		if (!entityferalwolf.isTamed())
		{
			this.tail01.rotateAngleY = 0.0F;
		}
		else
		{
			this.tail01.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		}



		/*if (entityferalwolf.isSitting())
        {
            this.neck.setRotationPoint(-1.0F, 16.0F, -3.0F);
            this.neck.rotateAngleX = ((float)Math.PI * 2F / 5F);
            this.neck.rotateAngleY = 0.0F;
            this.body.setRotationPoint(0.0F, 18.0F, 0.0F);
            this.body.rotateAngleX = ((float)Math.PI / 4F);
            this.tail01.setRotationPoint(-1.0F, 21.0F, 6.0F);
            this.lArm01.setRotationPoint(-2.5F, 22.0F, 2.0F);
            this.lArm01.rotateAngleX = ((float)Math.PI * 3F / 2F);
            this.rArm01.setRotationPoint(0.5F, 22.0F, 2.0F);
            this.rArm01.rotateAngleX = ((float)Math.PI * 3F / 2F);
            this.lHindLeg01.rotateAngleX = 5.811947F;
            this.lHindLeg01.setRotationPoint(-2.49F, 17.0F, -4.0F);
            this.rHindLeg01.rotateAngleX = 5.811947F;
            this.rHindLeg01.setRotationPoint(0.51F, 17.0F, -4.0F);
        }
        else
        {
            this.body.setRotationPoint(0.0F, 14.0F, 2.0F);
            this.body.rotateAngleX = ((float)Math.PI / 2F);
            this.neck.setRotationPoint(-1.0F, 14.0F, -3.0F);
            this.neck.rotateAngleX = this.body.rotateAngleX;
            this.tail01.setRotationPoint(-1.0F, 12.0F, 8.0F);
            this.lArm01.setRotationPoint(-2.5F, 16.0F, 7.0F);
            this.rArm01.setRotationPoint(0.5F, 16.0F, 7.0F);
            this.lHindLeg01.setRotationPoint(-2.5F, 16.0F, -4.0F);
            this.rHindLeg01.setRotationPoint(0.5F, 16.0F, -4.0F);
            this.lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.lHindLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.rHindLeg02.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        }*/



		this.head.rotateAngleZ = entityferalwolf.getInterestedAngle(partialTickTime) + entityferalwolf.getShakeAngle(partialTickTime, 0.0F);
		this.neck.rotateAngleZ = entityferalwolf.getShakeAngle(partialTickTime, -0.08F);
		this.body.rotateAngleZ = entityferalwolf.getShakeAngle(partialTickTime, -0.16F);
		this.tail01.rotateAngleZ = entityferalwolf.getShakeAngle(partialTickTime, -0.2F);
	}


	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		float swingModifier = 0.9f;
		float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			limbSwing = limbSwing + this.getSwingProgressPrev(living);
			//this.head.rotateAngleZ = this.head.rotateAngleY;
			lHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			rHindLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
			lArm01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
			rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.neck.rotateAngleX = -0.6F;
		}

		this.head.rotateAngleX = (float) Math.toRadians(this.getHeadPitch((EntityLivingBase) entity)) + 0.6f;
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;

		if(entity instanceof EntityFeralWolf) {
			EntityFeralWolf wolf = (EntityFeralWolf) entity;
			if(wolf.isSitting()) {
				/*this.body.rotateAngleX = -1F;
				this.tail01.rotateAngleX = 0F;
				this.chest.rotateAngleX = -0.3F;*/
				this.setRotateAngle(neck, 30, 0, 0);
				this.setRotateAngle(chest, -40, 0, 0);
				this.setRotateAngle(body, -40, 0, 0);
				this.setRotateAngle(tail01, 90, 0, 0);
				this.setRotateAngle(lArm01, 36, 0, -5);
				this.setRotateAngle(lArm01_1, -26, 0, 5);
				this.setRotateAngle(lForepaw, 28, 0, 0);
				this.setRotateAngle(rArm01, 36, 0, 5);
				this.setRotateAngle(rArm01_1, -26, 0, -5);
				this.setRotateAngle(rForepaw, 28, 0, 0);
				this.setRotateAngle(lHindLeg01, -13, 0, -16);
				this.setRotateAngle(lHindLeg02, 80, 0, 0);
				this.setRotateAngle(lHindpaw, 90, 0, 0);
				this.setRotateAngle(rHindLeg01, -13, 0, 16);
				this.setRotateAngle(rHindLeg02, 80, 0, 0);
				this.setRotateAngle(rHindpaw, 90, 0, 0);
			}else {
				this.body.rotateAngleX = 0;
				this.chest.rotateAngleX = 0;
				this.neck.rotateAngleX = 0;
				this.lHindpaw.rotateAngleX = 0;
				this.rHindpaw.rotateAngleX = 0;
				this.rHindLeg02.rotateAngleX = 0;
				this.lHindLeg02.rotateAngleX = 0;
				this.rArm01_1.rotateAngleX = 0;
				this.lArm01_1.rotateAngleX = 0;
				this.rArm01_1.rotateAngleZ = 0;
				this.lArm01_1.rotateAngleZ = 0;
				this.rHindLeg02.rotateAngleZ = 0;
				this.lHindLeg02.rotateAngleZ = 0;
				this.rArm01.rotateAngleZ = 0;
				this.lArm01.rotateAngleZ = 0;
			}
		}


	}


	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}