            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Locale;
            import p000.ds0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbe extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
                private final String zza;
                private final long zzb;
                private final short zzc;
                private final double zzd;
                private final double zze;
                private final float zzf;
                private final int zzg;
                private final int zzh;
                private final int zzi;

                public zzbe(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
/* 4 */             if (str == null || str.length() > 100) {
/* 166 */               String strValueOf = String.valueOf(str);
/* 191 */               throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
                    }
/* 19 */            if (f <= 0.0f) {
/* 145 */               StringBuilder sb = new StringBuilder(31);
/* 150 */               sb.append("invalid radius: ");
/* 153 */               sb.append(f);
/* 163 */               throw new IllegalArgumentException(sb.toString());
                    }
/* 28 */            if (d > 90.0d || d < -90.0d) {
/* 120 */               StringBuilder sb2 = new StringBuilder(42);
/* 125 */               sb2.append("invalid latitude: ");
/* 128 */               sb2.append(d);
/* 138 */               throw new IllegalArgumentException(sb2.toString());
                    }
/* 46 */            if (d2 > 180.0d || d2 < -180.0d) {
/* 95 */                StringBuilder sb3 = new StringBuilder(43);
/* 100 */               sb3.append("invalid longitude: ");
/* 103 */               sb3.append(d2);
/* 113 */               throw new IllegalArgumentException(sb3.toString());
                    }
/* 57 */            int i4 = i & 7;
/* 59 */            if (i4 == 0) {
/* 84 */                ds0.m3189f(46, "No supported transition specified: ", i);
/* 88 */                throw null;
                    }
/* 61 */            this.zzc = s;
/* 63 */            this.zza = str;
/* 65 */            this.zzd = d;
/* 67 */            this.zze = d2;
/* 69 */            this.zzf = f;
/* 71 */            this.zzb = j;
/* 73 */            this.zzg = i4;
/* 75 */            this.zzh = i2;
/* 77 */            this.zzi = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zzbe) {
/* 10 */                zzbe zzbeVar = (zzbe) obj;
/* 18 */                if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final String getRequestId() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 3 */             long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
/* 9 */             long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
/* 47 */            return ((((Float.floatToIntBits(this.zzf) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
                }

                public final String toString() {
                    String str;
/* 1 */             Locale locale = Locale.US;
/* 3 */             short s = this.zzc;
/* 6 */             if (s != -1) {
/* 15 */                str = s != 1 ? "UNKNOWN" : "CIRCLE";
                    } else {
/* 18 */                str = "INVALID";
                    }
/* 81 */            return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.zza, false);
/* 14 */            long j = this.zzb;
/* 19 */            w11.m9420b0(parcel, 2, 8);
/* 22 */            parcel.writeLong(j);
/* 25 */            short s = this.zzc;
/* 29 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(s);
/* 35 */            double d = this.zzd;
/* 37 */            w11.m9420b0(parcel, 4, 8);
/* 40 */            parcel.writeDouble(d);
/* 43 */            double d2 = this.zze;
/* 46 */            w11.m9420b0(parcel, 5, 8);
/* 49 */            parcel.writeDouble(d2);
/* 52 */            float f = this.zzf;
/* 55 */            w11.m9420b0(parcel, 6, 4);
/* 58 */            parcel.writeFloat(f);
/* 61 */            int i2 = this.zzg;
/* 64 */            w11.m9420b0(parcel, 7, 4);
/* 67 */            parcel.writeInt(i2);
/* 70 */            int i3 = this.zzh;
/* 72 */            w11.m9420b0(parcel, 8, 4);
/* 75 */            parcel.writeInt(i3);
/* 78 */            int i4 = this.zzi;
/* 82 */            w11.m9420b0(parcel, 9, 4);
/* 85 */            parcel.writeInt(i4);
/* 88 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
