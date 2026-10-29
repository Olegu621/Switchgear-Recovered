            package p000;

            import com.google.firebase.components.ComponentRegistrar;
            import com.google.firebase.installations.FirebaseInstallations;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: renamed from: ey */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0897ey implements iz1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7917a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f7918b;

                public /* synthetic */ C0897ey(Object obj, int i) {
/* 1 */             this.f7917a = i;
/* 3 */             this.f7918b = obj;
                }

                @Override // p000.iz1
                public final Object get() {
/* 1 */             int i = this.f7917a;
/* 3 */             Object obj = this.f7918b;
                    switch (i) {
                        case 0:
/* 18 */                    String str = (String) obj;
                            try {
/* 29 */                        Class<?> cls = Class.forName(str);
/* 39 */                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
/* 49 */                            return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
/* 81 */                        throw new rz0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused) {
/* 141 */                       AbstractC1245n0.m4889q("ComponentDiscovery", "Class " + str + " is not an found.");
/* 28 */                        return null;
                            } catch (IllegalAccessException e) {
/* 121 */                       throw new rz0(fm0.m3784j("Could not instantiate ", str, "."), e);
                            } catch (InstantiationException e2) {
/* 111 */                       throw new rz0(fm0.m3784j("Could not instantiate ", str, "."), e2);
                            } catch (NoSuchMethodException e3) {
/* 101 */                       throw new rz0(AbstractC0886en.m3507k("Could not instantiate ", str), e3);
                            } catch (InvocationTargetException e4) {
/* 91 */                        throw new rz0(AbstractC0886en.m3507k("Could not instantiate ", str), e4);
                            }
                        case 1:
/* 15 */                    return (ComponentRegistrar) obj;
                        default:
/* 1 */                     return FirebaseInstallations.lambda$new$0((vi0) obj);
                    }
                }
            }
