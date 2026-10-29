            package p000;

            import io.sentry.C1697u2;
            import io.sentry.util.AbstractC1703b;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import sun.misc.Unsafe;
            
            /* JADX INFO: renamed from: zk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2554zk implements InterfaceC2509ys {

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f20210U;

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ long f20211V;

                /* JADX INFO: renamed from: W */
                public static final /* synthetic */ long f20212W;

                /* JADX INFO: renamed from: X */
                public static final /* synthetic */ long f20213X;

                /* JADX INFO: renamed from: Y */
                public static final /* synthetic */ long f20214Y;

                /* JADX INFO: renamed from: Z */
                public static final /* synthetic */ long f20215Z;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicLongFieldUpdater f20216b = AtomicLongFieldUpdater.newUpdater(C2554zk.class, "sendersAndCloseStatus$volatile");

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ AtomicLongFieldUpdater f20217c = AtomicLongFieldUpdater.newUpdater(C2554zk.class, "receivers$volatile");

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ AtomicLongFieldUpdater f20218d = AtomicLongFieldUpdater.newUpdater(C2554zk.class, "bufferEnd$volatile");

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ AtomicLongFieldUpdater f20219e = AtomicLongFieldUpdater.newUpdater(C2554zk.class, "completedExpandBuffersAndPauseFlag$volatile");

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f20220f = AtomicReferenceFieldUpdater.newUpdater(C2554zk.class, Object.class, "sendSegment$volatile");

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f20221i;

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f20222v;

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f20223w;
                private volatile /* synthetic */ Object _closeCause$volatile;

                /* JADX INFO: renamed from: a */
                public final int f20224a;
                private volatile /* synthetic */ long bufferEnd$volatile;
                private volatile /* synthetic */ Object bufferEndSegment$volatile;
                private volatile /* synthetic */ Object closeHandler$volatile;
                private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
                private volatile /* synthetic */ Object receiveSegment$volatile;
                private volatile /* synthetic */ long receivers$volatile;
                private volatile /* synthetic */ Object sendSegment$volatile;
                private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

                static {
/* 45 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 55 */            f20215Z = unsafe.objectFieldOffset(C2554zk.class.getDeclaredField("sendSegment$volatile"));
/* 63 */            f20221i = AtomicReferenceFieldUpdater.newUpdater(C2554zk.class, Object.class, "receiveSegment$volatile");
/* 73 */            f20214Y = unsafe.objectFieldOffset(C2554zk.class.getDeclaredField("receiveSegment$volatile"));
/* 81 */            f20222v = AtomicReferenceFieldUpdater.newUpdater(C2554zk.class, Object.class, "bufferEndSegment$volatile");
/* 91 */            f20212W = unsafe.objectFieldOffset(C2554zk.class.getDeclaredField("bufferEndSegment$volatile"));
/* 99 */            f20223w = AtomicReferenceFieldUpdater.newUpdater(C2554zk.class, Object.class, "_closeCause$volatile");
/* 109 */           f20211V = unsafe.objectFieldOffset(C2554zk.class.getDeclaredField("_closeCause$volatile"));
/* 117 */           f20210U = AtomicReferenceFieldUpdater.newUpdater(C2554zk.class, Object.class, "closeHandler$volatile");
/* 127 */           f20213X = unsafe.objectFieldOffset(C2554zk.class.getDeclaredField("closeHandler$volatile"));
                }

                public C2554zk(int i) {
/* 4 */             this.f20224a = i;
/* 6 */             if (i < 0) {
/* 77 */                ds0.m3200q(AbstractC0886en.m3505i(i, "Invalid channel capacity: ", ", should be >=0"));
/* 81 */                throw null;
                    }
/* 8 */             C0929ft c0929ft = AbstractC0184bl.f2496a;
/* 27 */            this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
/* 35 */            this.completedExpandBuffersAndPauseFlag$volatile = f20218d.get(this);
/* 44 */            C0929ft c0929ft2 = new C0929ft(0L, null, this, 3);
/* 47 */            this.sendSegment$volatile = c0929ft2;
/* 49 */            this.receiveSegment$volatile = c0929ft2;
/* 55 */            if (m10399y()) {
/* 57 */                c0929ft2 = AbstractC0184bl.f2496a;
/* 59 */                c0929ft2.getClass();
                    }
/* 62 */            this.bufferEndSegment$volatile = c0929ft2;
/* 66 */            this._closeCause$volatile = AbstractC0184bl.f2514s;
                }

                /* JADX INFO: renamed from: B */
                public static Object m10367B(C2554zk c2554zk, C2223tm c2223tm) throws Throwable {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20221i;
/* 3 */             atomicReferenceFieldUpdater.getClass();
/* 7 */             if (c2554zk == null) {
/* 269 */               C1697u2.m5431g();
/* 6 */                 return null;
                    }
/* 17 */            C0929ft c0929ft = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(c2554zk, f20214Y);
                    while (true) {
/* 19 */                c2554zk.getClass();
/* 22 */                AtomicLongFieldUpdater atomicLongFieldUpdater = f20216b;
/* 33 */                if (c2554zk.m10397v(atomicLongFieldUpdater.get(c2554zk), true)) {
/* 262 */                   Throwable thM10391o = c2554zk.m10391o();
/* 266 */                   int i = fg2.f8205a;
/* 268 */                   throw thM10391o;
                        }
/* 35 */                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20217c;
/* 37 */                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c2554zk);
/* 41 */                long j = AbstractC0184bl.f2497b;
/* 44 */                long j2 = andIncrement / j;
/* 48 */                int i2 = (int) (andIncrement % j);
/* 53 */                if (c0929ft.f16473e != j2) {
/* 55 */                    C0929ft c0929ftM10388l = c2554zk.m10388l(j2, c0929ft);
/* 59 */                    if (c0929ftM10388l == null) {
                                continue;
                            } else {
/* 62 */                        c0929ft = c0929ftM10388l;
                            }
                        }
/* 65 */                Object objM10378I = c2554zk.m10378I(c0929ft, i2, andIncrement, null);
/* 69 */                Object obj = AbstractC0184bl.f2508m;
/* 73 */                if (objM10378I == obj) {
/* 258 */                   f42.m3656l("unexpected");
/* 6 */                     return null;
                        }
/* 75 */                Object obj2 = AbstractC0184bl.f2510o;
/* 77 */                if (objM10378I != obj2) {
/* 93 */                    if (objM10378I != AbstractC0184bl.f2509n) {
/* 254 */                       c0929ft.m8323b();
/* 257 */                       return objM10378I;
                            }
/* 99 */                    C0890er c0890erM7912w = qj3.m7912w(mz0.m6834b(c2223tm));
                            try {
/* 104 */                       Object objM10378I2 = c2554zk.m10378I(c0929ft, i2, andIncrement, c0890erM7912w);
/* 108 */                       if (objM10378I2 == obj) {
/* 110 */                           c0890erM7912w.mo3335a(c0929ft, i2);
                                } else if (objM10378I2 == obj2) {
/* 126 */                           if (andIncrement < c2554zk.m10393q()) {
/* 128 */                               c0929ft.m8323b();
                                    }
/* 135 */                           C0929ft c0929ft2 = (C0929ft) atomicReferenceFieldUpdater.get(c2554zk);
/* 145 */                           for (boolean z = true; !c2554zk.m10397v(atomicLongFieldUpdater.get(c2554zk), z); z = true) {
/* 162 */                               long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c2554zk);
/* 166 */                               long j3 = AbstractC0184bl.f2497b;
/* 169 */                               AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
/* 170 */                               long j4 = andIncrement2 / j3;
/* 174 */                               int i3 = (int) (andIncrement2 % j3);
/* 179 */                               if (c0929ft2.f16473e != j4) {
/* 181 */                                   C0929ft c0929ftM10388l2 = c2554zk.m10388l(j4, c0929ft2);
/* 185 */                                   if (c0929ftM10388l2 == null) {
                                                continue;
                                            } else {
/* 190 */                                       c0929ft2 = c0929ftM10388l2;
                                            }
/* 187 */                                   atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                        }
/* 192 */                               Object objM10378I3 = c2554zk.m10378I(c0929ft2, i3, andIncrement2, c0890erM7912w);
/* 198 */                               if (objM10378I3 == AbstractC0184bl.f2508m) {
/* 200 */                                   c0890erM7912w.mo3335a(c0929ft2, i3);
                                        } else if (objM10378I3 == AbstractC0184bl.f2510o) {
/* 214 */                                   if (andIncrement2 < c2554zk.m10393q()) {
/* 216 */                                       c0929ft2.m8323b();
                                            }
/* 187 */                                   atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                        } else {
/* 222 */                                   if (objM10378I3 == AbstractC0184bl.f2509n) {
/* 236 */                                       throw new IllegalStateException("unexpected");
                                            }
/* 224 */                                   c0929ft2.m8323b();
/* 227 */                                   c0890erM7912w.mo3179d(objM10378I3, null);
                                        }
                                    }
/* 147 */                           m42 m42Var = o42.f14612b;
/* 158 */                           c0890erM7912w.resumeWith(new n42(c2554zk.m10391o()));
                                } else {
/* 237 */                           c0929ft.m8323b();
/* 240 */                           c0890erM7912w.mo3179d(objM10378I2, null);
                                }
/* 243 */                       Object objM3569s = c0890erM7912w.m3569s();
/* 247 */                       z10 z10Var = z10.f19902a;
/* 249 */                       return objM3569s;
                            } catch (Throwable th) {
/* 250 */                       c0890erM7912w.m3550B();
/* 253 */                       throw th;
                            }
                        }
