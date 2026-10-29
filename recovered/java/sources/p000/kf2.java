            package p000;

            import android.content.ComponentName;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Message;
            import android.util.Log;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kf2 implements Handler.Callback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12721a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f12722b;

                public /* synthetic */ kf2(Object obj, int i) {
/* 1 */             this.f12721a = i;
/* 3 */             this.f12722b = obj;
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
/* 5 */             ComponentName componentName = null;
                    switch (this.f12721a) {
                        case 0:
/* 328 */                   if (message.what == 0) {
/* 333 */                       C0828d1 c0828d1 = (C0828d1) this.f12722b;
/* 337 */                       if (message.obj == null) {
                                    synchronized (c0828d1.f6954a) {
                                        try {
/* 346 */                                   throw null;
                                        } catch (Throwable th) {
/* 349 */                                   throw th;
                                        }
                                    }
                                }
/* 339 */                       C1697u2.m5431g();
                            }
/* 6 */                     return false;
                        case 1:
/* 181 */                   int i = message.arg1;
/* 186 */                   gp3 gp3Var = (gp3) this.f12722b;
                            synchronized (gp3Var) {
                                try {
/* 195 */                           vq3 vq3Var = (vq3) gp3Var.f8773e.get(i);
/* 197 */                           if (vq3Var != null) {
/* 222 */                               gp3Var.f8773e.remove(i);
/* 225 */                               gp3Var.m3985c();
/* 229 */                               Bundle data = message.getData();
/* 240 */                               if (!data.getBoolean("unsupported", false)) {
                                            switch (vq3Var.f18322e) {
                                                case 0:
/* 294 */                                           if (!data.getBoolean("ack", false)) {
/* 320 */                                               vq3Var.m9336b(new C1898lp("Invalid response to one way request", 7, null));
                                                    } else {
/* 302 */                                               if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 304 */                                                   vq3Var.toString();
                                                        }
/* 309 */                                               vq3Var.f18319b.setResult(null);
                                                    }
                                                    break;
                                                default:
/* 260 */                                           Bundle bundle = data.getBundle(SharedDataContentProvider.BASE_PATH);
/* 264 */                                           if (bundle == null) {
/* 266 */                                               bundle = Bundle.EMPTY;
                                                    }
/* 274 */                                           if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 276 */                                               vq3Var.toString();
/* 279 */                                               String.valueOf(bundle);
                                                    }
/* 284 */                                           vq3Var.f18319b.setResult(bundle);
                                                    break;
                                            }
                                        } else {
/* 249 */                                   vq3Var.m9336b(new C1898lp("Not supported by GmsCore", 7, null));
                                        }
                                    } else {
/* 213 */                               AbstractC1245n0.m4889q("MessengerIpcClient", "Received response for unknown request: " + i);
                                    }
                                } catch (Throwable th2) {
/* 325 */                           throw th2;
                                }
                            }
/* 3 */                     return true;
                        default:
/* 10 */                    int i2 = message.what;
/* 14 */                    if (i2 == 0) {
/* 115 */                       dq3 dq3Var = (dq3) this.f12722b;
                                synchronized (dq3Var.f7383d) {
                                    try {
/* 122 */                               fn3 fn3Var = (fn3) message.obj;
/* 130 */                               fo3 fo3Var = (fo3) dq3Var.f7383d.get(fn3Var);
/* 132 */                               if (fo3Var != null && fo3Var.f8298a.isEmpty()) {
/* 144 */                                   if (fo3Var.f8300c) {
/* 146 */                                       fn3 fn3Var2 = fo3Var.f8302e;
/* 148 */                                       dq3 dq3Var2 = fo3Var.f8304i;
/* 152 */                                       dq3Var2.f7385f.removeMessages(1, fn3Var2);
/* 159 */                                       dq3Var2.f7386g.m10193d(dq3Var2.f7384e, fo3Var);
/* 162 */                                       fo3Var.f8300c = false;
/* 165 */                                       fo3Var.f8299b = 2;
                                            }
/* 169 */                                   dq3Var.f7383d.remove(fn3Var);
                                        }
                                    } catch (Throwable th3) {
/* 178 */                               throw th3;
                                    }
                                    break;
                                }
/* 3 */                         return true;
                            }
/* 16 */                    if (i2 != 1) {
/* 6 */                         return false;
                            }
/* 23 */                    dq3 dq3Var3 = (dq3) this.f12722b;
                            synchronized (dq3Var3.f7383d) {
                                try {
/* 30 */                            fn3 fn3Var3 = (fn3) message.obj;
/* 38 */                            fo3 fo3Var2 = (fo3) dq3Var3.f7383d.get(fn3Var3);
/* 40 */                            if (fo3Var2 != null && fo3Var2.f8299b == 3) {
/* 48 */                                String strValueOf = String.valueOf(fn3Var3);
/* 60 */                                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
/* 63 */                                sb.append("Timeout waiting for ServiceConnection callback ");
/* 66 */                                sb.append(strValueOf);
/* 78 */                                AbstractC1245n0.m4877e("GmsClientSupervisor", sb.toString(), new Exception());
/* 81 */                                ComponentName componentName2 = fo3Var2.f8303f;
/* 83 */                                if (componentName2 == null) {
/* 85 */                                    fn3Var3.getClass();
                                        } else {
/* 91 */                                    componentName = componentName2;
                                        }
/* 92 */                                if (componentName == null) {
/* 96 */                                    String str = fn3Var3.f8293b;
/* 98 */                                    kb1.m6061n(str);
/* 103 */                                   componentName = new ComponentName(str, "unknown");
                                        }
/* 106 */                               fo3Var2.onServiceDisconnected(componentName);
                                    }
                                } catch (Throwable th4) {
/* 112 */                           throw th4;
                                }
                                break;
                            }
/* 3 */                     return true;
                    }
                }
            }
