            package p000;

            import android.app.Application;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.SystemClock;
            import android.util.SparseArray;
            import androidx.camera.camera2.Camera2Config$DefaultProvider;
            import androidx.camera.core.impl.MetadataHolderService;
            import androidx.camera.core.impl.QuirkSettingsLoader$MetadataHolderService;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: vq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2303vq {

                /* JADX INFO: renamed from: l */
                public static final Object f18286l = new Object();

                /* JADX INFO: renamed from: m */
                public static final SparseArray f18287m = new SparseArray();

                /* JADX INFO: renamed from: a */
                public final C0210cb f18288a = new C0210cb(19);

                /* JADX INFO: renamed from: b */
                public final Object f18289b = new Object();

                /* JADX INFO: renamed from: c */
                public final C2470xq f18290c;

                /* JADX INFO: renamed from: d */
                public final Executor f18291d;

                /* JADX INFO: renamed from: e */
                public final Handler f18292e;

                /* JADX INFO: renamed from: f */
                public C1896ln f18293f;

                /* JADX INFO: renamed from: g */
                public C0210cb f18294g;

                /* JADX INFO: renamed from: h */
                public C1800jo f18295h;

                /* JADX INFO: renamed from: i */
                public final y42 f18296i;

                /* JADX INFO: renamed from: j */
                public final C2466xm f18297j;

                /* JADX INFO: renamed from: k */
                public int f18298k;

                /* JADX WARN: Code restructure failed: missing block: B:157:0x0261, code lost:
                
                    r6 = r0;
                    r0 = r3;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public C2303vq(Context context) {
                    Camera2Config$DefaultProvider camera2Config$DefaultProvider;
                    Object objMo7025e;
                    Object objMo7025e2;
                    Object objMo7025e3;
                    y42 oo2Var;
                    C2466xm c2466xm;
/* 20 */            boolean z = true;
/* 21 */            this.f18298k = 1;
/* 32 */            for (Context contextM7433l = pg3.m7433l(context); (contextM7433l instanceof ContextWrapper) && !(contextM7433l instanceof Application); contextM7433l = ((ContextWrapper) contextM7433l).getBaseContext()) {
                    }
                    try {
/* 48 */                Context contextM7433l2 = pg3.m7433l(context);
/* 67 */                Bundle bundle = contextM7433l2.getPackageManager().getServiceInfo(new ComponentName(contextM7433l2, (Class<?>) MetadataHolderService.class), 640).metaData;
/* 92 */                String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
/* 93 */                if (string == null) {
/* 97 */                    hu0.m4325T("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
/* 100 */                   camera2Config$DefaultProvider = null;
                        } else {
/* 114 */                   camera2Config$DefaultProvider = (Camera2Config$DefaultProvider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
/* 90 */                e = e;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    } catch (ClassNotFoundException e2) {
/* 88 */                e = e2;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    } catch (IllegalAccessException e3) {
/* 80 */                e = e3;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    } catch (InstantiationException e4) {
/* 86 */                e = e4;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    } catch (NoSuchMethodException e5) {
/* 82 */                e = e5;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    } catch (NullPointerException e6) {
/* 78 */                e = e6;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    } catch (InvocationTargetException e7) {
/* 84 */                e = e7;
/* 119 */               hu0.m4326U("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                    }
/* 123 */           if (camera2Config$DefaultProvider == null) {
/* 620 */               f42.m3656l("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
/* 623 */               throw null;
                    }
/* 125 */           C2470xq cameraXConfig = camera2Config$DefaultProvider.getCameraXConfig();
/* 129 */           this.f18290c = cameraXConfig;
                    try {
/* 135 */               objMo7025e = cameraXConfig.f19321a.mo7025e(C2470xq.f19312V);
                    } catch (IllegalArgumentException unused) {
/* 140 */               objMo7025e = null;
                    }
/* 141 */           i02 i02VarM6052e = (i02) objMo7025e;
/* 143 */           if (i02VarM6052e != null) {
/* 147 */               i02VarM6052e.toString();
/* 150 */               hu0.m4312F0("CameraX");
                    } else {
                        try {
/* 171 */                   Bundle bundle2 = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) QuirkSettingsLoader$MetadataHolderService.class), 640).metaData;
/* 173 */                   if (bundle2 == null) {
/* 177 */                       hu0.m4315H0("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
/* 180 */                       i02VarM6052e = null;
                            } else {
/* 182 */                       i02VarM6052e = kb1.m6052e(context, bundle2);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
/* 187 */                   hu0.m4312F0("QuirkSettingsLoader");
                        }
/* 193 */               Objects.toString(i02VarM6052e);
/* 196 */               hu0.m4312F0("CameraX");
                    }
/* 199 */           if (i02VarM6052e == null) {
/* 201 */               i02VarM6052e = j02.f11985b;
/* 205 */               Objects.toString(i02VarM6052e);
/* 208 */               hu0.m4312F0("CameraX");
                    }
/* 213 */           bl1 bl1Var = j02.f11986c.f11987a;
                    synchronized (bl1Var.f2516a) {
                        try {
/* 229 */                   if (!Objects.equals(bl1Var.f2517b.getAndSet(i02VarM6052e), i02VarM6052e)) {
/* 239 */                       int i = bl1Var.f2518c + 1;
/* 240 */                       bl1Var.f2518c = i;
/* 244 */                       if (!bl1Var.f2519d) {
/* 248 */                           bl1Var.f2519d = true;
/* 252 */                           Iterator it = bl1Var.f2521f.iterator();
                                    while (true) {
/* 261 */                               if (it.hasNext()) {
/* 269 */                                   ((vg2) it.next()).m9267a(i);
                                        } else {
                                            synchronized (bl1Var.f2516a) {
/* 278 */                                       if (bl1Var.f2518c == i) {
                                                    break;
                                                }
/* 603 */                                       Iterator it2 = bl1Var.f2521f.iterator();
/* 607 */                                       int i2 = bl1Var.f2518c;
                                            }
                                        }
                                    }
/* 280 */                           bl1Var.f2519d = false;
                                }
                            }
                        } catch (Throwable th) {
/* 617 */                   throw th;
                        }
                    }
                    try {
/* 289 */               objMo7025e2 = this.f18290c.f19321a.mo7025e(C2470xq.f19316e);
                    } catch (IllegalArgumentException unused3) {
/* 294 */               objMo7025e2 = null;
                    }
/* 295 */           Executor executor = (Executor) objMo7025e2;
                    try {
/* 303 */               objMo7025e3 = this.f18290c.f19321a.mo7025e(C2470xq.f19317f);
                    } catch (IllegalArgumentException unused4) {
/* 308 */               objMo7025e3 = null;
                    }
/* 309 */           Handler handler = (Handler) objMo7025e3;
/* 318 */           this.f18291d = executor == null ? new ExecutorC2339wp() : executor;
/* 320 */           if (handler == null) {
/* 328 */               HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
/* 331 */               handlerThread.start();
/* 342 */               this.f18292e = he3.m4181b(handlerThread.getLooper());
                    } else {
/* 345 */               this.f18292e = handler;
                    }
/* 355 */           Integer num = (Integer) this.f18290c.mo7023b(C2470xq.f19318i, null);
                    synchronized (f18286l) {
                        try {
/* 360 */                   if (num != null) {
/* 376 */                       de3.m3025g("minLogLevel", num.intValue(), 3, 6);
/* 379 */                       SparseArray sparseArray = f18287m;
/* 416 */                       sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
/* 423 */                       if (sparseArray.size() == 0 || sparseArray.get(3) != null) {
/* 434 */                           hu0.f9296d = 3;
                                } else if (sparseArray.get(4) != null) {
/* 444 */                           hu0.f9296d = 4;
                                } else if (sparseArray.get(5) != null) {
/* 454 */                           hu0.f9296d = 5;
                                } else if (sparseArray.get(6) != null) {
/* 463 */                           hu0.f9296d = 6;
                                }
                            }
                        } catch (Throwable th2) {
/* 597 */                   throw th2;
                        }
                    }
/* 468 */           nq1 nq1Var = this.f18290c.f19321a;
/* 470 */           C1888lf c1888lf = C2470xq.f19311U;
/* 472 */           Object objMo7025e4 = y42.f19477a;
                    try {
/* 474 */               objMo7025e4 = nq1Var.mo7025e(c1888lf);
                    } catch (IllegalArgumentException unused5) {
                    }
/* 478 */           y42 y42Var = (y42) objMo7025e4;
/* 480 */           Objects.requireNonNull(y42Var);
/* 483 */           long jMo4260a = y42Var.mo4260a();
/* 489 */           if (y42Var instanceof C1766iq) {
                        switch (((C1766iq) y42Var).f11893b) {
                            case 0:
/* 506 */                       oo2Var = new C1766iq(0, jMo4260a);
                                break;
                            default:
/* 500 */                       oo2Var = new C1766iq(1, jMo4260a);
                                break;
                        }
                    } else {
/* 512 */               oo2Var = new oo2(jMo4260a, y42Var);
                    }
/* 515 */           this.f18296i = oo2Var;
                    synchronized (this.f18289b) {
/* 522 */               if (this.f18298k != 1) {
/* 525 */                   z = false;
                        }
/* 528 */               de3.m3028j("CameraX.initInternal() should only be called once per instance", z);
/* 532 */               this.f18298k = 2;
/* 536 */               C2260um c2260um = new C2260um();
/* 544 */               c2260um.f17592c = new u32();
/* 548 */               c2466xm = new C2466xm(c2260um);
/* 551 */               c2260um.f17591b = c2466xm;
/* 555 */               c2260um.f17590a = AbstractC0886en.class;
                        try {
/* 557 */                   Executor executor2 = this.f18291d;
                            try {
/* 571 */                       executor2.execute(new RunnableC2264uq(this, context, executor2, 1, c2260um, SystemClock.elapsedRealtime()));
/* 576 */                       c2260um.f17590a = "CameraX initInternal";
                            } catch (Exception e8) {
/* 582 */                       e = e8;
/* 583 */                       this = this;
/* 585 */                       c2466xm.m9977b(e);
                            }
                        } catch (Exception e9) {
/* 579 */                   e = e9;
                        }
                    }
/* 589 */           this.f18297j = c2466xm;
                }
            }
