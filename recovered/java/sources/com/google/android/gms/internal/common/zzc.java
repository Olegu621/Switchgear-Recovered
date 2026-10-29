            package com.google.android.gms.internal.common;

            import android.os.BadParcelableException;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                public static final /* synthetic */ int zza = 0;
                private static final ClassLoader zzb = zzc.class.getClassLoader();

                private zzc() {
                }

                public static boolean zza(Parcel parcel) {
                    return parcel.readInt() != 0;
                }

                public static Parcelable zzb(Parcel parcel, Parcelable.Creator creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void zzc(Parcel parcel, Parcelable parcelable) {
/* 2 */             if (parcelable == null) {
/* 4 */                 parcel.writeInt(0);
                    } else {
/* 9 */                 parcel.writeInt(1);
/* 12 */                parcelable.writeToParcel(parcel, 0);
                    }
                }

                public static void zzd(Parcel parcel, Parcelable parcelable) {
/* 1 */             if (parcelable == null) {
/* 4 */                 parcel.writeInt(0);
                    } else {
/* 9 */                 parcel.writeInt(1);
/* 12 */                parcelable.writeToParcel(parcel, 1);
                    }
                }

                public static void zze(Parcel parcel, IInterface iInterface) {
/* 1 */             if (iInterface == null) {
/* 4 */                 parcel.writeStrongBinder(null);
                    } else {
/* 12 */                parcel.writeStrongBinder(iInterface.asBinder());
                    }
                }

                public static void zzf(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 34 */                throw new BadParcelableException(fm0.m3788n(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
                    }
                }
            }
