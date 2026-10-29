            package p000;

            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class af0 extends cf0 {

                /* JADX INFO: renamed from: c */
                public final C0890er f224c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ef0 f225d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public af0(ef0 ef0Var, long j, C0890er c0890er) {
/* 3 */             super(j);
/* 1 */             this.f225d = ef0Var;
/* 6 */             this.f224c = c0890er;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 7 */             this.f224c.m3553E(this.f225d, Unit.f12910a);
                }

                @Override // p000.cf0
                public final String toString() {
/* 18 */            return super.toString() + this.f224c;
                }
            }
