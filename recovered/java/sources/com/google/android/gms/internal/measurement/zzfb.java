            package com.google.android.gms.internal.measurement;

            import android.app.Application;
            import android.content.Context;
            import android.content.Intent;
            import android.os.BadParcelableException;
            import android.os.Bundle;
            import android.os.NetworkOnMainThreadException;
            import android.os.RemoteException;
            import android.util.Pair;
            import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Random;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import p000.C0986hc;
            import p000.InterfaceC2475xv;
            import p000.kb1;
            import p000.qj3;
            import p000.qk3;
            import p000.rk3;
            import p000.sb0;
            import p000.wb0;
            import p000.xt0;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfb {
                private static volatile zzfb zzc;
                protected final ExecutorService zzb;
                private final C0986hc zze;
                private final List zzf;
                private int zzg;
                private boolean zzh;
                private final String zzi;
                private volatile zzcr zzj;
                private final String zzd = "FA";
                protected final InterfaceC2475xv zza = xt0.f19362c;

                public zzfb(Context context, Bundle bundle) {
/* 12 */            zzcm.zza();
/* 17 */            zzed zzedVar = new zzed(this);
/* 33 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzedVar);
/* 37 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 44 */            this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
/* 51 */            this.zze = new C0986hc(this);
/* 58 */            this.zzf = new ArrayList();
                    try {
/* 68 */                if (qj3.m7886S(context, yy1.m10208O(context)) != null) {
                            try {
/* 80 */                        Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzfb.class.getClassLoader());
                            } catch (ClassNotFoundException unused) {
/* 85 */                        this.zzi = null;
/* 87 */                        this.zzh = true;
/* 93 */                        AbstractC1245n0.m4889q(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
/* 96 */                        return;
                            }
                        }
                    } catch (IllegalStateException unused2) {
                    }
/* 99 */            this.zzi = "fa";
/* 106 */           zzM(new zzdr(this, context, bundle));
/* 113 */           Application application = (Application) context.getApplicationContext();
/* 115 */           if (application == null) {
/* 121 */               AbstractC1245n0.m4889q(this.zzd, "Unable to register lifecycle notifications. Application null.");
                    } else {
/* 130 */               application.registerActivityLifecycleCallbacks(new zzfa(this));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
                public final void zzM(zzeq zzeqVar) {
/* 3 */             this.zzb.execute(zzeqVar);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
                public final void zzN(Exception exc, boolean z, boolean z2) {
                    zzfb zzfbVar;
                    Exception exc2;
/* 4 */             this.zzh |= z;
/* 6 */             if (z) {
/* 12 */                AbstractC1245n0.m4891s(this.zzd, "Data collection startup failed. No data will be collected.", exc);
/* 15 */                return;
                    }
/* 18 */            if (z2) {
/* 23 */                zzfbVar = this;
/* 24 */                exc2 = exc;
/* 25 */                zzfbVar.zzD(5, "Error with data collection. Data lost.", exc2, null, null);
                    } else {
/* 29 */                zzfbVar = this;
/* 30 */                exc2 = exc;
                    }
/* 33 */            AbstractC1245n0.m4891s(zzfbVar.zzd, "Error with data collection. Data lost.", exc2);
                }

                private final void zzU(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
/* 13 */            zzM(new zzep(this, l, str, str2, bundle, z, z2));
                }

                public static zzfb zza(Context context, Bundle bundle) {
/* 1 */             kb1.m6061n(context);
/* 6 */             if (zzc == null) {
                        synchronized (zzfb.class) {
                            try {
/* 13 */                        if (zzc == null) {
/* 20 */                            zzc = new zzfb(context, bundle);
                                }
                            } catch (Throwable th) {
/* 28 */                        throw th;
                            }
                        }
                    }
/* 29 */            return zzc;
                }

                public final String zzA() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzdz(this, zzcoVar));
/* 16 */            return zzcoVar.zzc(500L);
                }

                public final String zzB() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzea(this, zzcoVar));
/* 16 */            return zzcoVar.zzc(500L);
                }

                public final Map zzC(String str, String str2, boolean z) {
/* 3 */             zzco zzcoVar = new zzco();
/* 15 */            zzM(new zzeb(this, str, str2, z, zzcoVar));
/* 20 */            Bundle bundleZze = zzcoVar.zze(5000L);
/* 24 */            if (bundleZze == null || bundleZze.size() == 0) {
/* 83 */                return Collections.EMPTY_MAP;
                    }
/* 39 */            HashMap map = new HashMap(bundleZze.size());
/* 54 */            for (String str3 : bundleZze.keySet()) {
/* 62 */                Object obj = bundleZze.get(str3);
/* 68 */                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
/* 78 */                    map.put(str3, obj);
                        }
                    }
