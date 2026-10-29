            package p000;

            import android.content.Context;
            import com.chartboost.sdk.Chartboost;
            import com.chartboost.sdk.privacy.model.CCPA;
            import com.chartboost.sdk.privacy.model.GDPR;
            import com.chartboost.sdk.privacy.model.LGPD;
            
            /* JADX INFO: renamed from: ut */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2267ut extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f17714c;

                /* JADX INFO: renamed from: d */
                public final i03 f17715d;

                /* JADX INFO: renamed from: e */
                public final Context f17716e;

                public C2267ut(i03 i03Var, Context context) {
/* 3 */             super("Chartboost", i03Var);
/* 6 */             this.f17714c = "Chartboost";
/* 8 */             this.f17715d = i03Var;
/* 10 */            this.f17716e = context;
                }

                /* JADX INFO: renamed from: g */
                public static void m9135g(Context context, boolean z) {
/* 15 */            Chartboost.addDataUseConsent(context, new CCPA(z ? CCPA.CCPA_CONSENT.OPT_IN_SALE : CCPA.CCPA_CONSENT.OPT_OUT_SALE));
                }

                /* JADX INFO: renamed from: h */
                public static void m9136h(Context context, boolean z) {
/* 15 */            Chartboost.addDataUseConsent(context, new GDPR(z ? GDPR.GDPR_CONSENT.BEHAVIORAL : GDPR.GDPR_CONSENT.NON_BEHAVIORAL));
                }

                /* JADX INFO: renamed from: i */
                public static void m9137i(Context context, boolean z) {
/* 8 */             Chartboost.addDataUseConsent(context, new LGPD(z));
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("com.chartboost.sdk.Chartboost");
/* 9 */                 Context context = this.f17716e;
/* 11 */                context.getClass();
/* 16 */                if (g13Var == g13.f8433b) {
/* 18 */                    m9135g(context, z);
/* 30 */                    return true;
                        }
/* 24 */                m9136h(context, z);
/* 27 */                m9137i(context, z);
/* 30 */                return true;
                    } catch (Exception e) {
/* 32 */                m3063f(e);
/* 35 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f17715d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f17714c;
                }
            }
