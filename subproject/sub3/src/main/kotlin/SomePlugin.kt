import org.gradle.api.Plugin
import org.gradle.api.Project

class SomePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configurations.all {
                this.resolutionStrategy.dependencySubstitution {

                }
            }
        }
    }
}