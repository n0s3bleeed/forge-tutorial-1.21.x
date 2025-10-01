package net.ally.tutorialmod.item;

import net.ally.tutorialmod.TutorialMod;
import net.ally.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RUBY_ITEMS_TAB = CREATIVE_MODE_TABS.register("ruby_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.tutorialmod.ruby_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RAW_RUBY.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBY_BLOCK.get());

                        output.accept(ModBlocks.RUBY_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.RUBY_ORE.get());

                        output.accept(ModItems.BURGER.get());
                        output.accept(ModItems.CHEESE.get());
                        output.accept(ModItems.THAI_TEA_BOBA.get());
                        output.accept(ModItems.CHEESEBURGER.get());
                        output.accept(ModItems.RUBY_KNIFE.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
