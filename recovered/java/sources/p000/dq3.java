            package p000;

            import android.content.Context;
            import android.os.Looper;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.ServiceConnectionC0325d;
            import com.google.android.gms.internal.common.zzg;
            import java.util.HashMap;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dq3 extends lr0 {

                /* JADX INFO: renamed from: d */
                public final HashMap f7383d = new HashMap();

                /* JADX INFO: renamed from: e */
                public final Context f7384e;

                /* JADX INFO: renamed from: f */
                public volatile zzg f7385f;

                /* JADX INFO: renamed from: g */
                public final C2515yy f7386g;

                /* JADX INFO: renamed from: h */
                public final long f7387h;

                /* JADX INFO: renamed from: i */
                public final long f7388i;

                public dq3(Looper looper, Context context) {
/* 14 */            kf2 kf2Var = new kf2(this, 2);
/* 21 */            this.f7384e = context.getApplicationContext();
/* 28 */            this.f7385f = new zzg(looper, kf2Var);
/* 34 */            this.f7386g = C2515yy.m10190b();
/* 38 */            this.f7387h = 5000L;
/* 43 */            this.f7388i = 300000L;
                }

                @Override // p000.lr0
                /* JADX INFO: renamed from: b */
                public final ConnectionResult mo3177b(fn3 fn3Var, ServiceConnectionC0325d serviceConnectionC0325d, String str, Executor executor) {
                    ConnectionResult connectionResultM3802a;
/* 1 */             HashMap map = this.f7383d;
                    synchronized (map) {
                        try {
/* 10 */                    fo3 fo3Var = (fo3) map.get(fn3Var);
/* 13 */                    if (executor == null) {
/* 15 */                        executor = null;
                            }
/* 16 */                    if (fo3Var == null) {
/* 20 */                        fo3Var = new fo3(this, fn3Var);
/* 25 */                        fo3Var.f8298a.put(serviceConnectionC0325d, serviceConnectionC0325d);
/* 28 */                        connectionResultM3802a = fo3Var.m3802a(str, executor);
/* 32 */                        map.put(fn3Var, fo3Var);
                            } else {
/* 41 */                        this.f7385f.removeMessages(0, fn3Var);
/* 50 */                        if (fo3Var.f8298a.containsKey(serviceConnectionC0325d)) {
/* 100 */                           String string = fn3Var.toString();
/* 112 */                           StringBuilder sb = new StringBuilder(string.length() + 81);
/* 115 */                           sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
/* 118 */                           sb.append(string);
/* 128 */                           throw new IllegalStateException(sb.toString());
                                }
/* 54 */                        fo3Var.f8298a.put(serviceConnectionC0325d, serviceConnectionC0325d);
/* 57 */                        int i = fo3Var.f8299b;
/* 60 */                        if (i == 1) {
/* 76 */                            serviceConnectionC0325d.onServiceConnected(fo3Var.f8303f, fo3Var.f8301d);
                                } else if (i == 2) {
/* 67 */                            connectionResultM3802a = fo3Var.m3802a(str, executor);
                                }
/* 65 */                        connectionResultM3802a = null;
                            }
/* 82 */                    if (fo3Var.f8300c) {
/* 84 */                        return ConnectionResult.f3414f;
                            }
/* 88 */                    if (connectionResultM3802a == null) {
/* 93 */                        connectionResultM3802a = new ConnectionResult(-1, null, null);
                            }
/* 97 */                    return connectionResultM3802a;
                        } catch (Throwable th) {
/* 130 */                   throw th;
                        }
                    }
                }
            }
