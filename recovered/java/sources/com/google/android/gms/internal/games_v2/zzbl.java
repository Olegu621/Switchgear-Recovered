            package com.google.android.gms.internal.games_v2;

            import android.accounts.Account;
            import android.app.Activity;
            import android.app.Application;
            import android.app.PendingIntent;
            import android.os.Looper;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.games.internal.p006v2.resolution.C0329a;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.TaskExecutors;
            import com.google.android.gms.tasks.Tasks;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Queue;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.C0914fe;
            import p000.C1020i9;
            import p000.bh3;
            import p000.f42;
            import p000.kb1;
            import p000.ml3;
            import p000.nl3;
            import p000.or0;
            import p000.wl0;
            import p000.ze3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbl implements zzav {
                private final AtomicReference zza = new AtomicReference(zzbi.UNINITIALIZED);
                private final AtomicReference zzb = new AtomicReference(zzbh.AUTOMATIC);
                private final Queue zzc = new ArrayDeque();
                private final AtomicReference zzd = new AtomicReference();
                private final AtomicReference zze = new AtomicReference();
                private final Application zzf;
                private final bh3 zzg;
                private final zzbm zzh;
                private final C0329a zzi;

                public zzbl(Application application, bh3 bh3Var, C0329a c0329a, zzbm zzbmVar, byte[] bArr) {
/* 43 */            this.zzf = application;
/* 45 */            this.zzg = bh3Var;
/* 47 */            this.zzi = c0329a;
/* 49 */            this.zzh = zzbmVar;
                }

                private static C1020i9 zzj() {
/* 10 */            return new C1020i9(new Status(4, null, null, null));
                }

                private static Task zzk(AtomicReference atomicReference, TaskCompletionSource taskCompletionSource) {
/* 1 */             zzbi zzbiVar = zzbi.UNINITIALIZED;
/* 9 */             int iOrdinal = ((zzbi) atomicReference.get()).ordinal();
/* 13 */            if (iOrdinal == 0) {
/* 109 */               return Tasks.forException(new C1020i9(new Status(10, null, null, null)));
                    }
/* 16 */            C0914fe c0914fe = C0914fe.f8174b;
/* 18 */            if (iOrdinal == 2) {
/* 91 */                return Tasks.forResult(c0914fe);
                    }
/* 21 */            C0914fe c0914fe2 = C0914fe.f8175c;
/* 23 */            if (iOrdinal == 3) {
/* 86 */                return Tasks.forResult(c0914fe2);
                    }
/* 25 */            if (taskCompletionSource == null) {
/* 27 */                return Tasks.forResult(c0914fe2);
                    }
/* 32 */            Task task = taskCompletionSource.getTask();
/* 40 */            if (task.isSuccessful()) {
                        return ((Boolean) task.getResult()).booleanValue() ? Tasks.forResult(c0914fe) : Tasks.forResult(c0914fe2);
                    }
/* 66 */            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
/* 78 */            task.addOnCompleteListener(zzfe.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbb
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task2) {
/* 1 */                     TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
/* 7 */                     if (task2.isSuccessful() && ((Boolean) task2.getResult()).booleanValue()) {
/* 24 */                        taskCompletionSource3.trySetResult(C0914fe.f8174b);
                            } else {
/* 30 */                        taskCompletionSource3.trySetResult(C0914fe.f8175c);
                            }
                        }
                    });
/* 81 */            return taskCompletionSource2.getTask();
                }

                private static Task zzl(final zzff zzffVar) {
/* 5 */             if (zzp()) {
/* 11 */                return (Task) zzffVar.zza();
                    }
/* 16 */            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 26 */            TaskExecutors.MAIN_THREAD.execute(new Runnable() { // from class: com.google.android.gms.internal.games_v2.zzbe
                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     zzff zzffVar2 = zzffVar;
/* 3 */                     final TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
/* 16 */                    ((Task) zzffVar2.zza()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbc
                                @Override // com.google.android.gms.tasks.OnCompleteListener
                                public final void onComplete(Task task) {
/* 1 */                             TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
/* 7 */                             if (task.isSuccessful()) {
/* 13 */                                taskCompletionSource3.trySetResult(task.getResult());
/* 16 */                                return;
                                    }
/* 17 */                            Exception exception = task.getException();
/* 21 */                            zzfb.zza(exception);
/* 24 */                            taskCompletionSource3.trySetException(exception);
                                }
                            });
                        }
                    });
