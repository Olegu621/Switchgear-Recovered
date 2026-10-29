            package p000;

            import io.sentry.C1697u2;
            import java.security.GeneralSecurityException;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zw1 extends ThreadLocal {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ur3 f20361a;

                public zw1(ur3 ur3Var) {
/* 1 */             this.f20361a = ur3Var;
                }

                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
/* 1 */             ur3 ur3Var = this.f20361a;
                    try {
/* 3 */                 he0 he0Var = he0.f9027c;
/* 15 */                Mac mac = (Mac) he0Var.f9028a.mo2941x((String) ur3Var.f17705c);
/* 21 */                mac.init((SecretKeySpec) ur3Var.f17706d);
/* 24 */                return mac;
                    } catch (GeneralSecurityException e) {
/* 26 */                C1697u2.m5439o(e);
/* 29 */                return null;
                    }
                }
            }
