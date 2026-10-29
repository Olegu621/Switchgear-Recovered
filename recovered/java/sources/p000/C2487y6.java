            package p000;

            import com.google.android.gms.tasks.OnFailureListener;
            import com.supercell.titan.agesignals.AgeSignals;
            
            /* JADX INFO: renamed from: y6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final /* synthetic */ class C2487y6 implements OnFailureListener, bk2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19501a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f19502b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f19503c;

                public /* synthetic */ C2487y6(f31 f31Var, C2497yg c2497yg, int i) {
/* 4 */             this.f19502b = f31Var;
/* 6 */             this.f19503c = c2497yg;
/* 8 */             this.f19501a = i;
                }

                @Override // p000.bk2
                public Object execute() {
/* 3 */             f31 f31Var = (f31) this.f19502b;
/* 18 */            ((C0875ec) f31Var.f7986d).m3372K((C2497yg) this.f19503c, this.f19501a + 1, false);
/* 21 */            return null;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    int i;
/* 3 */             AgeSignals ageSignals = (AgeSignals) this.f19502b;
/* 5 */             int i2 = this.f19501a;
/* 9 */             er0 er0Var = (er0) this.f19503c;
/* 11 */            int i3 = AgeSignals.MAX_RETRIES;
/* 13 */            exc.getClass();
/* 18 */            if (exc instanceof UnsupportedOperationException) {
/* 35 */                ageSignals.f5983a = new AgeSignals.AgeRangeResult(false, -100, 0, 0, 0, null, 60, null);
/* 37 */                return;
                    }
/* 52 */            int errorCode = exc instanceof C0009a7 ? ((C0009a7) exc).getErrorCode() : -100;
/* 53 */            if ((errorCode != -100 && errorCode != -8) || (i = i2 + 1) >= 5) {
/* 137 */               ageSignals.f5983a = new AgeSignals.AgeRangeResult(false, errorCode, 0, 0, 0, null, 61, null);
/* 139 */               return;
                    }
/* 74 */            fb0 fb0Var = new fb0(fb0.m3692h(1 << i, AgeSignals.f5980c));
/* 81 */            fb0 fb0Var2 = new fb0(AgeSignals.f5981d);
/* 88 */            if (fb0Var.compareTo(fb0Var2) > 0) {
/* 90 */                fb0Var = fb0Var2;
                    }
/* 91 */            long j = fb0Var.f8062a;
/* 120 */           ageSignals.f5984b.postDelayed(new RunnableC2524z6(ageSignals, er0Var, i, 0), ((((int) j) & 1) != 1 || fb0.m3690f(j)) ? fb0.m3694j(j, ib0.MILLISECONDS) : j >> 1);
                }

/* 10 */        public /* synthetic */ C2487y6(AgeSignals ageSignals, int i, er0 er0Var) {
                    this.f19502b = ageSignals;
                    this.f19501a = i;
                    this.f19503c = er0Var;
                }
            }