/* 29 */            return taskCompletionSource.getTask();
                }

                private final void zzm(final TaskCompletionSource taskCompletionSource, final zzy zzyVar) {
/* 13 */            zzez.zza("GamesApiManager", "Attempting authentication: ".concat(zzyVar.toString()));
/* 29 */            this.zzh.zza(zzyVar).addOnCompleteListener(TaskExecutors.MAIN_THREAD, new OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzba
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
/* 7 */                     this.zza.zzg(taskCompletionSource, zzyVar, task);
                        }
                    });
                }

                private final void zzn(final TaskCompletionSource taskCompletionSource, final int i, PendingIntent pendingIntent, boolean z, boolean z2) {
                    Activity activityM1361a;
/* 9 */             if (Looper.getMainLooper() != Looper.myLooper()) {
/* 119 */               f42.m3656l("Must be called on the main thread.");
/* 122 */               return;
                    }
/* 13 */            if (z && pendingIntent != null && (activityM1361a = this.zzg.m1361a()) != null) {
/* 37 */                C0329a.m2113a(activityM1361a, pendingIntent).addOnCompleteListener(TaskExecutors.MAIN_THREAD, new OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzaz
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
/* 7 */                         this.zza.zzh(taskCompletionSource, i, task);
                            }
                        });
/* 42 */                zzez.zza("GamesApiManager", "Resolution triggered");
/* 45 */                return;
                    }
