            package p000;

            import com.google.android.gms.common.api.Status;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: a7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0009a7 extends C1020i9 {
                public C0009a7(int i) {
/* 25 */            super(new Status(i, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i)), null, null));
/* 28 */            if (i != 0) {
/* 30 */                return;
                    }
/* 33 */            C1951n4.m6859j("errorCode should not be 0.");
/* 36 */            throw null;
                }

                public final int getErrorCode() {
/* 1 */             return super.getStatusCode();
                }
            }
