            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1697u2;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.logging.Level;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sg3 implements rg3, nh3 {

                /* JADX INFO: renamed from: a */
                public final Level f16610a;

                /* JADX INFO: renamed from: b */
                public final long f16611b;

                /* JADX INFO: renamed from: c */
                public eh3 f16612c;

                /* JADX INFO: renamed from: d */
                public hh3 f16613d;

                /* JADX INFO: renamed from: e */
                public xh3 f16614e;

                /* JADX INFO: renamed from: f */
                public Object[] f16615f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ qc3 f16616g;

                static {
/* 3 */             new String();
                }

                public sg3(qc3 qc3Var) {
/* 1 */             Level level = Level.WARNING;
/* 3 */             this.f16616g = qc3Var;
/* 5 */             Level level2 = Level.WARNING;
/* 9 */             jj3.f12333a.getClass();
/* 18 */            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
/* 26 */            this.f16612c = null;
/* 28 */            this.f16613d = null;
/* 30 */            this.f16614e = null;
/* 32 */            this.f16615f = null;
/* 36 */            pg3.m7422F(level2, FirebaseAnalytics.Param.LEVEL);
/* 39 */            this.f16610a = level2;
/* 41 */            this.f16611b = nanos;
                }

                @Override // p000.nh3
                /* JADX INFO: renamed from: a */
                public final nh3 mo6982a(int i, String str, String str2, String str3) {
/* 3 */             gh3 gh3Var = new gh3(i, str, str2, str3);
/* 8 */             if (this.f16613d == null) {
/* 10 */                this.f16613d = gh3Var;
                    }
/* 12 */            return this;
                }

                @Override // p000.nh3
                /* JADX INFO: renamed from: b */
                public final nh3 mo6983b(uo3 uo3Var) {
/* 1 */             ph3 ph3Var = dh3.f7210a;
/* 5 */             pg3.m7422F(ph3Var, "metadata key");
/* 8 */             m8506d(ph3Var, uo3Var);
/* 11 */            return this;
                }

                /* JADX INFO: renamed from: c */
                public final kb1 m8505c() {
/* 1 */             eh3 eh3Var = this.f16612c;
                    return eh3Var != null ? eh3Var : ni3.f14293e;
                }

                /* JADX INFO: renamed from: d */
                public final void m8506d(ph3 ph3Var, Object obj) {
/* 3 */             if (this.f16612c == null) {
/* 7 */                 eh3 eh3Var = new eh3();
/* 14 */                eh3Var.f7693e = new Object[8];
/* 17 */                eh3Var.f7694f = 0;
/* 19 */                this.f16612c = eh3Var;
                    }
/* 23 */            this.f16612c.m3442b0(ph3Var, obj);
                }

                @Override // p000.nh3
                public final void zzq() {
                    boolean z;
                    StackTraceElement[] stackTraceElementArr;
                    int iM3443c0;
                    int i;
                    og3 og3Var;
                    xh3 xh3Var;
/* 1 */             hh3 hh3Var = this.f16613d;
/* 3 */             fh3 fh3Var = hh3.f9085a;
/* 5 */             if (hh3Var == null) {
/* 11 */                ((rj3) jj3.f12333a).getClass();
/* 16 */                rj3.f16134b.getClass();
/* 19 */                this.f16613d = fh3Var;
                    }
/* 21 */            jh3 zh3Var = this.f16613d;
/* 25 */            if (zh3Var != fh3Var) {
/* 27 */                eh3 eh3Var = this.f16612c;
/* 29 */                if (eh3Var != null && eh3Var.f7694f > 0) {
/* 37 */                    pg3.m7422F(zh3Var, "logSiteKey");
/* 40 */                    int i2 = eh3Var.f7694f;
/* 43 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 55 */                        if (dh3.f7214e.equals(eh3Var.mo3439Y(i3))) {
/* 63 */                            zh3Var = new zh3(zh3Var, eh3Var.mo3440Z(i3));
                                }
                            }
                        }
                    } else {
/* 70 */                zh3Var = null;
                    }
/* 71 */            kb1 kb1VarM8505c = m8505c();
/* 75 */            int iMo3438X = kb1VarM8505c.mo3438X();
/* 80 */            for (int i4 = 0; i4 < iMo3438X; i4++) {
/* 90 */                if (kb1VarM8505c.mo3439Y(i4).f15131a == "eye3tag") {
/* 98 */                    if (kb1VarM8505c.mo3441a0(dh3.f7210a) != null) {
                                break;
                            }
/* 100 */                   ph3 ph3Var = dh3.f7217h;
/* 106 */                   if (kb1VarM8505c.mo3441a0(ph3Var) != null) {
                                break;
                            }
/* 110 */                   m8506d(ph3Var, ai3.SMALL);
                            break;
                        }
                    }
/* 117 */           eh3 eh3Var2 = this.f16612c;
/* 119 */           int i5 = -1;
/* 120 */           rh3 rh3Var = xh3.f19097a;
/* 123 */           if (eh3Var2 == null) {
/* 385 */               z = true;
                    } else {
/* 125 */               if (zh3Var != null) {
/* 127 */                   ng3 ng3Var = og3.f14744c;
/* 135 */                   Integer num = (Integer) eh3Var2.mo3441a0(dh3.f7211b);
/* 137 */                   if (num == null) {
/* 139 */                       xh3Var = null;
                            } else {
/* 147 */                       og3Var = (og3) og3.f14744c.m8627p(zh3Var, eh3Var2);
/* 162 */                       if (og3Var.f14745b.incrementAndGet() < num.intValue()) {
                                    xh3Var = og3Var;
/* 165 */                           xh3Var = rh3Var;
                                }
                            }
                            xh3Var = og3Var;
/* 166 */                   eh3 eh3Var3 = this.f16612c;
/* 168 */                   int i6 = qg3.f15539c;
                            xh3 xh3Var2 = xh3Var;
/* 176 */                   if (eh3Var3.mo3441a0(dh3.f7212c) != null) {
/* 189 */                       C1697u2.m5431g();
/* 192 */                       return;
                            }
/* 178 */                   if (xh3Var == null) {
/* 180 */                       xh3Var2 = null;
                            }
/* 181 */                   this.f16614e = xh3Var2;
/* 183 */                   if (xh3Var2 == rh3Var) {
/* 186 */                       z = false;
                            }
                        }
/* 193 */               eh3 eh3Var4 = this.f16612c;
/* 195 */               ph3 ph3Var2 = dh3.f7217h;
/* 201 */               ai3 ai3Var = (ai3) eh3Var4.mo3441a0(ph3Var2);
/* 203 */               if (ai3Var != null) {
/* 205 */                   eh3 eh3Var5 = this.f16612c;
/* 207 */                   if (eh3Var5 != null && (iM3443c0 = eh3Var5.m3443c0(ph3Var2)) >= 0) {
/* 215 */                       int i7 = iM3443c0 + iM3443c0;
/* 216 */                       int i8 = i7 + 2;
                                while (true) {
/* 218 */                           i = eh3Var5.f7694f;
/* 222 */                           if (i8 >= i + i) {
                                        break;
                                    }
/* 226 */                           Object obj = eh3Var5.f7693e[i8];
/* 232 */                           if (!obj.equals(ph3Var2)) {
/* 234 */                               Object[] objArr = eh3Var5.f7693e;
/* 236 */                               objArr[i7] = obj;
/* 244 */                               objArr[i7 + 1] = objArr[i8 + 1];
/* 246 */                               i7 += 2;
                                    }
/* 248 */                           i8 += 2;
                                }
/* 255 */                       eh3Var5.f7694f = i - ((i8 - i7) >> 1);
/* 257 */                       while (i7 < i8) {
/* 263 */                           eh3Var5.f7693e[i7] = null;
/* 261 */                           i7++;
                                }
                            }
/* 279 */                   Throwable th = (Throwable) m8505c().mo3441a0(dh3.f7210a);
/* 281 */                   int i9 = ai3Var.f303a;
/* 283 */                   yk3 yk3Var = vk3.f18233a;
/* 285 */                   if (i9 <= 0 && i9 != -1) {
/* 292 */                       C1951n4.m6859j("invalid maximum depth: 0");
/* 295 */                       return;
                            }
/* 298 */                   vk3.f18233a.getClass();
/* 308 */                   if (!(i9 == -1 || i9 > 0)) {
/* 389 */                       C1951n4.m6859j("maxDepth must be > 0 or -1");
/* 392 */                       return;
                            }
/* 315 */                   StackTraceElement[] stackTrace = new Throwable().getStackTrace();
/* 321 */                   String name = sg3.class.getName();
/* 325 */                   int i10 = 3;
/* 326 */                   boolean z2 = false;
                            while (true) {
/* 328 */                       if (i10 >= stackTrace.length) {
/* 350 */                           i10 = -1;
                                    break;
                                }
/* 340 */                       if (!stackTrace[i10].getClassName().equals(name)) {
/* 344 */                           if (z2) {
                                        break;
                                    }
                                } else {
/* 342 */                           z2 = true;
                                }
/* 347 */                       i10++;
                            }
/* 351 */                   if (i10 == -1) {
/* 353 */                       stackTraceElementArr = new StackTraceElement[0];
                            } else {
/* 357 */                       int length = stackTrace.length - i10;
/* 358 */                       if (i9 <= 0 || i9 >= length) {
/* 362 */                           i9 = length;
                                }
/* 363 */                       StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i9];
/* 365 */                       System.arraycopy(stackTrace, i10, stackTraceElementArr2, 0, i9);
/* 368 */                       stackTraceElementArr = stackTraceElementArr2;
                            }
/* 374 */                   C1898lp c1898lp = new C1898lp(ai3Var.toString(), 6, th);
/* 377 */                   c1898lp.setStackTrace(stackTraceElementArr);
/* 382 */                   m8506d(dh3.f7210a, c1898lp);
                        }
/* 385 */               z = true;
                    }