/* 82 */            return map;
                }

                public final void zzD(int i, String str, Object obj, Object obj2, Object obj3) {
/* 13 */            zzM(new zzec(this, false, 5, str, obj, null, null));
                }

                public final Bundle zzE(Bundle bundle, boolean z) {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzee(this, bundle, zzcoVar));
/* 14 */            if (z) {
/* 18 */                return zzcoVar.zze(5000L);
                    }
/* 23 */            return null;
                }

                public final int zzF(String str) {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzef(this, str, zzcoVar));
/* 26 */            Integer num = (Integer) zzco.zzf(zzcoVar.zze(10000L), Integer.class);
/* 28 */            if (num == null) {
/* 30 */                return 25;
                    }
/* 33 */            return num.intValue();
                }

                public final String zzG() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzeg(this, zzcoVar));
/* 17 */            return zzcoVar.zzc(120000L);
                }

                public final Long zzH() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzeh(this, zzcoVar));
/* 17 */            return zzcoVar.zzd(120000L);
                }

                public final String zzI() {
/* 1 */             return this.zzi;
                }

                public final Object zzJ(int i) {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzei(this, zzcoVar, i));
/* 22 */            return zzco.zzf(zzcoVar.zze(15000L), Object.class);
                }

                public final void zzK(boolean z) {
/* 6 */             zzM(new zzej(this, z));
                }

                public final void zzL(Bundle bundle) {
/* 6 */             zzM(new zzek(this, bundle));
                }

                public final /* synthetic */ String zzO() {
/* 1 */             return this.zzd;
                }

                public final /* synthetic */ boolean zzP() {
/* 1 */             return this.zzh;
                }

                public final /* synthetic */ zzcr zzQ() {
/* 1 */             return this.zzj;
                }

                public final /* synthetic */ void zzR(zzcr zzcrVar) {
/* 1 */             this.zzj = zzcrVar;
                }

                public final C0986hc zzb() {
/* 1 */             return this.zze;
                }

                public final zzcr zzc(Context context, boolean z) {
                    try {
/* 22 */                return zzcq.asInterface(wb0.m9513c(context, z ? wb0.f18549c : wb0.f18548b, ModuleDescriptor.MODULE_ID).m9519b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (sb0 e) {
/* 29 */                zzN(e, true, false);
/* 32 */                return null;
                    }
                }

                public final void zzd(qk3 qk3Var) {
/* 3 */             zzer zzerVar = new zzer(qk3Var);
/* 8 */             if (this.zzj != null) {
                        try {
/* 12 */                    this.zzj.setEventInterceptor(zzerVar);
/* 15 */                    return;
                        } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
/* 20 */                    AbstractC1245n0.m4889q(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
                        }
                    }
/* 28 */            zzM(new zzel(this, zzerVar));
                }

                public final void zze(Intent intent) {
/* 6 */             zzM(new zzem(this, intent));
                }

                public final void zzf(rk3 rk3Var) {
/* 1 */             kb1.m6061n(rk3Var);
/* 4 */             List list = this.zzf;
                    synchronized (list) {
/* 12 */                for (int i = 0; i < list.size(); i++) {
                            try {
/* 26 */                        if (rk3Var.equals(((Pair) list.get(i)).first)) {
/* 32 */                            AbstractC1245n0.m4889q(this.zzd, "OnEventListener already registered.");
/* 36 */                            return;
                                }
                            } catch (Throwable th) {
/* 83 */                        throw th;
                            }
                        }
/* 44 */                zzes zzesVar = new zzes(rk3Var);
/* 52 */                list.add(new Pair(rk3Var, zzesVar));
/* 58 */                if (this.zzj != null) {
                            try {
/* 62 */                        this.zzj.registerOnMeasurementEventListener(zzesVar);
/* 65 */                        return;
                            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
/* 70 */                        AbstractC1245n0.m4889q(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                            }
                        }
/* 78 */                zzM(new zzen(this, zzesVar));
                    }
                }

                public final void zzg(rk3 rk3Var) {
                    Pair pair;
/* 1 */             kb1.m6061n(rk3Var);
/* 4 */             List list = this.zzf;
                    synchronized (list) {
/* 7 */                 int i = 0;
                        while (true) {
                            try {
/* 12 */                        if (i >= list.size()) {
/* 40 */                            pair = null;
                                    break;
                                } else {
/* 26 */                            if (rk3Var.equals(((Pair) list.get(i)).first)) {
/* 32 */                                pair = (Pair) list.get(i);
                                        break;
                                    }
/* 37 */                            i++;
                                }
                            } catch (Throwable th) {
/* 87 */                        throw th;
                            }
                        }
/* 41 */                if (pair == null) {
/* 47 */                    AbstractC1245n0.m4889q(this.zzd, "OnEventListener had not been registered.");
/* 51 */                    return;
                        }
/* 52 */                list.remove(pair);
/* 57 */                zzes zzesVar = (zzes) pair.second;
/* 62 */                if (this.zzj != null) {
                            try {
/* 66 */                        this.zzj.unregisterOnMeasurementEventListener(zzesVar);
/* 69 */                        return;
                            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
/* 74 */                        AbstractC1245n0.m4889q(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                            }
                        }
/* 82 */                zzM(new zzeo(this, zzesVar));
                    }
                }

                public final void zzh(String str, Bundle bundle) {
/* 8 */             zzU(null, str, bundle, false, true, null);
                }

                public final void zzi(String str, String str2, Bundle bundle) {
/* 8 */             zzU(str, str2, bundle, true, true, null);
                }

                public final void zzj(String str, String str2, Bundle bundle, long j) {
/* 11 */            zzU(str, str2, bundle, true, false, Long.valueOf(j));
                }

                public final void zzk(String str, String str2, Object obj, boolean z) {
/* 11 */            zzM(new zzdh(this, str, str2, obj, z));
                }

                public final void zzl(Bundle bundle) {
/* 6 */             zzM(new zzdi(this, bundle));
                }

                public final void zzm(String str, String str2, Bundle bundle) {
/* 6 */             zzM(new zzdj(this, str, str2, bundle));
                }

                public final List zzn(String str, String str2) {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzdk(this, str, str2, zzcoVar));
/* 26 */            List list = (List) zzco.zzf(zzcoVar.zze(5000L), List.class);
                    return list == null ? Collections.EMPTY_LIST : list;
                }

                public final void zzo(String str) {
/* 6 */             zzM(new zzdl(this, str));
                }

                public final void zzp(zzdf zzdfVar, String str, String str2) {
/* 6 */             zzM(new zzdm(this, zzdfVar, str, str2));
                }

                public final void zzq(Boolean bool) {
/* 6 */             zzM(new zzdn(this, bool));
                }

                public final void zzr(Bundle bundle) {
/* 6 */             zzM(new zzdo(this, bundle));
                }

                public final void zzs() {
/* 6 */             zzM(new zzdp(this));
                }

                public final void zzt(long j) {
/* 6 */             zzM(new zzdq(this, j));
                }

                public final void zzu(String str) {
/* 6 */             zzM(new zzds(this, str));
                }

                public final void zzv(String str) {
/* 6 */             zzM(new zzdt(this, str));
                }

                public final void zzw(Runnable runnable) {
/* 6 */             zzM(new zzdv(this, runnable));
                }

                public final String zzx() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzdw(this, zzcoVar));
/* 16 */            return zzcoVar.zzc(500L);
                }

                public final String zzy() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzdx(this, zzcoVar));
/* 16 */            return zzcoVar.zzc(50L);
                }

                public final long zzz() {
/* 3 */             zzco zzcoVar = new zzco();
/* 11 */            zzM(new zzdy(this, zzcoVar));
/* 16 */            Long lZzd = zzcoVar.zzd(500L);
/* 20 */            if (lZzd != null) {
/* 56 */                return lZzd.longValue();
                    }
/* 22 */            InterfaceC2475xv interfaceC2475xv = this.zza;
/* 26 */            long jNanoTime = System.nanoTime();
/* 32 */            ((xt0) interfaceC2475xv).getClass();
/* 43 */            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
/* 49 */            int i = this.zzg + 1;
/* 51 */            this.zzg = i;
/* 54 */            return jNextLong + ((long) i);
                }
            }
