package evilcraft.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import evilcraft.core.config.extendedconfig.ItemConfig;

/**
 * Config for the {@link PromiseAcceptor}.
 * 
 * @author rubensworks
 *
 */
public class PromiseAcceptorConfig extends ItemConfig {

    /**
     * The unique instance.
     */
    public static PromiseAcceptorConfig _instance;

    /**
     * Make a new instance.
     */
    public PromiseAcceptorConfig() {
        super(true, "promiseAcceptor", null, PromiseAcceptor.class);
    }

    @Override
    public void onRegistered() {
        super.onRegistered();
        for (int tier = 0; tier < PromiseAcceptor.COLORS.size(); tier++) {
            OreDictionary.registerOre("materialPromiseAcceptor", new ItemStack(PromiseAcceptor.getInstance(), 1, tier));
        }
    }

}
