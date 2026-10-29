            package p000;

            import com.google.android.gms.common.api.Scope;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: renamed from: c9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0208c9 {
                public static final int API_PRIORITY_GAMES = 1;
                public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
                public static final int API_PRIORITY_PLUS = 2;

                public List<Scope> getImpliedScopes(Object obj) {
/* 1 */             return Collections.EMPTY_LIST;
                }

                public int getPriority() {
/* 1 */             return API_PRIORITY_OTHER;
                }
            }
