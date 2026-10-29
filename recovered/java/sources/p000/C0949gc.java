            package p000;

            import android.content.Context;
            import com.applovin.sdk.AppLovinPrivacySettings;
            
            /* JADX INFO: renamed from: gc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0949gc extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f8533c;

                /* JADX INFO: renamed from: d */
                public final i03 f8534d;

                /* JADX INFO: renamed from: e */
                public final Context f8535e;

                public C0949gc(i03 i03Var, Context context) {
/* 3 */             super("App Lovin", i03Var);
/* 6 */             this.f8533c = "App Lovin";
/* 8 */             this.f8534d = i03Var;
/* 10 */            this.f8535e = context;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("com.applovin.sdk.AppLovinPrivacySettings");
/* 9 */                 g13 g13Var2 = g13.f8433b;
/* 12 */                Context context = this.f8535e;
/* 14 */                if (g13Var == g13Var2) {
/* 17 */                    AppLovinPrivacySettings.setDoNotSell(!z, context);
                        } else {
/* 23 */                    AppLovinPrivacySettings.setHasUserConsent(z, context);
                        }
/* 11 */                return true;
                    } catch (Exception e) {
/* 27 */                m3063f(e);
/* 30 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f8534d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f8533c;
                }
            }