/* 393 */           xh3 xh3Var3 = this.f16614e;
/* 395 */           if (xh3Var3 != null) {
/* 405 */               vh3 vh3Var = (vh3) vh3.f18185c.m8627p(zh3Var, this.f16612c);
/* 407 */               AtomicInteger atomicInteger = vh3Var.f18187b;
/* 409 */               AtomicBoolean atomicBoolean = vh3Var.f18186a;
/* 411 */               int iIncrementAndGet = atomicInteger.incrementAndGet();
/* 415 */               if (xh3Var3 != rh3Var && atomicBoolean.compareAndSet(false, true)) {
                            try {
/* 424 */                       xh3Var3.mo7170a();
/* 427 */                       atomicBoolean.set(false);
/* 431 */                       atomicInteger.addAndGet(-iIncrementAndGet);
/* 434 */                       i5 = (-1) + iIncrementAndGet;
                            } catch (Throwable th2) {
/* 437 */                       atomicBoolean.set(false);
/* 440 */                       throw th2;
                            }
                        }
/* 441 */               if (z && i5 > 0) {
/* 453 */                   this.f16612c.m3442b0(dh3.f7213d, Integer.valueOf(i5));
                        }
/* 461 */               z &= i5 >= 0;
                    }
/* 462 */           if (z) {
/* 466 */               Object[] objArr2 = {HttpUrl.FRAGMENT_ENCODE_SET};
/* 470 */               this.f16615f = objArr2;
/* 472 */               for (int i11 = 0; i11 <= 0; i11++) {
/* 474 */                   Object obj2 = objArr2[i11];
                        }
/* 483 */               ((rj3) jj3.f12333a).getClass();
/* 488 */               kk3 kk3VarMo301b = vj3.f18227b.mo301b();
/* 498 */               if (!kk3VarMo301b.f12866a.isEmpty()) {
/* 500 */                   kb1 kb1VarM8505c2 = m8505c();
/* 504 */                   ph3 ph3Var3 = dh3.f7216g;
/* 510 */                   kk3 kk3Var = (kk3) kb1VarM8505c2.mo3441a0(ph3Var3);
/* 512 */                   if (kk3Var != null) {
/* 514 */                       ik3 ik3Var = kk3Var.f12866a;
/* 516 */                       ik3 ik3Var2 = kk3VarMo301b.f12866a;
/* 522 */                       if (!ik3Var.isEmpty()) {
/* 539 */                           kk3VarMo301b = ik3Var2.isEmpty() ? kk3Var : new kk3(new ik3(ik3Var2, ik3Var));
                                }
                            }
/* 542 */                   m8506d(ph3Var3, kk3VarMo301b);
                        }
/* 549 */               sq3 sq3Var = (sq3) this.f16616g.f15492b;
                        try {
/* 557 */                   xk3 xk3Var = (xk3) xk3.f19242b.get();
/* 561 */                   int i12 = xk3Var.f19243a + 1;
/* 562 */                   xk3Var.f19243a = i12;
/* 564 */                   if (i12 == 0) {
/* 603 */                       throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                            }
                            try {
/* 568 */                       if (i12 <= 100) {
/* 570 */                           sq3Var.mo8629t(this);
                                } else {
/* 578 */                           qc3.m7765s("unbounded recursion in log statement", this);
                                }
/* 581 */                       xk3Var.close();
                            } catch (Throwable th3) {
                                try {
/* 587 */                           xk3Var.close();
                                } catch (Throwable th4) {
/* 592 */                           th3.addSuppressed(th4);
                                }
/* 595 */                       throw th3;
                            }
                        } catch (RuntimeException e) {
                            try {
/* 604 */                       sq3Var.mo8630v(e, this);
                            } catch (RuntimeException e2) {
/* 613 */                       String name2 = e2.getClass().getName();
/* 617 */                       String message = e2.getMessage();
/* 638 */                       StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
/* 641 */                       sb.append(name2);
/* 646 */                       sb.append(": ");
/* 649 */                       sb.append(message);
/* 656 */                       qc3.m7765s(sb.toString(), this);
                                try {
/* 661 */                           e2.printStackTrace(System.err);
                                } catch (RuntimeException unused) {
                                }
                            }
                        }
                    }
                }
            }
