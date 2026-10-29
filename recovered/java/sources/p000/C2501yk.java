            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            /* JADX INFO: renamed from: yk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2501yk implements e63 {

                /* JADX INFO: renamed from: a */
                public Object f19667a = AbstractC0184bl.f2511p;

                /* JADX INFO: renamed from: b */
                public C0890er f19668b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C2554zk f19669c;

                public C2501yk(C2554zk c2554zk) {
/* 4 */             this.f19669c = c2554zk;
                }

                @Override // p000.e63
                /* JADX INFO: renamed from: a */
                public final void mo3335a(s82 s82Var, int i) {
/* 1 */             C0890er c0890er = this.f19668b;
/* 3 */             if (c0890er != null) {
/* 5 */                 c0890er.mo3335a(s82Var, i);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final Object m10155b(ik0 ik0Var) throws Throwable {
                    C0929ft c0929ftM10388l;
                    C0929ft c0929ft;
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2554zk.f20221i;
/* 3 */             C2554zk c2554zk = this.f19669c;
/* 9 */             C0929ft c0929ft2 = (C0929ft) atomicReferenceFieldUpdater.get(c2554zk);
/* 22 */            while (!c2554zk.m10397v(C2554zk.f20216b.get(c2554zk), true)) {
/* 42 */                long andIncrement = C2554zk.f20217c.getAndIncrement(c2554zk);
/* 46 */                long j = AbstractC0184bl.f2497b;
/* 49 */                long j2 = andIncrement / j;
/* 53 */                int i = (int) (andIncrement % j);
/* 58 */                if (c0929ft2.f16473e != j2) {
/* 60 */                    c0929ftM10388l = c2554zk.m10388l(j2, c0929ft2);
/* 64 */                    if (c0929ftM10388l == null) {
                                continue;
                            }
                        } else {
/* 67 */                    c0929ftM10388l = c0929ft2;
                        }
/* 69 */                Object objM10378I = c2554zk.m10378I(c0929ftM10388l, i, andIncrement, null);
/* 73 */                C2131r4 c2131r4 = AbstractC0184bl.f2508m;
/* 76 */                if (objM10378I == c2131r4) {
/* 310 */                   f42.m3656l("unreachable");
/* 75 */                    return null;
                        }
/* 78 */                C2131r4 c2131r5 = AbstractC0184bl.f2510o;
/* 80 */                if (objM10378I != c2131r5) {
/* 97 */                    if (objM10378I != AbstractC0184bl.f2509n) {
/* 300 */                       c0929ftM10388l.m8323b();
/* 303 */                       this.f19667a = objM10378I;
/* 305 */                       return Boolean.TRUE;
                            }
/* 103 */                   C0890er c0890erM7912w = qj3.m7912w(mz0.m6834b(ik0Var));
                            try {
/* 107 */                       this.f19668b = c0890erM7912w;
/* 110 */                       Object objM10378I2 = c2554zk.m10378I(c0929ftM10388l, i, andIncrement, this);
/* 114 */                       if (objM10378I2 == c2131r4) {
/* 116 */                           mo3335a(c0929ftM10388l, i);
                                } else {
/* 125 */                           if (objM10378I2 == c2131r5) {
/* 133 */                               if (andIncrement < c2554zk.m10393q()) {
/* 135 */                                   c0929ftM10388l.m8323b();
                                        }
/* 144 */                               C0929ft c0929ft3 = (C0929ft) C2554zk.f20221i.get(c2554zk);
                                        while (true) {
/* 156 */                                   if (c2554zk.m10397v(C2554zk.f20216b.get(c2554zk), true)) {
/* 158 */                                       C0890er c0890er = this.f19668b;
/* 160 */                                       c0890er.getClass();
/* 163 */                                       this.f19668b = null;
/* 167 */                                       this.f19667a = AbstractC0184bl.f2507l;
/* 169 */                                       Throwable thM10390n = c2554zk.m10390n();
/* 173 */                                       if (thM10390n == null) {
/* 175 */                                           m42 m42Var = o42.f14612b;
/* 179 */                                           c0890er.resumeWith(Boolean.FALSE);
                                                } else {
/* 184 */                                           m42 m42Var2 = o42.f14612b;
/* 191 */                                           c0890er.resumeWith(new n42(thM10390n));
                                                }
                                            } else {
/* 197 */                                       long andIncrement2 = C2554zk.f20217c.getAndIncrement(c2554zk);
/* 201 */                                       long j3 = AbstractC0184bl.f2497b;
/* 204 */                                       long j4 = andIncrement2 / j3;
/* 208 */                                       int i2 = (int) (andIncrement2 % j3);
/* 213 */                                       if (c0929ft3.f16473e != j4) {
/* 215 */                                           C0929ft c0929ftM10388l2 = c2554zk.m10388l(j4, c0929ft3);
/* 219 */                                           if (c0929ftM10388l2 != null) {
/* 222 */                                               c0929ft = c0929ftM10388l2;
                                                    }
                                                } else {
/* 224 */                                           c0929ft = c0929ft3;
                                                }
/* 225 */                                       Object objM10378I3 = c2554zk.m10378I(c0929ft, i2, andIncrement2, this);
/* 229 */                                       C0929ft c0929ft4 = c0929ft;
/* 232 */                                       if (objM10378I3 == AbstractC0184bl.f2508m) {
/* 234 */                                           mo3335a(c0929ft4, i2);
                                                } else {
/* 240 */                                           if (objM10378I3 != AbstractC0184bl.f2510o) {
/* 257 */                                               if (objM10378I3 == AbstractC0184bl.f2509n) {
/* 276 */                                                   throw new IllegalStateException("unexpected");
                                                        }
/* 259 */                                               c0929ft4.m8323b();
/* 262 */                                               this.f19667a = objM10378I3;
/* 264 */                                               this.f19668b = null;
                                                        break;
                                                    }
/* 248 */                                           if (andIncrement2 < c2554zk.m10393q()) {
/* 250 */                                               c0929ft4.m8323b();
                                                    }
/* 253 */                                           c0929ft3 = c0929ft4;
                                                }
                                            }
                                        }
                                    } else {
/* 277 */                               c0929ftM10388l.m8323b();
/* 280 */                               this.f19667a = objM10378I2;
/* 282 */                               this.f19668b = null;
                                    }
/* 285 */                           c0890erM7912w.mo3179d(Boolean.TRUE, null);
                                }
/* 288 */                       Object objM3569s = c0890erM7912w.m3569s();
/* 292 */                       z10 z10Var = z10.f19902a;
/* 294 */                       return objM3569s;
                            } catch (Throwable th) {
/* 295 */                       c0890erM7912w.m3550B();
/* 298 */                       throw th;
                            }
                        }
/* 88 */                if (andIncrement < c2554zk.m10393q()) {
/* 90 */                    c0929ftM10388l.m8323b();
                        }
/* 93 */                c0929ft2 = c0929ftM10388l;
                    }
/* 26 */            this.f19667a = AbstractC0184bl.f2507l;
/* 28 */            Throwable thM10390n2 = c2554zk.m10390n();
/* 32 */            if (thM10390n2 == null) {
/* 34 */                return Boolean.FALSE;
                    }
/* 37 */            int i3 = fg2.f8205a;
/* 39 */            throw thM10390n2;
                }
            }
