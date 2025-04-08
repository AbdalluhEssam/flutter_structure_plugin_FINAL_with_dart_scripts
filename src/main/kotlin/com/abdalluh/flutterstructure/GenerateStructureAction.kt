package com.abdalluh.flutterstructure

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import java.io.File

class GenerateStructureAction : AnAction("Generate Flutter Structure") {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return

        val choice = Messages.showEditableChooseDialog(
            "Choose generation type",
            "Flutter Generator",
            null,
            arrayOf("Generate Full Project", "Generate Feature"),
            "Generate Full Project",
            null
        ) ?: return

        val command: List<String>

        if (choice == "Generate Feature") {
            val featureName = Messages.showInputDialog(
                project,
                "Enter feature name:",
                "Feature Name",
                Messages.getQuestionIcon()
            ) ?: return

            command = listOf("dart", "run", "tool/generate_feature.dart", featureName)
        } else {
            command = listOf("dart", "run", "tool/generate_project.dart")
        }

        runCommand(project, command)
    }

    private fun runCommand(project: Project, command: List<String>) {
        try {
            val process = ProcessBuilder(command)
                .directory(File(project.basePath ?: "."))
                .redirectErrorStream(true)
                .start()

            // optional: show message to user
            Messages.showInfoMessage(
                project,
                "Command started:\n${command.joinToString(" ")}\n\nCheck terminal for output.",
                "Flutter Structure Generator"
            )

        } catch (e: Exception) {
            Messages.showErrorDialog(
                project,
                "Error running Dart script: ${e.message}",
                "Execution Error"
            )
        }
    }
}