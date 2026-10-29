            package com.google.android.gms.common.server.response;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zam extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zam> CREATOR = new ub3(4);

                /* JADX INFO: renamed from: a */
                public final int f3594a;

                /* JADX INFO: renamed from: b */
                public final String f3595b;

                /* JADX INFO: renamed from: c */
                public final FastJsonResponse$Field f3596c;

                public zam(FastJsonResponse$Field fastJsonResponse$Field, String str) {
/* 5 */             this.f3594a = 1;
/* 7 */             this.f3595b = str;
/* 9 */             this.f3596c = fastJsonResponse$Field;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3594a);
/* 21 */            w11.m9410T(parcel, 2, this.f3595b, false);
/* 27 */            w11.m9409S(parcel, 3, this.f3596c, i, false);
/* 30 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 11 */        public zam(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
/* 13 */            this.f3594a = i;
                    this.f3595b = str;
                    this.f3596c = fastJsonResponse$Field;
                }
            }
