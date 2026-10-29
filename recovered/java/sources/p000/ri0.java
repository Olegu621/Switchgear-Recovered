            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.analytics.ktx.AnalyticsKt;
            import com.google.firebase.ktx.Firebase;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ri0 extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f16077c;

                /* JADX INFO: renamed from: d */
                public final int f16078d;

                /* JADX INFO: renamed from: e */
                public final i03 f16079e;

                public ri0(i03 i03Var) {
/* 3 */             super("Firebase", i03Var);
/* 6 */             this.f16077c = "Firebase";
/* 10 */            this.f16078d = 755;
/* 12 */            this.f16079e = i03Var;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 FirebaseAnalytics analytics = AnalyticsKt.getAnalytics(Firebase.f5292a);
/* 28 */                analytics.setConsent(nc1.m6963d(new Pair(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, z ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED)));
/* 31 */                analytics.setAnalyticsCollectionEnabled(z);
/* 34 */                return true;
                    } catch (Exception e) {
/* 37 */                m3063f(e);
/* 40 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: b */
                public final boolean mo3059b(cg1 cg1Var) {
                    try {
/* 1 */                 Firebase firebase = Firebase.f5292a;
/* 3 */                 FirebaseAnalytics analytics = AnalyticsKt.getAnalytics(firebase);
/* 7 */                 FirebaseAnalytics.ConsentType consentType = FirebaseAnalytics.ConsentType.AD_STORAGE;
/* 9 */                 boolean z = cg1Var.f2891c;
/* 11 */                boolean z2 = cg1Var.f2890b;
/* 79 */                analytics.setConsent(oc1.m7131e(new Pair(consentType, z ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED), new Pair(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, cg1Var.f2893e ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED), new Pair(FirebaseAnalytics.ConsentType.AD_USER_DATA, cg1Var.f2892d ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED), new Pair(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, z2 ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED)));
/* 86 */                AnalyticsKt.getAnalytics(firebase).setAnalyticsCollectionEnabled(z2);
/* 89 */                return true;
                    } catch (Exception e) {
/* 92 */                m3063f(e);
/* 95 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f16079e;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f16077c;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: e */
                public final Integer mo3062e() {
/* 3 */             return Integer.valueOf(this.f16078d);
                }
            }
