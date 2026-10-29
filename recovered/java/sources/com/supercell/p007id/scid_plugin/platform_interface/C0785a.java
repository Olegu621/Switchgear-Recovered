            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.Context;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.f42;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: renamed from: com.supercell.id.scid_plugin.platform_interface.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0785a extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f5704a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Context f5705b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0785a(Context context, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.f5705b = context;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new C0785a(this.f5705b, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((C0785a) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f5704a;
/* 6 */             if (i == 0) {
/* 21 */                pg3.m7417A(obj);
/* 28 */                SharedDataWhitelist singletonHolder = SharedDataWhitelist.INSTANCE.getInstance(this.f5705b);
/* 34 */                this.f5704a = 1;
/* 42 */                if (singletonHolder.awaitLoaded(3000L, this) == z10Var) {
/* 44 */                    return z10Var;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                pg3.m7417A(obj);
                    }
/* 45 */            return Unit.f12910a;
                }
            }
