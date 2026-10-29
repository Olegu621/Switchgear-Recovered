            package p000;

            import android.hardware.camera2.CameraDevice;
            import android.os.Build;
            import android.os.Handler;
            import io.sentry.AbstractC1733w;
            import io.sentry.C1463g7;
            import io.sentry.C1694u;
            import io.sentry.C1721v;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.ILogger;
            import io.sentry.transport.C1690p;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final /* synthetic */ class fk2 implements InterfaceC2299vm, InterfaceC2251ud {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object f8253a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f8254b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f8255c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f8256d;

                public /* synthetic */ fk2(gk2 gk2Var, CameraDevice cameraDevice, kb2 kb2Var, List list) {
/* 4 */             this.f8253a = gk2Var;
/* 6 */             this.f8256d = cameraDevice;
/* 8 */             this.f8254b = kb2Var;
/* 10 */            this.f8255c = list;
                }

                /* JADX INFO: renamed from: a */
                public void m3771a() {
/* 4 */             ILogger iLogger = (ILogger) this.f8253a;
/* 9 */             String str = (String) this.f8255c;
/* 13 */            AbstractC1733w abstractC1733w = (AbstractC1733w) this.f8256d;
/* 17 */            File file = (File) this.f8254b;
/* 19 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 27 */            iLogger.mo4672k(enumC1553m5, "Started processing cached files from %s", str);
/* 30 */            C1463g7 c1463g7 = abstractC1733w.f11795d;
/* 32 */            ILogger iLogger2 = abstractC1733w.f11793b;
                    try {
/* 44 */                iLogger2.mo4672k(enumC1553m5, "Processing dir. %s", file.getAbsolutePath());
/* 53 */                File[] fileArrListFiles = file.listFiles(new C1694u(abstractC1733w, 0));
/* 57 */                if (fileArrListFiles == null) {
/* 71 */                    iLogger2.mo4672k(EnumC1553m5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                        } else {
/* 94 */                    iLogger2.mo4672k(enumC1553m5, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
/* 99 */                    for (File file2 : fileArrListFiles) {
/* 107 */                       if (file2.isFile()) {
/* 125 */                           String absolutePath = file2.getAbsolutePath();
/* 133 */                           if (!c1463g7.contains(absolutePath)) {
/* 149 */                               C1690p c1690pMo5084d = abstractC1733w.f11792a.mo5084d();
/* 153 */                               if (c1690pMo5084d != null && c1690pMo5084d.m5428f(EnumC1560n.All)) {
/* 169 */                                   iLogger2.mo4672k(EnumC1553m5.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                            break;
                                        } else {
/* 181 */                                   iLogger2.mo4672k(EnumC1553m5.DEBUG, "Processing file: %s", absolutePath);
/* 197 */                                   abstractC1733w.mo5058b(file2, AbstractC1704c.m5450e(new C1721v(abstractC1733w.f11794c, abstractC1733w.f11793b, absolutePath, c1463g7)));
/* 202 */                                   Thread.sleep(100L);
                                        }
                                    } else {
/* 143 */                               iLogger2.mo4672k(EnumC1553m5.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                                    }
                                } else {
/* 121 */                           iLogger2.mo4672k(EnumC1553m5.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 220 */               iLogger2.mo4670b(EnumC1553m5.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
                    }
/* 231 */           iLogger.mo4672k(EnumC1553m5.DEBUG, "Finished processing cached files from %s", str);
                }

                @Override // p000.InterfaceC2251ud
                /* JADX INFO: renamed from: apply */
                public s81 mo10660apply(Object obj) {
/* 3 */             gk2 gk2Var = (gk2) this.f8253a;
/* 7 */             CameraDevice cameraDevice = (CameraDevice) this.f8256d;
/* 11 */            kb2 kb2Var = (kb2) this.f8254b;
/* 15 */            List list = (List) this.f8255c;
/* 23 */            if (gk2Var.f8685v.f14177a) {
/* 31 */                Iterator it = gk2Var.f8665b.m7859e().iterator();
/* 39 */                while (it.hasNext()) {
/* 47 */                    ((gk2) it.next()).m3957j();
                        }
                    }
/* 51 */            gk2.m3955l();
                    synchronized (gk2Var.f8664a) {
                        try {
/* 59 */                    if (gk2Var.f8676m) {
/* 71 */                        return new tw0(new CancellationException("Opener is disabled"), 1);
                            }
/* 78 */                    qi1 qi1Var = gk2Var.f8665b;
                            synchronized (qi1Var.f15573b) {
/* 87 */                        ((LinkedHashSet) qi1Var.f15576e).add(gk2Var);
                            }
/* 91 */                    Handler handler = gk2Var.f8666c;
/* 95 */                    d52 d52Var = new d52();
/* 102 */                   if (Build.VERSION.SDK_INT >= 28) {
/* 106 */                       cameraDevice.getClass();
/* 113 */                       d52Var.f7001a = new C2078pp(cameraDevice, null);
                            } else {
/* 126 */                       d52Var.f7001a = new C0210cb(cameraDevice, new C2115qp(handler));
                            }
/* 133 */                   C2466xm c2466xmM7599Y = py0.m7599Y(new fk2(gk2Var, list, d52Var, kb2Var));
/* 137 */                   gk2Var.f8671h = c2466xmM7599Y;
/* 143 */                   er0 er0Var = new er0(gk2Var, 18);
/* 156 */                   c2466xmM7599Y.mo3676a(new dp0(0, c2466xmM7599Y, er0Var), pg3.m7428g());
/* 161 */                   return w11.m9453w(gk2Var.f8671h);
                        } catch (Throwable th) {
/* 171 */                   throw th;
                        }
                    }
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
                    String str;
/* 3 */             gk2 gk2Var = (gk2) this.f8253a;
/* 7 */             List list = (List) this.f8255c;
/* 11 */            d52 d52Var = (d52) this.f8256d;
/* 15 */            kb2 kb2Var = (kb2) this.f8254b;
                    synchronized (gk2Var.f8664a) {
                        synchronized (gk2Var.f8664a) {
                            synchronized (gk2Var.f8664a) {
                                try {
/* 28 */                            List list2 = gk2Var.f8674k;
/* 30 */                            if (list2 != null) {
/* 32 */                                Iterator it = list2.iterator();
/* 40 */                                while (it.hasNext()) {
/* 48 */                                    ((d70) it.next()).m2952b();
                                        }
/* 53 */                                gk2Var.f8674k = null;
                                    }
                                } catch (Throwable th) {
/* 149 */                           throw th;
                                }
                            }
/* 65 */                    if (!list.isEmpty()) {
/* 67 */                        int i = 0;
/* 83 */                        do {
                                    try {
/* 74 */                                ((d70) list.get(i)).m2954d();
/* 77 */                                i++;
                                    } catch (c70 e) {
/* 88 */                                for (int i2 = i - 1; i2 >= 0; i2--) {
/* 96 */                                    ((d70) list.get(i2)).m2952b();
                                        }
/* 102 */                               throw e;
                                    }
/* 83 */                        } while (i < list.size());
                            }
/* 103 */                   gk2Var.f8674k = list;
                        }
/* 113 */               de3.m3028j("The openCaptureSessionCompleter can only set once!", gk2Var.f8672i == null);
/* 116 */               gk2Var.f8672i = c2260um;
/* 122 */               ((C0210cb) d52Var.f7001a).mo1591n(kb2Var);
/* 138 */               str = "openCaptureSession[session=" + gk2Var + "]";
                    }
/* 143 */           return str;
                }

/* 12 */        public /* synthetic */ fk2(Object obj, Object obj2, Object obj3, Object obj4) {
/* 13 */            this.f8253a = obj;
                    this.f8255c = obj2;
                    this.f8256d = obj3;
                    this.f8254b = obj4;
                }
            }
