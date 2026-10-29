            package com.google.android.gms.internal.internal;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.recaptchabase.ExecuteRequest;
            import com.google.android.gms.recaptchabase.ExecuteResult;
            import com.google.android.gms.recaptchabase.InitRequest;
            import com.google.android.gms.recaptchabase.InitResult;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import kotlin.Metadata;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.InterfaceC0172b9;
            import p000.c32;
            import p000.nr0;
            import p000.or0;
            import p000.pg3;
            import p000.tm2;
            import p000.um2;
            import p000.z02;
            
            /* JADX INFO: renamed from: com.google.android.gms.internal.recaptchabase.zzl, reason: from Kotlin metadata */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B%\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m6176d2 = {"Lcom/google/android/gms/recaptchabase/internal/InternalRecaptchaBaseClient;", "Lor0;", "La9;", "Lz02;", "Landroid/content/Context;", "context", "Lw8;", "Lcom/google/android/gms/recaptchabase/internal/RecaptchaBaseClientImpl;", "clientBuilder", "<init>", "(Landroid/content/Context;Lw8;)V", "(Landroid/content/Context;)V", "Lcom/google/android/gms/recaptchabase/ExecuteRequest;", "executeRequest", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/recaptchabase/ExecuteResult;", "execute", "(Lcom/google/android/gms/recaptchabase/ExecuteRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/recaptchabase/InitRequest;", "initRequest", "Lcom/google/android/gms/recaptchabase/InitResult;", "init", "(Lcom/google/android/gms/recaptchabase/InitRequest;)Lcom/google/android/gms/tasks/Task;", "Companion", "java.com.google.android.gmscore.integ.client.recaptchabase_recaptchabase_kt"}, m6177k = 1, m6178mv = {2, 0, 0}, m6180xi = 48)
            public final class InternalRecaptchaBaseClient extends or0 implements z02 {
                public static final /* synthetic */ int zza = 0;
                private static final zzi zzb;
                private static final C0872e9 zzc;
                private static final C0983h9 zzd;

                static {
/* 3 */             zzi zziVar = new zzi();
/* 6 */             zzb = zziVar;
/* 10 */            C0872e9 c0872e9 = new C0872e9();
/* 13 */            zzc = c0872e9;
/* 22 */            zzd = new C0983h9("RecaptchaBase.API", zziVar, c0872e9);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public InternalRecaptchaBaseClient(Context context) {
/* 13 */            super(context, null, zzd, InterfaceC0172b9.f2328g, nr0.f14414c);
/* 1 */             context.getClass();
                }

                @Override // p000.z02
                public final Task<ExecuteResult> execute(final ExecuteRequest executeRequest) {
/* 1 */             executeRequest.getClass();
/* 4 */             tm2 tm2VarBuilder = um2.builder();
/* 14 */            tm2VarBuilder.f17187c = new Feature[]{pg3.f15117d};
/* 21 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.recaptchabase.zzg
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 5 */                     int i = InternalRecaptchaBaseClient.zza;
/* 7 */                     ExecuteRequest executeRequest2 = executeRequest;
/* 9 */                     executeRequest2.getClass();
/* 23 */                    ((zzf) ((RecaptchaBaseClientImpl) obj).getService()).zzc(new zzj((TaskCompletionSource) obj2), executeRequest2);
                        }
                    };
/* 26 */            tm2VarBuilder.f17188d = 34002;
/* 32 */            Task<ExecuteResult> taskDoRead = doRead(tm2VarBuilder.m8812a());
/* 36 */            taskDoRead.getClass();
/* 39 */            return taskDoRead;
                }

                @Override // p000.z02
                public final Task<InitResult> init(final InitRequest initRequest) {
/* 1 */             initRequest.getClass();
/* 4 */             tm2 tm2VarBuilder = um2.builder();
/* 14 */            tm2VarBuilder.f17187c = new Feature[]{pg3.f15118e};
/* 21 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.recaptchabase.zzh
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 5 */                     int i = InternalRecaptchaBaseClient.zza;
/* 7 */                     InitRequest initRequest2 = initRequest;
/* 9 */                     initRequest2.getClass();
/* 23 */                    ((zzf) ((RecaptchaBaseClientImpl) obj).getService()).zzd(new zzk((TaskCompletionSource) obj2), initRequest2);
                        }
                    };
/* 26 */            tm2VarBuilder.f17188d = 34001;
/* 32 */            Task<InitResult> taskDoRead = doRead(tm2VarBuilder.m8812a());
/* 36 */            taskDoRead.getClass();
/* 39 */            return taskDoRead;
                }
            }
