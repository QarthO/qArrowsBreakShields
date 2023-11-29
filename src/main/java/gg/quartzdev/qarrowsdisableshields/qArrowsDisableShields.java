package gg.quartzdev.qarrowsdisableshields;

import gg.quartzdev.qarrowsdisableshields.listeners.ArrowHitPlayerListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class qArrowsDisableShields extends JavaPlugin {

    public static qArrowsDisableShields instance;

    @Override
    public void onEnable() {
        instance = this;
        int pluginId = 20414;
        Metrics metrics = new Metrics(this, pluginId);
        this.getServer().getPluginManager().registerEvents(new ArrowHitPlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
