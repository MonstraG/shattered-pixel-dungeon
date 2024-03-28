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
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroSubClass;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Talent;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.Spinner;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.ChaliceOfBlood;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.CloakOfShadows;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfEnergy;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfFrost;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfTransfusion;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FistSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GolemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SpawnerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SpinnerSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.TalentIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class v0_9_X_Changes {

	public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
		add_v0_9_2_Changes(changeInfos);
		add_v0_9_1_Changes(changeInfos);
		add_v0_9_0_Changes(changeInfos);
	}

	public static void add_v0_9_2_Changes(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v0.9.3", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released June 7th, 2021
						_-_ 101 days after Shattered v0.9.2

						v0.9.3 was the largest talent addition yet, with over 50 total talents and 9 new armor abilities! Armor abilities were another thing that I always intended to work with the talent system. They now fit in as a bit of an equivalent to subclasses with their own customization options both from talents and the abilities themselves. These talents also heavily impact the power of their respective armor abilities, meaning that the same ability can be quite different depending on which talents you choose to upgrade.

						This update also included Shattered's second new challenge! Badder bosses was rattling around in my head ever since the release of v0.8.0, as I knew it would be very easy to make stronger versions of each of the new boss encounters that weren't just based on higher stats. Badder bosses was well received while still managing to be distinct from hostile champions. Hostile champions is a bit more random and can apply anywhere, whereas badder bosses is consistent in its effect but only applies during specific fights."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROWN, null), "Armor abilities and T4 Talents!",
				"""
						_Hero armor abilities have been totally overhauled, featuring 13 abilities and 40 T4 talents!_

						After the defeating the fourth boss, the player now gets to choose between one of three abilities for each hero. Armor abilities also charge much faster, and can be further improved via tier four talents!

						Each armor ability has three talents, plus one charge-speed talent that's shared between them. These talents all take up to 4 points, and there are up to 10 points available in tier 4, for levels 21-30."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), "New Challenge!",
				"""
						A new challenge has been added: _Badder Bosses!_

						This challenge is a followup to Hostile Champions in a lot of ways, making the dungeon's bosses much stronger, instead of the enemies. Early bosses like Goo are only a touch tougher, but lategame bosses are quite a lot more deadly!

						To go along with this challenge, I've also made a few targeted tweaks to regular boss mechanics:
						_- Goo's_ pump up attack is now easier to dodge around terrain and doesn't highlight cells that Goo can't attack.
						_-_ Regeneration in _Goo's_ boss fight now can't be farmed indefinitely by letting Goo heal.
						_- Tengu_ can now throw bombs at his own feet.
						_- Yog's_ fists now seek the hero out when they're wandering.
						_- Yog's_ fists are now immune to sleeping effects."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), "Dungeon Changes",
				"""
						I'm making some slight tweaks to level sizes and layouts, to make the game overall a little shorter, and to put a bit more emphasis on the final region:

						_-_ Standard room count down by roughly 10/20/15/15/5%, for each region
						_-_ Connection room frequency down by ~25%

						Overall levels should now be a little smaller than they were before v0.9.1.

						I'm also fixing a couple levelgen oddities while I'm here:

						_-_ Entrance and Exit rooms now cannot directly connect to each other.
						_-_ Reduced chance for 3+ enemies to appear near each other on floor 1.
						_-_ Increased the minimum size of pit rooms, to prevent wraith fights in 3x3 spaces."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASK, null), "Hero Changes",
				"""
						I've made several changes to hero starting items and the process of powering up your hero:

						_Gameplay Changes:_
						_-_ All heroes now start with a velvet pouch. This should make sewers inventory management a bit smoother.

						_Thematic Changes:_
						_-_ The _Dew Vial_ has been replaced with a _waterskin_. The waterskin has the same functionality, and all heroes start with one.
						_-_ The _Tome of Mastery_ has been replaced by _Tengu's Mask_. The mask has the same functionality, but fits better thematically.
						_-_ The _Armor Kit_ has been replaced by _Dwarf King's Crown_. The crown has the same functionality, but fits better thematically.

						_Interface Changes:_
						_-_ Overhauled the hero info window, and added a button for it in the ingame hero menu.
						_-_ Overhauled the subclass selection interface, now much more informative."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Quickslotting a bag or long-pressing the inventory now shows a quick-use windows!
						_-_ Added quickslot actions for some items that were missing them
						_-_ Bags can now appear in the rankings

						_-_ Long pressing now uses the system long-press time (default 0.5 sec).
						_-_ Google Play Games and sharing gameplay data can now be enabled separately.

						_-_ Deactivating the cloak of shadows no longer takes time.
						_-_ Runestones now press tiles when they are thrown.
						_-_ The hero can now collect dew on stairs, even if they are at full HP.
						_-_ Improved the functionality for allies following the hero into locked boss arenas.

						_-_ Improved the descriptions of combo abilities
						_-_ Added dev commentary for v0.6.0-v0.6.5
						_-_ The Unstable Spellbook now greys out scrolls that have already been fed to it.
						_-_ Added visible cooldowns for some talent effects.
						_-_ Improved icons for several existing talents.
						_-_ Added little icons to the titles of various windows."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various rare crash issues
						_-_ Various minor VFX/SFX/text issues
						_-_ Various exploits caused by window stacking and multitaps
						_-_ Resting causing time to pass faster at high framerates
						_-_ Errors when zooming with mouse and keyboard keys

						_-_ Thief's Intuition not working in rare cases
						_-_ Berries rarely appearing in hero's remains
						_-_ Assassin blink using incorrect distance values
						_-_ Light cloak not causing cloak to charge in some cases
						_-_ Nature's aid talent not working with fadeleaf
						_-_ Restored nature talent rooting allies
						_-_ Rejuvenating steps triggering while levitating
						_-_ AOE from crush combo move being blocked by chasms
						_-_ Blocking enchant and barkskin only applying to the hero
						_-_ Ghost hero not saying anything when the hero dies
						_-_ Various rare AI bugs with Ghost hero""",

				"""
						_-_ Incendiary darts being instantly used up when used on terrain
						_-_ Wands of regrowth and fireblast using more than 3 charges in rare cases
						_-_ Knockback effects not always working on dead characters
						_-_ Cone effects rarely stopping short
						_-_ Hero accepting input while using potion of dragon's breath
						_-_ Vision effects from talisman and arcane vision not working after save/load
						_-_ Aqua rejuv working while hero is levitating
						_-_ Seeds disappearing if they fall into a chasm with the barren land challenge enabled
						_-_ Displacing darts sometimes teleporting enemies into unreachable places
						_-_ Items with boosted levels being remove-cursable
						_-_ Magical infusion not clearing the degrade debuff""",

				"""
						_-_ Giant swarms duplicating in enclosed spaces
						_-_ Giant champions being able to attack through other characters
						_-_ Ghouls rarely healing without reviving
						_-_ Necromancers sometimes losing track of their skeleton
						_-_ Chaos elemental teleportation not interrupting the hero
						_-_ On-hit effects triggering on invulnerable pylons
						_-_ Deaths to Dwarf King rarely not being recorded in rankings

						_-_ Quickslots not appearing greyed out when they should
						_-_ Rare cases where non-visible cells would appear visible
						_-_ Pacifist badge not triggering if hero descended by falling
						_-_ Wells of healing not fully healing the hero in all cases
						_-_ Game log entries not appearing from alchemy scene"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(new SpawnerSprite()), "Demon Spawner Buffs",
				"""
						I'm making a few tweaks to demon spawner mechanics to increase the overall difficulty of the demon halls, to help compensate for the new abilities:

						_-_ Demon spawners no longer result in overall lower enemy density in the demon halls
						_-_ EXP awarded for defeating a demon spawner down to 15 from 25."""));

		changes.addButton(new ChangeButton(new Image(new FistSprite.Burning()), "Yog Fist Buffs",
				"""
						I'm also making some tweaks to Yog's two weakest fists, again to increase overall difficulty:

						_-_ Burning Fist now evaporates water 20% more often
						_-_ Bleed damage taken by Rotting Fist reduced by 10%"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Talent Buffs",
				"""
						I'm making changes to a bunch of talents that were underperforming in v0.9.2:

						_- Strongman_ redesigned. Now grants 8/13/18% bonus str, rounded down.
						_- Berserking Stamina_ bonus shield increased to 25/50/75%, from 16/33/50%.
						_- Cleave_ turns of combo increased to 15/30/45 from 10/20/30.

						_- Energizing Upgrade_ charge granted up to 3/5 from 2/3.
						_- Empowering Scrolls_ no longer has a timer.
						_- Empowered Strike_ damage bonus up to 25/50/75% from 20/40/60%.
						_- Necromancer's Minions_ proc chance up to 13/27/40% from 10/20/30%.

						_- Light Cloak_ charge speed up to 13/27/40% from 10/20/30%.
						_- Enhanced Lethality_ boosted at high levels of preparation.

						_- Nature's Bounty_ is now more consistent in how it drops berries.
						_- Shared Upgrades_ damage boost increased to 10/20/30% from 7/12/20%."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Talent Nerfs",
				"""
						I'm also scaling back some talents that were overperforming in v0.9.2:

						_- Improvised Projectiles_ cooldown up to 50 turns from 30.

						_- Backup Barrier_ shield down to 3/5 from 4/6.
						_- Ally Warp_ range down to 2/4/6 from 3/6/9.
						_- Soul Siphon_ effectiveness down to 13/27/40% from 15/30/45%.

						_- Bounty Hunter_ gold increased by 50%, but it now has a 25% chance to activate per level of preparation.

						_- Rejuvenating Steps_ now starts producing furrowed grass after not gaining exp for a while.
						_- Barkskin_ redesigned. Now grants 50/100/150% of your level in barkskin, which fades every turn."""));

		changes = new ChangeInfo("v0.9.2", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released February 26th, 2021
						_-_ 78 days after Shattered v0.9.1

						v0.9.2 added the first tier of talents that were applicable through the later stages of the game. This is where the talent system really started to feel like it was deepening existing character customization systems in the game, rather than being tacked on top of them. It was always my intention for talents to work with subclasses as well, as there were lots of little subclass-level effects that could be fun but couldn't fit into their own full subclass. Talents give these mechanics a place to exist that compliments the game's existing systems.

						These talent additions also gave me balance room to give some help to weaker enemies and also better balance the various subclasses. Subclasses that were already a bit strong got some of their innate powers moved to talents, wheras other subclasses got entirely new effects via the talent system. The Gladiator and freerunner in particular got more wide-reaching changes for both balance and design reasons."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Tier Three Talents!",
				"""
						_32 new talents have been added that span levels 13 to 20!_

						These talents are a bit different than the previous tiers. They require 3 points each, are balanced to encourage specialization, and vary based on class and subclass!

						There is one more tier of talents left to be implemented, currently slated for v0.9.3. This tier will span levels 21-30, and will interact with an existing mechanic..."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), HeroSubClass.GLADIATOR.title(),
				"""
						I've made a variety of changes to _the Gladiator_ to make combo moves more interesting, flexible, and easier to build to:

						_-_ Combo is no longer reset on 2 misses, but misses also no longer reset combo time.
						_-_ Combo time increased to 5 turns from 4.
						_-_ Combo moves can now be selected, instead of only the strongest one being available.
						_-_ Combo moves have been redesigned around new flexibility and easier combo building."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.ROGUE, 0, 90, 12, 15), HeroSubClass.FREERUNNER.title(),
				"""
						I've redesigned _the Freerunner_'s main benefit to make it require more thought and give more visible power:

						_-_ Freerunner still builds momentum by moving, but this does nothing on its own.
						_-_ Freerunner can now activate momentum to start freerunning.
						_-_ Freerunner has 2x movespeed and bonus evasion while freerunning.
						_-_ Freerunning lasts for up to 20 turns, based on amount of momentum.
						_-_ There is a cooldown after freerunning before momentum can be build again."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY, null), "Other Subclass Changes",
				"""
						Several subclasses have received more minor changes due to the addition of talents. Primarily subclass abilities that used to be innate are now talents:

						_- Berserker:_ Rage increasing past 100% has been moved to a talent, berserking has been nerfed but can be buffed back up via a talent.

						_- Warlock:_ Gaining satiety from soul mark, and soul mark triggering from other characters have both been moved to talents.

						_- Assassin:_ Instakill threshold and blink range are both nerfed, but can be buffed back up via talents.

						_- Warden:_ Barkskin and bonus durability on darts have both been moved to talents.

						_- Sniper:_ Bonus vision range has been moved to a talent."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Descriptions have been added for warden plant effects.
						_-_ Improvements have been made to wand descriptions. They now include descriptions of some hidden stats and battlemage effects.

						_-_ Renamed items no longer include their enchantment or glyph in their name.

						_-_ Added Greek language support
						_-_ Developer commentary has been added to the changelog for updates from v0.1.0 to v0.5.0.

						_-_ Using darts with a crossbow now helps identify that crossbow.
						_-_ Sungrass healing now interrupts hero resting when it expires
						_-_ Characters now awaken from regular sleep if they are debuffed

						_-_ Improved the reward UI from the wandmaker's quest
						_-_ Reduced the intensity of white flash effects, should help photosensitive users
						_-_ The hero now hovers while idling if they are levitating, instead of appearing to stand"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ various rare crash bugs
						_-_ various rare errors with levelgen
						_-_ rare cases where caves fissure rooms weren't navigable

						_-_ Yog's visibility penalty not persisting on save/load
						_-_ various errors with DM-300
						_-_ newborn fire elemental not dropping embers in rare cases
						_-_ evil eyes not dropping items correctly
						_-_ golden lotus being corruptable
						_-_ rare cases where retreating characters would fail to run.
						_-_ giant flying enemies not able to move over chasms
						_-_ large characters getting pushed into enclosed spaces in rare cases.

						_-_ frozen/cooked meat not stacking in rare cases
						_-_ Warrior's seal not applying to cursed armor when it has a cursed glyph
						_-_ Ethereal Chains pulling a rooted hero
						_-_ Cloak of Shadows spending an extra charge on save/load
						_-_ kinetic enchantment ignoring enemy shields
						_-_ regrowth bombs placing plants in incorrect locations""",

				"""
						_-_ combo moves not cancelling invisibility or time freeze
						_-_ cases where Assassin couldn't blink to places he should be able to blink to.
						_-_ some on-eat talents unintentionally stacking with themselves
						_-_ lethal momentum not triggering on thrown attacks
						_-_ player being able to input actions during combo moves

						_-_ targeting issues when enemies become corrupted
						_-_ save/load making it possible to incorrectly receive the pacifist badge.
						_-_ desktop crashes caused by incorrectly set game options.

						_-_ animation errors with ghouls dieing
						_-_ succubus vfx/sfx triggering when they aren't visible
						_-_ damage numbers appearing in incorrect locations when a target is vertigoed
						_-_ various rare VFX issues with Goo"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.TENGU, 0, 0, 14, 16), "Midgame Enemies",
				"""
						I have given some milder buffs out to enemies in the prison and caves, to help compensate for talents making the hero more powerful. These buffs are targeted at helping out the least lethal enemies, rather than making strong enemies even more oppressive:

						_- Necromancers:_ Max HP up to 40 from 35, evasion up to 14 from 13.
						_- Tengu:_ Max HP up to 200 from 160, ranged accuracy up to 20 from 18, melee accuracy down to 10 from 12.

						_- Bats:_ Damage up to 5-18 from 5-15
						_- DM-200s:_ HP up to 80 from 70, evasion up to 12 from 8.
						_- DM-300:_ Can now use abilities when being attacked by heroes it cannot see."""));

		changes.addButton(new ChangeButton(new Image(new GolemSprite()), "Lategame Enemies",
				"""
						I have given some more substantial buffs to weaker enemies in the dwarven city and demon halls, again to compensate for talents:

						_- Elementals:_ damage up to 20-25 from 16-26.
						_- Golems:_ HP up to 120 from 100, evasion up to 15 from 12, damage up to 25-30 from 15-35.

						_- Ripper Demons:_ Damage up to 15-25 from 12-25.
						_- Succubi:_ Damage up to 25-30 from 22-30.
						_- Scorpios:_ HP up to 110 from 95, damage up to 30-40 from 26-36."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), "Hostile Champions",
				"""
						I've made another round of tweaks to the Hostile Champions challenge to make it more consistent and a bit harder overall:

						_-_ Champion spawn rate up to 1/8 from 1/10.
						_-_ Rather than having a 1/8 chance per enemy, the game now guarantees that every 8th enemy is a champion. This should make champion spawn rates much more consistent.
						_-_ Removed champion enemy caps, no longer needed now that spawning is more consistent."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SCROLL_TIWAZ), "On-Upgrade Talents",
				"""
						T2 talents are doing very well overall, but I'm handing out a buff to each on-upgrade talent as they're a bit weak and aren't picked often:

						_- Energizing Upgrade_ staff charges increased to 2/3 at +1/+2, up from 1/2 at +1/+2.
						_- Mystical Upgrade_ cloak of shadows charges increased to 2/3 at +1/+2, up from 1/2 at +1/+2."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new CloakOfShadows(),
				"""
						The Rogue is now consistently performing best out of all the classes after the buffs talents gave him in v0.9.1 and v0.9.0. I'm taking this opportunity to scale back his ability to evade enemies a bit:

						_- the Cloak of Shadows_ now grants 4 turns of invisibility per charge, down from 5.
						_- the Assassin's_ preparation mechanic has been adjusted to compensate for this."""));

		changes.addButton(new ChangeButton(new ChaliceOfBlood(),
				"""
						With artifact charging getting a bit easier to get a hold of, I'm adjusting how the chalice of blood scales when it grants bonus HP from artifact charging:

						_- the Chalice of Blood_ now grants more HP per turn with artifact charging based on its level, instead of based on dungeon depth.
						_-_ This scaling occurs in the same way as how the chalice scales up health regen. The max heal per turn is unchanged at 5."""));

		changes.addButton(new ChangeButton(new TalentIcon(Talent.NATURES_AID), "Nature's Aid",
				"""
						I'm nudging nature's down slightly as it is currently the strongest T1 talent by a fair margin:

						_- Nature's Aid_ turns of barkskin reduced to 3/5 at +1/+2, from 4/6 at +1/+2."""));

	}

	public static void add_v0_9_1_Changes(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v0.9.1", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released December 11th, 2020
						_-_ 68 days after Shattered v0.9.0

						v0.9.1 continued on the momentum of v0.9.0, adding a new tier of talents spanning the mid game. These talents were a lot more satisfying for players to use, as they were able to more significantly shape gameplay when compared to the early game talents added in v0.9.0.

						I also became a lot more sure that I was making the right call by splitting the talent system into multiple updates. v0.9.1 was released quickly, more than doubled the number of talents, and made a bunch of crucial improvements to the talents added in v0.9.0. Had I released the entire system in one go then these sorts of growing pains would have stuck around for much longer.

						v0.9.1 also includes the first major changes to level generation since v0.6.2! While the same base algorithms are still used to lay levels out, v0.9.1 made overall level structures more chaotic and varied, which really helped individual layouts feel more unique."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Tier Two Talents!",
				"""
						_A second tier of talents has been added, including twenty new talents spanning levels 7-12!_

						The second talent tier is similar to the first, but talent powers are much less focused on the early game. Expect effects that are useful all game long.

						Look forward to tier 3 of the talent system coming in v0.9.2, which will span levels 13-20."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), "Levelgen Improvements!",
				"""
						_The game's level generation system has received a number of improvements!:_

						_-_ A new region specific room has been added to each dungeon region, 5 in total.
						_-_ Three new level feelings have been added: large, secrets, and traps.
						_-_ The level layout system now creates much more varied layouts based on more shapes.
						_-_ Adjacent rooms can now be merged in many more cases.
						_-_ Several existing room types have received small tweaks and improvements."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.HUNTRESS, 0, 15, 12, 15), "Huntress and Rogue Adjustments",
				"""
						The _Huntress and Rogue_ have both received some adjustments to their innate powers:

						_-_ Bonus thrown weapon durability is no longer an innate huntress power, it is now a talent.
						_-_ Short-range mind vision is no longer an innate huntress power, it is now a talent.

						_-_ The Rogue no longer causes the game to spawn slightly more secret rooms. Instead secret room generation has been slightly increased for all heroes, and the Rogue has talents that help him find these secrets."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Tier One Talent Changes",
				"""
						Several _tier one talents_ have been changed based on feedback and gameplay data:

						_- Test Subject_ now triggers on identifying any item, but the healing it grants has been halved.

						_- Energizing Meal_ is now a T2 talent. In T1 it has been replaced by _Empowering Meal_, which grants bonus damage on wand zaps.
						_- Tested Hypothesis_ now triggers on identifying any item. It now also grants a small amount of recharging, instead of shielding.
						_- Energizing Upgrade_ is now a T2 talent. In T1 it has been replaced by _Backup Barrier_, which gives a small shield when the Mage's staff runs out of charge.

						_- Rationed Meal_ has been removed. It is replaced by _Cached Rations_, which allows the Rogue to find bonus food.
						_- Mending Shadow_ has been reworked. It is now _Protective Shadows_, which grants the Rogue shielding.

						_- Invigorating Meal_ is now a T2 talent. In T1 it has been replaced by _Nature's Bounty_, which allows the Huntress to find berries in grass."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Statue grid rooms now appear in the Dwarven City, rather than the Prison.
						_-_ Pillar rooms now appear in the Prison, rather than the Dwarven City.

						_-_ Improved blacksmith logic when upgraded item is also equipped
						_-_ Stones of intuition can now be used on rings.
						_-_ Elixir of honeyed healing now triggers on-eat talents and satiates 150 turns of hunger, up from 90.
						_-_ The Mage's staff is no longer automatically set to max charges when imbuing a new wand.
						_-_ Frozen carpaccio can now burn like mystery meat

						_-_ Necromancers now damage enemies if their summoning position is totally blocked
						_-_ Piranha are no longer invulnerable to electricity and frost""",
				"""
						_-_ Barriers now decay more slowly when under 20 shielding.
						_-_ Sniper's mark, charm, and terror all now cancel if their subject is dead.
						_-_ Rogue's foresight can now also trigger when returning to a floor, if that floor was detected initially
						_-_ The Overgrowth curse can now trigger starflower effects

						_-_ Slightly adjusted the Huntress' splash art to improve details on her face.
						_-_ The Sad Ghost's reward UI has been improved.
						_-_ Small UI improvements to rankings window
						_-_ Challenge completion badges can now appear in rankings
						_-_ Added a debuff indicating when enemies have thrown weapons attached to them.
						_-_ Added some VFX to scroll of transmutation

						_-_ Updated translations and translator credits"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various minor audiovisual errors
						_-_ Various rare crash and freeze bugs
						_-_ Targeting errors with projecting bow and ethereal chains
						_-_ Curse infusion not awarding item level badge
						_-_ Talisman gaining charge while cursed
						_-_ Artifacts rarely losing levels when transmuted
						_-_ Hourglass spawning sand when unidentified or cursed
						_-_ Various rare errors with shops
						_-_ Scrolls of teleportation spending a turn when they fail
						_-_ Tengu getting extra turns on game load in rare cases
						_-_ Various errors with DM-300
						_-_ Dwarf King and some Yog fists rarely taking negative damage
						_-_ Warlocks not having capped health potions drops
						_-_ Large characters entering tunnels when vertigoed
						_-_ Rare AI issues when paths are blocked""",

				"""
						_-_ Various minor errors relating to time freeze
						_-_ Assassin blink ignoring hero being rooted
						_-_ Various rare bugs with corruption
						_-_ Hero being able to be both well-fed and hungry
						_-_ Antimagic not applying to wards or magical sleep debuff
						_-_ Various rare errors with Gladiator's fury
						_-_ Various rare errors with multiplicity curse
						_-_ Various minor errors with magical charge buff
						_-_ Rare cases where dieing to a chasm would be recorded as 'Killed by Something'
						_-_ Hero having a smaller tap region than other characters
						_-_ Questgivers rarely not being added to the journal
						_-_ 'death from viscocity' badge not appearing in rankings
						_-_ Incorrect badges rarely showing in rankings
						_-_ High grass appearing on top of plants in rare cases
						_-_ Characters rarely appearing inside doors or the hero
						_-_ Talent points being spendable when the hero is dead"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.MAGE, 0, 90, 12, 15), HeroSubClass.BATTLEMAGE.title(),
				"""
						I'm making a variety of adjustments to the _Battlemage_ to make him a more compelling choice vs. the Warlock, and to improve some wands that don't work as well for him as the Warlock:

						_-_ Staff charge granted on-hit increased to 0.5 from 0.33

						_- Staff of Magic Missile_ on-hit now gives all wands 0.5 charge, up from 0.33

						_- Staff of Transfusion_ on-hit now triggers when enemy is charmed
						_- Staff of Transfusion_ on-hit now grants a shield in addition to a free shot on allies

						_- Staff of Frost_ on-hit now has a chance to trigger at lower amounts of chill, still guaranteed at 10+ turns.

						_- Staff of Living Earth_ on-hit now grants 33% of damage as armor, up from 25%.

						_- Staff of Regrowth_ on-hit now triggers if the hero or enemy are standing in grass.
						_- Staff of Regrowth_ on-hit now grants herbal healing, instead of spawning grass."""));

		changes.addButton(new ChangeButton(new WandOfTransfusion(),
				"""
						The _Wand of Transfusion_ is currently in an odd place, where it is not very useful as a general wand, but is GREAT when heavily upgraded by the warlock. I'm making a few adjustments so that its power is less polarized, and to make it hopefully more useful when combined with allies:

						_-_ Starting charges increased to 2, from 1
						_-_ Shield per-hit adjusted to 5+lvl from 5+2*lvl
						_-_ Self-damage reduced to 5% of max HP, from 10% max HP
						_-_ Damage from allies no longer cancels charm effect"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOPAZ, null), Messages.get(RingOfEnergy.class, "name"),
				"""
						The _Ring of Energy_ is doing better after being buffed to apply to artifacts, but there is still room to make its effect stronger without making it overpowered:

						_-_ Bonus artifact charging increased from 10% to 15%"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new TalentIcon(Talent.HEARTY_MEAL), Talent.HEARTY_MEAL.title(),
				"""
						_Hearty Meal_ is currently the strongest tier one talent in the game, so I'm deepening the missing health requirement slightly to make its power a bit harder to access:

						_-_ Now grants 2/3 healing when hero is below 50% health, down from 3/5
						_-_ The full 3/5 heal is still available if the hero is below 25% health"""));

		changes.addButton(new ChangeButton(new Image(new SpinnerSprite()), Messages.get(Spinner.class, "name"),
				"""
						I'm pulling down the damage of _Cave Spinners_ slightly to address player frustration:

						_-_ Melee damage down to 10-20 from 10-25"""));

	}

	public static void add_v0_9_0_Changes(ArrayList<ChangeInfo> changeInfos) {

		ChangeInfo changes = new ChangeInfo("v0.9.0", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released October 5th, 2020
						_-_ 61 days after Shattered v0.8.2
						_-_ 173 days after Shattered v0.8.0

						v0.9.0 was the beginning of Shattered's second new gameplay system! The talent system was primarily designed to address consistent feedback that leveling up wasn't very satisfying. I wanted talents to deepen character customization and give the player a reason to feel excited about levelling up.

						I opted to split the talent system over multiple updates, rather than implement it all at once. This mean that v0.9.0 had an impressively short dev time of just two months, although it also meant that the talent system was pretty barebones to start.

						This update also included Shattered's first new challenge! The goal of hostile champions was to increase overall difficulty by adding new mechanics to the game, instead of removing them. This worked out very well, and led to a followup challenge addition just a couple of updates later."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.TALENT), "Hero Talents!",
				"""
						_A new gameplay system has been added!_

						As you play the game and level up, you now unlock points to spend on hero talents. These talents have a range of effects, from stat adjustments to triggered effects to full on abilities!

						Talents are split into tiers, and to start only the first tier is available, which covers levels 1 to 6. More talents will be added soon!

						Previously I would have spent many more months on v0.9.0 and released the entire system in one update, but I'm changing up my strategy and splitting these big updates into smaller parts."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), "Hostile Champions!",
				"""
						A new challenge has been added: _Hostile Champions!_

						Unlike most other challenges, this one focuses on amping up the difficulty of the dungeon, rather than removing tools from the player. Give it a try if you've unlocked challenges, and you might find some particularly nasty enemies in the dungeon!"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.BADGES), "Badge Visuals",
				"""
						The badges screen now shows which badges are locked, rather than just using a generic 'locked badge' visual.

						Badges now have different border colors based on their difficulty (bronze, silver, gold, platinum, diamond), and are ordered based on these colors."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 15, 12, 15), "Hero balance adjustments",
				"""
						The _Warrior, Mage, and Huntress_ are getting some balance tweaks to offset their new talents:

						The _Warrior and Mage_ no longer have innate on-eat effects, these are replaced by their food-based talents.

						The _Warrior's_ base max shielding has been reduced from 2 to 1, to compensate for his shielding talent.

						The _Mage_ no longer has an innate wand identification effect, this is replaced by his wand identification talent.

						The _Huntress'_ studded gloves have had their base damage reduced to 1-5 from 1-6, to compensate for her damage-dealing talent."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_OFF), "Existing Challenges",
				"""
						Some existing challenges have been tweaked to reduce the number of items that they remove from the game:

						_On Diet_ no longer restricts food, but instead causes all food to be 1/3 as effective at satiating hunger.

						_Faith Is My Armor_ no longer restricts the hero to cloth armor, but instead heavily reduces the blocking power of all armor above cloth.

						_Pharmacophobia_ no longer removes health potions, but instead makes them poisonous to the player."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Unidentified scrolls can now be used to make runestones! You won't know what stones you'll get until you brew the scroll, but the scroll will be retroactively identified.

						_-_ Reduced hero unlock requirements.

						_-_ Added HP numbers to the player's health bar.
						_-_ Tweaked some interface visuals to be more rounded.

						_-_ Spider webs are now flammable, and can be shot through by fireblast.
						_-_ The reclaim trap spell can no longer be dropped when a trap is stored in it. This prevents an exploit.
						_-_ Items gained from secret mazes are now known to be uncursed.""",

				"""
						I'm making some adjustments to sewers loot to give players a bit more control of what gear they get, and to reduce the chance of spawning high tier gear that the player may never get to use:
						_-_ Chance for regular gear drops in the sewers to be T4/T5 reduced by 50%.
						_-_ Players can now see what type of weapon/armor the sad ghost has before selecting it.

						_-_ Statues are now killed if a disarming trap triggers under them.
						_-_ Weak shields no longer override stronger ones.
						_-_ Long pressing item slots in the alchemy screen now shows the item's description.

						_-_ Updated translations and translator credits."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various visual errors
						_-_ Various rare crash bugs
						_-_ Various rare game freeze bugs
						_-_ Back button closing the game in hero select
						_-_ Issues with touch input on Android 11 when gestures are enabled
						_-_ Crystal mimics escaping when they are still visible
						_-_ Shadows buff being cancelled by enemies seen via mind vision
						_-_ Aqua blast occasionally not stunning
						_-_ Errors with turn spending when talisman is used
						_-_ Newborn elemental not dropping its quest item for overlevelled heroes
						_-_ Spinners shooting webs though walls
						_-_ Elastic enchantment closing doors when used with spirit bow
						_-_ Shopkeepers buying items worth 0 gold
						_-_ Duplicate artifacts in rare cases""",

				"""
						_-_ Custom names not applying to Mage's staff
						_-_ Ring of might not reducing max HP when degraded
						_-_ Rare bugs involving ripper demon leaping
						_-_ Hero unable to cleanse fire with chill when immune to it, and vice-versa
						_-_ DM-201's attacking while stunned
						_-_ Tengu's abilities being reset by saving/loading
						_-_ Various cases where game win badges would not appear
						_-_ Force cubes trigger traps before being placed to the floor
						_-_ Beacon of returning rarely teleporting the player into walls
						_-_ Player being forced to swap equipped misc items when they shouldn't in some cases
						_-_ Enemies rarely not appearing paralyzed when they are
						_-_ Great crab sometimes dropping 3 meat instead of 2
						_-_ Cleave being reset when a kill corrupts the enemy
						_-_ Sleeping VFX persisting in cases where it shouldn't"""));

		changes.addButton(new ChangeButton(new WandOfFrost(),
				"This is actually a bugfix, but I'm listing it separately for clarity. In v0.8.2 the _wand of frost_ is listed as losing 6.67% damage per turn of chill, to a max of -50%. This is not what was implemented however, and the wand instead lost 3.33% per turn to a max of -30%. This has now been corrected and the wand performs as listed in the 0.8.2 changelog."));

	}
}
