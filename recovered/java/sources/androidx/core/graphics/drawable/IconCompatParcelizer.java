            package androidx.core.graphics.drawable;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.nio.charset.Charset;
            import p000.C1951n4;
            import p000.h23;
            import p000.i23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class IconCompatParcelizer {
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public static IconCompat read(h23 h23Var) {
/* 3 */             IconCompat iconCompat = new IconCompat();
/* 7 */             iconCompat.f1246a = -1;
/* 10 */            iconCompat.f1248c = null;
/* 12 */            iconCompat.f1249d = null;
/* 15 */            iconCompat.f1250e = 0;
/* 17 */            iconCompat.f1251f = 0;
/* 19 */            iconCompat.f1252g = null;
/* 23 */            iconCompat.f1253h = IconCompat.f1245k;
/* 25 */            iconCompat.f1254i = null;
/* 32 */            iconCompat.f1246a = h23Var.m4092f(-1, 1);
/* 34 */            byte[] bArr = iconCompat.f1248c;
/* 41 */            if (h23Var.mo4091e(2)) {
/* 47 */                Parcel parcel = ((i23) h23Var).f9423e;
/* 49 */                int i = parcel.readInt();
/* 53 */                if (i < 0) {
/* 55 */                    bArr = null;
                        } else {
/* 57 */                    byte[] bArr2 = new byte[i];
/* 59 */                    parcel.readByteArray(bArr2);
/* 62 */                    bArr = bArr2;
                        }
                    }
/* 63 */            iconCompat.f1248c = bArr;
/* 72 */            iconCompat.f1249d = h23Var.m4093g(iconCompat.f1249d, 3);
/* 81 */            iconCompat.f1250e = h23Var.m4092f(iconCompat.f1250e, 4);
/* 90 */            iconCompat.f1251f = h23Var.m4092f(iconCompat.f1251f, 5);
/* 101 */           iconCompat.f1252g = (ColorStateList) h23Var.m4093g(iconCompat.f1252g, 6);
/* 103 */           String string = iconCompat.f1254i;
/* 110 */           if (h23Var.mo4091e(7)) {
/* 118 */               string = ((i23) h23Var).f9423e.readString();
                    }
/* 122 */           iconCompat.f1254i = string;
/* 124 */           String string2 = iconCompat.f1255j;
/* 132 */           if (h23Var.mo4091e(8)) {
/* 139 */               string2 = ((i23) h23Var).f9423e.readString();
                    }
/* 143 */           iconCompat.f1255j = string2;
/* 151 */           iconCompat.f1253h = PorterDuff.Mode.valueOf(iconCompat.f1254i);
                    switch (iconCompat.f1246a) {
                        case -1:
/* 217 */                   Parcelable parcelable = iconCompat.f1249d;
/* 219 */                   if (parcelable != null) {
/* 221 */                       iconCompat.f1247b = parcelable;
/* 223 */                       return iconCompat;
                            }
/* 226 */                   C1951n4.m6859j("Invalid icon");
/* 9 */                     return null;
                        case 0:
                        default:
/* 197 */                   return iconCompat;
                        case 1:
                        case 5:
/* 198 */                   Parcelable parcelable2 = iconCompat.f1249d;
/* 200 */                   if (parcelable2 != null) {
/* 202 */                       iconCompat.f1247b = parcelable2;
/* 204 */                       return iconCompat;
                            }
/* 205 */                   byte[] bArr3 = iconCompat.f1248c;
/* 207 */                   iconCompat.f1247b = bArr3;
/* 209 */                   iconCompat.f1246a = 3;
/* 211 */                   iconCompat.f1250e = 0;
/* 214 */                   iconCompat.f1251f = bArr3.length;
/* 216 */                   return iconCompat;
                        case 2:
                        case 4:
                        case 6:
/* 174 */                   String str = new String(iconCompat.f1248c, Charset.forName("UTF-16"));
/* 177 */                   iconCompat.f1247b = str;
/* 181 */                   if (iconCompat.f1246a == 2 && iconCompat.f1255j == null) {
/* 195 */                       iconCompat.f1255j = str.split(":", -1)[0];
                            }
/* 197 */                   return iconCompat;
                        case 3:
/* 161 */                   iconCompat.f1247b = iconCompat.f1248c;
/* 163 */                   return iconCompat;
                    }
                }

                public static void write(IconCompat iconCompat, h23 h23Var) {
/* 1 */             h23Var.getClass();
/* 10 */            iconCompat.f1254i = iconCompat.f1253h.name();
                    switch (iconCompat.f1246a) {
                        case -1:
/* 70 */                    iconCompat.f1249d = (Parcelable) iconCompat.f1247b;
                            break;
                        case 1:
                        case 5:
/* 63 */                    iconCompat.f1249d = (Parcelable) iconCompat.f1247b;
                            break;
                        case 2:
/* 56 */                    iconCompat.f1248c = ((String) iconCompat.f1247b).getBytes(Charset.forName("UTF-16"));
                            break;
                        case 3:
/* 41 */                    iconCompat.f1248c = (byte[]) iconCompat.f1247b;
                            break;
                        case 4:
                        case 6:
/* 34 */                    iconCompat.f1248c = iconCompat.f1247b.toString().getBytes(Charset.forName("UTF-16"));
                            break;
                    }
/* 72 */            int i = iconCompat.f1246a;
/* 75 */            if (-1 != i) {
/* 78 */                h23Var.m4096j(i, 1);
                    }
/* 81 */            byte[] bArr = iconCompat.f1248c;
/* 83 */            if (bArr != null) {
/* 86 */                h23Var.mo4095i(2);
/* 92 */                Parcel parcel = ((i23) h23Var).f9423e;
/* 95 */                parcel.writeInt(bArr.length);
/* 98 */                parcel.writeByteArray(bArr);
                    }
/* 101 */           Parcelable parcelable = iconCompat.f1249d;
/* 104 */           if (parcelable != null) {
/* 107 */               h23Var.mo4095i(3);
/* 115 */               ((i23) h23Var).f9423e.writeParcelable(parcelable, 0);
                    }
/* 118 */           int i2 = iconCompat.f1250e;
/* 120 */           if (i2 != 0) {
/* 123 */               h23Var.m4096j(i2, 4);
                    }
/* 126 */           int i3 = iconCompat.f1251f;
/* 128 */           if (i3 != 0) {
/* 131 */               h23Var.m4096j(i3, 5);
                    }
/* 134 */           ColorStateList colorStateList = iconCompat.f1252g;
/* 136 */           if (colorStateList != null) {
/* 139 */               h23Var.mo4095i(6);
/* 147 */               ((i23) h23Var).f9423e.writeParcelable(colorStateList, 0);
                    }
/* 150 */           String str = iconCompat.f1254i;
/* 152 */           if (str != null) {
/* 155 */               h23Var.mo4095i(7);
/* 163 */               ((i23) h23Var).f9423e.writeString(str);
                    }
/* 166 */           String str2 = iconCompat.f1255j;
/* 168 */           if (str2 != null) {
/* 172 */               h23Var.mo4095i(8);
/* 179 */               ((i23) h23Var).f9423e.writeString(str2);
                    }
                }
            }
