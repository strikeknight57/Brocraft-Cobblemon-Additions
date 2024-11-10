package com.strikebyte.bca.worldgen;

import net.minecraft.world.level.levelgen.feature.StructurePool;
import net.minecraft.world.level.levelgen.feature.StructurePoolElement;
import net.minecraft.world.level.levelgen.feature.StructurePools;

import java.util.ArrayList;
import java.util.List;

public class BCAPools {
    // Method to return custom pools
    public static List<StructurePool> getCustomPools() {
        List<StructurePool> pools = new ArrayList<>();

        // Example of adding pools based on your previously defined structure pools
        pools.add(createCenterPool());
        pools.add(createGeneralStructuresPool());
        pools.add(createPathsPool());
        pools.add(createStoreWorkersPool());
        pools.add(createGeneralDecorPool());
        pools.add(createLampPostsPool());
        pools.add(createBerriesPool());

        return pools;
    }

    private static StructurePool createCenterPool() {
        return new StructurePool(
                // Use your own pools here
                new StructurePoolElement[]{
                        StructurePoolElement.ofSingle("bca:center_battlepad"),
                        StructurePoolElement.ofSingle("bca:center_department_store").weighted(1, 10) // Spawn one in every 10 centers
                }
        );
    }

    private static StructurePool createGeneralStructuresPool() {
        return new StructurePool(
                new StructurePoolElement[]{
                        StructurePoolElement.ofSingle("bca:snug_spruce_retreat"),
                        StructurePoolElement.ofSingle("bca:the_summer_cottage"),
                        StructurePoolElement.ofSingle("bca:berrybush_bungalow"),
                        StructurePoolElement.ofSingle("bca:blossom_balcony"),
                        StructurePoolElement.ofSingle("bca:the_clover_cottage"),
                        StructurePoolElement.ofSingle("bca:the_lanturn_lodge"),
                        StructurePoolElement.ofSingle("bca:the_cozy_cranny"),
                        StructurePoolElement.ofSingle("bca:pebble_roof_manor"),
                        StructurePoolElement.ofSingle("bca:the_miners_den"),
                        StructurePoolElement.ofSingle("bca:the_chimney_loft"),
                        StructurePoolElement.ofSingle("bca:fern_and_flower_cottage"),
                        StructurePoolElement.ofSingle("bca:mossy_meadow_home"),
                        StructurePoolElement.ofSingle("bca:honeycomb_haven_apiary"),
                        StructurePoolElement.ofSingle("bca:the_ivyclad_cottage"),
                        StructurePoolElement.ofSingle("bca:winding_willow_house"),
                        StructurePoolElement.ofSingle("bca:sunflower_shack"),
                        StructurePoolElement.ofSingle("bca:structure_pokemart"),
                        StructurePoolElement.ofSingle("bca:structure_pokecenter")
                }
        );
    }

    private static StructurePool createPathsPool() {
        return new StructurePool(
                new StructurePoolElement[]{
                        StructurePoolElement.ofSingle("bca:path_well_cross_road"),
                        StructurePoolElement.ofSingle("bca:path_straight-curved"),
                        StructurePoolElement.ofSingle("bca:path_t-joint"),
                        StructurePoolElement.ofSingle("bca:path_90_degree"),
                        StructurePoolElement.ofSingle("bca:path_rare_road"),
                        StructurePoolElement.ofSingle("bca:path_cross_roads")
                }
        );
    }

    private static StructurePool createStoreWorkersPool() {
        return new StructurePool(
                new StructurePoolElement[]{
                        StructurePoolElement.ofSingle("bca:nurse_joy"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_general"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_battle_items"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_vitamins"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_apricorns"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_xp"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_ev-stone"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_ev-stone_2"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_held_items"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_held_items_2"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_special_balls"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_mulch"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_food"),
                        StructurePoolElement.ofSingle("bca:shopkeeper_ds_tech"),
                        StructurePoolElement.ofSingle("bca:pokemart_shopkeeper")
                }
        );
    }

    private static StructurePool createGeneralDecorPool() {
        return new StructurePool(
                new StructurePoolElement[]{
                        StructurePoolElement.ofSingle("bca:bench_1"),
                        StructurePoolElement.ofSingle("bca:bench_2"),
                        StructurePoolElement.ofSingle("bca:bench_3"),
                        StructurePoolElement.ofSingle("bca:cart_1"),
                        StructurePoolElement.ofSingle("bca:cart_2"),
                        StructurePoolElement.ofSingle("bca:small_wagon"),
                        StructurePoolElement.ofSingle("bca:berry_stand_1"),
                        StructurePoolElement.ofSingle("bca:berrystand_2"),
                        StructurePoolElement.ofSingle("bca:berrystand_3"),
                        StructurePoolElement.ofSingle("bca:picnic_table_1"),
                        StructurePoolElement.ofSingle("bca:picnic_table_2"),
                        StructurePoolElement.ofSingle("bca:decor_1"),
                        StructurePoolElement.ofSingle("bca:berrystand_4"),
                        StructurePoolElement.ofSingle("bca:berrystand_5"),
                        StructurePoolElement.ofSingle("bca:decorations_well"),
                        StructurePoolElement.ofSingle("bca:decoration_well_2"),
                        StructurePoolElement.ofSingle("bca:decor_3"),
                        StructurePoolElement.ofSingle("bca:decor_2"),
                        StructurePoolElement.ofSingle("bca:market_stall_1"),
                        StructurePoolElement.ofSingle("bca:market_stall_2"),
                        StructurePoolElement.ofSingle("bca:cart_4"),
                        StructurePoolElement.ofSingle("bca:cart_5"),
                        StructurePoolElement.ofSingle("bca:cart_6")
                }
        );
    }

    private static StructurePool createLampPostsPool() {
        return new StructurePool(
                new StructurePoolElement[]{
                        StructurePoolElement.ofSingle("bca:lamp_post_bench"),
                        StructurePoolElement.ofSingle("bca:lamp_post_2"),
                        StructurePoolElement.ofSingle("bca:large_lamp_post_3"),
                        StructurePoolElement.ofSingle("bca:lamp_post_4"),
                        StructurePoolElement.ofSingle("bca:lamp_post_5"),
                        StructurePoolElement.ofSingle("bca:water_pump")
                }
        );
    }

    private static StructurePool createBerriesPool() {
        List<StructurePoolElement> berryElements = new ArrayList<>();
        for (int i = 1; i <= 73; i++) {
            berryElements.add(StructurePoolElement.ofSingle("bca:berry_" + i));
        }
        return new StructurePool(berryElements.toArray(new StructurePoolElement[0]));
    }

}
