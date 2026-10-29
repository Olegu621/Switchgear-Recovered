            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.server.converter.zaa;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cc3 implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             String strM7899j = null;
/* 8 */             String strM7899j2 = null;
/* 9 */             zaa zaaVar = null;
/* 10 */            int iM7871D = 0;
/* 11 */            int iM7871D2 = 0;
/* 12 */            boolean zM7914y = false;
/* 13 */            int iM7871D3 = 0;
/* 14 */            boolean zM7914y2 = false;
/* 15 */            int iM7871D4 = 0;
/* 20 */            while (parcel.dataPosition() < iM7883P) {
/* 22 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 1:
/* 79 */                        iM7871D = qj3.m7871D(i, parcel);
                                break;
                            case 2:
/* 74 */                        iM7871D2 = qj3.m7871D(i, parcel);
                                break;
                            case 3:
/* 69 */                        zM7914y = qj3.m7914y(i, parcel);
                                break;
                            case 4:
/* 64 */                        iM7871D3 = qj3.m7871D(i, parcel);
                                break;
                            case 5:
/* 59 */                        zM7914y2 = qj3.m7914y(i, parcel);
                                break;
                            case 6:
/* 54 */                        strM7899j = qj3.m7899j(i, parcel);
                                break;
                            case 7:
/* 49 */                        iM7871D4 = qj3.m7871D(i, parcel);
                                break;
                            case '\b':
/* 44 */                        strM7899j2 = qj3.m7899j(i, parcel);
                                break;
                            case '\t':
/* 41 */                        zaaVar = (zaa) qj3.m7898i(parcel, i, zaa.CREATOR);
                                break;
                            default:
/* 30 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 84 */            qj3.m7908s(iM7883P, parcel);
/* 89 */            return new FastJsonResponse$Field(iM7871D, iM7871D2, zM7914y, iM7871D3, zM7914y2, strM7899j, iM7871D4, strM7899j2, zaaVar);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new FastJsonResponse$Field[i];
                }
            }
