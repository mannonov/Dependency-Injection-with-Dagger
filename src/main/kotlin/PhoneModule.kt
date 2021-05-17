import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PhoneModule {

    @Singleton
    @Provides
    fun provideBrand(): Brand = SamsungBrand()

    @Singleton
    @Provides
    fun provideCamera(): Camera = TripleCamera()

    @Singleton
    @Provides
    fun provideDisplay(): Display = SuperAmoledDisplay()

}