            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.analytics.ktx.AnalyticsKt;
            import com.google.firebase.ktx.Firebase;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qi0 extends dg1 {
                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 9 */                 FirebaseAnalytics.ConsentStatus consentStatus = z ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED;
/* 46 */                AnalyticsKt.getAnalytics(Firebase.f5292a).setConsent(oc1.m7131e(new Pair(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus), new Pair(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus), new Pair(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus)));
/* 49 */                return true;
                    } catch (Exception e) {
/* 52 */                m3063f(e);
/* 55 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: b */
                public final boolean mo3059b(cg1 cg1Var) {
/* 1 */             return true;
                }
            }
