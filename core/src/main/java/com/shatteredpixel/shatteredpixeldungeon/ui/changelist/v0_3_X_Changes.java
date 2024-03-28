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

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class v0_3_X_Changes {

	public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v0.3.X", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		add_v0_3_5_Changes(changeInfos);
		add_v0_3_4_Changes(changeInfos);
		add_v0_3_3_Changes(changeInfos);
		add_v0_3_2_Changes(changeInfos);
		add_v0_3_1_Changes(changeInfos);
		add_v0_3_0_Changes(changeInfos);
	}

	public static void add_v0_3_5_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.3.5", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released May 1st, 2016
						_-_ 81 days after Shattered v0.3.4

						v0.3.5 introduced the second proper class rework, this time to the Warrior! I tried to shift the warrior's powers away from a raw stat increase into something more interesting, while still keeping his power easy to access for new players. Similarly to the Mage's rework, the core ideas added here are still in the game, but I've since made lots of changes to the specifics.

						This was also the first time that I decided to split a major update into two smaller ones. Originally v0.4.0 was going to rework both the warrior and weapons, but part way through development I decided to split them in order to get an update out sooner. This approach was quite successful, but I ended up not properly using it again until v0.9.0!"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 15, 12, 15), "Warrior Rework!",
				"""
						Warrior Rework:
						_-_ Starting STR down to 10, from 11
						_-_ Short sword dmg down to 1-10, from 1-12
						_-_ Short sword can no longer be reforged
						_-_ Now IDs potions of health, not STR
						_-_ Now starts with a unique seal for armor
						_-_ Seal grants shielding ontop of health
						_-_ Seal allows for one upgrade transfer"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), "Warrior Subclass Rework!",
				"""
						Berserker Rework:
						_-_ Bonus damage now scales with lost HP, instead of a flat 50% at 50% hp
						_-_ Berserker can now endure through death for a short time, with caveats

						Gladiator Rework:
						_-_ Combo no longer grants bonus damage
						_-_ Combo is now easier to stack
						_-_ Combo now unlocks special finisher moves"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						Balance Tweaks:
						_-_ Spears can now reach enemies 1 tile away
						_-_ Wand of Blast Wave now pushes bosses less

						Misc:
						_-_ Can now examine multiple things in one tile
						_-_ Pixelated font now available for cyrillic languages
						_-_ Added Hungarian language"""));
	}

	public static void add_v0_3_4_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.3.4", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released February 10th, 2016
						_-_ 54 days after Shattered v0.3.3

						v0.3.4 made Shattered available in multiple languages! This update was a direct response to messages I kept getting from users who wanted to share the game with their friends, but couldn't due to the language barrier.

						Translating the game was no small feat, Shattered has a huge amount of text that is constantly changing and growing, over 50 thousand words in total. Because of the volume of text it would have been prohibitively expensive to get the game professionally translated, and so I opted to ask for community translations instead.

						The response from the community was and continues to be incredible! Even multiple years later Shattered's updates are still consistently translated into a number of languages."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), "Translations!",
				"""
						Shattered Pixel Dungeon now supports multiple languages, thanks to a new community translation project!

						The Following languages are supported at release:
						_-_ English
						_-_ Russian
						_-_ Korean
						_-_ Chinese
						_-_ Portugese
						_-_ German
						_-_ French
						_-_ Italian
						_-_ Polish
						_-_ Spanish"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						Completely redesigned the text rendering system to support none-english characters

						New text system renders using either the default system font, or the original pixelated game font. None-latin languages must use system font.

						Balance Changes:
						_-_ Hunger now builds ~10% slower
						_-_ Sad Ghost no longer gives tier 1 loot
						_-_ Sad Ghost gives tier 4/5 loot less often
						_-_ Burning now deals less damage at low HP
						_-_ Weakness no longer discharges wands
						_-_ Rockfall traps rebalanced"""));
	}

	public static void add_v0_3_3_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.3.3", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released December 18th, 2015
						_-_ 44 days after Shattered v0.3.2

						v0.3.3 was a small bumper update that was mostly focused on getting Google Play Games functionality working.

						Google Play Games was the first online functionality ever added to Shattered. Some people were worried that this was the start of me turning Shattered into a game that would require internet. I tried to address this worry by making the functionality as optional as possible and heavily emphasizing that it was only for tiny extras like cloud sync and play games badges. Nowadays things are much more relaxed and Shattered has several internet-enabled features, but still none of them are needed to play the game itself."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.CONTROLLER), "Google Play Games",
				"""
						Added support for Google Play Games in the Google Play version:

						- Badges can now sync across devices
						- Five Google Play Achievements added
						- Rankings sync will come in future

						Shattered remains a 100% offline game if Google Play Games is not enabled"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						Gameplay Changes:
						- Tengu's maze is now different each time
						- Items no longer auto-pickup when enemies are near

						Fixes:
						- Fixed several bugs with prison enemies
						- Fixed some landscape window size issues
						- Fixed other minor bugs

						Misc:
						- Added support for reverse landscape
						- Added a small holiday treat ;)
						- Thieves now disappear when they get away"""));
	}

	public static void add_v0_3_2_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.3.2", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released November 4th, 2015
						_-_ 79 days after Shattered v0.3.1

						v0.3.2 was my second 'area rework' before I ended up shelving the idea. I stopped doing area reworks because I decided to shift my focus toward the longer-term, and so decided I wanted to make other changes before reworking more areas. Future area reworks ended up happening incrementally as I worked on larger updates instead, such as v0.6.0 and v0.8.0.

						v0.3.2 was also another update with a controversial change: the removal of the tome of mastery from the start of the game. Prior to this change subclasses were available from floor 1 after you unlocked them. I changed this as I wanted to make subclasses more powerful and interesting, but having them available on floor 1 limited that."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.TENGU, 0, 0, 14, 16), "Prison Rework",
				"""
						_-_ Tengu boss fight completely redone
						_-_ Corpse dust quest overhauled
						_-_ Rotberry quest overhauled
						_-_ NEW elemental embers quest
						_-_ NEW prison mob: insane prison guards!
						_-_ Thieves can escape with a stolen item
						_-_ Gnoll shaman attack speed increased"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY, null), "Balance Changes",
				"""
						_-_ Mastery Book now always at floor 10, even when unlocked
						_-_ Hunger damage now increases with hero level, starts lower

						Sewers rebalance:\s
						_-_ Marsupial rat dmg and evasion reduced
						_-_ Gnoll scout accuracy reduced
						_-_ Sewer crabs less likely to spawn on floor 3, grant more exp
						_-_ Fly swarms rebalanced, moved to the sewers
						_-_ Great Crab HP reduced\s
						_-_ Goo fight rebalanced\s
						\s
						Base Class Changes:\s
						_-_ Mage's staff base damage increased\s
						_-_ Huntress now starts with 20 hp\s
						_-_ Huntress no longer heals more from dew\s
						_-_ Rogue's cloak of shadows now drains less while invisible
						\s
						Subclass Changes:\s
						_-_ Berserker now starts raging at 50% hp (up from 40%)\s
						_-_ Warden now heals 2 extra HP from dew\s
						_-_ Warlock completely overhauled"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Visual improvements from 1.9.1 source
						_-_ Improved golden UI for donators
						_-_ Fixed 'white line' graphical artifacts
						_-_ Floor locking now pauses all passive effects, not just hunger
						_-_ Cursed chains now only cripple, do not root
						_-_ Warping trap rebalanced, much less harsh
						_-_ Various other bugfixes"""));
	}

	public static void add_v0_3_1_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.3.1", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released August 17th, 2015
						_-_ 83 days after Shattered v0.3.0

						v0.3.1 is the first update that I ended up regretting. While almost all of the content in these earlier updates has been revisited in some way, the trap changes were arguably detrimental to the game at the time they were implemented.

						I was too obsessed with quantity over quality, and so I ended up adding lots of frustrating traps in the mid and lategame. I only ended up fixing this years later, primarily with the trap changes in v0.6.2 and v0.8.0. Incrementally adding well-designed traps over time would have been a much better approach.

						Still, v0.3.1 wasn't all bad. Traps in the earlygame were improved, and it also introduced some very important interface changes such as four quickslots, expanded game settings, and quickslot autotargeting. This was also the first update that had a beta release, something that I've done for every update since."""));

		changes.addButton(new ChangeButton(new Image(Assets.Environment.TERRAIN_FEATURES, 112, 96, 16, 16), "Trap Overhaul",
				"""
						_-_ Over 20 new traps + tweaks to existing ones
						_-_ Trap visuals overhauled
						_-_ Traps now get trickier deeper in the dungeon
						_-_ Trap room reworked to make use of new traps"""));

		changes.addButton(new ChangeButton(new Image(Assets.Interfaces.MENU_BTN, 15, 0, 16, 15), "Interface Improvements",
				"""
						_-_ Adjusted display scaling
						_-_ Search and Examine merged into one button (double tap to search)
						_-_ New max of 4 Quickslots!
						_-_ Multiple toolbar modes for large display and landscape users
						_-_ Ability to flip toolbar and indicators (left-handed mode)
						_-_ Better settings menu
						_-_ Graphics settings are now accessible ingame
						_-_ More consistent text rendering
						_-_ Recent changes can now be viewed from the title screen
						_-_ Added a health bar for bosses"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						Balance changes:
						_-_ Ethereal chains now gain less charge the more charges they have
						_-_ Staff of regrowth grants more herbal healing
						_-_ Monks now disarm less randomly, but not less frequently
						_-_ Invisibility potion effect now lasts for 20 turns, up from 15

						QOL improvements:
						_-_ Quickslots now autotarget enemies
						_-_ Resting now works while hungry & at max HP
						_-_ Dew drops no longer collect when at full health with no dew vial
						_-_ Items now stay visible in the fog of war
						_-_ Added a visual hint to weak floor rooms
						_-_ Many bugfixes"""));
	}

	public static void add_v0_3_0_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.3.0", false, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released May 26th, 2015
						_-_ 92 days after Shattered v0.2.4
						_-_ 253 days after Shattered v0.2.0

						v0.3.0 was Shattered's second major item category rework, and Shattered's first real class rework!

						This class rework also included changes to the Mage's subclasses. While other aspects of the Mage have changed a bunch since the rework, the core idea of each subclass and his staff have persisted. While this may seem similar to the Rogue changes in v0.2.0, the mage never required a second full rework.

						Around this time I was also starting to include substantial smaller tweaks in each update. Nowadays every update includes a large amount of smaller changes, but back in these earlier days this was a newer development."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.MAGE, 0, 15, 12, 15), "Mage Rework!",
				"""
						_-_ No longer starts with knuckledusters or a wand
						_-_ Can no longer equip wands
						_-_ Now starts with a unique mages staff, empowered with magic missile to start.

						_-_ Battlemage reworked, staff now deals bonus effects when used as a melee weapon.

						_-_ Warlock reworked, gains more health and fullness from gaining exp, but food no longer restores hunger."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_DISINTEGRATION, null), "Wand Rework!",
				"""
						Removed Wands:
						Flock, Blink, Teleportation, Avalanche

						Reworked Wands:
						Magic Missile, Lightning, Disintegration,
						Fireblast (was Firebolt), Venom (was Poison),
						Frost (was Slowing), Corruption (was Amok),
						Blast Wave (was Telekinesis), Regrowth

						New Wands:
						Prismatic Light, Transfusion

						_-_ Wand types are now known by default.
						_-_ Wands now each have unique sprites.
						_-_ Wands now cap at 10 charges instead of 9
						_-_ Wands now recharge faster the more charges are missing.
						_-_ Self-targeting with wands is no longer possible.
						_-_ Wand recharge effects now give charge over time.
						_-_ Wands can now be cursed!"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						New Artifacts:
						_-_ Ethereal Chains (replaces wand of blink)
						_-_ Lloyd's Beacon (replaces wand of teleportation)

						Misc. Balance changes:
						_-_ Blessed Ankhs now revive at 1/4hp, but also grant initiative.
						_-_ Alchemist's Toolkit removed (will be reworked)
						_-_ Chalice of blood nerfed, now regens less hp at high levels.
						_-_ Cape of Thorns buffed, now absorbs all damage, but only deflects adjacent attacks.
						_-_ Sandals of nature adjusted, now give more seeds, less dew.
						_-_ Hunger no longer increases while fighting bosses.
						_-_ Floor 1 now spawns 10 rats, exactly enough to level up.
						_-_ Scrolls of recharging and mirror image now more common.
						_-_ Mimics are now less common, stronger, & give better loot.

						UI tweaks:
						_-_ New app icon!
						_-_ Shading added to main game interface
						_-_ Buffs now have descriptions, tap their icons!
						_-_ Visual indicator added for surprising enemies"""));
	}
}
