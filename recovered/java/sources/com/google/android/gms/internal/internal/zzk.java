            package com.google.android.gms.internal.internal;

            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.recaptchabase.ExecuteResult;
            import com.google.android.gms.recaptchabase.InitResult;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m6176d2 = {"com/google/android/gms/recaptchabase/internal/InternalRecaptchaBaseClient$init$1$callback$1", "Lcom/google/android/gms/recaptchabase/internal/IRecaptchaBaseCallbacks$Stub;", "onInitResponse", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/common/api/Status;", "result", "Lcom/google/android/gms/recaptchabase/InitResult;", "onExecuteResponse", "Lcom/google/android/gms/recaptchabase/ExecuteResult;", "java.com.google.android.gmscore.integ.client.recaptchabase_recaptchabase_kt"}, m6177k = 1, m6178mv = {2, 0, 0}, m6180xi = 48)
            public final class zzk extends zzd {
                final /* synthetic */ TaskCompletionSource zza;

                public zzk(TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.internal.zze
                public final void zzb(Status status, ExecuteResult executeResult) {
                }

                @Override // com.google.android.gms.internal.internal.zze
                public final void zzc(Status status, InitResult initResult) {
/* 1 */             status.getClass();
/* 6 */             jb1.m5738D(status, initResult, this.zza);
                }
            }
