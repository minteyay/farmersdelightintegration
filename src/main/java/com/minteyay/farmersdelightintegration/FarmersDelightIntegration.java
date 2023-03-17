package mod.minteyay.farmersdelightintegration;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("farmersdelightintegration")
public class FarmersDelightIntegration
{
    private static final Logger LOGGER = LogUtils.getLogger();

    public FarmersDelightIntegration()
    {
	    LOGGER.info("Farmer's Delight Integration loaded!");
    }
}
