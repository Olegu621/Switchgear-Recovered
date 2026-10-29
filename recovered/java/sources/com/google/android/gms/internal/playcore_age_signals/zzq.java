            package com.google.android.gms.internal.playcore_age_signals;

            import android.util.Base64;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzq {
                public static String zza(byte[] bArr) {
                    try {
/* 3 */                 MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 7 */                 messageDigest.update(bArr);
/* 16 */                return Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
/* 21 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
            }