/* 85 */                if (andIncrement < c2554zk.m10393q()) {
/* 87 */                    c0929ft.m8323b();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:87:0x0157  */
                /* JADX WARN: Code duplicated, block: B:89:0x015b A[RETURN] */
                /* JADX INFO: renamed from: D */
                public static Object m10368D(C2554zk c2554zk, Object obj, c10 c10Var) {
                    Object objM3569s;
                    z10 z10Var;
/* 7 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20220f;
/* 9 */             atomicReferenceFieldUpdater.getClass();
/* 20 */            C0929ft c0929ft = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(c2554zk, f20215Z);
                    while (true) {
/* 22 */                AtomicLongFieldUpdater atomicLongFieldUpdater = f20216b;
/* 24 */                long andIncrement = atomicLongFieldUpdater.getAndIncrement(c2554zk);
/* 33 */                long j = andIncrement & 1152921504606846975L;
/* 36 */                boolean zM10397v = c2554zk.m10397v(andIncrement, false);
/* 40 */                int i = AbstractC0184bl.f2497b;
                        long j2 = i;
/* 44 */                long j3 = j / j2;
/* 48 */                int i2 = (int) (j % j2);
/* 55 */                if (c0929ft.f16473e != j3) {
/* 57 */                    C0929ft c0929ftM10389m = c2554zk.m10389m(j3, c0929ft);
/* 61 */                    if (c0929ftM10389m != null) {
/* 74 */                        c0929ft = c0929ftM10389m;
                            } else if (zM10397v) {
/* 65 */                        Object objM10373A = c2554zk.m10373A(c10Var, obj);
/* 71 */                        if (objM10373A != z10.f19902a) {
                                    break;
                                }
/* 73 */                        return objM10373A;
                            }
                        }
/* 82 */                int iM10371c = m10371c(c2554zk, c0929ft, i2, obj, j, null, zM10397v);
/* 86 */                if (iM10371c == 0) {
/* 367 */                   c0929ft.m8323b();
                            break;
                        }
/* 89 */                if (iM10371c != 1) {
/* 92 */                    if (iM10371c == 2) {
/* 353 */                       if (!zM10397v) {
                                    break;
                                }
/* 355 */                       c0929ft.m8433n();
/* 358 */                       Object objM10373A2 = c2554zk.m10373A(c10Var, obj);
/* 364 */                       if (objM10373A2 != z10.f19902a) {
                                    break;
                                }
/* 366 */                       return objM10373A2;
                            }
/* 94 */                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20217c;
/* 101 */                   if (iM10371c == 3) {
/* 136 */                       C0890er c0890erM7912w = qj3.m7912w(mz0.m6834b(c10Var));
                                try {
/* 142 */                           int iM10371c2 = m10371c(c2554zk, c0929ft, i2, obj, j, c0890erM7912w, false);
/* 146 */                           if (iM10371c2 == 0) {
/* 329 */                               c0929ft.m8323b();
/* 332 */                               m42 m42Var = o42.f14612b;
                                    } else {
/* 148 */                               if (iM10371c2 != 1) {
/* 150 */                                   if (iM10371c2 != 2) {
/* 152 */                                       if (iM10371c2 != 4) {
/* 154 */                                           String str = "unexpected";
/* 156 */                                           if (iM10371c2 != 5) {
/* 307 */                                               throw new IllegalStateException("unexpected");
                                                    }
/* 158 */                                           c0929ft.m8323b();
/* 165 */                                           C0929ft c0929ft2 = (C0929ft) atomicReferenceFieldUpdater.get(c2554zk);
                                                    while (true) {
/* 167 */                                               long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c2554zk);
/* 171 */                                               long j4 = andIncrement2 & 1152921504606846975L;
/* 174 */                                               boolean zM10397v2 = c2554zk.m10397v(andIncrement2, false);
/* 178 */                                               int i3 = AbstractC0184bl.f2497b;
/* 180 */                                               atomicLongFieldUpdater = atomicLongFieldUpdater;
                                                        long j5 = i3;
/* 185 */                                               long j6 = j4 / j5;
/* 189 */                                               int i4 = (int) (j4 % j5);
/* 194 */                                               if (c0929ft2.f16473e != j6) {
/* 196 */                                                   C0929ft c0929ftM10389m2 = c2554zk.m10389m(j6, c0929ft2);
/* 200 */                                                   if (c0929ftM10389m2 != null) {
/* 218 */                                                       c0929ft2 = c0929ftM10389m2;
                                                            } else if (zM10397v2) {
                                                            }
                                                        }
/* 229 */                                               int iM10371c3 = m10371c(c2554zk, c0929ft2, i4, obj, j4, c0890erM7912w, zM10397v2);
/* 233 */                                               if (iM10371c3 == 0) {
/* 295 */                                                   c0929ft2.m8323b();
/* 298 */                                                   m42 m42Var2 = o42.f14612b;
                                                        } else if (iM10371c3 == 1) {
/* 287 */                                                   m42 m42Var3 = o42.f14612b;
                                                        } else if (iM10371c3 == 2) {
/* 275 */                                                   if (!zM10397v2) {
/* 283 */                                                       c0890erM7912w.mo3335a(c0929ft2, i4 + i3);
                                                                break;
                                                            }
/* 277 */                                                   c0929ft2.m8433n();
                                                        } else {
/* 240 */                                                   if (iM10371c3 == 3) {
/* 274 */                                                       throw new IllegalStateException(str);
                                                            }
/* 243 */                                                   if (iM10371c3 != 4) {
/* 246 */                                                       if (iM10371c3 == 5) {
/* 249 */                                                           c0929ft2.m8323b();
                                                                }
/* 252 */                                                       str = str;
                                                            } else if (j4 < atomicLongFieldUpdater2.get(c2554zk)) {
/* 265 */                                                       c0929ft2.m8323b();
                                                            }
                                                        }
                                                    }
                                                } else if (j < atomicLongFieldUpdater2.get(c2554zk)) {
/* 316 */                                           c0929ft.m8323b();
                                                }
/* 204 */                                       m10370b(c2554zk, obj, c0890erM7912w);
                                                break;
                                            } else {
/* 322 */                                       c0890erM7912w.mo3335a(c0929ft, i2 + i);
                                            }
/* 335 */                                   objM3569s = c0890erM7912w.m3569s();
/* 339 */                                   z10Var = z10.f19902a;
/* 341 */                                   if (objM3569s != z10Var) {
/* 344 */                                       objM3569s = Unit.f12910a;
                                            }
/* 346 */                                   if (objM3569s == z10Var) {
                                                break;
                                            }
/* 348 */                                   return objM3569s;
                                        }
/* 326 */                               m42 m42Var4 = o42.f14612b;
                                    }
/* 291 */                           c0890erM7912w.resumeWith(Unit.f12910a);
/* 335 */                           objM3569s = c0890erM7912w.m3569s();
/* 339 */                           z10Var = z10.f19902a;
/* 341 */                           if (objM3569s != z10Var) {
/* 344 */                               objM3569s = Unit.f12910a;
                                    }
/* 346 */                           if (objM3569s == z10Var) {
                                        break;
                                    }
/* 348 */                           return objM3569s;
                                } catch (Throwable th) {
/* 349 */                           c0890erM7912w.m3550B();
/* 352 */                           throw th;
                                }
                            }
/* 103 */                   if (iM10371c == 4) {
/* 118 */                       if (j < atomicLongFieldUpdater2.get(c2554zk)) {
/* 120 */                           c0929ft.m8323b();
                                }
/* 123 */                       Object objM10373A3 = c2554zk.m10373A(c10Var, obj);
/* 129 */                       if (objM10373A3 != z10.f19902a) {
                                    break;
                                }
/* 131 */                       return objM10373A3;
                            }
/* 105 */                   if (iM10371c == 5) {
/* 108 */                       c0929ft.m8323b();
                            }
                        } else {
                            break;
                        }
                    }
/* 370 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: G */
                public static boolean m10369G(Object obj) {
/* 4 */             if (!(obj instanceof InterfaceC0853dr)) {
/* 27 */                ds0.m3201r(obj, "Unexpected waiter: ");
/* 3 */                 return false;
                    }
/* 6 */             InterfaceC0853dr interfaceC0853dr = (InterfaceC0853dr) obj;
/* 8 */             Unit unit = Unit.f12910a;
/* 10 */            C0929ft c0929ft = AbstractC0184bl.f2496a;
/* 13 */            C2131r4 c2131r4Mo3178b = interfaceC0853dr.mo3178b(unit, null);
/* 17 */            if (c2131r4Mo3178b == null) {
/* 3 */                 return false;
                    }
/* 19 */            interfaceC0853dr.mo3180f(c2131r4Mo3178b);
/* 22 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public static final void m10370b(C2554zk c2554zk, Object obj, C0890er c0890er) {
/* 1 */             Throwable thM10392p = c2554zk.m10392p();
/* 5 */             m42 m42Var = o42.f14612b;
/* 12 */            c0890er.resumeWith(new n42(thM10392p));
                }

                /* JADX INFO: renamed from: c */
                public static final int m10371c(C2554zk c2554zk, C0929ft c0929ft, int i, Object obj, long j, Object obj2, boolean z) {
/* 1 */             c0929ft.m3833s(i, obj);
/* 4 */             if (z) {
/* 6 */                 return c2554zk.m10379J(c0929ft, i, obj, j, obj2, z);
                    }
/* 11 */            Object objM3831q = c0929ft.m3831q(i);
/* 17 */            if (objM3831q == null) {
/* 23 */                if (c2554zk.m10381d(j)) {
/* 31 */                    if (c0929ft.m3830p(i, null, AbstractC0184bl.f2499d)) {
/* 15 */                        return 1;
                            }
                        } else {
/* 34 */                    if (obj2 == null) {
/* 36 */                        return 3;
                            }
/* 42 */                    if (c0929ft.m3830p(i, null, obj2)) {
/* 44 */                        return 2;
                            }
                        }
                    } else if (objM3831q instanceof e63) {
/* 50 */                c0929ft.m3833s(i, null);
/* 57 */                if (c2554zk.m10376F(objM3831q, obj)) {
/* 61 */                    c0929ft.m3834t(i, AbstractC0184bl.f2504i);
/* 64 */                    return 0;
                        }
/* 66 */                C2131r4 c2131r4 = AbstractC0184bl.f2506k;
/* 77 */                if (c0929ft.f8345h.getAndSet((i * 2) + 1, c2131r4) == c2131r4) {
/* 82 */                    return 5;
                        }
/* 79 */                c0929ft.m3832r(i, true);
/* 82 */                return 5;
                    }
/* 84 */            return c2554zk.m10379J(c0929ft, i, obj, j, obj2, z);
                }

                /* JADX INFO: renamed from: s */
                public static void m10372s(C2554zk c2554zk) {
/* 1 */             AtomicLongFieldUpdater atomicLongFieldUpdater = f20219e;
/* 16 */            if ((atomicLongFieldUpdater.addAndGet(c2554zk, 1L) & 4611686018427387904L) != 0) {
/* 25 */                while ((atomicLongFieldUpdater.get(c2554zk) & 4611686018427387904L) != 0) {
                        }
                    }
                }

                /* JADX INFO: renamed from: A */
                public final Object m10373A(c10 c10Var, Object obj) {
/* 8 */             C0890er c0890er = new C0890er(1, mz0.m6834b(c10Var));
/* 11 */            c0890er.m3571u();
/* 14 */            Throwable thM10392p = m10392p();
/* 18 */            m42 m42Var = o42.f14612b;
/* 25 */            c0890er.resumeWith(new n42(thM10392p));
/* 28 */            Object objM3569s = c0890er.m3569s();
                    return objM3569s == z10.f19902a ? objM3569s : Unit.f12910a;
                }

                /* JADX INFO: renamed from: C */
                public final void m10374C(e63 e63Var, boolean z) {
/* 3 */             if (e63Var instanceof InterfaceC0853dr) {
/* 5 */                 c10 c10Var = (c10) e63Var;
/* 7 */                 m42 m42Var = o42.f14612b;
/* 25 */                c10Var.resumeWith(new n42(z ? m10391o() : m10392p()));
/* 28 */                return;
                    }
/* 31 */            if (!(e63Var instanceof C2501yk)) {
/* 76 */                ds0.m3201r(e63Var, "Unexpected waiter: ");
/* 79 */                return;
                    }
/* 33 */            C2501yk c2501yk = (C2501yk) e63Var;
/* 35 */            C0890er c0890er = c2501yk.f19668b;
/* 37 */            c0890er.getClass();
/* 41 */            c2501yk.f19668b = null;
/* 45 */            c2501yk.f19667a = AbstractC0184bl.f2507l;
/* 49 */            Throwable thM10390n = c2501yk.f19669c.m10390n();
/* 53 */            if (thM10390n == null) {
/* 55 */                m42 m42Var2 = o42.f14612b;
/* 59 */                c0890er.resumeWith(Boolean.FALSE);
                    } else {
/* 63 */                m42 m42Var3 = o42.f14612b;
/* 70 */                c0890er.resumeWith(new n42(thM10390n));
                    }
                }

                /* JADX INFO: renamed from: E */
                public final Object m10375E() {
                    C0929ft c0929ft;
/* 1 */             C0892et c0892et = b40.f2200a;
/* 3 */             AtomicLongFieldUpdater atomicLongFieldUpdater = f20217c;
/* 5 */             long j = atomicLongFieldUpdater.get(this);
/* 9 */             AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20216b;
/* 11 */            long j2 = atomicLongFieldUpdater2.get(this);
/* 20 */            if (m10397v(j2, true)) {
/* 28 */                return new C0855dt(m10390n());
                    }
/* 40 */            if (j >= (j2 & 1152921504606846975L)) {
/* 42 */                return c0892et;
                    }
/* 43 */            Object obj = AbstractC0184bl.f2506k;
/* 47 */            f20221i.getClass();
/* 58 */            C0929ft c0929ft2 = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(this, f20214Y);
/* 68 */            while (!this.m10397v(atomicLongFieldUpdater2.get(this), true)) {
/* 80 */                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
/* 84 */                long j3 = AbstractC0184bl.f2497b;
/* 87 */                long j4 = andIncrement / j3;
/* 91 */                int i = (int) (andIncrement % j3);
/* 96 */                if (c0929ft2.f16473e != j4) {
/* 98 */                    C0929ft c0929ftM10388l = this.m10388l(j4, c0929ft2);
/* 102 */                   if (c0929ftM10388l == null) {
                                continue;
                            } else {
/* 105 */                       c0929ft = c0929ftM10388l;
                            }
                        } else {
/* 108 */                   c0929ft = c0929ft2;
                        }
/* 106 */               C2554zk c2554zk = this;
/* 110 */               Object objM10378I = c2554zk.m10378I(c0929ft, i, andIncrement, obj);
/* 114 */               c0929ft2 = c0929ft;
/* 118 */               if (objM10378I == AbstractC0184bl.f2508m) {
/* 125 */                   e63 e63Var = obj instanceof e63 ? (e63) obj : null;
/* 127 */                   if (e63Var != null) {
/* 129 */                       e63Var.mo3335a(c0929ft2, i);
                            }
/* 132 */                   c2554zk.m10380K(andIncrement);
/* 135 */                   c0929ft2.m8433n();
/* 138 */                   return c0892et;
                        }
/* 141 */               if (objM10378I != AbstractC0184bl.f2510o) {
/* 158 */                   if (objM10378I != AbstractC0184bl.f2509n) {
/* 160 */                       c0929ft2.m8323b();
/* 163 */                       return objM10378I;
                            }
/* 166 */                   f42.m3656l("unexpected");
/* 117 */                   return null;
                        }
/* 149 */               if (andIncrement < c2554zk.m10393q()) {
/* 151 */                   c0929ft2.m8323b();
                        }
/* 154 */               this = c2554zk;
                    }
/* 76 */            return new C0855dt(this.m10390n());
                }

                /* JADX INFO: renamed from: F */
                public final boolean m10376F(Object obj, Object obj2) {
/* 6 */             if (!(obj instanceof C2501yk)) {
/* 36 */                if (!(obj instanceof InterfaceC0853dr)) {
/* 55 */                    ds0.m3201r(obj, "Unexpected receiver type: ");
/* 3 */                     return false;
                        }
/* 38 */                InterfaceC0853dr interfaceC0853dr = (InterfaceC0853dr) obj;
/* 40 */                C0929ft c0929ft = AbstractC0184bl.f2496a;
/* 42 */                C2131r4 c2131r4Mo3178b = interfaceC0853dr.mo3178b(obj2, null);
/* 46 */                if (c2131r4Mo3178b == null) {
/* 3 */                     return false;
                        }
/* 48 */                interfaceC0853dr.mo3180f(c2131r4Mo3178b);
/* 4 */                 return true;
                    }
/* 8 */             C2501yk c2501yk = (C2501yk) obj;
/* 10 */            C0890er c0890er = c2501yk.f19668b;
/* 12 */            c0890er.getClass();
/* 15 */            c2501yk.f19668b = null;
/* 17 */            c2501yk.f19667a = obj2;
/* 19 */            Boolean bool = Boolean.TRUE;
/* 21 */            C0929ft c0929ft2 = AbstractC0184bl.f2496a;
/* 23 */            C2131r4 c2131r4Mo3178b2 = c0890er.mo3178b(bool, null);
/* 27 */            if (c2131r4Mo3178b2 == null) {
/* 3 */                 return false;
                    }
/* 29 */            c0890er.mo3180f(c2131r4Mo3178b2);
/* 4 */             return true;
                }

                /* JADX INFO: renamed from: H */
                public final Object m10377H(Object obj) {
                    C0929ft c0929ftM10389m;
/* 1 */             Object obj2 = AbstractC0184bl.f2499d;
/* 5 */             f20220f.getClass();
/* 16 */            C0929ft c0929ft = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(this, f20215Z);
                    while (true) {
/* 20 */                long andIncrement = f20216b.getAndIncrement(this);
/* 29 */                long j = andIncrement & 1152921504606846975L;
/* 32 */                boolean zM10397v = this.m10397v(andIncrement, false);
/* 36 */                int i = AbstractC0184bl.f2497b;
                        long j2 = i;
/* 39 */                long j3 = j / j2;
/* 43 */                int i2 = (int) (j % j2);
/* 48 */                if (c0929ft.f16473e != j3) {
/* 50 */                    c0929ftM10389m = this.m10389m(j3, c0929ft);
/* 54 */                    if (c0929ftM10389m == null) {
/* 56 */                        if (zM10397v) {
/* 64 */                            return new C0855dt(this.m10392p());
                                }
                            }
                        } else {
/* 72 */                    c0929ftM10389m = c0929ft;
                        }
/* 70 */                Object obj3 = obj;
/* 76 */                int iM10371c = m10371c(this, c0929ftM10389m, i2, obj3, j, obj2, zM10397v);
/* 80 */                C2554zk c2554zk = this;
/* 81 */                c0929ft = c0929ftM10389m;
/* 82 */                if (iM10371c == 0) {
/* 179 */                   c0929ft.m8323b();
/* 182 */                   return Unit.f12910a;
                        }
/* 85 */                if (iM10371c == 1) {
/* 176 */                   return Unit.f12910a;
                        }
/* 89 */                if (iM10371c == 2) {
/* 136 */                   if (zM10397v) {
/* 138 */                       c0929ft.m8433n();
/* 147 */                       return new C0855dt(c2554zk.m10392p());
                            }
/* 156 */                   e63 e63Var = obj2 instanceof e63 ? (e63) obj2 : null;
/* 158 */                   if (e63Var != null) {
/* 162 */                       e63Var.mo3335a(c0929ft, i2 + i);
                            }
/* 170 */                   c2554zk.m10385i((c0929ft.f16473e * j2) + ((long) i2));
/* 173 */                   return Unit.f12910a;
                        }
/* 92 */                if (iM10371c == 3) {
/* 132 */                   f42.m3656l("unexpected");
/* 88 */                    return null;
                        }
/* 95 */                if (iM10371c == 4) {
/* 115 */                   if (j < f20217c.get(c2554zk)) {
/* 117 */                       c0929ft.m8323b();
                            }
/* 126 */                   return new C0855dt(c2554zk.m10392p());
                        }
/* 98 */                if (iM10371c == 5) {
/* 101 */                   c0929ft.m8323b();
                        }
/* 104 */               this = c2554zk;
/* 105 */               obj = obj3;
                    }
                }

                /* JADX INFO: renamed from: I */
                public final Object m10378I(C0929ft c0929ft, int i, long j, Object obj) {
/* 1 */             AtomicReferenceArray atomicReferenceArray = c0929ft.f8345h;
/* 3 */             Object objM3831q = c0929ft.m3831q(i);
/* 13 */            AtomicLongFieldUpdater atomicLongFieldUpdater = f20216b;
/* 15 */            if (objM3831q == null) {
/* 24 */                if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
/* 26 */                    if (obj == null) {
/* 28 */                        return AbstractC0184bl.f2509n;
                            }
/* 35 */                    if (c0929ft.m3830p(i, objM3831q, obj)) {
/* 37 */                        m10386j();
/* 40 */                        return AbstractC0184bl.f2508m;
                            }
                        }
                    } else if (objM3831q == AbstractC0184bl.f2499d && c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2504i)) {
/* 55 */                m10386j();
/* 60 */                Object obj2 = atomicReferenceArray.get(i * 2);
/* 64 */                c0929ft.m3833s(i, null);
/* 67 */                return obj2;
                    }
                    while (true) {
/* 68 */                Object objM3831q2 = c0929ft.m3831q(i);
/* 72 */                if (objM3831q2 == null || objM3831q2 == AbstractC0184bl.f2500e) {
/* 193 */                   if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
/* 201 */                       if (c0929ft.m3830p(i, objM3831q2, AbstractC0184bl.f2503h)) {
/* 203 */                           m10386j();
/* 206 */                           return AbstractC0184bl.f2510o;
                                }
                            } else {
/* 209 */                       if (obj == null) {
/* 211 */                           return AbstractC0184bl.f2509n;
                                }
/* 218 */                       if (c0929ft.m3830p(i, objM3831q2, obj)) {
/* 220 */                           m10386j();
/* 223 */                           return AbstractC0184bl.f2508m;
                                }
                            }
                        } else if (objM3831q2 != AbstractC0184bl.f2499d) {
/* 104 */                   C2131r4 c2131r4 = AbstractC0184bl.f2505j;
/* 106 */                   if (objM3831q2 == c2131r4) {
/* 108 */                       return AbstractC0184bl.f2510o;
                            }
/* 113 */                   if (objM3831q2 == AbstractC0184bl.f2503h) {
/* 115 */                       return AbstractC0184bl.f2510o;
                            }
/* 120 */                   if (objM3831q2 == AbstractC0184bl.f2507l) {
/* 122 */                       m10386j();
/* 125 */                       return AbstractC0184bl.f2510o;
                            }
/* 130 */                   if (objM3831q2 != AbstractC0184bl.f2502g && c0929ft.m3830p(i, objM3831q2, AbstractC0184bl.f2501f)) {
/* 140 */                       boolean z = objM3831q2 instanceof f63;
/* 142 */                       if (z) {
/* 146 */                           objM3831q2 = ((f63) objM3831q2).f8028a;
                                }
/* 152 */                       if (m10369G(objM3831q2)) {
/* 156 */                           c0929ft.m3834t(i, AbstractC0184bl.f2504i);
/* 159 */                           m10386j();
/* 164 */                           Object obj3 = atomicReferenceArray.get(i * 2);
/* 168 */                           c0929ft.m3833s(i, null);
/* 171 */                           return obj3;
                                }
/* 172 */                       c0929ft.m3834t(i, c2131r4);
/* 175 */                       c0929ft.m8433n();
/* 178 */                       if (z) {
/* 180 */                           m10386j();
                                }
/* 183 */                       return AbstractC0184bl.f2510o;
                            }
                        } else if (c0929ft.m3830p(i, objM3831q2, AbstractC0184bl.f2504i)) {
/* 91 */                    m10386j();
/* 96 */                    Object obj4 = atomicReferenceArray.get(i * 2);
/* 100 */                   c0929ft.m3833s(i, null);
/* 103 */                   return obj4;
                        }
                    }
                }

                /* JADX INFO: renamed from: J */
                public final int m10379J(C0929ft c0929ft, int i, Object obj, long j, Object obj2, boolean z) {
                    while (true) {
/* 1 */                 Object objM3831q = c0929ft.m3831q(i);
/* 8 */                 if (objM3831q == null) {
/* 14 */                    if (!m10381d(j) || z) {
/* 27 */                        if (z) {
/* 35 */                            if (c0929ft.m3830p(i, null, AbstractC0184bl.f2505j)) {
/* 37 */                                c0929ft.m8433n();
/* 5 */                                 return 4;
                                    }
                                } else {
/* 41 */                            if (obj2 == null) {
/* 43 */                                return 3;
                                    }
/* 49 */                            if (c0929ft.m3830p(i, null, obj2)) {
/* 51 */                                return 2;
                                    }
                                }
                            } else if (c0929ft.m3830p(i, null, AbstractC0184bl.f2499d)) {
                                break;
                            }
                        } else {
/* 55 */                    if (objM3831q != AbstractC0184bl.f2500e) {
/* 66 */                        C2131r4 c2131r4 = AbstractC0184bl.f2506k;
/* 69 */                        if (objM3831q == c2131r4) {
/* 71 */                            c0929ft.m3833s(i, null);
/* 68 */                            return 5;
                                }
/* 77 */                        if (objM3831q == AbstractC0184bl.f2503h) {
/* 79 */                            c0929ft.m3833s(i, null);
/* 68 */                            return 5;
                                }
/* 85 */                        if (objM3831q == AbstractC0184bl.f2507l) {
/* 87 */                            c0929ft.m3833s(i, null);
/* 90 */                            m10398w();
/* 5 */                             return 4;
                                }
/* 94 */                        c0929ft.m3833s(i, null);
/* 99 */                        if (objM3831q instanceof f63) {
/* 103 */                           objM3831q = ((f63) objM3831q).f8028a;
                                }
/* 109 */                       if (m10376F(objM3831q, obj)) {
/* 113 */                           c0929ft.m3834t(i, AbstractC0184bl.f2504i);
/* 116 */                           return 0;
                                }
/* 127 */                       if (c0929ft.f8345h.getAndSet((i * 2) + 1, c2131r4) != c2131r4) {
/* 129 */                           c0929ft.m3832r(i, true);
                                }
/* 68 */                        return 5;
                            }
/* 63 */                    if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2499d)) {
                                break;
                            }
                        }
                    }
