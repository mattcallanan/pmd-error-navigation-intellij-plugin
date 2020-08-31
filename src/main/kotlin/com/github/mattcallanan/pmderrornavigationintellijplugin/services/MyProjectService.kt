package com.github.mattcallanan.pmderrornavigationintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.mattcallanan.pmderrornavigationintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
