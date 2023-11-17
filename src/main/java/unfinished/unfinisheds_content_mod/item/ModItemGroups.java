package unfinished.unfinisheds_content_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import unfinished.unfinisheds_content_mod.Unfinished_sContentMod;
import unfinished.unfinisheds_content_mod.block.ModBlocks;

public class ModItemGroups
{
    public static final ItemGroup UNFINISHED_S_CONTENT_MOD = Registry.register
            (
            Registries.ITEM_GROUP, new Identifier(Unfinished_sContentMod.MOD_ID, "unfinished_s_content_mod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.unfinished_s_content_mod")).
            icon(() -> new ItemStack(ModItems.LIL_BRO)).entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.LIL_BRO);
                        entries.add(ModBlocks.LIL_BRO_BLOCK);
                    }).build()
            );

    public static void RegisterItemGroups()
    {
        Unfinished_sContentMod.LOGGER.info("Registering Item Groups for " + Unfinished_sContentMod.MOD_ID);
    }
}
