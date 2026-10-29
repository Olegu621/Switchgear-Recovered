            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x93 extends ra3 {

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f19004i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ Object f19005v;

                public /* synthetic */ x93(Object obj, int i) {
/* 1 */             this.f19004i = i;
/* 3 */             this.f19005v = obj;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
                    switch (this.f19004i) {
                        case 0:
/* 111 */                   z93 z93Var = (z93) ((y93) this.f19005v).f19550b;
/* 119 */                   z93Var.f20005b.m7756b("unlinkToDeath", new Object[0]);
/* 130 */                   z93Var.f20017n.asBinder().unlinkToDeath(z93Var.f20014k, 0);
/* 133 */                   z93Var.f20017n = null;
/* 135 */                   z93Var.f20010g = false;
/* 137 */                   return;
                        default:
                            synchronized (((z93) this.f19005v).f20009f) {
                                try {
/* 25 */                            if (((z93) this.f19005v).f20015l.get() > 0 && ((z93) this.f19005v).f20015l.decrementAndGet() > 0) {
/* 49 */                                ((z93) this.f19005v).f20005b.m7756b("Leaving the connection open for other ongoing calls.", new Object[0]);
/* 102 */                               return;
                                    }
/* 58 */                            z93 z93Var2 = (z93) this.f19005v;
/* 62 */                            if (z93Var2.f20017n != null) {
/* 70 */                                z93Var2.f20005b.m7756b("Unbind from service.", new Object[0]);
/* 75 */                                z93 z93Var3 = (z93) this.f19005v;
/* 81 */                                z93Var3.f20004a.unbindService(z93Var3.f20016m);
/* 86 */                                z93 z93Var4 = (z93) this.f19005v;
/* 88 */                                z93Var4.f20010g = false;
/* 90 */                                z93Var4.f20017n = null;
/* 92 */                                z93Var4.f20016m = null;
                                    }
/* 98 */                            ((z93) this.f19005v).m10292e();
/* 102 */                           return;
                                } catch (Throwable th) {
/* 104 */                           throw th;
                                }
                            }
                    }
                }
            }
