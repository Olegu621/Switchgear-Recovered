            package com.google.android.gms.internal.fido;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.ParcelFileDescriptor;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult;
            import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.C1020i9;
            import p000.InterfaceC0172b9;
            import p000.c32;
            import p000.i13;
            import p000.nr0;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class zzy extends or0 {
                private static final C0872e9 zza;
                private static final C0983h9 zzb;

                static {
/* 3 */             C0872e9 c0872e9 = new C0872e9();
/* 6 */             zza = c0872e9;
/* 20 */            zzb = new C0983h9("Fido.FIDO_SOURCE_DIRECT_TRANSFER_API", new zzz(), c0872e9);
                }

                public zzy(Activity activity) {
/* 10 */            super(activity, activity, zzb, InterfaceC0172b9.f2328g, nr0.f14414c);
                }

                public final SourceDirectTransferResult getSourceDirectTransferResultFromIntent(Intent intent) throws C1020i9 {
/* 1 */             Status status = Status.f3442i;
/* 3 */             if (intent == null) {
/* 29 */                throw new C1020i9(status);
                    }
/* 13 */            SourceDirectTransferResult sourceDirectTransferResult = (SourceDirectTransferResult) i13.m4435m(intent, "source_direct_transfer_result", SourceDirectTransferResult.CREATOR);
/* 15 */            if (sourceDirectTransferResult != null) {
/* 17 */                return sourceDirectTransferResult;
                    }
/* 23 */            throw new C1020i9(status);
                }

                public final Task<PendingIntent> startDirectTransfer(final SourceStartDirectTransferOptions sourceStartDirectTransferOptions, final ParcelFileDescriptor parcelFileDescriptor, final ParcelFileDescriptor parcelFileDescriptor2) {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 10 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.fido.zzw
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzy zzyVar = this.zza;
/* 3 */                     SourceStartDirectTransferOptions sourceStartDirectTransferOptions2 = sourceStartDirectTransferOptions;
/* 5 */                     ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor;
/* 7 */                     ParcelFileDescriptor parcelFileDescriptor4 = parcelFileDescriptor2;
/* 24 */                    ((zzt) ((zzaa) obj).getService()).zzc(new zzx(zzyVar, (TaskCompletionSource) obj2), sourceStartDirectTransferOptions2, parcelFileDescriptor3, parcelFileDescriptor4);
                        }
                    };
/* 14 */            tm2VarBuilder.f17188d = 5421;
/* 20 */            return doRead(tm2VarBuilder.m8812a());
                }

/* 13 */        public zzy(Context context) {
/* 15 */            super(context, null, zzb, InterfaceC0172b9.f2328g, nr0.f14414c);
                }
            }
