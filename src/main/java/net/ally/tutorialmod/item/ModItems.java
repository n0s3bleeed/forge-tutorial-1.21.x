package net.ally.tutorialmod.item;

import net.ally.tutorialmod.TutorialMod;

import net.ally.tutorialmod.item.custom.DrinkItem;
import net.ally.tutorialmod.item.custom.ModFoodProperties;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

     public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
        ()-> new Item(new Item.Properties()));

     public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
        ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.BURGER)));

    public static final RegistryObject<Item> THAI_TEA_BOBA = ITEMS.register("thai_tea_boba",
            ()-> new DrinkItem(new Item.Properties().food(DrinkItem.THAI_MILK_TEA)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));

    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.CHEESEBURGER)));

    public static final RegistryObject<Item>  RUBY_KNIFE = ITEMS.register("ruby_knife",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().component(DataComponents.ATTRIBUTE_MODIFIERS, SwordItem.createAttributes(Tiers.DIAMOND, 3, -2.0F))));

         public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

