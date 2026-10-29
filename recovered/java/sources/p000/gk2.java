            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.os.Build;
            import android.os.Handler;
            import android.view.Surface;
            import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
            import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
            import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gk2 extends ck2 {

                /* JADX INFO: renamed from: b */
                public final qi1 f8665b;

                /* JADX INFO: renamed from: c */
                public final Handler f8666c;

                /* JADX INFO: renamed from: d */
                public final y92 f8667d;

                /* JADX INFO: renamed from: e */
                public final nt0 f8668e;

                /* JADX INFO: renamed from: f */
                public C2117qr f8669f;

                /* JADX INFO: renamed from: g */
                public gr0 f8670g;

                /* JADX INFO: renamed from: h */
                public C2466xm f8671h;

                /* JADX INFO: renamed from: i */
                public C2260um f8672i;

                /* JADX INFO: renamed from: j */
                public yo0 f8673j;

                /* JADX INFO: renamed from: o */
                public final nt0 f8678o;

                /* JADX INFO: renamed from: q */
                public ArrayList f8680q;

                /* JADX INFO: renamed from: r */
                public f81 f8681r;

                /* JADX INFO: renamed from: s */
                public final wl0 f8682s;

                /* JADX INFO: renamed from: t */
                public final d52 f8683t;

                /* JADX INFO: renamed from: u */
                public final zr3 f8684u;

                /* JADX INFO: renamed from: v */
                public final nb2 f8685v;

                /* JADX INFO: renamed from: a */
                public final Object f8664a = new Object();

                /* JADX INFO: renamed from: k */
                public List f8674k = null;

                /* JADX INFO: renamed from: l */
                public boolean f8675l = false;

                /* JADX INFO: renamed from: m */
                public boolean f8676m = false;

                /* JADX INFO: renamed from: n */
                public boolean f8677n = false;

                /* JADX INFO: renamed from: p */
                public final Object f8679p = new Object();

                /* JADX INFO: renamed from: w */
                public final AtomicBoolean f8686w = new AtomicBoolean(false);

                public gk2(er0 er0Var, er0 er0Var2, qi1 qi1Var, y92 y92Var, nt0 nt0Var, Handler handler) {
/* 21 */            this.f8665b = qi1Var;
/* 23 */            this.f8666c = handler;
/* 25 */            this.f8667d = y92Var;
/* 27 */            this.f8668e = nt0Var;
/* 48 */            this.f8682s = new wl0(er0Var, er0Var2);
/* 72 */            this.f8684u = new zr3(er0Var.m3579d(CaptureSessionStuckQuirk.class) || er0Var.m3579d(IncorrectCaptureStateQuirk.class));
/* 81 */            this.f8683t = new d52(er0Var2, 27);
/* 88 */            this.f8685v = new nb2(er0Var2);
/* 90 */            this.f8678o = nt0Var;
                }

                /* JADX INFO: renamed from: l */
                public static void m3955l() {
/* 3 */             hu0.m4312F0("SyncCaptureSessionImpl");
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: a */
                public final void mo1713a(gk2 gk2Var) {
/* 3 */             Objects.requireNonNull(this.f8669f);
/* 8 */             this.f8669f.mo1713a(gk2Var);
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: b */
                public final void mo1714b(gk2 gk2Var) {
/* 3 */             Objects.requireNonNull(this.f8669f);
/* 8 */             this.f8669f.mo1714b(gk2Var);
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: c */
                public final void mo1715c(gk2 gk2Var) {
                    C2466xm c2466xm;
                    synchronized (this.f8679p) {
/* 8 */                 this.f8682s.m9585a(this.f8680q);
                    }
/* 12 */            m3955l();
                    synchronized (this.f8664a) {
                        try {
/* 21 */                    if (this.f8675l) {
/* 38 */                        c2466xm = null;
                            } else {
/* 24 */                        this.f8675l = true;
/* 30 */                        de3.m3027i(this.f8671h, "Need to call openCaptureSession before using this API.");
/* 33 */                        c2466xm = this.f8671h;
                            }
                        } catch (Throwable th) {
/* 99 */                    throw th;
                        }
                    }
                    synchronized (this.f8664a) {
                        try {
/* 43 */                    List list = this.f8674k;
/* 45 */                    if (list != null) {
/* 47 */                        Iterator it = list.iterator();
/* 55 */                        while (it.hasNext()) {
/* 63 */                            ((d70) it.next()).m2952b();
                                }
/* 67 */                        this.f8674k = null;
                            }
                        } catch (Throwable th2) {
/* 97 */                    throw th2;
                        }
                    }
/* 75 */            this.f8684u.m10440w();
/* 78 */            if (c2466xm != null) {
/* 92 */                c2466xm.f19248b.mo3676a(new dk2(this, gk2Var, 0), pg3.m7428g());
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: d */
                public final void mo1716d(gk2 gk2Var) {
                    gk2 gk2Var2;
/* 3 */             Objects.requireNonNull(this.f8669f);
                    synchronized (this.f8664a) {
                        try {
/* 9 */                     List list = this.f8674k;
/* 12 */                    if (list != null) {
/* 14 */                        Iterator it = list.iterator();
/* 22 */                        while (it.hasNext()) {
/* 30 */                            ((d70) it.next()).m2952b();
                                }
/* 34 */                        this.f8674k = null;
                            }
                        } catch (Throwable th) {
/* 132 */                   throw th;
                        }
                    }
/* 42 */            this.f8684u.m10440w();
/* 45 */            qi1 qi1Var = this.f8665b;
/* 51 */            Iterator it2 = qi1Var.m7860g().iterator();
/* 59 */            while (it2.hasNext() && (gk2Var2 = (gk2) it2.next()) != this) {
                        synchronized (gk2Var2.f8664a) {
                            try {
/* 73 */                        List list2 = gk2Var2.f8674k;
/* 75 */                        if (list2 != null) {
/* 77 */                            Iterator it3 = list2.iterator();
/* 85 */                            while (it3.hasNext()) {
/* 93 */                                ((d70) it3.next()).m2952b();
                                    }
/* 97 */                            gk2Var2.f8674k = null;
                                }
                            } catch (Throwable th2) {
/* 110 */                       throw th2;
                            }
                        }
/* 105 */               gk2Var2.f8684u.m10440w();
                    }
                    synchronized (qi1Var.f15573b) {
/* 118 */               ((LinkedHashSet) qi1Var.f15576e).remove(this);
                    }
/* 124 */           this.f8669f.mo1716d(gk2Var);
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: e */
                public final void mo1717e(gk2 gk2Var) {
                    ArrayList arrayList;
                    gk2 gk2Var2;
                    gk2 gk2Var3;
                    gk2 gk2Var4;
/* 1 */             m3955l();
/* 4 */             d52 d52Var = this.f8683t;
/* 6 */             qi1 qi1Var = this.f8665b;
                    synchronized (qi1Var.f15573b) {
/* 17 */                arrayList = new ArrayList((LinkedHashSet) qi1Var.f15576e);
                    }
/* 23 */            ArrayList arrayListM7859e = this.f8665b.m7859e();
/* 31 */            if (((CaptureSessionOnClosedNotCalledQuirk) d52Var.f7001a) != null) {
/* 35 */                LinkedHashSet<gk2> linkedHashSet = new LinkedHashSet();
/* 38 */                Iterator it = arrayList.iterator();
/* 46 */                while (it.hasNext() && (gk2Var4 = (gk2) it.next()) != gk2Var) {
/* 57 */                    linkedHashSet.add(gk2Var4);
                        }
/* 69 */                for (gk2 gk2Var5 : linkedHashSet) {
/* 77 */                    gk2Var5.getClass();
/* 80 */                    gk2Var5.mo1716d(gk2Var5);
                        }
                    }
/* 86 */            Objects.requireNonNull(this.f8669f);
/* 89 */            qi1 qi1Var2 = this.f8665b;
                    synchronized (qi1Var2.f15573b) {
/* 98 */                ((LinkedHashSet) qi1Var2.f15574c).add(this);
/* 105 */               ((LinkedHashSet) qi1Var2.f15576e).remove(this);
                    }
/* 113 */           Iterator it2 = qi1Var2.m7860g().iterator();
/* 121 */           while (it2.hasNext() && (gk2Var3 = (gk2) it2.next()) != this) {
                        synchronized (gk2Var3.f8664a) {
                            try {
/* 135 */                       List list = gk2Var3.f8674k;
/* 137 */                       if (list != null) {
/* 139 */                           Iterator it3 = list.iterator();
/* 147 */                           while (it3.hasNext()) {
/* 155 */                               ((d70) it3.next()).m2952b();
                                    }
/* 160 */                           gk2Var3.f8674k = null;
                                }
                            } catch (Throwable th) {
/* 173 */                       throw th;
                            }
                        }
/* 168 */               gk2Var3.f8684u.m10440w();
                    }
/* 176 */           this.f8669f.mo1717e(gk2Var);
/* 183 */           if (((CaptureSessionOnClosedNotCalledQuirk) d52Var.f7001a) != null) {
/* 187 */               LinkedHashSet<gk2> linkedHashSet2 = new LinkedHashSet();
/* 190 */               Iterator it4 = arrayListM7859e.iterator();
/* 198 */               while (it4.hasNext() && (gk2Var2 = (gk2) it4.next()) != gk2Var) {
/* 209 */                   linkedHashSet2.add(gk2Var2);
                        }
/* 221 */               for (gk2 gk2Var6 : linkedHashSet2) {
/* 229 */                   gk2Var6.getClass();
/* 232 */                   gk2Var6.mo1715c(gk2Var6);
                        }
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: f */
                public final void mo1718f(gk2 gk2Var) {
/* 3 */             Objects.requireNonNull(this.f8669f);
/* 8 */             this.f8669f.mo1718f(gk2Var);
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: g */
                public final void mo1719g(gk2 gk2Var) {
                    int i;
                    C2466xm c2466xm;
                    synchronized (this.f8664a) {
                        try {
/* 6 */                     i = 1;
/* 7 */                     if (this.f8677n) {
/* 23 */                        c2466xm = null;
                            } else {
/* 9 */                         this.f8677n = true;
/* 15 */                        de3.m3027i(this.f8671h, "Need to call openCaptureSession before using this API.");
/* 18 */                        c2466xm = this.f8671h;
                            }
                        } catch (Throwable th) {
/* 43 */                    throw th;
                        }
                    }
/* 25 */            if (c2466xm != null) {
/* 38 */                c2466xm.f19248b.mo3676a(new dk2(this, gk2Var, i), pg3.m7428g());
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: h */
                public final void mo1720h(gk2 gk2Var, Surface surface) {
/* 3 */             Objects.requireNonNull(this.f8669f);
/* 8 */             this.f8669f.mo1720h(gk2Var, surface);
                }

                /* JADX INFO: renamed from: i */
                public final int m3956i(ArrayList arrayList, C0997hn c0997hn) {
/* 3 */             CameraCaptureSession.CaptureCallback captureCallbackM10430b = this.f8684u.m10430b(c0997hn);
/* 11 */            de3.m3027i(this.f8670g, "Need to call openCaptureSession before using this API.");
/* 22 */            return ((C0210cb) this.f8670g.f8789a).mo1404m(arrayList, this.f8667d, captureCallbackM10430b);
                }

                /* JADX INFO: renamed from: j */
                public final void m3957j() {
/* 4 */             int i = 1;
/* 9 */             if (!this.f8686w.compareAndSet(false, true)) {
/* 11 */                m3955l();
/* 14 */                return;
                    }
/* 19 */            if (this.f8685v.f14177a) {
                        try {
/* 21 */                    m3955l();
/* 28 */                    de3.m3027i(this.f8670g, "Need to call openCaptureSession before using this API.");
/* 41 */                    ((CameraCaptureSession) ((C0210cb) this.f8670g.f8789a).f2804b).abortCaptures();
                        } catch (Exception e) {
/* 46 */                    e.toString();
/* 49 */                    m3955l();
                        }
                    }
/* 52 */            m3955l();
/* 68 */            this.f8684u.m10432f().mo3676a(new ek2(this, i), this.f8667d);
                }

                /* JADX INFO: renamed from: k */
                public final void m3958k(CameraCaptureSession cameraCaptureSession) {
/* 3 */             if (this.f8670g == null) {
/* 7 */                 gr0 gr0Var = new gr0();
/* 14 */                if (Build.VERSION.SDK_INT >= 28) {
/* 22 */                    gr0Var.f8789a = new C0188bp(cameraCaptureSession, null);
                        } else {
/* 37 */                    gr0Var.f8789a = new C0210cb(cameraCaptureSession, new C0815cp(this.f8666c));
                        }
/* 39 */                this.f8670g = gr0Var;
                    }
                }

                /* JADX INFO: renamed from: m */
                public final boolean m3959m() {
                    boolean z;
                    synchronized (this.f8664a) {
/* 10 */                z = this.f8671h != null;
                    }
/* 12 */            return z;
                }

                /* JADX INFO: renamed from: n */
                public final s81 m3960n(CameraDevice cameraDevice, kb2 kb2Var, List list) {
                    s81 s81VarM9453w;
                    synchronized (this.f8679p) {
                        try {
/* 6 */                     ArrayList<gk2> arrayListM7859e = this.f8665b.m7859e();
/* 12 */                    ArrayList arrayList = new ArrayList();
/* 23 */                    for (gk2 gk2Var : arrayListM7859e) {
/* 50 */                        arrayList.add(py0.m7599Y(new bp0(gk2Var.f8684u.m10432f(), 1500L, gk2Var.f8678o)));
                            }
/* 68 */                    f81 f81Var = new f81(new ArrayList(arrayList), false, pg3.m7428g());
/* 71 */                    this.f8681r = f81Var;
/* 88 */                    s81VarM9453w = w11.m9453w(w11.m9399I(yo0.m10162b(f81Var), new fk2(this, cameraDevice, kb2Var, list), this.f8667d));
                        } catch (Throwable th) {
/* 95 */                    throw th;
                        }
                    }
/* 93 */            return s81VarM9453w;
                }

                /* JADX INFO: renamed from: o */
                public final int m3961o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
/* 3 */             CameraCaptureSession.CaptureCallback captureCallbackM10430b = this.f8684u.m10430b(captureCallback);
/* 11 */            de3.m3027i(this.f8670g, "Need to call openCaptureSession before using this API.");
/* 22 */            return ((C0210cb) this.f8670g.f8789a).mo1403J(captureRequest, this.f8667d, captureCallbackM10430b);
                }

                /* JADX INFO: renamed from: p */
                public final s81 m3962p(ArrayList arrayList) {
                    synchronized (this.f8664a) {
                        try {
/* 6 */                     if (this.f8676m) {
/* 18 */                        return new tw0(new CancellationException("Opener is disabled"), 1);
                            }
/* 46 */                    RunnableC1901ls runnableC1901lsM9399I = w11.m9399I(yo0.m10162b(qj3.m7879L(arrayList, this.f8667d, this.f8668e)), new C2357x6(15, this, arrayList), this.f8667d);
/* 50 */                    this.f8673j = runnableC1901lsM9399I;
/* 52 */                    return w11.m9453w(runnableC1901lsM9399I);
                        } catch (Throwable th) {
/* 59 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: q */
                public final boolean m3963q() {
                    boolean z;
                    synchronized (this.f8679p) {
                        try {
/* 9 */                     if (m3959m()) {
/* 15 */                        this.f8682s.m9585a(this.f8680q);
                            } else {
/* 21 */                        f81 f81Var = this.f8681r;
/* 23 */                        if (f81Var != null) {
/* 25 */                            f81Var.cancel(true);
                                }
                            }
/* 28 */                    yo0 yo0Var = null;
                            try {
                                synchronized (this.f8664a) {
                                    try {
/* 34 */                                if (!this.f8676m) {
/* 36 */                                    yo0 yo0Var2 = this.f8673j;
/* 38 */                                    yo0Var = yo0Var2 != null ? yo0Var2 : null;
/* 41 */                                    this.f8676m = true;
                                        }
/* 50 */                                z = !m3959m();
                                    } catch (Throwable th) {
/* 60 */                                throw th;
                                    }
                                }
/* 52 */                        if (yo0Var != null) {
/* 54 */                            yo0Var.cancel(true);
                                }
                            } catch (Throwable th2) {
/* 62 */                        if (yo0Var != null) {
/* 64 */                            yo0Var.cancel(true);
                                }
/* 67 */                        throw th2;
                            }
                        } catch (Throwable th3) {
/* 69 */                    throw th3;
                        }
                    }
/* 58 */            return z;
                }

                /* JADX INFO: renamed from: r */
                public final gr0 m3964r() {
/* 3 */             this.f8670g.getClass();
/* 6 */             return this.f8670g;
                }
            }
