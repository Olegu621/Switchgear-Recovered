            package io.sentry.android.replay;

            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1427d4;
            import java.util.ArrayList;
            import kotlin.text.StringsKt;
            import p000.h22;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1328m implements InterfaceC1427d4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10564a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ h22 f10565b;

                public /* synthetic */ C1328m(int i, h22 h22Var) {
/* 1 */             this.f10564a = i;
/* 3 */             this.f10565b = h22Var;
                }

                @Override // io.sentry.InterfaceC1427d4
                /* JADX INFO: renamed from: e */
                public final void mo4804e(InterfaceC1156a1 interfaceC1156a1) {
/* 1 */             int i = this.f10564a;
/* 3 */             h22 h22Var = this.f10565b;
                    switch (i) {
                        case 0:
/* 23 */                    int i2 = ReplayIntegration.f10408d0;
/* 25 */                    interfaceC1156a1.getClass();
/* 28 */                    String strMo4682F = interfaceC1156a1.mo4682F();
/* 32 */                    if (strMo4682F != null) {
/* 38 */                        int iM6230F = StringsKt.m6230F(strMo4682F, '.', 0, 6);
/* 43 */                        if (iM6230F != -1) {
/* 52 */                            strMo4682F = strMo4682F.substring(iM6230F + 1, strMo4682F.length());
                                }
                            } else {
/* 57 */                        strMo4682F = null;
                            }
/* 58 */                    h22Var.f8873a = strMo4682F;
                            break;
                        default:
/* 8 */                     interfaceC1156a1.getClass();
/* 20 */                    h22Var.f8873a = new ArrayList(interfaceC1156a1.mo4706s());
                            break;
                    }
                }
            }