/* 6 */             return 1;
                }

                /* JADX INFO: renamed from: K */
                public final void m10380K(long j) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater;
/* 1 */             C2554zk c2554zk = this;
/* 7 */             if (c2554zk.m10399y()) {
/* 121 */               return;
                    }
                    while (true) {
/* 11 */                atomicLongFieldUpdater = f20218d;
/* 19 */                if (atomicLongFieldUpdater.get(c2554zk) > j) {
                            break;
                        } else {
/* 141 */                   c2554zk = this;
                        }
                    }
/* 21 */            int i = AbstractC0184bl.f2498c;
/* 24 */            int i2 = 0;
                    while (true) {
/* 25 */                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20219e;
/* 32 */                if (i2 < i) {
/* 34 */                    long j2 = atomicLongFieldUpdater.get(c2554zk);
/* 45 */                    if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c2554zk)) && j2 == atomicLongFieldUpdater.get(c2554zk)) {
/* 121 */                       return;
                            } else {
/* 56 */                        i2++;
                            }
                        } else {
                            while (true) {
/* 60 */                        long j3 = atomicLongFieldUpdater2.get(c2554zk);
/* 73 */                        if (atomicLongFieldUpdater2.compareAndSet(c2554zk, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                                    break;
                                } else {
/* 138 */                           c2554zk = this;
                                }
                            }
                            while (true) {
/* 75 */                        long j4 = atomicLongFieldUpdater.get(c2554zk);
/* 80 */                        long j5 = atomicLongFieldUpdater2.get(c2554zk);
/* 84 */                        long j6 = j5 & 4611686018427387903L;
/* 96 */                        boolean z = (j5 & 4611686018427387904L) != 0;
/* 99 */                        if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c2554zk)) {
                                    break;
                                }
/* 125 */                       if (z) {
/* 135 */                           c2554zk = this;
                                } else {
/* 129 */                           c2554zk = this;
/* 131 */                           atomicLongFieldUpdater2.compareAndSet(c2554zk, j5, 4611686018427387904L + j6);
                                }
                            }
                            while (true) {
/* 109 */                       long j7 = atomicLongFieldUpdater2.get(c2554zk);
/* 119 */                       if (atomicLongFieldUpdater2.compareAndSet(c2554zk, j7, j7 & 4611686018427387903L)) {
/* 121 */                           return;
                                } else {
/* 122 */                           c2554zk = this;
                                }
                            }
                        }
                    }
                }

                @Override // p000.m92
                /* JADX INFO: renamed from: a */
                public Object mo6628a(c10 c10Var, Object obj) {
/* 1 */             return m10368D(this, obj, c10Var);
                }

                @Override // p000.InterfaceC2509ys
                public final void cancel(CancellationException cancellationException) {
/* 1 */             if (cancellationException == null) {
/* 7 */                 cancellationException = new CancellationException("Channel was cancelled");
                    }
/* 11 */            m10383g(true, cancellationException);
                }

                /* JADX INFO: renamed from: d */
                public final boolean m10381d(long j) {
                    return j < f20218d.get(this) || j < f20217c.get(this) + ((long) this.f20224a);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x006d  */
                /* JADX WARN: Code duplicated, block: B:23:0x0070  */
                /* JADX WARN: Code duplicated, block: B:25:0x0074  */
                /* JADX WARN: Code duplicated, block: B:27:0x0077  */
                /* JADX WARN: Code duplicated, block: B:29:0x007a  */
                /* JADX WARN: Code duplicated, block: B:32:0x007e  */
                /* JADX WARN: Code duplicated, block: B:36:0x008e  */
                /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
                /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
                /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:56:0x00c4 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:57:0x00c1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:59:0x009b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
                /* JADX WARN: Instruction removed from duplicated block: B:23:0x0070, please report this as an issue */
                @Override // p000.m92
                /* JADX INFO: renamed from: e */
                public Object mo6629e(Object obj) {
                    int iM10371c;
                    e63 e63Var;
/* 1 */             C0892et c0892et = b40.f2200a;
/* 3 */             AtomicLongFieldUpdater atomicLongFieldUpdater = f20216b;
/* 5 */             long j = atomicLongFieldUpdater.get(this);
/* 9 */             boolean z = false;
/* 15 */            long j2 = 1152921504606846975L;
/* 30 */            if (m10397v(j, false) ? false : !m10381d(j & 1152921504606846975L)) {
/* 32 */                return c0892et;
                    }
/* 33 */            Object obj2 = AbstractC0184bl.f2505j;
/* 37 */            f20220f.getClass();
/* 48 */            C0929ft c0929ft = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(this, f20215Z);
                    while (true) {
/* 50 */                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
/* 54 */                long j3 = andIncrement & j2;
/* 56 */                boolean zM10397v = m10397v(andIncrement, z);
/* 60 */                int i = AbstractC0184bl.f2497b;
                        long j4 = i;
/* 63 */                long j5 = j3 / j4;
/* 67 */                int i2 = (int) (j3 % j4);
/* 72 */                if (c0929ft.f16473e == j5) {
/* 104 */                   iM10371c = m10371c(this, c0929ft, i2, obj, j3, obj2, zM10397v);
/* 108 */                   if (iM10371c != 0) {
/* 197 */                       c0929ft.m8323b();
/* 200 */                       return Unit.f12910a;
                            }
/* 111 */                   if (iM10371c != 1) {
/* 194 */                       return Unit.f12910a;
                            }
/* 115 */                   if (iM10371c != 2) {
/* 162 */                       if (zM10397v) {
/* 164 */                           c0929ft.m8433n();
/* 173 */                           return new C0855dt(m10392p());
                                }
/* 182 */                       e63Var = obj2 instanceof e63 ? (e63) obj2 : null;
/* 184 */                       if (e63Var != null) {
/* 187 */                           e63Var.mo3335a(c0929ft, i2 + i);
                                }
/* 190 */                       c0929ft.m8433n();
/* 193 */                       return c0892et;
                            }
/* 118 */                   if (iM10371c != 3) {
/* 158 */                       f42.m3656l("unexpected");
/* 114 */                       return null;
                            }
/* 121 */                   if (iM10371c != 4) {
/* 141 */                       if (j3 < f20217c.get(this)) {
/* 143 */                           c0929ft.m8323b();
                                }
/* 152 */                       return new C0855dt(m10392p());
                            }
/* 124 */                   if (iM10371c == 5) {
/* 127 */                       c0929ft.m8323b();
                            }
/* 131 */                   z = false;
                        } else {
/* 74 */                    C0929ft c0929ftM10389m = m10389m(j5, c0929ft);
/* 78 */                    if (c0929ftM10389m != null) {
/* 100 */                       c0929ft = c0929ftM10389m;
/* 104 */                       iM10371c = m10371c(this, c0929ft, i2, obj, j3, obj2, zM10397v);
/* 108 */                       if (iM10371c != 0) {
/* 197 */                           c0929ft.m8323b();
/* 200 */                           return Unit.f12910a;
                                }
/* 111 */                       if (iM10371c != 1) {
/* 194 */                           return Unit.f12910a;
                                }
/* 115 */                       if (iM10371c != 2) {
/* 162 */                           if (zM10397v) {
/* 164 */                               c0929ft.m8433n();
/* 173 */                               return new C0855dt(m10392p());
                                    }
/* 182 */                           if (obj2 instanceof e63) {
                                    }
/* 184 */                           if (e63Var != null) {
/* 187 */                               e63Var.mo3335a(c0929ft, i2 + i);
                                    }
/* 190 */                           c0929ft.m8433n();
/* 193 */                           return c0892et;
                                }
/* 118 */                       if (iM10371c != 3) {
/* 158 */                           f42.m3656l("unexpected");
/* 114 */                           return null;
                                }
/* 121 */                       if (iM10371c != 4) {
/* 141 */                           if (j3 < f20217c.get(this)) {
/* 143 */                               c0929ft.m8323b();
                                    }
/* 152 */                           return new C0855dt(m10392p());
                                }
/* 124 */                       if (iM10371c == 5) {
/* 127 */                           c0929ft.m8323b();
                                }
/* 131 */                       z = false;
                            } else {
/* 80 */                        if (zM10397v) {
/* 88 */                            return new C0855dt(m10392p());
                                }
/* 92 */                        z = false;
                            }
                        }
/* 94 */                j2 = 1152921504606846975L;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final C0929ft m10382f() {
/* 3 */             f20222v.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */            Object objectVolatile = unsafe.getObjectVolatile(this, f20212W);
/* 16 */            f20220f.getClass();
/* 25 */            C0929ft c0929ft = (C0929ft) unsafe.getObjectVolatile(this, f20215Z);
/* 36 */            if (c0929ft.f16473e > ((C0929ft) objectVolatile).f16473e) {
/* 38 */                objectVolatile = c0929ft;
                    }
/* 41 */            f20221i.getClass();
/* 50 */            C0929ft c0929ft2 = (C0929ft) unsafe.getObjectVolatile(this, f20214Y);
/* 61 */            if (c0929ft2.f16473e > ((C0929ft) objectVolatile).f16473e) {
/* 63 */                objectVolatile = c0929ft2;
                    }
/* 64 */            AbstractC2161ry abstractC2161ry = (AbstractC2161ry) objectVolatile;
                    while (true) {
/* 66 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC2161ry.f16345a;
/* 68 */                Object objM8326e = abstractC2161ry.m8326e();
/* 74 */                if (objM8326e == hu0.f9293a) {
                            break;
                        }
/* 77 */                AbstractC2161ry abstractC2161ry2 = (AbstractC2161ry) objM8326e;
/* 79 */                if (abstractC2161ry2 != null) {
/* 90 */                    abstractC2161ry = abstractC2161ry2;
                        } else if (abstractC2161ry.m8329h()) {
                            break;
                        }
                    }
/* 87 */            return (C0929ft) abstractC2161ry;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m10383g(boolean z, Throwable th) {
                    C2554zk c2554zk;
                    boolean z2;
                    long j;
                    long j2;
                    long j3;
/* 8 */             AtomicLongFieldUpdater atomicLongFieldUpdater = f20216b;
/* 10 */            if (!z) {
/* 38 */                c2554zk = this;
                        break;
                    }
                    while (true) {
/* 12 */                long j4 = atomicLongFieldUpdater.get(this);
/* 19 */                if (((int) (j4 >> 60)) != 0) {
/* 38 */                    c2554zk = this;
                            break;
                        }
/* 23 */                C0929ft c0929ft = AbstractC0184bl.f2496a;
/* 28 */                c2554zk = this;
/* 33 */                if (atomicLongFieldUpdater.compareAndSet(c2554zk, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                            break;
                        }
/* 36 */                this = c2554zk;
                    }
/* 39 */            C2131r4 c2131r4 = AbstractC0184bl.f2514s;
                    while (true) {
/* 43 */                f20223w.getClass();
/* 46 */                C2554zk c2554zk2 = c2554zk;
/* 47 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 49 */                long j5 = f20211V;
/* 51 */                Throwable th2 = th;
/* 52 */                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c2554zk2, j5, c2131r4, th2);
/* 57 */                c2554zk = c2554zk2;
/* 59 */                if (zCompareAndSwapObject) {
/* 61 */                    z2 = true;
                            break;
                        }
/* 67 */                if (unsafe.getObjectVolatile(c2554zk, j5) != c2131r4) {
/* 69 */                    z2 = false;
                            break;
                        }
/* 127 */               th = th2;
                    }
/* 72 */            if (z) {
/* 86 */                do {
/* 74 */                    j3 = atomicLongFieldUpdater.get(c2554zk);
/* 86 */                } while (!atomicLongFieldUpdater.compareAndSet(c2554zk, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
                    } else {
/* 116 */               do {
/* 89 */                    j = atomicLongFieldUpdater.get(c2554zk);
/* 95 */                    int i = (int) (j >> 60);
/* 96 */                    if (i == 0) {
/* 110 */                       j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                            } else {
/* 98 */                        if (i != 1) {
                                    break;
                                }
/* 103 */                       j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                            }
/* 116 */               } while (!atomicLongFieldUpdater.compareAndSet(c2554zk, j, j2));
                    }
/* 118 */           c2554zk.m10398w();
/* 121 */           if (z2) {
/* 123 */               c2554zk.m10395t();
                    }
/* 126 */           return z2;
                }

                /* JADX INFO: renamed from: h */
                public final C0929ft m10384h(long j) {
                    long j2;
/* 1 */             C0929ft c0929ftM10382f = m10382f();
/* 11 */            if (mo9652x()) {
/* 13 */                C0929ft c0929ft = c0929ftM10382f;
                        loop0: while (true) {
/* 16 */                    int i = AbstractC0184bl.f2497b - 1;
                            while (true) {
/* 19 */                        if (-1 < i) {
/* 28 */                            j2 = (c0929ft.f16473e * ((long) AbstractC0184bl.f2497b)) + ((long) i);
/* 37 */                            if (j2 >= f20217c.get(this)) {
                                        while (true) {
/* 41 */                                    Object objM3831q = c0929ft.m3831q(i);
/* 45 */                                    if (objM3831q != null && objM3831q != AbstractC0184bl.f2500e) {
/* 54 */                                        if (objM3831q != AbstractC0184bl.f2499d) {
                                                    break;
                                                }
                                                break loop0;
                                            }
/* 63 */                                    if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2507l)) {
/* 65 */                                        c0929ft.m8433n();
                                                break;
                                            }
                                        }
/* 68 */                                i--;
                                    }
                                } else {
/* 75 */                            c0929ft = (C0929ft) c0929ft.m8327f();
/* 77 */                            if (c0929ft == null) {
                                    }
                                }
/* 39 */                        j2 = -1;
                                break loop0;
                            }
                        }
/* 82 */                if (j2 != -1) {
/* 84 */                    m10385i(j2);
                        }
                    }
/* 87 */            Object objM5952F = null;
/* 89 */            loop3: for (C0929ft c0929ft2 = c0929ftM10382f; c0929ft2 != null; c0929ft2 = (C0929ft) c0929ft2.m8327f()) {
/* 94 */                for (int i2 = AbstractC0184bl.f2497b - 1; -1 < i2; i2--) {
/* 106 */                   if ((c0929ft2.f16473e * ((long) AbstractC0184bl.f2497b)) + ((long) i2) < j) {
                                break loop3;
                            }
                            while (true) {
/* 108 */                       Object objM3831q2 = c0929ft2.m3831q(i2);
/* 112 */                       if (objM3831q2 != null && objM3831q2 != AbstractC0184bl.f2500e) {
/* 121 */                           if (!(objM3831q2 instanceof f63)) {
/* 145 */                               if (!(objM3831q2 instanceof e63)) {
                                            break;
                                        }
/* 153 */                               if (c0929ft2.m3830p(i2, objM3831q2, AbstractC0184bl.f2507l)) {
/* 155 */                                   objM5952F = k50.m5952F(objM5952F, objM3831q2);
/* 159 */                                   c0929ft2.m3832r(i2, true);
                                            break;
                                        }
                                    } else {
/* 129 */                               if (c0929ft2.m3830p(i2, objM3831q2, AbstractC0184bl.f2507l)) {
/* 135 */                                   objM5952F = k50.m5952F(objM5952F, ((f63) objM3831q2).f8028a);
/* 139 */                                   c0929ft2.m3832r(i2, true);
                                            break;
                                        }
                                    }
                                } else {
/* 169 */                           if (c0929ft2.m3830p(i2, objM3831q2, AbstractC0184bl.f2507l)) {
/* 171 */                               c0929ft2.m8433n();
                                        break;
                                    }
                                }
                            }
                        }
                    }
/* 184 */           if (objM5952F != null) {
/* 188 */               if (!(objM5952F instanceof ArrayList)) {
/* 192 */                   m10374C((e63) objM5952F, true);
/* 195 */                   return c0929ftM10382f;
                        }
/* 196 */               ArrayList arrayList = (ArrayList) objM5952F;
/* 203 */               for (int size = arrayList.size() - 1; -1 < size; size--) {
/* 211 */                   m10374C((e63) arrayList.get(size), true);
                        }
                    }
/* 217 */           return c0929ftM10382f;
                }

                /* JADX INFO: renamed from: i */
                public final void m10385i(long j) {
/* 3 */             f20221i.getClass();
/* 14 */            C0929ft c0929ft = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(this, f20214Y);
                    while (true) {
/* 16 */                AtomicLongFieldUpdater atomicLongFieldUpdater = f20217c;
/* 18 */                long j2 = atomicLongFieldUpdater.get(this);
/* 38 */                if (j < Math.max(((long) this.f20224a) + j2, f20218d.get(this))) {
/* 40 */                    return;
                        }
/* 44 */                this = this;
/* 49 */                if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
/* 51 */                    long j3 = AbstractC0184bl.f2497b;
/* 54 */                    long j4 = j2 / j3;
/* 58 */                    int i = (int) (j2 % j3);
/* 63 */                    if (c0929ft.f16473e != j4) {
/* 65 */                        C0929ft c0929ftM10388l = this.m10388l(j4, c0929ft);
/* 69 */                        if (c0929ftM10388l != null) {
/* 72 */                            c0929ft = c0929ftM10388l;
                                }
                            }
/* 76 */                    C0929ft c0929ft2 = c0929ft;
/* 83 */                    if (this.m10378I(c0929ft2, i, j2, null) != AbstractC0184bl.f2510o || j2 < this.m10393q()) {
/* 93 */                        c0929ft2.m8323b();
                            }
/* 101 */                   c0929ft = c0929ft2;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
                /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
                /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
                /* JADX INFO: renamed from: j */
                public final void m10386j() {
                    int i;
                    boolean z;
                    AtomicLongFieldUpdater atomicLongFieldUpdater;
                    Object objM3831q;
/* 5 */             if (m10399y()) {
/* 7 */                 return;
                    }
/* 10 */            f20222v.getClass();
/* 21 */            C0929ft c0929ft = (C0929ft) AbstractC1703b.f11726a.getObjectVolatile(this, f20212W);
                    while (true) {
/* 26 */                long andIncrement = f20218d.getAndIncrement(this);
/* 30 */                long j = AbstractC0184bl.f2497b;
/* 33 */                long j2 = andIncrement / j;
/* 41 */                if (this.m10393q() <= andIncrement) {
/* 47 */                    if (c0929ft.f16473e < j2 && c0929ft.m8325d() != null) {
/* 55 */                        this.m10400z(j2, c0929ft);
                            }
/* 58 */                    m10372s(this);
/* 61 */                    return;
                        }
/* 66 */                C2554zk c2554zk = this;
/* 67 */                if (c0929ft.f16473e == j2) {
/* 80 */                    i = (int) (andIncrement % j);
/* 81 */                    Object objM3831q2 = c0929ft.m3831q(i);
/* 85 */                    z = objM3831q2 instanceof e63;
/* 87 */                    atomicLongFieldUpdater = f20217c;
/* 89 */                    if (z || andIncrement < atomicLongFieldUpdater.get(c2554zk) || !c0929ft.m3830p(i, objM3831q2, AbstractC0184bl.f2502g)) {
                                while (true) {
/* 129 */                           objM3831q = c0929ft.m3831q(i);
/* 135 */                           if (objM3831q instanceof e63) {
/* 143 */                               if (andIncrement < atomicLongFieldUpdater.get(c2554zk)) {
/* 157 */                                   if (c0929ft.m3830p(i, objM3831q, new f63((e63) objM3831q))) {
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
                                        } else if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2502g)) {
/* 172 */                                   if (!m10369G(objM3831q)) {
/* 182 */                                       c0929ft.m3834t(i, AbstractC0184bl.f2505j);
/* 185 */                                       c0929ft.m8433n();
                                                break;
                                            } else {
/* 176 */                                       c0929ft.m3834t(i, AbstractC0184bl.f2499d);
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
                                        }
                                    } else {
/* 191 */                               if (objM3831q == AbstractC0184bl.f2505j) {
                                            break;
                                        }
/* 197 */                               if (objM3831q == null) {
/* 205 */                                   if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2500e)) {
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
                                        } else if (objM3831q != AbstractC0184bl.f2499d || objM3831q == AbstractC0184bl.f2503h || objM3831q == AbstractC0184bl.f2504i || objM3831q == AbstractC0184bl.f2506k || objM3831q == AbstractC0184bl.f2507l) {
/* 242 */                                   m10372s(c2554zk);
/* 245 */                                   return;
                                        } else if (objM3831q != AbstractC0184bl.f2501f) {
/* 238 */                                   ds0.m3201r(objM3831q, "Unexpected cell state: ");
/* 241 */                                   return;
                                        }
                                    }
                                }
/* 193 */                       m10372s(c2554zk);
                            } else if (m10369G(objM3831q2)) {
/* 115 */                       c0929ft.m3834t(i, AbstractC0184bl.f2499d);
/* 242 */                       m10372s(c2554zk);
/* 245 */                       return;
                            } else {
/* 122 */                       c0929ft.m3834t(i, AbstractC0184bl.f2505j);
/* 125 */                       c0929ft.m8433n();
/* 193 */                       m10372s(c2554zk);
                            }
                        } else {
/* 69 */                    C0929ft c0929ftM10387k = c2554zk.m10387k(j2, c0929ft, andIncrement);
/* 73 */                    if (c0929ftM10387k == null) {
                                continue;
                            } else {
/* 77 */                        c0929ft = c0929ftM10387k;
/* 80 */                        i = (int) (andIncrement % j);
/* 81 */                        Object objM3831q3 = c0929ft.m3831q(i);
/* 85 */                        z = objM3831q3 instanceof e63;
/* 87 */                        atomicLongFieldUpdater = f20217c;
/* 89 */                        if (z) {
                                    while (true) {
/* 129 */                               objM3831q = c0929ft.m3831q(i);
/* 135 */                               if (objM3831q instanceof e63) {
/* 143 */                                   if (andIncrement < atomicLongFieldUpdater.get(c2554zk)) {
/* 157 */                                       if (c0929ft.m3830p(i, objM3831q, new f63((e63) objM3831q))) {
/* 242 */                                           m10372s(c2554zk);
/* 245 */                                           return;
                                                }
                                            } else if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2502g)) {
/* 172 */                                       if (!m10369G(objM3831q)) {
/* 182 */                                           c0929ft.m3834t(i, AbstractC0184bl.f2505j);
/* 185 */                                           c0929ft.m8433n();
                                                    break;
                                                } else {
/* 176 */                                           c0929ft.m3834t(i, AbstractC0184bl.f2499d);
/* 242 */                                           m10372s(c2554zk);
/* 245 */                                           return;
                                                }
                                            }
                                        } else {
/* 191 */                                   if (objM3831q == AbstractC0184bl.f2505j) {
                                                break;
                                                break;
                                            }
/* 197 */                                   if (objM3831q == null) {
/* 210 */                                       if (objM3831q != AbstractC0184bl.f2499d) {
/* 233 */                                           if (objM3831q != AbstractC0184bl.f2501f) {
/* 238 */                                               ds0.m3201r(objM3831q, "Unexpected cell state: ");
/* 241 */                                               return;
                                                    }
                                                }
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
/* 205 */                                   if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2500e)) {
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
                                        }
                                    }
/* 193 */                           m10372s(c2554zk);
                                } else {
                                    while (true) {
/* 129 */                               objM3831q = c0929ft.m3831q(i);
/* 135 */                               if (objM3831q instanceof e63) {
/* 143 */                                   if (andIncrement < atomicLongFieldUpdater.get(c2554zk)) {
/* 157 */                                       if (c0929ft.m3830p(i, objM3831q, new f63((e63) objM3831q))) {
/* 242 */                                           m10372s(c2554zk);
/* 245 */                                           return;
                                                }
                                            } else if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2502g)) {
/* 172 */                                       if (!m10369G(objM3831q)) {
/* 182 */                                           c0929ft.m3834t(i, AbstractC0184bl.f2505j);
/* 185 */                                           c0929ft.m8433n();
                                                    break;
                                                } else {
/* 176 */                                           c0929ft.m3834t(i, AbstractC0184bl.f2499d);
/* 242 */                                           m10372s(c2554zk);
/* 245 */                                           return;
                                                }
                                            }
                                        } else {
/* 191 */                                   if (objM3831q == AbstractC0184bl.f2505j) {
                                                break;
                                                break;
                                            }
/* 197 */                                   if (objM3831q == null) {
/* 210 */                                       if (objM3831q != AbstractC0184bl.f2499d) {
/* 233 */                                           if (objM3831q != AbstractC0184bl.f2501f) {
/* 238 */                                               ds0.m3201r(objM3831q, "Unexpected cell state: ");
/* 241 */                                               return;
                                                    }
                                                }
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
/* 205 */                                   if (c0929ft.m3830p(i, objM3831q, AbstractC0184bl.f2500e)) {
/* 242 */                                       m10372s(c2554zk);
/* 245 */                                       return;
                                            }
                                        }
                                    }
/* 193 */                           m10372s(c2554zk);
                                }
                            }
                        }
/* 75 */                this = c2554zk;
                    }
                }

                /* JADX INFO: renamed from: k */
                public final C0929ft m10387k(long j, C0929ft c0929ft, long j2) {
                    Object objM4330Y;
                    Unsafe unsafe;
/* 5 */             C0929ft c0929ft2 = AbstractC0184bl.f2496a;
/* 7 */             C0023al c0023al = C0023al.f323a;
                    loop0: while (true) {
/* 11 */                objM4330Y = hu0.m4330Y(c0929ft, j, c0023al);
/* 19 */                if (!k50.m5949A(objM4330Y)) {
/* 21 */                    s82 s82VarM5986w = k50.m5986w(objM4330Y);
                            while (true) {
/* 27 */                        f20222v.getClass();
/* 30 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 32 */                        long j3 = f20212W;
/* 39 */                        s82 s82Var = (s82) unsafe2.getObjectVolatile(this, j3);
/* 47 */                        if (s82Var.f16473e >= s82VarM5986w.f16473e) {
                                    break loop0;
                                }
/* 54 */                        if (!s82VarM5986w.m8434o()) {
                                    break;
                                }
/* 81 */                        do {
/* 57 */                            unsafe = AbstractC1703b.f11726a;
/* 65 */                            if (unsafe.compareAndSwapObject(this, f20212W, s82Var, s82VarM5986w)) {
/* 71 */                                if (!s82Var.m8432k()) {
                                            break loop0;
                                        }
/* 73 */                                s82Var.m8330i();
                                        break loop0;
                                    }
/* 81 */                        } while (unsafe.getObjectVolatile(this, j3) == s82Var);
/* 87 */                        if (s82VarM5986w.m8432k()) {
/* 89 */                            s82VarM5986w.m8330i();
                                }
                            }
                        } else {
                            break;
                        }
                    }
/* 98 */            if (k50.m5949A(objM4330Y)) {
/* 100 */               m10398w();
/* 103 */               m10400z(j, c0929ft);
/* 106 */               m10372s(this);
/* 97 */                return null;
                    }
/* 114 */           C0929ft c0929ft3 = (C0929ft) k50.m5986w(objM4330Y);
/* 116 */           long j4 = c0929ft3.f16473e;
/* 120 */           if (j4 <= j) {
/* 173 */               return c0929ft3;
                    }
/* 129 */           long j5 = j4 * ((long) AbstractC0184bl.f2497b);
/* 139 */           if (!f20218d.compareAndSet(this, j2 + 1, j5)) {
/* 169 */               m10372s(this);
/* 97 */                return null;
                    }
/* 143 */           AtomicLongFieldUpdater atomicLongFieldUpdater = f20219e;
/* 156 */           if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
/* 165 */               while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                        }
                    }
/* 97 */            return null;
                }

                /* JADX INFO: renamed from: l */
                public final C0929ft m10388l(long j, C0929ft c0929ft) {
                    Object objM4330Y;
                    C0929ft c0929ft2;
                    long j2;
                    Unsafe unsafe;
/* 5 */             C0929ft c0929ft3 = AbstractC0184bl.f2496a;
/* 7 */             C0023al c0023al = C0023al.f323a;
                    loop0: while (true) {
/* 9 */                 objM4330Y = hu0.m4330Y(c0929ft, j, c0023al);
/* 17 */                if (!k50.m5949A(objM4330Y)) {
/* 19 */                    s82 s82VarM5986w = k50.m5986w(objM4330Y);
                            while (true) {
/* 25 */                        f20221i.getClass();
/* 28 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 30 */                        long j3 = f20214Y;
/* 37 */                        s82 s82Var = (s82) unsafe2.getObjectVolatile(this, j3);
/* 45 */                        if (s82Var.f16473e >= s82VarM5986w.f16473e) {
                                    break loop0;
                                }
/* 52 */                        if (!s82VarM5986w.m8434o()) {
                                    break;
                                }
/* 80 */                        do {
/* 55 */                            unsafe = AbstractC1703b.f11726a;
/* 64 */                            if (unsafe.compareAndSwapObject(this, f20214Y, s82Var, s82VarM5986w)) {
/* 70 */                                if (!s82Var.m8432k()) {
                                            break loop0;
                                        }
/* 72 */                                s82Var.m8330i();
                                        break loop0;
                                    }
/* 80 */                        } while (unsafe.getObjectVolatile(this, j3) == s82Var);
/* 86 */                        if (s82VarM5986w.m8432k()) {
/* 88 */                            s82VarM5986w.m8330i();
                                }
                            }
                        } else {
                            break;
                        }
                    }
/* 97 */            if (k50.m5949A(objM4330Y)) {
/* 99 */                m10398w();
/* 114 */               if (c0929ft.f16473e * ((long) AbstractC0184bl.f2497b) < m10393q()) {
/* 116 */                   c0929ft.m8323b();
/* 96 */                    return null;
                        }
                    } else {
/* 125 */               C0929ft c0929ft4 = (C0929ft) k50.m5986w(objM4330Y);
/* 127 */               long j4 = c0929ft4.f16473e;
/* 133 */               if (m10399y() || j > f20218d.get(this) / ((long) AbstractC0184bl.f2497b)) {
/* 218 */                   c0929ft2 = c0929ft4;
                            break;
                        }
                        loop3: while (true) {
/* 151 */                   f20222v.getClass();
/* 154 */                   Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 156 */                   long j5 = f20212W;
/* 163 */                   s82 s82Var2 = (s82) unsafe3.getObjectVolatile(this, j5);
/* 169 */                   if (s82Var2.f16473e >= j4 || !c0929ft4.m8434o()) {
/* 218 */                       c0929ft2 = c0929ft4;
                                break;
                            }
                            while (true) {
/* 177 */                       Unsafe unsafe4 = AbstractC1703b.f11726a;
/* 186 */                       c0929ft2 = c0929ft4;
/* 187 */                       if (unsafe4.compareAndSwapObject(this, f20212W, s82Var2, c0929ft4)) {
/* 193 */                           if (!s82Var2.m8432k()) {
                                        break loop3;
                                    }
/* 195 */                           s82Var2.m8330i();
                                    break loop3;
                                }
/* 203 */                       if (unsafe4.getObjectVolatile(this, j5) != s82Var2) {
                                    break;
                                }
/* 216 */                       c0929ft4 = c0929ft2;
                            }
/* 209 */                   if (c0929ft2.m8432k()) {
/* 211 */                       c0929ft2.m8330i();
                            }
/* 214 */                   c0929ft4 = c0929ft2;
                        }
/* 221 */               if (j4 <= j) {
/* 264 */                   return c0929ft2;
                        }
/* 226 */               long j6 = j4 * ((long) AbstractC0184bl.f2497b);
/* 246 */               do {
/* 230 */                   j2 = f20217c.get(this);
/* 236 */                   if (j2 >= j6) {
                                break;
                            }
/* 246 */               } while (!f20217c.compareAndSet(this, j2, j6));
/* 258 */               if (j4 * ((long) AbstractC0184bl.f2497b) < m10393q()) {
/* 260 */                   c0929ft2.m8323b();
                        }
                    }
/* 96 */            return null;
                }

                /* JADX INFO: renamed from: m */
                public final C0929ft m10389m(long j, C0929ft c0929ft) {
                    Object objM4330Y;
                    long j2;
                    long j3;
                    Unsafe unsafe;
/* 7 */             C0929ft c0929ft2 = AbstractC0184bl.f2496a;
/* 9 */             C0023al c0023al = C0023al.f323a;
                    loop0: while (true) {
/* 11 */                objM4330Y = hu0.m4330Y(c0929ft, j, c0023al);
/* 19 */                if (!k50.m5949A(objM4330Y)) {
/* 21 */                    s82 s82VarM5986w = k50.m5986w(objM4330Y);
                            while (true) {
/* 27 */                        f20220f.getClass();
/* 30 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 32 */                        long j4 = f20215Z;
/* 39 */                        s82 s82Var = (s82) unsafe2.getObjectVolatile(this, j4);
/* 47 */                        if (s82Var.f16473e >= s82VarM5986w.f16473e) {
                                    break loop0;
                                }
/* 54 */                        if (!s82VarM5986w.m8434o()) {
                                    break;
                                }
/* 81 */                        do {
/* 57 */                            unsafe = AbstractC1703b.f11726a;
/* 65 */                            if (unsafe.compareAndSwapObject(this, f20215Z, s82Var, s82VarM5986w)) {
/* 71 */                                if (!s82Var.m8432k()) {
                                            break loop0;
                                        }
/* 73 */                                s82Var.m8330i();
                                        break loop0;
                                    }
/* 81 */                        } while (unsafe.getObjectVolatile(this, j4) == s82Var);
/* 87 */                        if (s82VarM5986w.m8432k()) {
/* 89 */                            s82VarM5986w.m8330i();
                                }
                            }
                        } else {
                            break;
                        }
                    }
/* 93 */            boolean zM5949A = k50.m5949A(objM4330Y);
/* 98 */            AtomicLongFieldUpdater atomicLongFieldUpdater = f20217c;
/* 100 */           if (zM5949A) {
/* 102 */               m10398w();
/* 117 */               if (c0929ft.f16473e * ((long) AbstractC0184bl.f2497b) < atomicLongFieldUpdater.get(this)) {
/* 119 */                   c0929ft.m8323b();
/* 97 */                    return null;
                        }
                    } else {
/* 128 */               C0929ft c0929ft3 = (C0929ft) k50.m5986w(objM4330Y);
/* 130 */               long j5 = c0929ft3.f16473e;
/* 134 */               if (j5 <= j) {
/* 190 */                   return c0929ft3;
                        }
/* 139 */               long j6 = j5 * ((long) AbstractC0184bl.f2497b);
/* 172 */               do {
/* 143 */                   j2 = f20216b.get(this);
/* 152 */                   j3 = 1152921504606846975L & j2;
/* 155 */                   if (j3 >= j6) {
                                break;
                            }
/* 172 */               } while (!f20216b.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
/* 184 */               if (j5 * ((long) AbstractC0184bl.f2497b) < atomicLongFieldUpdater.get(this)) {
/* 186 */                   c0929ft3.m8323b();
                        }
                    }
/* 97 */            return null;
                }

                /* JADX INFO: renamed from: n */
                public final Throwable m10390n() {
/* 3 */             f20223w.getClass();
/* 14 */            return (Throwable) AbstractC1703b.f11726a.getObjectVolatile(this, f20211V);
                }

                /* JADX INFO: renamed from: o */
                public final Throwable m10391o() {
/* 1 */             Throwable thM10390n = m10390n();
                    return thM10390n == null ? new C0195bw("Channel was closed") : thM10390n;
                }

                /* JADX INFO: renamed from: p */
                public final Throwable m10392p() {
/* 1 */             Throwable thM10390n = m10390n();
                    return thM10390n == null ? new C0822cw("Channel was closed") : thM10390n;
                }

                /* JADX INFO: renamed from: q */
                public final long m10393q() {
/* 12 */            return f20216b.get(this) & 1152921504606846975L;
                }

                /* JADX INFO: renamed from: r */
                public final boolean m10394r() {
                    while (true) {
/* 3 */                 f20221i.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f20214Y;
/* 14 */                C0929ft c0929ftM10388l = (C0929ft) unsafe.getObjectVolatile(this, j);
/* 16 */                AtomicLongFieldUpdater atomicLongFieldUpdater = f20217c;
/* 18 */                long j2 = atomicLongFieldUpdater.get(this);
/* 28 */                if (m10393q() <= j2) {
/* 60 */                    return false;
                        }
/* 31 */                long j3 = AbstractC0184bl.f2497b;
/* 34 */                long j4 = j2 / j3;
/* 40 */                if (c0929ftM10388l.f16473e == j4 || (c0929ftM10388l = m10388l(j4, c0929ftM10388l)) != null) {
/* 62 */                    c0929ftM10388l.m8323b();
/* 67 */                    int i = (int) (j2 % j3);
                            while (true) {
/* 68 */                        Object objM3831q = c0929ftM10388l.m3831q(i);
/* 72 */                        if (objM3831q != null && objM3831q != AbstractC0184bl.f2500e) {
/* 81 */                            if (objM3831q != AbstractC0184bl.f2499d) {
/* 86 */                                if (objM3831q != AbstractC0184bl.f2505j && objM3831q != AbstractC0184bl.f2507l && objM3831q != AbstractC0184bl.f2504i && objM3831q != AbstractC0184bl.f2503h) {
/* 106 */                                   if (objM3831q != AbstractC0184bl.f2502g) {
/* 111 */                                       if (objM3831q == AbstractC0184bl.f2501f || j2 != atomicLongFieldUpdater.get(this)) {
                                                    break;
                                                    break;
                                                }
/* 122 */                                       return true;
                                            }
/* 122 */                                   return true;
                                        }
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
/* 122 */                           return true;
                                }
/* 130 */                       if (c0929ftM10388l.m3830p(i, objM3831q, AbstractC0184bl.f2503h)) {
/* 132 */                           m10386j();
                                    break;
                                }
                            }
/* 142 */                   f20217c.compareAndSet(this, j2, j2 + 1);
                        } else if (((C0929ft) unsafe.getObjectVolatile(this, j)).f16473e < j4) {
/* 60 */                    return false;
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m10395t() {
                    Object objectVolatile;
                    C2554zk c2554zk;
                    loop0: while (true) {
/* 3 */                 f20210U.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f20213X;
/* 10 */                objectVolatile = unsafe.getObjectVolatile(this, j);
/* 20 */                C2131r4 c2131r4 = objectVolatile == null ? AbstractC0184bl.f2512q : AbstractC0184bl.f2513r;
                        while (true) {
/* 23 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 27 */                    c2554zk = this;
/* 32 */                    if (unsafe2.compareAndSwapObject(c2554zk, f20213X, objectVolatile, c2131r4)) {
                                break loop0;
                            } else if (unsafe2.getObjectVolatile(c2554zk, j) != objectVolatile) {
                                break;
                            } else {
/* 59 */                        this = c2554zk;
                            }
                        }
/* 57 */                this = c2554zk;
                    }
/* 34 */            if (objectVolatile == null) {
/* 36 */                return;
                    }
/* 38 */            gs2.m4011b(1, objectVolatile);
/* 47 */            ((Function1) objectVolatile).invoke(c2554zk.m10390n());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v8, types: [ft[], java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v14 */
                /* JADX WARN: Type inference failed for: r4v17 */
                /* JADX WARN: Type inference failed for: r4v20 */
                /* JADX WARN: Type inference failed for: r4v23 */
                /* JADX WARN: Type inference failed for: r4v26 */
                /* JADX WARN: Type inference failed for: r4v29 */
                /* JADX WARN: Type inference failed for: r4v31 */
                /* JADX WARN: Type inference failed for: r4v32 */
                /* JADX WARN: Type inference failed for: r4v33 */
                /* JADX WARN: Type inference failed for: r4v34 */
                /* JADX WARN: Type inference failed for: r4v35 */
                /* JADX WARN: Type inference failed for: r4v36 */
                /* JADX WARN: Type inference failed for: r4v38 */
                /* JADX WARN: Type inference failed for: r4v53 */
                /* JADX WARN: Type inference failed for: r4v54 */
                /* JADX WARN: Type inference failed for: r4v55 */
                /* JADX WARN: Type inference failed for: r4v56 */
                /* JADX WARN: Type inference failed for: r4v57 */
                /* JADX WARN: Type inference failed for: r4v58 */
                /* JADX WARN: Type inference failed for: r4v59 */
                public final String toString() {
                    int i;
                    boolean zM6216a;
                    ?? r4;
                    boolean zEquals;
                    ?? r5;
                    boolean zM6216a2;
                    ?? r6;
                    boolean zM6216a3;
                    ?? r7;
                    boolean zM6216a4;
                    ?? r8;
                    boolean zM6216a5;
                    ?? r9;
                    boolean zM6216a6;
                    ?? r10;
                    String string;
/* 5 */             StringBuilder sb = new StringBuilder();
/* 17 */            int i2 = (int) (f20216b.get(this) >> 60);
/* 20 */            if (i2 == 2) {
/* 33 */                sb.append("closed,");
                    } else if (i2 == 3) {
/* 27 */                sb.append("cancelled,");
                    }
/* 57 */            sb.append("capacity=" + this.f20224a + ',');
/* 62 */            sb.append("data=[");
/* 69 */            f20221i.getClass();
/* 72 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 80 */            int i3 = 0;
/* 85 */            f20220f.getClass();
/* 90 */            Object objectVolatile = unsafe.getObjectVolatile(this, f20215Z);
/* 94 */            int i4 = 1;
/* 99 */            f20222v.getClass();
/* 110 */           List listM7566e = C2085pw.m7566e(new C0929ft[]{unsafe.getObjectVolatile(this, f20214Y), objectVolatile, unsafe.getObjectVolatile(this, f20212W)});
/* 116 */           ArrayList arrayList = new ArrayList();
/* 127 */           for (Object obj : listM7566e) {
/* 138 */               if (((C0929ft) obj) != AbstractC0184bl.f2496a) {
/* 140 */                   arrayList.add(obj);
                        }
                    }
/* 144 */           Iterator it = arrayList.iterator();
/* 152 */           if (!it.hasNext()) {
/* 472 */               C1951n4.m6864o();
/* 475 */               return null;
                    }
/* 154 */           Object next = it.next();
/* 162 */           if (it.hasNext()) {
/* 168 */               long j = ((C0929ft) next).f16473e;
/* 189 */               do {
/* 170 */                   Object next2 = it.next();
/* 177 */                   long j2 = ((C0929ft) next2).f16473e;
/* 181 */                   if (j > j2) {
/* 183 */                       next = next2;
/* 184 */                       j = j2;
                            }
/* 189 */               } while (it.hasNext());
                    }
/* 191 */           C0929ft c0929ft = (C0929ft) next;
/* 195 */           long j3 = f20217c.get(this);
/* 199 */           long jM10393q = m10393q();
                    loop2: while (true) {
/* 203 */               int i5 = AbstractC0184bl.f2497b;
/* 205 */               int i6 = i3;
/* 206 */               while (i6 < i5) {
/* 212 */                   i = i4;
/* 216 */                   long j4 = (c0929ft.f16473e * ((long) AbstractC0184bl.f2497b)) + ((long) i6);
/* 219 */                   if (j4 >= jM10393q && j4 >= j3) {
                                break loop2;
                            }
/* 225 */                   Object objM3831q = c0929ft.m3831q(i6);
/* 233 */                   Object obj2 = c0929ft.f8345h.get(i6 * 2);
/* 239 */                   if (objM3831q instanceof InterfaceC0853dr) {
/* 259 */                       string = (j4 >= j3 || j4 < jM10393q) ? (j4 >= jM10393q || j4 < j3) ? "cont" : "send" : "receive";
                            } else if (objM3831q instanceof f63) {
/* 282 */                       string = "EB(" + objM3831q + ')';
                            } else {
/* 294 */                       if (Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2501f)) {
/* 296 */                           r4 = i;
                                } else {
/* 300 */                           zM6216a = Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2502g);
                                }
/* 304 */                       if (r4 != 0) {
                                    r4 = zM6216a;
/* 306 */                           string = "resuming_sender";
                                } else {
/* 309 */                           if (objM3831q == null) {
/* 311 */                               r5 = i;
                                    } else {
/* 315 */                               zEquals = objM3831q.equals(AbstractC0184bl.f2500e);
                                    }
/* 319 */                           if (r5 != 0) {
                                        r5 = zEquals;
/* 321 */                               r6 = i;
                                    } else {
                                        r5 = zEquals;
/* 325 */                               zM6216a2 = Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2504i);
                                    }
/* 329 */                           if (r6 != 0) {
                                        r6 = zM6216a2;
/* 331 */                               r7 = i;
                                    } else {
                                        r6 = zM6216a2;
/* 335 */                               zM6216a3 = Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2503h);
                                    }
/* 339 */                           if (r7 != 0) {
                                        r7 = zM6216a3;
/* 341 */                               r8 = i;
                                    } else {
                                        r7 = zM6216a3;
/* 345 */                               zM6216a4 = Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2506k);
                                    }
/* 349 */                           if (r8 != 0) {
                                        r8 = zM6216a4;
/* 351 */                               r9 = i;
                                    } else {
                                        r8 = zM6216a4;
/* 355 */                               zM6216a5 = Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2505j);
                                    }
/* 359 */                           if (r9 != 0) {
                                        r9 = zM6216a5;
/* 361 */                               r10 = i;
                                    } else {
                                        r9 = zM6216a5;
/* 365 */                               zM6216a6 = Intrinsics.m6216a(objM3831q, AbstractC0184bl.f2507l);
                                    }
/* 369 */                           if (r10 == 0) {
                                        r10 = zM6216a6;
/* 371 */                               string = objM3831q.toString();
                                    } else {
                                        r10 = zM6216a6;
                                    }
/* 424 */                           i6++;
/* 426 */                           i4 = i;
                                }
                            }
/* 375 */                   if (obj2 != null) {
/* 402 */                       sb.append("(" + string + ',' + obj2 + "),");
                            } else {
/* 421 */                       sb.append(string + ',');
                            }
/* 424 */                   i6++;
/* 426 */                   i4 = i;
                        }
/* 430 */               i = i4;
/* 436 */               c0929ft = (C0929ft) c0929ft.m8325d();
/* 438 */               if (c0929ft == null) {
                            break;
                        }
/* 468 */               i4 = i;
/* 469 */               i3 = 0;
                    }
/* 444 */           if (di2.m3088x(sb) == ',') {
/* 455 */               sb.deleteCharAt(sb.length() - i).getClass();
                    }
/* 460 */           sb.append("]");
/* 463 */           return sb.toString();
                }

                /* JADX INFO: renamed from: u */
                public final void m10396u(wu0 wu0Var) {
                    Unsafe unsafe;
                    while (true) {
/* 3 */                 f20210U.getClass();
/* 6 */                 Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 11 */                C2554zk c2554zk = this;
/* 17 */                if (unsafe2.compareAndSwapObject(c2554zk, f20213X, (Object) null, wu0Var)) {
/* 19 */                    return;
                        }
/* 20 */                long j = f20213X;
/* 26 */                if (unsafe2.getObjectVolatile(c2554zk, j) != null) {
                            while (true) {
/* 30 */                        Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(c2554zk, j);
/* 34 */                        C2131r4 c2131r4 = AbstractC0184bl.f2512q;
/* 36 */                        if (objectVolatile != c2131r4) {
/* 70 */                            if (objectVolatile == AbstractC0184bl.f2513r) {
/* 74 */                                f42.m3656l("Another handler was already registered and successfully invoked");
/* 77 */                                return;
                                    } else {
/* 80 */                                ds0.m3201r(objectVolatile, "Another handler is already registered: ");
/* 83 */                                return;
                                    }
                                }
/* 38 */                        C2131r4 c2131r5 = AbstractC0184bl.f2513r;
/* 65 */                        do {
/* 40 */                            C2554zk c2554zk2 = c2554zk;
/* 41 */                            unsafe = AbstractC1703b.f11726a;
/* 45 */                            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c2554zk2, f20213X, c2131r4, c2131r5);
/* 50 */                            c2554zk = c2554zk2;
/* 51 */                            if (zCompareAndSwapObject) {
/* 57 */                                wu0Var.invoke(c2554zk.m10390n());
/* 60 */                                return;
                                    }
/* 65 */                        } while (unsafe.getObjectVolatile(c2554zk, j) == c2131r4);
                            }
                        } else {
/* 84 */                    this = c2554zk;
                        }
                    }
                }

                /* JADX INFO: renamed from: v */
                public final boolean m10397v(long j, boolean z) {
/* 5 */             int i = (int) (j >> 60);
/* 7 */             if (i != 0 && i != 1) {
/* 18 */                if (i == 2) {
/* 216 */                   m10384h(j & 1152921504606846975L);
/* 219 */                   if (!z || !m10394r()) {
                            }
                        } else {
/* 21 */                    if (i != 3) {
/* 211 */                       ds0.m3190g(fm0.m3781g(i, "unexpected close status: "));
/* 6 */                         return false;
                            }
/* 24 */                    C0929ft c0929ftM10384h = m10384h(j & 1152921504606846975L);
/* 29 */                    Object objM5952F = null;
/* 170 */                   loop0: do {
/* 34 */                        for (int i2 = AbstractC0184bl.f2497b - 1; -1 < i2; i2--) {
/* 43 */                            long j2 = (c0929ftM10384h.f16473e * ((long) AbstractC0184bl.f2497b)) + ((long) i2);
                                    while (true) {
/* 44 */                                Object objM3831q = c0929ftM10384h.m3831q(i2);
/* 50 */                                if (objM3831q == AbstractC0184bl.f2504i) {
                                            break loop0;
                                        }
/* 52 */                                C2131r4 c2131r4 = AbstractC0184bl.f2499d;
/* 54 */                                AtomicLongFieldUpdater atomicLongFieldUpdater = f20217c;
/* 56 */                                if (objM3831q != c2131r4) {
/* 83 */                                    if (objM3831q != AbstractC0184bl.f2500e && objM3831q != null) {
/* 90 */                                        if (!(objM3831q instanceof e63) && !(objM3831q instanceof f63)) {
/* 97 */                                            C2131r4 c2131r5 = AbstractC0184bl.f2502g;
/* 99 */                                            if (objM3831q == c2131r5 || objM3831q == AbstractC0184bl.f2501f) {
                                                        break loop0;
                                                    }
/* 106 */                                           if (objM3831q != c2131r5) {
                                                        break;
                                                    }
                                                } else {
/* 115 */                                           if (j2 < atomicLongFieldUpdater.get(this)) {
                                                        break loop0;
                                                    }
/* 128 */                                           e63 e63Var = objM3831q instanceof f63 ? ((f63) objM3831q).f8028a : (e63) objM3831q;
/* 136 */                                           if (c0929ftM10384h.m3830p(i2, objM3831q, AbstractC0184bl.f2507l)) {
/* 138 */                                               objM5952F = k50.m5952F(objM5952F, e63Var);
/* 142 */                                               c0929ftM10384h.m3833s(i2, null);
/* 145 */                                               c0929ftM10384h.m8433n();
                                                        break;
                                                    }
                                                }
                                            } else {
/* 155 */                                       if (c0929ftM10384h.m3830p(i2, objM3831q, AbstractC0184bl.f2507l)) {
/* 157 */                                           c0929ftM10384h.m8433n();
                                                    break;
                                                }
                                            }
                                        } else {
/* 64 */                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                                break loop0;
                                            }
/* 72 */                                    if (c0929ftM10384h.m3830p(i2, objM3831q, AbstractC0184bl.f2507l)) {
/* 74 */                                        c0929ftM10384h.m3833s(i2, null);
/* 77 */                                        c0929ftM10384h.m8433n();
                                                break;
                                            }
                                        }
                                    }
                                }
/* 168 */                       c0929ftM10384h = (C0929ft) c0929ftM10384h.m8327f();
/* 170 */                   } while (c0929ftM10384h != null);
/* 172 */                   if (objM5952F != null) {
/* 176 */                       if (objM5952F instanceof ArrayList) {
/* 184 */                           ArrayList arrayList = (ArrayList) objM5952F;
/* 191 */                           for (int size = arrayList.size() - 1; -1 < size; size--) {
/* 199 */                               m10374C((e63) arrayList.get(size), false);
                                    }
                                } else {
/* 180 */                           m10374C((e63) objM5952F, false);
                                }
                            }
                        }
/* 9 */                 return true;
                    }
