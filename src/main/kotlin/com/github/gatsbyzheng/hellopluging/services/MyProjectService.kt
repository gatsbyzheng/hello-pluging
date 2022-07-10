package com.github.gatsbyzheng.hellopluging.services

import com.intellij.openapi.project.Project
import com.github.gatsbyzheng.hellopluging.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
