            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.core.appupdate.internal.zzf;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yr3 {

                /* JADX INFO: renamed from: n */
                public static final HashMap f19785n = new HashMap();

                /* JADX INFO: renamed from: a */
                public final Context f19786a;

                /* JADX INFO: renamed from: b */
                public final C0204c5 f19787b;

                /* JADX INFO: renamed from: g */
                public boolean f19792g;

                /* JADX INFO: renamed from: h */
                public final Intent f19793h;

                /* JADX INFO: renamed from: l */
                public y93 f19797l;

                /* JADX INFO: renamed from: m */
                public zzf f19798m;

                /* JADX INFO: renamed from: d */
                public final ArrayList f19789d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public final HashSet f19790e = new HashSet();

                /* JADX INFO: renamed from: f */
                public final Object f19791f = new Object();

                /* JADX INFO: renamed from: j */
                public final sa3 f19795j = new sa3(this, 1);

                /* JADX INFO: renamed from: k */
                public final AtomicInteger f19796k = new AtomicInteger(0);

                /* JADX INFO: renamed from: c */
                public final String f19788c = "AppUpdateService";

                /* JADX INFO: renamed from: i */
                public final WeakReference f19794i = new WeakReference(null);

                public yr3(Context context, C0204c5 c0204c5, Intent intent) {
/* 41 */            this.f19786a = context;
/* 43 */            this.f19787b = c0204c5;
/* 49 */            this.f19793h = intent;
                }

                /* JADX INFO: renamed from: b */
                public static void m10176b(yr3 yr3Var, dn3 dn3Var) {
/* 1 */             zzf zzfVar = yr3Var.f19798m;
/* 3 */             C0204c5 c0204c5 = yr3Var.f19787b;
/* 5 */             ArrayList<dn3> arrayList = yr3Var.f19789d;
/* 8 */             if (zzfVar != null || yr3Var.f19792g) {
/* 89 */                if (!yr3Var.f19792g) {
/* 102 */                   dn3Var.run();
/* 105 */                   return;
                        } else {
/* 95 */                    c0204c5.m1530c("Waiting to bind to the service.", new Object[0]);
/* 98 */                    arrayList.add(dn3Var);
/* 101 */                   return;
                        }
                    }
/* 18 */            c0204c5.m1530c("Initiate binding to the service.", new Object[0]);
/* 21 */            arrayList.add(dn3Var);
/* 27 */            y93 y93Var = new y93(yr3Var, 2);
/* 30 */            yr3Var.f19797l = y93Var;
/* 33 */            yr3Var.f19792g = true;
/* 43 */            if (yr3Var.f19786a.bindService(yr3Var.f19793h, y93Var, 1)) {
/* 86 */                return;
                    }
/* 49 */            c0204c5.m1530c("Failed to bind to the service.", new Object[0]);
/* 52 */            yr3Var.f19792g = false;
/* 62 */            for (dn3 dn3Var2 : arrayList) {
/* 72 */                C2086px c2086px = new C2086px("Failed to bind to the service.");
/* 75 */                TaskCompletionSource taskCompletionSource = dn3Var2.f7351a;
/* 77 */                if (taskCompletionSource != null) {
/* 79 */                    taskCompletionSource.trySetException(c2086px);
                        }
                    }
/* 83 */            arrayList.clear();
                }

                /* JADX INFO: renamed from: a */
                public final Handler m10177a() {
                    Handler handler;
/* 1 */             HashMap map = f19785n;
                    synchronized (map) {
                        try {
/* 10 */                    if (!map.containsKey(this.f19788c)) {
/* 18 */                        HandlerThread handlerThread = new HandlerThread(this.f19788c, 10);
/* 21 */                        handlerThread.start();
/* 35 */                        map.put(this.f19788c, new Handler(handlerThread.getLooper()));
                            }
/* 47 */                    handler = (Handler) map.get(this.f19788c);
                        } catch (Throwable th) {
/* 52 */                    throw th;
                        }
                    }
/* 50 */            return handler;
                }

                /* JADX INFO: renamed from: c */
                public final void m10178c(TaskCompletionSource taskCompletionSource) {
                    synchronized (this.f19791f) {
/* 6 */                 this.f19790e.remove(taskCompletionSource);
                    }
/* 20 */            m10177a().post(new xq3(this, 0));
                }

                /* JADX INFO: renamed from: d */
                public final void m10179d() {
/* 1 */             HashSet hashSet = this.f19790e;
/* 3 */             Iterator it = hashSet.iterator();
/* 11 */            while (it.hasNext()) {
/* 36 */                ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f19788c).concat(" : Binder has died.")));
                    }
/* 40 */            hashSet.clear();
                }
            }