/* 6 */             return false;
                }

                /* JADX INFO: renamed from: w */
                public final boolean m10398w() {
/* 8 */             return m10397v(f20216b.get(this), false);
                }

                /* JADX INFO: renamed from: x */
                public boolean mo9652x() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: y */
                public final boolean m10399y() {
/* 3 */             long j = f20218d.get(this);
                    return j == 0 || j == Long.MAX_VALUE;
                }

                /* JADX INFO: renamed from: z */
                public final void m10400z(long j, C0929ft c0929ft) {
                    C2554zk c2554zk;
                    C0929ft c0929ft2;
                    C0929ft c0929ft3;
/* 5 */             while (c0929ft.f16473e < j && (c0929ft3 = (C0929ft) c0929ft.m8325d()) != null) {
/* 16 */                c0929ft = c0929ft3;
                    }
                    while (true) {
/* 18 */                C0929ft c0929ft4 = c0929ft;
/* 23 */                while (c0929ft4.mo8328g() && (c0929ft2 = (C0929ft) c0929ft4.m8325d()) != null) {
/* 34 */                    c0929ft4 = c0929ft2;
                        }
                        while (true) {
/* 38 */                    f20222v.getClass();
/* 41 */                    Unsafe unsafe = AbstractC1703b.f11726a;
/* 43 */                    long j2 = f20212W;
/* 50 */                    s82 s82Var = (s82) unsafe.getObjectVolatile(this, j2);
/* 58 */                    if (s82Var.f16473e >= c0929ft4.f16473e) {
/* 89 */                        return;
                            }
/* 65 */                    if (!c0929ft4.m8434o()) {
                                break;
                            }
                            while (true) {
/* 69 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 73 */                        c2554zk = this;
/* 78 */                        if (unsafe2.compareAndSwapObject(c2554zk, f20212W, s82Var, c0929ft4)) {
/* 84 */                            if (s82Var.m8432k()) {
/* 86 */                                s82Var.m8330i();
/* 89 */                                return;
                                    }
/* 89 */                            return;
                                } else if (unsafe2.getObjectVolatile(c2554zk, j2) != s82Var) {
                                    break;
                                } else {
/* 107 */                           this = c2554zk;
                                }
                            }
/* 100 */                   if (c0929ft4.m8432k()) {
/* 102 */                       c0929ft4.m8330i();
                            }
/* 105 */                   this = c2554zk;
                        }
/* 67 */                c0929ft = c0929ft4;
                    }
                }
            }
