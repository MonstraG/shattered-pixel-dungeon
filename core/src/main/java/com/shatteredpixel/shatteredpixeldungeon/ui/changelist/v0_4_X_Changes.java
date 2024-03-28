/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2024 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.items.Stylus;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.PlateArmor;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Glaive;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Longsword;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.RunicBlade;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;

import java.util.ArrayList;

public class v0_4_X_Changes {

	public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v0.4.X", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		add_v0_4_3_Changes(changeInfos);
		add_v0_4_2_Changes(changeInfos);
		add_v0_4_1_Changes(changeInfos);
		add_v0_4_0_Changes(changeInfos);
	}

	public static void add_v0_4_3_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.4.3", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released October 16th, 2016
						_-_ 37 days after Shattered v0.4.2

						v0.4.3 was a small update that mostly focused on more technical changes. With all the internal changes that v0.4.2 brought there were lots of new bugs, and I didn't want to make players wait all the way until the release of v0.5.0 to get fixes for them.

						While it doesn't affect the content of the game, I also massively improved how Shattered is built from its source code in v0.4.2 and v0.4.3. This makes Shattered easier to compile for people who want to work with its open source, and also results in a compiled game that's a bit smaller and more efficient."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), "Technical Improvements",
				"""
						_-_ Added rankings and hall of heroes sync via Google Play Games, for the Google Play version of Shattered.

						_-_ Added Power Saver mode in settings
						_-_ Download size reduced by ~25%
						_-_ Game now supports small screen devices
						_-_ Performance improvements
						_-_ Improved variety of level visuals"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FLAIL, null), "Balance Changes",
				"""
						_-_ Flail max damage increased by ~15%
						_-_ Wand of Frost damage reduction increased from 5% per turn of chill to 7.5%
						_-_ Ring of Furor speed bonus reduced by ~15% for slow weapons, ~0% for fast weapons
						_-_ Reduced sacrificial curse bleed by ~33%
						_-_ Reworked glyph of brimstone, now grants shielding instead of healing
						_-_ Reworked glyph of stone, now reduces speed in doorways
						_-_ Thrown potions now trigger traps and plants"""));
	}

	public static void add_v0_4_2_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.4.2", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released September 9th, 2016
						_-_ 46 days after Shattered v0.4.1

						v0.4.2 was an update almost entirely focused on technical improvements in preparation for v0.5.0 and v0.6.0. I knew that I wanted the game to be able to support bigger maps and more complex graphics.

						The most user-visible change in this update was the decoupling of Shattered's display logic and gameplay logic. This doubled the amount of processor power that the game had access to and meant that the game wouldn't freeze or hitch if gameplay logic was taking a while. This made the game run much smoother.

						Behind the scenes, the biggest changes were probably to various bits of game logic that assumed a constant map size of 32x32. After v0.4.2 many of these operations were made more efficient, and could work on variably sized maps, up to a new theoretical max of about 144x144."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), "Technical Improvements",
				"""
						_-_ Many general performance improvements
						_-_ Game now uses 2 CPU cores, up from 1
						_-_ Reduced hitching on many devices
						_-_ Framerate improvements for older devices
						_-_ Game size reduced by ~10%"""));

		changes.addButton(new ChangeButton(new ItemSprite(new Glaive()), "Balance Changes",
				"""
						_-_ Spear and Glaive damage reduced
						_-_ Runic blade damage reduced
						_-_ Grim enchant now procs more often
						_-_ Glyph of stone adds more weight
						_-_ Glyph of potential procs less often
						_-_ Wand of Fireblast less dangerous to caster
						_-_ Wand of Pris. Light reveal area reduced
						_-_ Ring of Wealth slightly more effective
						_-_ Ring of Sharpshooting gives more accuracy"""));
	}

	public static void add_v0_4_1_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.4.1", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released July 25th, 2016
						_-_ 35 days after Shattered v0.4.0

						v0.4.1 was a direct followup to v0.4.0. I wanted to address various balance issues that arose as a consequence of the weapon overhaul. Upgrading armor was already seen as optional by many players prior to v0.4.0, and so after v0.4.0 armor was beginning to be seen as almost useless! I had always intended to try and better balance armor vs. weapons, but after v0.4.0 I realized that I needed to make it a top priority.

						Aside from the obvious numbers changes in this update, I also made armor much more reliable. In Shattered damage calculations have always used a 'triangular distribution', where the middle value is the most likely result, and the max or min are quite rare. Armor didn't use this prior to v0.4.1, which meant that even highly upgraded armor could be quite unreliable. Since v0.4.1, and other updates like v0.8.0, I now feel that armor is well-balanced versus weapons."""));

		changes.addButton(new ChangeButton(new ItemSprite(new PlateArmor()), "Item Changes pt.1",
				"""
						Armor and Enemy Balance Changes:
						_-_ Armor now has a min damage block value
						_-_ Armor gains more blocking from upgrades
						_-_ Prison+ enemy damage increased
						_-_ Evil Eyes reworked
						_-_ Brimstone glyph healing reduced

						Class Balance Changes:
						_-_ Mage's Staff melee damage increased
						_-_ Mage's Staff can now preserve one upgrade
						_-_ Cloak of Shadows buffed at lower levels
						_-_ Some Battlemage effects changed

						Wand Balance Changes:
						_-_ All wands damage adjusted/increased
						_-_ Upgraded wands appear slightly less often
						_-_ Wand of Lightning bonus damage reduced
						_-_ Wand of Fireblast uses fewer charges
						_-_ Wand of Venom damage increases over time
						_-_ Wand of Prismatic Light bonus damage reduced
						_-_ Corrupted enemies live longer & no longer attack eachother
						_-_ Wands in the holster now charge faster"""));

		changes.addButton(new ChangeButton(new ItemSprite(new RunicBlade()), "Item Changes pt.2",
				"""
						Ring Balance Changes:
						_-_ Ring of Force weaker at 18+ strength, stronger otherwise
						_-_ Ring of Tenacity reduces more damage
						_-_ Ring of Wealth secret rewards adjusted
						_-_ Ring of Evasion now works consistently

						Artifact Balance Changes:
						_-_ Dried Rose charges faster, ghost HP up
						_-_ Horn of Plenty now charges on exp gain
						_-_ Master Thieves Armband levels faster
						_-_ Sandals of Nature level faster
						_-_ Hourglass uses fewer charges at a time
						_-_ Horn of Plenty adjusted, now stronger

						Weapon Balance Changes:
						_-_ Lucky enchant deals max dmg more often
						_-_ Dazzling enchant now cripples & blinds
						_-_ Flail now can't surprise attack, damage increased
						_-_ Extra reach weapons no longer penetrate
						_-_ Runic blade damage decreased"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Added a new journal button with key display
						_-_ Keys now exist in the journal, not inventory
						_-_ Improved donator menu button visuals
						_-_ Increased the efficiency of data storage
						_-_ Chasms now deal less damage, but bleed
						_-_ Many shop prices adjusted
						_-_ Pirahna rooms no longer give cursed gear"""));
	}

	public static void add_v0_4_0_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.4.0", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released June 20th, 2016
						_-_ 50 days after Shattered v0.3.5
						_-_ 391 days after Shattered v0.3.0

						v0.4.0 was Shattered's third major item category update, this time addressing weapons! I see this update as the start of a new era for Shattered's development. For the first time a major update was adding far more content than it was reworking or repurposing.

						This update also restructured how weapon strength requirements scaled with upgrades. This made it much more difficult to access high tier items early by dumping upgrades into them. This was my attempt to solve some of the game's pacing issues without adding degradation.

						I also retooled curses to try and make them more about negative effects than negative stats. This meant the player had more flexibility when it came to trying gear out, as equipping a cursed item wasn't an almost certain game over."""));

		changes.addButton(new ChangeButton(new ItemSprite(new Longsword()), "Equipment Overhaul!",
				"""
						_-_ 13 new weapons, 12 rebalanced weapons

						Equipment Balance:
						_-_ Tier 2-4 weapons do more base damage
						_-_ All weapons gain more dmg from upgrades
						_-_ Upgrades now remove enchants less often
						_-_ Upgrades reduce str requirements less
						_-_ All armors require 1 more str
						_-_ Encumbered characters can't sneak attack

						Droprate Changes:
						_-_ Powerful equipment less common early
						_-_ +3 and +2 equipment less common
						_-_ Equipment curses more common
						_-_ Tier 1 equipment no longer drops
						_-_ Arcane styli slightly more common
						_-_ Better item drops on floors 22-24"""));

		changes.addButton(new ChangeButton(new ItemSprite(new Stylus()), "Curse, Enchant, & Glyph Overhaul!",
				"""
						_-_ 3 new enchants, 10 rebalanced enchants
						_-_ 8 new glyphs, 5 rebalanced glyphs
						_-_ 12 new curse effects

						Equipment Curses:
						_-_ Curses now give negative effects
						_-_ Curses no longer give negative levels
						_-_ Upgrades now weaken curses
						_-_ Remove curse scrolls now affect 1 item"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						Class Balance:
						_-_ Huntress now starts with knuckleduster
						_-_ Assassin sneak bonus damage reduced
						_-_ Fixed a bug where berserker was immune when enraged
						_-_ Gladiator's clobber now inflicts vertigo, not stun

						Enemy Balance:
						_-_ Tengu damage increased
						_-_ Prison Guard health and DR increased

						Misc:
						_-_ Scrolls of upgrade no longer burn
						_-_ Potions of strength no longer freeze
						_-_ Translation updates
						_-_ Various bugfixes"""));
	}
}
