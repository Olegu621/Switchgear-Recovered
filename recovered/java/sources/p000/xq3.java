            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xq3 extends dn3 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f19326b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f19327c;

                public /* synthetic */ xq3(Object obj, int i) {
/* 1 */             this.f19326b = i;
/* 3 */             this.f19327c = obj;
                }

                @Override // p000.dn3
                /* JADX INFO: renamed from: a */
                public final void mo3165a() {
                    switch (this.f19326b) {
                        case 0:
                            synchronized (((yr3) this.f19327c).f19791f) {
                                try {
/* 58 */                            if (((yr3) this.f19327c).f19796k.get() > 0 && ((yr3) this.f19327c).f19796k.decrementAndGet() > 0) {
/* 83 */                                ((yr3) this.f19327c).f19787b.m1530c("Leaving the connection open for other ongoing calls.", new Object[0]);
/* 136 */                               return;
                                    }
/* 92 */                            yr3 yr3Var = (yr3) this.f19327c;
/* 96 */                            if (yr3Var.f19798m != null) {
/* 104 */                               yr3Var.f19787b.m1530c("Unbind from service.", new Object[0]);
/* 109 */                               yr3 yr3Var2 = (yr3) this.f19327c;
/* 115 */                               yr3Var2.f19786a.unbindService(yr3Var2.f19797l);
/* 120 */                               yr3 yr3Var3 = (yr3) this.f19327c;
/* 122 */                               yr3Var3.f19792g = false;
/* 124 */                               yr3Var3.f19798m = null;
/* 126 */                               yr3Var3.f19797l = null;
                                    }
/* 132 */                           ((yr3) this.f19327c).m10179d();
/* 136 */                           return;
                                } catch (Throwable th) {
/* 138 */                           throw th;
                                }
                            }
                        default:
/* 14 */                    yr3 yr3Var4 = (yr3) ((y93) this.f19327c).f19550b;
/* 22 */                    yr3Var4.f19787b.m1530c("unlinkToDeath", new Object[0]);
/* 33 */                    yr3Var4.f19798m.asBinder().unlinkToDeath(yr3Var4.f19795j, 0);
/* 36 */                    yr3Var4.f19798m = null;
/* 38 */                    yr3Var4.f19792g = false;
/* 40 */                    return;
                    }
                }
            }
