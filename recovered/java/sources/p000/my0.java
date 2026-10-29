            package p000;

            import com.google.android.gms.common.api.Status;
            import java.util.HashMap;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class my0 extends C1020i9 {
                /* JADX WARN: Code duplicated, block: B:8:0x0034  */
                /* JADX WARN: Illegal instructions before constructor call */
                public my0(int i) {
                    String strM7489l;
/* 3 */             Locale locale = Locale.getDefault();
/* 7 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            HashMap map = yc3.f19579a;
/* 13 */            Integer numValueOf2 = Integer.valueOf(i);
/* 21 */            if (map.containsKey(numValueOf2)) {
/* 23 */                HashMap map2 = yc3.f19580b;
/* 29 */                if (map2.containsKey(numValueOf2)) {
/* 48 */                    strM7489l = pm2.m7489l((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf2), ")");
                        } else {
/* 53 */                    strM7489l = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    } else {
/* 53 */                strM7489l = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 69 */            super(new Status(i, String.format(locale, "Install Error(%d): %s", numValueOf, strM7489l), null, null));
/* 72 */            if (i != 0) {
/* 74 */                return;
                    }
/* 77 */            C1951n4.m6859j("errorCode should not be 0.");
/* 80 */            throw null;
                }
            }
