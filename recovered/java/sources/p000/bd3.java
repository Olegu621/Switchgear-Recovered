            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.games.internal.zza;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bd3 extends zza {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2378a;

                /* JADX INFO: renamed from: b */
                public final TaskCompletionSource f2379b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ nd3 f2380c;

                public /* synthetic */ bd3(nd3 nd3Var, TaskCompletionSource taskCompletionSource, int i) {
/* 1 */             this.f2378a = i;
/* 3 */             this.f2380c = nd3Var;
/* 8 */             this.f2379b = taskCompletionSource;
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: H */
                public void mo1337H(DataHolder dataHolder, DataHolder dataHolder2) {
                    switch (this.f2378a) {
                        case 0:
/* 9 */                     int i = dataHolder2.f3467e;
/* 17 */                    boolean z = i == 3;
/* 20 */                    TaskCompletionSource taskCompletionSource = this.f2379b;
/* 22 */                    if (i == 10003) {
/* 26 */                        nd3.m6969d(this.f2380c, taskCompletionSource);
/* 29 */                        dataHolder.close();
/* 32 */                        dataHolder2.close();
/* 95 */                        return;
                            }
/* 36 */                    if (i != 0 && !z) {
/* 41 */                        jb1.m5742H(i, taskCompletionSource);
/* 44 */                        dataHolder.close();
/* 47 */                        dataHolder2.close();
/* 95 */                        return;
                            }
/* 53 */                    x51 x51Var = new x51(dataHolder);
                            try {
/* 60 */                        if (x51Var.getCount() > 0) {
/* 68 */                            ((w51) x51Var.get(0)).freeze();
                                    break;
                                }
/* 74 */                        x51Var.release();
/* 92 */                        taskCompletionSource.setResult(new C0828d1(new g61(new b61(dataHolder2))));
/* 95 */                        return;
                            } catch (Throwable th) {
                                try {
/* 96 */                            x51Var.release();
                                    break;
                                } catch (Throwable th2) {
                                    try {
/* 115 */                               Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
/* 118 */                       throw th;
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: X */
                public void mo1338X(DataHolder dataHolder) {
                    switch (this.f2378a) {
                        case 1:
/* 7 */                     mo1340l(dataHolder);
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: g */
                public void mo1339g(DataHolder dataHolder) {
                    c61 c61Var;
                    switch (this.f2378a) {
                        case 2:
/* 9 */                     int i = dataHolder.f3467e;
/* 17 */                    boolean z = i == 3;
/* 20 */                    TaskCompletionSource taskCompletionSource = this.f2379b;
/* 22 */                    if (i == 10003) {
/* 26 */                        nd3.m6969d(this.f2380c, taskCompletionSource);
/* 29 */                        dataHolder.close();
/* 83 */                        return;
                            }
/* 33 */                    if (i != 0 && !z) {
/* 38 */                        jb1.m5742H(i, taskCompletionSource);
/* 41 */                        dataHolder.close();
/* 83 */                        return;
                            }
/* 47 */                    if (dataHolder.f3468f == null) {
/* 51 */                        new Bundle();
                            }
                            try {
/* 56 */                        if (dataHolder.f3470v > 0) {
/* 65 */                            c61Var = new c61(new d61(dataHolder, 0));
                                    break;
                                } else {
/* 71 */                            c61Var = null;
                                }
/* 72 */                        dataHolder.close();
/* 80 */                        taskCompletionSource.setResult(new C0828d1(c61Var));
/* 83 */                        return;
                            } catch (Throwable th) {
                                try {
/* 84 */                            dataHolder.close();
                                    break;
                                } catch (Throwable th2) {
                                    try {
/* 103 */                               Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
/* 106 */                       throw th;
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: l */
                public void mo1340l(DataHolder dataHolder) {
                    switch (this.f2378a) {
                        case 1:
/* 7 */                     int i = dataHolder.f3467e;
/* 11 */                    TaskCompletionSource taskCompletionSource = this.f2379b;
/* 13 */                    if (i != 10003) {
/* 29 */                        boolean z = i == 3;
/* 30 */                        if (i == 0 || z) {
/* 52 */                            taskCompletionSource.setResult(new C0828d1(new C2128r1(dataHolder, 2)));
                                } else {
/* 34 */                            jb1.m5742H(i, taskCompletionSource);
/* 37 */                            dataHolder.close();
                                }
                            } else {
/* 17 */                        nd3.m6969d(this.f2380c, taskCompletionSource);
/* 20 */                        dataHolder.close();
                            }
                            break;
                    }
                }
            }
