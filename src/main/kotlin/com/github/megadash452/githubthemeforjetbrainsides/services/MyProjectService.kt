package com.github.megadash452.githubthemeforjetbrainsides.services

import com.intellij.openapi.project.Project
import com.github.megadash452.githubthemeforjetbrainsides.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
