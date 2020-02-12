package com.toke1597.opengui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;


            Inventory gui = Bukkit.createInventory(p, 3*9, ChatColor.AQUA+""+ChatColor.BOLD+"JUKEBOX");
            ItemStack creative = new ItemStack(Material.GRASS_BLOCK,1);
            ItemStack credits = new ItemStack(Material.BEDROCK,1);
            ItemStack disc11 = new ItemStack(Material.MUSIC_DISC_11,1);
            ItemStack disc13 = new ItemStack(Material.MUSIC_DISC_13,1);
            ItemStack blocks = new ItemStack(Material.MUSIC_DISC_BLOCKS,1);
            ItemStack cat = new ItemStack(Material.MUSIC_DISC_CAT,1);
            ItemStack chirp = new ItemStack(Material.MUSIC_DISC_CHIRP,1);
            ItemStack far = new ItemStack(Material.MUSIC_DISC_FAR,1);
            ItemStack mall = new ItemStack(Material.MUSIC_DISC_MALL,1);
            ItemStack mellohi = new ItemStack(Material.MUSIC_DISC_MELLOHI,1);
            ItemStack stal = new ItemStack(Material.MUSIC_DISC_STAL,1);
            ItemStack strad = new ItemStack(Material.MUSIC_DISC_STRAD,1);
            ItemStack wait = new ItemStack(Material.MUSIC_DISC_WAIT,1);
            ItemStack ward = new ItemStack(Material.MUSIC_DISC_WARD,1);
            ItemStack dragon = new ItemStack(Material.DRAGON_EGG,1);
            ItemStack end = new ItemStack(Material.END_STONE,1);
            ItemStack game = new ItemStack(Material.EGG,1);
            ItemStack menu = new ItemStack(Material.REDSTONE_LAMP,1);
            ItemStack underwater = new ItemStack(Material.WATER_BUCKET,1);
            ItemStack nether = new ItemStack(Material.LAVA_BUCKET,1);
            ItemStack stop = new ItemStack(Material.BARRIER,1);
            ItemMeta creative_meta = creative.getItemMeta();
            ItemMeta credits_meta = credits.getItemMeta();
            ItemMeta disc11_meta = disc11.getItemMeta();
            ItemMeta disc13_meta = disc13.getItemMeta();
            ItemMeta blocks_meta = blocks.getItemMeta();
            ItemMeta cat_meta = cat.getItemMeta();
            ItemMeta chirp_meta = chirp.getItemMeta();
            ItemMeta far_meta = far.getItemMeta();
            ItemMeta mall_meta = mall.getItemMeta();
            ItemMeta mellohi_meta = mellohi.getItemMeta();
            ItemMeta stal_meta = stal.getItemMeta();
            ItemMeta strad_meta = strad.getItemMeta();
            ItemMeta wait_meta = wait.getItemMeta();
            ItemMeta ward_meta = wait.getItemMeta();
            ItemMeta dragon_meta = dragon.getItemMeta();
            ItemMeta end_meta = end.getItemMeta();
            ItemMeta game_meta = game.getItemMeta();
            ItemMeta menu_meta = menu.getItemMeta();
            ItemMeta underwater_meta = underwater.getItemMeta();
            ItemMeta nether_meta = nether.getItemMeta();
            ItemMeta stop_meta = stop.getItemMeta();
            creative_meta.setDisplayName(ChatColor.GREEN + "Creative");
            credits_meta.setDisplayName(ChatColor.GREEN + "Credits");
            disc11_meta.setDisplayName(ChatColor.BLACK + "11");
            disc13_meta.setDisplayName(ChatColor.YELLOW + "13");
            blocks_meta.setDisplayName(ChatColor.RED + "Blocks");
            cat_meta.setDisplayName(ChatColor.GREEN + "Cat");
            chirp_meta.setDisplayName(ChatColor.DARK_RED + "Chirp");
            far_meta.setDisplayName(ChatColor.DARK_GREEN + "Far");
            mall_meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mall");
            mellohi_meta.setDisplayName(ChatColor.DARK_PURPLE + "Mellohi");
            stal_meta.setDisplayName(ChatColor.BLACK + "Stal");
            strad_meta.setDisplayName(ChatColor.GRAY + "Strad");
            wait_meta.setDisplayName(ChatColor.BLUE + "Wait");
            ward_meta.setDisplayName(ChatColor.GREEN + "Ward");
            dragon_meta.setDisplayName(ChatColor.GREEN + "Dragon");
            end_meta.setDisplayName(ChatColor.GREEN + "End");
            game_meta.setDisplayName(ChatColor.GREEN + "Game");
            menu_meta.setDisplayName(ChatColor.GREEN + "Menu");
            underwater_meta.setDisplayName(ChatColor.GREEN + "UnderWater");
            nether_meta.setDisplayName(ChatColor.GREEN + "Nether");
            stop_meta.setDisplayName(ChatColor.RED + "Stop");

            creative.setItemMeta(creative_meta);
            credits.setItemMeta(credits_meta);
            disc11.setItemMeta(disc11_meta);
            disc13.setItemMeta(disc13_meta);
            blocks.setItemMeta(blocks_meta);
            cat.setItemMeta(cat_meta);
            chirp.setItemMeta(chirp_meta);
            far.setItemMeta(far_meta);
            mall.setItemMeta(mall_meta);
            mellohi.setItemMeta(mellohi_meta);
            wait.setItemMeta(wait_meta);
            ward.setItemMeta(ward_meta);
            stal.setItemMeta(stal_meta);
            strad.setItemMeta(strad_meta);
            dragon.setItemMeta(dragon_meta);
            end.setItemMeta(end_meta);
            game.setItemMeta(game_meta);
            menu.setItemMeta(menu_meta);
            underwater.setItemMeta(underwater_meta);
            nether.setItemMeta(nether_meta);
            stop.setItemMeta(stop_meta);

            gui.addItem(creative, credits, disc11, disc13, blocks, cat, chirp, far, mall, mellohi, wait, ward, stal, strad, dragon, end, game, menu, underwater, nether, stop);
            p.openInventory(gui);

        }
        return true;
    }
}
