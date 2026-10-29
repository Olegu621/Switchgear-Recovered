            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.android.gms.cloudmessaging.zzd;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class fk3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8257a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gp3 f8258b;

                public /* synthetic */ fk3(gp3 gp3Var, int i) {
/* 1 */             this.f8257a = i;
/* 3 */             this.f8258b = gp3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f8257a) {
                        case 0:
                            break;
                        case 1:
/* 14 */                    gp3 gp3Var = this.f8258b;
                            synchronized (gp3Var) {
/* 20 */                        if (gp3Var.f8769a == 1) {
/* 24 */                            gp3Var.m3983a("Timed out while binding");
                                }
                                break;
                            }
/* 31 */                    return;
                        default:
/* 10 */                    this.f8258b.m3983a("Service disconnected");
/* 13 */                    return;
                    }
                    while (true) {
/* 34 */                gp3 gp3Var2 = this.f8258b;
                        synchronized (gp3Var2) {
                            try {
/* 40 */                        if (gp3Var2.f8769a != 2) {
/* 59 */                            return;
                                }
/* 53 */                        if (gp3Var2.f8772d.isEmpty()) {
/* 55 */                            gp3Var2.m3985c();
/* 59 */                            return;
                                }
/* 66 */                        vq3 vq3Var = (vq3) gp3Var2.f8772d.poll();
/* 72 */                        gp3Var2.f8773e.put(vq3Var.f18318a, vq3Var);
/* 90 */                        ((ScheduledExecutorService) gp3Var2.f8774f.f17705c).schedule(new pl3(2, gp3Var2, vq3Var), 30L, TimeUnit.SECONDS);
/* 101 */                       if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 109 */                           "Sending ".concat(String.valueOf(vq3Var));
                                }
/* 112 */                       ur3 ur3Var = gp3Var2.f8774f;
/* 114 */                       Messenger messenger = gp3Var2.f8770b;
/* 116 */                       int i = vq3Var.f18320c;
/* 120 */                       Context context = (Context) ur3Var.f17704b;
/* 122 */                       Message messageObtain = Message.obtain();
/* 126 */                       messageObtain.what = i;
/* 130 */                       messageObtain.arg1 = vq3Var.f18318a;
/* 132 */                       messageObtain.replyTo = messenger;
/* 136 */                       Bundle bundle = new Bundle();
/* 145 */                       bundle.putBoolean("oneWay", vq3Var.m9335a());
/* 154 */                       bundle.putString("pkg", context.getPackageName());
/* 161 */                       bundle.putBundle(SharedDataContentProvider.BASE_PATH, vq3Var.f18321d);
/* 164 */                       messageObtain.setData(bundle);
                                try {
/* 167 */                           we2 we2Var = gp3Var2.f8771c;
/* 171 */                           Messenger messenger2 = (Messenger) we2Var.f18596c;
/* 173 */                           if (messenger2 != null) {
/* 175 */                               messenger2.send(messageObtain);
                                    } else {
/* 182 */                               zzd zzdVar = (zzd) we2Var.f18595b;
/* 184 */                               if (zzdVar == null) {
/* 203 */                                   throw new IllegalStateException("Both messengers are null");
                                        }
/* 186 */                               Messenger messenger3 = zzdVar.f3413a;
/* 188 */                               messenger3.getClass();
/* 191 */                               messenger3.send(messageObtain);
                                    }
                                } catch (RemoteException e) {
/* 209 */                           gp3Var2.m3983a(e.getMessage());
                                }
                            } catch (Throwable th) {
/* 215 */                       throw th;
                            }
                        }
                    }
                }
            }
