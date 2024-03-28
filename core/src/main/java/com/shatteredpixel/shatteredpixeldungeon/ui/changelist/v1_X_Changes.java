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
import com.shatteredpixel.shatteredpixeldungeon.Badges;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroSubClass;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Talent;
import com.shatteredpixel.shatteredpixeldungeon.effects.BadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.SandalsOfNature;
import com.shatteredpixel.shatteredpixeldungeon.items.bombs.WoollyBomb;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfArcana;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfWealth;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.exotic.ScrollOfAntiMagic;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.exotic.ScrollOfMetamorphosis;
import com.shatteredpixel.shatteredpixeldungeon.items.spells.TelekineticGrab;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfTransfusion;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.MagesStaff;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ElementalSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SpectralNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.TalentIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class v1_X_Changes {

	public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
		add_v1_4_Changes(changeInfos);
		add_v1_3_Changes(changeInfos);
		add_v1_2_Changes(changeInfos);
		add_v1_1_Changes(changeInfos);
		add_v1_0_Changes(changeInfos);
	}

	public static void add_v1_4_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v1.4", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released October 4th, 2022
						_-_ 90 days after Shattered v1.3.0

						Dev commentary will be added here in the future."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GUIDE_PAGE), "Lore Additions",
				"""
						_30 pages of lore text have been added to the game, scattered around the regions of the dungeon!_

						These pages are found through the dungeon and go into a new tab in the journal window. Each region contains 6 pages that make up a short story that gives more details about that region and the people who have been there before the player."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOURMALINE), new RingOfArcana().trueName(),
				"""
						_A new ring has been added that enhances enchantments and glyphs!_

						The Ring of Arcana lets the player directly power up their enchantments and glyphs, instead of only being able to power them up by upgrading the item they are attached to. This can lead to be some really potent enchant/glyph effects at high ring levels."""));

		changes.addButton(new ChangeButton(new SandalsOfNature(),
				"""
						_The Sandals of Nature have been given a new active ability!_

						Rather than just using the effect of earthroot, the footwear of nature now use the effect of the seed most recently fed to them! These effects can be triggered on nearby enemies instead of just on you, opening up a bunch of tactical potential for this artifact.

						For balance, the amount of extra seeds/dew the footwear gives has been reduced, and 1 additional seed is needed for each upgrade level."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), HeroSubClass.BERSERKER.title(),
				"""
						_The Berserker's berserk ability is now manually activated, but has a much lower cooldown._

						I'm doing this to try and make the subclass a bit more engaging, players can now trigger berserk at any point when they have 100% or more rage. Berserking still gives a big bonus shield, letting the Berserker survive normally fatal encounters. The lower the Berserker's health, the more shielding he gets.

						The Berserker's talents have been adjusted as well:
						_- Endless Rage_ Now grants bonuses to berserk duration and cooldown when above 100% rage.
						_- Berserking Stamina_ has been replaced with _Deathless Fury_, which lets berserking automatically trigger just like before, but at a high cooldown cost."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY), "Tutorial Additions",
				"""
						_A short guided tutorial has been added at the start of the game for new players._

						This tutorial guides the player through their first few actions, and encourages reading the game log and guidebook.

						As part of this tutorial change, initial story texts and the guidebook have been slightly adjusted, and there is a new pop-up for controller players that explains how to use the in-game cursor."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new TalentIcon(Talent.EMPOWERED_STRIKE), "T3 Talent Redesigns",
				"""
						I've made some pretty significant changes to three T3 talents that were either unpopular or too simplistic:

						_- Empowered Strike_ now gives a little less direct staff damage, but also boosts the staff's on-hit effect. This should make it more interesting while still encouraging staff melee play.
						_- Excess Charge_ now triggers when the Mage's staff is zapped at full charge, instead of on-hit, but the barrier effect is a bit stronger. This should encourage a mix of staff melee and zapping, instead of just pure melee at full charge.

						_- Bounty Hunter_ now increases enemy drop chance, instead of providing gold. This should make it more varied and interesting. The bonus also gets notably higher at high preparation charge, instead of scaling linearly."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LONGSWORD, new ItemSprite.Glowing(0x0000FF)), "Blocking Enchant Redesign",
				"""
						Blocking has been slightly redesigned to provide a more visible benefit. Instead of always granting a little armor, the enchantment now has a chance to grant a larger shield.

						I don't expect that this will make the enchantment significantly stronger or weaker, but it should feel more impactful."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_LAND), "Landscape Hero Select",
				"Desktop and mobile landscape users will now see a new hero select screen that better makes use of screen real-estate."));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_Highlights:_
						_-_ Daily runs can now be replayed for practice
						_-_ Updated translations and translator credits
						_-_ Added more achievements to Shattered on Google Play Games
						_-_ The buff bar now condenses itself if many buffs are visible at once. This raises the limit of on-screen buffs to 15

						_Hero Actions:_
						_-_ Waiting now always takes exactly 1 turn, regardless of hero speed
						_-_ Grass the hero is standing on can now be trampled by selecting the hero's position
						_-_ Hero now pauses before ascending/descending if enemies are nearby""",

				"""
						_Items:_
						_-_ Wand of Disintegration no longer harms undiscovered neutral characters
						_-_ Blooming enchant now tries to avoid placing grass on the hero
						_-_ The scroll holder can now hold arcane resin
						_-_ Rotberry plant now gives a small puff of toxic gas when trampled
						_-_ Plants now trigger after time freeze ends, just like traps
						_Allies & Enemies:_
						_-_ Improved behavior of ally AI when told to hold a position
						_-_ Goo's pump up attack now always gives the hero at least 1 action to react
						_-_ DM-300 now knocks back during rockfall even if hero is 1 tile away
						_-_ Slightly adjusted enemy stats on ascension to smooth out difficulty""",

				"""
						_UI/VFX:_
						_-_ Throwing weapons now show their quantity in orange when one is about to break
						_-_ Item boosts from potion of mastery or curse infusion now change the color of text in that item's item slot
						_-_ Various minor UI improvements to hero select and rankings
						_-_ Added sacrifical fire and demon spawners to the landmarks page
						_-_ Added some ascension dialogue for the ghost hero
						_-_ Slightly improved the marsupial rat attacking animation
						_-_ Improved chains vfx, especially for prison guards
						_-_ Added lullaby vfx to the stone of deep sleep

						_Rankings:_
						_-_ Clarified description for boss score in rankings
						_-_ Yog's laser now deducts score even if the hero dodges it
						_-_ Goo no longer deducts score by healing in water""",

				"""
						_Levelgen:_
						_-_ Items and enemies can no longer spawn in aquarium room water
						_-_ Improved room merging logic in a few specific situations

						_Controls:_
						_-_ Added a copy and paste button to text input windows
						_-_ Adjusted default controller bindings slightly
						_-_ The 'switch enemy' keybind now also switches tabs on tabbed windows
						_-_ On desktop, the game now attempts to keep mouse and controller pointer potions in sync
						_-_ Added a setting to adjust camera follow intensity
						_-_ The controller pointer can now pan the game camera
						_-_ Heroes can now be renamed individually"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed the following bugs:

						_Highlights:_
						_-_ Victory and Champion badges not being awarded in some cases
						_-_ Various rare crash and hang bugs
						_-_ Various minor visual/textual errors

						_Allies & Enemies:_
						_-_ Characters rarely managing to enter eternal fire
						_-_ Summons from guardian traps counting as regular statues in some cases
						_-_ Rare cases where ranged allies would refuse to target nearby enemies
						_-_ Various rare cases where characters might stack on each other
						_-_ Albino rats causing bleed when hitting for 0 damage
						_-_ Necromancers being able to summon through crystal doors
						_-_ Giant necromancers summoning skeletons into doorways
						_-_ Goo Immediately using its pump up attack if a previous pump up was interrupted by sleep""",

				"""
						_Items pt.1:_
						_-_ Honeypots not reacting correctly to being teleported
						_-_ Rare cases where lost inventory and items on stairs could softlock the game
						_-_ Hero armor transferring rarely deleting the Warrior's broken seal
						_-_ Scrolls of Mirror Image not identifying in rare cases
						_-_ Various incorrect interactions between kinetic/viscosity and damage mitigating effects
						_-_ Wand of Fireblast sometimes not igniting adjacent item or barricades
						_-_ Ring of Furor not affecting Sniper special abilities
						_-_ Cursed rings of force still heavily buffing melee attacks
						_-_ Armband not breaking invisibility
						_-_ Various quirks with charge spending on timekeeper's hourglass
						_-_ Stones of aggression working much more effectively than intended
						_-_ Chalice of Blood benefitting from recharging while hero is starving
						_-_ Cases where explosive curse would create explosions at the wrong location""",

				"""
						_Items pt.2:_
						_-_ Additional cases where magical spellbook could generate scrolls of lullaby_-_ Heavy boomerangs getting an accuracy penalty when returning
						_-_ Rare consistency errors in potion of might buff description
						_-_ Death to aqua blast counting as death to a geyser trap
						_-_ Reading spellbook not spending a turn if the scroll was cancelled
						_-_ Screen orientation changes cancelling the scroll of enchantment
						_-_ Magical infusion incorrectly clearing curses on wands and rings
						_-_ Projecting weapons not reaching through webs in rare cases
						_-_ Multiplicity glyph duplicating NPCs in rare cases
						_-_ Rare cases where potion of healing talents wouldn't trigger
						_-_ Cursed horn of plenty affecting non-food items
						_-_ Being able to self-target with cursed wands in rare cases
						_-_ Some thrown weapons triggering traps as Tengu jumps
						_-_ Magic resistance not applying to some cursed wand effects""",

				"""
						_Effects:_
						_-_ Invisibility effects not working when applied to enemies
						_-_ Rare cases where giant enemies couldn't attack
						_-_ 13th armor ability incorrectly clearing champion enemy buffs
						_-_ Exploits where the gladiator could build combo on ally characters
						_-_ Cases where piranhas could live for a turn on land
						_-_ Errors with wild magic or flurry and knockback effects
						_-_ Magical Sight not making the hero immune to blindness
						_-_ Targeting logic sometimes being incorrect on armor abilities
						_-_ Shadow clone not benefiting from certain glyphs
						_-_ Knockback effects paralyzing dead characters
						_-_ Caves boss arena not displacing all items on the tile that caves in
						_-_ Recharging effects sometimes getting an extra action on game load
						_-_ Exploits during ascension challenge that let players still use shops
						_-_ Elastic and battlemage blast wave ability conflicting with each other""",

				"""
						_Misc:_
						_-_ Dailies using seeds that are also user-enterable
						_-_ Confusing text when a weapon or armor is partly uncursed
						_-_ 'No Weapons in His Presence' badge not stating that ring of force counts as a weapon
						_-_ Various cases where the friendly fire badge was not correctly awarded
						_-_ Controller axis mapping issues on Android
						_-_ Various rare fog of war errors when the hero was knocked a high distance
						_-_ Rare cases where items would not correctly appear in the rankings screen
						_-_ Prizes from sacrifice rooms not always being the same with the same dungeon seed
						_-_ Rare crashes with radial inventory selector
						_-_ Boss health bar not appearing in rare cases
						_-_ Buff icons sometimes going outside of character info windows
						_-_ Death by necromancer summoning damage not producing a record in rankings
						_-_ Some users seeing rankings dates in local format, instead of international"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_AMETHYST), new RingOfWealth().trueName(),
				"""
						I'm making a few improvements to the ring of wealth, mainly to make it more worth upgrading:

						_-_ Now gives a rare drop every 0-20 kills, up from every 0-25
						_-_ Now gives an equipment drop every 5-10 rare drops, down from every 4-8
						_-_ Equipment drops are now guaranteed to be at least level 1/2/3/4/5/6 at ring level 1/3/5/7/9/11, up from 1/3/6/10/15/21

						To limit the effectiveness of farming for a long time to stack up two highly upgraded rings of wealth, the level for equipment drops is based on your most powerful wealth ring, and a second one can only boost the level by another +1 at most."""));

		changes.addButton(new ChangeButton(new WandOfTransfusion(),
				"""
						I'm boosting the wand of transfusion's damage scaling versus undead enemies slightly:

						_-_ Damage vs. undead scaling up to 1-2 per level, from 0.5-1"""));

		changes.addButton(new ChangeButton(new TelekineticGrab(),
				"""
						I'm enhancing the value of telekinetic grab a bit for users with multiple thrown weapons:

						_-_ Now grabs all items at a location or stuck to an enemy, not just the first one."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHORTSWORD, new ItemSprite.Glowing(0x000000)), "Annoying Curse",
				"""
						A very critical buff has been given to the annoying curse:

						_-_ Added 5 new regular dialogue lines, for 10 total
						_-_ Added 3 additional new lines that trigger rarely"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EXOTIC_GYFU), new ScrollOfAntiMagic().trueName(),
				"Antimagic now also suppresses the positive effects of rings and artifacts while it is applied to the hero."));

	}

	public static void add_v1_3_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v1.3", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released July 6th, 2022
						_-_ 105 days after Shattered v1.2.0

						Dev commentary will be added here in the next major update."""));

		Image ic;
		ic = Icons.get(Icons.SEED);
		ic.hardlight(1f, 1.5f, 0.67f);
		changes.addButton(new ChangeButton(ic, "Seeded Runs!",
				"""
						_It's now possible to enter a custom seed when starting a new game!_

						Seeds are used to determine dungeon generation, and two runs with the same seed and game version will produce the exact same dungeon to play though.

						If you don't enter a custom seed, the game will use a random one to generate a random dungeon, just like it did prior to this update.

						Note that only players who have won at least once can enter custom seeds, and games with custom seeds are not eligible to appear in rankings."""));

		ic = Icons.get(Icons.CALENDAR);
		ic.hardlight(0.5f, 1f, 2f);
		changes.addButton(new ChangeButton(ic, "Daily Runs!",
				"""
						_Every day there is a specific seeded run that's available to all players!_

						The daily run makes it easy to compete again friends or other folks on the internet, without having to coordinate and share a specific seed.

						The game does keep track of your previous daily scores, but at the moment there is no leaderboard. You must win at least once to have access to daily runs."""));

		changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.HIGH_SCORE_2.image), "New Score System!",
				"""
						_The game's scoring system has been overhauled to go along with seeded runs and dailies!_

						The score system now factors in a bunch of new criteria like exploration, performance during boss fights, quest completions, and enabled challenges. This should make score a much better measure of player performance.

						A score breakdown page has also been added to the rankings screen. This page even works for old games, and retroactively applies the challenge bonus!"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.AMULET), "Harder Ascension Route!",
				"""
						_A bunch of adjustments have been made to the ascension route to make it a proper challenge!_

						Enemies will get much stronger as you ascend, and it's impossible to teleport back up or flee and avoid all combat. Expect to have to work a little bit more for an ascension win!"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), "UI/UX Improvements!",
				"""
						_Several UI and UX Improvements have been made for desktop and mobile users_

						_-_ The settings menu has been adjusted with a few new and rearranged options.
						_-_ Added radial menus for controller users, and redid default controller bindings.
						_-_ Added a quickslot swapper option for mobile portrait users.
						_-_ Keyboard and controller key bindings now have separate windows
						_-_ Added a few new key/button bindings actions"""));

		changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.BOSS_CHALLENGE_5.image), "New Badges!",
				"""
						_14 new badges have been added to the game!_

						_-_ Five of these badges are 'high score' badges, meant to tie into the new score system.
						_-_ Another five of these badges are 'boss challenge' badges, which each require you to defeat a boss in a particular way.
						_-_ Four new 'cause of death' badges have also been added, which should be a little trickier than the existing ones.

						Several of these badges are on the harder end, in particular the final high score and boss challenge badge should be a real challenge, even for veteran players."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHORTSWORD, new ItemSprite.Glowing(0x000000)), "Curse Redesigns",
				"""
						_Three of the most annoying curses have been replaced or redesigned, and two more have been adjusted._

						_- Fragile_ has been replaced by _explosive,_ which builds power and then explodes!
						_- Wayward_ has been redesigned to sometimes apply an accuracy reducing debuff, instead of always reducing accuracy.
						_- Exhausting_ has been replaced by _dazzling,_ which can blind both the attacker and defender.

						_Anti-entropy_ and _sacrifice_ have also been nerfed (i.e. made less harsh), look at the nerfs section for more details on that."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EXOTIC_ODAL), Messages.get(ScrollOfMetamorphosis.class, "name"),
				"""
						The scroll of metamorphosis has been adjusted to allow more of the game's talents to work with its effect.

						Several talents that were previously exempt from being chosen by the scroll now have alternative effects that let them be used by any hero.

						These alternative effects only appear when getting these talents via metamorphosis."""));

		changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.MONSTERS_SLAIN_5.image), "Badge Changes",
				"""
						I'm making several changes to existing badges, based on feedback and data from Steam players:

						_-_ Several gold tier badges have been bumped up to platinum tier to better reflect their difficulty
						_-_ The 'grim reaper' badge has been bumped up to gold tier, from silver

						_-_ The master and grandmaster 'monsters hunter' and 'treasure hunter' badges have been made more difficult
						_-_ The alchemist badges have been rebalanced to start out easier and end up harder

						_-_ The 'dungeoneer' badges have been made easier to unlock with wins or games played. The master and grandmaster versions still require a lot of games played though."""));

		changes.addButton(new ChangeButton(new BuffIcon(BuffIndicator.TARGETED, true), "Buff and Spell Icons",
				"""
						Several buffs have been given icons when they didn't have any, or have had their icons adjusted to prevent icon duplication. This should improve buff clarity in a few cases, and ensure that two active buffs can never have the exact same icon (recolored icons are still present though).

						A few new overhead spell effects have been added as well."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Updated translations, translator credits, and added a new language: Dutch!
						_-_ Made the Huntress a bit easier to unlock again
						_-_ Dreamfoil has been renamed to Mageroyal, to better fit its lack of sleeping functionality since 1.2
						_-_ Updated various code dependencies
						_-_ Made major internal changes in prep for quest improvements in v1.4
						_-_ Added a slight delay to chasm jump confirmation window, to prevent mistaps
						_-_ Progress is now shown for badges that need to be unlocked with multiple heroes
						_-_ Multiple unlocked badges can now be shown at once
						_-_ Various minor tweaks to item and level generation to support seeded runs
						_-_ Keys now appear on top of other items in pit rooms""",

				"""
						_-_ Large floors now spawn two torches with the 'into darkness' challenge enabled
						_-_ Blazing champions no longer explode if they are killed by chasms
						_-_ Red sentries no longer fire on players with lost inventories
						_-_ Wards and Sentries are now immune to sleep, vertigo and fear
						_-_ Characters with guaranteed dodges (e.g. spirit hawk) can now evade Yog's laser beam
						_-_ Boss health bars have been expanded to show current health and active buffs/debuffs.
						_-_ The Changes scene has been expanded on large enough displays. This is the first of several UI expansions I'd like to make over time."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed
						_-_ Various minor textual and visual bugs
						_-_ Final boss's summons being slightly weaker than intended when badder bosses is enabled
						_-_ Great crab not blocking right after loading a save
						_-_ Exploits that could force DM-300 to dig outside of its arena
						_-_ Various 'cause of death' badges not being awarded if death occurred with an ankh.
						_-_ Wraiths from spectral necromancers not always dying when the necromancer dies
						_-_ The mystical charge talent giving more charge than intended
						_-_ Ring of might HP bonus not applying in specific cases
						_-_ Stones of blink disappearing if they fail to teleport
						_-_ Beacon of returning not working at all in boss arenas
						_-_ Earthen guardian not being immune to poison, gas, and bleed
						_-_ Transmogrified enemies awarding exp when the effect ends
						_-_ Gateway traps being able to teleport containers"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN), "Armor Ability Buffs",
				"""
						_- Endure_ damage bonus increased to 1/2 of damage taken from 1/3

						_- Wild Magic_ base wand boost and max boost increased by 1
						_- Fire Everything_ now has a 25% chance per point to let a wand be usable 3 times
						_- Conserved Magic_ no longer lets a wand be usable 3 times, now grants a chance for wild magic to take 0 turns instead

						_- Elemental power_ boost per point up to 25%, from 20%
						_- Reactive Barrier_ shielding per point up to 2.5, from 2, and max targets now increases by 1 per point.

						_- Shadow Clone_ now costs 35 energy, down from 50. Initial HP down to 80 from 100
						_- Shadow Blade_ damage per point up to 8%, from 7.5%
						_- Cloned Armor_ armor per point down to 12%, from 15%

						_- Eagle Eye_ now grants 9 and 10 vision range at 3 and 4 points
						_- Go for the Eyes_ now cripples at ranks 3 and 4
						_- Swift Spirit_ now grants 2/4/6/8 dodges, up from 2/3/4/5"""));

		changes.addButton(new ChangeButton(new TalentIcon(Talent.WAND_PRESERVATION), Talent.WAND_PRESERVATION.title(),
				"""
						Only one isolated talent change in this update:

						_- Wand Preservation_ chance to preserve at +1 reverted to 67% from 50%, still grants 1 arcane resin if it fails to preserve"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CRYSTAL_KEY), "Crystal Path Rooms",
				"Loot from crystal path rooms (the rooms with a sequence of 3 crystal doors) has been buffed to make their value closer to other crystal key rooms."));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CLEANSING_DART), "Alchemy Item Buffs",
				"""
						I'm giving woolly bomb's a big buff to help make them more distinct from other sheep-spawning items:

						_- Woolly Bombs_ now summon sheep for 200 turns, or 20 turns during boss fights, up from 12-16 turns. However, sheep no longer totally prevent bosses from summoning minions.

						I've given some alternative functions to three darts that would previously only help allies:

						_- Holy Dart_ turns of bless reverted to 30 from 100, now heavily damages undead or demonic enemies, instead of blessing them

						_- Adrenaline Dart_ turns of adrenaline reverted to 10 from 30, now cripples enemies for 5 turns, instead of giving them adrenaline

						_- Cleansing Dart_ now clears positive buffs from enemies, and causes them to start wandering (note that they may immediately re-aggro if they are close enough)"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN), "Armor Ability Nerfs",
				"""
						Along with several armor ability buffs, two have received energy cost nerfs, mainly to reduce the uptime of positioning/escape abilities. Some compensation buffs have been given for the energy cost change as well:

						_- Heroic Leap_ energy cost up to 35 from 25
						_- Body Slam_ now adds 1-4 base damage per point in talent
						_- Impact Wave_ now applies vulnerable for 5 turns, up from 3
						_- Double jump_ energy cost reduction increased by 20%

						_- Smoke Bomb_ energy cost up to 50 from 35
						_- Smoke Bomb_ max range up to 10 from 6"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARMOR_LEATHER, new ItemSprite.Glowing(0x000000)), "Curse Nerfs",
				"""
						Two of the most harsh curses have been nerfed (i.e. made better for the player):

						_- Anti-Entropy_ now spreads less fire to the player, and freezes all adjacent tiles instead of just the enemy.

						_- Sacrifice_ now more heavily scales on current HP, bleeding for a bit more at high health, and very little at medium to low health."""));

		changes.addButton(new ChangeButton(new Image(new ElementalSprite.Fire()), "Floor 16 Adjustments",
				"""
						Floor 16's spawn rates have been adjusted:

						Ghouls up to 60% from 40%
						Elementals down to 20% from 40%
						Warlocks unchanged at 20%

						This is to help smooth over a slight difficulty spike on that floor."""));

	}

	public static void add_v1_2_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v1.2", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released March 23rd, 2022
						_-_ 103 days after Shattered v1.1.0

						v1.2.0 focused on a number of improvements to try and make Shattered play just as well for desktop users as it does for phone users. While these changes weren't perfect right at launch, they played a major role in making Shattered feel like more than a mobile port and helped it have a successful launch on Steam.

						One big change for desktop users that's external to the game itself was native executables. Previously Shattered's desktop version required a separate installation of Java to run. After v1.2.0, I started making versions of Shattered with built-in Java instead. This meant that most users could just download the game and run it, much nicer.

						v1.2.0 also included a variety of little additions and tweaks. Most of them are self-explanatory, but the badge additions in particular were timed with the game's release on Steam so they could tie into steamworks achievements and give newer players a little more to do."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_LAND), "Desktop Enhancements and Steam Release!",
				"""
						_Shattered Pixel Dungeon has received a bunch of new features in preparation for its release on Steam!_

						These features include:
						_-_ A new main UI for larger displays, which places the inventory in the main game screen
						_-_ Full controller support, including button bindings and an analog stick cursor.
						_-_ Better keyboard controls, including combining keys to move diagonally.
						_-_ Better mouse support, including hover tooltips and right-click menus.
						_-_ Two additional quickslots on the new UI, and on mobile UI if there is enough space.
						_-_ Integration with Steamworks for achievements and cloud sync.

						Users on mobile devices will be able to benefit from most of these features as well! (some feature require a large enough display)"""));

		changes.addButton(new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 176, 48, 16, 16), "Special Rooms Additions!",
				"""
						_Six new special rooms have been added!_

						Two of these rooms (and one existing room) use new crystal doors, which let you see through them before you find a crystal key to unlock them.

						Three of these rooms include new terrain hazards, which will require the right tools to get past.

						The final new room is the sacrificial room from the original Pixel Dungeon! It returns with a few tweaks to its mechanics and loot (sorry, no scroll of wipe out)."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_ARMBAND), "Armband Rework!",
				"""
						_The Master Thieves' Armband has been reworked!_

						This rework focuses on giving the armband usefulness outside of shops. You can now use it to steal from enemies as well as shopkeepers, and it gains charge as you gain exp, instead of when you collect gold."""));

		changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.MONSTERS_SLAIN_5.image), "New Badges!",
				"""
						_Badges now have names, and 8 new badges have been added!_

						These new badges are all part of the existing series badges (e.g. defeat X enemies), and primarily exist around the gold badge level.

						The 'games played' badges have also been adjusted to unlock either on a large number of games played, or a smaller number of games won."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), "New Boss Music!",
				"""
						_Each of the game's five bosses now have their own music track!_

						Just as before, these tracks are all composed by Kristjan Harristo, check the about scene for more details on them.

						All of the boss tracks take cues from the region tracks, but add enough to be more than simple remixes."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Reduced cases of multiple rooms that require a solution potion per floor
						_-_ Reduced the huntress unlock requirement
						_-_ Adjusted the secrets level feeling to be less harsh

						_-_ Added a 'new game' and 'menu' button after game over
						_-_ Made the blinking behaviour of the journal button easier to notice
						_-_ quickslot placement is now preserved when items are transmuted
						_-_ Improved the depth display to include icons for level feelings
						_-_ Added an icon next to depth display showing enabled challenges
						_-_ Made surprise attack VFX a bit more obvious
						_-_ Improved the resilience of the game's save system

						_-_ Added a new language: Galician!
						_-_ Removed the Catalan translation as it was below 70% complete"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various rare cases of save corruption on Android
						_-_ Various minor textual and visual errors

						_-_ Various rare cases where the hero could perform two actions at once
						_-_ Rare cases where the Freerunner could gain momentum while freerunninng
						_-_ Gladiator's parry move not cancelling invisibility or time freeze
						_-_ Assassinate killing enemies right after they were corrupted by a corrupting weapon
						_-_ Player being able to self-target with assassinate ability
						_-_ Exploits involving corruption and the 13th armor ability

						_-_ Various rare cases where giant enemies could enter enclosed spaces
						_-_ On-hit effects still triggering when the great crab blocks
						_-_ Corruption debuff affecting smoke bomb decoy
						_-_ Character mind vision persisting after a character dies
						_-_ Dwarf King not being targeted by wands or thrown weapons while on his throne""",

				"""
						_-_ Pharmacophobia challenge incorrectly blocking some alchemy recipes
						_-_ Unidentified wands being usable in alchemy
						_-_ Wild energy spell not cancelling invisibility or time freeze
						_-_ Various rare bugs with the timekeeper's hourglass
						_-_ Various bugs with the potion of dragon's breath
						_-_ Artifact recharging not charging the horn of plenty in some cases when it should
						_-_ Some items rarely not being consumed when they should be
						_-_ Arcane catalysts not being able to be turned into energy
						_-_ Fog of War not properly updating when warp beacon is used
						_-_ Very rare cases where dried rose becomes unusable""",

				"""
						_-_ Rare cases where lullaby scrolls were generated by the Unstable Spellbook
						_-_ Ring of might health boost not being affected by lost inventory debuff
						_-_ Items that spawn identified counting as being IDed by the player
						_-_ Some sources of artifact recharging affecting cursed artifacts
						_-_ Blacksmith not refusing to work with cursed items in specific cases
						_-_ An exploit where unblessed ankhs could be used with a lost inventory

						_-_ Layout issues with the loot indicator
						_-_ Floor 5 entrance rooms sometimes being smaller than intended
						_-_ Red flash effects stacking on each other in some cases
						_-_ Game forgetting previous window size when maximized and restarted
						_-_ Cases where ghoul sprites could become glitched
						_-_ Cases where heroic energy talent would use the wrong name/icon
						_-_ Curse status of quickslot items not showing in rankings"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FIRE_BOMB), "Recipe Cost Reductions",
				"""
						I've made a bunch of cost adjustments to alchemy recipes to help counteract energy becoming more expensive after v1.1.0:

						_- Bomb Recipe_ energy costs down across the board

						_- Infernal, Blizzard, and Caustic Brew_ energy costs down by 1

						_- Telekinetic Grab_ energy cost down to 2 from 4, liquid metal cost reduced to 10 from 15
						_- Phase Shift_ energy cost down to 4 from 6
						_- Wild Energy_ energy cost down to 4 from 6
						_- Beacon of Returning_ energy cost down to 6 from 8
						_- Summon Elemental_ energy cost down to 6 from 8
						_- Alchemize_ energy cost down to 2 from 3"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.AQUA_BLAST), "Alchemy Buffs",
				"""
						Several recipes have also been buffed, in addition to the cost reductions:

						_- Scroll of Foresight_ duration up to 400 from 250
						_- Scroll of Dread_ now grants 1/2 exp for defeated enemies
						_- Potion of Shrouding Fog_ gas quantity increased by 50%

						_-_ Items and effects which create water now douse fire

						_- Caustic Brew_ damage per turn increased by 1
						_- Infernal and Blizzard Brew_ now start their gas in a 3x3 AOE
						_- Shocking Brew_ AOE up to 7x7 from 5x5

						_- Phase Shift_ now stuns whatever it teleports
						_- Summon Elemental_ quantity up to 5 from 3, elemental's stats now scale with depth, and elementals can be re-summoned
						_- Aqua Blast_ now acts like a geyser trap, quantity down to 8 from 12
						_- Reclaim Trap_ quantity up to 4 from 3
						_- Curse Infusion_ now boosts highly levelled gear by more than +1, quantity up to 4 from 3.
						_- Recycle_ quantity up to 12 from 8, cost up to 8 from 6"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ROT_DART), "Dart Buffs",
				"""
						While they don't tie into v1.1.0's energy changes in particular, I am also handing out several buffs to tipped darts:

						_- Rot Dart_ uses increased to 5 from 1
						_- Adrenaline Dart_ duration up to 30 from 10
						_- Shocking Dart_ damage now slightly scales with depth
						_- Poison Dart_ damage scaling increased
						_- Sleep Dart_ is now _Cleansing Dart_, makes allies immune to debuffs for several turns
						_- Holy Dart_ duration up to 100 from 30
						_- Displacing Dart_ now much more consistently teleports enemies away"""));

		changes.addButton(new ChangeButton(new TalentIcon(Talent.LIGHT_CLOAK.icon()), "Talent Buffs",
				"""
						I'm handing out a few buffs to help better balance the Mage's T2 talents and the Rogue's class-based T3 talents. I'm also making one bugfix that counts as a buff:

						_- Energizing Upgrade_ charge boost up to 4/6, from 3/5
						_- Wand Preservation_ chance at +1 reduced to 50%, but now grants 1 arcane resin if it fails to preserve
						_- Wand Preservation_ max uses up to 5 from 3
						_- Empowering Scrolls_ now grants +3 on the next 1/2/3 wand zaps

						_- Light Cloak_ charging rate boosted to 25%/50%/75%, from 17%/33%/50%

						_- Shared Upgrades_ bugfixed to give the bonus damage stated in the description, instead of slightly less."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGIC_INFUSE), "Alchemy Nerfs",
				"""
						v1.2.0 is mostly about alchemy buffs, but a few alchemy items have had their power reduced as well:

						_- Magical Infusion_ energy cost up to 4 from 3
						_- Holy Bomb_ bonus damage reduced to 50% from 67%
						_- Goo Blob and Metal Shard_ energy value reduced to 3
						_- Alchemize_ quantity in shops reduced by 1

						While not a direct alchemy item nerf, I've also made some of the final bosses' fists less susceptible to certain mechanics:
						_- Soiled Fist_ is now immune to burning, but the grass it generates still burns
						_- Burning Fist_ is now immune to freezing, but it can still be chilled
						_- Rotting and Rusted Fists_ now take less damage from retribution, grim, and psionic blast"""));

		changes.addButton(new ChangeButton(new Image(Assets.Environment.TERRAIN_FEATURES, 112, 112, 16, 16), "Dreamfoil",
				"""
						Dreamfoil has always had great utility as a debuff-cleanser, and with the recent addition of stones of deep sleep its enemy sleeping functionality was feeling a bit unnecessary:

						_- Dreamfoil_ no longer puts enemies into magical sleep

						Sleep darts (made from dreamfoil) have also been changed into cleansing darts to go along with this change. These darts will make an ally temporarily immune to harmful effects."""));

		changes.addButton(new ChangeButton(new TalentIcon(Talent.SHIELD_BATTERY.icon()), "Talent Nerfs",
				"""
						I'm making a few talent nerfs to better balance the Mage's T2 talents, and to pull in the power of the Berserker a little:

						_- Shield Battery_ shielding per charge down to 4%/6%, from 5%/7.5%

						_- Endless Rage_ max rage boost reduced to 10%/20%/30% from 15%/30%/45%
						_- Enraged Catalyst_ proc rate boost reduced to 15%/30%/45% from 17%/33%/50%"""));

	}

	public static void add_v1_1_Changes(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v1.1", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released December 10th, 2021
						_-_ 115 days after Shattered v1.0.0

						v1.1.0 was the start of Shattered's alchemy system actually doing the job it was supposed to do way back in v0.7.0. Previously alchemical energy sort of sat on top of the alchemy system and acted as a hard cap on how many 'powerful' recipes the player could use in a run. Thanks to v1.1.0's changes, energy replaced specific ingredients in a huge number of recipes, which made the system massively more flexible. Lots of specific alchemy items also received big buffs or redesigns, making them much more worthwhile to create.

						This update also included new region-specific music tracks composed by Kristjan Haaristo! Kristjan was actually a fan of Shattered before working on the music and contacted me about potentially adding new tracks. I feel extremely fortunate to have been able to work with people that are just as passionate about Shattered as I am."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ENERGY), "Alchemical Energy Overhaul",
				"""
						_The role of Alchemical Energy in the alchemy system has been totally overhauled!_

						Energy is now a resource that the player carries with themselves, like gold. The game also generates much less energy for free, but more can be created by scrapping consumable items.

						Many recipes have been adjusted to compensate for this. Exotic potions and scrolls now require energy instead of seeds/stones, and several of them have been buffed or totally redesigned (see buffs and changes sections for more details).

						Other recipes have received relatively minor changes for now (mostly energy cost tweaks), but I'll likely be giving them more attention soon in future updates.

						This repositions energy as the primary driving force for alchemy, and should make the system both more flexible and better at recycling consumables the player doesn't want into ones that they do."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SUMMON_ELE), "New and Reworked Spells",
				"""
						While this update mostly focused changes on exotic potions and scrolls, there are _two new spells, and one totally redesigned spell:_

						_Summon Elemental_ requires fresh embers and an arcane catalyst. It can be used to summon a friendly elemental to fight for you, and can even be powered up with other items!

						_Telekinetic Grab_ requires some liquid metal and an arcane catalyst. It can be used to grab items remotely, even thrown items that are stuck to an enemy!

						_Alchemize_ has been totally redesigned. It now only requires an arcane catalyst, and is used to convert items into gold or alchemical energy on the go. I'm really hoping this spell helps with inventory management.

						Because of the redesign to alchemize, the merchant's beacon and magical porter are made mostly redundant and have been removed from the game. Shops now sell a few uses of alchemize instead."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), "more new music!",
				"""
						_The game now has a music track for each of the five dungeon regions!_

						Just like the remastered tracks from v1.0.0, they are all composed by Kristjan Harristo, check the about scene for more details on them.

						Each of these tracks use a similar variable looping method to the sewers track, to try and reduce repetitiveness.

						There have also been some small tweaks made to the existing sewers and title theme tracks."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EXOTIC_ISAZ), "Exotic Reworks",
				"""
						Several exotic potions and scrolls have been redesigned to be more powerful and worth using:

						_- Potion of Holy Furor_ is now _Potion of Divine Inspiration_, which gives bonus talent points.
						_- Potion of Adrenaline Surge_ is now _Potion of Mastery_, which reduces the strength requirement of one item by 2.

						_- Scroll of Petrification_ is now _Scroll of Dread_, which causes enemies to flee the dungeon entirely.
						_- Scroll of Affection_ is now _Scroll of Siren's Song_, which permanently makes an enemy into an ally.
						_- Scroll of Confusion_ is now _Scroll of Challenge_, which attracts enemies but creates an arena where you take reduced damage.
						_- Scroll of Polymorph_ is now _Scroll of Metamorphosis_, which lets you swap out a talent to one from another class."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Item drops and special room spawns are now more consistent. Getting loads of the same item is now much less likely.
						_-_ Items present on boss floors are now preserved if the hero is revived from an unblessed ankh
						_-_ Teleport mechanics now work on boss levels
						_-_ Traps that teleport no longer work on items in chests or similar containers
						_-_ Rewards from piranha and trap rooms now always appear in chests

						_-_ Tipped darts can now be transmuted and recycled
						_-_ Thrown weapons no longer stick to allies
						_-_ Liquid metal production from upgraded thrown weapons now caps at +3""",

				"""
						_-_ Updated game icons on Android and Desktop platforms
						_-_ Tabs in rankings and hero info windows now use icons, not text
						_-_ 'potions cooked' badge and stats are now 'items crafted'

						_-_ Newborn elementals no longer have a ranged attack

						Various small improvements for iOS Devices:
						_-_ Game can now run at higher framerates than 60
						_-_ Ingame UI elements now move inward if notched devices are used in landscape
						_-_ There is now an option to override silent mode

						_-_ Updated translations and translator credits"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various minor/rare visual and textual errors
						_-_ Cases where pausing/resuming the game at precise moments would cancel animations or attacks
						_-_ Endure damage reduction applying after some specific other damage-reducing effects
						_-_ Unblessed ankh resurrection windows disappearing in some cases
						_-_ Lucky enchantment rarely not trigger in some cases
						_-_ Artifacts spawning upgraded from golden mimics
						_-_ Unblessed ankh revival cancelling corpse dust curse
						_-_ Unstable spellbook letting the player select unidentified scrolls
						_-_ Desktop version not working correctly with FreeBSD
						_-_ Liquid metal being usable on darts
						_-_ Teleportation working on immovable characters in some cases
						_-_ Various quirks with thrown weapon durability
						_-_ Rare cases where ghouls would get many extra turns when reviving
						_-_ Magical infusion not preserving curses on armor
						_-_ Vertigo and teleportation effects rarely interfering""",

				"""
						_-_ Layout issues in the hero info window with long buff names
						_-_ Cursed wands being usable to create arcane resin
						_-_ Unblessed ankh revival rarely causing crashes or placing the player on hazards
						_-_ Some glyphs not working for armored statues or the ghost hero
						_-_ Various oddities with inferno gas logic
						_-_ Spirit bow having negative damage values in rare cases
						_-_ Artifact recharging buff working on cursed artifacts
						_-_ Scrolls of upgrade revealing whether unidentified rings/wands were cursed
						_-_ Ring of Might not updating hero health total in rare cases
						_-_ Specific cases where darts would not recognize an equipped crossbow
						_-_ Cap on regrowth wand being affect by level boosts
						_-_ Some on-hit effects not triggering on ghost or armored statues""",

				"""
						_-_ Rare errors when gateway traps teleported multiple things at once
						_-_ Various rare errors when multiple inputs were given in the same frame
						_-_ Fog of War errors in Tengu's arena
						_-_ Rare errors with sheep spawning items and traps
						_-_ Various rare crash bugs
						_-_ Various minor textual and visual errors
						_-_ Gateway traps rarely teleporting immovable characters
						_-_ Monks never losing focus if attacked out of hero vision range
						_-_ Wild magic continuing to activate if the hero dies during it
						_-_ Specific cases where guidebook windows could be stacked
						_-_ Remove curse stating nothing was cleansed when it removed the degrade debuff"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.EXOTIC_AMBER), "Exotic Buffs",
				"""
						Some exotic potions and scrolls have received more minor buffs, and not total redesigns:

						_- Potions of Storm Clouds, Shrouding Fog, and Corrosion_ initial gas AOE up to 3x3 from 1x1
						_- Potion of Shrouding Fog_ now only blocks enemy vision
						_- Potion of Corrosion_ starting damage increased by 1
						_- Potion of Magical Sight_ vision range up to 12 from 8
						_- Potion of Cleansing_ now applies debuff immunity for 5 turns

						_- Scroll of Foresight_ now increases detection range to 8 (from 2), but lasts 250 turns (from 600)
						_- Scroll of Prismatic Image_ hp +2 and damage +20%"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_TOOLKIT), "Artifact Buffs",
				"""
						The _Alchemist's Toolkit_ has received some minor changes to go along with the energy system adjustments:
						_-_ Toolkit indirectly buffed by energy now being more valuable
						_-_ Energy required to level up toolkit halved, kit can now be levelled anywhere
						_-_ Toolkit warmup is now based on time, and gets faster as it levels up
						_-_ Toolkit can now be used when enemies are near

						The _Horn of Plenty_ is getting a change to increase its flexibility, and to make it better synergize with food eating talents:
						_-_ The horn now has a 'snack' option that always consumes 1 charge
						_-_ To counterbalance this, the total number of charges and charge speed have been halved, but each charge is worth twice as much as before.

						I'm giving a mild buff to the _Dried Rose_ to fix an odd inconsistency where it was better to kill the ghost off than let them heal:
						_-_ Ghost HP regen doubled, to match the roses recharge speed (500 turns to full HP)"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), HeroSubClass.BERSERKER.title(),
				"""
						The berserker is getting a small QOL buff to make it easier to hold onto rage in combat:

						_-_ Rage now starts expiring after not taking damage for 2 turns, instead of immediately."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Talent and Ability Buffs",
				"""
						Talent and ability balance is becoming more stable now, but I've still got a few buffs to hand out, some are quite significant:

						_- Wild Magic_ Charge cost reduced to 25, from 35.
						_- Spirit Hawk_ Duration up to 100 turns, from 60.

						_- Empowering Scrolls_ now lasts for 2 wand zaps, up from 1.
						_- Light Cloak_ now grants 16.6% charge speed per rank, up from 13.3%
						_- Shrug it Off_ now caps damage taken at 20% at +4, up from 25%."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new MagesStaff(),
				"""
						The reduction to the Mage's starting melee damage in v1.0.0 had a good effect on his early game winrate, but it's still notably higher than other heroes. So, I'm nudging his early melee power down one more time:

						_- Mage's Staff_ base damage reduced to 1-6 from 1-7."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.ROGUE, 0, 90, 12, 15), HeroSubClass.ASSASSIN.title(),
				"""
						The Assassin is doing very well right now, especially after the power boost he can receive from smoke bomb or death mark. I'm scaling back his core power a little to try and reign him in a bit:

						_-_ Preparation bonus damage at power level 1/2/3/4 reduced to 10/20/35/50%, from 15/30/45/60%"""));

		changes.addButton(new ChangeButton(new TalentIcon(Talent.DOUBLE_JUMP.icon()), Talent.DOUBLE_JUMP.title(),
				"""
						Just one talent/ability nerf this time! I'm scaling double jump back a bit to put it more in line with the other heroic leap talents:

						_-_ Charge cost reduction now caps at 50%, down from 60%
						_-_ The warrior must now jump again within 3 turns, down from 5

						I'll likely making more balance tweaks (including nerfs) to abilities and talents in the future, but at the moment double jump is the only major standout."""));

	}

	public static void add_v1_0_Changes(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v1.0", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released August 17th, 2021
						_-_ 71 days after Shattered v0.9.3
						_-_ 316 days after Shattered v0.9.0
						_-_ A bit more than 7 years after v0.1.0!

						_That's right, the big v1.0.0!_ In this update Shattered switched to the industry standard _major.minor.patch_ version naming scheme. Prior to this update Shattered's updates were versioned with _0.major.minor[patch]_, where patch was a letter. Rather than jumping all the way from v0.9.3 to v10.0.0, I opted to reset Shattered back to v1.0.0 for this update.

						I actually originally intended for this update to be v0.9.4, but a requirement by Apple forced me to change the versioning scheme just before the full release. In retrospect, I'm extremely glad that this update became v1.0.0. While it wasn't the largest update content-wise, I can think of no better time for v1.0 than the update where Shattered first released as a paid product."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_PORT), "iOS Release!",
				"""
						_Shattered Pixel Dungeon is now available on the iOS App Store!_

						After years of requests, Shattered is finally available on Apple devices! The iOS version of the game will release in lockstep with the Android version moving forward, with some small variance due to different update approval processes.

						Note that the iOS version costs $5, but comes with some supporter features built-in. I have no plans to make any changes to the monetization of the Android version."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.AUDIO), "new music!",
				"""
						_The game's music tracks has been remastered!_

						The new music is composed by Kristjan Harristo, check the about scene for more details on them. Currently we have only replaced the existing tracks, but we are working on tracks for each of the dungeons regions as well!

						The new in-game track in particular is also an experiment in variable music looping. The track has an intro and a main segment and can play the main segment once or twice before looping back to the intro. This makes the track notably less repetative, and we intend to use similar techniques in other tracks."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LIQUID_METAL), "new alchemy recipes!",
				"""
						Two new alchemy recipes have been added! They're focused on helping you recycle thrown weapons and wands that you don't want to use.

						_Liquid metal_ lets you sacrifice thrown weapons to repair other ones.

						_Arcane resin_ lets you sacrifice a wand to upgrade other low level wands.

						A new page has been added to the alchemy guide for these recipes, and it's now possible to find later guidebook pages in the prison."""));

		changes.addButton(new ChangeButton(new Image(new Image(Assets.Environment.TERRAIN_FEATURES, 64, 64, 16, 16)), "new traps",
				"""
						Two new traps have been added! They are both less common traps that have a higher potential to be helpful.

						_Geyser traps_ convert surrounding terrain to water and throw back anything near them.

						_Gateway traps_ are a special teleportation trap which never expire, and always teleport to the same location.

						All teleportation traps now also affect characters and items next to them."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY), "new player experience improvements",
				"""
						_The adventurer's guidebook is now the Tome of Dungeon Mastery!_

						This is partly as a reference to the tome of mastery, which I removed in the previous update, and partly because the game's tutorial functionality has been improved.

						Guidebook pages are now a bit shorter and more plentiful, and some of them are now given to the player right at the start of the game. These automatic pages are suggested to the player to read at crucial moments. This way the guidebook does a better job of highlighting info right when it's needed."""));

		changes.addButton(new ChangeButton(new Image(new SpectralNecromancerSprite()), "spectral necromancers",
				"""
						A new rare variant has been added for necromancers: _Spectral Necromancers!_

						These necromancers don't care for skeletons, and prefer to summon a bunch of wraiths instead! Dealing with their horde might be tricky, but you'll be rewarded with a scroll of remove curse."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ANKH), "new ankh mechanics",
				"""
						_Regular Ankhs_ have been totally redesigned, and now give the player a chance to save all of their equipment! Be careful though, you'll have to fight your way back to your lost gear.

						_Blessed Ankhs_ have received comparatively minor changes. In addition to the resurrection effect, these ankhs now also give the player 3 turns of invulnerability. This should help give players a moment to heal up after being revived."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STONE_FEAR), "runestones",
				"""
						All Scrolls now produce 2 runestones, instead of some scrolls producing 3. The stones that used to be given in higher quantities have received buffs in compensation:

						_- Stone of Intuition_ can now be used a second time if the guess was correct.
						_- Stone of Flock_ AOE up to 5x5 from 3x3, sheep duration increased slightly.
						_- Stone of Deepened Sleep_ is now stone of deep sleep, instantly puts one enemy into magical sleep.
						_- Stone of Clairvoyance_ AOE up to 20x20, from 12x12.
						_- Stone of Aggression_ duration against enemies up 5, now works on bosses, and always forces attacking.
						_- Stone of Affection_ is now stone of fear, it fears one target for 20 turns."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Various tech and stability improvements.
						_-_ Increased the minimum supported Android version to 4.0, from 2.3.
						_-_ Game versions that use github for update checking can now opt-in to beta updates within the game.

						_-_ Item renaming functionality has been moved to within the item info window.
						_-_ Various minor UI improvements to the intro, welcome and about scenes.
						_-_ Adjusted settings windows, removed some unnecessary elements.
						_-_ Added info buttons to the scroll of enchantment window
						_-_ Armor with the warrior's seal on it now states max shielding.
						_-_ Bonus strength is now shown separately from base strength.

						_-_ Improved the exit visuals on floor 10.
						_-_ Becoming magic immune now also cleanses existing magical buffs and debuffs.
						_-_ Traps that spawn visible or that never deactivate can no longer appear in enclosed spaces"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various rare crash bugs
						_-_ Various minor visual and text errors
						_-_ damage warn triggering when hero gains HP from being hit
						_-_ various rare bugs involving pitfall traps
						_-_ disarming traps opening chests

						_-_ various minor errors with electricity effects
						_-_ soul mark not working properly on low HP enemies with shielding
						_-_ various rare errors with shadows buff
						_-_ errors with time freeze and inter-floor teleportation mechanics
						_-_ rooted characters not being immune to knockback effects
						_-_ time stasis sometimes not preventing harmful effects in its last turn.

						_-_ wands losing max charge on save/load in rare cases
						_-_ magical infusion clearing curses
						_-_ dewdrops stacking on each other in rare cases
						_-_ exploding skeletons not being blocked by transfusion shield in rare cases
						_-_ rare incorrect interactions between swiftthistle and golden lotus
						_-_ Rings not being renamable if they weren't IDed""",

				"""
						_-_ statues not becoming aggressive when debuffed
						_-_ swapping places with allies reducing momentum
						_-_ DK minions dropping imp quest tokens
						_-_ giant succubi teleporting into enclosed spaces
						_-_ spectral blades being blocked by allies
						_-_ Spirit Hawk and Shadow Clone being corruptible
						_-_ Rogue's body replacement ally being vulnerable to various AI-related debuffs
						_-_ some ranged enemies becoming frozen if they were attacked from out of their vision

						_-_ gladiator combos dealing much more damage than intended in certain cases
						_-_ magical charge and scroll empower interacting incorrectly
						_-_ magical sight not working with farsight talent
						_-_ perfect copy talent giving very slightly more HP than intended
						_-_ wild magic using cursed wands as if they're normal"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor Ability Buffs pt.1",
				"""
						Based on balance data and feedback, I'm making a bunch of buffs and adjustments to armor abilities and their related talents!

						_- Endure_ bonus damage conversion rate up to 1/3 from 1/4.

						_- Striking Wave_ effectiveness increased by 20%.
						_- Shock Force_ now actually adds 20% damage per level as stated. Previously it only added 15%.

						_- Wild Magic_ now boosts wand levels, instead of overriding them.
						_- Conserved Magic_ now has a chance to give each wand a 3rd shot.
						_- Conserved Magic_ charge cost reduction down to 33/55/70/80% from 44/69/82/90%.

						_- Elemental Blast_ base damage increased to 15-25 from 10-20.
						_- Elemental Power_ now boosts power by 20% per level, up from 15%.

						_- Remote Beacon_ range per level increased to 4, from 3."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor Ability Buffs pt.2",
				"""
						_- Shadow Clone_ now follows the hero at 2x speed.
						_- Shadow Blade_ damage per level increased to 7.5% from 6.25%.
						_- Cloned Armor_ armor per level increased to 15% from 12.5%.

						_- Spirit Hawk_ evasion, accuracy, and duration increased by 20%.
						_- Swift Spirit_ now gives 2/3/4/5 dodges, up from 1/2/3/4.
						_- Go for the Eyes_ now gives 2/4/6/8 turns of blind, up from 2/3/4/5.

						_- Spirit Blades_ effectiveness increased by 20%."""));

		changes.addButton(new ChangeButton(new WoollyBomb(),
				"""
						As stones of flock were buffed, I thought it was only fair to give woolly bombs some compensation buffs as well:

						_-_ AOE size up to 9x9 from 5x5
						_-_ Sheep duration up to 12-16 from 8-16"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new MagesStaff(),
				"""
						The Mage continues to do too well in the early game since the talent changes in v0.9.1. Rather than weakening his talents and other magical abilities more, I've decided to make him more reliant on them instead by reducing his melee damage.

						_- Mage's Staff_ base damage reduced to 1-7 from 1-8."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor Ability Nerfs",
				"""
						I focused mostly on buffs this update, but a few abilities and talents do need to be scaled back a little:

						_- Double Jump_ charge cost reduction down to 20/36/50/60%, from 24/42/56/67%.

						_- Telefrag_ self damage increased to a flat 5 per level.

						_- Smoke Bomb_ max range reduced to 6 tiles from 8.
						_- Body Replacement_ armor reduced to 1-3 per level, from 1-5.
						_- Hasty Retreat_ turns of haste/invis reduced to 1/2/3/4 from 2/3/4/5
						_- Shadow Step_ charge cost reduction down to 20/36/50/60%, from 24/42/56/67%.

						_- Double Mark_ charge cost reduction down to 30/50/65/75%, from 33/55/70/80%.

						_- 13th armor ability_ now only lasts for 6 turns, but also no longer prevents EXP or item drops. I'm trying to retain the ability's core theme while making it a bit less effective at totally removing enemies.
						_- resistance talent_ damage reduction reduced to 10/19/27/35%, from 10/20/30/40%."""));

	}

}
