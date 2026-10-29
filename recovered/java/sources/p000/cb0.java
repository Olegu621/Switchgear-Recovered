            package p000;

            import android.graphics.SurfaceTexture;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.view.Surface;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cb0 implements SurfaceTexture.OnFrameAvailableListener {

                /* JADX INFO: renamed from: a */
                public final ab0 f2806a;

                /* JADX INFO: renamed from: b */
                public final HandlerThread f2807b;

                /* JADX INFO: renamed from: c */
                public final nt0 f2808c;

                /* JADX INFO: renamed from: d */
                public final Handler f2809d;

                /* JADX INFO: renamed from: e */
                public int f2810e;

                /* JADX INFO: renamed from: f */
                public boolean f2811f;

                /* JADX INFO: renamed from: g */
                public final AtomicBoolean f2812g;

                /* JADX INFO: renamed from: h */
                public final LinkedHashMap f2813h;

                /* JADX INFO: renamed from: i */
                public SurfaceTexture f2814i;

                /* JADX INFO: renamed from: j */
                public SurfaceTexture f2815j;

                public cb0(mb0 mb0Var, xt0 xt0Var, xt0 xt0Var2) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 7 */             this.f2810e = 0;
/* 9 */             this.f2811f = false;
/* 16 */            this.f2812g = new AtomicBoolean(false);
/* 23 */            this.f2813h = new LinkedHashMap();
/* 29 */            HandlerThread handlerThread = new HandlerThread("GL Thread");
/* 32 */            this.f2807b = handlerThread;
/* 34 */            handlerThread.start();
/* 43 */            Handler handler = new Handler(handlerThread.getLooper());
/* 46 */            this.f2809d = handler;
/* 53 */            this.f2808c = new nt0(handler);
/* 60 */            this.f2806a = new ab0(xt0Var, xt0Var2);
                    try {
/* 62 */                m1605c(mb0Var);
                    } catch (RuntimeException e) {
/* 67 */                m1607e();
/* 70 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m1603a() {
/* 3 */             if (this.f2811f && this.f2810e == 0) {
/* 9 */                 LinkedHashMap linkedHashMap = this.f2813h;
/* 15 */                Iterator it = linkedHashMap.keySet().iterator();
/* 23 */                while (it.hasNext()) {
/* 31 */                    ((mj2) it.next()).close();
                        }
/* 35 */                linkedHashMap.clear();
/* 38 */                ab0 ab0Var = this.f2806a;
/* 47 */                if (ab0Var.f12424a.getAndSet(false)) {
/* 52 */                    sp0.m8592c(ab0Var.f12426c);
/* 55 */                    ab0Var.m5888h();
                        }
/* 59 */                ab0Var.f156n = -1;
/* 61 */                ab0Var.f157o = -1;
/* 65 */                this.f2807b.quit();
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m1604b(Runnable runnable, Runnable runnable2) {
                    try {
/* 9 */                 this.f2808c.execute(new RunnableC2558zo(7, this, runnable2, runnable));
                    } catch (RejectedExecutionException e) {
/* 18 */                hu0.m4317I0("DualSurfaceProcessor", "Unable to executor runnable", e);
/* 21 */                runnable2.run();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m1605c(mb0 mb0Var) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 7 */             C2260um c2260um = new C2260um();
/* 15 */            c2260um.f17592c = new u32();
/* 19 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 22 */            c2260um.f17591b = c2466xm;
/* 26 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 39 */                m1604b(new RunnableC2558zo(this, mb0Var, c2260um), new RunnableC0981h7(1));
/* 42 */                c2260um.f17590a = "Init GlRenderer";
                    } catch (Exception e) {
/* 46 */                c2466xm.m9977b(e);
                    }
                    try {
/* 49 */                c2466xm.get();
                    } catch (InterruptedException | ExecutionException e2) {
/* 53 */                e = e2;
/* 56 */                if (e instanceof ExecutionException) {
/* 58 */                    e = e.getCause();
                        }
/* 64 */                if (!(e instanceof RuntimeException)) {
/* 76 */                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                        }
/* 68 */                throw ((RuntimeException) e);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m1606d(rj2 rj2Var) {
/* 7 */             if (this.f2812g.get()) {
/* 9 */                 rj2Var.m8191b();
                    } else {
/* 26 */                m1604b(new RunnableC1784j8(19, this, rj2Var), new v60(rj2Var, 0));
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m1607e() {
/* 8 */             if (this.f2812g.getAndSet(true)) {
/* 10 */                return;
                    }
/* 24 */            m1604b(new RunnableC2166s2(this, 17), new RunnableC0981h7(1));
                }

                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    SurfaceTexture surfaceTexture2;
/* 7 */             if (this.f2812g.get() || (surfaceTexture2 = this.f2814i) == null || this.f2815j == null) {
/* 92 */                return;
                    }
/* 19 */            surfaceTexture2.updateTexImage();
/* 24 */            this.f2815j.updateTexImage();
/* 41 */            for (Map.Entry entry : this.f2813h.entrySet()) {
/* 54 */                Surface surface = (Surface) entry.getValue();
/* 61 */                mj2 mj2Var = (mj2) entry.getKey();
/* 67 */                if (mj2Var.f13816c == 34) {
                            try {
/* 79 */                        this.f2806a.m144l(surfaceTexture.getTimestamp(), surface, mj2Var, this.f2814i, this.f2815j);
                            } catch (RuntimeException e) {
/* 88 */                        hu0.m4326U("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                            }
                        }
                    }
                }
            }
