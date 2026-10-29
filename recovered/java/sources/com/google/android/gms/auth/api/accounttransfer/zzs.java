            package com.google.android.gms.auth.api.accounttransfer;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            import com.google.android.gms.internal.auth.zzbz;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import p000.C1024id;
            import p000.dr3;
            import p000.f42;
            import p000.fm0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzs extends zzbz {
                public static final Parcelable.Creator<zzs> CREATOR = new dr3(10);

                /* JADX INFO: renamed from: i */
                public static final C1024id f3254i;

                /* JADX INFO: renamed from: a */
                public final int f3255a;

                /* JADX INFO: renamed from: b */
                public List f3256b;

                /* JADX INFO: renamed from: c */
                public List f3257c;

                /* JADX INFO: renamed from: d */
                public List f3258d;

                /* JADX INFO: renamed from: e */
                public List f3259e;

                /* JADX INFO: renamed from: f */
                public List f3260f;

                static {
/* 12 */            C1024id c1024id = new C1024id();
/* 15 */            f3254i = c1024id;
/* 24 */            c1024id.put("registered", FastJsonResponse$Field.m2026D1(2, "registered"));
/* 34 */            c1024id.put("in_progress", FastJsonResponse$Field.m2026D1(3, "in_progress"));
/* 44 */            c1024id.put("success", FastJsonResponse$Field.m2026D1(4, "success"));
/* 54 */            c1024id.put("failed", FastJsonResponse$Field.m2026D1(5, "failed"));
/* 64 */            c1024id.put("escrowed", FastJsonResponse$Field.m2026D1(6, "escrowed"));
                }

                public zzs(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
/* 4 */             this.f3255a = i;
/* 6 */             this.f3256b = arrayList;
/* 8 */             this.f3257c = arrayList2;
/* 10 */            this.f3258d = arrayList3;
/* 12 */            this.f3259e = arrayList4;
/* 14 */            this.f3260f = arrayList5;
                }

                @Override // p000.wg0
                public final Map getFieldMappings() {
/* 1 */             return f3254i;
                }

                @Override // p000.wg0
                public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
                    switch (i) {
                        case 1:
/* 34 */                    return Integer.valueOf(this.f3255a);
                        case 2:
/* 29 */                    return this.f3256b;
                        case 3:
/* 26 */                    return this.f3257c;
                        case 4:
/* 23 */                    return this.f3258d;
                        case 5:
/* 20 */                    return this.f3259e;
                        case 6:
/* 17 */                    return this.f3260f;
                        default:
/* 12 */                    f42.m3656l(fm0.m3781g(i, "Unknown SafeParcelable id="));
/* 15 */                    return null;
                    }
                }

                @Override // p000.wg0
                public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
/* 1 */             return true;
                }

                @Override // p000.wg0
                public final void setStringsInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i == 2) {
/* 44 */                this.f3256b = arrayList;
/* 46 */                return;
                    }
/* 7 */             if (i == 3) {
/* 41 */                this.f3257c = arrayList;
/* 43 */                return;
                    }
/* 10 */            if (i == 4) {
/* 38 */                this.f3258d = arrayList;
/* 40 */                return;
                    }
/* 13 */            if (i == 5) {
/* 35 */                this.f3259e = arrayList;
                    } else if (i == 6) {
/* 18 */                this.f3260f = arrayList;
                    } else {
/* 31 */                C1697u2.m5437m("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(i)});
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3255a);
/* 20 */            w11.m9412V(parcel, this.f3256b, 2);
/* 26 */            w11.m9412V(parcel, this.f3257c, 3);
/* 31 */            w11.m9412V(parcel, this.f3258d, 4);
/* 37 */            w11.m9412V(parcel, this.f3259e, 5);
/* 43 */            w11.m9412V(parcel, this.f3260f, 6);
/* 46 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
