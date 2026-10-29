            package p000;

            import android.app.Activity;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import com.google.android.gms.internal.play_billing.zzav;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzel;
            import com.google.android.gms.internal.play_billing.zzeu;
            import com.google.android.gms.internal.play_billing.zzev;
            import com.google.android.gms.internal.play_billing.zzew;
            import com.google.android.gms.internal.play_billing.zzfb;
            import com.google.android.gms.internal.play_billing.zzjz;
            import com.google.android.gms.internal.play_billing.zzkd;
            import com.google.android.gms.internal.play_billing.zzv;
            import com.supercell.titan.C0800g;
            import com.supercell.titan.C0801h;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executors;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.function.Consumer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class gf3 extends C0882ej {

                /* JADX INFO: renamed from: B */
                public final Context f8587B;

                /* JADX INFO: renamed from: C */
                public volatile int f8588C;

                /* JADX INFO: renamed from: D */
                public volatile zzav f8589D;

                /* JADX INFO: renamed from: E */
                public volatile y93 f8590E;

                /* JADX INFO: renamed from: F */
                public volatile zzew f8591F;

                public gf3(ec0 ec0Var, Context context) {
/* 1 */             super(ec0Var, context);
/* 5 */             this.f8588C = 0;
/* 7 */             this.f8587B = context;
                }

                /* JADX INFO: renamed from: B */
                public final /* synthetic */ void m3915B(C0832d5 c0832d5, ds0 ds0Var) {
/* 1 */             super.mo3450b(c0832d5, ds0Var);
                }

                /* JADX INFO: renamed from: C */
                public final /* synthetic */ void m3916C(fs0 fs0Var, C0800g c0800g) {
/* 1 */             super.mo3453e(fs0Var, c0800g);
                }

                /* JADX INFO: renamed from: D */
                public final /* synthetic */ void m3917D(we2 we2Var, C0801h c0801h) {
/* 1 */             super.mo3454f(we2Var, c0801h);
                }

                /* JADX INFO: renamed from: E */
                public final synchronized boolean m3918E() {
                    return (this.f8588C != 2 || this.f8589D == null || this.f8590E == null) ? false : true;
                }

                /* JADX INFO: renamed from: F */
                public final zzeu m3919F(int i) {
/* 5 */             if (m3918E()) {
/* 43 */                return zzv.zza(new we3(this, i));
                    }
/* 11 */            zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
/* 25 */            m3920G(106, 28, kf3.m6096a(-1, "Billing Override Service connection is disconnected."));
/* 33 */            return zzel.zza(0);
                }

                /* JADX INFO: renamed from: G */
                public final void m3920G(int i, int i2, C1833kj c1833kj) {
/* 1 */             zzjz zzjzVarM4524b = if3.m4524b(i, i2, c1833kj);
/* 7 */             Objects.requireNonNull(zzjzVarM4524b, "ApiFailure should not be null");
/* 12 */            this.f7711g.m9569t(zzjzVarM4524b);
                }

                /* JADX INFO: renamed from: H */
                public final void m3921H(int i, Consumer consumer, Runnable runnable) {
                    zzew zzewVar;
                    zzev zzevVar;
/* 1 */             zzeu zzeuVarM3919F = m3919F(i);
/* 5 */             TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    synchronized (this) {
                        try {
/* 10 */                    if (this.f8591F == null) {
/* 20 */                        this.f8591F = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
                            }
/* 25 */                    zzewVar = this.f8591F;
                        } catch (Throwable th) {
/* 67 */                    throw th;
                        }
                    }
/* 30 */            zzeu zzeuVarZzb = zzel.zzb(zzeuVarM3919F, 28500L, timeUnit, zzewVar);
/* 36 */            ur3 ur3Var = new ur3(this, i, consumer, runnable);
                    synchronized (this) {
                        try {
/* 42 */                    if (this.f7730z == null) {
/* 52 */                        this.f7730z = zzfb.zza(m3458l());
                            }
/* 57 */                    zzevVar = this.f7730z;
                        } catch (Throwable th2) {
/* 65 */                    throw th2;
                        }
                    }
/* 60 */            zzel.zzc(zzeuVarZzb, ur3Var, zzevVar);
                }

                @Override // p000.C0882ej, p000.AbstractC0846dj
                /* JADX INFO: renamed from: a */
                public final void mo3135a() {
                    synchronized (this) {
/* 4 */                 zzkd zzkdVarM4526d = if3.m4526d(27);
/* 10 */                Objects.requireNonNull(zzkdVarM4526d, "ApiSuccess should not be null");
/* 15 */                this.f7711g.m9571v(zzkdVarM4526d);
                        try {
                            try {
/* 21 */                        if (this.f8590E != null && this.f8589D != null) {
/* 31 */                            zze.zzk("BillingClientTesting", "Unbinding from Billing Override Service.");
/* 38 */                            this.f8587B.unbindService(this.f8590E);
/* 47 */                            this.f8590E = new y93(this, 1);
                                }
/* 55 */                        this.f8589D = null;
/* 59 */                        if (this.f8591F != null) {
/* 63 */                            this.f8591F.shutdownNow();
/* 66 */                            this.f8591F = null;
                                }
                            } catch (RuntimeException e) {
/* 73 */                        zze.zzm("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                            }
/* 76 */                    this.f8588C = 3;
                        } catch (Throwable th) {
/* 85 */                    this.f8588C = 3;
/* 87 */                    throw th;
                        }
                    }
/* 79 */            super.mo3135a();
                }

                @Override // p000.C0882ej
                /* JADX INFO: renamed from: b */
                public final void mo3450b(C0832d5 c0832d5, ds0 ds0Var) {
/* 17 */            m3921H(4, new ve3(c0832d5, ds0Var), new js0(this, c0832d5, ds0Var, 7, false));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.C0882ej
                /* JADX INFO: renamed from: d */
                public final C1833kj mo3452d(Activity activity, C1029ij c1029ij) {
/* 8 */             int iIntValue = 0;
                    try {
/* 21 */                iIntValue = ((Integer) m3919F(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
                    } catch (TimeoutException e) {
/* 58 */                m3920G(114, 28, kf3.f12741s);
/* 63 */                zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
                    } catch (Exception e2) {
/* 32 */                if (e2 instanceof InterruptedException) {
/* 38 */                    Thread.currentThread().interrupt();
                        }
/* 45 */                m3920G(107, 28, kf3.f12741s);
/* 50 */                zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
                    }
/* 66 */            if (iIntValue > 0) {
/* 70 */                C1833kj c1833kjM6096a = kf3.m6096a(iIntValue, "Billing override value was set by a license tester.");
/* 76 */                m3920G(105, 2, c1833kjM6096a);
/* 79 */                m3449A(c1833kjM6096a);
/* 102 */               return c1833kjM6096a;
                    }
                    try {
/* 83 */                return super.mo3452d(activity, c1029ij);
                    } catch (Exception e3) {
/* 89 */                C1833kj c1833kj = kf3.f12730h;
/* 93 */                m3920G(115, 2, c1833kj);
/* 98 */                zze.zzm("BillingClientTesting", "An internal error occurred.", e3);
/* 101 */               return c1833kj;
                    }
                }

                @Override // p000.C0882ej
                /* JADX INFO: renamed from: e */
                public final void mo3453e(fs0 fs0Var, C0800g c0800g) {
/* 18 */            m3921H(7, new ue3(c0800g, 0), new js0(this, fs0Var, c0800g, 6, false));
                }

                @Override // p000.C0882ej
                /* JADX INFO: renamed from: f */
                public final void mo3454f(we2 we2Var, C0801h c0801h) {
/* 20 */            m3921H(8, new ue3(c0801h, 1), new js0(this, we2Var, c0801h, 8, false));
                }

                @Override // p000.C0882ej
                /* JADX INFO: renamed from: g */
                public final void mo3455g(InterfaceC0919fj interfaceC0919fj) {
                    synchronized (this) {
/* 8 */                 if (m3918E()) {
/* 14 */                    zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
/* 17 */                    zzkd zzkdVarM4526d = if3.m4526d(26);
/* 23 */                    Objects.requireNonNull(zzkdVarM4526d, "ApiSuccess should not be null");
/* 28 */                    this.f7711g.m9571v(zzkdVarM4526d);
                        } else {
/* 39 */                    int i = 1;
/* 40 */                    if (this.f8588C == 1) {
/* 46 */                        zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                            } else if (this.f8588C == 3) {
/* 61 */                        zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
/* 73 */                        m3920G(38, 26, kf3.m6096a(-1, "Billing Override Service connection is disconnected."));
                            } else {
/* 79 */                        this.f8588C = 1;
/* 85 */                        zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
/* 93 */                        this.f8590E = new y93(this, i);
/* 99 */                        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
/* 104 */                       intent.setPackage("com.google.android.apps.play.billingtestcompanion");
/* 114 */                       List<ResolveInfo> listQueryIntentServices = this.f8587B.getPackageManager().queryIntentServices(intent, 0);
/* 120 */                       if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 203 */                           i = 41;
                                } else {
/* 134 */                           ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
/* 136 */                           if (serviceInfo != null) {
/* 138 */                               String str = serviceInfo.packageName;
/* 140 */                               String str2 = serviceInfo.name;
/* 150 */                               if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
/* 199 */                                   zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                                        } else {
/* 156 */                                   ComponentName componentName = new ComponentName(str, str2);
/* 161 */                                   Intent intent2 = new Intent(intent);
/* 164 */                                   intent2.setComponent(componentName);
/* 175 */                                   if (this.f8587B.bindService(intent2, this.f8590E, 1)) {
/* 181 */                                       zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                            } else {
/* 190 */                                       zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                            }
                                        }
/* 193 */                               i = 39;
                                    }
                                }
/* 204 */                       this.f8588C = 0;
/* 210 */                       zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
/* 220 */                       m3920G(i, 26, kf3.m6096a(2, "Billing Override Service unavailable on device."));
                            }
                        }
                    }
/* 224 */           super.mo3455g(interfaceC0919fj);
                }

/* 9 */         public gf3(ec0 ec0Var, Context context, tz1 tz1Var) {
/* 10 */            super(ec0Var, context, tz1Var);
                    this.f8588C = 0;
                    this.f8587B = context;
                }
            }
