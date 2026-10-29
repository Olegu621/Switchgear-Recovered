            package com.google.android.gms.internal.measurement;

            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbu extends zzca {
                private final String zzc;
                private final int zzd;
                private final int zze;

                public /* synthetic */ zzbu(String str, boolean z, int i, zzbr zzbrVar, zzbs zzbsVar, int i2, byte[] bArr) {
/* 4 */             this.zzc = str;
/* 6 */             this.zzd = i;
/* 8 */             this.zze = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zzca) {
/* 10 */                zzca zzcaVar = (zzca) obj;
/* 22 */                if (this.zzc.equals(zzcaVar.zza())) {
/* 24 */                    zzcaVar.zzb();
/* 27 */                    int i = this.zzd;
/* 29 */                    int iZze = zzcaVar.zze();
/* 34 */                    if (i == 0) {
/* 56 */                        throw null;
                            }
/* 36 */                    if (i == iZze) {
/* 38 */                        zzcaVar.zzc();
/* 41 */                        zzcaVar.zzd();
/* 44 */                        int i2 = this.zze;
/* 46 */                        int iZzf = zzcaVar.zzf();
/* 50 */                        if (i2 == 0) {
/* 55 */                            throw null;
                                }
/* 52 */                        if (iZzf == 1) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.zzc.hashCode() ^ 1000003;
/* 11 */            int i = this.zzd;
/* 14 */            if (i == 0) {
/* 33 */                throw null;
                    }
/* 20 */            int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
/* 23 */            if (this.zze != 0) {
/* 29 */                return (i2 * 583896283) ^ 1;
                    }
/* 32 */            throw null;
                }

                public final String toString() {
                    String str;
/* 1 */             int i = this.zzd;
/* 6 */             if (i == 1) {
/* 28 */                str = "ALL_CHECKS";
                    } else if (i == 2) {
/* 25 */                str = "SKIP_COMPLIANCE_CHECK";
                    } else if (i != 3) {
/* 19 */                str = i != 4 ? "null" : "NO_CHECKS";
                    } else {
/* 22 */                str = "SKIP_SECURITY_CHECK";
                    }
/* 35 */            String str2 = this.zze == 1 ? "READ_AND_WRITE" : "null";
/* 37 */            String str3 = this.zzc;
/* 64 */            StringBuilder sb = new StringBuilder(str2.length() + str.length() + String.valueOf(str3).length() + 73 + 91 + 1);
/* 71 */            fm0.m3796v(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
/* 78 */            return fm0.m3790p(sb, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
                }

                @Override // com.google.android.gms.internal.measurement.zzca
                public final String zza() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.measurement.zzca
                public final boolean zzb() {
/* 1 */             return false;
                }

                @Override // com.google.android.gms.internal.measurement.zzca
                public final zzbr zzc() {
/* 1 */             return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzca
                public final zzbs zzd() {
/* 1 */             return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzca
                public final int zze() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.measurement.zzca
                public final int zzf() {
/* 1 */             return this.zze;
                }
            }
