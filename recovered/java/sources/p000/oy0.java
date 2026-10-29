            package p000;

            import java.util.Date;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oy0 extends b92 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f14914b = 0;

                public oy0(boolean z, String str, long j, long j2) {
                    String strM6699o;
/* 1 */             str.getClass();
/* 8 */             Pair pair = new Pair("installReferrer", str);
/* 15 */            String strM6699o2 = null;
/* 18 */            if (j > 0) {
/* 21 */                int i = mn0.f13881p;
/* 28 */                strM6699o = mn0.m6699o(new Date(j * 1000));
                    } else {
/* 33 */                strM6699o = null;
                    }
/* 38 */            Pair pair2 = new Pair("referrerClickTimestamp", strM6699o);
/* 43 */            if (j2 > 0) {
/* 46 */                int i2 = mn0.f13881p;
/* 53 */                strM6699o2 = mn0.m6699o(new Date(j2 * 1000));
                    }
/* 85 */            super("iglu:com.android.installreferrer.api/referrer_details/jsonschema/1-0-0", oc1.m7131e(pair, pair2, new Pair("installBeginTimestamp", strM6699o2), new Pair("googlePlayInstantParam", Boolean.valueOf(z))));
                }
            }
