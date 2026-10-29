            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.Looper;
            import android.os.Messenger;
            import android.util.Log;
            import android.util.SparseArray;
            import com.google.android.gms.internal.cloudmessaging.zzf;
            import java.util.ArrayDeque;
            import java.util.Iterator;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gp3 implements ServiceConnection {

                /* JADX INFO: renamed from: c */
                public we2 f8771c;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ur3 f8774f;

                /* JADX INFO: renamed from: a */
                public int f8769a = 0;

                /* JADX INFO: renamed from: b */
                public final Messenger f8770b = new Messenger(new zzf(Looper.getMainLooper(), new kf2(this, 1)));

                /* JADX INFO: renamed from: d */
                public final ArrayDeque f8772d = new ArrayDeque();

                /* JADX INFO: renamed from: e */
                public final SparseArray f8773e = new SparseArray();

                public /* synthetic */ gp3(ur3 ur3Var) {
/* 4 */             this.f8774f = ur3Var;
                }

                /* JADX INFO: renamed from: a */
                public final synchronized void m3983a(String str) {
/* 3 */             m3984b(str, null);
                }

                /* JADX INFO: renamed from: b */
                public final synchronized void m3984b(String str, SecurityException securityException) {
                    try {
/* 9 */                 if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 17 */                    "Disconnected: ".concat(String.valueOf(str));
                        }
/* 23 */                int i = this.f8769a;
/* 25 */                if (i == 0) {
/* 123 */                   throw new IllegalStateException();
                        }
/* 29 */                if (i != 1 && i != 2) {
/* 34 */                    if (i != 3) {
/* 37 */                        return;
                            }
/* 38 */                    this.f8769a = 4;
/* 41 */                    return;
                        }
/* 42 */                this.f8769a = 4;
/* 54 */                C2515yy.m10190b().m10193d((Context) this.f8774f.f17704b, this);
/* 60 */                C1898lp c1898lp = new C1898lp(str, 7, securityException);
/* 65 */                Iterator it = this.f8772d.iterator();
/* 73 */                while (it.hasNext()) {
/* 81 */                    ((vq3) it.next()).m9336b(c1898lp);
                        }
/* 87 */                this.f8772d.clear();
/* 90 */                int i2 = 0;
                        while (true) {
/* 93 */                    int size = this.f8773e.size();
/* 97 */                    SparseArray sparseArray = this.f8773e;
/* 99 */                    if (i2 >= size) {
/* 113 */                       sparseArray.clear();
/* 117 */                       return;
                            } else {
/* 107 */                       ((vq3) sparseArray.valueAt(i2)).m9336b(c1898lp);
/* 110 */                       i2++;
                            }
                        }
                    } catch (Throwable th) {
/* 125 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final synchronized void m3985c() {
/* 5 */             if (this.f8769a == 2 && this.f8772d.isEmpty() && this.f8773e.size() == 0) {
/* 24 */                this.f8769a = 3;
/* 36 */                C2515yy.m10190b().m10193d((Context) this.f8774f.f17704b, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: d */
                public final synchronized boolean m3986d(vq3 vq3Var) {
                    try {
/* 2 */                 int i = this.f8769a;
/* 4 */                 Object[] objArr = 0;
/* 5 */                 int i2 = 1;
/* 6 */                 if (i != 0) {
/* 8 */                     if (i == 1) {
/* 40 */                        this.f8772d.add(vq3Var);
/* 5 */                         return true;
                            }
/* 11 */                    if (i != 2) {
/* 4 */                         return false;
                            }
/* 17 */                    this.f8772d.add(vq3Var);
/* 31 */                    ((ScheduledExecutorService) this.f8774f.f17705c).execute(new fk3(this, objArr == true ? 1 : 0));
/* 5 */                     return true;
                        }
/* 47 */                this.f8772d.add(vq3Var);
/* 55 */                kb1.m6065r(this.f8769a == 0);
/* 58 */                this.f8769a = 1;
/* 64 */                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
/* 69 */                intent.setPackage("com.google.android.gms");
                        try {
/* 86 */                    if (C2515yy.m10190b().m10191a((Context) this.f8774f.f17704b, intent, this, 1)) {
/* 111 */                       ((ScheduledExecutorService) this.f8774f.f17705c).schedule(new fk3(this, i2), 30L, TimeUnit.SECONDS);
                            } else {
/* 90 */                        m3983a("Unable to bind to service");
                            }
                        } catch (SecurityException e) {
/* 117 */                   m3984b("Unable to bind to service", e);
                        }
/* 5 */                 return true;
                    } catch (Throwable th) {
/* 123 */               throw th;
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 14 */            ((ScheduledExecutorService) this.f8774f.f17705c).execute(new dp0(27, this, iBinder));
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 13 */            ((ScheduledExecutorService) this.f8774f.f17705c).execute(new fk3(this, 2));
                }
            }
