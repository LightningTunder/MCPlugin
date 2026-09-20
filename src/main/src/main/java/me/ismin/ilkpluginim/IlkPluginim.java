package me.ismin.ilkpluginim;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class IlkPluginim extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("selam").setExecutor((sender, command, label, args) -> {
            sender.sendMessage(ChatColor.GREEN + "Merhaba! Bu plugin GitHub Actions ile derlendi! 🚀");
            return true;
        });
        getLogger().info("Bulut Plugin Aktif!");
    }
}
