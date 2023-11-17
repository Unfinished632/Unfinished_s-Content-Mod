package unfinished.unfinisheds_content_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import unfinished.unfinisheds_content_mod.Unfinished_sContentMod;

public class ModItems
{
    public static final Item LIL_BRO = RegisterItem("lil_bro", new Item(new FabricItemSettings()));

    private static void AddItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(LIL_BRO);
    }

    private static Item RegisterItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Unfinished_sContentMod.MOD_ID, name), item);
    }

    public static void RegisterModItems()
    {
        Unfinished_sContentMod.LOGGER.info("Registering Mod Items for " + Unfinished_sContentMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddItemsToIngredientItemGroup);
    }
}