/* 52 */            boolean zZza = zzay.zza(this.zzb, zzbh.AUTOMATIC_PENDING_EXPLICIT, zzbh.EXPLICIT);
/* 56 */            if (!z2 && zZza) {
/* 63 */                zzez.zza("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
/* 71 */                zzm(taskCompletionSource, zzy.zzb(0));
/* 74 */                return;
                    }
/* 77 */            taskCompletionSource.trySetResult(Boolean.FALSE);
/* 84 */            this.zza.set(zzbi.AUTHENTICATION_FAILED);
/* 89 */            Iterator it = this.zzc.iterator();
/* 97 */            while (it.hasNext()) {
/* 109 */               ((zzbk) it.next()).zzc(zzj());
/* 112 */               it.remove();
                    }
                }

                private final void zzo(int i) {
/* 5 */             StringBuilder sb = new StringBuilder(56);
/* 10 */            sb.append("startAuthenticationIfNecessary() signInType: ");
/* 13 */            sb.append(i);
/* 22 */            zzez.zza("GamesApiManager", sb.toString());
/* 33 */            if (Looper.getMainLooper() != Looper.myLooper()) {
/* 164 */               f42.m3656l("Must be called on the main thread.");
/* 167 */               return;
                    }
/* 35 */            AtomicReference atomicReference = this.zza;
/* 37 */            zzbi zzbiVar = zzbi.UNINITIALIZED;
/* 39 */            zzbi zzbiVar2 = zzbi.AUTHENTICATING;
/* 45 */            if (zzay.zza(atomicReference, zzbiVar, zzbiVar2) || zzay.zza(this.zza, zzbi.AUTHENTICATION_FAILED, zzbiVar2)) {
/* 118 */               TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzd.get();
/* 120 */               if (taskCompletionSource != null) {
/* 129 */                   taskCompletionSource.trySetException(new IllegalStateException("New authentication attempt in progress"));
                        }
/* 134 */               TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
/* 139 */               this.zzd.set(taskCompletionSource2);
/* 151 */               this.zzb.set(i == 0 ? zzbh.EXPLICIT : zzbh.AUTOMATIC);
/* 158 */               zzm(taskCompletionSource2, zzy.zzb(i));
/* 161 */               return;
                    }
/* 58 */            if (i == 0) {
/* 66 */                boolean zZza = zzay.zza(this.zzb, zzbh.AUTOMATIC, zzbh.AUTOMATIC_PENDING_EXPLICIT);
/* 74 */                StringBuilder sb2 = new StringBuilder(88);
/* 79 */                sb2.append("Explicit sign-in during existing authentication. Marking pending explicit sign-in: ");
/* 82 */                sb2.append(zZza);
/* 89 */                zzez.zza("GamesApiManager", sb2.toString());
                    }
/* 108 */           zzez.zza("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(String.valueOf(this.zza.get())));
                }

                private static boolean zzp() {
                    return Looper.myLooper() == Looper.getMainLooper();
                }

                @Override // com.google.android.gms.internal.games_v2.zzav
                public final Task zza() {
/* 6 */             return zzl(new zzff() { // from class: com.google.android.gms.internal.games_v2.zzbf
                        @Override // com.google.android.gms.internal.games_v2.zzff
                        public final Object zza() {
/* 3 */                     return this.zza.zze();
                        }
                    });
                }

                @Override // com.google.android.gms.internal.games_v2.zzav
                public final Task zzb() {
/* 6 */             return zzl(new zzff() { // from class: com.google.android.gms.internal.games_v2.zzbg
                        @Override // com.google.android.gms.internal.games_v2.zzff
                        public final Object zza() {
/* 3 */                     return this.zza.zzf();
                        }
                    });
                }

                @Override // com.google.android.gms.internal.games_v2.zzav
                public final Task zzc() {
/* 11 */            return zzk(this.zza, (TaskCompletionSource) this.zzd.get());
                }

                @Override // com.google.android.gms.internal.games_v2.zzav
                public final Task zzd(zzap zzapVar) {
/* 7 */             zzbi zzbiVar = (zzbi) this.zza.get();
/* 21 */            zzez.zzf("GamesApiManager", "Executing API call with authentication state: ".concat(String.valueOf(zzbiVar)));
/* 26 */            if (zzbiVar == zzbi.AUTHENTICATED) {
/* 36 */                return zzapVar.zza((or0) this.zze.get());
                    }
/* 43 */            if (zzbiVar == zzbi.AUTHENTICATION_FAILED) {
/* 49 */                return Tasks.forException(zzj());
                    }
/* 57 */            if (zzbiVar == zzbi.UNINITIALIZED) {
/* 71 */                return Tasks.forException(new C1020i9(new Status(10, null, null, null)));
                    }
/* 78 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 83 */            final zzbk zzbkVar = new zzbk(zzapVar, taskCompletionSource, null);
/* 88 */            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.games_v2.zzbd
                        @Override // java.lang.Runnable
                        public final void run() {
/* 5 */                     this.zza.zzi(zzbkVar);
                        }
                    };
/* 95 */            if (zzp()) {
/* 97 */                runnable.run();
                    } else {
/* 103 */               TaskExecutors.MAIN_THREAD.execute(runnable);
                    }
/* 106 */           return taskCompletionSource.getTask();
                }

                public final /* synthetic */ Task zze() {
/* 2 */             zzo(1);
/* 15 */            return zzk(this.zza, (TaskCompletionSource) this.zzd.get());
                }

                public final /* synthetic */ Task zzf() {
/* 2 */             zzo(0);
/* 15 */            return zzk(this.zza, (TaskCompletionSource) this.zzd.get());
                }

                public final void zzg(TaskCompletionSource taskCompletionSource, zzy zzyVar, Task task) {
/* 8 */             if (!task.isSuccessful()) {
/* 10 */                Exception exception = task.getException();
/* 14 */                zzfb.zza(exception);
/* 19 */                zzez.zzb("GamesApiManager", "Authentication task failed", exception);
/* 39 */                zzn(taskCompletionSource, zzyVar.zza(), null, false, !zzyVar.zzd());
/* 42 */                return;
                    }
/* 48 */            zzbq zzbqVar = (zzbq) task.getResult();
/* 54 */            if (!zzbqVar.zze()) {
/* 66 */                zzez.zza("GamesApiManager", "Failed to authenticate: ".concat(String.valueOf(zzbqVar)));
/* 89 */                zzn(taskCompletionSource, zzyVar.zza(), zzbqVar.zza(), true, !zzyVar.zzd());
/* 92 */                return;
                    }
/* 94 */            String strZzd = zzbqVar.zzd();
/* 98 */            if (strZzd == null) {
/* 102 */               zzez.zzg("GamesApiManager", "Unexpected state: game run token absent");
/* 121 */               zzn(taskCompletionSource, zzyVar.zza(), null, false, !zzyVar.zzd());
/* 124 */               return;
                    }
/* 129 */           zzez.zza("GamesApiManager", "Successfully authenticated");
/* 140 */           if (Looper.getMainLooper() != Looper.myLooper()) {
/* 279 */               f42.m3656l("Must be called on the main thread.");
/* 282 */               return;
                    }
/* 144 */           ml3 ml3Var = new ml3();
/* 150 */           ml3Var.f13851a = 2101523;
/* 158 */           Account account = new Account(AbstractC0322a.DEFAULT_ACCOUNT, "com.google");
/* 163 */           HashSet hashSet = new HashSet();
/* 166 */           String str = account.name;
/* 168 */           String str2 = account.name;
/* 172 */           kb1.m6058k(str2);
/* 199 */           ml3Var.f13853c = new GoogleSignInAccount(3, null, null, str, null, null, null, 0L, str2, new ArrayList(hashSet), null, null);
/* 201 */           ml3Var.f13854d = strZzd;
/* 205 */           wl0 wl0Var = new wl0();
/* 208 */           wl0Var.f18680b = true;
/* 210 */           wl0Var.f18681c = true;
/* 212 */           wl0Var.f18682d = true;
/* 219 */           ml3Var.f13855e = new nl3(wl0Var);
/* 229 */           zze zzeVar = new zze(this.zzf, ml3Var.m6675a());
/* 234 */           this.zze.set(zzeVar);
/* 241 */           this.zza.set(zzbi.AUTHENTICATED);
/* 248 */           taskCompletionSource.trySetResult(Boolean.TRUE);
/* 253 */           Iterator it = this.zzc.iterator();
/* 261 */           while (it.hasNext()) {
/* 269 */               ((zzbk) it.next()).zza(zzeVar);
/* 272 */               it.remove();
                    }
                }

                public final void zzh(TaskCompletionSource taskCompletionSource, int i, Task task) {
/* 7 */             if (!task.isSuccessful()) {
/* 9 */                 Exception exception = task.getException();
/* 13 */                zzfb.zza(exception);
/* 18 */                zzez.zzh("GamesApiManager", "Resolution failed", exception);
/* 27 */                zzn(taskCompletionSource, i, null, false, true);
/* 30 */                return;
                    }
/* 35 */            ze3 ze3Var = (ze3) task.getResult();
/* 39 */            if (ze3Var.f20127a) {
/* 43 */                zzez.zza("GamesApiManager", "Resolution successful");
/* 56 */                zzm(taskCompletionSource, zzy.zzc(i, zzaf.zza(ze3Var.f20128b)));
                    } else {
/* 62 */                zzez.zza("GamesApiManager", "Resolution attempt was canceled");
/* 71 */                zzn(taskCompletionSource, i, null, false, true);
                    }
                }

                public final void zzi(zzbk zzbkVar) {
/* 9 */             if (Looper.getMainLooper() != Looper.myLooper()) {
/* 55 */                f42.m3656l("Must be called on the main thread.");
/* 58 */                return;
                    }
/* 17 */            zzbi zzbiVar = (zzbi) this.zza.get();
/* 21 */            if (zzbiVar == zzbi.AUTHENTICATED) {
/* 31 */                zzbkVar.zza((or0) this.zze.get());
                    } else if (zzbiVar == zzbi.AUTHENTICATION_FAILED) {
/* 43 */                zzbkVar.zzc(zzj());
                    } else {
/* 49 */                this.zzc.add(zzbkVar);
                    }
                }
            }
