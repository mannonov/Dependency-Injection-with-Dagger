// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerPhoneComponent implements PhoneComponent {
  private Provider<Camera> provideCameraProvider;

  private Provider<Display> provideDisplayProvider;

  private Provider<Brand> provideBrandProvider;

  private DaggerPhoneComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static PhoneComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideCameraProvider =
        DoubleCheck.provider(PhoneModule_ProvideCameraFactory.create(builder.phoneModule));
    this.provideDisplayProvider =
        DoubleCheck.provider(PhoneModule_ProvideDisplayFactory.create(builder.phoneModule));
    this.provideBrandProvider =
        DoubleCheck.provider(PhoneModule_ProvideBrandFactory.create(builder.phoneModule));
  }

  @Override
  public Phone createPhone() {
    return new Phone(
        provideCameraProvider.get(), provideDisplayProvider.get(), provideBrandProvider.get());
  }

  public static final class Builder {
    private PhoneModule phoneModule;

    private Builder() {}

    public PhoneComponent build() {
      if (phoneModule == null) {
        this.phoneModule = new PhoneModule();
      }
      return new DaggerPhoneComponent(this);
    }

    public Builder phoneModule(PhoneModule phoneModule) {
      this.phoneModule = Preconditions.checkNotNull(phoneModule);
      return this;
    }
  }
}