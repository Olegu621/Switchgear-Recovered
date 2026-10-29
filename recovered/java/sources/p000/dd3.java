            package p000;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.PlayerRef;
            import com.google.android.gms.games.internal.zza;
            import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
            import com.google.android.gms.games.snapshot.SnapshotEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
            import com.google.android.gms.games.stats.PlayerStatsEntity;
            import com.google.android.gms.games.stats.zzb;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.flutter.plugin.editing.FlutterTextUtils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dd3 extends zza {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7134a;

                /* JADX INFO: renamed from: b */
                public final Object f7135b;

                public /* synthetic */ dd3(Object obj, int i) {
/* 1 */             this.f7134a = i;
/* 6 */             this.f7135b = obj;
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: C */
                public void mo2114C(DataHolder dataHolder) {
                    boolean z;
                    Object objFreeze;
/* 1 */             int i = this.f7134a;
/* 6 */             Object obj = this.f7135b;
                    switch (i) {
                        case 0:
/* 94 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
/* 96 */                    int i2 = dataHolder.f3467e;
/* 98 */                    z = i2 == 3;
/* 102 */                   if (i2 == 0 || z) {
/* 123 */                       taskCompletionSource.setResult(new C0828d1(new x51(dataHolder)));
/* 126 */                       return;
                            } else {
/* 106 */                       jb1.m5742H(i2, taskCompletionSource);
/* 109 */                       dataHolder.close();
/* 126 */                       return;
                            }
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 14 */                    TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
/* 16 */                    int i3 = dataHolder.f3467e;
/* 18 */                    z = i3 == 3;
/* 22 */                    if (i3 != 0 && !z) {
/* 27 */                        jb1.m5742H(i3, taskCompletionSource2);
/* 30 */                        dataHolder.close();
/* 70 */                        return;
                            }
/* 36 */                    x51 x51Var = new x51(dataHolder);
                            try {
/* 43 */                        if (x51Var.getCount() > 0) {
/* 51 */                            objFreeze = ((w51) x51Var.get(0)).freeze();
                                    break;
                                } else {
/* 58 */                            objFreeze = null;
                                }
/* 59 */                        x51Var.release();
/* 67 */                        taskCompletionSource2.setResult(new C0828d1(objFreeze));
/* 70 */                        return;
                            } catch (Throwable th) {
                                try {
/* 71 */                            x51Var.release();
                                    break;
                                } catch (Throwable th2) {
                                    try {
/* 90 */                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
/* 93 */                        throw th;
                            }
                        default:
/* 11 */                    return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: L */
                public void mo2115L(Status status, String str) {
                    switch (this.f7134a) {
                        case 12:
/* 7 */                     boolean zM2006D1 = status.m2006D1();
/* 13 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 15 */                    if (!zM2006D1) {
/* 21 */                        taskCompletionSource.setException(i13.m4438q(status));
                            } else {
/* 25 */                        taskCompletionSource.setResult(str);
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: R */
                public void mo2116R(DataHolder dataHolder) {
                    switch (this.f7134a) {
                        case 11:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    int i = dataHolder.f3467e;
/* 14 */                    int i2 = 1;
/* 19 */                    boolean z = i == 3;
/* 20 */                    if (i == 0 || z) {
/* 41 */                        taskCompletionSource.setResult(new C0828d1(new C2128r1(dataHolder, i2)));
                            } else {
/* 24 */                        jb1.m5742H(i, taskCompletionSource);
/* 27 */                        dataHolder.close();
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: S */
                public void mo2117S(DataHolder dataHolder) {
                    SnapshotMetadataEntity snapshotMetadataEntity;
                    switch (this.f7134a) {
                        case 9:
/* 11 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 13 */                    int i = dataHolder.f3467e;
/* 15 */                    if (i != 0) {
/* 17 */                        jb1.m5742H(i, taskCompletionSource);
/* 20 */                        dataHolder.close();
/* 49 */                        return;
                            }
                            try {
/* 26 */                        if (dataHolder.f3470v > 0) {
/* 36 */                            snapshotMetadataEntity = new SnapshotMetadataEntity(new SnapshotMetadataRef(dataHolder, 0));
                                    break;
                                } else {
/* 42 */                            snapshotMetadataEntity = null;
                                }
/* 43 */                        dataHolder.close();
/* 46 */                        taskCompletionSource.setResult(snapshotMetadataEntity);
/* 49 */                        return;
                            } catch (Throwable th) {
                                try {
/* 50 */                            dataHolder.close();
                                    break;
                                } catch (Throwable th2) {
                                    try {
/* 69 */                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
/* 72 */                        throw th;
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: a0 */
                public void mo2118a0(DataHolder dataHolder) {
                    switch (this.f7134a) {
                        case 4:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    int i = dataHolder.f3467e;
/* 13 */                    if (i != 0 && i != 5) {
/* 19 */                        jb1.m5742H(i, taskCompletionSource);
/* 22 */                        dataHolder.close();
/* 37 */                        return;
                            } else {
                                try {
/* 31 */                            taskCompletionSource.setResult(new bx0(dataHolder));
/* 37 */                            return;
                                } finally {
/* 39 */                            dataHolder.close();
                                }
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: l */
                public void mo1340l(DataHolder dataHolder) {
                    PlayerEntity playerEntity;
                    switch (this.f7134a) {
                        case 3:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    int i = dataHolder.f3467e;
/* 13 */                    if (i != 0 && i != 3) {
/* 19 */                        jb1.m5742H(i, taskCompletionSource);
/* 22 */                        dataHolder.close();
/* 56 */                        return;
                            }
                            try {
/* 28 */                        if (dataHolder.f3470v > 0) {
/* 38 */                            playerEntity = new PlayerEntity(new PlayerRef(dataHolder, 0));
                                    break;
                                } else {
/* 44 */                            playerEntity = null;
                                }
/* 45 */                        dataHolder.close();
/* 53 */                        taskCompletionSource.setResult(new C0828d1(playerEntity));
/* 56 */                        return;
                            } catch (Throwable th) {
/* 57 */                        dataHolder.close();
/* 60 */                        throw th;
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: m */
                public void mo2119m(int i, String str) {
                    switch (this.f7134a) {
                        case 10:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    if (i != 0) {
/* 17 */                        jb1.m5742H(i, taskCompletionSource);
                            } else {
/* 13 */                        taskCompletionSource.setResult(str);
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: p0 */
                public void mo2120p0(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
                    int i;
                    switch (this.f7134a) {
                        case 5:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 12 */                    if (dataHolder == null) {
/* 14 */                        i = 0;
                            } else {
                                try {
/* 16 */                            i = dataHolder.f3470v;
                                } catch (Throwable th) {
/* 91 */                            if (dataHolder != null) {
                                        try {
/* 93 */                                    dataHolder.close();
                                            break;
                                        } catch (Throwable th2) {
                                            try {
/* 114 */                                       Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
/* 117 */                           throw th;
                                }
                            }
/* 19 */                    if (i >= 2 && str != null && contents3 != null) {
/* 43 */                        new SnapshotEntity(new SnapshotMetadataEntity(new SnapshotMetadataRef(dataHolder, 0)), new SnapshotContentsEntity(contents));
/* 64 */                        new SnapshotEntity(new SnapshotMetadataEntity(new SnapshotMetadataRef(dataHolder, 1)), new SnapshotContentsEntity(contents2));
/* 67 */                        dataHolder.close();
/* 75 */                        taskCompletionSource.setResult(new q62(2));
/* 90 */                        return;
                            }
/* 82 */                    taskCompletionSource.setResult(null);
/* 85 */                    if (dataHolder != null) {
/* 87 */                        dataHolder.close();
/* 90 */                        return;
                            }
/* 90 */                    return;
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: r0 */
                public void mo2121r0(DataHolder dataHolder) {
                    switch (this.f7134a) {
                        case 8:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    int i = dataHolder.f3467e;
/* 13 */                    if (i == 0 || i == 3) {
/* 37 */                        taskCompletionSource.setResult(new C0828d1(new C2128r1(dataHolder, 0)));
                            } else {
/* 19 */                        jb1.m5742H(i, taskCompletionSource);
/* 22 */                        dataHolder.close();
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: s */
                public void mo2122s(DataHolder dataHolder) {
                    PlayerStatsEntity playerStatsEntity;
                    switch (this.f7134a) {
                        case 2:
/* 11 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 13 */                    int i = dataHolder.f3467e;
/* 15 */                    if (i != 0 && i != 3) {
/* 21 */                        jb1.m5742H(i, taskCompletionSource);
/* 24 */                        dataHolder.close();
/* 58 */                        return;
                            }
                            try {
/* 30 */                        if (dataHolder.f3470v > 0) {
/* 40 */                            playerStatsEntity = new PlayerStatsEntity(new zzb(dataHolder, 0));
                                    break;
                                } else {
/* 46 */                            playerStatsEntity = null;
                                }
/* 47 */                        dataHolder.close();
/* 55 */                        taskCompletionSource.setResult(new C0828d1(playerStatsEntity));
/* 58 */                        return;
                            } catch (Throwable th) {
                                try {
/* 59 */                            dataHolder.close();
                                    break;
                                } catch (Throwable th2) {
                                    try {
/* 78 */                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
/* 81 */                        throw th;
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: u */
                public void mo2123u(DataHolder dataHolder) {
                    switch (this.f7134a) {
                        case 1:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    int i = dataHolder.f3467e;
/* 13 */                    int i2 = 3;
/* 18 */                    boolean z = i == 3;
/* 19 */                    if (i == 0 || z) {
/* 40 */                        taskCompletionSource.setResult(new C0828d1(new C2128r1(dataHolder, i2)));
                            } else {
/* 23 */                        jb1.m5742H(i, taskCompletionSource);
/* 26 */                        dataHolder.close();
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: v */
                public void mo2124v(int i) {
/* 1 */             int i2 = this.f7134a;
/* 5 */             Object obj = this.f7135b;
                    switch (i2) {
                        case 6:
/* 26 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
/* 28 */                    if (i == 0 || i == 3003) {
/* 46 */                        taskCompletionSource.setResult(Boolean.valueOf(i == 3003));
                            } else {
/* 33 */                        jb1.m5742H(i, taskCompletionSource);
                            }
                            break;
                        case 7:
/* 11 */                    TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
/* 13 */                    if (i == 0 || i == 3003) {
/* 22 */                        taskCompletionSource2.setResult(null);
                            } else {
/* 17 */                        jb1.m5742H(i, taskCompletionSource2);
                            }
                            break;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                /* JADX INFO: renamed from: y */
                public void mo2125y(DataHolder dataHolder, Contents contents) {
                    SnapshotEntity snapshotEntity;
                    switch (this.f7134a) {
                        case 5:
/* 9 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7135b;
/* 11 */                    int i = dataHolder.f3467e;
                            try {
/* 16 */                        if (dataHolder.f3470v > 0) {
/* 36 */                            snapshotEntity = new SnapshotEntity(new SnapshotMetadataEntity(new SnapshotMetadataRef(dataHolder, 0)), new SnapshotContentsEntity(contents));
                                    break;
                                } else {
/* 42 */                            snapshotEntity = null;
                                }
/* 43 */                        dataHolder.close();
/* 46 */                        if (i == 0) {
/* 54 */                            taskCompletionSource.setResult(new q62(2));
/* 91 */                            return;
                                }
/* 60 */                        if (i == 4002) {
/* 62 */                            if (snapshotEntity != null && snapshotEntity.f4042a != null) {
/* 84 */                                taskCompletionSource.setException(new my0(new Status(4002, py0.m7614x0(4002), null, null)));
/* 91 */                                return;
                                    }
/* 68 */                            i = 4002;
                                }
/* 88 */                        jb1.m5742H(i, taskCompletionSource);
/* 91 */                        return;
                            } catch (Throwable th) {
                                try {
/* 92 */                            dataHolder.close();
                                    break;
                                } catch (Throwable th2) {
                                    try {
/* 113 */                               Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
/* 116 */                       throw th;
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
                public void zzm() {
                    switch (this.f7134a) {
                        case 14:
/* 22 */                    ((qf3) this.f7135b).setResult(new Status(0, py0.m7614x0(0), null, null));
                            break;
                    }
                }
            }
