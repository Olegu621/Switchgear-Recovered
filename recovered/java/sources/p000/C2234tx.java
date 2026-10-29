            package p000;

            import android.os.Bundle;
            import androidx.activity.ComponentActivity;
            import androidx.fragment.app.AbstractC0111w;
            
            /* JADX INFO: renamed from: tx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C2234tx implements w62 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17297a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17298b;

                public /* synthetic */ C2234tx(Object obj, int i) {
/* 1 */             this.f17297a = i;
/* 3 */             this.f17298b = obj;
                }

                @Override // p000.w62
                /* JADX INFO: renamed from: a */
                public final Bundle mo671a() {
/* 1 */             int i = this.f17297a;
/* 3 */             Object obj = this.f17298b;
                    switch (i) {
                        case 0:
/* 24 */                    return ComponentActivity.m322b((ComponentActivity) obj);
                        case 1:
/* 17 */                    return ((AbstractC0111w) obj).m695W();
                        default:
/* 10 */                    return n62.m6895a((n62) obj);
                    }
                }
            }
