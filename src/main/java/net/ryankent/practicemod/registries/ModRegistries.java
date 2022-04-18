package net.ryankent.practicemod.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ryankent.practicemod.PracticeMod;
import net.ryankent.practicemod.item.ModItems;

public class ModRegistries {

    public static void registerModFuels() {
        System.out.println("Registering Fuels For " + PracticeMod.mod_id);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.IRON_WOOL, 1000); // Seconds is = to X%20
    }

}
