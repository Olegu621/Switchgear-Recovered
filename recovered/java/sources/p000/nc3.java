            package p000;

            import com.google.android.gms.auth.api.signin.internal.zba;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nc3 extends zba {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14187a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ oc3 f14188b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public nc3(oc3 oc3Var, int i) {
/* 7 */             super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
/* 1 */             this.f14187a = i;
/* 3 */             this.f14188b = oc3Var;
                }

                @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
                /* JADX INFO: renamed from: E */
                public void mo1998E(Status status) {
                    switch (this.f14187a) {
                        case 1:
/* 12 */                    this.f14188b.setResult(status);
                            break;
                        default:
/* 6 */                     super.mo1998E(status);
                            break;
                    }
                }

                @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
                public void zbc(Status status) {
                    switch (this.f14187a) {
                        case 0:
/* 12 */                    this.f14188b.setResult(status);
                            break;
                        default:
/* 6 */                     super.zbc(status);
                            break;
                    }
                }
            }
