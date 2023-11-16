package unfinished.unfinisheds_content_mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Unfinished_sContentMod implements ModInitializer
{
	public static final String MOD_ID = "unfinisheds_content_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Hello Fabric world!");
	}
}