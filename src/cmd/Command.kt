package cmd

import directory.Directory

abstract class Command {
    abstract fun run(directory: Directory, name: String)
}