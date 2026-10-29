            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ClientIdentity;
            import com.google.android.gms.location.LocationRequest;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.List;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbb implements Parcelable.Creator<zzba> {
                @Override // android.os.Parcelable.Creator
                public final zzba createFromParcel(Parcel parcel) {
/* 3 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             List<ClientIdentity> listM7903n = zzba.zza;
/* 17 */            LocationRequest locationRequest = null;
/* 18 */            String strM7899j = null;
/* 19 */            String strM7899j2 = null;
/* 20 */            String strM7899j3 = null;
/* 22 */            boolean zM7914y = false;
/* 23 */            boolean zM7914y2 = false;
/* 24 */            boolean zM7914y3 = false;
/* 25 */            boolean zM7914y4 = false;
/* 26 */            boolean zM7914y5 = false;
/* 28 */            long jM7873F = Long.MAX_VALUE;
/* 34 */            while (parcel.dataPosition() < iM7883P) {
/* 36 */                int i = parcel.readInt();
/* 40 */                char c = (char) i;
/* 42 */                if (c != 1) {
                            switch (c) {
                                case 5:
/* 110 */                           listM7903n = qj3.m7903n(parcel, i, ClientIdentity.CREATOR);
                                    break;
                                case 6:
/* 102 */                           strM7899j = qj3.m7899j(i, parcel);
                                    break;
                                case 7:
/* 96 */                            zM7914y = qj3.m7914y(i, parcel);
                                    break;
                                case '\b':
/* 90 */                            zM7914y2 = qj3.m7914y(i, parcel);
                                    break;
                                case '\t':
/* 84 */                            zM7914y3 = qj3.m7914y(i, parcel);
                                    break;
                                case '\n':
/* 78 */                            strM7899j2 = qj3.m7899j(i, parcel);
                                    break;
                                case 11:
/* 72 */                            zM7914y4 = qj3.m7914y(i, parcel);
                                    break;
                                case '\f':
/* 65 */                            zM7914y5 = qj3.m7914y(i, parcel);
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 58 */                            strM7899j3 = qj3.m7899j(i, parcel);
                                    break;
                                case 14:
/* 51 */                            jM7873F = qj3.m7873F(i, parcel);
                                    break;
                                default:
/* 47 */                            qj3.m7878K(i, parcel);
                                    break;
                            }
                        } else {
/* 122 */                   locationRequest = (LocationRequest) qj3.m7898i(parcel, i, LocationRequest.CREATOR);
                        }
                    }
/* 126 */           qj3.m7908s(iM7883P, parcel);
/* 131 */           return new zzba(locationRequest, listM7903n, strM7899j, zM7914y, zM7914y2, zM7914y3, strM7899j2, zM7914y4, zM7914y5, strM7899j3, jM7873F);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ zzba[] newArray(int i) {
/* 1 */             return new zzba[i];
                }
            }
