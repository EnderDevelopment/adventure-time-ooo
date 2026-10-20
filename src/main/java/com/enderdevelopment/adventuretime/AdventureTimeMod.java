package com.enderdevelopment.adventuretime;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdventureTimeMod implements ModInitializer {
    public static final String MOD_ID = "adventure_time_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ResourceKey<Level> ADVENTURE_TIME_DIMENSION = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(MOD_ID, "adventure_time"));
    public static final ResourceKey<DimensionType> ADVENTURE_TIME_DIMENSION_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(MOD_ID, "adventure_time"));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Adventure Time Mod");
        // Register dimension and dimension type
        // Register teleportation command
    }
}