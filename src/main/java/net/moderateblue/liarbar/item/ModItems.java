package net.moderateblue.liarbar.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.moderateblue.liarbar.LiarBar;

public class ModItems {

    public static final Item REVOLVER = registerItem("revolver", new Item(new Settings().registryKey(
            RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LiarBar.MOD_ID,"revolver")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LiarBar.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LiarBar.LOGGER.info("Registering Mod Items for " + LiarBar.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(REVOLVER);
        });
    }
}
