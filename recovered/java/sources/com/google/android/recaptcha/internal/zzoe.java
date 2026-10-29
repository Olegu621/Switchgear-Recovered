            package com.google.android.recaptcha.internal;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.logging.Level;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzoe extends zzns {
                public static final /* synthetic */ int zza = 0;
                private static final Set zzb;
                private static final zznl zzc;
                private static final zzob zzd;

                static {
/* 20 */            Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzmu.zza, zzmz.zza, zzna.zza)));
/* 24 */            zzb = setUnmodifiableSet;
/* 34 */            zzc = zzno.zza(setUnmodifiableSet).zza();
/* 42 */            zzd = new zzob();
                }

                public /* synthetic */ zzoe(String str, String str2, boolean z, int i, Level level, Set set, zznl zznlVar, zzod zzodVar) {
/* 1 */             super(str2);
/* 10 */            if (str2.length() > 23) {
/* 16 */                int i2 = -1;
/* 18 */                for (int length = str2.length() - 1; length >= 0; length--) {
/* 20 */                    char cCharAt = str2.charAt(length);
/* 26 */                    if (cCharAt == '.' || cCharAt == '$') {
/* 36 */                        i2 = length;
                                break;
                            }
                        }
/* 39 */                str2 = str2.substring(i2 + 1);
                    }
/* 45 */            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET.concat(str2);
/* 58 */            strConcat.substring(0, Math.min(strConcat.length(), 23));
                }

                public static zzob zzc() {
/* 1 */             return zzd;
                }
            }
