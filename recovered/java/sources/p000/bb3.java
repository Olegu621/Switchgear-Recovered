            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.internal.zact;
            import com.google.android.gms.measurement.internal.zzw;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1268s;
            import io.sentry.android.core.internal.tombstone.C1212b;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class bb3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2349a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f2350b;

                public bb3(mp3 mp3Var, v30 v30Var) {
/* 3 */             this.f2349a = 11;
/* 8 */             this.f2350b = mp3Var;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x0207  */
                @Override // java.lang.Runnable
                public final void run() {
/* 6 */             int i = 0;
/* 8 */             int i2 = 1;
                    switch (this.f2349a) {
                        case 0:
/* 825 */                   ((cb3) this.f2350b).m1617h();
/* 828 */                   return;
                        case 1:
/* 801 */                   InterfaceC0836d9 interfaceC0836d9 = ((cb3) ((fs0) this.f2350b).f8339b).f2821b;
/* 817 */                   interfaceC0836d9.disconnect(interfaceC0836d9.getClass().getName().concat(" disconnecting because it was signed out."));
/* 820 */                   return;
                        case 2:
/* 789 */                   ((zact) this.f2350b).f3459i.m8983A(new ConnectionResult(4, null, null));
/* 792 */                   return;
                        case 3:
/* 726 */                   g63 g63Var = (g63) this.f2350b;
                            synchronized (g63Var.f8491a) {
                                try {
/* 735 */                           if (g63Var.m3879b()) {
/* 755 */                               AbstractC1245n0.m4876d("WakeLock", String.valueOf(g63Var.f8500j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
/* 758 */                               g63Var.m3881d();
/* 765 */                               if (g63Var.m3879b()) {
/* 769 */                                   g63Var.f8493c = 1;
/* 771 */                                   g63Var.m3882e();
/* 775 */                                   return;
                                        }
/* 775 */                               return;
                                    }
/* 775 */                           return;
                                } catch (Throwable th) {
/* 777 */                           throw th;
                                }
                            }
                        case 4:
/* 714 */                   if (((TaskCompletionSource) this.f2350b).trySetException(new IOException("TIMEOUT"))) {
/* 720 */                       AbstractC1245n0.m4889q("Rpc", "No response");
/* 723 */                       return;
                            }
/* 723 */                   return;
                        case 5:
/* 689 */                   C0882ej c0882ej = (C0882ej) this.f2350b;
/* 691 */                   C1833kj c1833kj = kf3.f12733k;
/* 693 */                   c0882ej.m3470x(24, 4, c1833kj);
/* 696 */                   int i3 = c1833kj.f12818a;
/* 698 */                   return;
                        case 6:
/* 670 */                   ne3 ne3Var = (ne3) this.f2350b;
/* 672 */                   C0882ej c0882ej2 = ne3Var.f14215b;
/* 674 */                   c0882ej2.m3461o(0);
/* 677 */                   C1833kj c1833kj2 = kf3.f12733k;
/* 680 */                   c0882ej2.m3470x(24, 6, c1833kj2);
/* 683 */                   ne3Var.m6973a(c1833kj2);
/* 686 */                   return;
                        case 7:
/* 664 */                   ((mp3) ((gi3) this.f2350b).f8630d).m6739L();
/* 667 */                   return;
                        case 8:
/* 637 */                   pn3 pn3Var = ((mn3) this.f2350b).f13886c;
/* 652 */                   pn3Var.m7515K(new ComponentName(((ij3) pn3Var.f16749a).f9645a, "com.google.android.gms.measurement.AppMeasurementService"));
/* 655 */                   return;
                        case 9:
/* 613 */                   pn3 pn3Var2 = ((mn3) ((ol3) this.f2350b).f14814c).f13886c;
/* 619 */                   bj3 bj3Var = ((ij3) pn3Var2.f16749a).f9659i;
/* 621 */                   ij3.m4555l(bj3Var);
/* 629 */                   bj3Var.m1370I(new ln3(pn3Var2, i));
/* 632 */                   return;
                        case 10:
/* 388 */                   co3 co3Var = (co3) this.f2350b;
/* 394 */                   lo3 lo3Var = (lo3) co3Var.f3025c.f18595b;
/* 396 */                   lo3Var.mo1375y();
/* 401 */                   ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 403 */                   uh3 uh3Var = ij3Var.f9655f;
/* 405 */                   Context context = ij3Var.f9645a;
/* 407 */                   ij3.m4555l(uh3Var);
/* 414 */                   uh3Var.f17533X.m8510a("Application going to the background");
/* 417 */                   ki3 ki3Var = ij3Var.f9653e;
/* 419 */                   ij3.m4553j(ki3Var);
/* 424 */                   ki3Var.f12806d0.m4239b(true);
/* 427 */                   lo3Var.mo1375y();
/* 430 */                   lo3Var.f13436d = true;
/* 432 */                   pd3 pd3Var = ij3Var.f9651d;
/* 438 */                   if (!pd3Var.m7410N()) {
/* 440 */                       long j = co3Var.f3024b;
/* 442 */                       C1212b c1212b = lo3Var.f13438f;
/* 444 */                       c1212b.m4822b(j, false, false);
/* 451 */                       ((do3) c1212b.f10129c).m1349c();
                            }
/* 454 */                   long j2 = co3Var.f3023a;
/* 456 */                   ij3.m4555l(uh3Var);
/* 467 */                   uh3Var.f17532W.m8511b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
/* 470 */                   sl3 sl3Var = ij3Var.f9642X;
/* 472 */                   ij3.m4554k(sl3Var);
/* 475 */                   sl3Var.mo1375y();
/* 480 */                   ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 482 */                   sl3Var.m9576A();
/* 485 */                   pn3 pn3VarM4567o = ij3Var2.m4567o();
/* 489 */                   pn3VarM4567o.mo1375y();
/* 492 */                   pn3VarM4567o.m9576A();
/* 499 */                   if (pn3VarM4567o.m7511G()) {
/* 506 */                       up3 up3Var = ((ij3) pn3VarM4567o.f16749a).f9668w;
/* 508 */                       ij3.m4553j(up3Var);
/* 518 */                       if (up3Var.m9103f0() >= 242600) {
/* 520 */                           pn3 pn3VarM4567o2 = ij3Var2.m4567o();
/* 524 */                           pn3VarM4567o2.mo1375y();
/* 527 */                           pn3VarM4567o2.m9576A();
/* 539 */                           pn3VarM4567o2.m7518N(new sm3(pn3VarM4567o2, pn3VarM4567o2.m7520P(true), i2));
                                }
                            } else {
/* 520 */                       pn3 pn3VarM4567o3 = ij3Var2.m4567o();
/* 524 */                       pn3VarM4567o3.mo1375y();
/* 527 */                       pn3VarM4567o3.m9576A();
/* 539 */                       pn3VarM4567o3.m7518N(new sm3(pn3VarM4567o3, pn3VarM4567o3.m7520P(true), i2));
                            }
/* 548 */                   if (pd3Var.m7406J(null, vg3.f18090N0)) {
/* 550 */                       up3 up3Var2 = ij3Var.f9668w;
/* 552 */                       ij3.m4553j(up3Var2);
/* 576 */                       long jM7403G = up3Var2.m9098Z(context.getPackageName(), pd3Var.f15074c) ? 1000L : pd3Var.m7403G(context.getPackageName(), vg3.f18071E);
/* 580 */                       ij3.m4555l(uh3Var);
/* 591 */                       uh3Var.f17534Y.m8511b(Long.valueOf(jM7403G), "[sgtm] Scheduling batch upload with minimum latency in millis");
/* 596 */                       ij3.m4552i(ij3Var.f9656f0);
/* 601 */                       ij3Var.f9656f0.m9975D(jM7403G);
/* 604 */                       return;
                            }
/* 604 */                   return;
                        case 11:
/* 111 */                   mp3 mp3Var = (mp3) this.f2350b;
/* 117 */                   mp3Var.mo4558b().mo1375y();
/* 125 */                   mp3Var.f13904V = new oi3(mp3Var);
/* 129 */                   ae3 ae3Var = new ae3(mp3Var);
/* 132 */                   ae3Var.m9594B();
/* 135 */                   mp3Var.f13913c = ae3Var;
/* 137 */                   vi3 vi3Var = mp3Var.f13909a;
/* 139 */                   pd3 pd3VarM6753d0 = mp3Var.m6753d0();
/* 143 */                   kb1.m6061n(vi3Var);
/* 146 */                   pd3VarM6753d0.f15075d = vi3Var;
/* 150 */                   tn3 tn3Var = new tn3(mp3Var);
/* 153 */                   tn3Var.m9594B();
/* 156 */                   mp3Var.f13938w = tn3Var;
/* 160 */                   fd3 fd3Var = new fd3(mp3Var);
/* 163 */                   fd3Var.m9594B();
/* 166 */                   mp3Var.f13919f = fd3Var;
/* 170 */                   ci3 ci3Var = new ci3(mp3Var, i2);
/* 173 */                   ci3Var.m9594B();
/* 176 */                   mp3Var.f13937v = ci3Var;
/* 180 */                   po3 po3Var = new po3(mp3Var);
/* 183 */                   po3Var.m9594B();
/* 186 */                   mp3Var.f13917e = po3Var;
/* 193 */                   mp3Var.f13915d = new gi3(mp3Var);
/* 199 */                   if (mp3Var.f13914c0 != mp3Var.f13916d0) {
/* 221 */                       mp3Var.mo4557a().f17538f.m8512c(Integer.valueOf(mp3Var.f13914c0), "Not all upload components initialized", Integer.valueOf(mp3Var.f13916d0));
                            }
/* 226 */                   mp3Var.f13906X.set(true);
/* 237 */                   mp3Var.mo4557a().f17534Y.m8510a("UploadController is now fully initialized");
/* 244 */                   mp3Var.mo4558b().mo1375y();
/* 247 */                   ae3 ae3Var2 = mp3Var.f13913c;
/* 249 */                   mp3.m6728S(ae3Var2);
/* 252 */                   ae3Var2.m230J();
/* 255 */                   ae3 ae3Var3 = mp3Var.f13913c;
/* 257 */                   mp3.m6728S(ae3Var3);
/* 260 */                   ae3Var3.mo1375y();
/* 263 */                   ae3Var3.m9593A();
/* 272 */                   if (ae3Var3.m256k0()) {
/* 274 */                       ug3 ug3Var = vg3.f18168v0;
/* 288 */                       if (((Long) ug3Var.m9011a(null)).longValue() != 0) {
/* 291 */                           SQLiteDatabase sQLiteDatabaseM261q0 = ae3Var3.m261q0();
/* 297 */                           ij3 ij3Var3 = (ij3) ae3Var3.f16749a;
/* 301 */                           ij3Var3.f9640V.getClass();
/* 328 */                           int iDelete = sQLiteDatabaseM261q0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(ug3Var.m9011a(null))});
/* 332 */                           if (iDelete > 0) {
/* 334 */                               uh3 uh3Var2 = ij3Var3.f9655f;
/* 336 */                               ij3.m4555l(uh3Var2);
/* 347 */                               uh3Var2.f17534Y.m8511b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                                    }
                                }
                            }
/* 360 */                   if (mp3Var.f13938w.f17198v.m4932a() == 0) {
/* 364 */                       C1268s c1268s = mp3Var.f13938w.f17198v;
/* 372 */                       ((xt0) mp3Var.mo4562f()).getClass();
/* 379 */                       c1268s.m4933b(System.currentTimeMillis());
                            }
/* 382 */                   mp3Var.m6739L();
/* 385 */                   return;
                        case 12:
/* 84 */                    ij3 ij3Var4 = ((zzw) this.f2350b).f4265a;
/* 88 */                    ij3.m4552i(ij3Var4.f9656f0);
/* 105 */                   ij3Var4.f9656f0.m9975D(((Long) vg3.f18069D.m9011a(null)).longValue());
/* 108 */                   return;
                        default:
/* 14 */                    ij3 ij3Var5 = (ij3) this.f2350b;
/* 16 */                    up3 up3Var3 = ij3Var5.f9668w;
/* 18 */                    sl3 sl3Var2 = ij3Var5.f9642X;
/* 20 */                    ij3.m4553j(up3Var3);
/* 23 */                    up3Var3.mo1375y();
/* 34 */                    if (up3Var3.m9096U() != 1) {
/* 67 */                        uh3 uh3Var3 = ij3Var5.f9655f;
/* 69 */                        ij3.m4555l(uh3Var3);
/* 76 */                        uh3Var3.f17541w.m8510a("registerTrigger called but app not eligible");
/* 79 */                        return;
                            }
/* 36 */                    ij3.m4554k(sl3Var2);
/* 39 */                    sl3Var2.mo1375y();
/* 42 */                    wk3 wk3Var = sl3Var2.f16678W;
/* 44 */                    if (wk3Var != null) {
/* 46 */                        wk3Var.m1349c();
                            }
/* 51 */                    ij3.m4554k(sl3Var2);
/* 63 */                    new Thread(new uk3(sl3Var2, 3)).start();
/* 79 */                    return;
                    }
                }

/* 10 */        public /* synthetic */ bb3(Object obj, int i) {
/* 11 */            this.f2349a = i;
                    this.f2350b = obj;
                }

/* 11 */        public bb3(gi3 gi3Var, boolean z) {
                    this.f2349a = 7;
                    this.f2350b = gi3Var;
                }

/* 12 */        public /* synthetic */ bb3(C0882ej c0882ej, ds0 ds0Var, C0832d5 c0832d5) {
                    this.f2349a = 5;
                    this.f2350b = c0882ej;
                }
            }
