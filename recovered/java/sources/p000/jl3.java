            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jl3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12356a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ok3 f12357b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f12358c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f12359d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ sl3 f12360e;

                public /* synthetic */ jl3(sl3 sl3Var, ok3 ok3Var, long j, boolean z, int i) {
/* 1 */             this.f12356a = i;
/* 3 */             this.f12357b = ok3Var;
/* 5 */             this.f12358c = j;
/* 7 */             this.f12359d = z;
/* 9 */             this.f12360e = sl3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f12356a;
/* 3 */             long j = this.f12358c;
/* 5 */             boolean z = this.f12359d;
/* 7 */             ok3 ok3Var = this.f12357b;
/* 9 */             sl3 sl3Var = this.f12360e;
                    switch (i) {
                        case 0:
/* 21 */                    sl3Var.m8553D(ok3Var);
/* 24 */                    sl3Var.m8564O(ok3Var, j, z);
                            break;
                        default:
/* 14 */                    sl3Var.m8553D(ok3Var);
/* 17 */                    sl3Var.m8564O(ok3Var, j, z);
                            break;
                    }
                }
            }
