            package p000;

            import android.os.LocaleList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class g30 {
                /* JADX INFO: renamed from: a */
                public static String m3867a() {
/* 1 */             LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
/* 9 */             if (adjustedDefault.size() > 0) {
/* 16 */                return adjustedDefault.get(0).toLanguageTag();
                    }
/* 21 */            return null;
                }
            }
