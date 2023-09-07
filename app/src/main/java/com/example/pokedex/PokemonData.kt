package com.example.pokedex

object PokemonData {
    private val pokemonNames = arrayOf(
        "Groudon",
        "Rayquaza",
        "Dialga",
        "Giratina",
        "Regigigas",
        "Palkia",
        "Arceus",
        "Golurk",
        "Zekrom",
        "Reshiram",
        "Kyurem",
        "Yveltal",
        "Xerneas",
        "Zygarde",
        "Lunala",
        "Buzzwole",
        "Necrozma",
        "Celesteela",
        "Melmetal",
        "Eternatus"
    )

    private val pokemonIndexes = arrayOf(
        "#383",
        "#384",
        "#483",
        "#487",
        "#486",
        "#484",
        "#493",
        "#623",
        "#644",
        "#643",
        "#646",
        "#717",
        "#716",
        "#718",
        "#792",
        "#794",
        "#800",
        "#797",
        "#809",
        "#890",
    )

    private val pokemonTypes = arrayOf(
        "Ground",
        "Dragon | Flying",
        "Steel | Dragon",
        "Ghost | Dragon",
        "Normal",
        "Water | Dragon",
        "Normal",
        "Ground | Ghost",
        "Dragon | Electric",
        "Dragon | Fire",
        "Dragon | Ice",
        "Dark | Flying",
        "Fairy",
        "Dragon | Ground",
        "Psychic | Ghost",
        "Bug | Fighting",
        "Psychic",
        "Steel | Flying",
        "Steel",
        "Poison | Dragon",
    )

    private val pokemonDescriptions = arrayOf(
        "Groudon is said to be the personification of the land itself. Legends tell of its many clashes against Kyogre, as each sought to gain the power of nature.",
        "Rayquaza is said to have lived for hundreds of millions of years. Legends remain of how it put to rest the clash between Kyogre and Groudon.",
        "It has the power to control time. It appears in Sinnoh-region myths as an ancient deity.",
        "This Pokémon is said to live in a world on the reverse side of ours, where common knowledge is distorted and strange.",
        "It is said to have made Pokémon that look like itself from a special ice mountain, rocks, and magma.",
        "It has the ability to distort space. It is described as a deity in Sinnoh-region mythology.",
        "According to the legends of Sinnoh, this Pokémon emerged from an egg and shaped all there is in this world.",
        "Artillery platforms built into the walls of ancient castles served as perches from which Golurk could fire energy beams.",
        "This legendary Pokémon can scorch the world with lightning. It assists those who want to build an ideal world.",
        "This legendary Pokémon can scorch the world with fire. It helps those who want to build a world of truth.",
        "This legendary ice Pokémon waits for a hero to fill in the missing parts of its body with truth or ideals.",
        "When this legendary Pokémon’s wings and tail feathers spread wide and glow red, it absorbs the life force of living creatures.",
        "Legends say it can share eternal life. It slept for a thousand years in the form of a tree before its revival.",
        "This is Zygarde’s form when about half of its pieces have been assembled. It plays the role of monitoring the ecosystem.",
        "Records of it exist in writings from long, long ago, where it was known by the name “the beast that calls the moon.”",
        "Although it’s alien to this world and a danger here, it’s apparently a common organism in the world where it normally lives.",
        "It looks somehow pained as it rages around in search of light, which serves as its energy. It’s apparently from another world.",
        "One of the dangerous UBs, high energy readings can be detected coming from both of its huge arms.",
        "At the end of its life-span, Melmetal will rust and fall apart. The small shards left behind will eventually be reborn as Meltan.",
        "The core on its chest absorbs energy emanating from the lands of the Galar region. This energy is what allows Eternatus to stay active."
    )

    private val pokemonWeaknesses = arrayOf(
        "Water | Grass | Ice",
        "Fairy | Dragon | Ice | Rock",
        "Fighting | Ground",
        "Ghost | Dark | Fairy | Ice | Dragon",
        "Fighting",
        "Fairy | Dragon",
        "Fighting",
        "Water | Ghost | Grass | Dark | Ice",
        "Fairy | Dragon | Ice | Ground",
        "Ground | Rock | Dragon",
        "Steel | Fairy | Rock | Fighting | Dragon",
        "Fairy | Electric | Ice | Rock",
        "Steel | Poison",
        "Fairy | Ice | Dragon",
        "Ghost | Dark",
        "Fire | Psychic | Flying | Fairy",
        "Ghost | Dark | Bug",
        "Fire | Electric",
        "Fire | Fighting | Ground",
        "Psychic | Ground | Ice | Dragon"
    )

    private val pokemonHeights = arrayOf(
        "11' 06",
        "23' 00",
        "17' 09",
        "14' 09",
        "12' 02",
        "13' 09",
        "10' 06",
        "9' 02",
        "9' 06",
        "10' 06",
        "9' 10",
        "19' 00",
        "9' 10",
        "16' 05",
        "13' 01",
        "7' 10",
        "7' 10",
        "30' 02",
        "8' 02",
        "65' 07"
    )

    private val pokemonWeights = arrayOf(
        "2094.4 lbs",
        "455.3 lbs",
        "1505.8 lbs",
        "1653.5 lbs",
        "925.9 lbs",
        "740.8 lbs",
        "705.5 lbs",
        "727.5 lbs",
        "760.6 lbs",
        "727.5 lbs",
        "716.5 lbs",
        "447.5 lbs",
        "474.0 lbs",
        "672.4 lbs",
        "264.6 lbs",
        "735.5 lbs",
        "507.1 lbs",
        "2204.4 lbs",
        "1763.7 lbs",
        "2094.4 lbs"
    )

    private val pokemonCategories = arrayOf(
        "Continent",
        "Sky High",
        "Temporal",
        "Renegade",
        "Colossal",
        "Spatial",
        "Alpha",
        "Automaton",
        "Deep Black",
        "Vast White",
        "Boundary",
        "Destruction",
        "Life",
        "Order",
        "Moone",
        "Swollen",
        "Prism",
        "Launch",
        "Hex Nut",
        "Gigantic"
    )

    private val pokemonAbilities = arrayOf(
        "Drought",
        "Air Lock",
        "Pressure",
        "Pressure",
        "Slow Start",
        "Pressure",
        "Multitype",
        "Iron Fist|Klutz",
        "Teravolt",
        "Turboblaze",
        "Pressure",
        "Dark Aura",
        "Fairy Aura",
        "Aura Break",
        "Shadow Shield",
        "Beast Boost",
        "Prism Armor",
        "Beast Boost",
        "Iron Fist",
        "Pressure",
    )

    private val pokemonPhotos = arrayOf(
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/383.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/384.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/483.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/487.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/486.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/484.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/493.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/623.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/644.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/643.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/646.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/717.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/716.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/718.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/792.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/794.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/800.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/797.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/809.png",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/890.png"
    )

    val listData: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for(index in pokemonNames.indices){
                val pokemon = Pokemon()
                pokemon.name = pokemonNames[index]
                pokemon.index = pokemonIndexes[index]
                pokemon.type = pokemonTypes[index]
                pokemon.description = pokemonDescriptions[index]
                pokemon.weakness = pokemonWeaknesses[index]
                pokemon.height = pokemonHeights[index]
                pokemon.weight = pokemonWeights[index]
                pokemon.category = pokemonCategories[index]
                pokemon.ability = pokemonAbilities[index]
                pokemon.photo = pokemonPhotos[index]
                list.add(pokemon)
            }
            return list
        }

}