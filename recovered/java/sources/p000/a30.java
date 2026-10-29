            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a30 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f67a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Uri f68b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f69c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Bundle f70d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ d30 f71e;

                public a30(d30 d30Var, int i, Uri uri, boolean z, Bundle bundle) {
/* 4 */             this.f71e = d30Var;
/* 6 */             this.f67a = i;
/* 8 */             this.f68b = uri;
/* 10 */            this.f69c = z;
/* 12 */            this.f70d = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 13 */            this.f71e.f6966b.onRelationshipValidationResult(this.f67a, this.f68b, this.f69c, this.f70d);
                }
            }
