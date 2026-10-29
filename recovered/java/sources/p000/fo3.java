            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.Build;
            import android.os.IBinder;
            import android.os.StrictMode;
            import com.google.android.gms.common.ConnectionResult;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fo3 implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final HashMap f8298a = new HashMap();

                /* JADX INFO: renamed from: b */
                public int f8299b = 2;

                /* JADX INFO: renamed from: c */
                public boolean f8300c;

                /* JADX INFO: renamed from: d */
                public IBinder f8301d;

                /* JADX INFO: renamed from: e */
                public final fn3 f8302e;

                /* JADX INFO: renamed from: f */
                public ComponentName f8303f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ dq3 f8304i;

                public fo3(dq3 dq3Var, fn3 fn3Var) {
/* 4 */             this.f8304i = dq3Var;
/* 6 */             this.f8302e = fn3Var;
                }

                /* JADX INFO: renamed from: a */
                public final ConnectionResult m3802a(String str, Executor executor) {
                    try {
/* 7 */                 Intent intentM6420a = ld3.m6420a(this.f8304i.f7384e, this.f8302e);
/* 12 */                this.f8299b = 3;
/* 14 */                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
/* 22 */                if (Build.VERSION.SDK_INT >= 31) {
/* 37 */                    StrictMode.setVmPolicy(ff3.m3761a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
                        }
                        try {
/* 40 */                    dq3 dq3Var = this.f8304i;
/* 42 */                    C2515yy c2515yy = dq3Var.f7386g;
/* 44 */                    Context context = dq3Var.f7384e;
/* 46 */                    fn3 fn3Var = this.f8302e;
/* 53 */                    boolean zM10194e = c2515yy.m10194e(context, str, intentM6420a, this, 4225, executor);
/* 57 */                    this.f8300c = zM10194e;
/* 59 */                    if (zM10194e) {
/* 72 */                        dq3Var.f7385f.sendMessageDelayed(dq3Var.f7385f.obtainMessage(1, fn3Var), dq3Var.f7388i);
/* 75 */                        return ConnectionResult.f3414f;
                            }
/* 85 */                    this.f8299b = 2;
                            try {
/* 91 */                        dq3Var.f7386g.m10193d(dq3Var.f7384e, this);
                            } catch (IllegalArgumentException unused) {
                            }
/* 99 */                    return new ConnectionResult(16, null, null);
                        } finally {
/* 106 */                   StrictMode.setVmPolicy(vmPolicy);
                        }
                    } catch (id3 e) {
/* 112 */               return e.f9556a;
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onBindingDied(ComponentName componentName) {
/* 1 */             onServiceDisconnected(componentName);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 1 */             dq3 dq3Var = this.f8304i;
                    synchronized (dq3Var.f7383d) {
                        try {
/* 11 */                    dq3Var.f7385f.removeMessages(1, this.f8302e);
/* 14 */                    this.f8301d = iBinder;
/* 16 */                    this.f8303f = componentName;
/* 24 */                    Iterator it = this.f8298a.values().iterator();
/* 32 */                    while (it.hasNext()) {
/* 40 */                        ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                            }
/* 46 */                    this.f8299b = 1;
                        } catch (Throwable th) {
/* 51 */                    throw th;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 1 */             dq3 dq3Var = this.f8304i;
                    synchronized (dq3Var.f7383d) {
                        try {
/* 11 */                    dq3Var.f7385f.removeMessages(1, this.f8302e);
/* 15 */                    this.f8301d = null;
/* 17 */                    this.f8303f = componentName;
/* 25 */                    Iterator it = this.f8298a.values().iterator();
/* 33 */                    while (it.hasNext()) {
/* 41 */                        ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                            }
/* 48 */                    this.f8299b = 2;
                        } catch (Throwable th) {
/* 53 */                    throw th;
                        }
                    }
                }
            }
