            package p000;

            import androidx.fragment.app.C0112x;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class wm0 implements s33 {

                /* JADX INFO: renamed from: b */
                public static wm0 f18685b;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18686a;

                public /* synthetic */ wm0(int i) {
/* 1 */             this.f18686a = i;
                }

                @Override // p000.s33
                /* JADX INFO: renamed from: a */
                public q33 mo94a(Class cls) throws InvocationTargetException {
                    switch (this.f18686a) {
                        case 0:
/* 51 */                    return new C0112x(true);
                        case 1:
/* 44 */                    return new d91();
                        default:
                            try {
/* 13 */                        Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
/* 17 */                        objNewInstance.getClass();
/* 20 */                        return (q33) objNewInstance;
                            } catch (IllegalAccessException e) {
/* 30 */                        f42.m3658n("Cannot create an instance of ", cls, e);
/* 8 */                         return null;
                            } catch (InstantiationException e2) {
/* 34 */                        f42.m3658n("Cannot create an instance of ", cls, e2);
/* 8 */                         return null;
                            } catch (NoSuchMethodException e3) {
/* 38 */                        f42.m3658n("Cannot create an instance of ", cls, e3);
/* 8 */                         return null;
                            }
                    }
                }
            }
