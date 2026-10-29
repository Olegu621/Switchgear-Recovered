            package com.google.android.gms.internal.measurement;

            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.math.RoundingMode;
            import java.text.DecimalFormat;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzah implements zzao {
                private final Double zza;

                public zzah(Double d) {
/* 4 */             if (d == null) {
/* 12 */                this.zza = Double.valueOf(Double.NaN);
                    } else {
/* 15 */                this.zza = d;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzah) {
/* 17 */                return this.zza.equals(((zzah) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final String toString() {
/* 1 */             return zzc();
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 1 */             Double d = this.zza;
/* 11 */            if (Double.isNaN(d.doubleValue())) {
/* 13 */                return "NaN";
                    }
/* 24 */            if (Double.isInfinite(d.doubleValue())) {
                        return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
                    }
/* 46 */            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
/* 65 */            BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
/* 73 */            DecimalFormat decimalFormat = new DecimalFormat("0E0");
/* 78 */            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
/* 99 */            decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
/* 102 */           String str = decimalFormat.format(bigDecimal);
/* 108 */           int iIndexOf = str.indexOf("E");
/* 112 */           if (iIndexOf <= 0) {
/* 155 */               return str;
                    }
/* 120 */           int i = Integer.parseInt(str.substring(iIndexOf + 1));
                    return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
/* 7 */             if ("toString".equals(str)) {
/* 15 */                return new zzas(zzc());
                    }
/* 31 */            C1951n4.m6859j(pm2.m7489l(zzc(), ".", str, " is not a function."));
/* 34 */            return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 1 */             Double d = this.zza;
/* 11 */            boolean z = false;
/* 12 */            if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
/* 24 */                z = true;
                    }
/* 25 */            return Boolean.valueOf(z);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 1 */             return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 5 */             return new zzah(this.zza);
                }
            }
