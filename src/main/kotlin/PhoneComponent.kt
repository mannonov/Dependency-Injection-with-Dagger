import dagger.Component
import javax.inject.Singleton

@Component(modules = [PhoneModule::class])
@Singleton
interface PhoneComponent {

    fun createPhone() : Phone

}