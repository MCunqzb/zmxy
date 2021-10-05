
package net.mcreator.zaomengxiyoutotalzip.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;
import net.mcreator.zaomengxiyoutotalzip.procedures.JudgeoverlaycontrolProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Choice4Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Choice3Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Choice2Procedure;



import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;


@ZaomengxiyouModElements.ModElement.Tag
public class Healthoverlayin3Overlay extends ZaomengxiyouModElements.ModElement {
	public Healthoverlayin3Overlay(ZaomengxiyouModElements instance) {
		super(instance, 822);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			double h =0;
			double m =0;
			double d =0;
			double abs = 0;
			int X = 0;
			int Y = 0;
			int TX = 0;
			int TY = 0;
			int ABX = 0;
				h = (double) (entity.getPersistentData().getDouble("health_percentage"));
				m = (double) (entity.getPersistentData().getDouble("mp_percentage"));
				d = (double) (entity.getPersistentData().getDouble("nodouble"));
				abs =(double) (entity.getPersistentData().getDouble("perab"));
				X = (int) (entity.getPersistentData().getDouble("XAXIS"));
				Y = (int) (entity.getPersistentData().getDouble("YAXIS"));
				TX =(int) (entity.getPersistentData().getDouble("TEXTX"));
				TY =(int) (entity.getPersistentData().getDouble("TEXTY"));
				ABX = (int) (entity.getPersistentData().getDouble("XABS"));
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (JudgeoverlaycontrolProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/healthandmp.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(213+X), posY + -(119+Y), 0, 0, 113, 43, 113, 43);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/health3.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(174+X), posY + -(112+Y), 0, 0, (int)(h*0.71), 5, 71, 5);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/healthabs.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(174+X), posY + -(112+Y), 0, 0, (int)(abs*142), 5, 71, 5);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/mp3.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(174+X), posY + -(102+Y), 0, 0, (int)(m*0.71), 5, 71, 5);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/nodouble.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(174+X), posY + -(92+Y), 0, 0, (int)(d*0.71)/*71*/, 5, 71, 5);	
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + ((int)entity.getPersistentData().getDouble("heart")) + "/" + ((int)entity.getPersistentData().getDouble("MAXHEART")) + "",
						posX + -(165+X), posY + -(115+Y), -1);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + ((int)entity.getPersistentData().getDouble("healthab")) + "",posX + -(115+X+ABX), posY + -(115+Y), -852224);

				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + ((int)(entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) + "/"
								+ ((int)(entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mpglobal)
								+ "",
						posX + -(165+X), posY + -(105+Y), -1);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), "" + (int)(entity.getPersistentData().getDouble("EXP")) + "",
						posX + -(208+X+TX), posY + -(89+Y+TY), -9984);
				if (Choice2Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/sunwuk_-_fu_ben_.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(204+X), posY + -(115+Y), 0, 0, 32, 32, 32, 32);
				}
				if (Choice3Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/tangseng_-_fu_ben_.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(203+X), posY + -(116+Y), 0, 0, 32, 32, 32, 32);
				}
				if (Choice4Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/pig8_-_fu_ben_.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -(203+X), posY + -(115+Y), 0, 0, 32, 32, 32, 32);
				}


			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
