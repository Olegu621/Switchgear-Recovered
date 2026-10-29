            package p000;

            import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
            import com.google.firebase.ktx.Firebase;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e20 extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f7483c;

                /* JADX INFO: renamed from: d */
                public final i03 f7484d;

                public e20(i03 i03Var) {
/* 3 */             super("Crashlytics", i03Var);
/* 6 */             this.f7483c = "Crashlytics";
/* 8 */             this.f7484d = i03Var;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("com.google.firebase.crashlytics.FirebaseCrashlytics");
/* 15 */                FirebaseCrashlyticsKt.getCrashlytics(Firebase.f5292a).setCrashlyticsCollectionEnabled(z);
/* 18 */                return true;
                    } catch (Exception e) {
/* 21 */                m3063f(e);
/* 24 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f7484d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f7483c;
                }
            }
