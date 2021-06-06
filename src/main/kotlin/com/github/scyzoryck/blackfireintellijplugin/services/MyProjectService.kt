package com.github.scyzoryck.blackfireintellijplugin.services

import com.github.scyzoryck.blackfireintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
