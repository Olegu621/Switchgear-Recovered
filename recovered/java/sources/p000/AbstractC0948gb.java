            package p000;

            import android.content.res.Resources;
            import android.widget.ThemedSpinnerAdapter;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: gb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0948gb {
                /* JADX INFO: renamed from: a */
                public static void m3902a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
/* 9 */             if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
/* 14 */                return;
                    }
/* 11 */            themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
