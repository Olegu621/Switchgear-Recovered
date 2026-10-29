            package p000;

            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.lang.reflect.InvocationTargetException;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class xd2 {
                /* JADX INFO: renamed from: a */
                public static int m9751a(SidecarDeviceState sidecarDeviceState) {
/* 1 */             sidecarDeviceState.getClass();
                    try {
                        try {
/* 4 */                     return sidecarDeviceState.posture;
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 30 */                    return 0;
                        }
                    } catch (NoSuchFieldError unused2) {
/* 16 */                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
/* 20 */                objInvoke.getClass();
/* 25 */                return ((Integer) objInvoke).intValue();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static int m9752b(SidecarDeviceState sidecarDeviceState) {
/* 1 */             sidecarDeviceState.getClass();
/* 4 */             int iM9751a = m9751a(sidecarDeviceState);
/* 8 */             if (iM9751a < 0 || iM9751a > 4) {
/* 15 */                return 0;
                    }
/* 14 */            return iM9751a;
                }

                /* JADX INFO: renamed from: c */
                public static List m9753c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
/* 1 */             sidecarWindowLayoutInfo.getClass();
                    try {
                        try {
/* 4 */                     List list = sidecarWindowLayoutInfo.displayFeatures;
                            return list == null ? nd0.f14189a : list;
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 31 */                    return nd0.f14189a;
                        }
                    } catch (NoSuchFieldError unused2) {
/* 21 */                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
/* 25 */                objInvoke.getClass();
/* 28 */                return (List) objInvoke;
                    }
/* 31 */            return nd0.f14189a;
                }

                /* JADX INFO: renamed from: d */
                public static void m9754d(SidecarDeviceState sidecarDeviceState, int i) {
                    try {
                        try {
/* 1 */                     sidecarDeviceState.posture = i;
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    } catch (NoSuchFieldError unused2) {
/* 26 */                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                    }
                }
            }
