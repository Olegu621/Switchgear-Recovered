            package p000;

            import kotlin.Unit;
            import kotlinx.serialization.json.AbstractC1858b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i21 extends j42 implements lo0 {

                /* JADX INFO: renamed from: a */
                public int f9417a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ s50 f9418b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C1954n7 f9419c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i21(C1954n7 c1954n7, c10 c10Var) {
/* 4 */             super(3, c10Var);
/* 1 */             this.f9419c = c1954n7;
                }

                @Override // p000.lo0
                /* JADX INFO: renamed from: a */
                public final Object mo4450a(Object obj, Object obj2, Object obj3) {
/* 11 */            i21 i21Var = new i21(this.f9419c, (c10) obj3);
/* 14 */            i21Var.f9418b = (s50) obj;
/* 18 */            return i21Var.invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             C1954n7 c1954n7 = this.f9419c;
/* 5 */             C1837kn c1837kn = (C1837kn) c1954n7.f14152c;
/* 7 */             z10 z10Var = z10.f19902a;
/* 9 */             int i = this.f9417a;
/* 13 */            if (i == 0) {
/* 27 */                pg3.m7417A(obj);
/* 30 */                s50 s50Var = this.f9418b;
/* 32 */                byte bM6138q = c1837kn.m6138q();
/* 36 */                if (bM6138q == 1) {
/* 38 */                    return c1954n7.m6902g(true);
                        }
/* 44 */                if (bM6138q == 0) {
/* 46 */                    return c1954n7.m6902g(false);
                        }
/* 52 */                if (bM6138q != 6) {
/* 68 */                    if (bM6138q == 8) {
/* 70 */                        return c1954n7.m6901f();
                            }
/* 77 */                    C1837kn.m6122m(c1837kn, "Can't begin reading element, unexpected token", 0, 6);
/* 80 */                    throw null;
                        }
/* 54 */                this.f9417a = 1;
/* 56 */                obj = C1954n7.m6896a(c1954n7, s50Var, this);
/* 60 */                if (obj == z10Var) {
/* 62 */                    return z10Var;
                        }
                    } else {
/* 15 */                if (i != 1) {
/* 23 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                    return null;
                        }
/* 17 */                pg3.m7417A(obj);
                    }
/* 63 */            return (AbstractC1858b) obj;
                }
            }
