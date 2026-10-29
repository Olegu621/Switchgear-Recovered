            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.os.Build;
            import android.os.Bundle;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzgw;
            import com.google.android.gms.internal.play_billing.zzjz;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class gi3 extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8627a = 0;

                /* JADX INFO: renamed from: b */
                public boolean f8628b;

                /* JADX INFO: renamed from: c */
                public boolean f8629c;

                /* JADX INFO: renamed from: d */
                public final Object f8630d;

                public gi3(mp3 mp3Var) {
/* 7 */             kb1.m6061n(mp3Var);
/* 10 */            this.f8630d = mp3Var;
                }

                /* JADX INFO: renamed from: a */
                public synchronized void m3948a(Context context, IntentFilter intentFilter) {
                    try {
/* 4 */                 if (this.f8628b) {
/* 7 */                     return;
                        }
/* 13 */                if (Build.VERSION.SDK_INT >= 33) {
/* 1 */                     context.registerReceiver(this, intentFilter, true != this.f8629c ? 4 : 2);
                        } else {
/* 28 */                    context.registerReceiver(this, intentFilter);
                        }
/* 31 */                this.f8628b = true;
                    } catch (Throwable th) {
/* 36 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m3949b() {
/* 3 */             mp3 mp3Var = (mp3) this.f8630d;
/* 5 */             mp3Var.m6765k0();
/* 12 */            mp3Var.mo4558b().mo1375y();
/* 19 */            mp3Var.mo4558b().mo1375y();
/* 24 */            if (this.f8628b) {
/* 35 */                mp3Var.mo4557a().f17534Y.m8510a("Unregistering connectivity change receiver");
/* 39 */                this.f8628b = false;
/* 41 */                this.f8629c = false;
                        try {
/* 47 */                    mp3Var.f13905W.f9645a.unregisterReceiver(this);
                        } catch (IllegalArgumentException e) {
/* 60 */                    mp3Var.mo4557a().f17538f.m8511b(e, "Failed to unregister the network broadcast receiver");
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public synchronized void m3950c(Context context) {
/* 4 */             if (!this.f8628b) {
/* 20 */                zze.zzl("BillingBroadcastManager", "Receiver is not registered.");
                    } else {
/* 6 */                 context.unregisterReceiver(this);
/* 10 */                this.f8628b = false;
                    }
                }

                /* JADX INFO: renamed from: d */
                public void m3951d(Bundle bundle, C1833kj c1833kj, int i) {
                    try {
/* 3 */                 byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
/* 13 */                jf3 jf3Var = (jf3) ((u93) this.f8630d).f17431d;
/* 15 */                if (byteArray != null) {
/* 31 */                    ((we2) jf3Var).m9569t(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
                        } else {
/* 43 */                    ((we2) jf3Var).m9569t(if3.m4524b(23, i, c1833kj));
                        }
                    } catch (Throwable unused) {
/* 51 */                zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 1 */             int i = this.f8627a;
/* 3 */             Object obj = this.f8630d;
                    switch (i) {
                        case 0:
/* 168 */                   mp3 mp3Var = (mp3) obj;
/* 170 */                   mp3Var.m6765k0();
/* 173 */                   String action = intent.getAction();
/* 185 */                   mp3Var.mo4557a().f17534Y.m8511b(action, "NetworkBroadcastReceiver received action");
/* 194 */                   if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
/* 232 */                       mp3Var.mo4557a().f17541w.m8511b(action, "NetworkBroadcastReceiver received unknown action");
                            } else {
/* 196 */                       ci3 ci3Var = mp3Var.f13911b;
/* 198 */                       mp3.m6728S(ci3Var);
/* 201 */                       boolean zM1683T = ci3Var.m1683T();
/* 207 */                       if (this.f8629c != zM1683T) {
/* 209 */                           this.f8629c = zM1683T;
/* 220 */                           mp3Var.mo4558b().m1370I(new bb3(this, zM1683T));
                                }
                            }
                            break;
                        default:
/* 8 */                     u93 u93Var = (u93) obj;
/* 12 */                    jf3 jf3Var = (jf3) u93Var.f17431d;
/* 16 */                    tz1 tz1Var = (tz1) u93Var.f17430c;
/* 18 */                    Bundle extras = intent.getExtras();
/* 25 */                    if (extras != null) {
/* 53 */                        C1833kj c1833kjZzf = zze.zzf(intent, "BillingBroadcastManager");
/* 57 */                        String action2 = intent.getAction();
/* 73 */                        int i2 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
/* 83 */                        if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED") || action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
/* 143 */                           List listZzj = zze.zzj(extras);
/* 149 */                           if (c1833kjZzf.f12818a == 0) {
/* 157 */                               ((we2) jf3Var).m9571v(if3.m4526d(i2));
                                    } else {
/* 161 */                               m3951d(extras, c1833kjZzf, i2);
                                    }
/* 164 */                           tz1Var.mo3210e(c1833kjZzf, listZzj);
                                } else if (action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
/* 104 */                           if (c1833kjZzf.f12818a == 0) {
/* 119 */                               zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
/* 122 */                               C1833kj c1833kj = kf3.f12730h;
/* 132 */                               ((we2) jf3Var).m9569t(if3.m4524b(77, i2, c1833kj));
/* 139 */                               tz1Var.mo3210e(c1833kj, zzco.zzl());
                                    } else {
/* 106 */                               m3951d(extras, c1833kjZzf, i2);
/* 113 */                               tz1Var.mo3210e(c1833kjZzf, zzco.zzl());
                                    }
                                }
                            } else {
/* 29 */                        zze.zzl("BillingBroadcastManager", "Bundle is null.");
/* 32 */                        C1833kj c1833kj2 = kf3.f12730h;
/* 42 */                        ((we2) jf3Var).m9569t(if3.m4524b(11, 1, c1833kj2));
/* 45 */                        if (tz1Var != null) {
/* 48 */                            tz1Var.mo3210e(c1833kj2, null);
                                }
                            }
                            break;
                    }
                }

/* 12 */        public gi3(u93 u93Var, boolean z) {
/* 13 */            this.f8630d = u93Var;
                    this.f8629c = z;
                }
            }
