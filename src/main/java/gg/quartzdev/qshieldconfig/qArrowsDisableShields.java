package gg.quartzdev.qshieldconfig;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class qArrowsDisableShields extends JavaPlugin {

    private static qArrowsDisableShields instance;

    public static qArrowsDisableShields getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        int pluginId = 20414;
        Metrics metrics = new Metrics(this, pluginId);
        this.getServer().getPluginManager().registerEvents(new ShieldHitListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
