            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.AbstractC0322a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ad3 {

                /* JADX INFO: renamed from: a */
                public Boolean f190a;

                /* JADX INFO: renamed from: b */
                public boolean f191b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC0322a f192c;

                /* JADX INFO: renamed from: d */
                public final int f193d;

                /* JADX INFO: renamed from: e */
                public final Bundle f194e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ AbstractC0322a f195f;

                public ad3(AbstractC0322a abstractC0322a, int i, Bundle bundle) {
/* 4 */             this.f195f = abstractC0322a;
/* 6 */             Boolean bool = Boolean.TRUE;
/* 8 */             this.f192c = abstractC0322a;
/* 10 */            this.f190a = bool;
/* 13 */            this.f191b = false;
/* 15 */            this.f193d = i;
/* 17 */            this.f194e = bundle;
                }

                /* JADX INFO: renamed from: a */
                public abstract boolean mo205a();

                /* JADX INFO: renamed from: b */
                public abstract void mo206b(ConnectionResult connectionResult);
            }
