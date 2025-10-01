package net.ally.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BURGER = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 100),1.0f).build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2f).build();

}
