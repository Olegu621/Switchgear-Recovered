            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbf implements Parcelable.Creator<zzbe> {
                @Override // android.os.Parcelable.Creator
                public final zzbe createFromParcel(Parcel parcel) {
/* 3 */             int iM7883P = qj3.m7883P(parcel);
/* 15 */            String strM7899j = null;
/* 16 */            int iM7871D = 0;
/* 17 */            short s = 0;
/* 18 */            int iM7871D2 = 0;
/* 20 */            double d = 0.0d;
/* 21 */            double d2 = 0.0d;
/* 23 */            float fM7869B = 0.0f;
/* 25 */            long jM7873F = 0;
/* 27 */            int iM7871D3 = -1;
/* 33 */            while (parcel.dataPosition() < iM7883P) {
/* 35 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 1:
/* 113 */                       strM7899j = qj3.m7899j(i, parcel);
                                break;
                            case 2:
/* 106 */                       jM7873F = qj3.m7873F(i, parcel);
                                break;
                            case 3:
/* 96 */                        qj3.m7887T(parcel, i, 4);
/* 103 */                       s = (short) parcel.readInt();
                                break;
                            case 4:
/* 86 */                        qj3.m7887T(parcel, i, 8);
/* 89 */                        d = parcel.readDouble();
                                break;
                            case 5:
/* 76 */                        qj3.m7887T(parcel, i, 8);
/* 79 */                        d2 = parcel.readDouble();
                                break;
                            case 6:
/* 69 */                        fM7869B = qj3.m7869B(i, parcel);
                                break;
                            case 7:
/* 63 */                        iM7871D = qj3.m7871D(i, parcel);
                                break;
                            case '\b':
/* 56 */                        iM7871D2 = qj3.m7871D(i, parcel);
                                break;
                            case '\t':
/* 49 */                        iM7871D3 = qj3.m7871D(i, parcel);
                                break;
                            default:
/* 45 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 119 */           qj3.m7908s(iM7883P, parcel);
/* 124 */           return new zzbe(strM7899j, iM7871D, s, d, d2, fM7869B, jM7873F, iM7871D2, iM7871D3);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ zzbe[] newArray(int i) {
/* 1 */             return new zzbe[i];
                }
            }
