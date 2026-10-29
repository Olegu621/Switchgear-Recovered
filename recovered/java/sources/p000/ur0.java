            package p000;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.util.SparseIntArray;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.GoogleApiActivity;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
            import com.google.android.gms.common.internal.RootTelemetryConfiguration;
            import com.google.android.gms.common.internal.TelemetryData;
            import com.google.android.gms.internal.base.zap;
            import com.google.android.gms.internal.base.zau;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ur0 implements Handler.Callback {

                /* JADX INFO: renamed from: p */
                public static final Status f17678p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

                /* JADX INFO: renamed from: q */
                public static final Status f17679q = new Status(4, "The user must be signed in to make this API call.", null, null);

                /* JADX INFO: renamed from: r */
                public static final Object f17680r = new Object();

                /* JADX INFO: renamed from: s */
                public static ur0 f17681s;

                /* JADX INFO: renamed from: a */
                public long f17682a;

                /* JADX INFO: renamed from: b */
                public boolean f17683b;

                /* JADX INFO: renamed from: c */
                public TelemetryData f17684c;

                /* JADX INFO: renamed from: d */
                public fc3 f17685d;

                /* JADX INFO: renamed from: e */
                public final Context f17686e;

                /* JADX INFO: renamed from: f */
                public final pr0 f17687f;

                /* JADX INFO: renamed from: g */
                public final we2 f17688g;

                /* JADX INFO: renamed from: h */
                public final AtomicInteger f17689h;

                /* JADX INFO: renamed from: i */
                public final AtomicInteger f17690i;

                /* JADX INFO: renamed from: j */
                public final ConcurrentHashMap f17691j;

                /* JADX INFO: renamed from: k */
                public ya3 f17692k;

                /* JADX INFO: renamed from: l */
                public final C1827kd f17693l;

                /* JADX INFO: renamed from: m */
                public final C1827kd f17694m;

                /* JADX INFO: renamed from: n */
                public final zau f17695n;

                /* JADX INFO: renamed from: o */
                public volatile boolean f17696o;

                public ur0(Looper looper, Context context) {
/* 1 */             pr0 pr0Var = pr0.f15259d;
/* 8 */             this.f17682a = 10000L;
/* 11 */            this.f17683b = false;
/* 19 */            this.f17689h = new AtomicInteger(1);
/* 26 */            this.f17690i = new AtomicInteger(0);
/* 36 */            this.f17691j = new ConcurrentHashMap(5, 0.75f, 1);
/* 39 */            this.f17692k = null;
/* 46 */            this.f17693l = new C1827kd(0);
/* 53 */            this.f17694m = new C1827kd(0);
/* 55 */            this.f17696o = true;
/* 57 */            this.f17686e = context;
/* 61 */            zau zauVar = new zau(looper, this);
/* 64 */            this.f17695n = zauVar;
/* 66 */            this.f17687f = pr0Var;
/* 75 */            this.f17688g = new we2(17);
/* 77 */            PackageManager packageManager = context.getPackageManager();
/* 83 */            if (i13.f9413p == null) {
/* 105 */               i13.f9413p = Boolean.valueOf(j13.m5650l() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
                    }
/* 113 */           if (i13.f9413p.booleanValue()) {
/* 115 */               this.f17696o = false;
                    }
/* 122 */           zauVar.sendMessage(zauVar.obtainMessage(6));
                }

                /* JADX INFO: renamed from: a */
                public static void m9123a() {
                    synchronized (f17680r) {
                        try {
/* 4 */                     ur0 ur0Var = f17681s;
/* 6 */                     if (ur0Var != null) {
/* 10 */                        ur0Var.f17690i.incrementAndGet();
/* 13 */                        zau zauVar = ur0Var.f17695n;
/* 21 */                        zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                            }
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public static Status m9124e(C2323w9 c2323w9, ConnectionResult connectionResult) {
/* 23 */            return new Status(17, AbstractC0886en.m3509m("API: ", c2323w9.f18480b.f8968c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.f3417c, connectionResult);
                }

                /* JADX INFO: renamed from: h */
                public static ur0 m9125h(Context context) {
                    ur0 ur0Var;
                    HandlerThread handlerThread;
                    synchronized (f17680r) {
/* 6 */                 if (f17681s == null) {
                            synchronized (lr0.f13459a) {
                                try {
/* 11 */                            handlerThread = lr0.f13461c;
/* 13 */                            if (handlerThread == null) {
/* 25 */                                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
/* 28 */                                lr0.f13461c = handlerThread2;
/* 30 */                                handlerThread2.start();
/* 33 */                                handlerThread = lr0.f13461c;
                                    }
                                } catch (Throwable th) {
/* 57 */                            throw th;
                                }
                            }
/* 36 */                    Looper looper = handlerThread.getLooper();
/* 42 */                    Context applicationContext = context.getApplicationContext();
/* 46 */                    Object obj = pr0.f15258c;
/* 51 */                    f17681s = new ur0(looper, applicationContext);
                        }
/* 58 */                ur0Var = f17681s;
                    }
/* 61 */            return ur0Var;
                }

                /* JADX INFO: renamed from: b */
                public final void m9126b(ya3 ya3Var) {
                    synchronized (f17680r) {
                        try {
/* 6 */                     if (this.f17692k != ya3Var) {
/* 8 */                         this.f17692k = ya3Var;
/* 12 */                        this.f17693l.clear();
                            }
/* 22 */                    this.f17693l.addAll(ya3Var.f19560e);
                        } catch (Throwable th) {
/* 28 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final boolean m9127c() {
/* 3 */             if (this.f17683b) {
/* 39 */                return false;
                    }
/* 12 */            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) d52.m2927D().f7001a;
/* 14 */            if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f3515b) {
/* 39 */                return false;
                    }
/* 30 */            int i = ((SparseIntArray) this.f17688g.f18596c).get(203400000, -1);
                    return i == -1 || i == 0;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m9128d(ConnectionResult connectionResult, int i) {
/* 1 */             pr0 pr0Var = this.f17687f;
/* 3 */             pr0Var.getClass();
/* 6 */             Context context = this.f17686e;
/* 13 */            if (!py0.m7609p0(context)) {
/* 16 */                int i2 = connectionResult.f3416b;
/* 18 */                PendingIntent activity = connectionResult.f3417c;
/* 28 */                if (!((i2 == 0 || activity == null) ? false : true)) {
/* 31 */                    activity = null;
/* 32 */                    Intent intentM8003a = pr0Var.m8003a(context, null, i2);
/* 36 */                    if (intentM8003a != null) {
/* 41 */                        activity = PendingIntent.getActivity(context, 0, intentM8003a, 201326592);
                            }
                        }
/* 45 */                if (activity != null) {
/* 47 */                    int i3 = GoogleApiActivity.f3436b;
/* 53 */                    Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
/* 58 */                    intent.putExtra("pending_intent", activity);
/* 63 */                    intent.putExtra("failing_client_id", i);
/* 68 */                    intent.putExtra("notify_manager", true);
/* 80 */                    pr0Var.m7543g(context, i2, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
/* 20 */                    return true;
                        }
                    }
/* 12 */            return false;
                }

                /* JADX INFO: renamed from: f */
                public final cb3 m9129f(or0 or0Var) {
/* 1 */             C2323w9 apiKey = or0Var.getApiKey();
/* 5 */             ConcurrentHashMap concurrentHashMap = this.f17691j;
/* 11 */            cb3 cb3Var = (cb3) concurrentHashMap.get(apiKey);
/* 13 */            if (cb3Var == null) {
/* 17 */                cb3Var = new cb3(this, or0Var);
/* 20 */                concurrentHashMap.put(apiKey, cb3Var);
                    }
/* 29 */            if (cb3Var.f2821b.requiresSignIn()) {
/* 33 */                this.f17694m.add(apiKey);
                    }
/* 36 */            cb3Var.m1623n();
/* 39 */            return cb3Var;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x004a  */
                /* JADX INFO: renamed from: g */
                public final void m9130g(TaskCompletionSource taskCompletionSource, int i, or0 or0Var) {
                    ib3 ib3Var;
                    ur0 ur0Var;
/* 1 */             if (i != 0) {
/* 3 */                 C2323w9 apiKey = or0Var.getApiKey();
/* 11 */                if (m9127c()) {
/* 20 */                    RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) d52.m2927D().f7001a;
/* 22 */                    boolean z = true;
/* 23 */                    if (rootTelemetryConfiguration != null) {
/* 27 */                        if (rootTelemetryConfiguration.f3515b) {
/* 29 */                            boolean z2 = rootTelemetryConfiguration.f3516c;
/* 37 */                            cb3 cb3Var = (cb3) this.f17691j.get(apiKey);
/* 39 */                            if (cb3Var != null) {
/* 41 */                                Object obj = cb3Var.f2821b;
/* 45 */                                if (obj instanceof AbstractC0322a) {
/* 47 */                                    AbstractC0322a abstractC0322a = (AbstractC0322a) obj;
/* 53 */                                    if (!abstractC0322a.hasConnectionInfo() || abstractC0322a.isConnecting()) {
/* 75 */                                        z = z2;
                                            } else {
/* 61 */                                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationM4511a = ib3.m4511a(cb3Var, abstractC0322a, i);
/* 65 */                                        if (connectionTelemetryConfigurationM4511a != null) {
/* 70 */                                            cb3Var.f2831n++;
/* 72 */                                            z = connectionTelemetryConfigurationM4511a.f3482c;
                                                }
                                            }
                                        }
                                    } else {
/* 75 */                                z = z2;
                                    }
                                }
/* 77 */                        ib3Var = null;
/* 78 */                        ur0Var = this;
                            }
/* 100 */                   ur0Var = this;
/* 102 */                   ib3Var = new ib3(ur0Var, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
                        } else {
/* 77 */                    ib3Var = null;
/* 78 */                    ur0Var = this;
                        }
/* 106 */               if (ib3Var != null) {
/* 108 */                   Task task = taskCompletionSource.getTask();
/* 112 */                   zau zauVar = ur0Var.f17695n;
/* 114 */                   zauVar.getClass();
/* 122 */                   task.addOnCompleteListener(new wz0(zauVar), ib3Var);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:169:0x0348  */
                /* JADX WARN: Code duplicated, block: B:171:0x034e  */
                /* JADX WARN: Code duplicated, block: B:173:0x036c  */
                /* JADX WARN: Code duplicated, block: B:175:0x0376  */
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 cb3, still in use, count: 2, list:
                      (r5v5 cb3) from 0x0340: IGET (r5v5 cb3) A[WRAPPED] (LINE:833) cb3.i int
                      (r5v5 cb3) from 0x0346: PHI (r5 I:??) = (r5v2 cb3), (r5v5 cb3) binds: [B:167:0x0345, B:224:0x0346] A[DONT_GENERATE, DONT_INLINE]
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                    */
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(android.os.Message r21) {
                    /*
                        Method dump skipped, instruction units count: 1096
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.ur0.handleMessage(android.os.Message):boolean");
                }

                /* JADX INFO: renamed from: i */
                public final void m9131i(ConnectionResult connectionResult, int i) {
/* 5 */             if (m9128d(connectionResult, i)) {
/* 18 */                return;
                    }
/* 9 */             zau zauVar = this.f17695n;
/* 15 */            zauVar.sendMessage(zauVar.obtainMessage(5, i, 0, connectionResult));
                }
            }
