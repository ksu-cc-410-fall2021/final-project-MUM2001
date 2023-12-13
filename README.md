RPG: Character Creator and Battle Simulator 

This project is designed as an implementation of a simplified custom role-playing system.
(For specifics on the role-playing system see below.)

It allows users to interact with a graphical user interface to select the traits of and choose
the name of their character.(For specifics see below.)

Once done with creating their character, the user can choose to engage in a simulated battle.
In this battle one of three preset enemies are selected to by the opponent, at random.
The user has the choice to attack or defend, rolling dice for a chance to do damage against
their opponent, or recovering their stamina and some health.
(For specifics on the battle mechanics see below.)

After either, or both combatants are eliminated a pop up informs the user of the result
and reloads the character creation menu, allowing the user to modify their character and
fight again or simply close the application.

ROLE-PLAYING SYSTEM:

This simplified system uses three selectable attributes of the character to define their
base stats.

BASE STATS:
The base stats are health, stamina, hit chance, and defense.

        HEALTH: This represents the amount of damage that can be taken before the player dies.
                STARTING VALUE(BEFORE MODIFIERS): 100

        STAMINA: This represents how energy the player has. Determines if player can attack and their chance to hit.
                STARTING VALUE(BEFORE MODIFIERS): 100

        HIT CHANCE: This represents player's chance to land an attack. In conjunction with stamina, it determines if a player attack lands. 
                STARTING VALUE(BEFORE MODIFIERS): 50

        DEFENSE: This represents player's chance to avoid an attack. In conjunction with stamina, it determines if an opponent's attack lands. 
                STARTING VALUE(BEFORE MODIFIERS): 50

SELECTABLE ATTRIBUTES:
The selectable attributes are character class, race, and talent.

CHARACTER CLASSES:

        MAGE:A class good at landing hits but physically weak and easily exhausted.
            MODIFIERS: (HEALTH -10) (STAMINA -10) (Hit Chance +20) (Defense +0)

        WARRIOR: A physically strong class, but it's wild nature leaves the player easily exhausted and with poor accuracy.
            MODIFIERS: (HEALTH +10) (STAMINA -10) (Hit Chance -10) (Defense +10)

        ROGUE: A vulnerable and physically week class, but it compensates with great endurance and precision.
            MODIFIERS: (HEALTH -10) (STAMINA +10) (Hit Chance +10) (Defense -10)


RACES:

        Human: The most adaptable and versatile, they have no major strengths compared to their peers but also no weaknesses.
            MODIFIERS: (HEALTH +0) (STAMINA +0) (Hit Chance +0) (Defense +0)

        Elf: Physically fragile but their featherweight build and accuracy compensate for this deficiency.
            MODIFIERS: (HEALTH -20) (STAMINA +20) (Hit Chance +10) (Defense -10)

        Dwarf: The sturdiest built and all around toughest group around, but their short height and stocky build has downsides.
            MODIFIERS: (HEALTH +20) (STAMINA -20) (Hit Chance -10) (Defense +10)

Talents:

        LEFT HANDER: With the weapon held in the left hand attacks can more easily sneak past an opponents shield.
            MODIFIERS: (Hit Chance + 10) 

        STOCKY: Being built tough is helpful but being this large means a giant target not to mention making precise, careful difficult.
            MODIFIERS: (HEALTH +10) (Defense -10)

        TALL: Long arms and legs make it easier to safely land hits on an opponent and quicker to move away from danger.
            MODIFIERS: (Hit Chance +5) (Defense +5)

        FAST TWITCH: Lightning quick movement makes it much easier to land a strike but such exertion is tiring.
            MODIFIERS: (Hit Chance +20) (Stamina -20)
                
        MARATHON RUNNER: A consistent sustainable pace can let you fight for hours, but it also makes your strikes more predictable.. .
            MODIFIERS: (Hit Chance -10) (Stamina +10)

BATTLE SYSTEM:

Upon initiating the fight a random enemy is selected from the three listed below:

        Name:        Morrigan             Zevran                Oghren
        Race:        Human                Elf                   Dwarf
        Class:       Mage                 Rogue                 Warrior
        Talent:      Tall                 Fast Twitch           Stocky
        Health:      90                   70                    140
        Stamina:     90                   110                   70
        Hit Chance:  75                   90                    30
        Defense:     55                   30                    60

Once the opponent is chosen the battle can begin.
The player has the choice to attack or defend each turn by clicking the corresponding button, after which the computer will
automatically respond in kind.

Details for each action and the computer's response are listed below.

Attack:

If the player has stamina remaining they will roll a D20 die to see fit their attack lands.

The calculation to see if an attack to lands is as follows.

First, the attacker's attack roll is calculated.

        D20 roll result + attacker hit chance stat + attacker stamina stat = attack roll

This result is then weighted against the opponents defense roll:

        D20 roll result + opponent's defense stat + opponent's stamina stat = defense roll

If the attack roll is greater than the defense roll, 20 damage is subtracted from the opponents health.

If not, the attack misses.



On the other hand, if the player has exhausted all their stamina, and still tries to attack, they will be forced to wait out the
turn, reseting their stamina to max but missing out on a chance to attack or heal.

Defend:

If the player chooses to defend, they will take a turn to rest, reseting their stamina to max and healing 5 health.
Note, no dice rolls are required for this action.


Computer Response:

Regardless of the players actions, the computer will make an automatic response.
It will trigger an attack of their own if they have stamina left or defend, rest, if they have exhausted their stamina.
The calculations for these actions are the same as those initiated by the player, but with the roles reversed. 



End of the Battle:

If at any point one or both of the combatants's health reaches zero, the fight will end and a message will be displayed,
to inform the user of the result, before loading the character creation screen once more, to allow the player to modify
their character if they wish before initiating a battle once more.





USER'S GUIDE:

Character Creation:

Once the application is loaded, you will be automatically loaded into a character creation screen.
Clicking the buttons on this screen will set your character's corresponding attribute to that listed on the button.
To give your character an name, click on and type it into the text field, replacing the text already inside and hit enter.

As you make changes in this screen you should see the character panel on the right side react in real time, listing the
up to date information on the character.

Once you are satisfied with your character you can click the "Fight" button on the character panel, on the right side of the
screen to enter into a battle.

Note, if your character has not had all their attributes set you will see an error message and be prompted to return to 
the character creator and finish your character first. This can be done by clicking the "Create" button on the character panel
or the large "Reload Creation Panel" button in the center of the screen.


Battle:



external library used: https://github.com/alexv-anderson/WildPi-Dice