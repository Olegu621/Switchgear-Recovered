            package p000;

            import com.google.common.flogger.backend.google.GooglePlatform;
            import com.google.common.flogger.backend.system.DefaultPlatform;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class nj3 {
                /* JADX INFO: renamed from: a */
                public static lj3 m6993a() {
                    try {
                        try {
                            try {
/* 12 */                        return (lj3) rj3.class.getDeclaredConstructor(null).newInstance(null);
                            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
/* 25 */                        return (lj3) GooglePlatform.class.getDeclaredConstructor(null).newInstance(null);
                            }
                        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
/* 38 */                    return (lj3) DefaultPlatform.class.getDeclaredConstructor(null).newInstance(null);
                        }
                    } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
/* 1 */                 return null;
                    }
                }
            }
