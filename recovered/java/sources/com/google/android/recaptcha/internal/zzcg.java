            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaErrorCode;
            import com.google.android.recaptcha.RecaptchaException;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 145 */   public final class zzcg extends Exception {
                public static final /* synthetic */ int zza = 0;
                private static final Map zzb;
                private final zzce zzc;
                private final zzcd zzd;
                private final String zze;
                private final Exception zzf;
                private final Map zzg;

                /* JADX WARN: Multi-variable type inference failed */
                static {
/* 19 */            Pair pair = new Pair(zzzk.JS_NETWORK_ERROR, new zzcg(zzce.zzc, zzcd.zzd, null, null, 12, null));
/* 22 */            zzzk zzzkVar = zzzk.JS_INTERNAL_ERROR;
/* 26 */            zzce zzceVar = zzce.zzb;
/* 50 */            int i = 12;
/* 52 */            DefaultConstructorMarker defaultConstructorMarker = null;
/* 155 */           zzb = oc1.m7131e(pair, new Pair(zzzkVar, new zzcg(zzceVar, zzcd.zzc, null, 0 == true ? 1 : 0, 12, null)), new Pair(zzzk.JS_INVALID_SITE_KEY, new zzcg(zzce.zzd, zzcd.zze, null, 0 == true ? 1 : 0, i, defaultConstructorMarker)), new Pair(zzzk.JS_INVALID_SITE_KEY_TYPE, new zzcg(zzce.zze, zzcd.zzf, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, defaultConstructorMarker)), new Pair(zzzk.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzcg(zzce.zzf, zzcd.zzg, null, null, 12, null)), new Pair(zzzk.JS_INVALID_ACTION, new zzcg(zzce.zzg, zzcd.zzh, null, 0 == true ? 1 : 0, 12, null)), new Pair(zzzk.JS_PROGRAM_ERROR, new zzcg(zzceVar, zzcd.zzj, null, 0 == true ? 1 : 0, 12, null)));
                }

                public zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc) {
/* 4 */             this.zzc = zzceVar;
/* 6 */             this.zzd = zzcdVar;
/* 8 */             this.zze = str;
/* 10 */            this.zzf = exc;
/* 12 */            zzce zzceVar2 = zzce.zzc;
/* 16 */            RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
/* 144 */           this.zzg = oc1.m7131e(new Pair(zzceVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzce.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzce.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzce.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new Pair(zzce.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new Pair(zzce.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new Pair(zzce.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new Pair(zzce.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new Pair(zzce.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
                }

                @Override // java.lang.Throwable
                public final /* synthetic */ Throwable getCause() {
/* 1 */             return this.zzf;
                }

                public final zzcd zza() {
/* 1 */             return this.zzd;
                }

                public final zzce zzb() {
/* 1 */             return this.zzc;
                }

                public final RecaptchaException zzc() {
/* 1 */             zzcd zzcdVar = this.zzd;
/* 11 */            if (Intrinsics.m6216a(zzcdVar, zzcd.zzI)) {
/* 17 */                return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
                    }
/* 27 */            if (Intrinsics.m6216a(zzcdVar, zzcd.zzao)) {
/* 33 */                return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
                    }
/* 45 */            RecaptchaException recaptchaException = (RecaptchaException) this.zzg.get(this.zzc);
                    return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
                }

                public final String zzd() {
/* 1 */             return this.zze;
                }

/* 146 */       public /* synthetic */ zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 147 */           this(zzceVar, zzcdVar, (i & 4) != 0 ? null : str, null);
                }
            }
