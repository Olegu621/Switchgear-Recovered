            package p000;

            import com.google.android.gms.common.Feature;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oy2 extends UnsupportedOperationException {

                /* JADX INFO: renamed from: a */
                public final Feature f14923a;

                public oy2(Feature feature) {
/* 4 */             this.f14923a = feature;
                }

                @Override // java.lang.Throwable
                public final String getMessage() {
/* 9 */             return "Missing ".concat(String.valueOf(this.f14923a));
                }
            }
