            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g81 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public int f8514b;

                /* JADX INFO: renamed from: c */
                public Integer f8515c;

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 27 */            return oc1.m7131e(new Pair(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f8514b)), new Pair("items_count", this.f8515c));
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0";
                }
            }
