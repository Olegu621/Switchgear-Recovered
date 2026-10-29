            package com.google.android.gms.internal.games_v2;

            import android.os.BadParcelableException;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                private static final ClassLoader zza = zzc.class.getClassLoader();

                private zzc() {
                }

                public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void zzb(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail <= 0) {
/* 7 */                 return;
                    }
/* 14 */            StringBuilder sb = new StringBuilder(56);
/* 19 */            sb.append("Parcel data not fully consumed, unread size: ");
/* 22 */            sb.append(iDataAvail);
/* 32 */            throw new BadParcelableException(sb.toString());
                }

                public static void zzc(Parcel parcel, boolean z) {
/* 1 */             parcel.writeInt(z ? 1 : 0);
                }

                public static void zzd(Parcel parcel, Parcelable parcelable) {
/* 2 */             if (parcelable == null) {
/* 4 */                 parcel.writeInt(0);
                    } else {
/* 9 */                 parcel.writeInt(1);
/* 12 */                parcelable.writeToParcel(parcel, 0);
                    }
                }

                public static void zze(Parcel parcel, Parcelable parcelable) {
/* 2 */             parcel.writeInt(1);
/* 5 */             parcelable.writeToParcel(parcel, 1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void zzf(Parcel parcel, IInterface iInterface) {
/* 1 */             if (iInterface == 0) {
/* 4 */                 parcel.writeStrongBinder(null);
                    } else {
/* 8 */                 parcel.writeStrongBinder(iInterface);
                    }
                }

                public static boolean zzg(Parcel parcel) {
                    return parcel.readInt() != 0;
                }
            }
