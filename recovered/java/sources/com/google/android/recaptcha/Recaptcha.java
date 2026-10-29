            package com.google.android.recaptcha;

            import android.app.Application;
            import com.google.android.gms.tasks.Task;
            import com.google.android.recaptcha.internal.zzdz;
            import com.google.android.recaptcha.internal.zzeq;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.c10;
            import p000.f42;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"Lcom/google/android/recaptcha/Recaptcha;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Landroid/app/Application;", "application", HttpUrl.FRAGMENT_ENCODE_SET, "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Lc10;)Ljava/lang/Object;", "Lo42;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLc10;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 6 */     public final class Recaptcha {
                public static final Recaptcha INSTANCE = new Recaptcha();

                private Recaptcha() {
                }

                public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String siteKey) {
/* 1 */             return zzdz.zze(application, siteKey);
                }

                /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
                public static /* synthetic */ Object m10484getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, c10 c10Var, int i, Object obj) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 j = 10000;
                    }
/* 12 */            return recaptcha.m10485getClientBWLJW6A(application, str, j, c10Var);
                }

                public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
/* 3 */             return zzdz.zzc(application, siteKey, 10000L);
                }

                public final Object fetchClient(Application application, String str, c10 c10Var) {
/* 1 */             return zzdz.zzd(application, str, c10Var);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
                public final Object m10485getClientBWLJW6A(Application application, String str, long j, c10 c10Var) {
                    Recaptcha$getClient$1 recaptcha$getClient$1;
/* 3 */             if (c10Var instanceof Recaptcha$getClient$1) {
/* 6 */                 recaptcha$getClient$1 = (Recaptcha$getClient$1) c10Var;
/* 8 */                 int i = recaptcha$getClient$1.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    recaptcha$getClient$1.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    recaptcha$getClient$1 = new Recaptcha$getClient$1(this, c10Var);
                        }
                    } else {
/* 22 */                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, c10Var);
                    }
/* 25 */            Object objZzb = recaptcha$getClient$1.zza;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = recaptcha$getClient$1.zzc;
                    try {
/* 32 */                if (i2 == 0) {
/* 47 */                    pg3.m7417A(objZzb);
/* 50 */                    m42 m42Var = o42.f14612b;
/* 52 */                    recaptcha$getClient$1.zzc = 1;
/* 54 */                    objZzb = zzdz.zzb(application, str, j, recaptcha$getClient$1);
/* 58 */                    if (objZzb == z10Var) {
/* 60 */                        return z10Var;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 42 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                        return null;
                            }
/* 36 */                    pg3.m7417A(objZzb);
                        }
/* 61 */                zzeq zzeqVar = (zzeq) objZzb;
/* 63 */                m42 m42Var2 = o42.f14612b;
/* 65 */                return zzeqVar;
                    } catch (Throwable th) {
/* 67 */                m42 m42Var3 = o42.f14612b;
/* 71 */                return new n42(th);
                    }
                }

/* 7 */         public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
/* 8 */             return zzdz.zzc(application, siteKey, timeout);
                }
            }
