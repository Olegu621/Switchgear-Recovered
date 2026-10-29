            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import com.google.android.gms.internal.play_billing.zzam;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzjx;
            import com.google.android.gms.internal.play_billing.zzjz;
            import com.google.android.gms.internal.play_billing.zzke;
            import com.google.android.gms.internal.play_billing.zzki;
            import com.google.android.gms.internal.play_billing.zzkl;
            import com.google.android.gms.internal.play_billing.zzku;
            import com.google.android.gms.internal.play_billing.zzli;
            import com.google.android.gms.internal.play_billing.zzlk;
            import com.google.android.gms.internal.play_billing.zzlu;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ne3 implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final InterfaceC0919fj f14214a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0882ej f14215b;

                public /* synthetic */ ne3(C0882ej c0882ej, InterfaceC0919fj interfaceC0919fj) {
/* 4 */             this.f14215b = c0882ej;
/* 6 */             this.f14214a = interfaceC0919fj;
                }

                /* JADX INFO: renamed from: a */
                public final void m6973a(C1833kj c1833kj) {
                    synchronized (this.f14215b.f7705a) {
                        try {
/* 11 */                    if (this.f14215b.f7706b == 3) {
/* 14 */                        return;
                            }
/* 20 */                    this.f14214a.onBillingSetupFinished(c1833kj);
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onBindingDied(ComponentName componentName) {
                    boolean z;
/* 5 */             zze.zzl("BillingClient", "Billing service died.");
                    try {
/* 9 */                 C0882ej c0882ej = this.f14215b;
                        synchronized (c0882ej.f7705a) {
/* 16 */                    z = true;
/* 17 */                    if (c0882ej.f7706b != 1) {
/* 20 */                        z = false;
                            }
                        }
/* 24 */                we2 we2Var = this.f14215b.f7711g;
/* 26 */                if (z) {
/* 28 */                    zzjx zzjxVarZzc = zzjz.zzc();
/* 33 */                    zzjxVarZzc.zzn(6);
/* 36 */                    zzke zzkeVarZzc = zzki.zzc();
/* 42 */                    zzkeVarZzc.zzo(122);
/* 45 */                    zzjxVarZzc.zza(zzkeVarZzc);
/* 54 */                    we2Var.m9569t((zzjz) zzjxVarZzc.zzf());
                        } else {
/* 60 */                    zzkl zzklVarZzB = zzkl.zzB();
/* 64 */                    we2Var.getClass();
                            try {
/* 67 */                        zzli zzliVarZzc = zzlk.zzc();
/* 75 */                        zzliVarZzc.zzo((zzku) we2Var.f18596c);
/* 78 */                        zzliVarZzc.zzn(zzklVarZzB);
/* 91 */                        ((zr3) we2Var.f18595b).m10429A((zzlk) zzliVarZzc.zzf());
                            } catch (Throwable th) {
/* 100 */                       zze.zzm("BillingLogger", "Unable to log.", th);
                            }
                        }
                    } catch (Throwable th2) {
/* 111 */               zze.zzm("BillingClient", "Unable to log.", th2);
                    }
                    synchronized (this.f14215b.f7705a) {
/* 124 */               if (this.f14215b.f7706b != 3 && this.f14215b.f7706b != 0) {
/* 135 */                   this.f14215b.m3461o(0);
/* 140 */                   this.f14215b.m3462p();
/* 146 */                   this.f14214a.onBillingServiceDisconnected();
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 5 */             zze.zzk("BillingClient", "Billing service connected.");
                    synchronized (this.f14215b.f7705a) {
                        try {
/* 18 */                    if (this.f14215b.f7706b == 3) {
/* 21 */                        return;
                            }
/* 31 */                    this.f14215b.f7712h = zzam.zzu(iBinder);
/* 34 */                    C0882ej c0882ej = this.f14215b;
/* 61 */                    if (C0882ej.m3447h(new CallableC2139rc(this, 6), 30000L, new bb3(this, 6), c0882ej.m3467u(), c0882ej.m3458l()) == null) {
/* 63 */                        C0882ej c0882ej2 = this.f14215b;
/* 65 */                        C1833kj c1833kjM3456i = c0882ej2.m3456i();
/* 71 */                        c0882ej2.m3470x(25, 6, c1833kjM3456i);
/* 74 */                        m6973a(c1833kjM3456i);
                            }
                        } catch (Throwable th) {
/* 79 */                    throw th;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                    boolean z;
/* 5 */             zze.zzl("BillingClient", "Billing service disconnected.");
                    try {
/* 9 */                 C0882ej c0882ej = this.f14215b;
                        synchronized (c0882ej.f7705a) {
/* 16 */                    z = true;
/* 17 */                    if (c0882ej.f7706b != 1) {
/* 20 */                        z = false;
                            }
                        }
/* 24 */                we2 we2Var = this.f14215b.f7711g;
/* 26 */                if (z) {
/* 28 */                    zzjx zzjxVarZzc = zzjz.zzc();
/* 33 */                    zzjxVarZzc.zzn(6);
/* 36 */                    zzke zzkeVarZzc = zzki.zzc();
/* 42 */                    zzkeVarZzc.zzo(121);
/* 45 */                    zzjxVarZzc.zza(zzkeVarZzc);
/* 54 */                    we2Var.m9569t((zzjz) zzjxVarZzc.zzf());
                        } else {
/* 60 */                    zzlu zzluVarZzB = zzlu.zzB();
/* 64 */                    we2Var.getClass();
/* 67 */                    if (zzluVarZzB != null) {
                                try {
/* 70 */                            zzli zzliVarZzc = zzlk.zzc();
/* 78 */                            zzliVarZzc.zzo((zzku) we2Var.f18596c);
/* 81 */                            zzliVarZzc.zzq(zzluVarZzB);
/* 94 */                            ((zr3) we2Var.f18595b).m10429A((zzlk) zzliVarZzc.zzf());
                                } catch (Throwable th) {
/* 103 */                           zze.zzm("BillingLogger", "Unable to log.", th);
                                }
                            }
                        }
                    } catch (Throwable th2) {
/* 114 */               zze.zzm("BillingClient", "Unable to log.", th2);
                    }
                    synchronized (this.f14215b.f7705a) {
                        try {
/* 127 */                   if (this.f14215b.f7706b == 3) {
/* 130 */                       return;
                            }
/* 135 */                   this.f14215b.m3461o(0);
/* 141 */                   this.f14214a.onBillingServiceDisconnected();
                        } catch (Throwable th3) {
/* 146 */                   throw th3;
                        }
                    }
                }
            }
