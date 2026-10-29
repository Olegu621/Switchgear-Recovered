            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.drive.zzez;
            import com.google.android.gms.internal.drive.zzkk;
            import p000.kb1;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zza extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zza> CREATOR = new md3(26);

                /* JADX INFO: renamed from: a */
                public final long f3727a;

                /* JADX INFO: renamed from: b */
                public final long f3728b;

                /* JADX INFO: renamed from: c */
                public final long f3729c;

                /* JADX INFO: renamed from: d */
                public volatile String f3730d = null;

                public zza(long j, long j2, long j3) {
/* 18 */            kb1.m6054g(j != -1);
/* 28 */            kb1.m6054g(j2 != -1);
/* 36 */            kb1.m6054g(j3 != -1);
/* 39 */            this.f3727a = j;
/* 41 */            this.f3728b = j2;
/* 43 */            this.f3729c = j3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == zza.class) {
/* 13 */                zza zzaVar = (zza) obj;
/* 21 */                if (zzaVar.f3728b == this.f3728b && zzaVar.f3729c == this.f3729c && zzaVar.f3727a == this.f3727a) {
/* 39 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 3 */             String strValueOf = String.valueOf(this.f3727a);
/* 9 */             String strValueOf2 = String.valueOf(this.f3728b);
/* 15 */            String strValueOf3 = String.valueOf(this.f3729c);
/* 47 */            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf3).length() + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length());
/* 50 */            sb.append(strValueOf);
/* 53 */            sb.append(strValueOf2);
/* 56 */            sb.append(strValueOf3);
/* 63 */            return sb.toString().hashCode();
                }

                public final String toString() {
/* 3 */             if (this.f3730d == null) {
/* 50 */                String strValueOf = String.valueOf(Base64.encodeToString(((zzez) ((zzkk) zzez.zzaj().zzk(1).zzc(this.f3727a).zzd(this.f3728b).zze(this.f3729c).zzdf())).toByteArray(), 10));
/* 72 */                this.f3730d = strValueOf.length() != 0 ? "ChangeSequenceNumber:".concat(strValueOf) : new String("ChangeSequenceNumber:");
                    }
/* 74 */            return this.f3730d;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 2, 8);
/* 15 */            parcel.writeLong(this.f3727a);
/* 19 */            w11.m9420b0(parcel, 3, 8);
/* 24 */            parcel.writeLong(this.f3728b);
/* 28 */            w11.m9420b0(parcel, 4, 8);
/* 33 */            parcel.writeLong(this.f3729c);
/* 36 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
