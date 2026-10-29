            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataWhitelist;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kd2 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12697a;

                /* JADX INFO: renamed from: b */
                public int f12698b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ SharedDataWhitelist f12699c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ kd2(SharedDataWhitelist sharedDataWhitelist, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f12697a = i;
/* 3 */             this.f12699c = sharedDataWhitelist;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f12697a;
/* 3 */             SharedDataWhitelist sharedDataWhitelist = this.f12699c;
                    switch (i) {
                        case 0:
/* 18 */                    return new kd2(sharedDataWhitelist, c10Var, 0);
                        default:
/* 11 */                    return new kd2(sharedDataWhitelist, c10Var, 1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f12697a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((kd2) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f12697a;
/* 3 */             SharedDataWhitelist sharedDataWhitelist = this.f12699c;
                    switch (i) {
                        case 0:
/* 50 */                    z10 z10Var = z10.f19902a;
/* 52 */                    int i2 = this.f12698b;
/* 54 */                    if (i2 == 0) {
/* 66 */                        pg3.m7417A(obj);
/* 69 */                        this.f12698b = 1;
/* 75 */                        if (sharedDataWhitelist.loadFromPersistentStorage(this) == z10Var) {
/* 77 */                            return z10Var;
                                }
                            } else {
/* 56 */                        if (i2 != 1) {
/* 62 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 58 */                        pg3.m7417A(obj);
                            }
/* 79 */                    return Unit.f12910a;
                        default:
/* 12 */                    z10 z10Var2 = z10.f19902a;
/* 14 */                    int i3 = this.f12698b;
/* 16 */                    if (i3 == 0) {
/* 28 */                        pg3.m7417A(obj);
/* 1 */                         InterfaceC1809jx interfaceC1809jx = sharedDataWhitelist.loadDeferred;
/* 35 */                        this.f12698b = 1;
/* 43 */                        if (((C1869kx) interfaceC1809jx).m10250i(this) == z10Var2) {
/* 45 */                            return z10Var2;
                                }
                            } else {
/* 18 */                        if (i3 != 1) {
/* 24 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 20 */                        pg3.m7417A(obj);
                            }
/* 47 */                    return Unit.f12910a;
                    }
                }
            }
