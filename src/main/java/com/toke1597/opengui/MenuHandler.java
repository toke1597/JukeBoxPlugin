package com.toke1597.opengui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA+""+ChatColor.BOLD+"JUKEBOX")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.GRASS_BLOCK)) {
                p.playSound(p.getLocation(), Sound.MUSIC_CREATIVE, 1, 1);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.BEDROCK)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_CREDITS, 1, 1);
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_11)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_11, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_13)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_13, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_BLOCKS)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_BLOCKS, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_CAT)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_CAT, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_CHIRP)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_CHIRP, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_FAR)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_FAR, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_MALL)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_MALL, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_MELLOHI)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_MELLOHI, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_STAL)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_STAL, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_STRAD)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_STRAD, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_WAIT)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_WAIT, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.MUSIC_DISC_WARD)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DISC_WARD, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.DRAGON_EGG)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_DRAGON, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.END_STONE)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_END, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.EGG)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_GAME, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.REDSTONE_LAMP)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_MENU, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.WATER_BUCKET)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_UNDER_WATER, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.LAVA_BUCKET)) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.MUSIC_NETHER, 1, 1);
                p.sendMessage(ChatColor.GREEN + "Playing~~!");
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                p.closeInventory();
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stopsound @p");
                p.sendMessage(ChatColor.RED + "Stop Playing!");
            }
        }
    }
}