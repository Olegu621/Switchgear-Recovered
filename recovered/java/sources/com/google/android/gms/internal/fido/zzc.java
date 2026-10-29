            package com.google.android.gms.internal.fido;

            import android.os.BadParcelableException;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import p000.fm0;
            
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

                public static ArrayList zzb(Parcel parcel) {
/* 3 */             return parcel.readArrayList(zza);
                }

                public static void zzc(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 19 */                throw new BadParcelableException(fm0.m3781g(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                }

                public static void zzd(Parcel parcel, Parcelable parcelable) {
/* 2 */             if (parcelable == null) {
/* 4 */                 parcel.writeInt(0);
                    } else {
/* 9 */                 parcel.writeInt(1);
/* 12 */                parcelable.writeToParcel(parcel, 0);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void zze(Parcel parcel, IInterface iInterface) {
/* 1 */             parcel.writeStrongBinder(iInterface);
                }

                public static boolean zzf(Parcel parcel) {
                    return parcel.readInt() != 0;
                }
            }
