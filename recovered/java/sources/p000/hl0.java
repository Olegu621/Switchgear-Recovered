            package p000;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class hl0 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f9129a;

                /* JADX INFO: renamed from: b */
                public int f9130b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ h90 f9131c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public hl0(h90 h90Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f9131c = h90Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f9129a = obj;
/* 8 */             this.f9130b |= Integer.MIN_VALUE;
/* 13 */            return this.f9131c.emit(null, this);
                }
            }
