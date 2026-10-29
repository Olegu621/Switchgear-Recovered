            package com.google.android.gms.common.server.response;

            import android.os.Parcel;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.common.server.converter.StringToIntConverter;
            import com.google.android.gms.common.server.converter.zaa;
            import p000.cc3;
            import p000.f42;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 48 */    public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
                public static final cc3 CREATOR = new cc3();

                /* JADX INFO: renamed from: U */
                public zan f3573U;

                /* JADX INFO: renamed from: V */
                public final StringToIntConverter f3574V;

                /* JADX INFO: renamed from: a */
                public final int f3575a;

                /* JADX INFO: renamed from: b */
                public final int f3576b;

                /* JADX INFO: renamed from: c */
                public final boolean f3577c;

                /* JADX INFO: renamed from: d */
                public final int f3578d;

                /* JADX INFO: renamed from: e */
                public final boolean f3579e;

                /* JADX INFO: renamed from: f */
                public final String f3580f;

                /* JADX INFO: renamed from: i */
                public final int f3581i;

                /* JADX INFO: renamed from: v */
                public final Class f3582v;

                /* JADX INFO: renamed from: w */
                public final String f3583w;

                public FastJsonResponse$Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
/* 4 */             this.f3575a = i;
/* 6 */             this.f3576b = i2;
/* 8 */             this.f3577c = z;
/* 10 */            this.f3578d = i3;
/* 12 */            this.f3579e = z2;
/* 14 */            this.f3580f = str;
/* 16 */            this.f3581i = i4;
/* 19 */            if (str2 == null) {
/* 21 */                this.f3582v = null;
/* 23 */                this.f3583w = null;
                    } else {
/* 28 */                this.f3582v = SafeParcelResponse.class;
/* 30 */                this.f3583w = str2;
                    }
/* 32 */            if (zaaVar == null) {
/* 34 */                this.f3574V = null;
/* 36 */                return;
                    }
/* 37 */            StringToIntConverter stringToIntConverter = zaaVar.f3569b;
/* 39 */            if (stringToIntConverter != null) {
/* 41 */                this.f3574V = stringToIntConverter;
                    } else {
/* 46 */                f42.m3656l("There was no converter wrapped in this ConverterWrapper.");
/* 49 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: D1 */
                public static FastJsonResponse$Field m2026D1(int i, String str) {
/* 10 */            return new FastJsonResponse$Field(7, true, 7, true, str, i, null);
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 14 */            wc0Var.m9529d(Integer.valueOf(this.f3575a), "versionCode");
/* 25 */            wc0Var.m9529d(Integer.valueOf(this.f3576b), "typeIn");
/* 36 */            wc0Var.m9529d(Boolean.valueOf(this.f3577c), "typeInArray");
/* 47 */            wc0Var.m9529d(Integer.valueOf(this.f3578d), "typeOut");
/* 58 */            wc0Var.m9529d(Boolean.valueOf(this.f3579e), "typeOutArray");
/* 65 */            wc0Var.m9529d(this.f3580f, "outputFieldName");
/* 76 */            wc0Var.m9529d(Integer.valueOf(this.f3581i), "safeParcelFieldId");
/* 79 */            String str = this.f3583w;
/* 81 */            if (str == null) {
/* 83 */                str = null;
                    }
/* 86 */            wc0Var.m9529d(str, "concreteTypeName");
/* 89 */            Class cls = this.f3582v;
/* 91 */            if (cls != null) {
/* 99 */                wc0Var.m9529d(cls.getCanonicalName(), "concreteType.class");
                    }
/* 104 */           if (this.f3574V != null) {
/* 114 */               wc0Var.m9529d(StringToIntConverter.class.getCanonicalName(), "converterName");
                    }
/* 117 */           return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3575a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3576b);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f3577c ? 1 : 0);
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.f3578d);
/* 44 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.f3579e ? 1 : 0);
/* 56 */            w11.m9410T(parcel, 6, this.f3580f, false);
/* 60 */            w11.m9420b0(parcel, 7, 4);
/* 65 */            parcel.writeInt(this.f3581i);
/* 69 */            String str = this.f3583w;
/* 71 */            if (str == null) {
/* 73 */                str = null;
                    }
/* 76 */            w11.m9410T(parcel, 8, str, false);
/* 79 */            StringToIntConverter stringToIntConverter = this.f3574V;
/* 91 */            w11.m9409S(parcel, 9, stringToIntConverter != null ? new zaa(stringToIntConverter) : null, i, false);
/* 94 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 49 */        public FastJsonResponse$Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
/* 51 */            this.f3575a = 1;
                    this.f3576b = i;
                    this.f3577c = z;
                    this.f3578d = i2;
                    this.f3579e = z2;
                    this.f3580f = str;
                    this.f3581i = i3;
                    this.f3582v = cls;
                    if (cls == null) {
                        this.f3583w = null;
                    } else {
/* 52 */                this.f3583w = cls.getCanonicalName();
                    }
/* 53 */            this.f3574V = null;
                }
            }
