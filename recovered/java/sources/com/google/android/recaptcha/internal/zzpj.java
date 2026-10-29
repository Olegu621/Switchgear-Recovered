            package com.google.android.recaptcha.internal;

            import java.io.Serializable;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzpj extends zzoz implements Serializable {
                private final MessageDigest zza;
                private final int zzb;
                private final boolean zzc;
                private final String zzd;

                public zzpj(String str, String str2) {
/* 6 */             MessageDigest messageDigestZzc = zzc("SHA-256");
/* 10 */            this.zza = messageDigestZzc;
/* 16 */            this.zzb = messageDigestZzc.getDigestLength();
/* 20 */            this.zzd = "Hashing.sha256()";
/* 26 */            this.zzc = zzd(messageDigestZzc);
                }

                private static MessageDigest zzc(String str) {
                    try {
/* 1 */                 return MessageDigest.getInstance(str);
                    } catch (NoSuchAlgorithmException e) {
/* 7 */                 C1951n4.m6856g(e);
/* 10 */                return null;
                    }
                }

                private static boolean zzd(MessageDigest messageDigest) {
                    try {
/* 1 */                 messageDigest.clone();
/* 4 */                 return true;
                    } catch (CloneNotSupportedException unused) {
/* 6 */                 return false;
                    }
                }

                public final String toString() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.recaptcha.internal.zzpd
                public final zzpe zzb() {
/* 3 */             zzpi zzpiVar = null;
/* 4 */             if (this.zzc) {
                        try {
/* 18 */                    return new zzph((MessageDigest) this.zza.clone(), this.zzb, zzpiVar);
                        } catch (CloneNotSupportedException unused) {
                        }
                    }
/* 36 */            return new zzph(zzc(this.zza.getAlgorithm()), this.zzb, zzpiVar);
                }
            }
