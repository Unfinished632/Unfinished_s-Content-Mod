package unfinished.unfinisheds_content_mod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import unfinished.unfinisheds_content_mod.Unfinished_sContentMod;

public class ModItems
{
    private static Item RegisterItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Unfinished_sContentMod.MOD_ID, name), item);
    }

    public static void RegisterModItems()
    {
        Unfinished_sContentMod.LOGGER.info("Registering Mod Items for " + Unfinished_sContentMod.MOD_ID);
    }
}
