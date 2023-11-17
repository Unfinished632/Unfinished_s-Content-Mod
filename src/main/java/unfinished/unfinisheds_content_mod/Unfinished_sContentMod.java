package unfinished.unfinisheds_content_mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import unfinished.unfinisheds_content_mod.block.ModBlocks;
import unfinished.unfinisheds_content_mod.item.ModItemGroups;
import unfinished.unfinisheds_content_mod.item.ModItems;

import java.util.Locale;

public class Unfinished_sContentMod implements ModInitializer
{
	public static final String MOD_ID = "unfinisheds_content_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Fuck Mojang!");

		ModItemGroups.RegisterItemGroups();
		ModItems.RegisterModItems();
		ModBlocks.RegisterModBlocks();
	}
}