package com.willfp.ecobosses.config.configs;

import com.willfp.eco.util.config.ExtendableConfig;
import com.willfp.ecobosses.EcoBossesPlugin;
import org.jetbrains.annotations.NotNull;

public class BaseBossConfig extends ExtendableConfig {
    /**
     * Create new EcoBoss config.
     *
     * @param configName The name of the config.
     */
    public BaseBossConfig(@NotNull final String configName) {
        super(configName, false, EcoBossesPlugin.getInstance(), EcoBossesPlugin.class, "bosses/");
    }
}