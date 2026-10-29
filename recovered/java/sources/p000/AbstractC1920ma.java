            package p000;

            import android.os.PowerManager;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: ma */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1920ma {
                /* JADX INFO: renamed from: a */
                public static boolean m6631a(PowerManager powerManager) {
/* 1 */             return powerManager.isPowerSaveMode();
                }

                /* JADX INFO: renamed from: b */
                public static String m6632b(Locale locale) {
/* 1 */             return locale.toLanguageTag();
                }
            }
