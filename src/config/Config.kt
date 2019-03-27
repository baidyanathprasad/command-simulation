package config

class Config {
    private val availableCommands = setOf("ls", "cd", "pwd", "mkdir", "rm", "session")

    fun isValidCommand(command: String) = command in availableCommands
}