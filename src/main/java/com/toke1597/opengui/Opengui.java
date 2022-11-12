package com.toke1597.opengui;

import org.bukkit.plugin.java.JavaPlugin;

public final class Opengui extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("gui").setExecutor(new GUIcommand());

        getServer().getPluginManager().registerEvents(new MenuHandler(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
