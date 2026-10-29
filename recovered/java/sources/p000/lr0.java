            package p000;

            import android.content.Context;
            import android.content.ServiceConnection;
            import android.os.HandlerThread;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.ServiceConnectionC0325d;
            import java.util.HashMap;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class lr0 {

                /* JADX INFO: renamed from: a */
                public static final Object f13459a = new Object();

                /* JADX INFO: renamed from: b */
                public static dq3 f13460b;

                /* JADX INFO: renamed from: c */
                public static HandlerThread f13461c;

                /* JADX INFO: renamed from: a */
                public static dq3 m6523a(Context context) {
                    synchronized (f13459a) {
                        try {
/* 6 */                     if (f13460b == null) {
/* 21 */                        f13460b = new dq3(context.getMainLooper(), context.getApplicationContext());
                            }
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
/* 27 */            return f13460b;
                }

                /* JADX INFO: renamed from: b */
                public abstract ConnectionResult mo3177b(fn3 fn3Var, ServiceConnectionC0325d serviceConnectionC0325d, String str, Executor executor);

                /* JADX INFO: renamed from: c */
                public final void m6524c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
/* 3 */             fn3 fn3Var = new fn3(str, str2, z);
/* 6 */             dq3 dq3Var = (dq3) this;
/* 10 */            kb1.m6062o(serviceConnection, "ServiceConnection must not be null");
/* 13 */            HashMap map = dq3Var.f7383d;
                    synchronized (map) {
                        try {
/* 24 */                    fo3 fo3Var = (fo3) map.get(fn3Var);
/* 26 */                    if (fo3Var == null) {
/* 101 */                       String string = fn3Var.toString();
/* 113 */                       StringBuilder sb = new StringBuilder(string.length() + 50);
/* 116 */                       sb.append("Nonexistent connection status for service config: ");
/* 119 */                       sb.append(string);
/* 129 */                       throw new IllegalStateException(sb.toString());
                            }
/* 34 */                    if (!fo3Var.f8298a.containsKey(serviceConnection)) {
/* 70 */                        String string2 = fn3Var.toString();
/* 82 */                        StringBuilder sb2 = new StringBuilder(string2.length() + 76);
/* 85 */                        sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
/* 88 */                        sb2.append(string2);
/* 98 */                        throw new IllegalStateException(sb2.toString());
                            }
/* 38 */                    fo3Var.f8298a.remove(serviceConnection);
/* 47 */                    if (fo3Var.f8298a.isEmpty()) {
/* 60 */                        dq3Var.f7385f.sendMessageDelayed(dq3Var.f7385f.obtainMessage(0, fn3Var), dq3Var.f7387h);
                            }
                        } catch (Throwable th) {
/* 131 */                   throw th;
                        }
                    }
                }
            }
