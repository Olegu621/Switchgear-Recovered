            package p000;

            import android.content.Context;
            import com.unity3d.ads.metadata.MetaData;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qx2 extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f15794c;

                /* JADX INFO: renamed from: d */
                public final i03 f15795d;

                /* JADX INFO: renamed from: e */
                public final Context f15796e;

                public qx2(i03 i03Var, Context context) {
/* 3 */             super("Unity Ads", i03Var);
/* 6 */             this.f15794c = "Unity Ads";
/* 8 */             this.f15795d = i03Var;
/* 10 */            this.f15796e = context;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("com.unity3d.ads.metadata.MetaData");
/* 13 */                MetaData metaData = new MetaData(this.f15796e);
/* 31 */                metaData.set(g13Var == g13.f8433b ? "privacy.consent" : "gdpr.consent", Boolean.valueOf(z));
/* 34 */                metaData.commit();
/* 37 */                return true;
                    } catch (Exception e) {
/* 39 */                m3063f(e);
/* 42 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f15795d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f15794c;
                }
            }
