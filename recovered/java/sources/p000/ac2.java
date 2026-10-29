            package p000;

            import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
            import java.util.concurrent.CancellationException;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ac2 {

                /* JADX INFO: renamed from: a */
                public final yb2 f180a;

                /* JADX INFO: renamed from: b */
                public final vq0 f181b;

                /* JADX INFO: renamed from: c */
                public k61 f182c;

                public ac2(yb2 yb2Var, vq0 vq0Var) {
/* 3 */             yb2Var.getClass();
/* 6 */             vq0Var.getClass();
/* 14 */            this.f180a = yb2Var;
/* 18 */            this.f181b = vq0Var;
/* 40 */            this.f182c = new k61(null, null, null, null, null, null, false, null, null, null, null, null, null, 16383);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m194a(SettingsInitializationParameters settingsInitializationParameters, d10 d10Var) {
                    zb2 zb2Var;
                    Object objM10139a;
/* 3 */             if (d10Var instanceof zb2) {
/* 6 */                 zb2Var = (zb2) d10Var;
/* 8 */                 int i = zb2Var.f20064d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zb2Var.f20064d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zb2Var = new zb2(this, d10Var);
                        }
                    } else {
/* 22 */                zb2Var = new zb2(this, d10Var);
                    }
/* 25 */            Object obj = zb2Var.f20062b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zb2Var.f20064d;
                    try {
/* 33 */                if (i2 == 0) {
/* 53 */                    pg3.m7417A(obj);
/* 56 */                    yb2 yb2Var = this.f180a;
/* 58 */                    zb2Var.f20061a = this;
/* 60 */                    zb2Var.f20064d = 1;
/* 62 */                    objM10139a = yb2Var.m10139a(settingsInitializationParameters, zb2Var);
/* 66 */                    if (objM10139a == z10Var) {
/* 68 */                        return z10Var;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 49 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    this = zb2Var.f20061a;
/* 39 */                    pg3.m7417A(obj);
/* 44 */                    objM10139a = ((o42) obj).f14613a;
                        }
/* 69 */                Throwable thM7099a = o42.m7099a(objM10139a);
/* 73 */                if (thM7099a != null) {
/* 106 */                   return new n42(new C1836km(String.valueOf(thM7099a.getMessage()), thM7099a));
                        }
/* 79 */                k61 k61VarM5996a = k61.m5996a((k61) objM10139a, null, null, 16383);
/* 83 */                this.getClass();
/* 86 */                this.f182c = k61VarM5996a;
/* 88 */                return Unit.f12910a;
                    } catch (CancellationException e) {
/* 133 */               throw e;
                    } catch (Exception e2) {
/* 111 */               m42 m42Var = o42.f14612b;
/* 128 */               return new n42(new C1836km(String.valueOf(e2.getMessage()), e2));
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m195b() {
/* 3 */             C1029ij c1029ij = this.f182c.f12618i;
/* 5 */             if (c1029ij != null) {
/* 7 */                 return c1029ij.f9628a;
                    }
/* 10 */            return false;
                }
            }
