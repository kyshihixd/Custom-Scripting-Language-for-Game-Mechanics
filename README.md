# 🕹️ Custom Scripting Language for Game Mechanics

A domain-specific language (DSL) and runtime engine for scripting game mechanics in a MOBA-style, turn-based combat system inspired by Pokémon and League of Legends.

## 🎯 Features

- Define custom Pokémon and move attributes
- Use intuitive DSL syntax to script:
  - Conditional logic (`if`, `else`, `&&`, `||`)
  - Arithmetic expressions and attribute updates
  - Custom triggers for moves and abilities
  - Randomized effects (e.g. `random` for crits or chance-based actions)
- Evaluate and update game state dynamically
- Query real-time entity states with `status`
- Built-in GameBoy-style GUI using Tkinter

## 📄 Example Script

```plaintext
pokemon Pikachu {
    hp: 100;
    power: 50;
    type: "electric";
}

move Thunderbolt {
    power: 40;
    debuff: "paralyze";
}

trigger Thunderbolt(Pikachu, Charmander) {
    if (Charmander.hp > 50) {
        Charmander.hp = Charmander.hp - Pikachu.power;
    } else {
        Charmander.paralyzed = true;
    }
}

Pikachu uses Thunderbolt on Charmander;
status Charmander;

```

# 🛠️ Tech Stack
Language Tools: ANTLR (Parser, Lexer)

Backend: Python (OOP, AST-based runtime)

Frontend: Tkinter GUI

# 🚀 Getting Started
Install dependencies (ANTLR, Python 3.x).

1. Generate the lexer and parser:
java -jar antlr-4.x-complete.jar -Dlanguage=Python3 POKE.g4 -o CompiledFiles

2. Run the UI:
python gui.py
