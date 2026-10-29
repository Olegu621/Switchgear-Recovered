            package com.google.android.gms.internal.playcore_age_signals;

            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.pf3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzo {
                private static final Map zza = new HashMap();
                private final Context zzb;
                private final zzd zzc;
                private boolean zzh;
                private final Intent zzi;
                private ServiceConnection zzm;
                private IInterface zzn;
                private final List zze = new ArrayList();
                private final Set zzf = new HashSet();
                private final Object zzg = new Object();
                private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.playcore_age_signals.zzf
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
/* 3 */                 zzo.zzj(this.zza);
                    }
                };
                private final AtomicInteger zzl = new AtomicInteger(0);
                private final String zzd = "AgeSignalsService";
                private final WeakReference zzj = new WeakReference(null);

                public zzo(Context context, zzd zzdVar, String str, Intent intent, pf3 pf3Var, zzj zzjVar) {
/* 40 */            this.zzb = context;
/* 42 */            this.zzc = zzdVar;
/* 48 */            this.zzi = intent;
                }

                public static /* synthetic */ void zzj(zzo zzoVar) {
/* 1 */             zzd zzdVar = zzoVar.zzc;
/* 8 */             zzdVar.zzc("reportBinderDeath", new Object[0]);
/* 17 */            zzj zzjVar = (zzj) zzoVar.zzj.get();
/* 19 */            if (zzjVar != null) {
/* 25 */                zzdVar.zzc("calling onBinderDied", new Object[0]);
/* 28 */                zzjVar.zza();
                    } else {
/* 40 */                zzdVar.zzc("%s : Binder has died.", zzoVar.zzd);
/* 43 */                List list = zzoVar.zze;
/* 45 */                Iterator it = list.iterator();
/* 53 */                while (it.hasNext()) {
/* 65 */                    ((zze) it.next()).zza(zzoVar.zzv());
                        }
/* 69 */                list.clear();
                    }
                    synchronized (zzoVar.zzg) {
/* 75 */                zzoVar.zzw();
                    }
                }

                public static /* synthetic */ void zzk(zzo zzoVar, TaskCompletionSource taskCompletionSource, Task task) {
                    synchronized (zzoVar.zzg) {
/* 6 */                 zzoVar.zzf.remove(taskCompletionSource);
                    }
                }

                public static /* bridge */ /* synthetic */ void zzo(final zzo zzoVar, final TaskCompletionSource taskCompletionSource) {
/* 3 */             zzoVar.zzf.add(taskCompletionSource);
/* 15 */            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.playcore_age_signals.zzg
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
/* 5 */                     zzo.zzk(this.zza, taskCompletionSource, task);
                        }
                    });
                }

                public static /* bridge */ /* synthetic */ void zzq(zzo zzoVar, zze zzeVar) {
/* 4 */             if (zzoVar.zzn != null || zzoVar.zzh) {
/* 85 */                if (!zzoVar.zzh) {
/* 102 */                   zzeVar.run();
/* 105 */                   return;
                        } else {
/* 93 */                    zzoVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
/* 98 */                    zzoVar.zze.add(zzeVar);
/* 101 */                   return;
                        }
                    }
/* 10 */            zzd zzdVar = zzoVar.zzc;
/* 16 */            zzdVar.zzc("Initiate binding to the service.", new Object[0]);
/* 19 */            List list = zzoVar.zze;
/* 21 */            list.add(zzeVar);
/* 27 */            zzm zzmVar = new zzm(zzoVar, null);
/* 30 */            zzoVar.zzm = zzmVar;
/* 33 */            zzoVar.zzh = true;
/* 43 */            if (zzoVar.zzb.bindService(zzoVar.zzi, zzmVar, 1)) {
/* 82 */                return;
                    }
/* 49 */            zzdVar.zzc("Failed to bind to the service.", new Object[0]);
/* 52 */            zzoVar.zzh = false;
/* 54 */            Iterator it = list.iterator();
/* 62 */            while (it.hasNext()) {
/* 75 */                ((zze) it.next()).zza(new zzp());
                    }
/* 79 */            list.clear();
                }

                public static /* bridge */ /* synthetic */ void zzr(zzo zzoVar) {
/* 8 */             zzoVar.zzc.zzc("linkToDeath", new Object[0]);
                    try {
/* 19 */                zzoVar.zzn.asBinder().linkToDeath(zzoVar.zzk, 0);
                    } catch (RemoteException e) {
/* 30 */                zzoVar.zzc.zzb(e, "linkToDeath failed", new Object[0]);
                    }
                }

                public static /* bridge */ /* synthetic */ void zzs(zzo zzoVar) {
/* 8 */             zzoVar.zzc.zzc("unlinkToDeath", new Object[0]);
/* 19 */            zzoVar.zzn.asBinder().unlinkToDeath(zzoVar.zzk, 0);
                }

                private final RemoteException zzv() {
/* 15 */            return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzw() {
/* 1 */             Set set = this.zzf;
/* 3 */             Iterator it = set.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                ((TaskCompletionSource) it.next()).trySetException(zzv());
                    }
/* 27 */            set.clear();
                }

                public final Handler zzc() {
                    Handler handler;
/* 1 */             Map map = zza;
                    synchronized (map) {
                        try {
/* 4 */                     String str = this.zzd;
/* 10 */                    if (!map.containsKey(str)) {
/* 16 */                        HandlerThread handlerThread = new HandlerThread(str, 10);
/* 19 */                        handlerThread.start();
/* 31 */                        map.put(str, new Handler(handlerThread.getLooper()));
                            }
/* 41 */                    handler = (Handler) map.get(str);
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return handler;
                }

                public final IInterface zze() {
/* 1 */             return this.zzn;
                }

                public final void zzt(zze zzeVar, TaskCompletionSource taskCompletionSource) {
/* 14 */            zzc().post(new zzh(this, zzeVar.zzc(), taskCompletionSource, zzeVar));
                }

                public final void zzu(TaskCompletionSource taskCompletionSource) {
                    synchronized (this.zzg) {
/* 6 */                 this.zzf.remove(taskCompletionSource);
                    }
/* 19 */            zzc().post(new zzi(this));
                }
            }
