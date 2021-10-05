/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class ZaomengxiyouModElements.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser - New... and make sure to make the class
 * outside net.mcreator.zaomengxiyoutotalzip as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.zaomengxiyoutotalzip;


import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import net.mcreator.zaomengxiyoutotalzip.item.TestbowItem;

import static net.minecraft.item.ItemModelsProperties.registerProperty;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemOverrideRegistry {

    @SubscribeEvent
    public static void Registry(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            registerBow(TestbowItem.block);
        });
    }

    private static void registerBow(Item bow){
        registerProperty(bow, new ResourceLocation("pull"), (stack, world, entity) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItemStack() != stack ? 0.0F : (float)(stack.getUseDuration() - entity.getItemInUseCount()) / 20.0F;
            }
        });
        registerProperty(bow, new ResourceLocation("pulling"), (stack, world, entity) -> entity != null && entity.isHandActive() && entity.getActiveItemStack() == stack ? 1.0F : 0.0F);
    }
}
