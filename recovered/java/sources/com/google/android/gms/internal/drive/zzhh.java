            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1020i9;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzhh<T> extends zzl {
                private TaskCompletionSource<T> zziv;

                public zzhh(TaskCompletionSource<T> taskCompletionSource) {
/* 4 */             this.zziv = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(Status status) throws RemoteException {
/* 8 */             this.zziv.setException(new C1020i9(status));
                }

                public final TaskCompletionSource<T> zzay() {
/* 1 */             return this.zziv;
                }
            }
