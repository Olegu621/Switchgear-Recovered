            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z93 {

                /* JADX INFO: renamed from: o */
                public static final HashMap f20003o = new HashMap();

                /* JADX INFO: renamed from: a */
                public final Context f20004a;

                /* JADX INFO: renamed from: b */
                public final qa3 f20005b;

                /* JADX INFO: renamed from: c */
                public final String f20006c;

                /* JADX INFO: renamed from: g */
                public boolean f20010g;

                /* JADX INFO: renamed from: h */
                public final Intent f20011h;

                /* JADX INFO: renamed from: i */
                public final ua3 f20012i;

                /* JADX INFO: renamed from: m */
                public y93 f20016m;

                /* JADX INFO: renamed from: n */
                public IInterface f20017n;

                /* JADX INFO: renamed from: d */
                public final ArrayList f20007d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public final HashSet f20008e = new HashSet();

                /* JADX INFO: renamed from: f */
                public final Object f20009f = new Object();

                /* JADX INFO: renamed from: k */
                public final sa3 f20014k = new sa3(this, 0);

                /* JADX INFO: renamed from: l */
                public final AtomicInteger f20015l = new AtomicInteger(0);

                /* JADX INFO: renamed from: j */
                public final WeakReference f20013j = new WeakReference(null);

                public z93(Context context, qa3 qa3Var, String str, Intent intent, ua3 ua3Var) {
/* 40 */            this.f20004a = context;
/* 42 */            this.f20005b = qa3Var;
/* 44 */            this.f20006c = str;
/* 46 */            this.f20011h = intent;
/* 48 */            this.f20012i = ua3Var;
                }

                /* JADX INFO: renamed from: b */
                public static void m10288b(z93 z93Var, ra3 ra3Var) {
/* 1 */             IInterface iInterface = z93Var.f20017n;
/* 3 */             qa3 qa3Var = z93Var.f20005b;
/* 5 */             ArrayList arrayList = z93Var.f20007d;
/* 7 */             int i = 0;
/* 8 */             if (iInterface != null || z93Var.f20010g) {
/* 84 */                if (!z93Var.f20010g) {
/* 97 */                    ra3Var.run();
/* 100 */                   return;
                        } else {
/* 90 */                    qa3Var.m7756b("Waiting to bind to the service.", new Object[0]);
/* 93 */                    arrayList.add(ra3Var);
/* 96 */                    return;
                        }
                    }
/* 18 */            qa3Var.m7756b("Initiate binding to the service.", new Object[0]);
/* 21 */            arrayList.add(ra3Var);
/* 26 */            y93 y93Var = new y93(z93Var, i);
/* 29 */            z93Var.f20016m = y93Var;
/* 32 */            z93Var.f20010g = true;
/* 42 */            if (z93Var.f20004a.bindService(z93Var.f20011h, y93Var, 1)) {
/* 81 */                return;
                    }
/* 48 */            qa3Var.m7756b("Failed to bind to the service.", new Object[0]);
/* 51 */            z93Var.f20010g = false;
/* 53 */            Iterator it = arrayList.iterator();
/* 61 */            while (it.hasNext()) {
/* 74 */                ((ra3) it.next()).mo2452a(new aa3("Failed to bind to the service."));
                    }
/* 78 */            arrayList.clear();
                }

                /* JADX INFO: renamed from: a */
                public final Handler m10289a() {
                    Handler handler;
/* 1 */             HashMap map = f20003o;
                    synchronized (map) {
                        try {
/* 10 */                    if (!map.containsKey(this.f20006c)) {
/* 18 */                        HandlerThread handlerThread = new HandlerThread(this.f20006c, 10);
/* 21 */                        handlerThread.start();
/* 35 */                        map.put(this.f20006c, new Handler(handlerThread.getLooper()));
                            }
/* 47 */                    handler = (Handler) map.get(this.f20006c);
                        } catch (Throwable th) {
/* 52 */                    throw th;
                        }
                    }
/* 50 */            return handler;
                }

                /* JADX INFO: renamed from: c */
                public final void m10290c(ra3 ra3Var, TaskCompletionSource taskCompletionSource) {
/* 14 */            m10289a().post(new ta3(this, ra3Var.m8121c(), taskCompletionSource, ra3Var));
                }

                /* JADX INFO: renamed from: d */
                public final void m10291d(TaskCompletionSource taskCompletionSource) {
                    synchronized (this.f20009f) {
/* 6 */                 this.f20008e.remove(taskCompletionSource);
                    }
/* 20 */            m10289a().post(new x93(this, 1));
                }

                /* JADX INFO: renamed from: e */
                public final void m10292e() {
/* 1 */             HashSet hashSet = this.f20008e;
/* 3 */             Iterator it = hashSet.iterator();
/* 11 */            while (it.hasNext()) {
/* 36 */                ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f20006c).concat(" : Binder has died.")));
                    }
/* 40 */            hashSet.clear();
                }
            }
