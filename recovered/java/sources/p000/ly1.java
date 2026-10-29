            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ly1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f13532a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f13533b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e70 f13534c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ly1(long j, e70 e70Var, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f13533b = j;
/* 3 */             this.f13534c = e70Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new ly1(this.f13533b, this.f13534c, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((ly1) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f13532a;
/* 7 */             if (i != 0) {
/* 9 */                 if (i == 1) {
/* 11 */                    pg3.m7417A(obj);
/* 14 */                    return obj;
                        }
/* 17 */                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                 return null;
                    }
/* 21 */            pg3.m7417A(obj);
/* 29 */            ky1 ky1Var = new ky1(this.f13534c, null, 0);
/* 32 */            this.f13532a = 1;
/* 36 */            Object objM7885R = qj3.m7885R(this.f13533b, ky1Var, this);
                    return objM7885R == z10Var ? z10Var : objM7885R;
                }
            }
