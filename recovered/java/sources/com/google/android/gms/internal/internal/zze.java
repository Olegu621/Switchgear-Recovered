            package com.google.android.gms.internal.internal;

            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.recaptchabase.ExecuteResult;
            import com.google.android.gms.recaptchabase.InitResult;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zze extends IInterface {
                void zzb(Status status, ExecuteResult executeResult) throws RemoteException;

                void zzc(Status status, InitResult initResult) throws RemoteException;
            }
